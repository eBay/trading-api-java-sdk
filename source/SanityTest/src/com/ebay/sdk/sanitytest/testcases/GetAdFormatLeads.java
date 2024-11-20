/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
 */

package com.ebay.sdk.sanitytest.testcases;

import java.text.MessageFormat;

import com.ebay.sdk.call.*;
import com.ebay.sdk.sanitytest.*;
import com.ebay.sdk.util.eBayUtil;
import com.ebay.soap.eBLBaseComponents.*;
import com.ebay.sdk.ApiException;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2005
 * </p>
 * <p>
 * Company: eBay Inc.
 * </p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class GetAdFormatLeads extends SDKTestCase {

    public static ItemType buildItem() throws Exception {
        ItemType item = new ItemType();
        item.setSite(SiteCodeType.US);
        item.setCurrency(CurrencyCodeType.USD);
        item.setListingDuration(ListingDurationCodeType.DAYS_30.value());
        item.setListingType(ListingTypeCodeType.LEAD_GENERATION);
        item.setListingSubtype2(ListingSubtypeCodeType.CLASSIFIED_AD);
        item.setPayPalEmailAddress("me@ebay.com");
        String t = MessageFormat.format("eBay SDK SanityTest {0} DO NOT BID!",
            new Object[] { eBayUtil.toAPITimeString(AddItem.getTime()) });
        item.setTitle(t);
        item.setDescription(
            "This is a test item created by eBay SDK SanityTest.");
        AmountType at = new AmountType();
        at.setValue(1.01);
        at.setCurrencyID(item.getCurrency());
        item.setStartPrice(at);
        item.setLocation("San Jose, CA");
        item.setCountry(CountryCodeType.US);
        item.setQuantity(new Integer(1));
        PictureDetailsType pictureDetails = new PictureDetailsType();
        String[] pictureUrls = new String[1];
        pictureUrls[0] = "http://pics.ebaystatic.com/aw/pics/navbar/eBayLogoTM.gif";
        pictureDetails.setPictureURL(pictureUrls);
        pictureDetails.setGalleryType(GalleryTypeCodeType.GALLERY);
        pictureDetails.setPictureSource(PictureSourceCodeType.EPS);
        item.setPictureDetails(pictureDetails);
        return item;
    }

    public void testGetAdFormatLeads() throws Exception {

        // add an adType item
        ItemType item = buildItem();
        item.setPaymentMethods(new BuyerPaymentMethodCodeType[] {});
        item.setListingDuration(ListingDurationCodeType.DAYS_30.value());
        item.setListingType(ListingTypeCodeType.LEAD_GENERATION);
        item.setListingSubtype2(ListingSubtypeCodeType.CLASSIFIED_AD);

        // Category ID - Supports
        // '<AdFormatEnabled>ClassifiedAdEnabled</AdFormatEnabled>'
        // and is '<LeafCategory>true</LeafCategory>'
        CategoryType cat = new CategoryType();
        cat.setCategoryID("11761");
        item.setPrimaryCategory(cat);
        AddItemCall addItem = new AddItemCall();
        addItem.setItem(item);
        addItem.setApiContext(this.apiContext);
        FeesType fees = addItem.addItem();
        assertNotNull(fees);

        GetAdFormatLeadsCall api = new GetAdFormatLeadsCall(this.apiContext);

        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        api.setDetailLevel(detailLevels);

        api.setItemID(item.getItemID());
        api.getAdFormatLeads();

        assertEquals(api.getResponseObject().getAck(), AckCodeType.SUCCESS);
    }

}
