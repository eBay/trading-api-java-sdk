package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.SetMessagePreferencesCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.SetMessagePreferencesResponseType;

public class SetMessagePreferences extends SDKTestCase {
    public void testSetMessagePreferences() throws Exception {
        SetMessagePreferencesCall messagePreferences = new SetMessagePreferencesCall(
            apiContext);
        messagePreferences.setMessagePreferences();
        SetMessagePreferencesResponseType resp = messagePreferences.getResponse();
        assertNotNull(resp);
    }
}
