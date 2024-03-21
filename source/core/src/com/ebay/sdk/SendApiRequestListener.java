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

package com.ebay.sdk;

import com.ebay.soap.eBLBaseComponents.*;

/**
 * Listner for sending API SOAP request event.
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public interface SendApiRequestListener extends java.util.EventListener {

  /**
   * Filter the request object that will be sent to eBay server. The method
   * may make changes to the request object.import com.ebay.soap.eBLBaseComponents.*;
   * @param request AbstractRequestType The request object to be sent.
   * @throws SdkException
   */
  void FilterApiRequest(AbstractRequestType request) throws com.ebay.sdk.SdkException;
}
