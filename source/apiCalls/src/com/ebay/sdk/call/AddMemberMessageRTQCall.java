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
 * Wrapper class of the AddMemberMessageRTQ call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ItemID</code> - The unique identifier of the listing about which the question was asked. This field is not required if the request includes a <b>RecipientID</b> value in the <b>MemberMessage</b> container, and the bidder/potential buyer and seller do not have more than one listing in common between one another.
 * <br> <B>Input property:</B> <code>MemberMessage</code> - This container is used by the seller to answer the question from the bidder/potential buyer. This container includes the recipient ID of the bidder/potential buyer, the message subject, the message body (where the question is answered), and other values related to the message.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class AddMemberMessageRTQCall extends com.ebay.sdk.ApiCall {

    private String itemID = null;
    private MemberMessageType memberMessage = null;

    /**
     * Constructor.
     */
    public AddMemberMessageRTQCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public AddMemberMessageRTQCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * The base request of the <b>AddMemberMessageRTQ</b> call that enables a seller to reply to a question about an active item listing.
     *
     * <br>
     *
     * @return The void object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public void addMemberMessageRTQ()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        AddMemberMessageRTQRequestType req;
        req = new AddMemberMessageRTQRequestType();
        if (this.itemID != null)
            req.setItemID(this.itemID);
        if (this.memberMessage != null)
            req.setMemberMessage(this.memberMessage);

        AddMemberMessageRTQResponseType resp = (AddMemberMessageRTQResponseType) execute(
            req);

    }

    /**
     * Gets the AddMemberMessageRTQRequestType.itemID.
     *
     * @return String
     */
    public String getItemID() {
        return this.itemID;
    }

    /**
     * Sets the AddMemberMessageRTQRequestType.itemID.
     *
     * @param itemID String
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    /**
     * Gets the AddMemberMessageRTQRequestType.memberMessage.
     *
     * @return MemberMessageType
     */
    public MemberMessageType getMemberMessage() {
        return this.memberMessage;
    }

    /**
     * Sets the AddMemberMessageRTQRequestType.memberMessage.
     *
     * @param memberMessage MemberMessageType
     */
    public void setMemberMessage(MemberMessageType memberMessage) {
        this.memberMessage = memberMessage;
    }

}

