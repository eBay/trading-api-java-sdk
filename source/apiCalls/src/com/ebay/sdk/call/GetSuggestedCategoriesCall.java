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

import java.lang.Integer;
import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the GetSuggestedCategories call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>Query</code> - This field is used to specify the search query, consisting of one or
 * more keywords to search for in listing titles and descriptions.
 * The words "and" and "or" are treated like any other
 * word.
 * <br> <B>Output property:</B> <code>ReturnedSuggestedCategoryArray</code> - This container consists of an array of suggested listing categories for an item based on the keywords that were specified in the <b>Query</b> field of the call request. Up to 10 suggested  categories may be returned. This container will always be returned unless the query in the request exceeds the maximum allowed characters. The quality/accuracy of the results may depend on the quality of the query string.
 * <br> <B>Output property:</B> <code>ReturnedCategoryCount</code> - This integer value indicates the number of suggested categories that were found that matched the keywords.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class GetSuggestedCategoriesCall extends com.ebay.sdk.ApiCall {

    private String query = null;
    private SuggestedCategoryType[] returnedSuggestedCategoryArray = null;
    private Integer returnedCategoryCount = null;

    /**
     * Constructor.
     */
    public GetSuggestedCategoriesCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public GetSuggestedCategoriesCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * This call returns a list of up to 10 eBay categories that have the highest percentage of listings whose listing titles or descriptions contain the keywords you specify.
     *
     * <br>
     *
     * @return The SuggestedCategoryType[] object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public SuggestedCategoryType[] getSuggestedCategories()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        GetSuggestedCategoriesRequestType req;
        req = new GetSuggestedCategoriesRequestType();
        req.setDetailLevel(this.getDetailLevel());
        if (this.query != null)
            req.setQuery(this.query);

        GetSuggestedCategoriesResponseType resp = (GetSuggestedCategoriesResponseType) execute(
            req);

        this.returnedSuggestedCategoryArray = (
            resp.getSuggestedCategoryArray() == null ?
                null :
                resp.getSuggestedCategoryArray().getSuggestedCategory());
        this.returnedCategoryCount = resp.getCategoryCount();
        return this.getReturnedSuggestedCategoryArray();
    }

    /**
     * Gets the GetSuggestedCategoriesRequestType.query.
     *
     * @return String
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Sets the GetSuggestedCategoriesRequestType.query.
     *
     * @param query String
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetSuggestedCategoriesResponseType.returnedCategoryCount.
     *
     * @return Integer
     */
    public Integer getReturnedCategoryCount() {
        return this.returnedCategoryCount;
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetSuggestedCategoriesResponseType.returnedSuggestedCategoryArray.
     *
     * @return SuggestedCategoryType[]
     */
    public SuggestedCategoryType[] getReturnedSuggestedCategoryArray() {
        return this.returnedSuggestedCategoryArray;
    }

}

