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
public class GetFeedback extends SDKTestCase {

    public void testGetFeedback() throws Exception {

        GetFeedbackCall api = new GetFeedbackCall(this.apiContext);

        // Pagination
        PaginationType pt = new PaginationType();
        pt.setEntriesPerPage(new Integer(100));
        pt.setPageNumber(new Integer(1));
        api.setPagination(pt);

        api.setUserID(TestData.UserID);
        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        api.setDetailLevel(detailLevels);

        // Make API call.
        FeedbackDetailType[] feedbacks = api.getFeedback();
    }
}
