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
 * Wrapper class of the AddToItemDescription call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>ItemID</code> - This field is used to identify the active listing that will be updated with additional text in the item description field. The Item ID is a unique identifier for a listing.
 * <br> <B>Input property:</B> <code>Description</code> - This field is used to specify the text that will be appended to the end of the active listing's item description.
 * The text provided in this field must abide by the same rules/restrictions
 * applicable to the original item description supplied at listing time. For more information on these rules and restrictions, see the <a href="https://developer.ebay.com/Devzone/XML/docs/Reference/ebay/types/ItemType.html#Description">Description field of ItemType</a>.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class AddToItemDescriptionCall extends com.ebay.sdk.ApiCall {

    private String itemID = null;
    private String description = null;

    /**
     * Constructor.
     */
    public AddToItemDescriptionCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public AddToItemDescriptionCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * The base request of the <b>AddToItemDescription</b> call, which is used to add additional text to an active listing's item description. Upon a successful call, the text supplied in this call will be inserted into the active listing, with a horizontal rule separating the original item description and the additional text that was added with this call.
     *
     * <br>
     *
     * @return The void object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public void addToItemDescription()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        AddToItemDescriptionRequestType req;
        req = new AddToItemDescriptionRequestType();

        if (this.itemID == null)
            throw new SdkException("ItemID property is not set.");
        if (this.description == null)
            throw new SdkException("Description property is not set.");

        if (this.itemID != null)
            req.setItemID(this.itemID);
        if (this.description != null)
            req.setDescription(this.description);

        AddToItemDescriptionResponseType resp = (AddToItemDescriptionResponseType) execute(
            req);

    }

    /**
     * Gets the AddToItemDescriptionRequestType.description.
     *
     * @return String
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the AddToItemDescriptionRequestType.description.
     *
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the AddToItemDescriptionRequestType.itemID.
     *
     * @return String
     */
    public String getItemID() {
        return this.itemID;
    }

    /**
     * Sets the AddToItemDescriptionRequestType.itemID.
     *
     * @param itemID String
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

}

