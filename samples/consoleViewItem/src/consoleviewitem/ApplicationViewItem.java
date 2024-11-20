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

package consoleviewitem;

import com.ebay.sdk.*;
import com.ebay.sdk.call.GetItemCall;
import com.ebay.soap.eBLBaseComponents.*;
import com.ebay.sdk.util.eBayUtil;
import com.ebay.sdk.helper.ConsoleUtil;

/**
 * A simple view item sample,
 * show how to listing information from eBay Server using eBay SDK.
 * 
 * @author boyang
 *
 */
public class ApplicationViewItem {

  //Main method
  public static void main(String[] args) {

    String input;

    try {

      System.out.print("\n");
      System.out.print("+++++++++++++++++++++++++++++++++++++++\n");
      System.out.print("+ Welcome to eBay SDK for Java Sample +\n");
      System.out.print("+  - ConsoleViewItem                  +\n");
      System.out.print("+++++++++++++++++++++++++++++++++++++++\n");
      System.out.print("\n");

      // [1] Create ApiContext object.
      System.out.println("===== [1] Collect Account Information ====");

      ApiContext apiContext = new ApiContext();
      ApiCredential cred = apiContext.getApiCredential();

      input = ConsoleUtil.readString("Enter your eBay Authentication Token: ");
      cred.seteBayToken(input);
     

      input = ConsoleUtil.readString("Enter eBay SOAP server URL (e.g., https://api.ebay.com/wsapi): ");
      apiContext.setApiServerUrl(input);

      // [2] Ask for itemID.
      System.out.println("===== [2] Call GetItemCall ====");
      String itemIDStr = ConsoleUtil.readString("Enter ID of the item that you want to get: ");

      GetItemCall gc = new GetItemCall(apiContext);
      DetailLevelCodeType[] detailLevels = new DetailLevelCodeType[] {
          DetailLevelCodeType.RETURN_ALL,
          DetailLevelCodeType.ITEM_RETURN_ATTRIBUTES,
          DetailLevelCodeType.ITEM_RETURN_DESCRIPTION
      };
      gc.setDetailLevel(detailLevels);

      ItemType item = gc.getItem(itemIDStr);

      // [3] Display result.
      System.out.println("===== [3] Display Returned Item Information ====");

      ApplicationViewItem.print("ItemType", item.getListingType().toString());
      ApplicationViewItem.print("Title: ",  item.getTitle());
      ApplicationViewItem.print("StartPrice", item.getStartPrice().getValue());
      ApplicationViewItem.print("Quantity", item.getQuantity().toString());
      ApplicationViewItem.print("PrimaryCategory", item.getPrimaryCategory().getCategoryID());
      SellingStatusType sst = item.getSellingStatus();
      ApplicationViewItem.print("CurrentPrice", sst.getCurrentPrice().getValue());
      ApplicationViewItem.print("BidCount", sst.getBidCount().toString());
      ApplicationViewItem.print("QuantitySold", sst.getQuantitySold() == null ? "" : sst.getQuantitySold().toString());

      ListingDetailsType ldt = item.getListingDetails();
      UserType hb = sst.getHighBidder();
      if( hb != null )
        ApplicationViewItem.print("HighBidder", hb.getUserID());

      ApplicationViewItem.print("StartTime", eBayUtil.toAPITimeString(ldt.getStartTime().getTime()));
      ApplicationViewItem.print("EndTime", eBayUtil.toAPITimeString(ldt.getEndTime().getTime()));
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  static void print(String name, String value)
  {
    System.out.println(name + ": " + value);
  }

  static void print(String name, double value)
  {
    System.out.println(name + ": " + new Double(value).toString());
  }

  static void print(String name, int value)
  {
    System.out.println(name + ": " + new Integer(value).toString());
  }
}
