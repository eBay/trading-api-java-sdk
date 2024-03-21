/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
 */

package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.GeteBayDetailsCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.DetailNameCodeType;
import com.ebay.soap.eBLBaseComponents.GeteBayDetailsResponseType;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2005
 * </p>
 * <p>
 * Company: eBay Inc.
 * </p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class GeteBayDetails extends SDKTestCase {

    public void testGeteBayDetails() throws Exception {

        GeteBayDetailsCall api = new GeteBayDetailsCall(this.apiContext);

        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_HEADERS };

        /*
         * DetailNameCodeType.PAYMENT_OPTION_DETAILS,
         * DetailNameCodeType.REGION_DETAILS, and
         * DetailNameCodeType.REGION_OF_ORIGIN_DETAILS
         * are not functional as per
         * API documentation.
         */
        DetailNameCodeType[] detailName = new DetailNameCodeType[] {
            DetailNameCodeType.COUNTRY_DETAILS,
            DetailNameCodeType.CURRENCY_DETAILS,
            DetailNameCodeType.SITE_DETAILS, DetailNameCodeType.URL_DETAILS,
            DetailNameCodeType.DISPATCH_TIME_MAX_DETAILS,
            DetailNameCodeType.ITEM_SPECIFIC_DETAILS,
            DetailNameCodeType.SHIPPING_CARRIER_DETAILS,
            DetailNameCodeType.SHIPPING_LOCATION_DETAILS,
            DetailNameCodeType.SHIPPING_PACKAGE_DETAILS,
            DetailNameCodeType.SHIPPING_SERVICE_DETAILS,
            DetailNameCodeType.TAX_JURISDICTION,
            DetailNameCodeType.TIME_ZONE_DETAILS,
            DetailNameCodeType.UNIT_OF_MEASUREMENT_DETAILS,
            DetailNameCodeType.RETURN_POLICY_DETAILS, };

        api.setDetailLevel(detailLevels);
        api.setDetailName(detailName);

        // Call API.
        api.geteBayDetails();

        GeteBayDetailsResponseType resp = api.getReturnedeBayDetails();

        assertNotNull(resp.getCountryDetails());
        assertTrue(resp.getCountryDetails().length > 0);

        assertNotNull(resp.getCurrencyDetails());
        assertTrue(resp.getCurrencyDetails().length > 0);

        assertNotNull(resp.getSiteDetails());
        assertTrue(resp.getSiteDetails().length > 0);

        assertNotNull(resp.getURLDetails());
        assertTrue(resp.getURLDetails().length > 0);

        assertNotNull(resp.getDispatchTimeMaxDetails());
        assertTrue(resp.getDispatchTimeMaxDetails().length > 0);

        assertNotNull(resp.getItemSpecificDetails());
        assertTrue(resp.getItemSpecificDetails().length > 0);

        assertNotNull(resp.getShippingCarrierDetails());
        assertTrue(resp.getShippingCarrierDetails().length > 0);

        assertNotNull(resp.getShippingLocationDetails());
        assertTrue(resp.getShippingLocationDetails().length > 0);

        assertNotNull(resp.getShippingPackageDetails());
        assertTrue(resp.getShippingPackageDetails().length > 0);

        assertNotNull(resp.getShippingServiceDetails());
        assertTrue(resp.getShippingServiceDetails().length > 0);

        assertNotNull(resp.getItemSpecificDetails());
        assertTrue(resp.getItemSpecificDetails().length > 0);

        assertNotNull(resp.getTaxJurisdiction());
        assertTrue(resp.getTaxJurisdiction().length > 0);

        assertNotNull(resp.getTimeZoneDetails());
        assertTrue(resp.getTimeZoneDetails().length > 0);

        assertNotNull(resp.getUnitOfMeasurementDetails());
        assertTrue(resp.getUnitOfMeasurementDetails().length > 0);

        assertNotNull(resp.getReturnPolicyDetails());
    }
}
