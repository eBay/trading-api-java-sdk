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

import test.ebay.sdk.helper.CategoryHelper;
import com.ebay.sdk.call.AddItemCall;
import com.ebay.sdk.call.VerifyAddItemCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.sdk.util.eBayUtil;
import com.ebay.soap.eBLBaseComponents.AmountType;
//import com.ebay.soap.eBLBaseComponents.AttributeSetArrayType;
//import com.ebay.soap.eBLBaseComponents.AttributeSetType;
//import com.ebay.soap.eBLBaseComponents.AttributeType;
//commented out 01/02/2024
import com.ebay.soap.eBLBaseComponents.BestOfferDetailsType;
import com.ebay.soap.eBLBaseComponents.BuyerPaymentMethodCodeType;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.CountryCodeType;
import com.ebay.soap.eBLBaseComponents.CurrencyCodeType;
import com.ebay.soap.eBLBaseComponents.FeesType;
import com.ebay.soap.eBLBaseComponents.GalleryTypeCodeType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import com.ebay.soap.eBLBaseComponents.ListingDurationCodeType;
import com.ebay.soap.eBLBaseComponents.ListingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.NameValueListArrayType;
import com.ebay.soap.eBLBaseComponents.NameValueListType;
import com.ebay.soap.eBLBaseComponents.PictureDetailsType;
import com.ebay.soap.eBLBaseComponents.PictureSourceCodeType;
import com.ebay.soap.eBLBaseComponents.RefundOptionsCodeType;
import com.ebay.soap.eBLBaseComponents.ReturnsAcceptedOptionsCodeType;
import com.ebay.soap.eBLBaseComponents.ReturnsWithinOptionsCodeType;
import com.ebay.soap.eBLBaseComponents.SalesTaxType;
import com.ebay.soap.eBLBaseComponents.ShippingCostPaidByOptionsCodeType;
import com.ebay.soap.eBLBaseComponents.ShippingDetailsType;
import com.ebay.soap.eBLBaseComponents.ShippingServiceCodeType;
import com.ebay.soap.eBLBaseComponents.ShippingServiceOptionsType;
import com.ebay.soap.eBLBaseComponents.ShippingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;
import com.ebay.soap.eBLBaseComponents.FeatureIDCodeType;
//import com.ebay.soap.eBLBaseComponents.ValType;
import com.ebay.soap.eBLBaseComponents.ReturnPolicyType;
import com.ebay.soap.eBLBaseComponents.ReturnPolicyType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class AddItem extends SDKTestCase {

    final int CATEGORY_WITH_REQUIRED_ATTRIBUTE = 15825;// (Real Estate >
    // Commercial) include
    // required attributes
    final int CATEGORY_CUSTOM_ENABLED = 50253;// the category which enable
    // custom Item Specifics
    final int CATEGORY_CATALOG_ENABLED = 279;// category which is catalog enable

    public static ItemType buildItem() throws Exception {
        String t;

        ItemType item = new ItemType();

        item.setSite(SiteCodeType.US);
        item.setCurrency(CurrencyCodeType.USD);
        item.setListingType(ListingTypeCodeType.CHINESE);

        t = MessageFormat.format("eBay SDK SanityTest {0} DO NOT BID!",
            new Object[] { eBayUtil.toAPITimeString(AddItem.getTime()) });
        item.setTitle(t);

        item.setDescription(
            "This is a test item created by eBay SDK SanityTest.");

        AmountType at = new AmountType();
        at.setValue(1.01);
        at.setCurrencyID(item.getCurrency());
        item.setStartPrice(at);
        item.setListingDuration(ListingDurationCodeType.DAYS_7.value());
        item.setLocation("San Jose, CA");
        item.setCountry(CountryCodeType.US);

        BestOfferDetailsType bo = new BestOfferDetailsType();
        bo.setBestOfferEnabled(new Boolean(false));
        item.setBestOfferDetails(bo);

        CategoryType cat = new CategoryType();
        cat.setCategoryID("14111");
        item.setPrimaryCategory(cat);

        item.setQuantity(new Integer(1));

        item.setConditionID(1000);

        // Payment
        BuyerPaymentMethodCodeType[] arrPaymentMethods = new BuyerPaymentMethodCodeType[] {
            BuyerPaymentMethodCodeType.PAY_PAL };
        item.setPaymentMethods(arrPaymentMethods);
        item.setPayPalEmailAddress("me@ebay.com");

        // Shipping range
        item.setShippingDetails(getShippingDetails());

        // fill in mandatory fields
        item.setDispatchTimeMax(Integer.valueOf(1));
        ReturnPolicyType returnPolicy = new ReturnPolicyType();
        returnPolicy.setReturnsAcceptedOption("ReturnsAccepted");
        item.setReturnPolicy(returnPolicy);

        // Set item picture
        PictureDetailsType pictureDetails = new PictureDetailsType();
        String[] pictureUrls = new String[1];
        pictureUrls[0] = "http://pics.ebaystatic.com/aw/pics/navbar/eBayLogoTM.gif";
        pictureDetails.setPictureURL(pictureUrls);
        pictureDetails.setGalleryType(GalleryTypeCodeType.GALLERY);
        pictureDetails.setPictureSource(PictureSourceCodeType.EPS);
        item.setPictureDetails(pictureDetails);

        return item;
    }

    static ShippingDetailsType getShippingDetails() {
        // Shipping details.
        ShippingDetailsType sd = new ShippingDetailsType();

        SalesTaxType salesTax = new SalesTaxType();
        salesTax.setSalesTaxPercent(new Float(0.0825));
        salesTax.setSalesTaxState("CA");

        sd.setSalesTax(salesTax);

        sd.setApplyShippingDiscount(new Boolean(true));

        AmountType at = new AmountType();
        at.setValue(1.0);
        sd.setPaymentInstructions("eBay Java SDK test instruction.");
        sd.setShippingType(ShippingTypeCodeType.FLAT);

        //
        ShippingServiceOptionsType st1 = new ShippingServiceOptionsType();
        st1.setShippingService(ShippingServiceCodeType.USPS_PRIORITY.value());
        at = new AmountType();
        at.setValue(1.0);
        st1.setShippingServiceAdditionalCost(at);
        at = new AmountType();
        at.setValue(1);
        st1.setShippingServiceCost(at);
        st1.setShippingServicePriority(new Integer(1));

        ShippingServiceOptionsType st2 = new ShippingServiceOptionsType();
        st2.setExpeditedService(new Boolean(true));
        st2.setShippingService(
            ShippingServiceCodeType.USPS_FIRST_CLASS.value());
        at = new AmountType();
        at.setValue(1.0);
        st2.setShippingServiceAdditionalCost(at);
        at = new AmountType();
        at.setValue(1);
        st2.setShippingServiceCost(at);
        st2.setShippingServicePriority(new Integer(2));

        sd.setShippingServiceOptions(
            new ShippingServiceOptionsType[] { st1, st2 });

        return sd;
    }

    public void testAddItemWithProPay() throws Exception {
        ItemType item = buildItem();
        item.setPaymentMethods(new BuyerPaymentMethodCodeType[] {
            BuyerPaymentMethodCodeType.PAY_PAL,
            BuyerPaymentMethodCodeType.PRO_PAY });
        FeesType fees;
        AddItemCall addItem = new AddItemCall(apiContext);
        addItem.setItem(item);
        fees = addItem.addItem();
        assertNotNull(fees);
    }

    public void testAddItem1() throws Exception {
        ItemType item = buildItem();
        item.getPrimaryCategory().setCategoryID(Integer.toString(14111));

        // Execute the API.
        FeesType fees;

        // VerifyAddItem
        VerifyAddItemCall vi = new VerifyAddItemCall(apiContext);
        fees = vi.verifyAddItem(item);
        assertNotNull(fees);

        // AddItem
        AddItemCall addItem = new AddItemCall(apiContext);
        addItem.setItem(item);
        fees = addItem.addItem();
        assertNotNull(fees);
    }

    public void testAddItem2() throws Exception {
        if (TestData.NewItem != null) {
            this.endItem(TestData.NewItem.getItemID());
            TestData.NewItem = null;
        }
        ItemType item = buildItem();

        item.getPrimaryCategory()
            .setCategoryID(Integer.toString(CATEGORY_CUSTOM_ENABLED));

        // add custom item specifics if the category supports
        boolean isCustomEnabled = CategoryHelper.getCategoryFeature(
            CATEGORY_CUSTOM_ENABLED, apiContext,
            FeatureIDCodeType.ITEM_SPECIFICS_ENABLED);
        assertTrue("this category is not custom specific enabled",
            isCustomEnabled);
        NameValueListArrayType nvlaT = new NameValueListArrayType();
        NameValueListType[] nvlTArray = new NameValueListType[2];
        NameValueListType nvlT1 = new NameValueListType();
        nvlT1.setName("from");
        nvlT1.setValue(new String[] { "ebay@Shanghai" });
        NameValueListType nvlT2 = new NameValueListType();
        nvlT2.setName("author");
        nvlT2.setValue(new String[] { "SDK TEAM" });
        nvlTArray[0] = nvlT1;
        nvlTArray[1] = nvlT2;
        nvlaT.setNameValueList(nvlTArray);
        item.setItemSpecifics(nvlaT);

        // Set return policy as RETURNS_ACCEPTED
        ReturnPolicyType returnPolicyType = new ReturnPolicyType();
        returnPolicyType.setRefundOption(
            RefundOptionsCodeType.MONEY_BACK_OR_EXCHANGE.value());
        returnPolicyType.setReturnsWithinOption(
            ReturnsWithinOptionsCodeType.DAYS_14.value());
        returnPolicyType.setShippingCostPaidByOption(
            ShippingCostPaidByOptionsCodeType.BUYER.value());
        returnPolicyType.setReturnsAcceptedOption(
            ReturnsAcceptedOptionsCodeType.RETURNS_ACCEPTED.value());
        item.setReturnPolicy(returnPolicyType);

        // Execute the API.
        FeesType fees;

        // VerifyAddItem
        VerifyAddItemCall vi = new VerifyAddItemCall(apiContext);
        fees = vi.verifyAddItem(item);
        assertNotNull(fees);

        // AddItem
        AddItemCall addItem = new AddItemCall(apiContext);
        addItem.setItem(item);
        fees = addItem.addItem();
        assertNotNull(fees);

        // Save the result.
        TestData.NewItem = item;
    }

    public void testAddItem3() throws Exception {
        ItemType item = buildItem();
        item.getPrimaryCategory().setCategoryID("279");
        item.setListingType(ListingTypeCodeType.CHINESE);
        item.setQuantity(1);

        // Execute the API.
        FeesType fees;

        // VerifyAddItem
        VerifyAddItemCall vi = new VerifyAddItemCall(apiContext);
        fees = vi.verifyAddItem(item);
        assertNotNull(fees);

        // AddItem
        AddItemCall addItem = new AddItemCall(apiContext);
        addItem.setItem(item);
        fees = addItem.addItem();
        assertNotNull(fees);
        TestData.itemForBid = item;
    }
}
