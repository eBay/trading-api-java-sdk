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
 * Wrapper class of the SetMessagePreferences call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ASQPreferences</code> - This container can be used to set customized ASQ subjects, or it can be used to reset the ASQ subjects to the eBay defaults. Up to nine customized ASQ subjects can be set.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class SetMessagePreferencesCall extends com.ebay.sdk.ApiCall {

    private ASQPreferencesType aSQPreferences = null;

    private SetMessagePreferencesResponseType response;

    /**
     * Constructor.
     */
    public SetMessagePreferencesCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public SetMessagePreferencesCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Enables a seller to add custom Ask Seller a Question (ASQ) subjects to their
     * Ask a Question page, or to reset any custom subjects to their default values.
     *
     * <br>
     *
     * @return The void object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public void setMessagePreferences()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        SetMessagePreferencesRequestType req;
        req = new SetMessagePreferencesRequestType();
        if (this.aSQPreferences != null)
            req.setASQPreferences(this.aSQPreferences);

        SetMessagePreferencesResponseType resp = (SetMessagePreferencesResponseType) execute(
            req);

        response = resp;

    }

    /**
     * Gets the SetMessagePreferencesRequestType.aSQPreferences.
     *
     * @return ASQPreferencesType
     */
    public ASQPreferencesType getASQPreferences() {
        return this.aSQPreferences;
    }

    /**
     * Sets the SetMessagePreferencesRequestType.aSQPreferences.
     *
     * @param aSQPreferences ASQPreferencesType
     */
    public void setASQPreferences(ASQPreferencesType aSQPreferences) {
        this.aSQPreferences = aSQPreferences;
    }

    /**
     * Gets the SetMessagePreferencesResponseType.response.
     *
     * @return SetMessagePreferencesResponseType
     */
    public SetMessagePreferencesResponseType getResponse() {
        return response;
    }

}

