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
 * Defines an eBay API account object.
 * 
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @version 1.0
 */

public class ApiAccount {
  private String developer;
  private String application;
  private String certificate;

  /**
   * Constructor.
   */
  public ApiAccount() {
  }

  /**
   * Get the Developer ID (DevID).
   * @return	The Developer ID.
   */
  public String getDeveloper() {
    return this.developer;
  }

  /**
   * Set the Developer ID (DevID).
   * @param developer	The Developer ID to set.
   */
  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  /**
   * Get the Application ID (AppID).
   * @return 	The Application ID.
   */
  public String getApplication() {
    return this.application;
  }

  /**
   * Set the Application ID (AppID).
   * @param application 	The Application ID.
   */
  public void setApplication(String application) {
    this.application = application;
  }

  /**
   * Get the Certificate ID (CertID).
   * @return 	The Certificate ID.
   */
  public String getCertificate() {
    return this.certificate;
  }

  /**
   * Set the Certificate ID (CertID)
   * @param certificate	The Certificate ID.
   */
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

}
