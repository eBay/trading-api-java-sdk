/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.CategoryEventListener;
import com.ebay.sdk.call.GetCategoriesCall;
//import com.ebay.sdk.call.GetCategory2CSCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
//import com.ebay.soap.eBLBaseComponents.GetCategoriesRequestType;
//import com.ebay.soap.eBLBaseComponents.GetCategoriesResponseType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class GetCategories extends SDKTestCase {

    public void test_getCategories() throws Exception {
        GetCategoriesCall api = new GetCategoriesCall(this.apiContext);

        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        api.setDetailLevel(detailLevels);
        api.setLevelLimit(1);
        api.setViewAllNodes(true);

        //
        CategoryType[] cats = api.getCategories();

        assertNotNull(cats);
        assertTrue(cats.length > 0);

        // Save the result.
        TestData.Categories = cats;
    }

    public void test_getAllCategories() throws Exception {
        CategoryEventListenerImpl catListener = new CategoryEventListenerImpl();
        int numCats = GetCategoriesCall.getAllCategories(apiContext,
            SiteCodeType.US, 4, DetailLevelCodeType.RETURN_ALL, 2000,
            catListener);
        assertTrue(numCats > 0);
        System.out.println(numCats);
        assertTrue(catListener.getSiteID().equals(SiteCodeType.US));
        assertTrue(catListener.getCategories().length > 0);
        assertNotNull(catListener.categoryVersion);
    }

    class CategoryEventListenerImpl implements CategoryEventListener {
        private CategoryType[] categories;
        private SiteCodeType siteID;
        private String categoryVersion;

        public void receivedCategories(SiteCodeType siteID,
            CategoryType[] categories, String categoryVersion)
            throws Exception {
            this.siteID = siteID;
            this.categories = categories;
            this.categoryVersion = categoryVersion;
        }

        public CategoryType[] getCategories() {
            return categories;
        }

        public String getCategoryVersion() {
            return categoryVersion;
        }

        public SiteCodeType getSiteID() {
            return siteID;
        }
    }
}
