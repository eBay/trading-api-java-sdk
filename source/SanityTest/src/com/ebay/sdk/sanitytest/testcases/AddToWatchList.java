/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.ApiException;
import com.ebay.sdk.call.AddToWatchListCall;
import com.ebay.sdk.call.RemoveFromWatchListCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.soap.eBLBaseComponents.AckCodeType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class AddToWatchList extends SDKTestCase {

    public void testAddToWatchList() throws Exception {

        assertNotNull(TestData.NewItem);

        // Remove items from the list:
        RemoveFromWatchListCall remApi = new RemoveFromWatchListCall(
            this.apiContext);
        String[] ids = new String[] { TestData.NewItem.getItemID() };
        remApi.setItemIDs(ids);
        try {
            remApi.removeFromWatchList();
        } catch (ApiException e) {
            // probably not on the list
            assertTrue(e.containsErrorCode("21002"));
        }

        AddToWatchListCall api = new AddToWatchListCall(this.apiContext);

        // Watch the first one.
        String[] addIds = new String[] { ids[0] };
        api.setItemIDs(addIds);

        // Make API call.
        api.addToWatchList();
        int watchCount = api.getReturnedWatchListCount();
        assertEquals(api.getResponseObject().getAck(), AckCodeType.SUCCESS);
        assertTrue(watchCount > 0);
    }
}
