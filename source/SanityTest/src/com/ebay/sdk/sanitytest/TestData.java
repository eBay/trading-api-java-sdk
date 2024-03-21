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

package com.ebay.sdk.sanitytest;

import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.GetNotificationPreferencesResponseType;
//import com.ebay.soap.eBLBaseComponents.GetStoreOptionsResponseType;
import com.ebay.soap.eBLBaseComponents.GetUserPreferencesResponseType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import com.ebay.soap.eBLBaseComponents.MemberMessageExchangeType;
//import com.ebay.soap.eBLBaseComponents.ProductSearchPageType;
//import com.ebay.soap.eBLBaseComponents.ProductSearchResultType;
import com.ebay.soap.eBLBaseComponents.PromotionRuleType;
//import com.ebay.soap.eBLBaseComponents.StoreCustomPageArrayType;
//import com.ebay.soap.eBLBaseComponents.StorePreferencesType;
import com.ebay.soap.eBLBaseComponents.StoreType;
import com.ebay.soap.eBLBaseComponents.TaxTableType;
import com.ebay.soap.eBLBaseComponents.TransactionType;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public abstract class TestData {

    public static ItemType itemForBid = null;

    public static boolean hasBid = false;

    public static String[] itemIDs = null;

    public static ItemType NewItem = null;
    public static ItemType NewFixedPriceItem = null;

    public static String UserID = null;

    public static ItemType EndedItem = null;
    public static ItemType EndedFixedPriceItem = null;

    public static CategoryType[] Categories = null;
    public static CategoryType[] Category2CS = null;

    public static StoreType Store = null;

    // public static StoreCustomPageArrayType StoreCustomPages = null;

    // public static GetStoreOptionsResponseType StoreOptionsResponse = null;

    //public static StorePreferencesType StorePreferences = null;

    public static GetUserPreferencesResponseType UserPreferencesResponse = null;

    public static TaxTableType TaxTable = null;

    public static GetNotificationPreferencesResponseType NotificationPreferencesResponse = null;

    public static MemberMessageExchangeType[] MemberMessages = null;

    public static TransactionType[] SellerTransactions = null;

    public static PromotionRuleType ItemPromotionRule = null;

    //public static ProductSearchPageType[] ProductSearchPages = null;

    //public static ProductSearchResultType[] ProductSearchResults = null;
    public static String AudioChallengeURL = null;
    public static String ChallengeToken = null;
    public static String ImageChallengeURL = null;
    //token for another eBay account, for item bid test case
    public static String testUserName = "";
    public static String testToken = "";

    //data for selling manager
    public static Long folder_id1 = null;
    public static Long folder_id2 = null;
    public static Long saleTemplateId = null;
    public static Long productId = null;
    public static String itemId = null;
    public static String soldItemId = null;
}
