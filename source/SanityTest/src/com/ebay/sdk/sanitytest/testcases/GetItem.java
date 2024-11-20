/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.*;
import com.ebay.sdk.sanitytest.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class GetItem extends SDKTestCase {

    public void testGetItem() throws Exception {

        ItemType itemTest = TestData.NewItem;

        assertNotNull(itemTest);

        //
        GetItemCall getItem = new GetItemCall(this.apiContext);

        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        getItem.setDetailLevel(detailLevels);

        ItemType returnedItem = getItem.getItem(itemTest.getItemID());

        assertEquals(returnedItem.getItemID(), itemTest.getItemID());
        assertEquals(returnedItem.getStartPrice().getValue(),
            itemTest.getStartPrice().getValue(), 0);
        assertEquals(returnedItem.getListingType().toString(),
            itemTest.getListingType().toString());
        assertEquals(returnedItem.getTitle(), itemTest.getTitle());
        assertEquals(returnedItem.getLocation(), itemTest.getLocation());
    }

    public void test_standardFields() throws Exception {
        ItemType itemTest = TestData.NewItem;
        assertNotNull(itemTest);
        GetItemCall api = new GetItemCall(this.apiContext);

        api.setMessageID("11223344");
        api.setOutputSelector(new String[] { "ViewItemURL", "ItemID" });
        ItemType returnedItem = api.getItem(itemTest.getItemID());

        assertNull(returnedItem.getPaymentDetails());
        assertNotNull(returnedItem.getListingDetails().getViewItemURL());
        assertNotNull(returnedItem.getItemID());
        assertNull(returnedItem.getDescription());
        assertEquals(api.getResponseObject().getCorrelationID(), "11223344");

    }
}
