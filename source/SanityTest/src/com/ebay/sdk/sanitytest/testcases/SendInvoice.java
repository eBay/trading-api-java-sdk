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
public class SendInvoice extends SDKTestCase {

    public void testSendInvoice() throws Exception {

        this.assertNotNull(TestData.NewItem);

        //
        SendInvoiceCall api = new SendInvoiceCall(this.apiContext);

        SendInvoiceRequestType req = new SendInvoiceRequestType();
        req.setCheckoutInstructions("SDK checkout instruction.");
        req.setEmailCopyToSeller(new Boolean(true));
        AmountType at = new AmountType();
        at.setValue(2.0);
        req.setInsuranceFee(at);
        req.setInsuranceOption(InsuranceOptionCodeType.REQUIRED);
        req.setItemID(TestData.NewItem.getItemID());
        req.setPayPalEmailAddress("test@ebay.com");
        req.setTransactionID("0");

        api.setSendInvoiceRequest(req);

        // Make API call.
        ApiException gotException = null;

        try {
            api.sendInvoice();
        } catch (ApiException ex) {
            gotException = ex;
        }

        this.assertNotNull(gotException);
    }
}
