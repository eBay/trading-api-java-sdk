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

import com.ebay.sdk.ErrorInfoImpl;
import com.ebay.soap.eBLBaseComponents.UploadSiteHostedPicturesResponseType;
/**
 *
 * <p>Title: </p>
 * <p>Description: Defines picture object for PictureService. It contains
 * local picture file path, URI of the uploaded file and uploading error.
 * and response object.
 * </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class PictureInfo extends ErrorInfoImpl {

  private String picURL;
  private String filePath;
  private UploadSiteHostedPicturesResponseType reponse;

  /**
   * Get the response object.
   * @return UploadSiteHostedPicturesResponseType object.
   */
  public UploadSiteHostedPicturesResponseType getReponse() {
	return reponse;
  }

  /**
   * set the response object.
   */
  public void setReponse(UploadSiteHostedPicturesResponseType reponse) {
	this.reponse = reponse;
  }

/**
   * Constructor.
   */
  public PictureInfo() {
  }

  /**
   * Get the URI of the uploaded picture.
   * @return URI of the uploaded picture.
   */
  public String getURL() {
    return this.picURL;
  }

  /**
   * Set the URI of the uploaded picture.
   * @param url URI of the uploaded picture.
   */
  public void setURL(String url) {
    this.picURL = url;
  }

  /**
   * Gets the path of the picture file to be uploaded.
   * @return Picture file path.
   */
  public String getPictureFilePath() {
    return this.filePath;
  }

  /**
   * Sets the path of the picture file to be uploaded.
   * @param filePath Picture file path.
   */
  public void setPictureFilePath(String filePath) {
    this.filePath = filePath;
  }
}
