package com.ebay.sdk.sanitytest.testcases;

import com.ebay.sdk.ApiException;
import com.ebay.sdk.SdkException;
import com.ebay.sdk.call.SetShippingDiscountProfilesCall;
import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.soap.eBLBaseComponents.AmountType;
import com.ebay.soap.eBLBaseComponents.CalculatedHandlingDiscountType;
import com.ebay.soap.eBLBaseComponents.CombinedPaymentPeriodCodeType;
import com.ebay.soap.eBLBaseComponents.CurrencyCodeType;
import com.ebay.soap.eBLBaseComponents.DiscountNameCodeType;
import com.ebay.soap.eBLBaseComponents.FlatShippingDiscountType;
import com.ebay.soap.eBLBaseComponents.HandlingNameCodeType;
import com.ebay.soap.eBLBaseComponents.InsuranceOptionCodeType;
import com.ebay.soap.eBLBaseComponents.ModifyActionCodeType;
import com.ebay.soap.eBLBaseComponents.SetShippingDiscountProfilesResponseType;
//import com.ebay.soap.eBLBaseComponents.ShippingInsuranceType; // commented out 01/02/2024

public class SetShippingDiscountProfiles extends SDKTestCase {
    public void testSetShippingDiscountProfiles() throws Exception {
        SetShippingDiscountProfilesCall shippingDiscountProfiles = new SetShippingDiscountProfilesCall(
            apiContext);
        shippingDiscountProfiles.setCurrencyID(CurrencyCodeType.USD);
        shippingDiscountProfiles.setCombinedDuration(
            CombinedPaymentPeriodCodeType.DAYS_14);
        shippingDiscountProfiles.setModifyActionCode(ModifyActionCodeType.ADD);
        CalculatedHandlingDiscountType handlingDiscount = new CalculatedHandlingDiscountType();
        handlingDiscount.setDiscountName(
            HandlingNameCodeType.INDIVIDUAL_HANDLING_FEE);
        AmountType amount = new AmountType();
        amount.setValue(123.45);
        handlingDiscount.setOrderHandlingAmount(amount);
        shippingDiscountProfiles.setCalculatedHandlingDiscount(
            handlingDiscount);
        FlatShippingDiscountType flatShippingDiscount = new FlatShippingDiscountType();
        flatShippingDiscount.setDiscountName(
            DiscountNameCodeType.INDIVIDUAL_ITEM_WEIGHT);
        shippingDiscountProfiles.setFlatShippingDiscount(flatShippingDiscount);

        //
        // ShippingInsuranceType insurType = new ShippingInsuranceType();
        //insurType.setInsuranceOption(InsuranceOptionCodeType.OPTIONAL);
        //shippingDiscountProfiles.setShippingInsurance(insurType);
        //shippingDiscountProfiles.setInternationalShippingInsurance(insurType);

        // commented out 01/02/2024

        try {
            shippingDiscountProfiles.setShippingDiscountProfiles();
        } catch (ApiException apie) {
            // got thru
        } catch (SdkException sdke) {
            fail(sdke.getMessage());
        }
    }
}
