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

package com.ebay.sdk.helper;

import java.util.HashMap;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.call.GetCategoryFeaturesCall;
import com.ebay.soap.eBLBaseComponents.CategoryFeatureType;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.FeatureDefinitionsType;
import com.ebay.soap.eBLBaseComponents.FeatureIDCodeType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;
import com.ebay.soap.eBLBaseComponents.SiteDefaultsType;

public class GetCategoryFeaturesHelper {
    /**
     * A helper class to retrieve and save in memory the data returned by the GetCategoryFeatures API call.
     * Contains data only for categories whose feature settings override the prevailing settings
     * in SiteDefaults.
     */
    private static HashMap _categoryFeaturesBySite = new HashMap(5);
    private static HashMap _categoryVersionsBySite = new HashMap(5);
    private static HashMap _siteDefaultsBySite = new HashMap(5);
    private static HashMap _siteFeaturesBySite = new HashMap(5);
    private ApiContext _apiContext;
    private SiteCodeType _site;
    private String _categoryID = null;
    private Integer _levelLimit = new Integer(3);
    private Boolean _viewAllNodes = new Boolean(true);
    private FeatureIDCodeType[] _featureIDs = null;
    private CategoryFeatureType[] _categoryFeatures;
    private String _categoryVersion;
    private SiteDefaultsType _siteDefaults;
    private FeatureDefinitionsType _siteFeatures;

    public GetCategoryFeaturesHelper(ApiContext apiContext)
        throws SdkException, Exception {
        _apiContext = apiContext;
        _site = _apiContext.getSite();
        loadCategoryFeatures(_site);
    }

    public GetCategoryFeaturesHelper(ApiContext apiContext, String categoryId,
        Integer levelLimit, Boolean viewAllModes,
        FeatureIDCodeType[] featureIDs) throws SdkException, Exception {
        _apiContext = apiContext;
        _site = _apiContext.getSite();
        _categoryID = categoryId;
        _levelLimit = levelLimit;
        _viewAllNodes = viewAllModes;
        _featureIDs = featureIDs;
        loadCategoryFeatures(_site);
    }

    public boolean hasCategoryFeatures(SiteCodeType site) {
        return _categoryFeaturesBySite.containsKey(site)
            || _categoryVersionsBySite.containsKey(site)
            || _siteDefaultsBySite.containsKey(site)
            || _siteFeaturesBySite.containsKey(site);
    }

    public synchronized void loadCategoryFeatures(SiteCodeType site)
        throws SdkException, Exception {
        if (!_categoryFeaturesBySite.containsKey(site)) {
            SiteCodeType savedSite = _site;
            _site = site;
            getCategoryFeatures();
            addToCategoryFeaturesMap();
            addToSiteDefaultsMap();
            addToSiteFeaturesMap();
            addToCategoryVersionMap();
            _site = savedSite;
        }
    }

    public void loadCategoryFeatures(ApiContext apiContext)
        throws SdkException, Exception {
        _apiContext = apiContext;
        _site = _apiContext.getSite();
        loadCategoryFeatures(_site);
    }

    public String getCategoryVersion(SiteCodeType site) {
        return (String) _categoryVersionsBySite.get(site);
    }

    public String getCategoryVersion() {
        return getCategoryVersion(_apiContext.getSite());
    }

    public SiteDefaultsType getSiteDefaults(SiteCodeType site) {
        return (SiteDefaultsType) _siteDefaultsBySite.get(site);
    }

    public SiteDefaultsType getSiteDefaults() {
        return getSiteDefaults(_apiContext.getSite());
    }

    public FeatureDefinitionsType getSiteFeatures(SiteCodeType site) {
        return (FeatureDefinitionsType) _siteFeaturesBySite.get(site);
    }

    public FeatureDefinitionsType getSiteFeatures() {
        return getSiteFeatures(_apiContext.getSite());
    }

    public CategoryFeatureType getCategoryFeature(SiteCodeType site,
        CategoryType category) {
        HashMap myCategoryMap = (HashMap) _categoryFeaturesBySite.get(site);
        if (myCategoryMap != null) {
            return (CategoryFeatureType) myCategoryMap.get(category);
        }
        return null;
    }

    public CategoryFeatureType getCategoryFeature(CategoryType category) {
        return getCategoryFeature(_apiContext.getSite(), category);
    }

    public SiteCodeType getCurrentSite() {
        return _site;
    }

    private void addToCategoryFeaturesMap() {
        if (!_categoryFeaturesBySite.containsKey(_site)) {
            HashMap myCategoryMap = new HashMap();
            for (int i = 0; i < _categoryFeatures.length; i++) {
                CategoryFeatureType myCategory = _categoryFeatures[i];
                myCategoryMap.put(myCategory.getCategoryID(), myCategory);
            }
            _categoryFeaturesBySite.put(_site, myCategoryMap);
        }
    }

    private void addToSiteDefaultsMap() {
        if (!_siteDefaultsBySite.containsKey(_site)) {
            _siteDefaultsBySite.put(_site, _siteDefaults);
        }
    }

    private void addToSiteFeaturesMap() {
        if (!_siteFeaturesBySite.containsKey(_site)) {
            _siteFeaturesBySite.put(_site, _siteFeatures);
        }
    }

    private void addToCategoryVersionMap() {
        if (!_categoryVersionsBySite.containsKey(_site)) {
            _categoryVersionsBySite.put(_site, _categoryVersion);
        }
    }

    private void getCategoryFeatures() throws SdkException, Exception {
        GetCategoryFeaturesCall api = new GetCategoryFeaturesCall(_apiContext);
        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        api.setDetailLevel(detailLevels);
        api.setCategoryID(_categoryID);
        api.setLevelLimit(_levelLimit);
        api.setViewAllNodes(_viewAllNodes);
        api.setFeatureIDs(_featureIDs);

        // Make API call.
        api.getCategoryFeatures();
        _categoryFeatures = api.getReturnedCategory();
        _categoryVersion = api.getReturnedCategoryVersion();
        _siteDefaults = api.getReturnedSiteDefaults();
        _siteFeatures = api.getReturnedFeatureDefinitions();
    }
}
