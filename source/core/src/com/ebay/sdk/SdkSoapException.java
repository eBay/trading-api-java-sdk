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

import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;

import com.ebay.sdk.util.*;
import com.ebay.soap.eBLBaseComponents.*;

/**
 * Wraps SOAP exception (SOAPFaultException) for SDK.
 * It exatracts an ErrorType object from the SOAPFaultException.
 * <br>
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author weijun.li
 * @version 1.0
 */
public class SdkSoapException extends SdkException {

  private com.ebay.soap.eBLBaseComponents.ErrorType errorType;

  /**
   * Create an instance of SdkSoapException object from SOAPFaultException.
   * @param sfe SOAPFaultException
   * @return SdkSoapException
   */
  static public SdkSoapException fromSOAPFaultException(SOAPFaultException sfe)
  {
    ErrorType errorType = new ErrorType();
    SOAPFault sf = sfe.getFault();
    errorType.setShortMessage(sf.getFaultString());

    org.w3c.dom.Element elem = sf.getDetail();
    if (elem != null)
    {
      try {
        String s = XmlUtil.getChildString(elem, "//Severity");
        if (s != null && s.length() > 0)
          errorType.setSeverityCode(SeverityCodeType.fromValue(s));

        s = XmlUtil.getChildString(elem, "//ErrorCode");
        if (s != null && s.length() > 0)
          errorType.setErrorCode(s);

        s = XmlUtil.getChildString(elem, "//DetailedMessage");
        if (s != null && s.length() > 0)
          errorType.setLongMessage(s);
      } catch(Exception e) {
      }
    }

    return new SdkSoapException(errorType, sfe);
  }

  /**
   * Constructor.
   * @param errorType ErrorType
   * @param innerException Exception
   */
  protected SdkSoapException(com.ebay.soap.eBLBaseComponents.ErrorType errorType, Exception innerException) {
    super(innerException);
    this.errorType = errorType;
  }

  /**
   * Gets the associated ErrorType object.
   * @return ErrorType
   */
  public com.ebay.soap.eBLBaseComponents.ErrorType getErrorType() {
    return this.errorType;
  }

  /**
   * Sets the associated ErrorType object.
   * @param errorType ErrorType
   */
  public void setErrorType(com.ebay.soap.eBLBaseComponents.ErrorType errorType) {
    this.errorType = errorType;
  }

  /**
   * Overrides Exception.GetMessage() to return short message if there's one.
   * @return String
   */
  public String getMessage() {
    String txt;

    txt = this.errorType.getLongMessage();
    if( txt != null )
      return txt;

    txt = this.errorType.getShortMessage();
    if( txt != null )
      return txt;

    return this.errorType.getErrorCode().toString();
  }
  public boolean containsErrorCode(String errorCode)
  {
    if (this.errorType.getErrorCode().toString().equals(errorCode) )
      return true;
    else
      return false;
  }
}
