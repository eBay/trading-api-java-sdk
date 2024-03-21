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

import javax.swing.tree.DefaultMutableTreeNode;

import com.ebay.soap.eBLBaseComponents.InternationalShippingServiceOptionsType;
import com.ebay.soap.eBLBaseComponents.ShippingServiceOptionsType;
import com.ebay.soap.eBLBaseComponents.ShippingTypeCodeType;

/**
 * A helper class to build a tree for a list of ShippingServiceOptions.
 */
public class ShippingServiceOptionTreeBuilder {
    static ShippingServiceOptionTreeBuilder _builder = new ShippingServiceOptionTreeBuilder();

    private ShippingServiceOptionTreeBuilder() {
    }

    /**
     * Return an instance of ShippingServiceOptionTreeBuilder.
     *
     * @return ShippingServiceOptionTreeBuilder
     */
    public static ShippingServiceOptionTreeBuilder getInstance() {
        return _builder;
    }

    /**
     * Build a tree for a list of ShippingServiceOptions.
     *
     * @param shippingType ShippingTypeCodeType
     * @param ssos         ShippingServiceOptionsType[]
     * @return DefaultMutableTreeNode
     */
    public DefaultMutableTreeNode buildShippingServiceOptionTree(
        ShippingTypeCodeType shippingType, ShippingServiceOptionsType[] ssos) {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode(
            "ShippingServiceOptions");
        int size = ssos != null ? ssos.length : 0;
        for (int i = 0; i < size; i++) {
            ShippingServiceOptionsType sso = ssos[i];
            if (sso.getShippingService() != null) {
                top.add(buildShippingServiceOptionNode(shippingType, sso));
            }
        }
        return top;
    }

    /**
     * Build a node for a ShippingServiceOption.
     *
     * @param shippingType ShippingTypeCodeType
     * @param sso          ShippingServiceOptionsType
     * @return DefaultMutableTreeNode
     */
    public DefaultMutableTreeNode buildShippingServiceOptionNode(
        ShippingTypeCodeType shippingType, ShippingServiceOptionsType sso) {
        DefaultMutableTreeNode parent = new DefaultMutableTreeNode(
            "ShippingServiceOption");
        parent.add(new DefaultMutableTreeNode(
            "ShippingServicePriority:" + sso.getShippingServicePriority()
                .toString()));
        parent.add(new DefaultMutableTreeNode(
            "ShippingService:" + sso.getShippingService().toString()));
        if (shippingType == ShippingTypeCodeType.FLAT) {
            parent.add(new DefaultMutableTreeNode(
                "ShippingServiceCost:" + sso.getShippingServiceCost()
                    .getValue()));
            if (sso.getShippingServiceAdditionalCost() != null)
                parent.add(new DefaultMutableTreeNode(
                    "ShippingServiceAdditionalCost:"
                        + sso.getShippingServiceAdditionalCost().getValue()));
        }

        return parent;
    }

    /**
     * Build a tree for a list of InternationlShippingServiceOptions.
     *
     * @param shippingType ShippingTypeCodeType
     * @param ssos         InternationalShippingServiceOptionsType[]
     * @return DefaultMutableTreeNode
     */
    public DefaultMutableTreeNode buildShippingServiceOptionTree(
        ShippingTypeCodeType shippingType,
        InternationalShippingServiceOptionsType[] ssos) {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode(
            "InternationalShippingServiceOptions");
        int size = ssos != null ? ssos.length : 0;
        for (int i = 0; i < size; i++) {
            InternationalShippingServiceOptionsType sso = ssos[i];
            if (sso.getShippingService() != null) {
                top.add(buildShippingServiceOptionNode(shippingType, sso));
            }
        }
        return top;
    }

    /**
     * Build a node for an InternalShippingServiceOption.
     *
     * @param shippingType ShippingTypeCodeType
     * @param sso          InternationalShippingServiceOptionsType
     * @return DefaultMutableTreeNode
     */
    public DefaultMutableTreeNode buildShippingServiceOptionNode(
        ShippingTypeCodeType shippingType,
        InternationalShippingServiceOptionsType sso) {
        DefaultMutableTreeNode parent = new DefaultMutableTreeNode(
            "InternationalShippingServiceOptions");
        parent.add(new DefaultMutableTreeNode(
            "ShippingServicePriority:" + sso.getShippingServicePriority()
                .toString()));
        parent.add(new DefaultMutableTreeNode(
            "ShippingService:" + sso.getShippingService().toString()));
        if (shippingType == ShippingTypeCodeType.FLAT) {
            parent.add(new DefaultMutableTreeNode(
                "ShippingServiceCost:" + sso.getShippingServiceCost()
                    .getValue()));
            if (sso.getShippingServiceAdditionalCost() != null)
                parent.add(new DefaultMutableTreeNode(
                    "ShippingServiceAdditionalCost:"
                        + sso.getShippingServiceAdditionalCost().getValue()));
        }
        //ImportCharge (Added for SDK 777 Release)
        if (sso.getImportCharge() != null) {
            parent.add(new DefaultMutableTreeNode(
                "ImportCharge:" + sso.getImportCharge().getValue()));
        }
        return parent;
    }
}
