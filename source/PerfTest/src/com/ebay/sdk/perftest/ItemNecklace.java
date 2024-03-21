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

package com.ebay.sdk.perftest;

import com.ebay.soap.eBLBaseComponents.*;

/**
 * @author Suzanne Ahmed   suzanne.ahmed@ebay.com
 */

public class ItemNecklace {

    // this method creates the item definition for a cd
    // for demonstration purposes only
    // your application might get this info from a database
    // or other data source
    public ItemType buildItem() {

        ItemType myItem = new ItemType();

        // Category
        CategoryType cat = new CategoryType();
        cat.setCategoryID("92827");      // call GetCategories
        myItem.setPrimaryCategory(cat);

        // CheckoutDetailsSpecified = 0
        ShippingDetailsType shipDetails = new ShippingDetailsType();
        shipDetails.setChangePaymentInstructions(new Boolean(false));
        myItem.setShippingDetails(shipDetails);

        myItem.setCountry(CountryCodeType.US);
        myItem.setCurrency(CurrencyCodeType.USD);

        myItem.setDescription(
            "Two strands of sparkling pink tourmaline and rose quartz on 18K gold");
        myItem.setListingDuration(ListingDurationCodeType.DAYS_7.value());
        myItem.setLocation("New York, NY");
        AmountType at = new AmountType();
        at.setValue(new Double("100").doubleValue());
        myItem.setStartPrice(at);

        BuyerPaymentMethodCodeType[] payments = new BuyerPaymentMethodCodeType[2];
        payments[0] = BuyerPaymentMethodCodeType.PAY_PAL;
        payments[1] = BuyerPaymentMethodCodeType.VISA_MC;
        myItem.setPaymentMethods(payments);
        myItem.setPayPalEmailAddress("tiffany@tiffany.com");

        myItem.setQuantity(new Integer(1));
        myItem.setRegionID("60");
        myItem.setTitle("Pink tourmaline on 18k gold necklace");

        //domestic shipping service must be specified
        myItem.setShippingDetails(PerformanceTest.getShippingDetails());

        myItem.setConditionID(1000);

        //fill in mandatory fields
        //handling time
        myItem.setDispatchTimeMax(Integer.valueOf(1));
        //return policy
        ReturnPolicyType returnPolicy = new ReturnPolicyType();
        returnPolicy.setReturnsAcceptedOption("ReturnsAccepted");
        myItem.setReturnPolicy(returnPolicy);

        return myItem;

    }
}

