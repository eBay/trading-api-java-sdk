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
import com.ebay.sdk.call.GetCategoriesCall;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.GetCategoriesRequestType;
import com.ebay.soap.eBLBaseComponents.GetCategoriesResponseType;

/**
 * Helper class with cache function for GetCategories call
 *
 * @author Conan and William
 */
public class CategoriesDownloader extends BaseDownloader {

    public CategoriesDownloader(ApiContext apiContext) {
        super(apiContext);
        this.FILE_EXTENSION = "cats";
        this.FILE_PREFIX = "AllCategories";
    }

    @Override
    protected String getLastUpdateTime() throws Exception {
        GetCategoriesCall api = new GetCategoriesCall(apiContext);
        GetCategoriesRequestType req = new GetCategoriesRequestType();
        //we only need 'UpdateTime' field
        req.setOutputSelector(new String[] { "UpdateTime" });
        api.execute(req);
        GetCategoriesResponseType resp = (GetCategoriesResponseType) api.execute(
            req);
        Date date = resp.getUpdateTime().getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
        String time = df.format(date);
        return time;
    }

    @Override
    protected Object individualCall() throws Exception {
        //get all categories for this site
        GetCategoriesCall apiCall = new GetCategoriesCall(apiContext);
        apiCall.setViewAllNodes(true);
        // Set detail level.
        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        apiCall.setDetailLevel(detailLevels);
        apiCall.setCategorySiteID(apiContext.getSite());
        //execute call
        apiCall.getCategories();
        return apiCall.getResponse();
    }

    public CategoryType[] getAllCategories() throws Exception {
        Object obj = getObject();
        GetCategoriesResponseType crt = (GetCategoriesResponseType) obj;
        return crt.getCategoryArray().getCategory();
    }

}
