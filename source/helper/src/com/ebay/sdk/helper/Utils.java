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

import com.ebay.soap.eBLBaseComponents.AmountType;

public class Utils {

    /**
     * @param b Boolean
     * @return String
     */
    public static String booleanToYesNo(Boolean b) {
        if (b == null)
            return "";
        return b.booleanValue() ? "Yes" : "No";
    }

    /**
     * @param s String
     * @return String
     */
    public static String getDispString(String s) {
        return s == null ? "" : s;
    }

    /**
     * @param amt AmountType
     * @return String
     */
    public static String amountToString(AmountType amt) {
        if (amt == null) {
            return "N/A";
        }
        return new Double(amt.getValue()).toString();
    }

    public static String stripCDATA(String cdataString) {
        final String CDATA_START = "<![CDATA[";
        final String CDATA_END = "]]>";

        if (cdataString == null || cdataString.length() == 0) {
            return "";
        }
        int index1 = cdataString.indexOf(CDATA_START);
        if (index1 == -1) {
            return cdataString;
        }
        int index2 = cdataString.indexOf(CDATA_END);
        if (index2 == -1) {
            return cdataString.substring(CDATA_START.length());
        } else {
            return cdataString.substring(CDATA_START.length(), index2);
        }
    }
}
