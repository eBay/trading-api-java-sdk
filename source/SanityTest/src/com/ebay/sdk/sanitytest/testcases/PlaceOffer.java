/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.sanitytest.TestData;

import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkSoapException;
import com.ebay.sdk.call.PlaceOfferCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.AckCodeType;
import com.ebay.soap.eBLBaseComponents.AmountType;
import com.ebay.soap.eBLBaseComponents.BidActionCodeType;
import com.ebay.soap.eBLBaseComponents.OfferType;
import com.ebay.soap.eBLBaseComponents.PlaceOfferResponseType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weian Deng
 * @version 1.0
 */
public class PlaceOffer extends SDKTestCase {

    public void testPlaceOffer() throws Exception {

        // Make API call.
        boolean callOK = false;
        String tempToken = apiContext.getApiCredential().geteBayToken();
        try {
            assertNotNull(TestData.itemForBid);
            apiContext.getApiCredential().seteBayToken(TestData.testToken);
            PlaceOfferCall api = new PlaceOfferCall(apiContext);
            api.setItemID(TestData.itemForBid.getItemID());
            OfferType offer = new OfferType();
            offer.setAction(BidActionCodeType.BID);
            offer.setQuantity(new Integer(1));
            AmountType at = new AmountType();
            at.setValue(1);
            offer.setConvertedPrice(at);
            at = new AmountType();
            at.setValue(2);
            offer.setMaxBid(at);
            api.setOffer(offer);
            api.setEndUserIP("10.249.72.135");
            api.placeOffer();
            PlaceOfferResponseType responseType = (PlaceOfferResponseType) api.getResponseObject();
            assertSame(AckCodeType.SUCCESS, responseType.getAck());
            TestData.hasBid = true;
            callOK = true;
        } catch (ApiException ex) {
            if (ex.containsErrorCode("12233"))
                callOK = true;
        } catch (SdkSoapException ex2) {
            if (ex2.containsErrorCode("517"))
                callOK = true;
        } finally {
            apiContext.getApiCredential().seteBayToken(tempToken);
        }
        assertTrue(callOK);
    }
}
