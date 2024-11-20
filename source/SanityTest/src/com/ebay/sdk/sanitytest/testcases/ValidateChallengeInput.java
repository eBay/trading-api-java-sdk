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
import com.ebay.sdk.call.ValidateChallengeInputCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class ValidateChallengeInput extends SDKTestCase {

    public void testValidateChallengeInput() throws Exception {

        ValidateChallengeInputCall api = new ValidateChallengeInputCall(
            this.apiContext);

        // Make API call.
        ApiException gotException = null;

        try {
            api.setChallengeToken(TestData.ChallengeToken);
            api.setKeepTokenValid(Boolean.TRUE);
            api.setUserInput("MYINPUT");
            api.validateChallengeInput();

        } catch (ApiException ex) {
            gotException = ex;
        }
        this.assertTrue(
            gotException == null || gotException.containsErrorCode("517"));
    }
}
