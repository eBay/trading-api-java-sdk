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
import com.ebay.sdk.call.AddMemberMessagesAAQToBidderCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.AddMemberMessagesAAQToBidderRequestContainerType;
import com.ebay.soap.eBLBaseComponents.MemberMessageType;
import com.ebay.soap.eBLBaseComponents.MessageTypeCodeType;
import com.ebay.soap.eBLBaseComponents.QuestionTypeCodeType;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2005
 * </p>
 * <p>
 * Company: eBay Inc.
 * </p>
 *
 * @author Weian Deng
 * @version 1.0
 */
public class AddMemberMessagesAAQToBidder extends SDKTestCase {

    public void testAddMemberMessagesAAQToBidder() throws Exception {

        AddMemberMessagesAAQToBidderCall api = new AddMemberMessagesAAQToBidderCall(
            apiContext);

        AddMemberMessagesAAQToBidderRequestContainerType[] msgs = new AddMemberMessagesAAQToBidderRequestContainerType[1];
        api.setAddMemberMessagesAAQToBidderRequestContainer(msgs);

        AddMemberMessagesAAQToBidderRequestContainerType msg = new AddMemberMessagesAAQToBidderRequestContainerType();
        msgs[0] = msg;

        msg.setCorrelationID("TestCorrelationID");
        msg.setItemID("1111111111");

        MemberMessageType memberMsg = new MemberMessageType();
        msg.setMemberMessage(memberMsg);

        memberMsg.setSubject("SDK Sanity Test ASQ");
        memberMsg.setBody("SDK sanity test body");
        memberMsg.setDisplayToPublic(new Boolean(false));
        memberMsg.setEmailCopyToSender(new Boolean(false));
        memberMsg.setHideSendersEmailAddress(new Boolean(true));
        memberMsg.setMessageType(MessageTypeCodeType.CONTACT_EBAY_MEMBER);
        memberMsg.setQuestionType(QuestionTypeCodeType.GENERAL);
        memberMsg.setRecipientID(new String[] { "apitest20" });

        // Make API call.
        ApiException gotException = null;

        // Negative test.
        try {
            api.addMemberMessagesAAQToBidder();
        } catch (ApiException ex) {
            gotException = ex;
        }
        assertNotNull(gotException);
    }
}
