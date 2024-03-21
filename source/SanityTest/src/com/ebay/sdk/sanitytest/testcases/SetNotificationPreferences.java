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
import com.ebay.sdk.call.SetNotificationPreferencesCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.soap.eBLBaseComponents.ApplicationDeliveryPreferencesType;
import com.ebay.soap.eBLBaseComponents.NotificationEnableArrayType;
import com.ebay.soap.eBLBaseComponents.NotificationUserDataType;
import com.ebay.soap.eBLBaseComponents.SMSSubscriptionType;
import com.ebay.soap.eBLBaseComponents.SMSSubscriptionUserStatusCodeType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class SetNotificationPreferences extends SDKTestCase {

    public void testSetNotificationPreferences() throws Exception {

        assertNotNull(TestData.NotificationPreferencesResponse);

        ApplicationDeliveryPreferencesType appPref = TestData.NotificationPreferencesResponse.getApplicationDeliveryPreferences();
        NotificationEnableArrayType userPref = TestData.NotificationPreferencesResponse.getUserDeliveryPreferenceArray();

        SetNotificationPreferencesCall api = new SetNotificationPreferencesCall(
            this.apiContext);

        api.setApplicationDeliveryPreferences(appPref);
        api.setUserDeliveryPreferenceArray(userPref);

        NotificationUserDataType userData = new NotificationUserDataType();
        api.setUserData(userData);

        SMSSubscriptionType subType = new SMSSubscriptionType();
        userData.setSMSSubscription(subType);

        subType.setSMSPhone("6503760000");
        subType.setUserStatus(SMSSubscriptionUserStatusCodeType.REGISTERED);
/*
    NotificationEventPropertyType[] eventProperties = new NotificationEventPropertyType[1];
    api.setEventProperty(eventProperties);

    NotificationEventPropertyType eventProp = new NotificationEventPropertyType();
    eventProperties[0] = eventProp;

    eventProp.setName(NotificationEventPropertyNameCodeType.TimeLeft);
    eventProp.setEventType(NotificationEventTypeCodeType.WatchedItemEndingSoon);
    eventProp.setValue("3");
*/

        // Make API call.
        ApiException gotException = null;
        try {
            api.setNotificationPreferences();
        } catch (ApiException ex) {
            gotException = ex;
        }

        this.assertTrue(
            gotException == null || gotException.containsErrorCode("20130")
                || gotException.containsErrorCode("219020"));
    }
}
