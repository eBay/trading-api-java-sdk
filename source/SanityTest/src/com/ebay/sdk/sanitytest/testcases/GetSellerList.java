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

import com.ebay.sdk.*;
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
public class GetSellerList extends SDKTestCase {

    static ItemType findItem(ItemType[] items, String itemID) {
        if (items == null)
            return null;

        for (int i = 0; i < items.length; i++) {
            ItemType item = items[i];
            if (item != null && item.getItemID() != null && item.getItemID()
                .equals(itemID))
                return item;
        }
        return null;
    }

    public void testGetSellerList() throws Exception {

        assertNotNull(TestData.NewItem);

        //
        GetSellerListCall gsl = new GetSellerListCall(this.apiContext);

        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        gsl.setDetailLevel(detailLevels);

        // Time filter
        java.util.Calendar calTo = java.util.Calendar.getInstance();
        calTo.setTimeZone(TimeZone.getTimeZone("GMT"));
        calTo.add(java.util.Calendar.HOUR, 1);
        java.util.Calendar calFrom = (java.util.Calendar) calTo.clone();
        calFrom.add(java.util.Calendar.HOUR, -2);

        TimeFilter tf = new TimeFilter(calFrom, calTo);
        gsl.setEndTimeFilter(tf);

        // Pagination
        PaginationType pt = new PaginationType();
        pt.setEntriesPerPage(new Integer(100));
        pt.setPageNumber(new Integer(1));
        gsl.setPagination(pt);

        //
        ItemType[] items = gsl.getEntireSellerList();

        assertNotNull(items);
        assertTrue(items.length > 0);

        ItemType foundItem = findItem(items, TestData.NewItem.getItemID());
        assertNotNull(foundItem);
    }
}
