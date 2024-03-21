package com.ebay.sdk.sanitytest.testcases;

import java.text.MessageFormat;

import com.ebay.sdk.call.AddFixedPriceItemCall;
import com.ebay.sdk.call.VerifyAddFixedPriceItemCall;

import com.ebay.sdk.sanitytest.SDKTestCase;
import com.ebay.sdk.sanitytest.TestData;
import com.ebay.sdk.util.eBayUtil;
import com.ebay.soap.eBLBaseComponents.AmountType;
import com.ebay.soap.eBLBaseComponents.BestOfferDetailsType;
import com.ebay.soap.eBLBaseComponents.BuyerPaymentMethodCodeType;
import com.ebay.soap.eBLBaseComponents.CategoryType;
import com.ebay.soap.eBLBaseComponents.CountryCodeType;
import com.ebay.soap.eBLBaseComponents.CurrencyCodeType;
import com.ebay.soap.eBLBaseComponents.FeesType;
import com.ebay.soap.eBLBaseComponents.GalleryTypeCodeType;
import com.ebay.soap.eBLBaseComponents.InsuranceOptionCodeType;
import com.ebay.soap.eBLBaseComponents.ItemType;
import com.ebay.soap.eBLBaseComponents.ListingDurationCodeType;
import com.ebay.soap.eBLBaseComponents.ListingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.PictureDetailsType;
import com.ebay.soap.eBLBaseComponents.PictureSourceCodeType;
import com.ebay.soap.eBLBaseComponents.ReturnPolicyType;
import com.ebay.soap.eBLBaseComponents.SalesTaxType;
import com.ebay.soap.eBLBaseComponents.ShippingDetailsType;
import com.ebay.soap.eBLBaseComponents.ShippingServiceCodeType;
import com.ebay.soap.eBLBaseComponents.ShippingServiceOptionsType;
import com.ebay.soap.eBLBaseComponents.ShippingTypeCodeType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;

public class AddFixedPriceItem extends SDKTestCase {

    public static ItemType buildItem() throws Exception {
        String t;

        ItemType item = new ItemType();

        item.setSite(SiteCodeType.US);
        item.setCurrency(CurrencyCodeType.USD);
        item.setListingType(ListingTypeCodeType.FIXED_PRICE_ITEM);

        t = MessageFormat.format("eBay SDK SanityTest {0} DO NOT BID!",
            new Object[] { eBayUtil.toAPITimeString(getTime()) });
        item.setTitle(t);

        item.setDescription(
            "This is a test item created by eBay SDK SanityTest.");

        AmountType at = new AmountType();
        at.setValue(1.01);
        item.setStartPrice(at);
        item.setListingDuration(ListingDurationCodeType.DAYS_7.value());
        item.setLocation("San Jose, CA");
        item.setCountry(CountryCodeType.US);

        BestOfferDetailsType bo = new BestOfferDetailsType();
        bo.setBestOfferEnabled(new Boolean(false));
        item.setBestOfferDetails(bo);

        CategoryType cat = new CategoryType();
        cat.setCategoryID("14111");
        item.setPrimaryCategory(cat);

        item.setQuantity(new Integer(1));

        // Payment
        BuyerPaymentMethodCodeType[] arrPaymentMethods = new BuyerPaymentMethodCodeType[] {
            BuyerPaymentMethodCodeType.PAY_PAL };
        item.setPaymentMethods(arrPaymentMethods);
        item.setPayPalEmailAddress("me@ebay.com");

        // Shipping range

        //item..setShippingOption(ShippingOptionCodeType.WorldWide);

        //
        item.setShippingDetails(getShippingDetails());

        //fill in mandatory fields
        item.setDispatchTimeMax(Integer.valueOf(1));
        ReturnPolicyType returnPolicy = new ReturnPolicyType();
        returnPolicy.setReturnsAcceptedOption("ReturnsAccepted");
        item.setReturnPolicy(returnPolicy);

        // Set item picture
        PictureDetailsType pictureDetails = new PictureDetailsType();
        String[] pictureUrls = new String[1];
        pictureUrls[0] = "http://pics.ebaystatic.com/aw/pics/navbar/eBayLogoTM.gif";
        pictureDetails.setPictureURL(pictureUrls);
        pictureDetails.setGalleryType(GalleryTypeCodeType.FEATURED);
        pictureDetails.setPictureSource(PictureSourceCodeType.EPS);
        item.setPictureDetails(pictureDetails);

        return item;
    }

    static ShippingDetailsType getShippingDetails() {
        // Shipping details.
        ShippingDetailsType sd = new ShippingDetailsType();

        SalesTaxType salesTax = new SalesTaxType();
        salesTax.setSalesTaxPercent(new Float(0.0825));
        salesTax.setSalesTaxState("CA");

        sd.setSalesTax(salesTax);

        sd.setApplyShippingDiscount(new Boolean(true));

        AmountType at = new AmountType();
        at.setValue(1.0);
        sd.setPaymentInstructions("eBay Java SDK test instruction.");
        sd.setShippingType(ShippingTypeCodeType.FLAT);

        //
        ShippingServiceOptionsType st1 = new ShippingServiceOptionsType();
        st1.setShippingService(ShippingServiceCodeType.USPS_PRIORITY.value());
        at = new AmountType();
        at.setValue(1.0);
        st1.setShippingServiceAdditionalCost(at);
        at = new AmountType();
        at.setValue(1);
        st1.setShippingServiceCost(at);
        st1.setShippingServicePriority(new Integer(1));
        at = new AmountType();
        at.setValue(1.0);
        st1.setShippingInsuranceCost(at);

        ShippingServiceOptionsType st2 = new ShippingServiceOptionsType();
        st2.setExpeditedService(new Boolean(true));
        st2.setShippingService(
            ShippingServiceCodeType.USPS_FIRST_CLASS.value());
        at = new AmountType();
        at.setValue(1.0);
        st2.setShippingServiceAdditionalCost(at);
        at = new AmountType();
        at.setValue(1);
        st2.setShippingServiceCost(at);
        st2.setShippingServicePriority(new Integer(2));
        at = new AmountType();
        at.setValue(1.0);
        st2.setShippingInsuranceCost(at);

        sd.setShippingServiceOptions(
            new ShippingServiceOptionsType[] { st1, st2 });

        return sd;
    }

    public void testAddFixedPriceItem() throws Exception {
        ItemType item = buildItem();
        VerifyAddFixedPriceItemCall verifyAddFixedPriceItemCall = new VerifyAddFixedPriceItemCall(
            apiContext);
        verifyAddFixedPriceItemCall.setItem(item);
        FeesType fees = verifyAddFixedPriceItemCall.verifyAddFixedPriceItem();

        assertNotNull(fees);

        AddFixedPriceItemCall addFixedPriceItemCall = new AddFixedPriceItemCall(
            apiContext);
        addFixedPriceItemCall.setItem(item);
        fees = addFixedPriceItemCall.addFixedPriceItem();

        assertNotNull(fees);

        if (TestData.NewFixedPriceItem != null) {
            this.endItem(TestData.NewFixedPriceItem.getItemID());
            TestData.NewFixedPriceItem = null;
        }
        TestData.NewFixedPriceItem = item;
    }

}
