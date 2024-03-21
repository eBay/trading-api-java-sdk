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

import javax.xml.ws.http.HTTPException;

/**
 * Wraps HTTP exception (unexpected return codes 300 - 499, 501-599) for SDK.
 * The HTTP return code is available in the ErrorCode property.
 * <br>
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Ron Murphy
 * @version 1.0
 */
public class SdkHTTPException extends SdkException {
    int errorCode = 0;
    
public SdkHTTPException(int code) {
	errorCode = code;
}
  /**
   * Create an instance of SdkHTTPException object from the associated HTTPException.
   * @param he
   * @return the new SdkHTTPException
   */
  static public SdkHTTPException fromHTTPException(HTTPException he)
  {
	  int code = he.getStatusCode();
	  return new SdkHTTPException(code);
  }

  /**
   * Gets the HTTP return code associated with the unexpected HTTP response.
   * @return ErrorType
   */
  public int getErrorCode() {
    return this.errorCode;
  }

  /**
   * Sets the HTTP return code.
   * @param errorCode
   */
  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }
  
}
