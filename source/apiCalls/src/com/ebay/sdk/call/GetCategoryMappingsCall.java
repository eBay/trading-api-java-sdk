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

import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the GetCategoryMappings call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>CategoryVersion</code> - A version of the category mapping for the site. Filters
 * out data from the call to return only the category
 * mappings for which the data has changed since the
 * specified version. If not specified, all category
 * mappings are returned. Typically, an application passes
 * the version value of the last set of category mappings
 * that the application stored locally. The latest version
 * value is not necessarily greater than the previous value
 * that was returned. Therefore, when comparing versions,
 * only compare whether the value has changed.
 * <br> <B>Output property:</B> <code>ReturnedCategoryMapping</code> - Mapping between an old category ID and an active category ID. Returned when
 * category mappings exist and the value of CategoryVersion is different from
 * the current version on the site.
 * <br> <B>Output property:</B> <code>ReturnedCategoryVersion</code> - Version value assigned to the current category mapping data for the site.
 * Compare this value to the version value the application stored with the mappings
 * the last time the application executed the call. If the versions are the same,
 * the data has not changed since the last time the data was retrieved and stored.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class GetCategoryMappingsCall extends com.ebay.sdk.ApiCall {

    private String categoryVersion = null;
    private CategoryMappingType[] returnedCategoryMapping = null;
    private String returnedCategoryVersion = null;

    /**
     * Constructor.
     */
    public GetCategoryMappingsCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public GetCategoryMappingsCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Retrieves a map of old category IDs and corresponding active
     * category IDs defined for the site to which the request is sent.
     *
     * <br>
     *
     * @return The void object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public void getCategoryMappings()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        GetCategoryMappingsRequestType req;
        req = new GetCategoryMappingsRequestType();
        req.setDetailLevel(this.getDetailLevel());
        if (this.categoryVersion != null)
            req.setCategoryVersion(this.categoryVersion);

        GetCategoryMappingsResponseType resp = (GetCategoryMappingsResponseType) execute(
            req);

        this.returnedCategoryMapping = resp.getCategoryMapping();
        this.returnedCategoryVersion = resp.getCategoryVersion();

    }

    /**
     * Gets the GetCategoryMappingsRequestType.categoryVersion.
     *
     * @return String
     */
    public String getCategoryVersion() {
        return this.categoryVersion;
    }

    /**
     * Sets the GetCategoryMappingsRequestType.categoryVersion.
     *
     * @param categoryVersion String
     */
    public void setCategoryVersion(String categoryVersion) {
        this.categoryVersion = categoryVersion;
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetCategoryMappingsResponseType.returnedCategoryMapping.
     *
     * @return CategoryMappingType[]
     */
    public CategoryMappingType[] getReturnedCategoryMapping() {
        return this.returnedCategoryMapping;
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetCategoryMappingsResponseType.returnedCategoryVersion.
     *
     * @return String
     */
    public String getReturnedCategoryVersion() {
        return this.returnedCategoryVersion;
    }

}

