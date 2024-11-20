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
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Weijun Li
 * @version 1.0
 */
public class TimeFilter {

  private java.util.Calendar timeFrom;
  private java.util.Calendar timeTo;

  /**
   *
   * @param timeFrom Calendar
   * @param timeTo Calendar
   */
  public TimeFilter(java.util.Calendar timeFrom, java.util.Calendar timeTo) {
    this.timeFrom = timeFrom;
    this.timeTo = timeTo;
  }

  /**
   *
   * @param timeTo Calendar
   */
  public void setTimeTo(java.util.Calendar timeTo) {
    this.timeTo = timeTo;
  }

  /**
   *
   * @return Calendar
   */
  public java.util.Calendar getTimeTo() {
    return timeTo;
  }

  /**
   *
   * @param timeFrom Calendar
   */
  public void setTimeFrom(java.util.Calendar timeFrom) {
    this.timeFrom = timeFrom;
  }

  /**
   *
   * @return Calendar
   */
  public java.util.Calendar getTimeFrom() {
    return timeFrom;
  }
}
