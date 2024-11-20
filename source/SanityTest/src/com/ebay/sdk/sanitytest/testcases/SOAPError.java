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
import com.ebay.sdk.ApiLogging;
import com.ebay.sdk.CallRetry;
import com.ebay.sdk.ExceptionFilter;
import com.ebay.sdk.SdkHTTPException;
import com.ebay.sdk.call.GetItemCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.ItemType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class SOAPError extends SDKTestCase {

    public void testSOAPError() throws Exception {

        CallRetry callretry = new CallRetry();
        callretry.setMaximumRetries(2);
        callretry.setDelayTime(1000);
        int[] hTTPErrorCodes = { 404, 502 };
        callretry.setTriggerHTTPErrorCodes(hTTPErrorCodes);
        this.apiContext.setCallRetry(callretry);
        ApiLogging logManager = this.apiContext.getApiLogging();
        logManager.setLogExceptions(true);
        ExceptionFilter payloadFilter = new ExceptionFilter(null,
            "com.ebay.sdk.ApiException", "404;501");
        logManager.setMessageLoggingFilter(payloadFilter);

        GetItemCall getItem = new GetItemCall(this.apiContext);

        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        getItem.setDetailLevel(detailLevels);

        ItemType returnedItem;
        try {
            returnedItem = getItem.getItem("12345678");
        } catch (ApiException e) {
        }
    }
}
