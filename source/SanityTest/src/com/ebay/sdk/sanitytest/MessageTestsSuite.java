/*
 * Copyright (c) 2024 eBay Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.ebay.sdk.sanitytest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class MessageTestsSuite extends TestCase {

    public MessageTestsSuite(String s) {
        super(s);
    }

    public static Test suite() {

        TestSuite suite = new TestSuite("Message Tests");

        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetUser.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetMemberMessages.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetMyMessages.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.DeleteMyMessages.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.ReviseMyMessages.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.ReviseMyMessagesFolders.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.AddMemberMessagesAAQToBidder.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.AddMemberMessageAAQToPartner.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.AddMemberMessageRTQ.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetMessagePreferences.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.SetMessagePreferences.class);

        return suite;
    }
}
