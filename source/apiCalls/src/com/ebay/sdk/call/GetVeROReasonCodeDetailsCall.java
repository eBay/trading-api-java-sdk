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
import java.lang.Long;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the GetVeROReasonCodeDetails call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ReasonCodeID</code> - Unique identifier for a reason code. If this <strong>ReasonCodeID</strong> field is passed in, only the details related to this <strong>ReasonCodeID</strong> will be returned. If no reason code is specified, all reason codes are returned.
 * <br> <B>Input property:</B> <code>ReturnAllSites</code> - Set to true to retrieve reason codes for all sites. If not specified, reason codes are returned for the site specified in the request header only. If a <strong>ReasonCodeID</strong> value is specified, this parameter is ignored.
 * <br> <B>Output property:</B> <code>ReturnedVeROReasonCodeDetails</code> - This container consists of one or more VeRO Program copyright/intellectual property infringement violation types for one or more eBay sites.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class GetVeROReasonCodeDetailsCall extends com.ebay.sdk.ApiCall {

    private Long reasonCodeID = null;
    private Boolean returnAllSites = null;
    private VeROReasonCodeDetailsType returnedVeROReasonCodeDetails = null;

    /**
     * Constructor.
     */
    public GetVeROReasonCodeDetailsCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public GetVeROReasonCodeDetailsCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Retrieves details for VeRO reason codes and their descriptions. You can specify a
     * reason code ID to get details for a specific reason on the site specified in the
     * request header. If <strong>ReasonCodeID</strong> is not passed in the request, all reason codes are
     * returned. Set <strong>ReturnAllSites</strong> to <code>true</code> to retrieve reason codes for all sites.
     * You must be a member of the Verified Rights Owner (VeRO) Program to use this call.
     *
     * <br>
     *
     * @return The VeROReasonCodeDetailsType object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public VeROReasonCodeDetailsType getVeROReasonCodeDetails()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        GetVeROReasonCodeDetailsRequestType req;
        req = new GetVeROReasonCodeDetailsRequestType();
        if (this.reasonCodeID != null)
            req.setReasonCodeID(this.reasonCodeID);
        if (this.returnAllSites != null)
            req.setReturnAllSites(this.returnAllSites);

        GetVeROReasonCodeDetailsResponseType resp = (GetVeROReasonCodeDetailsResponseType) execute(
            req);

        this.returnedVeROReasonCodeDetails = resp.getVeROReasonCodeDetails();
        return this.getReturnedVeROReasonCodeDetails();
    }

    /**
     * Gets the GetVeROReasonCodeDetailsRequestType.reasonCodeID.
     *
     * @return Long
     */
    public Long getReasonCodeID() {
        return this.reasonCodeID;
    }

    /**
     * Sets the GetVeROReasonCodeDetailsRequestType.reasonCodeID.
     *
     * @param reasonCodeID Long
     */
    public void setReasonCodeID(Long reasonCodeID) {
        this.reasonCodeID = reasonCodeID;
    }

    /**
     * Gets the GetVeROReasonCodeDetailsRequestType.returnAllSites.
     *
     * @return Boolean
     */
    public Boolean getReturnAllSites() {
        return this.returnAllSites;
    }

    /**
     * Sets the GetVeROReasonCodeDetailsRequestType.returnAllSites.
     *
     * @param returnAllSites Boolean
     */
    public void setReturnAllSites(Boolean returnAllSites) {
        this.returnAllSites = returnAllSites;
    }

    /**
     * Valid after executing the API.
     * Gets the returned GetVeROReasonCodeDetailsResponseType.returnedVeROReasonCodeDetails.
     *
     * @return VeROReasonCodeDetailsType
     */
    public VeROReasonCodeDetailsType getReturnedVeROReasonCodeDetails() {
        return this.returnedVeROReasonCodeDetails;
    }

}

