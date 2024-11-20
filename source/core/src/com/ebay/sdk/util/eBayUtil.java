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

package com.ebay.sdk.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.ebay.sdk.SdkException;
import com.ebay.soap.eBLBaseComponents.CategoryType;
//import com.ebay.soap.eBLBaseComponents.CharacteristicsSetType;
import com.ebay.soap.eBLBaseComponents.FeeType;

/**
 * Contains utilities for eBay API.
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author not attributable
 * @version 1.0
 */
public class eBayUtil {

  static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
  static final String TIME_ZONE = "GMT";

  /**
   *
   * @param date Date
   * @param format String
   * @param timeZone String
   * @return String
   */
  public static String toAPITimeString(Date date, String format, String timeZone)
  {
    SimpleDateFormat dateFormatterAPI = null;
    dateFormatterAPI = new SimpleDateFormat(format);
    if( timeZone != null )
      dateFormatterAPI.setTimeZone(TimeZone.getTimeZone(timeZone));
    return dateFormatterAPI.format(date);
  }

  /**
   * Converts date to eBay API date string.
   * @param date Date
   * @return String
   */
  public static String toAPITimeString(Date date)
  {
    return toAPITimeString(date, DATE_FORMAT, TIME_ZONE);
  }

  /**
   *
   * @param strDate String
   * @param format String
   * @param timeZone String
   * @throws ParseException
   * @return Date
   */
  public static Date fromAPITimeString(String strDate, String format, String timeZone)
      throws ParseException
  {
    SimpleDateFormat dateFormatterAPI = null;
    dateFormatterAPI = new SimpleDateFormat(format);
    if( timeZone != null )
      dateFormatterAPI.setTimeZone(TimeZone.getTimeZone(timeZone));
    return dateFormatterAPI.parse(strDate);
  }

  /**
   * Parse date from eBay API date string.
   * @param strDate String
   * @throws ParseException
   * @return Date
   */
  public static Date fromAPITimeString(String strDate)
      throws ParseException
  {
    return fromAPITimeString(strDate, DATE_FORMAT, TIME_ZONE);
  }

  /**
   * Find fees from FeeType array.
   * @param fees FeeType[]
   * @param feeName String
   * @return FeeType
   */
  public static FeeType findFeeByName(
     FeeType[] fees, String feeName)
  {
    FeeType ft = null;
    for(int i = 0; i < fees.length; i ++)
    {
      if( fees[i].getName().equals(feeName) )
      {
        ft = fees[i];
        break;
      }
    }
    return ft;
  }

  /**
   *
   * @param inStrm InputStream
   * @throws IOException
   * @return String
   */
  public static String convertInputStreamToString(InputStream inStrm)
      throws IOException
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(inStrm));
    StringBuffer response = new StringBuffer();
    String line;

    while ( (line = reader.readLine()) != null) {
      response.append(line + "\n");
    }

    return response.toString();
   }

   /**
    * Determines if a string length great than 1.
    * @param s String
    * @return boolean
    */
   public static boolean isNonZeroString(String s) {
     return s != null && s.length() > 0;
   }

   /**
    * Converts integer to string.
    * @param i int
    * @return String
    * @deprecated use String.valueOf(i)
    */
   public static String intToString(int i)
   {
     return new Integer(i).toString();
   }

   

   public static String getFullPathOfClass(Class cls)
   {
     URL url = cls.getProtectionDomain().getCodeSource().getLocation();
     String path = url.getPath();

     String[] dirs = cls.getName().split("\\.");

     for(int i = 0; i < dirs.length - 1; i++ )
       path += dirs[i] + "/";

     return path;
   }

 
}
