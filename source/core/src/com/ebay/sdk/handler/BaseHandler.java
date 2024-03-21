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

import javax.xml.ws.handler.MessageContext;

/**
 * a common supper class for all handlers
 * @author boyang
 * @version 1.0
 *
 * @param <T>
 */
public class BaseHandler<T extends MessageContext> {
	protected String HandlerName = null;

	public boolean handleFault(T mc) {
		
		return true;
		
	}
	
	public void close(MessageContext mc) {
	}

	public void setHandlerName(String handlerName) {
		HandlerName = handlerName;
	}
	
}
