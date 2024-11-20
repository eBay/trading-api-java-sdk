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
 * @author Weian Deng
 * @version 1.0
 */
public class GetOrderTransactions extends SDKTestCase {

    public void testGetOrderTransactions() throws Exception {

        //
        GetOrderTransactionsCall api = new GetOrderTransactionsCall(
            this.apiContext);

        OrderIDArrayType idArrray = new OrderIDArrayType();
        api.setOrderIDArray(idArrray);

        String[] ids = new String[1];
        idArrray.setOrderID(ids);

        String id = "1111111111";
        ids[0] = id;

        ItemTransactionIDArrayType tIdArray = new ItemTransactionIDArrayType();
        api.setItemTransactionIDArray(tIdArray);
        ItemTransactionIDType[] tIds = new ItemTransactionIDType[1];
        tIdArray.setItemTransactionID(tIds);
        ItemTransactionIDType tId = new ItemTransactionIDType();
        String itemId = "2222222222";
        tId.setItemID(itemId);
        tId.setTransactionID("test transaction id");

        // Make API call.
        ApiException gotException = null;

        try {
            OrderArrayType orders = api.getOrderTransactions();
        } catch (ApiException ex) {
            gotException = ex;
        }
        assertNotNull(gotException);
    }
}
