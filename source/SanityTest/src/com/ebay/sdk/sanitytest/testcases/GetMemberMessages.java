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
public class GetMemberMessages extends SDKTestCase {

    public void testGetMemberMessages() throws Exception {

        GetMemberMessagesCall api = new GetMemberMessagesCall(this.apiContext);

        api.setDetailLevel(
            new DetailLevelCodeType[] { DetailLevelCodeType.RETURN_MESSAGES });

        api.setDisplayToPublic(new Boolean(false));
        api.setMailMessageType(MessageTypeCodeType.ASK_SELLER_QUESTION);
        api.setMessageStatus(MessageStatusTypeCodeType.UNANSWERED);

        // Time filter
        java.util.Calendar calTo = java.util.Calendar.getInstance();
        java.util.Calendar calFrom = (java.util.Calendar) calTo.clone();
        calFrom.add(java.util.Calendar.HOUR, -5);
        calTo.add(java.util.Calendar.HOUR, -1);

        api.setStartCreationTime(calFrom);
        api.setEndCreationTime(calTo);

        // Make API call.
        api.getMemberMessages();

        TestData.MemberMessages = api.getReturnedMemberMessages();
    }
}
