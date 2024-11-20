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
public class StoreTestsSuite extends TestCase {

    public StoreTestsSuite(String s) {
        super(s);
    }

    public static Test suite() {

        TestSuite suite = new TestSuite("Store Tests");

        suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetStore.class);

        // commented out 01/02/2024
        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.SetStore.class);
        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetStoreCustomPage.class);
        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.SetStoreCustomPage.class);
        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetStoreOptions.class);
        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.GetStorePreferences.class);
        // suite.addTestSuite(com.ebay.sdk.sanitytest.testcases.SetStorePreferences.class);
        // commented out 01/02/2024
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.GetStoreCategoryUpdateStatus.class);
        suite.addTestSuite(
            com.ebay.sdk.sanitytest.testcases.SetStoreCategories.class);

        return suite;
    }
}
