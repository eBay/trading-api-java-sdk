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
 * Defines eBay auction account.
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Weijun Li
 * @version 1.0
 */

public class eBayAccount {
  private String username;
  private String password;

  /**
   * Constructor.
   */
  public eBayAccount() {
  }

  public eBayAccount(String userName, String password) {
  	this.username = userName;
  	this.password = password;
  }

  /**
   * Get eBay user Id.
   * @return eBay User Id string.
   */
  public String getUsername() {
    return this.username;
  }

  /**
   * Set eBay user Id.
   * @param username String
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Get the password of the eBay account.
   * @return the password string.
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * Set the password of the eBay account.
   * @param password the password string.
   */
  public void setPassword(String password) {
    this.password = password;
  }
}
