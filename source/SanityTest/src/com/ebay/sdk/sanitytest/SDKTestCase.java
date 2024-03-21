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

package com.ebay.sdk.sanitytest;

import java.text.MessageFormat;

import junit.framework.TestCase;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.call.EndItemCall;
import com.ebay.sdk.call.EndItemsCall;
import com.ebay.soap.eBLBaseComponents.EndItemRequestContainerType;
import com.ebay.soap.eBLBaseComponents.EndReasonCodeType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: eBay Inc.</p>
 *
 * @author Weijun Li
 * @version 1.0
 */
public abstract class SDKTestCase extends TestCase {

    static final String DATE_FORMAT = "yy-MM-dd HH:mm:ss";
    private static final Logger log = LoggerFactory.getLogger(
        SDKTestCase.class);
    protected ApiContext apiContext = null;

    protected static String getTimeString() {
        java.util.Calendar calTo = java.util.Calendar.getInstance();
        java.util.Date dt = calTo.getTime();

        java.text.SimpleDateFormat dateFormatterAPI = new java.text.SimpleDateFormat(
            DATE_FORMAT);
        return dateFormatterAPI.format(dt);
    }

    protected static java.util.Date getTime() {
        java.util.Calendar calTo = java.util.Calendar.getInstance();
        return calTo.getTime();
    }

    protected static String prependTimeString(String t) {
        return MessageFormat.format("[{0}] {1}\n",
            new Object[] { getTimeString(), t });
    }

    protected void setUp() throws Exception {
        super.setUp();

        TestContext tc = TestContext.getTestContext();
        this.apiContext = tc.getApiContext();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void logMessage(String msg) {
        log.info(prependTimeString(msg));
    }

    public void logException(Exception ex) {
        String msg = MessageFormat.format("Exception {0} - {1}",
            new Object[] { ex.getClass().getName(), ex.getMessage() });

        log.error(prependTimeString(msg));
    }

    public void endItem(String itemID) throws Exception {
        EndItemCall endItem = new EndItemCall(this.apiContext);

        // Set the item to be ended.
        endItem.setItemID(itemID);
        endItem.setEndingReason(EndReasonCodeType.NOT_AVAILABLE);

        endItem.endItem();
    }

    public void endItems(String[] itemIDs) throws Exception {
        EndItemsCall endItems = new EndItemsCall(this.apiContext);

        EndItemRequestContainerType[] container = new EndItemRequestContainerType[itemIDs.length];

        for (int i = 0; i < itemIDs.length; i++) {
            container[i] = new EndItemRequestContainerType();
            container[i].setItemID(itemIDs[i]);
            container[i].setEndingReason(EndReasonCodeType.LOST_OR_BROKEN);
        }
        endItems.setEndItemRequestContainer(container);
        endItems.endItems();
    }
}
