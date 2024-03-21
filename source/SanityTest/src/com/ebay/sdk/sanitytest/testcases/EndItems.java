package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.call.EndItemsCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.soap.eBLBaseComponents.EndItemRequestContainerType;
import com.ebay.soap.eBLBaseComponents.EndReasonCodeType;

public class EndItems extends SDKTestCase {
    public void testEndItems() throws Exception {
        assertNotNull(TestData.itemIDs);
        String[] itemIDs = TestData.itemIDs;

        EndItemsCall endItems = new EndItemsCall(this.apiContext);

        EndItemRequestContainerType[] container = new EndItemRequestContainerType[itemIDs.length];

        for (int i = 0; i < itemIDs.length; i++) {
            container[i] = new EndItemRequestContainerType();
            container[i].setMessageID(Integer.toString(i));
            container[i].setItemID(itemIDs[i]);
            container[i].setEndingReason(EndReasonCodeType.LOST_OR_BROKEN);
        }
        endItems.setEndItemRequestContainer(container);
        endItems.endItems();
    }
}
