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

package consoleaddfixedpriceitem;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.call.AddFixedPriceItemCall;
import com.ebay.sdk.helper.ConsoleUtil;
import com.ebay.sdk.util.eBayUtil;
import com.ebay.soap.eBLBaseComponents.AmountType;
import com.ebay.soap.eBLBaseComponents.BuyerPaymentMethodCodeType;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.CountryCodeType;
import com.ebay.soap.eBLBaseComponents.CurrencyCodeType;
import com.ebay.soap.eBLBaseComponents.FeesType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import com.ebay.soap.eBLBaseComponents.ListingDurationCodeType;
import com.ebay.soap.eBLBaseComponents.ListingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.NameValueListArrayType;
import com.ebay.soap.eBLBaseComponents.NameValueListType;
import com.ebay.soap.eBLBaseComponents.ReturnPolicyType;
import com.ebay.soap.eBLBaseComponents.SellerPaymentProfileType;
import com.ebay.soap.eBLBaseComponents.SellerProfilesType;
import com.ebay.soap.eBLBaseComponents.SellerReturnProfileType;
import com.ebay.soap.eBLBaseComponents.SellerShippingProfileType;
import com.ebay.soap.eBLBaseComponents.ShippingDetailsType;
import com.ebay.soap.eBLBaseComponents.ShippingServiceCodeType;
import com.ebay.soap.eBLBaseComponents.ShippingServiceOptionsType;
import com.ebay.soap.eBLBaseComponents.ShippingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.VariationType;
import com.ebay.soap.eBLBaseComponents.VariationsType;

/**
 * 
 * A simple item listing sample, show basic flow to list an item to eBay Site
 * using eBay SDK.
 * 
 * @author boyang
 * 
 */
public class ApplicationAddFixedPriceItem {
	
	// sample category ids supporting variations
	private static Set<String> sampleCatIDSet = new HashSet<String>();
	
	static {
		  sampleCatIDSet.add("4174");
		  sampleCatIDSet.add("27432");
		  sampleCatIDSet.add("42428");
	}

	public static void main(String[] args) {

		try {

			System.out.print("\n");
			System.out.print("+++++++++++++++++++++++++++++++++++++++\n");
			System.out.print("+ Welcome to eBay SDK for Java Sample +\n");
			System.out.print("+  - ConsoleAddFixedItem              +\n");
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
			AddFixedPriceItemCall api = new AddFixedPriceItemCall(apiContext);
			api.setItem(item);
			FeesType fees = api.addFixedPriceItem();
			System.out.println("End to call eBay API, show call result ...");
			System.out.println();

			// [Setp 4] Display results.
			System.out.println("The list was listed successfully!");

			double listingFee = eBayUtil.findFeeByName(fees.getFee(),
					"ListingFee").getFee().getValue();
			System.out.println("Listing fee is: "
					+ new Double(listingFee).toString());
			System.out.println("Listed Item ID: " + item.getItemID());
		} catch (Exception e) {
			System.out.println("Fail to list the item.");
			e.printStackTrace();
		}
	}

	/**
	 * Build a sample item
	 * 
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
		item.setListingType(ListingTypeCodeType.FIXED_PRICE_ITEM);
		// listing price
		item.setCurrency(CurrencyCodeType.USD);

		// listing duration
		item.setListingDuration(ListingDurationCodeType.DAYS_3.value());

		// item location and country
		item.setLocation(ConsoleUtil.readString("Location: "));
		item.setCountry(CountryCodeType.US);

		// listing category
		CategoryType cat = new CategoryType();
	    String inputString = "Primary Category (e.g.";
	    for(String catId : sampleCatIDSet) {
	    	  inputString = inputString + "," + catId;
	    }
	    inputString += "): ";
	    String catID = ConsoleUtil.readString(inputString);
		cat.setCategoryID(catID);
		item.setPrimaryCategory(cat);
		
		// item condition, New
		item.setConditionID(1000);

		// item variations
		if (sampleCatIDSet.contains(catID)) {
			item.setVariations(buildVariationsType());
		} else {
			AmountType startPrice = new AmountType();
			startPrice.setCurrencyID(CurrencyCodeType.USD);
			startPrice.setValue(10.0);
			item.setStartPrice(startPrice);
		}

		/*
		 * The Business Policies API and related Trading API fields are
		 * available in sandbox. It will be available in production for a
		 * limited number of sellers with Version 775. 100 percent of sellers
		 * will be ramped up to use Business Polcies in July 2012
		 */
		 //Create Seller Profile container
	      SellerProfilesType sellerProfile=new SellerProfilesType();
	      
	      //Set payment ProfileId
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
	 * 
	 * @return ApiContext object
	 */
	private static ApiContext getApiContext() throws IOException {

		String input;
		ApiContext apiContext = new ApiContext();

		// set Api Token to access eBay Api Server
		ApiCredential cred = apiContext.getApiCredential();
		input = ConsoleUtil
				.readString("Enter your eBay Authentication Token: ");
		cred.seteBayToken(input);
		// set Api Server Url
		input = ConsoleUtil
				.readString("Enter eBay SOAP server URL (e.g., https://api.ebay.com/wsapi): ");
		apiContext.setApiServerUrl(input);

		return apiContext;
	}

	/**
	 * Build sample variations
	 * 
	 * @return VariationsType object
	 */
	public static VariationsType buildVariationsType() {
		// listing variations
		VariationsType variations = new VariationsType();

		// first variation
		VariationType variation1 = new VariationType();
		// create the content of VariationSpecifics
		NameValueListArrayType nvArray1 = new NameValueListArrayType();
		NameValueListType nv11 = new NameValueListType();
		nv11.setName("Color");
		nv11.setValue(new String[] { "RED" });
		NameValueListType nv12 = new NameValueListType();
		nv12.setName("Size");
		nv12.setValue(new String[] { "M" });
		nvArray1.setNameValueList(new NameValueListType[] { nv11, nv12 });
		// set variation-level specifics for first variation
		variation1.setVariationSpecifics(nvArray1);
		// set start price
		AmountType amount1 = new AmountType();
		amount1.setValue(Double.valueOf(100));
		variation1.setStartPrice(amount1);
		// set quantity
		variation1.setQuantity(new Integer(10));
		// set variation name
		variation1.setVariationTitle("RED,M");

		// second variation
		VariationType variation2 = new VariationType();
		// create the content of specifics for each variation
		NameValueListArrayType nvArray2 = new NameValueListArrayType();
		NameValueListType nv21 = new NameValueListType();
		nv21.setName("Color");
		nv21.setValue(new String[] { "BLACK" });
		NameValueListType nv22 = new NameValueListType();
		nv22.setName("Size");
		nv22.setValue(new String[] { "L" });
		nvArray2.setNameValueList(new NameValueListType[] { nv21, nv22 });
		// set variation-level specifics for first variation
		variation2.setVariationSpecifics(nvArray2);
		// set start price
		AmountType amount2 = new AmountType();
		amount2.setValue(Double.valueOf(110));
		variation2.setStartPrice(amount2);
		// set quantity
		variation2.setQuantity(new Integer(20));
		// set variation name
		variation2.setVariationTitle("BLACK,L");

		// set variation
		variations.setVariation(new VariationType[] { variation1, variation2 });

		// create the content of specifics for variations
		NameValueListArrayType nvArray3 = new NameValueListArrayType();
		NameValueListType nv31 = new NameValueListType();
		nv31.setName("Color");
		nv31.setValue(new String[] { "BLACK", "RED" });
		NameValueListType nv32 = new NameValueListType();
		nv32.setName("Size");
		nv32.setValue(new String[] { "M", "L" });
		nvArray3.setNameValueList(new NameValueListType[] { nv31, nv32 });

		// set variationSpecifics
		variations.setVariationSpecificsSet(nvArray3);
		return variations;
	}

}
