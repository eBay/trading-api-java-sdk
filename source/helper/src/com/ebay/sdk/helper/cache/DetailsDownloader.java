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

package com.ebay.sdk.helper.cache;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.call.GeteBayDetailsCall;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Helper class with cache function for GeteBayDetails call
 *
 * @author William
 */
public class DetailsDownloader extends BaseDownloader {

    public DetailsDownloader(ApiContext apiContext) {
        super(apiContext);
        this.FILE_EXTENSION = "eds";
        this.FILE_PREFIX = "EBayDetails";
    }

    @Override
    protected String getLastUpdateTime() throws Exception {
        GeteBayDetailsCall api = new GeteBayDetailsCall(apiContext);
        //we only need 'UpdateTime' field
        api.setOutputSelector(new String[] { "UpdateTime" });
        api.setDetailName(this.getDetailNames());

        //call the API
        api.geteBayDetails();

        GeteBayDetailsResponseType resp = api.getReturnedeBayDetails();
        Date date = resp.getUpdateTime().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
        String timeStr = df.format(date);
        return timeStr;
    }

    private DetailNameCodeType[] getDetailNames() {
        DetailNameCodeType[] detailNames = new DetailNameCodeType[] {
            DetailNameCodeType.SHIPPING_SERVICE_DETAILS,
            DetailNameCodeType.SHIPPING_LOCATION_DETAILS,
            DetailNameCodeType.RETURN_POLICY_DETAILS, };
        return detailNames;
    }

    @Override
    protected Object individualCall() throws Exception {
        //get eBay details for a given site
        GeteBayDetailsCall api = new GeteBayDetailsCall(apiContext);
        api.setDetailName(this.getDetailNames());

        //call the API
        api.geteBayDetails();

        return api.getResponseObject();
    }

    //get eBay details for a given site
    public GeteBayDetailsResponseType geteBayDetails() throws Exception {
        Object obj = getObject();
        GeteBayDetailsResponseType resp = (GeteBayDetailsResponseType) obj;
        return resp;
    }
}

