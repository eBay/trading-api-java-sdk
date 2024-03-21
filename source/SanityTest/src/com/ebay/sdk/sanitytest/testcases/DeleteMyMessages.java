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
public class DeleteMyMessages extends SDKTestCase {

    public void testDeleteMyMessages() throws Exception {

        DeleteMyMessagesCall api = new DeleteMyMessagesCall(this.apiContext);

        /**api.setAlertIDs(
         new String[] {
         "000000"});
         */
        //commented out 01/02/2024
        api.setMessageIDs(new String[] { "000000" });

        // Make API call.
        ApiException gotException = null;

        try {
            // Negative test.
            api.deleteMyMessages();

            this.assertTrue(api.getApiException().getErrors().length > 0);
        } catch (ApiException ex) {
            gotException = ex;
        }
    }
}
