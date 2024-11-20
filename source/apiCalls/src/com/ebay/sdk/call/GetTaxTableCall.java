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

import java.util.Calendar;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the GetTaxTable call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Output property:</B> <code>ReturnedLastUpdateTime</code> - The last time (in GMT) that the tax table was updated. Only returned if the user previously created a tax table and if the site has jurisdictions. <b>LastUpdateTime</b> is useful for synchronization. If you cache the user's tax table, you can use <b>GetTaxTable</b> to check if it has changed and whether you need to update the cached tax table.
 * <br> <B>Output property:</B> <code>ReturnedTaxTable</code> - A container of tax jurisdiction information unique to a user/site combination. Returned as an empty container if no Sales Tax Table information exists for the seller's account and no <b>DetailLevel</b> is used. If <b>DetailLevel</b> is not specified, information is only returned for the jurisdictions for which the user provided tax information. If <b>DetailLevel</b> is set to <b>ReturnAll</b>, tax information is returned for all possible jurisdictions, whether specified by the user or not. <b>ShippingIncludedInTax</b> and <b>SalesTaxPercent</b> are returned but are empty.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class GetTaxTableCall extends com.ebay.sdk.ApiCall {

    private Calendar returnedLastUpdateTime = null;
    private TaxTableType returnedTaxTable = null;

    /**
     * Constructor.
     */
    public GetTaxTableCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public GetTaxTableCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * The base request type of the <b>GetTaxTable</b> call, which retrieves information on the seller's Sales Tax Table. This information includes all of the site's tax jurisdictions, a boolean field to indicate if sales tax is applied to shipping and handling charges, and the sales tax rate for each jurisdiction (if a sales tax rate is set for that jurisdiction).
     * <br/><br/>
     * Sales tax tables are only supported on the eBay US and Candada marketplaces.
     *
     * <br>
     *
     * @return The void object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public void getTaxTable()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        GetTaxTableRequestType req;
        req = new GetTaxTableRequestType();
        req.setDetailLevel(this.getDetailLevel());

        GetTaxTableResponseType resp = (GetTaxTableResponseType) execute(req);

        this.returnedLastUpdateTime = resp.getLastUpdateTime();
        this.returnedTaxTable = resp.getTaxTable();

    }

    /**
     * Valid after executing the API.
     * Gets the returned GetTaxTableResponseType.returnedLastUpdateTime.
     *
     * @return Calendar
     */
    public Calendar getReturnedLastUpdateTime() {
        return this.returnedLastUpdateTime;
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetTaxTableResponseType.returnedTaxTable.
     *
     * @return TaxTableType
     */
    public TaxTableType getReturnedTaxTable() {
        return this.returnedTaxTable;
    }

}

