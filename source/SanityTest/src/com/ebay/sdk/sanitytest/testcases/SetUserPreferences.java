/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.SetUserPreferencesCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.soap.eBLBaseComponents.CombinedPaymentPeriodCodeType;
import com.ebay.soap.eBLBaseComponents.CombinedPaymentPreferencesType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class SetUserPreferences extends SDKTestCase {

    public void testSetUserPreferences() throws Exception {

        if (TestData.UserPreferencesResponse == null)
            return;

        SetUserPreferencesCall api = new SetUserPreferencesCall(
            this.apiContext);

        api.setBidderNoticePreferences(
            TestData.UserPreferencesResponse.getBidderNoticePreferences());
        CombinedPaymentPreferencesType combinedPaymentPrefs = TestData.UserPreferencesResponse.getCombinedPaymentPreferences();
        combinedPaymentPrefs.setCombinedPaymentPeriod(
            CombinedPaymentPeriodCodeType.DAYS_14);
        api.setCombinedPaymentPreferences(combinedPaymentPrefs);
        api.setCrossPromotionPreferences(
            TestData.UserPreferencesResponse.getCrossPromotionPreferences());
        api.setEndOfAuctionEmailPreferences(
            TestData.UserPreferencesResponse.getEndOfAuctionEmailPreferences());
        api.setSellerFavoriteItemPreferences(
            TestData.UserPreferencesResponse.getSellerFavoriteItemPreferences());
        api.setSellerPaymentPreferences(
            TestData.UserPreferencesResponse.getSellerPaymentPreferences());

        // Make API call.
        api.setUserPreferences();
    }
}
