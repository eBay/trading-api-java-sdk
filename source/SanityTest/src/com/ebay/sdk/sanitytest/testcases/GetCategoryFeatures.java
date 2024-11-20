/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.GetCategoriesCall;
import com.ebay.sdk.call.GetCategoryFeaturesCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public class GetCategoryFeatures extends SDKTestCase {

    public void testGetCategoryFeatures() throws Exception {

        GetCategoryFeaturesCall api = new GetCategoryFeaturesCall(apiContext);

        DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
            DetailLevelCodeType.RETURN_ALL };
        api.setDetailLevel(detailLevels);

        api.setLevelLimit(new Integer(1));
        api.setViewAllNodes(new Boolean(true));

        // Make API call.
        api.getCategoryFeatures();

        CategoryFeatureType[] features = api.getReturnedCategory();
        assertNotNull(features);
        assertTrue(features.length > 0);
    }
  /*
  public void testGetItemSpecificEnable() throws Exception{
	  GetCategoryFeaturesCall api = new GetCategoryFeaturesCall(apiContext);
	  api.setSite(SiteCodeType.US);
	  DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[]{
			  DetailLevelCodeType.RETURN_ALL
	  };
	  api.setDetailLevel(detailLevels);
	  
	  FeatureIDCodeType[] features = new FeatureIDCodeType[]{
			  FeatureIDCodeType.ITEM_SPECIFICS_ENABLED
	  };
	  api.setFeatureIDs(features);
	  api.getCategoryFeatures();
	  
	  CategoryFeatureType[] res = api.getReturnedCategory();
	  for(int i = 0 ;i < res.length; i++){
		  if(res[i].getItemSpecificsEnabled().compareTo(ItemSpecificsEnabledCodeType.ENABLED)==0){
			  System.out.println(res[i].getCategoryID());
		  }
	  }
	  
	  
	  
  }
  */
}
