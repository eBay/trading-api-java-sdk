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

package com.ebay.sdk.helper;

import com.ebay.sdk.helper.ui.ControlTagItem;
import com.ebay.soap.eBLBaseComponents.ShippingServiceOptionsType;
import com.ebay.soap.eBLBaseComponents.ShippingTypeCodeType;

/**
 * A helper class for domestic ShippingServiceOption selection.
 */
public class ShippingServiceSelector {
    boolean hasSelection;

    ShippingTypeCodeType shippingType;
    ShippingServiceOptionsType shippingServiceOption;
    ShippingServiceOptionsType selectedShippingServiceOption;
    ControlTagItem[] ctrlShippingServices;

    /**
     * Constructor
     *
     * @param shippingType          ShippingTypeCodeType
     * @param shippingServiceOption ShippingServiceOptionsType
     * @param ctrlShippingServices  ControlTagItem[]
     */
    public ShippingServiceSelector(ShippingTypeCodeType shippingType,
        ShippingServiceOptionsType shippingServiceOption,
        ControlTagItem[] ctrlShippingServices) {
        this.shippingType = shippingType;
        this.shippingServiceOption = shippingServiceOption;
        this.ctrlShippingServices = ctrlShippingServices;
    }

    /**
     * Return a list of ShippingServiceOptions available in the ShippingServiceSelector.
     *
     * @return ControlTagItem[]
     */
    public ControlTagItem[] getCtrlShippingServices() {
        return this.ctrlShippingServices;
    }

    /**
     * Set the ControlTagItems of available ShippingServiceOptions.
     *
     * @param ctrlShippingServices ControlTagItem[]
     */
    public void setCtrlShippingServices(ControlTagItem[] ctrlShippingServices) {
        this.ctrlShippingServices = ctrlShippingServices;
    }

    /**
     * Return the ShippingServiceOption in the ShippingServiceSelector.
     *
     * @return ShippingServiceOptionsType
     */
    public ShippingServiceOptionsType getShippingServiceOption() {
        return this.shippingServiceOption;
    }

    /**
     * Set the ShippingServiceOption
     *
     * @param shippingServiceOption ShippingServiceOptionsType
     */
    public void setShippingServiceOption(
        ShippingServiceOptionsType shippingServiceOption) {
        this.shippingServiceOption = shippingServiceOption;
    }

    /**
     * Return the selected ShippingService in the ShipppingServiceSelector.
     *
     * @return ShippingServiceOptionsType
     */
    public ShippingServiceOptionsType getSelectedShippingServiceOption() {
        return this.selectedShippingServiceOption;
    }

    /**
     * Set the selected ShippingServiceOption
     *
     * @param option ShippingServiceOptionsType
     */
    public void setSelectedShippingServiceOption(
        ShippingServiceOptionsType option) {
        this.selectedShippingServiceOption = option;
    }

    /**
     * Return the ShippingType of the ShippingServiceSelector.
     *
     * @return ShippingTypeCodeType
     */
    public ShippingTypeCodeType getShippingType() {
        return this.shippingType;
    }

    /**
     * Set the ShippingType
     *
     * @param shippingType ShippingTypeCodeType
     */
    public void setShippingType(ShippingTypeCodeType shippingType) {
        this.shippingType = shippingType;
    }
}
