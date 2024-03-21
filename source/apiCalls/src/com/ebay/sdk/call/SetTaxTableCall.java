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

package com.ebay.sdk.call;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the SetTaxTable call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>TaxTable</code> - This table is used to set or modify sales tax rates for one or more tax jurisdictions within that country. A <b>TaxJurisdiction</b> container is required for each tax jurisdiction that is being added/updated.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class SetTaxTableCall extends com.ebay.sdk.ApiCall {

    private TaxTableType taxTable = null;

    /**
     * Constructor.
     */
    public SetTaxTableCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public SetTaxTableCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * This call allows you to add or modify sales tax rates for one or more tax jurisdictions within the specified site. Any additions or modifications made with this call is saved in the seller's Sales Tax Table in My eBay.
     * <br/><br/>
     * Sales Tax Tables are only supported on the US and Canada (English and French versions) sites, so this call is only applicable to those sites. To view their current Sales Tax Table, a seller may go to the Sales Tax Table in My eBay, or they can make a <b>GetTaxTable</b> call.
     *
     * <br>
     *
     * @return The void object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public void setTaxTable()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        SetTaxTableRequestType req;
        req = new SetTaxTableRequestType();

        if (this.taxTable == null)
            throw new SdkException("TaxTable property is not set.");

        if (this.taxTable != null)
            req.setTaxTable(this.taxTable);

        SetTaxTableResponseType resp = (SetTaxTableResponseType) execute(req);

    }

    /**
     * Gets the SetTaxTableRequestType.taxTable.
     *
     * @return TaxTableType
     */
    public TaxTableType getTaxTable() {
        return this.taxTable;
    }

    /**
     * Sets the SetTaxTableRequestType.taxTable.
     *
     * @param taxTable TaxTableType
     */
    public void setTaxTable(TaxTableType taxTable) {
        this.taxTable = taxTable;
    }

}

