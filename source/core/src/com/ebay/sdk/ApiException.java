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

import com.ebay.soap.eBLBaseComponents.SeverityCodeType;

/**
 * Represents one or more errors reported by an API call. Note that an API 
 * call can also return warnings, which do not trigger an ApiException.
 *
 * <br>
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @version 1.0
 */
public class ApiException extends SdkException {

  private com.ebay.soap.eBLBaseComponents.ErrorType[] errors;

  /**
   * Constructor.
   */
  public ApiException() {
  }

  /**
   * Constructor.
   * @param errors The array of errors of the exception.
   */
  public ApiException(com.ebay.soap.eBLBaseComponents.ErrorType[] errors) {
    this.errors = errors;
  }

  /**
   * Get list of errors included in the exception.
   * @return ErrorType[]
   */
  public com.ebay.soap.eBLBaseComponents.ErrorType[] getErrors() {
      return errors;
  }

  /**
   * Set list of errors to be included in the exception.
   * @param errors ErrorType[]
   */
  public void setErrors(com.ebay.soap.eBLBaseComponents.ErrorType[] errors) {
      this.errors = errors;
  }

  private int countErrors(String token)
  {
    int count = 0;
    for(int i = 0; i < this.errors.length; i ++)
    {
    	SeverityCodeType severity = errors[i].getSeverityCode();
        if( severity != null && severity.value().equals(token))
          count ++;
    }
    return count;
  }

  /**
   * Count number of errors with the severity of SeverityCodeType.ERROR
   * in the error list.
   * @return int
   */
  public int getSeverityErrorCount() {
    return countErrors(com.ebay.soap.eBLBaseComponents.SeverityCodeType.ERROR.value());
  }

  /**
   * Count number of errors with the severity of SeverityCodeType.WARNING
   * in the error list.
   * @return int
   */
  public int getSeverityWarningCount() {
    return countErrors(com.ebay.soap.eBLBaseComponents.SeverityCodeType.WARNING.value());
  }

  /**
   * Overrides Exception.getMessage().
   * @return String
   */
  public String getMessage() {
    String message = "";

    if (this.errors != null) {
      for (int i = 0; i < errors.length; i++)
      {
        if (i > 0)
          message += "\n";

        String s = errors[i].getLongMessage();
        if( s == null || s.length() == 0 )
        {
          s = errors[i].getShortMessage();
          if( s == null || s.length() == 0 ) {
        	  String errorCode = errors[i].getErrorCode();
              if (errorCode != null) {
            	  s = errorCode;
              } else {
            	  s = "";
              }
          }
        }
        
        message += s;
      }
    }

    return message;
  }

  /**
   * Overrides Exception.getLocalizedMessage().
   * @return String
   */
  public String getLocalizedMessage() {
    return getMessage();
  }

  public boolean containsErrorCode(String errorCode)
{
  for(int i = 0; i < errors.length; i++ )
  {
    String errCode = errors[i].getErrorCode();
    if( errCode != null && errCode.equals(errorCode) )
      return true;
  }
  return false;
}

}
