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
import java.util.Calendar;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the FetchToken call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>SecretID</code> - A value associated with the token retrieval request. SecretID is
 * defined by the application, and is passed in the redirect URL to the
 * eBay sign-in page. eBay recommends using a UUID for the secret ID
 * value. You must also set Username (part of the RequesterCredentials)
 * for the particular user of interest. SecretID and Username are not
 * required if SessionID is present.
 * <br> <B>Input property:</B> <code>SessionID</code> - A value associated with the token retrieval request. eBay generates the
 * session ID when the application makes a GetSessionID request. SessionID
 * is passed in the redirect URL to the eBay sign-in page. The advantage
 * of using SessionID is that it does not require UserID as part of the
 * FetchToken request. SessionID is not required if SecretID is present.
 * <br> <B>Output property:</B> <code>ReturnedToken</code> - The authentication token for the user.
 * <br> <B>Output property:</B> <code>HardExpirationTime</code> - Date and time at which the token returned in eBayAuthToken expires
 * and can no longer be used to authenticate the user for that application.
 * <br> <B>Output property:</B> <code>ReturnedRESTToken</code> - The REST authentication token for the user.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class FetchTokenCall extends com.ebay.sdk.ApiCall {

    private String secretID = null;
    private String sessionID = null;
    private String returnedToken = null;
    private Calendar hardExpirationTime = null;
    private String returnedRESTToken = null;

    /**
     * Constructor.
     */
    public FetchTokenCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public FetchTokenCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Retrieves an authentication token for a user.
     *
     * <br>
     *
     * @return The String object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public String fetchToken()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        FetchTokenRequestType req;
        req = new FetchTokenRequestType();
        if (this.secretID != null)
            req.setSecretID(this.secretID);
        if (this.sessionID != null)
            req.setSessionID(this.sessionID);

        FetchTokenResponseType resp = (FetchTokenResponseType) execute(req);

        this.returnedToken = resp.getEBayAuthToken();
        this.hardExpirationTime = resp.getHardExpirationTime();
        this.returnedRESTToken = resp.getRESTToken();
        return this.getReturnedToken();
    }

    /**
     * Gets the FetchTokenRequestType.secretID.
     *
     * @return String
     */
    public String getSecretID() {
        return this.secretID;
    }

    /**
     * Sets the FetchTokenRequestType.secretID.
     *
     * @param secretID String
     */
    public void setSecretID(String secretID) {
        this.secretID = secretID;
    }

    /**
     * Gets the FetchTokenRequestType.sessionID.
     *
     * @return String
     */
    public String getSessionID() {
        return this.sessionID;
    }

    /**
     * Sets the FetchTokenRequestType.sessionID.
     *
     * @param sessionID String
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    /**
     * Valid after executing the API.
     * Gets the returned FetchTokenResponseType.hardExpirationTime.
     *
     * @return Calendar
     */
    public Calendar getHardExpirationTime() {
        return this.hardExpirationTime;
    }

    /**
     * Valid after executing the API.
     * Gets the returned FetchTokenResponseType.returnedRESTToken.
     *
     * @return String
     */
    public String getReturnedRESTToken() {
        return this.returnedRESTToken;
    }

    /**
     * Valid after executing the API.
     * Gets the returned FetchTokenResponseType.returnedToken.
     *
     * @return String
     */
    public String getReturnedToken() {
        return this.returnedToken;
    }

}

