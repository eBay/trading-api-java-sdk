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

package com.ebay.sdk.call;

import java.lang.Integer;
import java.lang.String;

import com.ebay.sdk.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wrapper class of the ExtendSiteHostedPictures call of eBay SOAP API.
 * <br>
 * <p>Title: SOAP API wrapper library.</p>
 * <p>Description: Contains wrapper classes for eBay SOAP APIs.</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: eBay Inc.</p>
 * <br> <B>Input property:</B> <code>PictureURL</code> - The URL of the image hosted by eBay Picture Services. This URL is returned in the <b>SiteHostedPictureDetails.FullURL</b> field of the <b>UploadSiteHostedPictures</b> response.
 * <br> <B>Input property:</B> <code>ExtensionInDays</code> - The number of days by which to extend the expiration date for the
 * specified image.
 * <br> <B>Output property:</B> <code>ReturnedPictureURL</code> - The URL of the site-hosted picture whose expiration date was extended through the <b>ExtendSiteHostedPictures</b> call. This field will be returned if the expiration date of the site-hosted picture was successfully extended.
 *
 * @author Ron Murphy
 * @version 1.0
 */

public class ExtendSiteHostedPicturesCall extends com.ebay.sdk.ApiCall {

    private String[] pictureURL = null;
    private Integer extensionInDays = null;
    private String[] returnedPictureURL = null;

    /**
     * Constructor.
     */
    public ExtendSiteHostedPicturesCall() {
    }

    /**
     * Constructor.
     *
     * @param apiContext The ApiContext object to be used to make the call.
     */
    public ExtendSiteHostedPicturesCall(ApiContext apiContext) {
        super(apiContext);

    }

    /**
     * By default, unpublished pictures uploaded to eBay Picture Services (EPS) via the <b>UploadSiteHostedPictures</b> call will be kept on the server for five days before being purged. The <b>ExtendSiteHostedPictures</b> call is used to extend this expiration date by the number of days specified in the call. This restricted call gives approved sellers the ability to extend the default expiration date of pictures uploaded to EPS but not immediately published in an eBay listing.
     *
     * <br>
     *
     * @return The String[] object.
     * @throws ApiException
     * @throws SdkException
     * @throws Exception
     */
    public String[] extendSiteHostedPictures()
        throws com.ebay.sdk.ApiException, com.ebay.sdk.SdkException,
        java.lang.Exception {
        ExtendSiteHostedPicturesRequestType req;
        req = new ExtendSiteHostedPicturesRequestType();
        if (this.pictureURL != null)
            req.setPictureURL(this.pictureURL);
        if (this.extensionInDays != null)
            req.setExtensionInDays(this.extensionInDays);

        ExtendSiteHostedPicturesResponseType resp = (ExtendSiteHostedPicturesResponseType) execute(
            req);

        this.returnedPictureURL = resp.getPictureURL();
        return this.getReturnedPictureURL();
    }

    /**
     * Gets the ExtendSiteHostedPicturesRequestType.extensionInDays.
     *
     * @return Integer
     */
    public Integer getExtensionInDays() {
        return this.extensionInDays;
    }

    /**
     * Sets the ExtendSiteHostedPicturesRequestType.extensionInDays.
     *
     * @param extensionInDays Integer
     */
    public void setExtensionInDays(Integer extensionInDays) {
        this.extensionInDays = extensionInDays;
    }

    /**
     * Gets the ExtendSiteHostedPicturesRequestType.pictureURL.
     *
     * @return String[]
     */
    public String[] getPictureURL() {
        return this.pictureURL;
    }

    /**
     * Sets the ExtendSiteHostedPicturesRequestType.pictureURL.
     *
     * @param pictureURL String[]
     */
    public void setPictureURL(String[] pictureURL) {
        this.pictureURL = pictureURL;
    }

    /**
     * Valid after executing the API.
     * Gets the returned ExtendSiteHostedPicturesResponseType.returnedPictureURL.
     *
     * @return String[]
     */
    public String[] getReturnedPictureURL() {
        return this.returnedPictureURL;
    }

}

