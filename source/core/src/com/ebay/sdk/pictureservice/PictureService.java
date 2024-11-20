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

package com.ebay.sdk.pictureservice;

import com.ebay.soap.eBLBaseComponents.*;

/**
 * Defines object that uploads pictures to EPS server and get
 * the uploaded URLs back.
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li, changed by William Yang
 * @version 1.1
 */
public interface PictureService {
	
	
	
	
	 UploadSiteHostedPicturesResponseType uploadSiteHostedPictures(UploadSiteHostedPicturesRequestType request);


      /**
	   * Upload one picture file to EPS server, this interface is for those
	   * who want to operate on UploadSiteHostedPicturesRequestType directly.
       * @param picInfo Contains the local picture file path, uploading error,
       * response object and URL if the uploading succeeded.
	   * @param request 
	   *  allowed object is UploadSiteHostedPicturesRequestType 
	   * @return true means the uploading succeeded. Otherwise check picInfo
	   * for detailed error information.
	   */
	  boolean UpLoadSiteHostedPicture(PictureInfo picInfo, UploadSiteHostedPicturesRequestType request);
	
	
	  /**
	   * Upload one picture file to EPS server.
       * @param picInfo 
       * allowed object is 	 PictureInfo
       * response object and URL if the uploading succeeded.
	   * @return true means the uploading succeeded. Otherwise check picInfo
	   * for detailed error information.
	   */

	  boolean uploadPicture(PictureInfo picInfo);

	  /**
	   * Upload list of picture files to EPS server.
	   * @param picInfoList 
	   *   allowed object is the List of PictureInfo 
	   * the local picture file path, uploading error, response object and URI if the uploading
	   * succeeded.
	   * @return Number of pictures that have been successfully uploaded. Loop
	   * through picInfoList for individual uploading error.
	   */
	
	  int uploadPictures(PictureInfo[] picInfoList);
	

}
