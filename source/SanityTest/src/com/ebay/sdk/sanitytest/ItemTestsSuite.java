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
public class ItemTestsSuite extends TestCase {

    public ItemTestsSuite(String s) {
        super(s);
    }

    public static Test suite() {

        TestSuite suite = new TestSuite("Item Tests");

        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.AddItem.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.AddItems.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.AddFixedPriceItem.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetItem.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.AddToItemDescription.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.SetUserNotes.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.ReviseItem.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.PlaceOffer.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetItemShipping.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.AddToWatchList.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.RemoveFromWatchList.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.EndItem.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.EndItems.class);
        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.RelistItem.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetSellerList.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetAdFormatLeads.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.AddSecondChanceItem.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetSellerEvents.class);
        //suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.AddTransactionConfirmationItem.class);
        //commented out 01/02/2024
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetShippingDiscountProfiles.class);

        return suite;
    }
}
