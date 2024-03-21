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
package test.ebay.sdk.helper;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.call.*;
import com.ebay.soap.eBLBaseComponents.CategoryFeatureType;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.FeatureIDCodeType;
import com.ebay.soap.eBLBaseComponents.GetCategoryFeaturesResponseType;
import com.ebay.soap.eBLBaseComponents.ItemSpecificsEnabledCodeType;
import com.ebay.soap.eBLBaseComponents.SiteDefaultsType;

public class CategoryHelper {

    //call GetCategoryFeatures to check whether the category supports custom item specifics
    public static boolean getCategoryFeature(int categoryId,
        ApiContext apiContext, FeatureIDCodeType featureID) throws Exception {
        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };

        GetCategoryFeaturesCall getCategoryFeatures = new GetCategoryFeaturesCall(
            apiContext);
        getCategoryFeatures.setCategoryID(Integer.toString(categoryId));
        //getCategoryFeatures.setFeatureIDs(new FeatureIDCodeType[]{featureID});
        getCategoryFeatures.setDetailLevel(detailLevels);
        getCategoryFeatures.getCategoryFeatures();
        GetCategoryFeaturesResponseType response = (GetCategoryFeaturesResponseType) getCategoryFeatures.getResponseObject();
        SiteDefaultsType sitedefault = response.getSiteDefaults();
        CategoryFeatureType[] categoryFeatures = getCategoryFeatures.getReturnedCategory();
        if (categoryFeatures == null || categoryFeatures.length == 0) {
            return false;
        }
        if (categoryFeatures[0] != null
            && categoryFeatures[0].getItemSpecificsEnabled() != null
            && categoryFeatures[0].getItemSpecificsEnabled()
            == ItemSpecificsEnabledCodeType.DISABLED) {
            return false;
        } else {
            return ((categoryFeatures[0] != null
                && categoryFeatures[0].getItemSpecificsEnabled() != null
                && categoryFeatures[0].getItemSpecificsEnabled()
                == ItemSpecificsEnabledCodeType.ENABLED) || (sitedefault != null
                && sitedefault.getItemSpecificsEnabled()
                == ItemSpecificsEnabledCodeType.ENABLED));
        }

    }

}
