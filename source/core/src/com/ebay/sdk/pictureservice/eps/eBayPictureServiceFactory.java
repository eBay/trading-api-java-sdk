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


package com.ebay.sdk.pictureservice.eps;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.pictureservice.PictureService;

/**
 * @author cli
 *
 * This is the factory class for picture service. It hinds the implementation
 * class eBayPictureService from the client, and gives the flexibility to change
 * the class without affect the client.
 *
 */
public class eBayPictureServiceFactory {

  /**
   * This function could return null, if the "init" function is not called
   * before using this function. An exception could be throw in that case,
   * but to force the user of this function to catch the exception every time
   * use it could be less friedly than let the client make sure the init is
   * always called at the beginning of his/her application.
   * @param apiContext The ApiContext object for which you want to create PictureService for.
   * @return picture service implemenation object. NULL if the initialization
   * 		function is not called by the client application.
   */
  static public PictureService getPictureService(ApiContext apiContext) {
    return new eBayPictureServiceXMLCall(apiContext);
  }
}
