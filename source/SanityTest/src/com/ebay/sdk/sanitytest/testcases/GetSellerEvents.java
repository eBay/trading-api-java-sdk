/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import java.util.TimeZone;

import com.ebay.sdk.TimeFilter;
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
public class GetSellerEvents extends SDKTestCase {

    static ItemType findItem(ItemType[] items, String itemID) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getItemID().equals(itemID))
                return items[i];
        }
        return null;
    }

    public void testGetSellerEvents() throws Exception {

        assertNotNull(TestData.NewItem);

        GetSellerEventsCall api = new GetSellerEventsCall(this.apiContext);

        // Time filter
        java.util.Calendar calTo = java.util.Calendar.getInstance();
        calTo.setTimeZone(TimeZone.getTimeZone("GMT"));
        calTo.add(java.util.Calendar.HOUR, 1);
        java.util.Calendar calFrom = (java.util.Calendar) calTo.clone();
        calFrom.add(java.util.Calendar.HOUR, -2);

        TimeFilter tf = new TimeFilter(calFrom, calTo);
        api.setEndTimeFilter(tf);

        // Make API call.
        ItemType[] events = api.getSellerEvents();

        // Make sure it covers that item that I just added.
        ItemType foundEvent = findItem(events, TestData.NewItem.getItemID());
        assertNotNull(foundEvent);
    }
}
