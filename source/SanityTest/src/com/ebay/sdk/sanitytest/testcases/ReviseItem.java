/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import java.io.File;

import com.ebay.sdk.call.GetItemCall;
import com.ebay.sdk.call.ReviseFixedPriceItemCall;
import com.ebay.sdk.call.ReviseItemCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.soap.eBLBaseComponents.AmountType;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.FeesType;
import com.ebay.soap.eBLBaseComponents.GalleryTypeCodeType;
import com.ebay.soap.eBLBaseComponents.ItemType;
//import com.ebay.soap.eBLBaseComponents.PhotoDisplayCodeType;
//commented out 01/02/2024
import com.ebay.soap.eBLBaseComponents.PictureDetailsType;
import com.ebay.soap.eBLBaseComponents.PictureSourceCodeType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class ReviseItem extends SDKTestCase {

    public void testReviseItem() throws Exception {

        ItemType itemTest = TestData.NewItem;

        assertNotNull(itemTest);

        //
        ReviseItemCall rviCall = new ReviseItemCall(apiContext);

        ItemType item = new ItemType();

        item.setItemID(itemTest.getItemID());
        AmountType at = new AmountType();
        at.setValue(12.89);
        item.setStartPrice(at);

        rviCall.setItemToBeRevised(item);

        // Revise the picture
        PictureDetailsType pictureDetails = new PictureDetailsType();
        pictureDetails.setGalleryType(GalleryTypeCodeType.FEATURED);
        //pictureDetails.setPhotoDisplay(PhotoDisplayCodeType.NONE);
        //commented out 01/02/2024
        pictureDetails.setPictureSource(PictureSourceCodeType.EPS);

        File currentDir = new File(".");
        String[] pictureFiles = {
            currentDir.getCanonicalPath() + "/eBayLogoTM.gif" };
        rviCall.uploadPictures(pictureFiles, pictureDetails);
        String picURL = item.getPictureDetails().getPictureURL(0);

        //verify first
        rviCall.setVerifyOnly(Boolean.TRUE);
        rviCall.reviseItem();
        FeesType fees = rviCall.getListingFees();
        assertNotNull(fees);

        // Call GetItem and then compare the startPrice.
        GetItemCall getItem1 = new GetItemCall(apiContext);

        DetailLevelCodeType[] detailLevels1 = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        getItem1.setDetailLevel(detailLevels1);

        ItemType returnedItem1 = getItem1.getItem(itemTest.getItemID());
        assertTrue(
            returnedItem1.getStartPrice().getValue() != item.getStartPrice()
                .getValue());

        //revise
        rviCall.setVerifyOnly(null);
        rviCall.reviseItem();

        // Let's wait for the server to "digest" the data.
        java.lang.Thread.sleep(1000);

        // Call GetItem and then compare the startPrice.
        GetItemCall getItem2 = new GetItemCall(apiContext);

        DetailLevelCodeType[] detailLevels2 = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        getItem2.setDetailLevel(detailLevels2);

        ItemType returnedItem2 = getItem2.getItem(itemTest.getItemID());

        assertEquals(returnedItem2.getStartPrice().getValue(),
            item.getStartPrice().getValue(), 0);
        assertNotNull(rviCall.getListingDuration());
        PictureDetailsType picDetails = returnedItem2.getPictureDetails();
        assertNotNull(picDetails);
        String returnedPicURL = picDetails.getPictureURL(0);
        assertEquals(picURL, returnedPicURL);

        // Update itemTest.
        TestData.NewItem = returnedItem2;
    }

    public void testReviseFixedPriceItem() throws Exception {

        ItemType itemTest = TestData.NewFixedPriceItem;

        assertNotNull(itemTest);

        //
        ReviseFixedPriceItemCall rviCall = new ReviseFixedPriceItemCall(
            apiContext);

        ItemType item = new ItemType();

        item.setItemID(itemTest.getItemID());
        AmountType at = new AmountType();
        at.setValue(2.89);
        item.setStartPrice(at);

        rviCall.setItemToBeRevised(item);

        // Revise the picture
        PictureDetailsType pictureDetails = new PictureDetailsType();
        pictureDetails.setGalleryType(GalleryTypeCodeType.FEATURED);
        // pictureDetails.setPhotoDisplay(PhotoDisplayCodeType.NONE);
        //commented out 01/02/2024
        pictureDetails.setPictureSource(PictureSourceCodeType.EPS);

        File currentDir = new File(".");
        String[] pictureFiles = {
            currentDir.getCanonicalPath() + "/eBayLogoTM.gif" };
        rviCall.uploadPictures(pictureFiles, pictureDetails);
        String picURL = item.getPictureDetails().getPictureURL(0);

        rviCall.reviseFixedPriceItem();

        // Let's wait for the server to "digest" the data.
        java.lang.Thread.sleep(1000);

        // Call GetItem and then compare the startPrice.
        GetItemCall getItem = new GetItemCall(apiContext);

        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        getItem.setDetailLevel(detailLevels);

        ItemType returnedItem = getItem.getItem(itemTest.getItemID());

        assertEquals(returnedItem.getStartPrice().getValue(),
            item.getStartPrice().getValue(), 0);
        assertNotNull(rviCall.getListingDuration());
        PictureDetailsType picDetails = returnedItem.getPictureDetails();
        assertNotNull(picDetails);
        String returnedPicURL = picDetails.getPictureURL(0);
        assertEquals(picURL, returnedPicURL);

        // Update itemTest.
        TestData.NewFixedPriceItem = returnedItem;
    }
}
