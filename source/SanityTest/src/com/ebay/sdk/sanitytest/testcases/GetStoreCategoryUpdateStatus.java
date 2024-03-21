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
import com.ebay.sdk.call.GetStoreCategoryUpdateStatusCall;
import com.ebay.sdk.sanitytest.SDKTestCase;

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
public class GetStoreCategoryUpdateStatus extends SDKTestCase {

    public void testGetStoreCategoryUpdateStatus() throws Exception {

        GetStoreCategoryUpdateStatusCall api = new GetStoreCategoryUpdateStatusCall(
            apiContext);

        api.setTaskID(1111111111);

        // Make API call.
        ApiException gotException = null;

        // Negative test.
        try {
            api.getStoreCategoryUpdateStatus();
        } catch (ApiException ex) {
            gotException = ex;
        }
        assertNotNull(gotException);
    }
}
