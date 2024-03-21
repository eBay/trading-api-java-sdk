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

package test.ebay.sdk.pictureservice;

import junit.framework.TestCase;

/**
 * @author cli
 * <p>
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class eBayPictureServiceTests extends TestCase {
    //
    //	PictureService service = null;
    //
    //	protected void setUp() throws Exception {
    //
    //		ApiContext context = new ApiContext();
    //
    //		context.setEpsServerUrl(
    //			"http://msa-e1.ebay.com/ws/eBayISAPI.dll?EpsBasicApp&com.ebay.presentation.ForceXmlDownload=true");
    //
    //		eBayPictureServiceFactory.init(context);
    //
    //		service = eBayPictureServiceFactory.getPictureService();
    //	}
    //
    //	public void testUploadPicture() {
    //
    //		PhotoDisplayCodeType option = PhotoDisplayCodeType.None;
    //  		PictureInfo picInfo = new PictureInfo();
    //
    //  		picInfo.setPictureFilePath("C:/Documents and Settings/cli/My Documents/My Pictures/Sample.jpg");
    //
    //  		assertTrue(service.UploadPicture(option, picInfo, true));
    //
    //  		String url = picInfo.getURL();
    //
    //  		assertNotNull(url);
    //
    //  		assertTrue(url.endsWith("_1_b.JPG"));
    //
    //		System.out.println("********************Image URl: " + url);
    //
    //  		assertTrue(service.UploadPicture(option, picInfo, false));
    //
    //  		url = picInfo.getURL();
    //
    //  		assertNotNull(url);
    //
    //  		assertTrue(url.endsWith("_1.JPG"));
    //
    //		System.out.println("********************Image URl: " + url);
    //
    //  		PictureInfo picInfo2 = new PictureInfo();
    //
    //  		picInfo2.setPictureFilePath("C:/Documents and Settings/cli/My Documents/conventions.pdf");
    //
    //  		assertFalse(service.UploadPicture(option, picInfo2, true));
    //
    //  		String errorType = picInfo2.getErrorType();
    //
    //  		assertEquals(errorType, "FF001");
    //
    //	}
    //
    //	public void testUploadPictures() {
    //	}

}
