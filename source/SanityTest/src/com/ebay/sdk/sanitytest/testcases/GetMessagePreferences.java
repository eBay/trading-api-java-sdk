package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.GetMessagePreferencesCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.soap.eBLBaseComponents.ASQPreferencesType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;

public class GetMessagePreferences extends SDKTestCase {
    public void testGetMessagePreferences() throws Exception {
        GetMessagePreferencesCall api = new GetMessagePreferencesCall(
            this.apiContext);
        api.setSellerID(TestData.UserID);
        api.setIncludeASQPreferences(new Boolean(true));
        api.setSite(SiteCodeType.US);
        //
        ASQPreferencesType resp = api.getMessagePreferences();
        assertNotNull(resp);
    }
}
