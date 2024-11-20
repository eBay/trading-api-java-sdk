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


package signinredirect;

import java.util.PropertyResourceBundle;
import java.util.Locale;

import com.ebay.sdk.ApiAccount;
import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;

public class Global {
	static PropertyResourceBundle bundle;
	
	public static String getProperty(String propertyName) {
		String value ="";
		if (bundle == null) {
				bundle = (PropertyResourceBundle) PropertyResourceBundle.getBundle("authtool", Locale.US);
		}
		if (bundle != null) {
			value =  bundle.getString(propertyName);
		}
        return value;
	}
	
	public static ApiContext createApiContext( String devId, String appId, String certId, String ApiServerUrl) {
		ApiAccount ac = new ApiAccount();
		ac.setDeveloper(devId);
   	    ac.setApplication(appId);
   	    ac.setCertificate(certId);

	
		ApiCredential apiCred = new ApiCredential();
		apiCred.setApiAccount(ac);

		ApiContext apiContext = new ApiContext();
		apiContext.setApiCredential(apiCred);
		apiContext.setApiServerUrl(ApiServerUrl);
	
        return apiContext;
	}
}
