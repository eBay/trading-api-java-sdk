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

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.call.GetCategoryFeaturesCall;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.FeatureIDCodeType;
import com.ebay.soap.eBLBaseComponents.GetCategoryFeaturesRequestType;
import com.ebay.soap.eBLBaseComponents.GetCategoryFeaturesResponseType;

/**
 * Helper class with cache function for GetCategoryFeatures call
 *
 * @author Conan and William
 */
public class FeaturesDownloader extends BaseDownloader {

    public FeaturesDownloader(ApiContext apiContext) {
        super(apiContext);
        this.FILE_EXTENSION = "cfs";
        this.FILE_PREFIX = "AllCatFeatures";
    }

    @Override
    protected String getLastUpdateTime() throws Exception {
        GetCategoryFeaturesCall api = new GetCategoryFeaturesCall(apiContext);
        GetCategoryFeaturesRequestType req = new GetCategoryFeaturesRequestType();
        //we only need 'UpdateTime' field
        //req.setOutputSelector(new String[]{"UpdateTime"});
        //workaround, use CategoryVersion instead of UpdateTime here
        req.setOutputSelector(new String[] { "CategoryVersion" });
        api.execute(req);
        GetCategoryFeaturesResponseType resp = (GetCategoryFeaturesResponseType) api.execute(
            req);
        //		Date date = resp.getUpdateTime().getTime();
        //		SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
        //		String time = df.format(date);
        return resp.getCategoryVersion();
    }

    @Override
    protected Object individualCall() throws Exception {
        //get all category features for a given site
        GetCategoryFeaturesCall apiCall = new GetCategoryFeaturesCall(
            apiContext);
        FeatureIDCodeType[] featureIds = new FeatureIDCodeType[] {
            FeatureIDCodeType.LISTING_DURATIONS,
            FeatureIDCodeType.ITEM_SPECIFICS_ENABLED,
            FeatureIDCodeType.RETURN_POLICY_ENABLED,
            FeatureIDCodeType.PAYMENT_METHODS,
            FeatureIDCodeType.CONDITION_ENABLED,
            FeatureIDCodeType.CONDITION_VALUES };
        apiCall.setFeatureIDs(featureIds);

        // Set detail level.
        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        apiCall.setDetailLevel(detailLevels);
        apiCall.setViewAllNodes(true);
        //execute call
        apiCall.getCategoryFeatures();
        return apiCall.getResponseObject();
    }

    //get category features for a given site
    public GetCategoryFeaturesResponseType getAllCategoryFeatures()
        throws Exception {
        Object obj = getObject();
        GetCategoryFeaturesResponseType cfrt = (GetCategoryFeaturesResponseType) obj;
        return cfrt;
    }
}
