/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.GetNotificationPreferencesCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.GetNotificationPreferencesResponseType;
import com.ebay.soap.eBLBaseComponents.NotificationRoleCodeType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class GetNotificationPreferences extends SDKTestCase {

    public void testGetNotificationPreferences_UserData() throws Exception {
        GetNotificationPreferencesCall api = new GetNotificationPreferencesCall(
            this.apiContext);
        DetailLevelCodeType[] detailLevel = { DetailLevelCodeType.RETURN_ALL };
        api.setDetailLevel(detailLevel);
        api.setPreferenceLevel(NotificationRoleCodeType.USER_DATA);

        // Make API call.
        GetNotificationPreferencesResponseType resp = api.getNotificationPreferences();
        assertNotNull(resp);
        // Save result.
        TestData.NotificationPreferencesResponse = resp;
    }

    /*
     * TODO: Uncomment this test when the API call bug is fixed.
     * It now throws this exception:
     * "Input data for tag ApplicationDeliveryPreferences.DeviceType is invalid. Please check API documentation."
     * The DeviceType in the response is invalid:
     *   <DeviceType>ClientAlerts</DeviceType>
     *  See: https://developer.ebay.com/DevZone/XML/docs/Reference/eBay/types/DeviceTypeCodeType.html
     *
     */
    public void _testGetNotificationPreferences_Appilcation() throws Exception {
        GetNotificationPreferencesCall api = new GetNotificationPreferencesCall(
            this.apiContext);
        DetailLevelCodeType[] detailLevel = { DetailLevelCodeType.RETURN_ALL };
        api.setDetailLevel(detailLevel);
        api.setPreferenceLevel(NotificationRoleCodeType.APPLICATION);

        // Make API call.
        GetNotificationPreferencesResponseType resp = api.getNotificationPreferences();
        assertNotNull(resp);
    }
}
