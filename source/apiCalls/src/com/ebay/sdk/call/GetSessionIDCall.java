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
 * Wrapper class of the GetSessionID call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>RuName</code> - The eBay Registered URL must be specified in this field. An eBay Registered URL is created and associated with a developer's Sandbox or Production key set by logging into the user's developer account on <b>developer.ebay.com</b> and going to the <b>User Tokens</b> page. The <b>RuName</b> value passed in this field must match the one specified for the specific Sandbox or Production key set being used to make the <b>GetSessionID</b> call. For more information on adding and registering your <b class="con">RuName</b>, see the <a href="../../HowTo/Tokens/GettingTokens.html#step1">Setting Up an Application to Receive Tokens</a> tutorial.
 * <br> <B>Output property:</B> <code>ReturnedSessionID</code> - A 40-character identifier supplied by eBay to an application. Used to confirm the
 * identities of the user and the application in a URL redirect during the
 * process in which the user agrees to let the application wield a user token that
 * grants the application the right to access eBay data on behalf of the user.
 * Subsequently also used as input for the <b>FetchToken</b> API call. The
 * <b>SessionID</b> value is valid for five minutes after it is retrieved.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class GetSessionIDCall extends com.ebay.sdk.ApiCall {

    private String ruName = null;
    private String returnedSessionID = null;

    /**
     * Constructor.
     */
    public GetSessionIDCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public GetSessionIDCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Retrieves a session ID that identifies a user and your application when you make a <b>FetchToken</b> request.
     *
     * <br>
     *
     * @return The String object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public String getSessionID()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        GetSessionIDRequestType req;
        req = new GetSessionIDRequestType();
        if (this.ruName != null)
            req.setRuName(this.ruName);

        GetSessionIDResponseType resp = (GetSessionIDResponseType) execute(req);

        this.returnedSessionID = resp.getSessionID();
        return this.getReturnedSessionID();
    }

    /**
     * Gets the GetSessionIDRequestType.ruName.
     *
     * @return String
     */
    public String getRuName() {
        return this.ruName;
    }

    /**
     * Sets the GetSessionIDRequestType.ruName.
     *
     * @param ruName String
     */
    public void setRuName(String ruName) {
        this.ruName = ruName;
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetSessionIDResponseType.returnedSessionID.
     *
     * @return String
     */
    public String getReturnedSessionID() {
        return this.returnedSessionID;
    }

}

