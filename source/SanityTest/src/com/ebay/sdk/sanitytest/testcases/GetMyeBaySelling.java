/*
Copyright (c) 2007 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent
version thereof released by eBay.  The then-current version of the License
can be found at https://www.codebase.ebay.com/Licenses.html and in the
eBaySDKLicense file that is under the eBay SDK install directory.
*/

package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.*;
import com.ebay.sdk.sanitytest.*;
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
public class GetMyeBaySelling extends SDKTestCase {

    public void testGetMyeBaySelling() throws Exception {

        GetMyeBaySellingCall api = new GetMyeBaySellingCall(this.apiContext);

        GetMyeBaySellingRequestType req = new GetMyeBaySellingRequestType();
        api.setMyeBaySellingRequest(req);

        ItemListCustomizationType lc = new ItemListCustomizationType();
        lc.setInclude(new Boolean(true));
        lc.setIncludeNotes(new Boolean(true));
        lc.setSort(ItemSortTypeCodeType.BID_COUNT);
        req.setActiveList(lc);

        lc = new ItemListCustomizationType();
        lc.setInclude(new Boolean(true));
        lc.setIncludeNotes(new Boolean(true));
        lc.setSort(ItemSortTypeCodeType.PRICE);
        req.setSoldList(lc);

        lc = new ItemListCustomizationType();
        lc.setInclude(new Boolean(true));
        lc.setIncludeNotes(new Boolean(true));
        lc.setSort(ItemSortTypeCodeType.END_TIME);
        req.setUnsoldList(lc);

        lc = new ItemListCustomizationType();
        lc.setInclude(new Boolean(true));
        lc.setIncludeNotes(new Boolean(true));
        lc.setSort(ItemSortTypeCodeType.START_TIME);
        req.setScheduledList(lc);

        // Make API call.
        api.getMyeBaySelling();

        GetMyeBaySellingResponseType resp = api.getReturnedMyeBaySellingResponse();
    }
}
