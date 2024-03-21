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
import com.ebay.sdk.call.AddSecondChanceItemCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.soap.eBLBaseComponents.SecondChanceOfferDurationCodeType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class AddSecondChanceItem extends SDKTestCase {

    //addSecondChanceItem needs an item with a winning bidder and a un-winning bidder
    public void testAddSecondChanceItem() throws Exception {

        assertNotNull(TestData.NewItem);

        AddSecondChanceItemCall api = new AddSecondChanceItemCall(
            this.apiContext);

        api.setItemID(TestData.NewItem.getItemID());

        // Do something funny ^_^
        api.setRecipientBidderUserID("apitest20");
        api.setSellerMessage("Test seller message");
        api.setItemID(TestData.NewItem.getItemID());
        api.setDuration(SecondChanceOfferDurationCodeType.DAYS_7);

        // Make API call.
        ApiException gotException = null;

        // AddSecondChanceItem
        gotException = null;
        try {
            api.addSecondChanceItem();
        } catch (ApiException ex) {
            gotException = ex;
        }
        assertNotNull(gotException);
    }
}
