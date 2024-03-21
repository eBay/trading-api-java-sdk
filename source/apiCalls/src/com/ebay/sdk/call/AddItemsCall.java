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
 * Wrapper class of the AddItems call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>AddItemRequestContainer</code> - Defines a single item to be listed on eBay. This container is similar to an <b>AddItem</b> request. Up to five of these containers can be included in one <b>AddItems</b> request.
 * <br> <B>Output property:</B> <code>ReturnedAddItemResponseContainer</code> - One <b>AddItemResponseContainer</b> container is returned for each listing that is being created with the <b>AddItems</b> call. Each container includes the <b>ItemID</b> of each newly created listings, the eBay category each item is listed under, the seller-defined SKUs of the items (if any), the listing recommendations for each item (if applicable), the start and end time of each listing, and the estimated fees that each listing will incur.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class AddItemsCall extends com.ebay.sdk.ApiCall {

    private AddItemRequestContainerType[] addItemRequestContainer = null;
    private AddItemResponseContainerType[] returnedAddItemResponseContainer = null;

    /**
     * Constructor.
     */
    public AddItemsCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public AddItemsCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * Defines from one to five items and lists them on a specified eBay site.
     *
     * <br>
     *
     * @return The AddItemResponseContainerType[] object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public AddItemResponseContainerType[] addItems()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        AddItemsRequestType req;
        req = new AddItemsRequestType();
        if (this.addItemRequestContainer != null)
            req.setAddItemRequestContainer(this.addItemRequestContainer);

        AddItemsResponseType resp = (AddItemsResponseType) execute(req);

        this.returnedAddItemResponseContainer = resp.getAddItemResponseContainer();
        return this.getReturnedAddItemResponseContainer();
    }

    /**
     * Gets the AddItemsRequestType.addItemRequestContainer.
     *
     * @return AddItemRequestContainerType[]
     */
    public AddItemRequestContainerType[] getAddItemRequestContainer() {
        return this.addItemRequestContainer;
    }

    /**
     * Sets the AddItemsRequestType.addItemRequestContainer.
     *
     * @param addItemRequestContainer AddItemRequestContainerType[]
     */
    public void setAddItemRequestContainer(
        AddItemRequestContainerType[] addItemRequestContainer) {
        this.addItemRequestContainer = addItemRequestContainer;
    }

    /**
     * Valid after executing the API.
     * Gets the returned AddItemsResponseType.returnedAddItemResponseContainer.
     *
     * @return AddItemResponseContainerType[]
     */
    public AddItemResponseContainerType[] getReturnedAddItemResponseContainer() {
        return this.returnedAddItemResponseContainer;
    }

}

