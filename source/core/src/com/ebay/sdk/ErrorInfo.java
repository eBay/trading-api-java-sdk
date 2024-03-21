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
 * Interface to identify that a data object can store related error.
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public interface ErrorInfo {

  /**
   * Indicates if there's error.
   * @return true means there's error.
   */
  boolean hasError();

  /**
   * Clear the error.
   */
  void clearError();

  /**
   * Get error type string.
   * @return error type string.
   */
  String getErrorType();

  /**
   * Set error type string.
   * @param errorType the error type string to set.
   */
  void setErrorType(String errorType);

  /**
   * Get error message string.
   * @return error message string.
   */
  String getErrorMessage();

  /**
   * Set error message string.
   * @param errorMessage error message string to set.
   */
  void setErrorMessage(String errorMessage);
}
