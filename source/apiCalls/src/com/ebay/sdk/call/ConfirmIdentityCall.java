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

import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the ConfirmIdentity call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>SessionID</code> - A string obtained by making a <b>GetSessionID</b> call, passed in redirect URL to the eBay signin page.
 * <br> <B>Output property:</B> <code>ReturnedUserID</code> - Unique eBay user ID for the user.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class ConfirmIdentityCall extends com.ebay.sdk.ApiCall {

    private String sessionID = null;
    private String returnedUserID = null;

    /**
     * Constructor.
     */
    public ConfirmIdentityCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public ConfirmIdentityCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Returns the ID of a user who has gone through an application's consent flow
     * process for obtaining an authorization token.
     *
     * <br>
     *
     * @return The String object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public String confirmIdentity()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        ConfirmIdentityRequestType req;
        req = new ConfirmIdentityRequestType();
        if (this.sessionID != null)
            req.setSessionID(this.sessionID);

        ConfirmIdentityResponseType resp = (ConfirmIdentityResponseType) execute(
            req);

        this.returnedUserID = resp.getUserID();
        return this.getReturnedUserID();
    }

    /**
     * Gets the ConfirmIdentityRequestType.sessionID.
     *
     * @return String
     */
    public String getSessionID() {
        return this.sessionID;
    }

    /**
     * Sets the ConfirmIdentityRequestType.sessionID.
     *
     * @param sessionID String
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    /**
     * Valid after executing the API.
     * Gets the returned ConfirmIdentityResponseType.returnedUserID.
     *
     * @return String
     */
    public String getReturnedUserID() {
        return this.returnedUserID;
    }

}

