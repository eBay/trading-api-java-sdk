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
import com.ebay.sdk.call.*;
import com.ebay.sdk.sanitytest.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class AddOrder extends SDKTestCase {

    public void testAddOrder() throws Exception {

        this.assertNotNull(TestData.NewItem);

        // Make API call.
        ApiException gotException = null;

        try {
            AddOrderCall api = new AddOrderCall(this.apiContext);

            OrderType order = new OrderType();
            order.setCreatingUserRole(TradingRoleCodeType.SELLER);
            AmountType at = new AmountType();
            at.setCurrencyID(CurrencyCodeType.USD);
            at.setValue(25.22);
            order.setTotal(at);
            order.setPaymentMethods(new BuyerPaymentMethodCodeType[] {
                BuyerPaymentMethodCodeType.VISA_MC });
            api.setOrder(order);

            TransactionType t1 = new TransactionType();
            t1.setItem(TestData.NewItem);
            t1.setTransactionID("0");

            TransactionType t2 = new TransactionType();
            t2.setItem(TestData.NewItem);
            t2.setTransactionID("0");

            TransactionArrayType tary = new TransactionArrayType();
            tary.setTransaction(new TransactionType[] { t1, t2 });
            order.setTransactionArray(tary);

            api.setOrder(order);

            // Make API call.
            AddOrderResponseType resp = api.addOrder();
        } catch (ApiException ex) {
            gotException = ex;
        }

        this.assertNotNull(gotException);
    }
}
