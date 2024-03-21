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

/**
 * constants used by handlers
 * @author boyang
 * @version 1.0
 *
 */
public interface HandlerConstants {
	
	static final String API_CONTEXT = "api_context";
	static final String ENABLE_FULL_CREDENTIALS = "full_credentials";
	static final String NEED_API_ACCOUNT_ONLY = "api_account_only";
	//OAuth Support 02/02/2017
	static final String NEED_SOAP_REQUESTERCREDENTIALS_HEADER = "soap_requestercredentials_header";

}
