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

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 * A resolver to add handlers
 * @author boyang
 * @version 1.0
 *
 */
public class EBayServiceHandlerResolver implements HandlerResolver {

	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerChain = new ArrayList<Handler>();

		ClientAuthenticationHandler authn = new ClientAuthenticationHandler();
		SOAPMessageLoggingHandler logging = new SOAPMessageLoggingHandler();
		HTTPHeaderLoggingHandler httpheader = new HTTPHeaderLoggingHandler();
		MetricsLogHandler metrics = new MetricsLogHandler();
		
		//add handler for eBay API credentials
		handlerChain.add(authn);
		//add handler for soap message logging
		handlerChain.add(logging);
		//add handler for metrics logging
		handlerChain.add(metrics);
		//add handler for http headers logging
		handlerChain.add(httpheader);

		return handlerChain;
	}
}
