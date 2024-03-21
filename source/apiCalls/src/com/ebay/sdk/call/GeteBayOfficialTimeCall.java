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

package com.ebay.sdk.call;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the GeteBayOfficialTime call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class GeteBayOfficialTimeCall extends com.ebay.sdk.ApiCall {

    /**
     * Constructor.
     */
    public GeteBayOfficialTimeCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public GeteBayOfficialTimeCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Gets the official eBay system time in GMT.
     *
     * <br>
     *
     * @return The java.util.Calendar object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public java.util.Calendar geteBayOfficialTime()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        GeteBayOfficialTimeRequestType req;
        req = new GeteBayOfficialTimeRequestType();

        GeteBayOfficialTimeResponseType resp = (GeteBayOfficialTimeResponseType) execute(
            req);

        return resp == null ? null : resp.getTimestamp();

    }

}

