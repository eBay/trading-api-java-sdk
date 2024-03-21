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
 * Wrapper class of the DeleteMyMessages call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>MessageIDs</code> - Contains a list of up to 10 <b>MessageID</b> values.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class DeleteMyMessagesCall extends com.ebay.sdk.ApiCall {

    private String[] messageIDs = null;

    /**
     * Constructor.
     */
    public DeleteMyMessagesCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public DeleteMyMessagesCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Removes selected messages for a given user.
     *
     * <br>
     *
     * @return The void object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public void deleteMyMessages()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        DeleteMyMessagesRequestType req;
        req = new DeleteMyMessagesRequestType();
        if (this.messageIDs != null) {
            MyMessagesMessageIDArrayType ary = new MyMessagesMessageIDArrayType();
            ary.setMessageID(this.messageIDs);
            req.setMessageIDs(ary);
        }

        DeleteMyMessagesResponseType resp = (DeleteMyMessagesResponseType) execute(
            req);

    }

    /**
     * Gets the DeleteMyMessagesRequestType.messageIDs.
     *
     * @return String[]
     */
    public String[] getMessageIDs() {
        return this.messageIDs;
    }

    /**
     * Sets the DeleteMyMessagesRequestType.messageIDs.
     *
     * @param messageIDs String[]
     */
    public void setMessageIDs(String[] messageIDs) {
        this.messageIDs = messageIDs;
    }

}

