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

import java.util.Enumeration;
import java.util.Hashtable;

import com.ebay.sdk.helper.ui.ControlTagItem;
import com.ebay.soap.eBLBaseComponents.BuyerPaymentMethodCodeType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;

/**
 * A helper class to retrieve the available payment services/methods for a given site.
 */
public class PaymentServiceHelper {
    static Hashtable _paymentServiceMap = new Hashtable();
    static PaymentServiceHelper _paymentServiceHelper = new PaymentServiceHelper();

    // Service cache
    static Hashtable _paymentServices = new Hashtable();
    private static String PAYMENT_OPTION = "PaymentOption";

    static {
        _paymentServiceMap.put(new Integer(0),
            new ControlTagItem("Money Order or Cashier's Check",
                BuyerPaymentMethodCodeType.MOCC));
        _paymentServiceMap.put(new Integer(1),
            new ControlTagItem("Personal Check",
                BuyerPaymentMethodCodeType.PERSONAL_CHECK));
        _paymentServiceMap.put(new Integer(2),
            new ControlTagItem("Visa or Master Card",
                BuyerPaymentMethodCodeType.VISA_MC));
        _paymentServiceMap.put(new Integer(3),
            new ControlTagItem("American Express",
                BuyerPaymentMethodCodeType.AM_EX));
        _paymentServiceMap.put(new Integer(4),
            new ControlTagItem("Discover Card",
                BuyerPaymentMethodCodeType.DISCOVER));
        _paymentServiceMap.put(new Integer(8),
            new ControlTagItem("Payment Option See Description",
                BuyerPaymentMethodCodeType.PAYMENT_SEE_DESCRIPTION));
        _paymentServiceMap.put(new Integer(17),
            new ControlTagItem("PayPal", BuyerPaymentMethodCodeType.PAY_PAL));
        _paymentServiceMap.put(new Integer(20),
            new ControlTagItem("Credit Card Accepted",
                BuyerPaymentMethodCodeType.CC_ACCEPTED));
    }

    private PaymentServiceHelper() {
    }

    /**
     * Return an instance of PaymentServiceHelper
     *
     * @return PaymentServiceHelper
     */
    public static PaymentServiceHelper getInstance() {
        return _paymentServiceHelper;
    }

    /**
     * Return the map of available payment services/methods for a given site.
     *
     * @param siteId SiteCodeType
     * @return Hashtable
     */
    public Hashtable getPaymentServiceMap(SiteCodeType siteId) {
        Hashtable paymentServices = (Hashtable) _paymentServices.get(siteId);
        if (paymentServices == null) {
            Hashtable map = eBayDetailsHelper.getInstance()
                .getDetailEntryMapWithIntValue(siteId, PAYMENT_OPTION);
            paymentServices = new Hashtable();

            Enumeration keys = map.keys();
            while (keys.hasMoreElements()) {
                Object key = keys.nextElement();
                Object entry = _paymentServiceMap.get(key);
                if (entry != null) {
                    paymentServices.put(key, entry);
                }
            }
            _paymentServices.put(siteId, paymentServices);
        }

        return paymentServices;
    }
}
