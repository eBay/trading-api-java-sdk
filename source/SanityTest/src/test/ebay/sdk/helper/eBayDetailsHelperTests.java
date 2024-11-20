/*
 * Copyright (c) 2024 eBay Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package test.ebay.sdk.helper;

import java.util.Enumeration;
import java.util.Hashtable;

import com.ebay.sdk.SdkException;
import com.ebay.sdk.helper.eBayDetailsHelper;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;

public class eBayDetailsHelperTests extends SDKTestCase {

    public void test_EBayDetailsHelper_PaymentOption() throws SdkException {
        System.out.println(
            "******* eBayDetailsHelperTests: test_EBayDetailsHelper_PaymentOption() START *******");
        eBayDetailsHelper helper = eBayDetailsHelper.getInstance();
        Hashtable paymentOptions = helper.getDetailEntryMapWithStringValue(
            SiteCodeType.US, "PaymentOption");
        assertNotNull(paymentOptions);
        assertTrue(paymentOptions.size() > 0);
        Enumeration keys = paymentOptions.keys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String option = (String) paymentOptions.get(key);
            System.out.println("Key: " + key + " Option: " + option);
        }
        System.out.println(
            "******* eBayDetailsHelperTests: test_EBayDetailsHelper_PaymentOption() END *******");
    }

    public void test_EBayDetailsHelper_CountryDetails() throws SdkException {
        System.out.println(
            "******* eBayDetailsHelperTests: test_EBayDetailsHelper_CountryDetails() START *******");
        eBayDetailsHelper helper = eBayDetailsHelper.getInstance();
        Hashtable countryDetails = helper.getDetailEntryMapWithStringValue(
            SiteCodeType.US, "Region");
        //		Hashtable countryDetails = helper.getDetailEntryMapWithStringValue(SiteCodeType.US, "Site");
        assertNotNull(countryDetails);
        assertTrue(countryDetails.size() > 0);
        Enumeration keys = countryDetails.keys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String option = (String) countryDetails.get(key);
            System.out.println("Key: " + key + " Option: " + option);
        }
        System.out.println(
            "******* eBayDetailsHelperTests: test_EBayDetailsHelper_CountryDetails() END *******");
    }

    public void _test_EBayDetailsHelper_ShippingServiceDetails()
        throws SdkException {
        System.out.println(
            "******* eBayDetailsHelperTests: test_EBayDetailsHelper_ShippingServiceDetails() START *******");
        eBayDetailsHelper helper = eBayDetailsHelper.getInstance();
        Hashtable shipDetails = helper.getDetailEntryMapWithStringValue(
            SiteCodeType.US, "ShippingServiceDetails");
        assertNotNull(shipDetails);
        assertTrue(shipDetails.size() > 0);
        Enumeration keys = shipDetails.keys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String option = (String) shipDetails.get(key);
            System.out.println("Key: " + key + " Option: " + option);
        }
        System.out.println(
            "******* eBayDetailsHelperTests: test_EBayDetailsHelper_ShippingServiceDetails() END *******");
    }
}
