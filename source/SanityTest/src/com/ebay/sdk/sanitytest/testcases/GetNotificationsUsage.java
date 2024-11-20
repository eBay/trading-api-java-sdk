/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import java.util.Calendar;

import com.ebay.sdk.ApiException;
import com.ebay.sdk.call.GetNotificationsUsageCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.AckCodeType;
import com.ebay.soap.eBLBaseComponents.GetNotificationsUsageResponseType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weian Deng
 * @version 1.0
 */
public class GetNotificationsUsage extends SDKTestCase {

    public void testGetNotificationsUsage() throws Exception {

        // Make API call.
        ApiException gotException = null;

        GetNotificationsUsageCall api = new GetNotificationsUsageCall(
            this.apiContext);

        if (this.apiContext.getApiServerUrl().indexOf("sandbox") != -1)
            return;

        try {
            Calendar endDay = Calendar.getInstance();
            endDay.add(Calendar.DATE, -1);

            Calendar startDay = Calendar.getInstance();
            startDay.add(Calendar.DATE, -2);

            api.setStartTime(startDay);
            api.setEndTime(endDay);

            api.getNotificationsUsage();

            GetNotificationsUsageResponseType responseType = (GetNotificationsUsageResponseType) api.getResponseObject();
            this.assertEquals(AckCodeType.SUCCESS, responseType.getAck());
        } catch (ApiException ex) {
            gotException = ex;
        }

        this.assertNull(gotException);
    }
}
