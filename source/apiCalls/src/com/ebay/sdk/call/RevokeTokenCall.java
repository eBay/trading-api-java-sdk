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

import java.lang.Boolean;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the RevokeToken call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>UnsubscribeNotification</code> - Cancels notification subscriptions for the user/application if set to true. Default value is false.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class RevokeTokenCall extends com.ebay.sdk.ApiCall {

    private Boolean unsubscribeNotification = null;

    /**
     * Constructor.
     */
    public RevokeTokenCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public RevokeTokenCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Revokes a token before it would otherwise expire.
     *
     * <br>
     *
     * @return The void object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public void revokeToken()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        RevokeTokenRequestType req;
        req = new RevokeTokenRequestType();
        if (this.unsubscribeNotification != null)
            req.setUnsubscribeNotification(this.unsubscribeNotification);

        RevokeTokenResponseType resp = (RevokeTokenResponseType) execute(req);

    }

    /**
     * Gets the RevokeTokenRequestType.unsubscribeNotification.
     *
     * @return Boolean
     */
    public Boolean getUnsubscribeNotification() {
        return this.unsubscribeNotification;
    }

    /**
     * Sets the RevokeTokenRequestType.unsubscribeNotification.
     *
     * @param unsubscribeNotification Boolean
     */
    public void setUnsubscribeNotification(Boolean unsubscribeNotification) {
        this.unsubscribeNotification = unsubscribeNotification;
    }

}

