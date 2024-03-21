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
 * Wrapper class of the GetTokenStatus call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Output property:</B> <code>ReturnedTokenStatus</code> - This container value indicates the status and expiration date of a user token. If a user token was revoked, the date/time of the revocation is also returned under this container.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class GetTokenStatusCall extends com.ebay.sdk.ApiCall {

    private TokenStatusType returnedTokenStatus = null;

    /**
     * Constructor.
     */
    public GetTokenStatusCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public GetTokenStatusCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * This call is used to get the current status of a user token. There are no call-specific fields in the request payload.
     *
     * <br>
     *
     * @return The TokenStatusType object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public TokenStatusType getTokenStatus()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        GetTokenStatusRequestType req;
        req = new GetTokenStatusRequestType();

        GetTokenStatusResponseType resp = (GetTokenStatusResponseType) execute(
            req);

        this.returnedTokenStatus = resp.getTokenStatus();
        return this.getReturnedTokenStatus();
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetTokenStatusResponseType.returnedTokenStatus.
     *
     * @return TokenStatusType
     */
    public TokenStatusType getReturnedTokenStatus() {
        return this.returnedTokenStatus;
    }

}

