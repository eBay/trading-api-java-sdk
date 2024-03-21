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
import com.ebay.sdk.call.GetChallengeTokenCall;
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
public class GetChallengeToken extends SDKTestCase {

    public void testGetChallengeToken() throws Exception {

        GetChallengeTokenCall api = new GetChallengeTokenCall(this.apiContext);

        // Make API call.
        ApiException gotException = null;

        try {
            api.getChallengeToken();

            TestData.AudioChallengeURL = api.getReturnedAudioChallengeURL();
            TestData.ChallengeToken = api.getReturnedChallengeToken();
            TestData.ImageChallengeURL = api.getReturnedImageChallengeURL();
        } catch (ApiException ex) {
            gotException = ex;
        }
        this.assertTrue(
            gotException == null || gotException.containsErrorCode("517"));
    }
}
