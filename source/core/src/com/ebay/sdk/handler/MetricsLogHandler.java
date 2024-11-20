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
package com.ebay.sdk.handler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

import com.ebay.sdk.logging.MetricsLogger;

/**
 * For performance metrics purpose
 * @author boyang
 * @version 1.0
 *
 */
public class MetricsLogHandler extends
             BaseHandler<LogicalMessageContext> implements
             LogicalHandler<LogicalMessageContext> {

	public boolean handleMessage(LogicalMessageContext lmc) {
		
		if (!MetricsLogger.metricsLoggingEnabled()) {
			return true;
		}
		
		Boolean request = (Boolean)lmc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (request.booleanValue()) {
			MetricsLogger.startSdkJAXBCallInvoke();
			
			Map<String, List<String>> http_req_headers = (Map<String, List<String>>)lmc.get(MessageContext.HTTP_REQUEST_HEADERS);
			if (http_req_headers == null) {
				http_req_headers = new HashMap<String, List<String>>();
			} 
			
			http_req_headers.put("X-EBAY-API-METRICS", Collections.singletonList("true"));
			lmc.put(MessageContext.HTTP_REQUEST_HEADERS, http_req_headers);
			
		}
		else{
			MetricsLogger.endSdkJAXBCallInvoke();
			
			Map http_resp_headers = (Map) lmc.get(MessageContext.HTTP_RESPONSE_HEADERS);
			if (http_resp_headers != null) {
				Object value = http_resp_headers.get("X-EBAY-API-PROCESS-TIME");
				if (value != null) {
					String sTime = value.toString();
					sTime = removeChars(sTime, '[', ']');
					long lTime = convertProcessingTime(sTime);
					MetricsLogger.recordServerProcessingTime(lTime);
				}
			}
		}
		return true;
	}
	
	public String removeChars(String s, char c1, char c2) {
		StringBuffer r = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != c1 && s.charAt(i) != c2) {
				r.append(s.charAt(i));
			}
		}
		return r.toString();
	}
	
	private long convertProcessingTime(String val) {
		if (val == null)
			return 0;
		long retval = 0;
		
		try {
		    retval = (long)Float.parseFloat(val);
		} catch (NumberFormatException nfe) {
			
		}
		return retval;
	}
}
