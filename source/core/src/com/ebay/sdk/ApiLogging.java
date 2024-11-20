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

/**
 * Contains properties to control SDK logging.
 * 
 * <br>
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @version 1.0
 */
public class ApiLogging {

  private boolean logExceptions = true;
  private boolean logSOAPMessages = true;
  private boolean logHTTPHeaders = false;
  private ExceptionFilter messageLoggingFilter = null;

  /**
   * Constructor.
   */
  public ApiLogging() {
  }

  /**
   * Set to true to enable logging of all exceptions if logging is enabled
   * (setEnableLogging(true)).
   *
   * @param logExceptions boolean
   */
  public void setLogExceptions(boolean logExceptions) {
    this.logExceptions = logExceptions;
  }

  /**
   * Get LogExceptions property.
   * @return true means logging of exception is turned on.
   */
  public boolean isLogExceptions() {
    return this.logExceptions;
  }

  /**
   * Set to true to enable logging of SOAP request and response messages if
   * logging is enabled (setEnableLogging(true)).
   * @param logSOAPMessages boolean
   */
  public void setLogSOAPMessages(boolean logSOAPMessages) {
    this.logSOAPMessages = logSOAPMessages;
  }

  /**
   * Get LogSOAPMessages property.
   * @return true means logging of SOAP messages is turned on.
   */
  public boolean isLogSOAPMessages() {
    return this.logSOAPMessages;
  }

  /**
   * Get the message logging filter.
   * @return the message logging filter object.
   */
  public ExceptionFilter getMessageLoggingFilter() {
    return this.messageLoggingFilter;
  }

  /**
   * Set the message logging filter. This will only have an effect if logging in general,
   * and logging of SOAP messages (payload), are already enabled.  The message logging filter 
   * allows constrained logging of payload messages for specific exceptions that match the filter.
   * @param messageLoggingFilter
   */
  public void setMessageLoggingFilter(ExceptionFilter messageLoggingFilter) {
    this.messageLoggingFilter = messageLoggingFilter;
  }

  /**
   * Get LogHTTPHeaders property.
   * @return true means logging of HTTP headers is turned on.
   */
  public boolean isLogHTTPHeaders() {
	return logHTTPHeaders;
  }

	
  /**
   * Set to true to enable logging of all HTTP request/response headers 
   * if logging is enabled(setEnableLogging(true)).
   *
   * @param logHTTPHeaders
   */	
  public void setLogHTTPHeaders(boolean logHTTPHeaders) {
	this.logHTTPHeaders = logHTTPHeaders;
  }
}
