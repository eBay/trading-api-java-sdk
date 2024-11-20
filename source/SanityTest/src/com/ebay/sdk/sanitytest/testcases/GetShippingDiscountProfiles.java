package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.GetShippingDiscountProfilesCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.AckCodeType;
import com.ebay.soap.eBLBaseComponents.CurrencyCodeType;

public class GetShippingDiscountProfiles extends SDKTestCase {
    public void testGetShippingDiscountProfiles() throws Exception {
        GetShippingDiscountProfilesCall shippingDiscountDetails = new GetShippingDiscountProfilesCall(
            apiContext);
        CurrencyCodeType currencyCodeType = shippingDiscountDetails.getShippingDiscountProfiles();
        assertEquals(shippingDiscountDetails.getResponseObject().getAck(),
            AckCodeType.SUCCESS);
    }
}
