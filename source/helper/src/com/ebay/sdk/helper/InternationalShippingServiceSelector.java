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

import java.util.ArrayList;
import java.util.Hashtable;

import com.ebay.sdk.helper.ui.ControlTagItem;
import com.ebay.soap.eBLBaseComponents.InternationalShippingServiceOptionsType;
import com.ebay.soap.eBLBaseComponents.ShippingTypeCodeType;

/**
 * A helper class for InternationalShippingService selection.
 */
public class InternationalShippingServiceSelector {
    boolean hasSelection;

    ShippingTypeCodeType shippingType;
    InternationalShippingServiceOptionsType shippingServiceOption;
    InternationalShippingServiceOptionsType selectedShippingServiceOption;
    ControlTagItem[] ctrlShippingServices;
    Hashtable shipToLocationOptions;
    ArrayList selectedShipToLocations = new ArrayList();

    /**
     * Constructor
     *
     * @param shippingType          ShippingTypeCodeType
     * @param shippingServiceOption InternationalShippingServiceOptionsType
     * @param shipToLocations       Hashtable
     * @param ctrlShippingServices  ControlTagItem[]
     */
    public InternationalShippingServiceSelector(
        ShippingTypeCodeType shippingType,
        InternationalShippingServiceOptionsType shippingServiceOption,
        Hashtable shipToLocations, ControlTagItem[] ctrlShippingServices) {
        this.shippingType = shippingType;
        this.shippingServiceOption = shippingServiceOption;
        this.shipToLocationOptions = shipToLocations;
        this.ctrlShippingServices = ctrlShippingServices;
    }

    /**
     * Return a list of ControlTagItems of available ShippingServiceOptions.
     *
     * @return ControlTagItem[]
     */
    public ControlTagItem[] getCtrlShippingServices() {
        return this.ctrlShippingServices;
    }

    /**
     * Set the ControlTagItems of available InternationalShippingServiceOptions.
     *
     * @param ctrlShippingServices ControlTagItem[]
     */
    public void setCtrlShippingServices(ControlTagItem[] ctrlShippingServices) {
        this.ctrlShippingServices = ctrlShippingServices;
    }

    /**
     * Return the selected InternationalShippingServiceOption.
     *
     * @return InternationalShippingServiceOptionsType
     */
    public InternationalShippingServiceOptionsType getSelectedShippingServiceOption() {
        return this.selectedShippingServiceOption;
    }

    /**
     * Set the selected InternationalShippingServiceOption.
     *
     * @param option InternationalShippingServiceOptionsType
     */
    public void setSelectedShippingServiceOption(
        InternationalShippingServiceOptionsType option) {
        this.selectedShippingServiceOption = option;
    }

    /**
     * Return the available ShipToLocations.
     *
     * @return ArrayList
     */
    public ArrayList getSelectedShipToLocations() {
        return this.selectedShipToLocations;
    }

    /**
     * Set the selected ShipToLocations.
     *
     * @param list ArrayList
     */
    public void setSelectedShipToLocations(ArrayList list) {
        this.selectedShipToLocations = list;
    }

    /**
     * Return the InternationalShippingServiceOptionsType
     *
     * @return InternationalShippingServiceOptionsType
     */
    public InternationalShippingServiceOptionsType getShippingServiceOption() {
        return this.shippingServiceOption;
    }

    /**
     * Set the InternationalShippingServiceOptionsType
     *
     * @param shippingServiceOption InternationalShippingServiceOptionsType
     */
    public void setShippingServiceOption(
        InternationalShippingServiceOptionsType shippingServiceOption) {
        this.shippingServiceOption = shippingServiceOption;
    }

    /**
     * Return the available ShipToLocations.
     *
     * @return Hashtable
     */
    public Hashtable getShipToLocationOptions() {
        return this.shipToLocationOptions;
    }

    /**
     * Set the available ShipToLocations.
     *
     * @param map Hashtable
     */
    public void setShipToLocationOptions(Hashtable map) {
        this.shipToLocationOptions = map;
    }

    /**
     * Return the ShippingType.
     *
     * @return ShippingTypeCodeType
     */
    public ShippingTypeCodeType getShippingType() {
        return this.shippingType;
    }

    /**
     * Set the ShippingType.
     *
     * @param shippingType ShippingTypeCodeType
     */
    public void setShippingType(ShippingTypeCodeType shippingType) {
        this.shippingType = shippingType;
    }
}
