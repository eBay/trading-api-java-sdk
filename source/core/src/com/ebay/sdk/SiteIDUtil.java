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

package com.ebay.sdk;

import com.ebay.soap.eBLBaseComponents.*;

/**
 * Utility class the converts between SiteCodeType and eBay numerical Site ID.
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class SiteIDUtil {

  static final java.util.HashMap<SiteCodeType, Integer> siteMap;

  static {
    siteMap = new java.util.HashMap<SiteCodeType, Integer>();

    siteMap.put(SiteCodeType.US, new Integer(0));
    siteMap.put(SiteCodeType.AUSTRALIA, new Integer(15));
    siteMap.put(SiteCodeType.AUSTRIA, new Integer(16));
    siteMap.put(SiteCodeType.BELGIUM_DUTCH, new Integer(123));
    siteMap.put(SiteCodeType.BELGIUM_FRENCH, new Integer(23));

    siteMap.put(SiteCodeType.CANADA, new Integer(2));
    siteMap.put(SiteCodeType.CHINA, new Integer(223));
    siteMap.put(SiteCodeType.E_BAY_MOTORS, new Integer(100));
    siteMap.put(SiteCodeType.FRANCE, new Integer(71));
    siteMap.put(SiteCodeType.GERMANY, new Integer(77));

    siteMap.put(SiteCodeType.HONG_KONG, new Integer(201));  
    siteMap.put(SiteCodeType.INDIA, new Integer(203));
    siteMap.put(SiteCodeType.ITALY, new Integer(101));
    siteMap.put(SiteCodeType.MALAYSIA, new Integer(207));
    siteMap.put(SiteCodeType.NETHERLANDS, new Integer(146));
    siteMap.put(SiteCodeType.SINGAPORE, new Integer(216));  
    siteMap.put(SiteCodeType.SPAIN, new Integer(186));

    siteMap.put(SiteCodeType.SWITZERLAND, new Integer(193));

    siteMap.put(SiteCodeType.TAIWAN, new Integer(196));

    siteMap.put(SiteCodeType.UK, new Integer(3));
    siteMap.put(SiteCodeType.CUSTOM_CODE, new Integer(-1));



    siteMap.put(SiteCodeType.PHILIPPINES, new Integer(211));
    siteMap.put(SiteCodeType.POLAND, new Integer(212));
    siteMap.put(SiteCodeType.SWEDEN, new Integer(218));
    siteMap.put(SiteCodeType.IRELAND, new Integer(205));
    siteMap.put(SiteCodeType.CANADA_FRENCH, new Integer(210));
  }

  /**
   * Converts eBay site ID to SiteCodeType.
   * @param siteID int
   * @return SiteCodeType
   */
  public static SiteCodeType fromNumericalID(int siteID)
  {
    Object[] maps = siteMap.entrySet().toArray();
    for( int i = 0; i < maps.length; i ++ )
    {
      java.util.Map.Entry<SiteCodeType, Integer> entry = (java.util.Map.Entry<SiteCodeType, Integer>)maps[i];
      if( ((Integer)entry.getValue()).intValue() == siteID )
        return (SiteCodeType)entry.getKey();
    }
    return SiteCodeType.CUSTOM_CODE;
  }

  /**
   * Convers SiteCodeType to eBay numerical site ID.
   * @param siteID SiteCodeType
   * @return int
   */
  public static int toNumericalID(SiteCodeType siteID)
  {
    return ((Integer)siteMap.get(siteID)).intValue();
  }
}
