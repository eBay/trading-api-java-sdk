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
 * Wrapper class of the AddMemberMessagesAAQToBidder call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>AddMemberMessagesAAQToBidderRequestContainer</code> - An <b>AddMemberMessagesAAQToBidderRequestContainer</b> container is required for each message being sent to unique bidders/potential buyers.  A seller can send up to 10 messages to unique bidders/potential buyers in one <b>AddMemberMessagesAAQToBidder</b> call.
 * <br> <B>Output property:</B> <code>ReturnedAddMemberMessagesAAQToBidderResponseContainer</code> - Container consisting of the <b>Ack</b> field (indicating the result of the send message operation) and the <b>CorrelationID</b> field (used to track multiple send message operations performed in one call).
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class AddMemberMessagesAAQToBidderCall extends com.ebay.sdk.ApiCall {

    private AddMemberMessagesAAQToBidderRequestContainerType[] addMemberMessagesAAQToBidderRequestContainer = null;
    private AddMemberMessagesAAQToBidderResponseContainerType[] returnedAddMemberMessagesAAQToBidderResponseContainer = null;

    /**
     * Constructor.
     */
    public AddMemberMessagesAAQToBidderCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public AddMemberMessagesAAQToBidderCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * The base request of the <b>AddMemberMessagesAAQToBidder</b> call, which allows a seller to send up to 10 messages to bidders/potential buyers regarding an active listing. These potential buyers may include those who have made a Best Offer on a listing.
     *
     * <br>
     *
     * @return The AddMemberMessagesAAQToBidderResponseContainerType[] object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public AddMemberMessagesAAQToBidderResponseContainerType[] addMemberMessagesAAQToBidder()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        AddMemberMessagesAAQToBidderRequestType req;
        req = new AddMemberMessagesAAQToBidderRequestType();
        if (this.addMemberMessagesAAQToBidderRequestContainer != null)
            req.setAddMemberMessagesAAQToBidderRequestContainer(
                this.addMemberMessagesAAQToBidderRequestContainer);

        AddMemberMessagesAAQToBidderResponseType resp = (AddMemberMessagesAAQToBidderResponseType) execute(
            req);

        this.returnedAddMemberMessagesAAQToBidderResponseContainer = resp.getAddMemberMessagesAAQToBidderResponseContainer();
        return this.getReturnedAddMemberMessagesAAQToBidderResponseContainer();
    }

    /**
     * Gets the AddMemberMessagesAAQToBidderRequestType.addMemberMessagesAAQToBidderRequestContainer.
     *
     * @return AddMemberMessagesAAQToBidderRequestContainerType[]
     */
    public AddMemberMessagesAAQToBidderRequestContainerType[] getAddMemberMessagesAAQToBidderRequestContainer() {
        return this.addMemberMessagesAAQToBidderRequestContainer;
    }

    /**
     * Sets the AddMemberMessagesAAQToBidderRequestType.addMemberMessagesAAQToBidderRequestContainer.
     *
     * @param addMemberMessagesAAQToBidderRequestContainer AddMemberMessagesAAQToBidderRequestContainerType[]
     */
    public void setAddMemberMessagesAAQToBidderRequestContainer(
        AddMemberMessagesAAQToBidderRequestContainerType[] addMemberMessagesAAQToBidderRequestContainer) {
        this.addMemberMessagesAAQToBidderRequestContainer = addMemberMessagesAAQToBidderRequestContainer;
    }

    /**
     * Valid after executing the API.
     * Gets the returned AddMemberMessagesAAQToBidderResponseType.returnedAddMemberMessagesAAQToBidderResponseContainer.
     *
     * @return AddMemberMessagesAAQToBidderResponseContainerType[]
     */
    public AddMemberMessagesAAQToBidderResponseContainerType[] getReturnedAddMemberMessagesAAQToBidderResponseContainer() {
        return this.returnedAddMemberMessagesAAQToBidderResponseContainer;
    }

}

