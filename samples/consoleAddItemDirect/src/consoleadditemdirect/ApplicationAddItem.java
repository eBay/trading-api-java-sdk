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

package consoleadditemdirect;

import java.io.IOException;

import com.ebay.sdk.ApiCall;
import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.helper.ConsoleUtil;
import com.ebay.sdk.util.eBayUtil;
import com.ebay.soap.eBLBaseComponents.AddItemRequestType;
import com.ebay.soap.eBLBaseComponents.AddItemResponseType;
import com.ebay.soap.eBLBaseComponents.AmountType;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.CountryCodeType;
import com.ebay.soap.eBLBaseComponents.CurrencyCodeType;
import com.ebay.soap.eBLBaseComponents.FeesType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import com.ebay.soap.eBLBaseComponents.ListingDurationCodeType;
import com.ebay.soap.eBLBaseComponents.ListingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.SellerPaymentProfileType;
import com.ebay.soap.eBLBaseComponents.SellerProfilesType;
import com.ebay.soap.eBLBaseComponents.SellerReturnProfileType;
import com.ebay.soap.eBLBaseComponents.SellerShippingProfileType;
/**
 * 
 * A simple item listing sample,
 * show basic flow to list an item to eBay Site using eBay SDK.
 * 
 * this sample does not use AddItemCall, it use raw ApiCall and
 * AddItemRequestType/AddItemResponseType directly.
 * 
 * @author boyang
 *
 */
public class ApplicationAddItem {
	
  public static void main(String[] args) {

    try {

      System.out.print("\n");
      System.out.print("+++++++++++++++++++++++++++++++++++++++\n");
      System.out.print("+ Welcome to eBay SDK for Java Sample +\n");
      System.out.print("+  - ConsoleAddItem                   +\n");
      System.out.print("+++++++++++++++++++++++++++++++++++++++\n");
      System.out.print("\n");

      // [Step 1] Initialize eBay ApiContext object
	  System.out.println("===== [1] Account Information ====");
      ApiContext apiContext = getApiContext();
      
      // [Step 2] Create a new item object.
      System.out.println("===== [2] Item Information ====");
      ItemType item = buildItem();
      
      // [Step 3] Create call object and execute the call.
      System.out.println("===== [3] Execute the API call ====");
      System.out.println("Begin to call eBay API, please wait ...");
      // Create a raw ApiCall object.
      ApiCall api = new ApiCall(apiContext);
      // Create a raw API request object and config it.
      AddItemRequestType req = new AddItemRequestType();
      req.setItem(item);
      // Execute the API call.
      AddItemResponseType resp = (AddItemResponseType)api.execute(req);
      // Read response.
      FeesType fees = resp.getFees();
      System.out.println("End to call eBay API, show call result ...");
      System.out.println();

      // [Setp 4] Display results.
      System.out.println("The list was listed successfully!");

      double listingFee = eBayUtil.findFeeByName(fees.getFee(), "ListingFee").getFee().getValue();
      System.out.println("Listing fee is: " + new Double(listingFee).toString());
      System.out.println("Listed Item ID: " + resp.getItemID());
    }
    catch(Exception e) {
      System.out.println("Fail to list the item.");
      e.printStackTrace();
    }
  }
  
  /**
   * Build a sample item
   * @return ItemType object
   */
  private static ItemType buildItem() throws IOException {

      String input;
	  ItemType item = new ItemType();

      // item title
      item.setTitle(ConsoleUtil.readString("Title: "));
      // item description
      item.setDescription(ConsoleUtil.readString("Description: "));
      
      // listing type
      item.setListingType(ListingTypeCodeType.CHINESE);
      // listing price
      item.setCurrency(CurrencyCodeType.USD);
      input = ConsoleUtil.readString("Start Price: ");
      AmountType amount = new AmountType();
      amount.setValue(Double.valueOf(input));
      item.setStartPrice(amount);
      
      // listing duration
      item.setListingDuration(ListingDurationCodeType.DAYS_3.value());
      
      // item location and country
      item.setLocation(ConsoleUtil.readString("Location: "));
      item.setCountry(CountryCodeType.US);

      // listing category
      CategoryType cat = new CategoryType();
      cat.setCategoryID(ConsoleUtil.readString("Primary Category (e.g., 162140): "));
      item.setPrimaryCategory(cat);
      
      // item quality
      item.setQuantity(new Integer(1));
      
      // item condition, New
      //item.setConditionID(1000);
      
      /*
		 * The Business Policies API and related Trading API fields are
		 * available in sandbox. It will be available in production for a
		 * limited number of sellers with Version 775. 100 percent of sellers
		 * will be ramped up to use Business Polcies in July 2012
		 */
      
      //Create Seller Profile container
      SellerProfilesType sellerProfile=new SellerProfilesType();
      
      //Set Payment ProfileId
      input = ConsoleUtil.readString("Enter your Seller Policy Payment ProfileId : ");
      SellerPaymentProfileType sellerPaymentProfile=new SellerPaymentProfileType();
      sellerPaymentProfile.setPaymentProfileID(Long.valueOf(input));
      sellerProfile.setSellerPaymentProfile(sellerPaymentProfile);
      
      //Set Shipping ProfileId
      SellerShippingProfileType sellerShippingProfile=new SellerShippingProfileType();
      input = ConsoleUtil.readString("Enter your Seller Policy Shipping ProfileId : ");
      sellerShippingProfile.setShippingProfileID(Long.valueOf(input));
      sellerProfile.setSellerShippingProfile(sellerShippingProfile);
      
      //Set Return Policy ProfileId
      SellerReturnProfileType sellerReturnProfile=new SellerReturnProfileType();
      input = ConsoleUtil.readString("Enter your Seller Policy Return ProfileId : ");
      sellerReturnProfile.setReturnProfileID(Long.valueOf(input));
      sellerProfile.setSellerReturnProfile(sellerReturnProfile);
      
      //Add Seller Profile to Item
      item.setSellerProfiles(sellerProfile);
      
      return item;
  }
  
  /**
   * Populate eBay SDK ApiContext object with data input from user
   * @return ApiContext object
   */
  private static ApiContext getApiContext() throws IOException {
	  
	  String input;
      ApiContext apiContext = new ApiContext();
      
      //set Api Token to access eBay Api Server
      ApiCredential cred = apiContext.getApiCredential();
      input = ConsoleUtil.readString("Enter your eBay Authentication Token: ");
      cred.seteBayToken(input);
     
      //set Api Server Url
      input = ConsoleUtil.readString("Enter eBay SOAP server URL (e.g., https://api.ebay.com/wsapi): ");
      apiContext.setApiServerUrl(input);
      
      return apiContext;
  }
  
}
