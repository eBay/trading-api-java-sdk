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

package helloworld;

import java.io.IOException;
import java.util.Calendar;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;
import com.ebay.sdk.ApiLogging;
import com.ebay.sdk.helper.ConsoleUtil;
import com.ebay.sdk.call.GeteBayOfficialTimeCall;

/**
 * A Hello World-like sample, 
 * showing how to call eBay API using eBay SDK.
 *  
 * @author boyang
 *
 */
public class ApplicationHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    try {

	        System.out.print("\n");
	        System.out.print("+++++++++++++++++++++++++++++++++++++++\n");
	        System.out.print("+ Welcome to eBay SDK for Java Sample +\n");
	        System.out.print("+  - HelloWorld                   +\n");
	        System.out.print("+++++++++++++++++++++++++++++++++++++++\n");
	        System.out.print("\n");

	        // [Step 1] Initialize eBay ApiContext object
	  	    System.out.println("===== [1] Account Information ====");
	        ApiContext apiContext = getApiContext();
	        
	        // [Step 2] Create call object and execute the call
	        GeteBayOfficialTimeCall apiCall = new GeteBayOfficialTimeCall(apiContext);
	        System.out.println("Begin to call eBay API, please wait ... ");
	        Calendar cal = apiCall.geteBayOfficialTime();
	        System.out.println("End to call eBay API, show call result ...");
	        
	        // [Setp 3] Handle the result returned
	        System.out.println("Official eBay Time : " + cal.getTime().toString());
	    }
	    catch(Exception e) {
	        System.out.println("Fail to get eBay official time.");
	        e.printStackTrace();
	    }

	}
	
	  /**
	   * Populate eBay SDK ApiContext object with data input from user
	   * @return ApiContext object
	   */
	  private static ApiContext getApiContext() throws IOException {
		  
		  String input;
	      ApiContext apiContext = new ApiContext();
		  ApiLogging apiLogging = new ApiLogging();
          apiLogging.setLogSOAPMessages(false);
          apiLogging.setLogHTTPHeaders(true);
          apiContext.setApiLogging(apiLogging);
	      
	      //set Api Token to access eBay Api Server
	      ApiCredential cred = apiContext.getApiCredential();
	      input = ConsoleUtil.readString("Enter your eBay Authentication Token: ");
	      
	    		  
	      cred.seteBayToken(input);
	     
	      //set Api Server Url
	     input = ConsoleUtil.readString("Enter eBay SOAP server URL (e.g., https://api.sandbox.ebay.com/wsapi): ");
	      
	      apiContext.setApiServerUrl(input);
	      
	      return apiContext;
	  }

}
