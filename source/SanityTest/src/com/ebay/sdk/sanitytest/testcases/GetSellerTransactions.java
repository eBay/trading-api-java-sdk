/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import java.util.Calendar;

import com.ebay.sdk.TimeFilter;
import com.ebay.sdk.call.GetSellerTransactionsCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.soap.eBLBaseComponents.PaginationType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005 - 2007</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class GetSellerTransactions extends SDKTestCase {

    public void testGetSellerTransactions() throws Exception {
        GetSellerTransactionsCall gst = new GetSellerTransactionsCall(
            this.apiContext);

        // Time filter
        Calendar calTo = java.util.Calendar.getInstance();
        Calendar calFrom = (java.util.Calendar) calTo.clone();
        calFrom.add(Calendar.HOUR, -1);
        TimeFilter tf = new TimeFilter(calFrom, calTo);
        gst.setTimeFilter(tf);

        // Pagination
        PaginationType pt = new PaginationType();
        pt.setEntriesPerPage(new Integer(100));
        pt.setPageNumber(new Integer(1));
        gst.setPagination(pt);

        TestData.SellerTransactions = gst.getSellerTransactions();
    }
}
