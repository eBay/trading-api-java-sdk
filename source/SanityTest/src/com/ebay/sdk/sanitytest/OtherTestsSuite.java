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

import com.ebay.sdk.sanitytest.testcases.HTTPSProtocolTester;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class OtherTestsSuite extends TestCase {

    public OtherTestsSuite(String s) {
        super(s);
    }

    public static Test suite() {

        TestSuite suite = new TestSuite("Other Tests");

        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.SiteHostedPicturesTest.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GeteBayOfficialTime.class);
        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetApiAccessRules.class);
        //commented out 01/02/2024
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetNotificationPreferences.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.SetNotificationPreferences.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetUser.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetUserPreferences.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.SetUserPreferences.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetTaxTable.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.SetTaxTable.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetDescriptionTemplates.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetAccount.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.FetchToken.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GeteBayDetails.class);
        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetCharities.class);
        //commented out 01/02/2024

        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetNotificationsUsage.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetUserContactDetails.class);
        //suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetContextualKeywords.class);
        //commented out 01/02/2024

        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetChallengeToken.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.ValidateChallengeInput.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.SOAPError.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetVeROReasonCodeDetails.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetVeROReportStatus.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.VeROReportItems.class);

        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetPromotionalSaleDetails.class);
        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.SetPromotionalSaleListings.class);
        //commented out 01/02/2024
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.SetShippingDiscountProfiles.class);

        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.SetPromotionalSale.class);
        //commented out 01/02/2024
        suite.addTestSuite(HTTPSProtocolTester.class);

        return suite;
    }
}
