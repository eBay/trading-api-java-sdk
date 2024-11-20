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

import com.ebay.sdk.SdkException;
import com.ebay.sdk.helper.GetCategoryFeaturesHelper;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.FeatureDefinitionsType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;

public class GetCategoryFeaturesHelperTests extends SDKTestCase {
    public void testGetCategoryFeatures() throws SdkException, Exception {
        apiContext.setSite(SiteCodeType.AUSTRIA);
        GetCategoryFeaturesHelper helper1 = new GetCategoryFeaturesHelper(
            apiContext);
        assertTrue(helper1.hasCategoryFeatures(SiteCodeType.AUSTRIA));
        apiContext.setSite(SiteCodeType.CHINA);
        helper1.loadCategoryFeatures(apiContext);
        assertTrue(helper1.hasCategoryFeatures(SiteCodeType.AUSTRIA));
        assertTrue(helper1.hasCategoryFeatures(SiteCodeType.CHINA));
        helper1.loadCategoryFeatures(SiteCodeType.US);
        assertTrue(helper1.hasCategoryFeatures(SiteCodeType.AUSTRIA));
        assertTrue(helper1.hasCategoryFeatures(SiteCodeType.CHINA));
        assertTrue(helper1.hasCategoryFeatures(SiteCodeType.US));
        assertFalse(helper1.hasCategoryFeatures(SiteCodeType.CANADA));
        //
        FeatureDefinitionsType us_features = helper1.getSiteFeatures(
            SiteCodeType.US);
        assertNotNull(us_features);
        FeatureDefinitionsType cn_features = helper1.getSiteFeatures(
            SiteCodeType.CHINA);
        assertNotNull(cn_features);
        //reset the site
        apiContext.setSite(SiteCodeType.US);
    }

}
