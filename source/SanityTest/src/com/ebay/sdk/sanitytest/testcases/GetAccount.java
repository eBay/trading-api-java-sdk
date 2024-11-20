/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

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
public class GetAccount extends SDKTestCase {

    public void testGetAccount() throws Exception {
        ApiException gotException = null;

        GetAccountCall api = new GetAccountCall(this.apiContext);

        try {
            api.setViewType(AccountHistorySelectionCodeType.LAST_INVOICE);

            java.util.Calendar calTo = java.util.Calendar.getInstance();
            java.util.Calendar calFrom = (java.util.Calendar) calTo.clone();
            calFrom.add(java.util.Calendar.DATE, -1);

            TimeFilter tf = new TimeFilter(calFrom, calTo);
            api.setViewPeriod(tf);

            // Pagination
            PaginationType pt = new PaginationType();
            pt.setEntriesPerPage(new Integer(5));
            pt.setPageNumber(new Integer(1));
            api.setPagination(pt);
            api.setAccountEntrySortType(
                AccountEntrySortTypeCodeType.ACCOUNT_ENTRY_ITEM_NUMBER_ASCENDING);

            AccountEntryType[] entries = api.getAccount();
        } catch (ApiException ex) {
            gotException = ex;
        }

        this.assertTrue(
            gotException == null || gotException.containsErrorCode("20154"));

    }
}
