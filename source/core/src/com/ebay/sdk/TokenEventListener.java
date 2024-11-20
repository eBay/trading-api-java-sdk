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
 * Listener to handle token events such as soft-expiration-renew and hard-expiration-warning.
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public interface TokenEventListener extends java.util.EventListener {

  /**
   * Called when a new token is returned from eBay to replace the current one.
   * @param newToken String The new token returned from eBay server.
   */
  void renewToken(String newToken);

  /**
   * Called when a hard expiration warning was received for the token that
  *  you are using.
   * @param expirationDate Date
   */
  void warnHardExpiration(java.util.Date expirationDate);
}
