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
import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the ValidateChallengeInput call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ChallengeToken</code> - Botblock token that was returned by <b>GetChallengeToken</b>.
 * <br> <B>Input property:</B> <code>UserInput</code> - User response to a bot block challenge.
 * <br> <B>Input property:</B> <code>KeepTokenValid</code> - This boolean field is included and set to 'true' if the challenge token should remain valid for up to two minutes.
 * <br> <B>Output property:</B> <code>ReturnedValidToken</code> - Indicates whether the token is valid.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class ValidateChallengeInputCall extends com.ebay.sdk.ApiCall {

    private String challengeToken = null;
    private String userInput = null;
    private Boolean keepTokenValid = null;
    private Boolean returnedValidToken = null;

    /**
     * Constructor.
     */
    public ValidateChallengeInputCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public ValidateChallengeInputCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Validates the user response to a <b class="con">GetChallengeToken</b>
     * botblock challenge.
     *
     * <br>
     *
     * @return The Boolean object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public Boolean validateChallengeInput()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        ValidateChallengeInputRequestType req;
        req = new ValidateChallengeInputRequestType();
        if (this.challengeToken != null)
            req.setChallengeToken(this.challengeToken);
        if (this.userInput != null)
            req.setUserInput(this.userInput);
        if (this.keepTokenValid != null)
            req.setKeepTokenValid(this.keepTokenValid);

        ValidateChallengeInputResponseType resp = (ValidateChallengeInputResponseType) execute(
            req);

        this.returnedValidToken = resp.isValidToken();
        return this.getReturnedValidToken();
    }

    /**
     * Gets the ValidateChallengeInputRequestType.challengeToken.
     *
     * @return String
     */
    public String getChallengeToken() {
        return this.challengeToken;
    }

    /**
     * Sets the ValidateChallengeInputRequestType.challengeToken.
     *
     * @param challengeToken String
     */
    public void setChallengeToken(String challengeToken) {
        this.challengeToken = challengeToken;
    }

    /**
     * Gets the ValidateChallengeInputRequestType.keepTokenValid.
     *
     * @return Boolean
     */
    public Boolean getKeepTokenValid() {
        return this.keepTokenValid;
    }

    /**
     * Sets the ValidateChallengeInputRequestType.keepTokenValid.
     *
     * @param keepTokenValid Boolean
     */
    public void setKeepTokenValid(Boolean keepTokenValid) {
        this.keepTokenValid = keepTokenValid;
    }

    /**
     * Gets the ValidateChallengeInputRequestType.userInput.
     *
     * @return String
     */
    public String getUserInput() {
        return this.userInput;
    }

    /**
     * Sets the ValidateChallengeInputRequestType.userInput.
     *
     * @param userInput String
     */
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    /**
     * Valid after executing the API.
     * Gets the returned ValidateChallengeInputResponseType.returnedValidToken.
     *
     * @return Boolean
     */
    public Boolean getReturnedValidToken() {
        return this.returnedValidToken;
    }

}

