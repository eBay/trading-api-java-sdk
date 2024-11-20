/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

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
public class SetTaxTable extends SDKTestCase {

    public void testSetTaxTable() throws Exception {

        this.assertNotNull(TestData.TaxTable);

        SetTaxTableCall api = new SetTaxTableCall(this.apiContext);

        api.setTaxTable(TestData.TaxTable);

        // Fix the null sales tax percentage issue.
        TaxJurisdictionType[] tj = TestData.TaxTable.getTaxJurisdiction();
        for (int i = 0; i < tj.length; i++) {
            if (tj[i].getSalesTaxPercent() == null)
                tj[i].setSalesTaxPercent(new Float(0.0));
        }

        // Make API call.
        api.setTaxTable();
    }
}
