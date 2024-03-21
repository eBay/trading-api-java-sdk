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

package com.ebay.sdk.perftest;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.UIManager;

import com.ebay.sdk.ApiContext;
import com.ebay.sdk.TimeFilter;
import com.ebay.sdk.call.AddItemCall;
import com.ebay.sdk.call.GetCategoriesCall;
import com.ebay.sdk.call.GetItemCall;
import com.ebay.sdk.call.GetSellerListCall;
import com.ebay.sdk.call.GeteBayOfficialTimeCall;
import com.ebay.sdk.call.ReviseItemCall;
import com.ebay.sdk.call.VerifyAddItemCall;
import com.ebay.sdk.helper.ConsoleUtil;
import com.ebay.sdk.helper.ui.DialogAccount;
import com.ebay.sdk.helper.ui.GuiUtil;
import com.ebay.sdk.logging.CallMetrics;
import com.ebay.sdk.logging.MetricsLogger;
import com.ebay.soap.eBLBaseComponents.AmountType;
import com.ebay.soap.eBLBaseComponents.BuyerPaymentMethodCodeType;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.CountryCodeType;
import com.ebay.soap.eBLBaseComponents.CurrencyCodeType;
import com.ebay.soap.eBLBaseComponents.DetailLevelCodeType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import com.ebay.soap.eBLBaseComponents.ListingDurationCodeType;
import com.ebay.soap.eBLBaseComponents.ListingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.PaginationType;
import com.ebay.soap.eBLBaseComponents.ReturnPolicyType;
import com.ebay.soap.eBLBaseComponents.SalesTaxType;
import com.ebay.soap.eBLBaseComponents.ShippingDetailsType;
import com.ebay.soap.eBLBaseComponents.ShippingServiceCodeType;
import com.ebay.soap.eBLBaseComponents.ShippingServiceOptionsType;
import com.ebay.soap.eBLBaseComponents.ShippingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;

public class PerformanceTest {

    static int testSuiteNumber = 0;
    static int threadWarmUp = 1;
    private static CallMetrics metrics = new CallMetrics();
    private static ApiContext apiContext = null;

    public PerformanceTest() {
    }

    public static void runOneThread() {
        System.out.println("Start One Thread Tests...");
        Thread.currentThread().setName("usa5");
        executeCalls();
    }

    public static void runMultipleThreads() {
        System.out.println("Start Multi-Thread Tests...");
        final int threadCnt = 6;
        final int callCnt = 3;
        Thread t[] = new Thread[threadCnt];
        for (int i = 0; i < threadCnt; i++) {
            int temp = i + 1;
            String tname = "tuser" + temp;
            t[i] = new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < callCnt; j++) {
                        executeCalls();
                    }
                }
            }, tname);
            t[i].start();
        }

        boolean wait = true;
        while (wait) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            int cnt = 0;
            for (int i = 0; i < threadCnt; i++) {
                if (t[i].isAlive()) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                wait = false;
            }
        }
        System.out.println("End runMultipleThreads.");
    }

    public static ItemType createItem() {
        ItemType item = new ItemType();

        item.setListingType(ListingTypeCodeType.CHINESE);
        item.setCurrency(CurrencyCodeType.USD);
        item.setCountry(CountryCodeType.US);
        item.setPaymentMethods(new BuyerPaymentMethodCodeType[] {
            BuyerPaymentMethodCodeType.PAY_PAL });
        item.setPayPalEmailAddress("me@ebay.com");
        item.setRegionID("0");
        item.setListingDuration(ListingDurationCodeType.DAYS_3.value());
        // Title comes from thread name -- for tracking.. We use this later to ensure that each item added is from correct user.
        item.setTitle(Thread.currentThread().getName());
        item.setDescription("Listing by User ");
        item.setLocation("San Jose");
        item.setQuantity(new Integer(1));
        AmountType at = new AmountType();
        at.setValue(new Double("123").doubleValue());
        item.setStartPrice(at);

        CategoryType cat = new CategoryType();
        cat.setCategoryID("357");
        item.setPrimaryCategory(cat);

        //domestic shipping service must be specified
        item.setShippingDetails(PerformanceTest.getShippingDetails());

        //fill in mandatory fields
        //handling time
        item.setDispatchTimeMax(Integer.valueOf(1));
        //return policy
        ReturnPolicyType returnPolicy = new ReturnPolicyType();
        returnPolicy.setReturnsAcceptedOption("ReturnsAccepted");
        item.setReturnPolicy(returnPolicy);

        return item;
    }

    private static void executeCalls() {
        switch (testSuiteNumber) {
        case 1:
            addItem(apiContext);
            break;
        case 2:
            verifyAddItem(apiContext);
            break;
        case 3:
            getCategories(apiContext);
            break;
        case 4:
            getSellerList(apiContext);
            break;
        case 0:
        default:
            standardTest(apiContext);
            break;
        }

    }

    private static boolean createContext() throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        TestContext context = TestContext.getTestContext();
        boolean contextCreated = false;

        DialogAccount dlg = new DialogAccount(null, context.getApiContext(),
            "Config Test Context", true, false);
        GuiUtil.CenterComponent(dlg);
        dlg.setVisible(true);

        if (!dlg.isCancelled()) {
            PerformanceTest.apiContext = context.getApiContext();
            contextCreated = true;
        }

        return contextCreated;

    }

    private static void warmUp(ApiContext apiContext) throws Exception {
        if (threadWarmUp == 1) {
            GeteBayOfficialTimeCall apiCall = new GeteBayOfficialTimeCall(
                apiContext);
            apiCall.geteBayOfficialTime();
        }
    }

    private static void addItem(ApiContext apiContext) {
        try {
            warmUp(apiContext);
            // build the item from the class that defines it
            ItemType item = new ItemType();
            item = (new ItemNecklace()).buildItem();

            AddItemCall addItemCall = new AddItemCall(apiContext);
            DetailLevelCodeType[] dl = new DetailLevelCodeType[] {
                DetailLevelCodeType.RETURN_ALL };
            addItemCall.setDetailLevel(dl);
            addItemCall.setItem(item);
            addItemCall.addItem();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            MetricsLogger.collectMetrics(metrics);
        }
    }

    private static void getCategories(ApiContext apiContext) {
        try {
            warmUp(apiContext);

            GetCategoriesCall call = new GetCategoriesCall(apiContext);

            DetailLevelCodeType[] details = new DetailLevelCodeType[1];
            details[0] = DetailLevelCodeType.RETURN_ALL;
            call.setDetailLevel(details);
            call.setCategorySiteID(SiteCodeType.US);
            call.setViewAllNodes(true);

            call.getCategories();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            MetricsLogger.collectMetrics(metrics);
        }
    }

    private static void getSellerList(ApiContext apiContext) {
        try {
            warmUp(apiContext);

            GetSellerListCall call = new GetSellerListCall(apiContext);

            DetailLevelCodeType[] details = new DetailLevelCodeType[1];
            details[0] = DetailLevelCodeType.RETURN_ALL;
            call.setDetailLevel(details);

            // set start time from - yyyy mm dd 00:00:00
            Calendar startTimeFrom = new GregorianCalendar(2005,
                Calendar.DECEMBER, 15, 0, 0, 0);
            Calendar startTimeTo = new GregorianCalendar(2005,
                Calendar.DECEMBER, 22, 0, 0, 0);
            TimeFilter startTime = new TimeFilter(startTimeFrom, startTimeTo);
            call.setStartTimeFilter(startTime);

            // hard-coded - change sellers as needed
            String seller = "tuser2";
            call.setUserID(seller);

            // set pagination
            PaginationType pagination = new PaginationType();
            pagination.setEntriesPerPage(new Integer(10));
            pagination.setPageNumber(new Integer(1));
            call.setPagination(pagination);

            call.getSellerList();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            MetricsLogger.collectMetrics(metrics);
        }
    }

    private static void verifyAddItem(ApiContext apiContext) {
        try {
            warmUp(apiContext);

            // build the item from the class that defines it
            ItemType item = new ItemType();
            item = (new ItemMonopolyGame()).buildItem();

            // make the call and handle the response
            // get some performance timings along the way

            VerifyAddItemCall verifyAddItemCall = new VerifyAddItemCall(
                apiContext);
            verifyAddItemCall.verifyAddItem(item);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            MetricsLogger.collectMetrics(metrics);
        }
    }

    private static void standardTest(ApiContext apiContext) {
        try {
            warmUp(apiContext);
            ItemType newItem = createItem();

            AddItemCall addItemCall = new AddItemCall(apiContext);
            addItemCall.setItem(newItem);
            addItemCall.addItem();
            MetricsLogger.collectMetrics(metrics);

            String itemId = newItem.getItemID();

            GetItemCall getItemCall = new GetItemCall(apiContext);
            ItemType item = getItemCall.getItem(itemId);
            MetricsLogger.collectMetrics(metrics);

            ReviseItemCall reviseItemCall = new ReviseItemCall(apiContext);

            item = new ItemType();
            item.setItemID(itemId);
            item.setTitle("New Item Title");

            reviseItemCall.setItemToBeRevised(item);
            reviseItemCall.reviseItem();
            MetricsLogger.collectMetrics(metrics);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setupMetricLogging() {
        //System.setProperty("axis.ClientConfigFile", ".\\perf_test_client-config.wsdd");
        MetricsLogger.enableMetricsLogging();

    }

    public static ShippingDetailsType getShippingDetails() {
        // Shipping details.
        ShippingDetailsType sd = new ShippingDetailsType();
        SalesTaxType salesTax = new SalesTaxType();
        salesTax.setSalesTaxPercent(new Float(0.0825));
        salesTax.setSalesTaxState("CA");
        sd.setApplyShippingDiscount(new Boolean(true));
        AmountType at = new AmountType();
        at.setValue(2.8);
        sd.setPaymentInstructions("eBay Java SDK test instruction.");

        // Set calculated shipping.
        sd.setShippingType(ShippingTypeCodeType.FLAT);
        //
        ShippingServiceOptionsType st1 = new ShippingServiceOptionsType();
        st1.setShippingService(
            ShippingServiceCodeType.SHIPPING_METHOD_STANDARD.value());
        at = new AmountType();
        at.setValue(2.0);
        st1.setShippingServiceAdditionalCost(at);
        at = new AmountType();
        at.setValue(10);
        st1.setShippingServiceCost(at);
        st1.setShippingServicePriority(new Integer(1));

        ShippingServiceOptionsType st2 = new ShippingServiceOptionsType();
        st2.setExpeditedService(new Boolean(true));
        st2.setShippingService(
            ShippingServiceCodeType.SHIPPING_METHOD_EXPRESS.value());
        at = new AmountType();
        at.setValue(2.0);
        st2.setShippingServiceAdditionalCost(at);
        at = new AmountType();
        at.setValue(15);
        st2.setShippingServiceCost(at);
        st2.setShippingServicePriority(new Integer(2));
        sd.setShippingServiceOptions(
            new ShippingServiceOptionsType[] { st1, st2 });

        return sd;
    }

    public static void main(String[] args) {

        setupMetricLogging();

        try {
            boolean contextCreated = createContext();

            if (contextCreated) {
                String input = ConsoleUtil.readString(
                    "Enter test mode [0=one thread; 1=multiple threads]: ");
                int mode = Integer.parseInt(input);

                testSuiteNumber = ConsoleUtil.readInt(
                    "Testcase to run (0=standard; 1=AddItem; 2=verifyAddItem; 3=GetCategories; 4=GetSellerList): ");

                input = ConsoleUtil.readString("Enter times to run: ");
                int cnt = Integer.parseInt(input);

                threadWarmUp = ConsoleUtil.readInt(
                    "Thread warm-up (0=disable; 1=enable): ");

                for (int i = 0; i < cnt; i++) {
                    if (mode == 0) {
                        runOneThread();
                    } else {
                        runMultipleThreads();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            metrics.generateReport(System.out);
        }

    }
}
