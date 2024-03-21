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

import java.util.*;

import com.ebay.soap.eBLBaseComponents.*;
import com.ebay.sdk.helper.ui.*;

/**
 * A helper class to retrieve the available search locations/regions for a given site.
 */
public class RegionServiceHelper {

    static Hashtable _regionServiceMap = new Hashtable();
    static RegionServiceHelper _regionServiceHelper = new RegionServiceHelper();
    private static String REGION = "Region";

    private RegionServiceHelper() {
    }

    /**
     * Return an instance of RegionServiceHelper.
     *
     * @return RegionServiceHelper
     */
    public static RegionServiceHelper getInstanace() {
        return _regionServiceHelper;
    }

    /**
     * Return a map of the available search locations/regions for a given site.
     *
     * @param siteId SiteCodeType
     * @return Hashtable
     */
    public Hashtable getRegionsMap(SiteCodeType siteId) {
        Hashtable regionsMap = (Hashtable) _regionServiceMap.get(siteId);
        if (regionsMap == null) {
            Hashtable map = eBayDetailsHelper.getInstance()
                .getDetailEntryMapWithIntValue(siteId, REGION);
            if (map != null) {
                _regionServiceMap.put(siteId, map);
                int size = map.size();
                if (size > 0) {
                    regionsMap = new Hashtable();
                    Enumeration keys = map.keys();
                    while (keys.hasMoreElements()) {
                        Object key = keys.nextElement();
                        Object entry = map.get(key);
                        regionsMap.put(key,
                            new ControlTagItem(entry.toString(), key));
                    }
                }
                _regionServiceMap.put(siteId, regionsMap);
            }
        }
        return regionsMap;
    }
}
