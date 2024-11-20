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
 * Wrapper class of the GetChallengeToken call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Output property:</B> <code>ReturnedChallengeToken</code> - Botblock token that is used to validate that the user is a human and not a bot.
 * <br> <B>Output property:</B> <code>ReturnedImageChallengeURL</code> - The URL of the image your application should display to
 * the user for a botblock challenge.
 * <br> <B>Output property:</B> <code>ReturnedAudioChallengeURL</code> - The URL of the audio clip your application should provide for sight-impaired users.
 * The audio clip corresponds to the image.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class GetChallengeTokenCall extends com.ebay.sdk.ApiCall {

    private String returnedChallengeToken = null;
    private String returnedImageChallengeURL = null;
    private String returnedAudioChallengeURL = null;

    /**
     * Constructor.
     */
    public GetChallengeTokenCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public GetChallengeTokenCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * This is the base request type for the <b>GetChallengeToken</b> call. This call retrieves a botblock token and URLs for an image or audio clip that the user is to match.
     * <br/><br/>
     * This call does not have any call-specific input parameters.
     *
     * <br>
     *
     * @return The String object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public String getChallengeToken()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        GetChallengeTokenRequestType req;
        req = new GetChallengeTokenRequestType();

        GetChallengeTokenResponseType resp = (GetChallengeTokenResponseType) execute(
            req);

        this.returnedChallengeToken = resp.getChallengeToken();
        this.returnedImageChallengeURL = resp.getImageChallengeURL();
        this.returnedAudioChallengeURL = resp.getAudioChallengeURL();
        return this.getReturnedChallengeToken();
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetChallengeTokenResponseType.returnedAudioChallengeURL.
     *
     * @return String
     */
    public String getReturnedAudioChallengeURL() {
        return this.returnedAudioChallengeURL;
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetChallengeTokenResponseType.returnedChallengeToken.
     *
     * @return String
     */
    public String getReturnedChallengeToken() {
        return this.returnedChallengeToken;
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetChallengeTokenResponseType.returnedImageChallengeURL.
     *
     * @return String
     */
    public String getReturnedImageChallengeURL() {
        return this.returnedImageChallengeURL;
    }

}

