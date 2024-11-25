
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureIDCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeatureIDCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ListingDurations"/>
 *     &lt;enumeration value="BestOfferEnabled"/>
 *     &lt;enumeration value="DutchBINEnabled"/>
 *     &lt;enumeration value="ShippingTermsRequired"/>
 *     &lt;enumeration value="UserConsentRequired"/>
 *     &lt;enumeration value="HomePageFeaturedEnabled"/>
 *     &lt;enumeration value="AdFormatEnabled"/>
 *     &lt;enumeration value="DigitalDeliveryEnabled"/>
 *     &lt;enumeration value="BestOfferCounterEnabled"/>
 *     &lt;enumeration value="BestOfferAutoDeclineEnabled"/>
 *     &lt;enumeration value="ProPack"/>
 *     &lt;enumeration value="BasicUpgradePack"/>
 *     &lt;enumeration value="ValuePack"/>
 *     &lt;enumeration value="ProPackPlus"/>
 *     &lt;enumeration value="LocalMarketSpecialitySubscription"/>
 *     &lt;enumeration value="LocalMarketRegularSubscription"/>
 *     &lt;enumeration value="LocalMarketPremiumSubscription"/>
 *     &lt;enumeration value="LocalMarketNonSubscription"/>
 *     &lt;enumeration value="ExpressEnabled"/>
 *     &lt;enumeration value="ExpressPicturesRequired"/>
 *     &lt;enumeration value="ExpressConditionRequired"/>
 *     &lt;enumeration value="SellerContactDetailsEnabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="MinimumReservePrice"/>
 *     &lt;enumeration value="TransactionConfirmationRequestEnabled"/>
 *     &lt;enumeration value="StoreInventoryEnabled"/>
 *     &lt;enumeration value="LocalListingDistances"/>
 *     &lt;enumeration value="SkypeMeTransactionalEnabled"/>
 *     &lt;enumeration value="SkypeMeNonTransactionalEnabled"/>
 *     &lt;enumeration value="ClassifiedAdPaymentMethodEnabled"/>
 *     &lt;enumeration value="ClassifiedAdShippingMethodEnabled"/>
 *     &lt;enumeration value="ClassifiedAdBestOfferEnabled"/>
 *     &lt;enumeration value="ClassifiedAdCounterOfferEnabled"/>
 *     &lt;enumeration value="ClassifiedAdAutoDeclineEnabled"/>
 *     &lt;enumeration value="ClassifiedAdContactByEmailEnabled"/>
 *     &lt;enumeration value="ClassifiedAdContactByPhoneEnabled"/>
 *     &lt;enumeration value="SafePaymentRequired"/>
 *     &lt;enumeration value="MaximumBestOffersAllowed"/>
 *     &lt;enumeration value="ClassifiedAdMaximumBestOffersAllowed"/>
 *     &lt;enumeration value="ClassifiedAdContactByEmailAvailable"/>
 *     &lt;enumeration value="ClassifiedAdPayPerLeadEnabled"/>
 *     &lt;enumeration value="ItemSpecificsEnabled"/>
 *     &lt;enumeration value="PaisaPayFullEscrowEnabled"/>
 *     &lt;enumeration value="ISBNIdentifierEnabled"/>
 *     &lt;enumeration value="UPCIdentifierEnabled"/>
 *     &lt;enumeration value="EANIdentifierEnabled"/>
 *     &lt;enumeration value="BrandMPNIdentifierEnabled"/>
 *     &lt;enumeration value="ClassifiedAdAutoAcceptEnabled"/>
 *     &lt;enumeration value="BestOfferAutoAcceptEnabled"/>
 *     &lt;enumeration value="CrossBorderTradeEnabled"/>
 *     &lt;enumeration value="PayPalBuyerProtectionEnabled"/>
 *     &lt;enumeration value="BuyerGuaranteeEnabled"/>
 *     &lt;enumeration value="INEscrowWorkflowTimeline"/>
 *     &lt;enumeration value="CombinedFixedPriceTreatment"/>
 *     &lt;enumeration value="GalleryFeaturedDurations"/>
 *     &lt;enumeration value="PayPalRequired"/>
 *     &lt;enumeration value="eBayMotorsProAdFormatEnabled"/>
 *     &lt;enumeration value="eBayMotorsProContactByPhoneEnabled"/>
 *     &lt;enumeration value="eBayMotorsProContactByAddressEnabled"/>
 *     &lt;enumeration value="eBayMotorsProCompanyNameEnabled"/>
 *     &lt;enumeration value="eBayMotorsProContactByEmailEnabled"/>
 *     &lt;enumeration value="eBayMotorsProBestOfferEnabled"/>
 *     &lt;enumeration value="eBayMotorsProAutoAcceptEnabled"/>
 *     &lt;enumeration value="eBayMotorsProAutoDeclineEnabled"/>
 *     &lt;enumeration value="eBayMotorsProPaymentMethodCheckOutEnabled"/>
 *     &lt;enumeration value="eBayMotorsProShippingMethodEnabled"/>
 *     &lt;enumeration value="eBayMotorsProCounterOfferEnabled"/>
 *     &lt;enumeration value="eBayMotorsProSellerContactDetailsEnabled"/>
 *     &lt;enumeration value="LocalMarketAdFormatEnabled"/>
 *     &lt;enumeration value="LocalMarketContactByPhoneEnabled"/>
 *     &lt;enumeration value="LocalMarketContactByAddressEnabled"/>
 *     &lt;enumeration value="LocalMarketCompanyNameEnabled"/>
 *     &lt;enumeration value="LocalMarketContactByEmailEnabled"/>
 *     &lt;enumeration value="LocalMarketBestOfferEnabled"/>
 *     &lt;enumeration value="LocalMarketAutoAcceptEnabled"/>
 *     &lt;enumeration value="LocalMarketAutoDeclineEnabled"/>
 *     &lt;enumeration value="LocalMarketPaymentMethodCheckOutEnabled"/>
 *     &lt;enumeration value="LocalMarketShippingMethodEnabled"/>
 *     &lt;enumeration value="LocalMarketCounterOfferEnabled"/>
 *     &lt;enumeration value="LocalMarketSellerContactDetailsEnabled"/>
 *     &lt;enumeration value="ClassifiedAdContactByAddressEnabled"/>
 *     &lt;enumeration value="ClassifiedAdCompanyNameEnabled"/>
 *     &lt;enumeration value="SpecialitySubscription"/>
 *     &lt;enumeration value="RegularSubscription"/>
 *     &lt;enumeration value="PremiumSubscription"/>
 *     &lt;enumeration value="NonSubscription"/>
 *     &lt;enumeration value="IntangibleEnabled"/>
 *     &lt;enumeration value="PayPalRequiredForStoreOwner"/>
 *     &lt;enumeration value="ReviseQuantityAllowed"/>
 *     &lt;enumeration value="RevisePriceAllowed"/>
 *     &lt;enumeration value="StoreOwnerExtendedListingDurationsEnabled"/>
 *     &lt;enumeration value="StoreOwnerExtendedListingDurations"/>
 *     &lt;enumeration value="ReturnPolicyEnabled"/>
 *     &lt;enumeration value="HandlingTimeEnabled"/>
 *     &lt;enumeration value="PaymentMethods"/>
 *     &lt;enumeration value="MaxFlatShippingCost"/>
 *     &lt;enumeration value="MaxFlatShippingCostCBTExempt"/>
 *     &lt;enumeration value="Group1MaxFlatShippingCost"/>
 *     &lt;enumeration value="Group2MaxFlatShippingCost"/>
 *     &lt;enumeration value="Group3MaxFlatShippingCost"/>
 *     &lt;enumeration value="VariationsEnabled"/>
 *     &lt;enumeration value="AttributeConversionEnabled"/>
 *     &lt;enumeration value="FreeGalleryPlusEnabled"/>
 *     &lt;enumeration value="FreePicturePackEnabled"/>
 *     &lt;enumeration value="CompatibilityEnabled"/>
 *     &lt;enumeration value="MinCompatibleApplications"/>
 *     &lt;enumeration value="MaxCompatibleApplications"/>
 *     &lt;enumeration value="ConditionEnabled"/>
 *     &lt;enumeration value="ConditionValues"/>
 *     &lt;enumeration value="ValueCategory"/>
 *     &lt;enumeration value="ProductCreationEnabled"/>
 *     &lt;enumeration value="EANEnabled"/>
 *     &lt;enumeration value="ISBNEnabled"/>
 *     &lt;enumeration value="UPCEnabled"/>
 *     &lt;enumeration value="MaxGranularFitmentCount"/>
 *     &lt;enumeration value="CompatibleVehicleType"/>
 *     &lt;enumeration value="PaymentOptionsGroup"/>
 *     &lt;enumeration value="ShippingProfileCategoryGroup"/>
 *     &lt;enumeration value="PaymentProfileCategoryGroup"/>
 *     &lt;enumeration value="ReturnPolicyProfileCategoryGroup"/>
 *     &lt;enumeration value="VINSupported"/>
 *     &lt;enumeration value="VRMSupported"/>
 *     &lt;enumeration value="SellerProvidedTitleSupported"/>
 *     &lt;enumeration value="DepositSupported"/>
 *     &lt;enumeration value="GlobalShippingEnabled"/>
 *     &lt;enumeration value="AdditionalCompatibilityEnabled"/>
 *     &lt;enumeration value="PickupDropOffEnabled"/>
 *     &lt;enumeration value="DigitalGoodDeliveryEnabled"/>
 *     &lt;enumeration value="EpidSupported"/>
 *     &lt;enumeration value="KTypeSupported"/>
 *     &lt;enumeration value="ProductRequiredEnabled"/>
 *     &lt;enumeration value="DomesticReturnsAcceptedValues"/>
 *     &lt;enumeration value="InternationalReturnsAcceptedValues"/>
 *     &lt;enumeration value="DomesticReturnsDurationValues"/>
 *     &lt;enumeration value="InternationalReturnsDurationValues"/>
 *     &lt;enumeration value="DomesticReturnsShipmentPayeeValues"/>
 *     &lt;enumeration value="InternationalReturnsShipmentPayeeValues"/>
 *     &lt;enumeration value="DomesticRefundMethodValues"/>
 *     &lt;enumeration value="InternationalRefundMethodValues"/>
 *     &lt;enumeration value="ReturnPolicyDescriptionEnabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FeatureIDCodeType")
@XmlEnum
public enum FeatureIDCodeType {


    /**
     * 
     * 						If this value is specified, supported site-default and category-specific listing durations values for each listing type are returned in the <b>SiteDefaults.ListingDuration</b> and <b>Category.ListingDuration</b> fields of the <b>GetCategoryFeatures</b> response.
     * 					
     * 
     */
    @XmlEnumValue("ListingDurations")
    LISTING_DURATIONS("ListingDurations"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.BestOfferEnabled</b> and <b>Category.BestOfferEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site supports the Best Offer feature, and which categories allow the Best Offer feature.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferEnabled")
    BEST_OFFER_ENABLED("BestOfferEnabled"),

    /**
     * 
     * 						This value is <b>deprecated</b>, as Dutch-style auctions are no longer available on any eBay sites.
     * 					
     * 
     */
    @XmlEnumValue("DutchBINEnabled")
    DUTCH_BIN_ENABLED("DutchBINEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ShippingTermsRequired</b> and <b>Category.ShippingTermsRequired</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site, and individual categories on that site, require at least one domestic shipping service option (with cost) to be specified before an item is listed.
     * 					
     * 
     */
    @XmlEnumValue("ShippingTermsRequired")
    SHIPPING_TERMS_REQUIRED("ShippingTermsRequired"),

    /**
     * 
     * 						This value is deprecated and should not be used.
     * 					
     * 
     */
    @XmlEnumValue("UserConsentRequired")
    USER_CONSENT_REQUIRED("UserConsentRequired"),

    /**
     * 
     * 						The feature associated with this value is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					
     * 
     */
    @XmlEnumValue("HomePageFeaturedEnabled")
    HOME_PAGE_FEATURED_ENABLED("HomePageFeaturedEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.AdFormatEnabled</b> and <b>Category.AdFormatEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("AdFormatEnabled")
    AD_FORMAT_ENABLED("AdFormatEnabled"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("DigitalDeliveryEnabled")
    DIGITAL_DELIVERY_ENABLED("DigitalDeliveryEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.BestOfferCounterEnabled</b> and <b>Category.BestOfferCounterEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site supports the Best Offer counter offers, and which categories allow the Best Offer counter offers.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferCounterEnabled")
    BEST_OFFER_COUNTER_ENABLED("BestOfferCounterEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.BestOfferAutoDeclineEnabled</b> and <b>Category.BestOfferAutoDeclineEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer auto decline feature. With the Best Offer auto decline feature, the seller sets a price threshold, and all Best Offers and counter offers below this price value are automatically declined without any seller action.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferAutoDeclineEnabled")
    BEST_OFFER_AUTO_DECLINE_ENABLED("BestOfferAutoDeclineEnabled"),

    /**
     * 
     * 						The feature associated with this value is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					
     * 
     */
    @XmlEnumValue("ProPack")
    PRO_PACK("ProPack"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("BasicUpgradePack")
    BASIC_UPGRADE_PACK("BasicUpgradePack"),

    /**
     * 
     * 						The feature associated with this value is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					
     * 
     */
    @XmlEnumValue("ValuePack")
    VALUE_PACK("ValuePack"),

    /**
     * 
     * 						The feature associated with this value is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					
     * 
     */
    @XmlEnumValue("ProPackPlus")
    PRO_PACK_PLUS("ProPackPlus"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketSpecialitySubscription</b> boolean field in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site supports Local Market listings for sellers with a specialty subscription to Local Market for Vehicles.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketSpecialitySubscription")
    LOCAL_MARKET_SPECIALITY_SUBSCRIPTION("LocalMarketSpecialitySubscription"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketRegularSubscription</b> boolean field in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site supports Local Market listings for sellers with a regular subscription to Local Market for Vehicles.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketRegularSubscription")
    LOCAL_MARKET_REGULAR_SUBSCRIPTION("LocalMarketRegularSubscription"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketPremiumSubscription</b> boolean field in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site supports Local Market listings for sellers with a premium subscription to Local Market for Vehicles.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketPremiumSubscription")
    LOCAL_MARKET_PREMIUM_SUBSCRIPTION("LocalMarketPremiumSubscription"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketNonSubscription</b> boolean field in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site supports Local Market listings for sellers without a subscription to Local Market for Vehicles.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketNonSubscription")
    LOCAL_MARKET_NON_SUBSCRIPTION("LocalMarketNonSubscription"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("ExpressEnabled")
    EXPRESS_ENABLED("ExpressEnabled"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("ExpressPicturesRequired")
    EXPRESS_PICTURES_REQUIRED("ExpressPicturesRequired"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("ExpressConditionRequired")
    EXPRESS_CONDITION_REQUIRED("ExpressConditionRequired"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.SellerContactDetailsEnabled</b> and <b>Category.SellerContactDetailsEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow the seller to provide contact information within a Classified Ad listing. This feature is only applicable to Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("SellerContactDetailsEnabled")
    SELLER_CONTACT_DETAILS_ENABLED("SellerContactDetailsEnabled"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.MinimumReservePrice</b> and <b>Category.MinimumReservePrice</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories require a minimum Reserve Price for auction listings. This feature is only applicable to Auction listings and only if the seller decides to set a Reserve Price for the auction.
     * 					
     * 
     */
    @XmlEnumValue("MinimumReservePrice")
    MINIMUM_RESERVE_PRICE("MinimumReservePrice"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("TransactionConfirmationRequestEnabled")
    TRANSACTION_CONFIRMATION_REQUEST_ENABLED("TransactionConfirmationRequestEnabled"),

    /**
     * 
     * 					This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("StoreInventoryEnabled")
    STORE_INVENTORY_ENABLED("StoreInventoryEnabled"),

    /**
     * 
     * 						If this value is specified, the integer values in the <b>LocalListingDistancesRegular</b>, <b>LocalListingDistancesSpecialty</b>, and <b>LocalListingDistancesNonSubscription</b> fields in the <b>GetCategoryFeatures</b> response will indicate the radius (in miles) of the selling area for Local Market Vehicle listings, based on Local Market subscription status of the motor vehicle seller (specialty subscription, regular subscription, or no subscription).
     * 					
     * 
     */
    @XmlEnumValue("LocalListingDistances")
    LOCAL_LISTING_DISTANCES("LocalListingDistances"),

    /**
     * 
     * 						This enumeration value is no longer applicable, as Skype communication between eBay members is no longer supported.
     * 					
     * 
     */
    @XmlEnumValue("SkypeMeTransactionalEnabled")
    SKYPE_ME_TRANSACTIONAL_ENABLED("SkypeMeTransactionalEnabled"),

    /**
     * 
     * 						This enumeration value is no longer applicable, as Skype communication between eBay members is no longer supported.
     * 					
     * 
     */
    @XmlEnumValue("SkypeMeNonTransactionalEnabled")
    SKYPE_ME_NON_TRANSACTIONAL_ENABLED("SkypeMeNonTransactionalEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ClassifiedAdPaymentMethodEnabled</b> and <b>Category.ClassifiedAdPaymentMethodEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not (and when) accepted payment methods are displayed to buyers for the specified eBay site and for individual categories. This feature is only applicable for Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdPaymentMethodEnabled")
    CLASSIFIED_AD_PAYMENT_METHOD_ENABLED("ClassifiedAdPaymentMethodEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ClassifiedAdShippingMethodEnabled</b> and <b>Category.ClassifiedAdShippingMethodEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the display of available shipping methods to buyers. This feature is only applicable for Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdShippingMethodEnabled")
    CLASSIFIED_AD_SHIPPING_METHOD_ENABLED("ClassifiedAdShippingMethodEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ClassifiedAdBestOfferEnabled</b> and <b>Category.ClassifiedAdBestOfferEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer feature for Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdBestOfferEnabled")
    CLASSIFIED_AD_BEST_OFFER_ENABLED("ClassifiedAdBestOfferEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ClassifiedAdCounterOfferEnabled</b> and <b>Category.ClassifiedAdCounterOfferEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support Best Offer counter offers for Classified Ad listings. This feature is only applicable for Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdCounterOfferEnabled")
    CLASSIFIED_AD_COUNTER_OFFER_ENABLED("ClassifiedAdCounterOfferEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ClassifiedAdAutoDeclineEnabled</b> and <b>Category.ClassifiedAdAutoDeclineEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer auto decline feature for Classified Ad listings. With the Best Offer auto decline feature, the seller sets a price threshold, and all Best Offers and counter offers below this price value are automatically declined without any seller action. This feature is only applicable for Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdAutoDeclineEnabled")
    CLASSIFIED_AD_AUTO_DECLINE_ENABLED("ClassifiedAdAutoDeclineEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ClassifiedAdContactByEmailEnabled</b> and <b>Category.ClassifiedAdContactByEmailEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow the seller to provide a contact email address within a Classified Ad listing. This feature is only applicable to Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdContactByEmailEnabled")
    CLASSIFIED_AD_CONTACT_BY_EMAIL_ENABLED("ClassifiedAdContactByEmailEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ClassifiedAdContactByPhoneEnabled</b> and <b>Category.ClassifiedAdContactByPhoneEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow the seller to provide a contact phone number within a Classified Ad listing. This feature is only applicable to Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdContactByPhoneEnabled")
    CLASSIFIED_AD_CONTACT_BY_PHONE_ENABLED("ClassifiedAdContactByPhoneEnabled"),

    /**
     * 
     * 						This value is deprecated and should not be used.
     * 					
     * 
     */
    @XmlEnumValue("SafePaymentRequired")
    SAFE_PAYMENT_REQUIRED("SafePaymentRequired"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("MaximumBestOffersAllowed")
    MAXIMUM_BEST_OFFERS_ALLOWED("MaximumBestOffersAllowed"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdMaximumBestOffersAllowed")
    CLASSIFIED_AD_MAXIMUM_BEST_OFFERS_ALLOWED("ClassifiedAdMaximumBestOffersAllowed"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used. To verify if the seller's contact information can be shared with prospective buyers in the listing, use the <b>SellerContactDetailsEnabled</b> enumeration value instead.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdContactByEmailAvailable")
    CLASSIFIED_AD_CONTACT_BY_EMAIL_AVAILABLE("ClassifiedAdContactByEmailAvailable"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdPayPerLeadEnabled")
    CLASSIFIED_AD_PAY_PER_LEAD_ENABLED("ClassifiedAdPayPerLeadEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ItemSpecificsEnabled</b> and <b>Category.ItemSpecificsEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate if the eBay site and individual categories support the use of Item Specifics in listings.
     * 					
     * 
     */
    @XmlEnumValue("ItemSpecificsEnabled")
    ITEM_SPECIFICS_ENABLED("ItemSpecificsEnabled"),

    /**
     * 
     * 						This value is deprecated and should not be used.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayFullEscrowEnabled")
    PAISA_PAY_FULL_ESCROW_ENABLED("PaisaPayFullEscrowEnabled"),

    /**
     * 
     * 						This value is deprecated and should no longer be used. Use <b>ISBNEnabled</b> instead.
     * 					
     * 
     */
    @XmlEnumValue("ISBNIdentifierEnabled")
    ISBN_IDENTIFIER_ENABLED("ISBNIdentifierEnabled"),

    /**
     * 
     * 						This value is deprecated and should no longer be used. Use <b>UPCEnabled</b> instead.
     * 					
     * 
     */
    @XmlEnumValue("UPCIdentifierEnabled")
    UPC_IDENTIFIER_ENABLED("UPCIdentifierEnabled"),

    /**
     * 
     * 						This value is deprecated and should no longer be used. Use <b>EANEnabled</b> instead.
     * 					
     * 
     */
    @XmlEnumValue("EANIdentifierEnabled")
    EAN_IDENTIFIER_ENABLED("EANIdentifierEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>Category.BrandMPNIdentifierEnabled</b> boolean field in the <b>GetCategoryFeatures</b> response will indicate whether or not individual categories on the specified site support the ability of a seller to identify a product through a Brand/Manufacturer Part Number (MPN) combination.
     * 					
     * 
     */
    @XmlEnumValue("BrandMPNIdentifierEnabled")
    BRAND_MPN_IDENTIFIER_ENABLED("BrandMPNIdentifierEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ClassifiedAdAutoAcceptEnabled</b> and <b>Category.ClassifiedAdAutoAcceptEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer auto accept feature for Classified Ad listings. With the Best Offer auto accept feature, the seller sets a price threshold, and all Best Offers and counter offers at or above this price value are automatically accepted without any seller action. This feature is only applicable for Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdAutoAcceptEnabled")
    CLASSIFIED_AD_AUTO_ACCEPT_ENABLED("ClassifiedAdAutoAcceptEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.BestOfferAutoAcceptEnabled</b> and <b>Category.BestOfferAutoAcceptEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer auto accept feature. With the Best Offer auto accept feature, the seller sets a price threshold, and all Best Offers and counter offers at or above this price value are automatically accepted without any seller action.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferAutoAcceptEnabled")
    BEST_OFFER_AUTO_ACCEPT_ENABLED("BestOfferAutoAcceptEnabled"),

    /**
     * 
     * 							If this value is specified, the <b>CrossBorderTradeNorthAmericaEnabled</b>, <b>CrossBorderTradeGBEnabled</b>, and <b>CrossBorderTradeAustraliaEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the International Site Visibility (Cross-Border Trade) feature, and on which sites. With the International Site Visibility feature, the seller is able to create a listing and make this listing available on multiple eBay sites (not just their domestic eBay site).
     * 						
     * 
     */
    @XmlEnumValue("CrossBorderTradeEnabled")
    CROSS_BORDER_TRADE_ENABLED("CrossBorderTradeEnabled"),

    /**
     * 
     * 						This value is deprecated and should not be used.
     * 					
     * 
     */
    @XmlEnumValue("PayPalBuyerProtectionEnabled")
    PAY_PAL_BUYER_PROTECTION_ENABLED("PayPalBuyerProtectionEnabled"),

    /**
     * 
     * 						This value is deprecated and should not be used.
     * 					
     * 
     */
    @XmlEnumValue("BuyerGuaranteeEnabled")
    BUYER_GUARANTEE_ENABLED("BuyerGuaranteeEnabled"),

    /**
     * 
     * 						This value is deprecated since it is only applicable to the eBay India site, and this marketplace is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("INEscrowWorkflowTimeline")
    IN_ESCROW_WORKFLOW_TIMELINE("INEscrowWorkflowTimeline"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("CombinedFixedPriceTreatment")
    COMBINED_FIXED_PRICE_TREATMENT("CombinedFixedPriceTreatment"),

    /**
     * 
     * 						The Featured Gallery feature is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					
     * 
     */
    @XmlEnumValue("GalleryFeaturedDurations")
    GALLERY_FEATURED_DURATIONS("GalleryFeaturedDurations"),

    /**
     * 
     * 						This value is deprecated and should not be used.
     * 					
     * 
     */
    @XmlEnumValue("PayPalRequired")
    PAY_PAL_REQUIRED("PayPalRequired"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProAdFormatEnabled</b> and <b>Category.eBayMotorsProAdFormatEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow motor vehicles to be sold through Classified Ads. This value is only applicable for eBay Motors Pro users.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProAdFormatEnabled")
    E_BAY_MOTORS_PRO_AD_FORMAT_ENABLED("eBayMotorsProAdFormatEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProContactByPhoneEnabled</b> and <b>Category.eBayMotorsProContactByPhoneEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow eBay Motors Pro users to provide contact phone numbers within a Motor Vehicles Classified Ad listing. The <b>Category.eBayMotorsProPhoneCount</b> field indicates how many contact phone numbers are supported in each listing. This feature is only applicable to Motor Vehicles Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProContactByPhoneEnabled")
    E_BAY_MOTORS_PRO_CONTACT_BY_PHONE_ENABLED("eBayMotorsProContactByPhoneEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProContactByAddressEnabled</b> and <b>Category.eBayMotorsProContactByAddressEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow eBay Motors Pro users to provide contact street addresses within a Motor Vehicles Classified Ad listing. The <b>Category.eBayMotorsProStreetCount</b> field indicates how many contact street addresses are supported in each listing. This feature is only applicable to Motor Vehicles Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProContactByAddressEnabled")
    E_BAY_MOTORS_PRO_CONTACT_BY_ADDRESS_ENABLED("eBayMotorsProContactByAddressEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProCompanyNameEnabled</b> and <b>Category.eBayMotorsProCompanyNameEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow eBay Motors Pro users to provide a company name within a Motor Vehicles Classified Ad listing. This feature is only applicable to Motor Vehicles Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProCompanyNameEnabled")
    E_BAY_MOTORS_PRO_COMPANY_NAME_ENABLED("eBayMotorsProCompanyNameEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProContactByEmailEnabled</b> and <b>Category.eBayMotorsProContactByEmailEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow eBay Motors Pro users to provide a contact email address within a Motor Vehicles Classified Ad listing. This feature is only applicable to Motor Vehicles Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProContactByEmailEnabled")
    E_BAY_MOTORS_PRO_CONTACT_BY_EMAIL_ENABLED("eBayMotorsProContactByEmailEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProBestOfferEnabled</b> and <b>Category.eBayMotorsProBestOfferEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer feature for Motor Vehicles Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProBestOfferEnabled")
    E_BAY_MOTORS_PRO_BEST_OFFER_ENABLED("eBayMotorsProBestOfferEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProAutoAcceptEnabled</b> and <b>Category.eBayMotorsProAutoAcceptEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer auto accept feature for Motor Vehicles Classified Ad listings. With the Best Offer auto accept feature, the seller sets a price threshold, and all Best Offers and counter offers at or above this price value are automatically accepted without any seller action. This feature is only applicable for Motor Vehicles Classified Ad listings, and is only available to eBay Motors Pro users.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProAutoAcceptEnabled")
    E_BAY_MOTORS_PRO_AUTO_ACCEPT_ENABLED("eBayMotorsProAutoAcceptEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProAutoDeclineEnabled</b> and <b>Category.eBayMotorsProAutoDeclineEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer auto decline feature for Motor Vehicles Classified Ad listings. With the Best Offer auto decline feature, the seller sets a price threshold, and all Best Offers and counter offers below this price value are automatically declined without any seller action. This feature is only applicable for Motor Vehicles Classified Ad listings, and is only available to eBay Motors Pro users.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProAutoDeclineEnabled")
    E_BAY_MOTORS_PRO_AUTO_DECLINE_ENABLED("eBayMotorsProAutoDeclineEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProPaymentMethodCheckOutEnabled</b> and <b>Category.eBayMotorsProPaymentMethodCheckOutEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not (and when) accepted payment methods are displayed to buyers for the specified eBay site and for individual categories. This feature is only applicable for Motor Vehicles Classified Ad listings, and is only available to eBay Motors Pro users.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProPaymentMethodCheckOutEnabled")
    E_BAY_MOTORS_PRO_PAYMENT_METHOD_CHECK_OUT_ENABLED("eBayMotorsProPaymentMethodCheckOutEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProShippingMethodEnabled</b> and <b>Category.eBayMotorsProShippingMethodEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the display of available shipping methods to buyers. This feature is only applicable for Motor Vehicles Classified Ad listings, and is only available to eBay Motors Pro users.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProShippingMethodEnabled")
    E_BAY_MOTORS_PRO_SHIPPING_METHOD_ENABLED("eBayMotorsProShippingMethodEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProCounterOfferEnabled</b> and <b>Category.eBayMotorsProCounterOfferEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support Best Offer counter offers for Motor Vehicles Classified Ad listings. This feature is only applicable for Motor Vehicles Classified Ad listings, and is only available to eBay Motors Pro users.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProCounterOfferEnabled")
    E_BAY_MOTORS_PRO_COUNTER_OFFER_ENABLED("eBayMotorsProCounterOfferEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.eBayMotorsProSellerContactDetailsEnabled</b> and <b>Category.eBayMotorsProSellerContactDetailsEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow the seller to provide contact information within a Motor Vehicles Classified Ad listing. This feature is only applicable for Motor Vehicles Classified Ad listings, and is only available to eBay Motors Pro users.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProSellerContactDetailsEnabled")
    E_BAY_MOTORS_PRO_SELLER_CONTACT_DETAILS_ENABLED("eBayMotorsProSellerContactDetailsEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketAdFormatEnabled</b> and <b>Category.LocalMarketAdFormatEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow motor vehicles to be sold through Local Market Classified Ads. Motors Local Market listings are only available to eBay sellers who are Licensed Vehicle Dealers on eBay.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketAdFormatEnabled")
    LOCAL_MARKET_AD_FORMAT_ENABLED("LocalMarketAdFormatEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketContactByPhoneEnabled</b> and <b>Category.LocalMarketContactByPhoneEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow eBay Licensed Vehicle Dealers to provide contact phone numbers within a Motors Local Market listing. The <b>Category.LocalMarketPhoneCount</b> field indicates how many contact phone numbers are supported in each listing. This feature is only applicable to Motors Local Market listings.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketContactByPhoneEnabled")
    LOCAL_MARKET_CONTACT_BY_PHONE_ENABLED("LocalMarketContactByPhoneEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketContactByAddressEnabled</b> and <b>Category.LocalMarketContactByAddressEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow eBay Licensed Vehicle Dealers to provide contact street addresses within a Motors Local Market listing. This feature is only applicable to Motors Local Market listings.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketContactByAddressEnabled")
    LOCAL_MARKET_CONTACT_BY_ADDRESS_ENABLED("LocalMarketContactByAddressEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketCompanyNameEnabled</b> and <b>Category.LocalMarketCompanyNameEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow eBay Licensed Vehicle Dealers to provide a company name within a Motors Local Market listing. This feature is only applicable to Motors Local Market listings.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketCompanyNameEnabled")
    LOCAL_MARKET_COMPANY_NAME_ENABLED("LocalMarketCompanyNameEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketContactByEmailEnabled</b> and <b>Category.LocalMarketContactByEmailEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow eBay Licensed Vehicle Dealers to provide contact email addresses within a Motors Local Market listing. This feature is only applicable to Motors Local Market listings.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketContactByEmailEnabled")
    LOCAL_MARKET_CONTACT_BY_EMAIL_ENABLED("LocalMarketContactByEmailEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketBestOfferEnabled</b> and <b>Category.LocalMarketBestOfferEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer feature for Motors Local Market listings.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketBestOfferEnabled")
    LOCAL_MARKET_BEST_OFFER_ENABLED("LocalMarketBestOfferEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketAutoAcceptEnabled</b> and <b>Category.LocalMarketAutoAcceptEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer auto accept feature for Motors Local Market listings. With the Best Offer auto accept feature, the seller sets a price threshold, and all Best Offers and counter offers at or above this price value are automatically accepted without any seller action. This feature is only applicable for Motors Local Market listings, and is only available to eBay Licensed Vehicle Dealers.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketAutoAcceptEnabled")
    LOCAL_MARKET_AUTO_ACCEPT_ENABLED("LocalMarketAutoAcceptEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketAutoDeclineEnabled</b> and <b>Category.LocalMarketAutoDeclineEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Best Offer auto decline feature for Motors Local Market listings. With the Best Offer auto decline feature, the seller sets a price threshold, and all Best Offers and counter offers below this price value are automatically declined without any seller action. This feature is only applicable for Motors Local Market listings, and is only available to eBay Licensed Vehicle Dealers.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketAutoDeclineEnabled")
    LOCAL_MARKET_AUTO_DECLINE_ENABLED("LocalMarketAutoDeclineEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketPaymentMethodCheckOutEnabled</b> and <b>Category.LocalMarketPaymentMethodCheckOutEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not (and when) accepted payment methods are displayed to buyers for the specified eBay site and for individual categories. This feature is only applicable for Motors Local Market listings, and is only available to eBay Licensed Vehicle Dealers.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketPaymentMethodCheckOutEnabled")
    LOCAL_MARKET_PAYMENT_METHOD_CHECK_OUT_ENABLED("LocalMarketPaymentMethodCheckOutEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketShippingMethodEnabled</b> and <b>Category.LocalMarketShippingMethodEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the display of available shipping methods to buyers. This feature is only applicable for Motors Local Market listings, and is only available to eBay Licensed Vehicle Dealers.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketShippingMethodEnabled")
    LOCAL_MARKET_SHIPPING_METHOD_ENABLED("LocalMarketShippingMethodEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketCounterOfferEnabled</b> and <b>Category.LocalMarketCounterOfferEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support Best Offer counter offers for Motors Local Market listings. This feature is only applicable for Motors Local Market listings, and is only available to eBay Licensed Vehicle Dealers.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketCounterOfferEnabled")
    LOCAL_MARKET_COUNTER_OFFER_ENABLED("LocalMarketCounterOfferEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.LocalMarketSellerContactDetailsEnabled</b> and <b>Category.LocalMarketSellerContactDetailsEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow the seller to provide contact information within a Motors Local Market listing. This feature is only applicable for Motors Local Market listings, and is only available to eBay Licensed Vehicle Dealers.
     * 					
     * 
     */
    @XmlEnumValue("LocalMarketSellerContactDetailsEnabled")
    LOCAL_MARKET_SELLER_CONTACT_DETAILS_ENABLED("LocalMarketSellerContactDetailsEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ClassifiedAdContactByAddressEnabled</b> and <b>Category.ClassifiedAdContactByAddressEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow sellers to provide contact street addresses within a Classified Ad listing. The <b>Category.ClassifiedAdStreetCount</b> field indicates how many street addresses are allowed in each listing. This feature is only applicable to Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdContactByAddressEnabled")
    CLASSIFIED_AD_CONTACT_BY_ADDRESS_ENABLED("ClassifiedAdContactByAddressEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ClassifiedAdCompanyNameEnabled</b> and <b>Category.ClassifiedAdCompanyNameEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow sellers to provide a company name within a Classified Ad listing. This feature is only applicable to Classified Ad listings.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdCompanyNameEnabled")
    CLASSIFIED_AD_COMPANY_NAME_ENABLED("ClassifiedAdCompanyNameEnabled"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("SpecialitySubscription")
    SPECIALITY_SUBSCRIPTION("SpecialitySubscription"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("RegularSubscription")
    REGULAR_SUBSCRIPTION("RegularSubscription"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("PremiumSubscription")
    PREMIUM_SUBSCRIPTION("PremiumSubscription"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("NonSubscription")
    NON_SUBSCRIPTION("NonSubscription"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("IntangibleEnabled")
    INTANGIBLE_ENABLED("IntangibleEnabled"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("PayPalRequiredForStoreOwner")
    PAY_PAL_REQUIRED_FOR_STORE_OWNER("PayPalRequiredForStoreOwner"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ReviseQuantityAllowed</b> and <b>Category.ReviseQuantityAllowed</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow sellers to revise quantity in a multi-quantity, fixed-price listing while the listing is in a semi- or fully-restricted mode (such as when the listing already has sales or when the listing is scheduled to end within 12 hours). This value is only applicable to fixed-price listings.
     * 					
     * 
     */
    @XmlEnumValue("ReviseQuantityAllowed")
    REVISE_QUANTITY_ALLOWED("ReviseQuantityAllowed"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.RevisePriceAllowed</b> and <b>Category.RevisePriceAllowed</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow sellers to revise the price in a fixed-price listing while the listing is in a semi- or fully-restricted mode (such as when the listing already has sales or when the listing is scheduled to end within 12 hours). This value is only applicable to fixed-price listings.
     * 					
     * 
     */
    @XmlEnumValue("RevisePriceAllowed")
    REVISE_PRICE_ALLOWED("RevisePriceAllowed"),

    /**
     * 
     * 						The feature associated with this value is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					
     * 
     */
    @XmlEnumValue("StoreOwnerExtendedListingDurationsEnabled")
    STORE_OWNER_EXTENDED_LISTING_DURATIONS_ENABLED("StoreOwnerExtendedListingDurationsEnabled"),

    /**
     * 
     * 						The feature associated with this value is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					
     * 
     */
    @XmlEnumValue("StoreOwnerExtendedListingDurations")
    STORE_OWNER_EXTENDED_LISTING_DURATIONS("StoreOwnerExtendedListingDurations"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ReturnPolicyEnabled</b> and <b>Category.ReturnPolicyEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories allow eBay sellers to create a return policy for the listing.
     * 					
     * 
     */
    @XmlEnumValue("ReturnPolicyEnabled")
    RETURN_POLICY_ENABLED("ReturnPolicyEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.HandlingTimeEnabled</b> and <b>Category.HandlingTimeEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories require eBay sellers to set a handling time for products sold within the listing. The handling time is the maximum number of business days the seller commits to for preparing an item to be shipped after receiving a cleared payment. The seller's handling time does not include the shipping time (the carrier's transit time).
     * 					
     * 
     */
    @XmlEnumValue("HandlingTimeEnabled")
    HANDLING_TIME_ENABLED("HandlingTimeEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.PaymentMethod</b> and <b>SiteDefaults.PaymentMethod</b> fields in the <b>GetCategoryFeatures</b> response will indicate the accepted payment methods at the eBay site level and within the individual categories.
     * 					
     * 
     */
    @XmlEnumValue("PaymentMethods")
    PAYMENT_METHODS("PaymentMethods"),

    /**
     * 
     * 						If this value is specified, the <b>Category.MaxFlatShippingCost</b> fields in the <b>GetCategoryFeatures</b> response will indicate the maximum flat-rate shipping costs that the seller may charge the buyer to ship one item domestically. At least one available shipping service option has to be under this value. Handling cost (if any) goes toward this maximum cost threshold.
     * 					
     * 
     */
    @XmlEnumValue("MaxFlatShippingCost")
    MAX_FLAT_SHIPPING_COST("MaxFlatShippingCost"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.MaxFlatShippingCostCBTExempt</b> boolean field in the <b>GetCategoryFeatures</b> response will indicate whether or not sellers, who sell items to domestic buyers, but are shipping the item from another country, are exempt from the <b>MaxFlatShippingCost</b> threshold.
     * 					
     * 
     */
    @XmlEnumValue("MaxFlatShippingCostCBTExempt")
    MAX_FLAT_SHIPPING_COST_CBT_EXEMPT("MaxFlatShippingCostCBTExempt"),

    /**
     * 
     * 						The feature associated with this value is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					
     * 
     */
    @XmlEnumValue("Group1MaxFlatShippingCost")
    GROUP_1_MAX_FLAT_SHIPPING_COST("Group1MaxFlatShippingCost"),

    /**
     * 
     * 						The feature associated with this value is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					 
     * 
     */
    @XmlEnumValue("Group2MaxFlatShippingCost")
    GROUP_2_MAX_FLAT_SHIPPING_COST("Group2MaxFlatShippingCost"),

    /**
     * 
     * 						The feature associated with this value is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					
     * 
     */
    @XmlEnumValue("Group3MaxFlatShippingCost")
    GROUP_3_MAX_FLAT_SHIPPING_COST("Group3MaxFlatShippingCost"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.VariationsEnabled</b> and <b>Category.VariationsEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support multi-variation listings. Variations are items within the same listing that are logically the same product, but differ slightly in size, color, or other aspect.
     * 					
     * 
     */
    @XmlEnumValue("VariationsEnabled")
    VARIATIONS_ENABLED("VariationsEnabled"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("AttributeConversionEnabled")
    ATTRIBUTE_CONVERSION_ENABLED("AttributeConversionEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.FreeGalleryPlusEnabled</b> and <b>Category.FreeGalleryPlusEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support a free Gallery Plus upgrade. The Gallery Plus feature includes the picture zoom-in option (when you hover the mouse over the picture) and the ability to enlarge the photo by clicking a link.
     * 					
     * 
     */
    @XmlEnumValue("FreeGalleryPlusEnabled")
    FREE_GALLERY_PLUS_ENABLED("FreeGalleryPlusEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.FreePicturePackEnabled</b> and <b>Category.FreePicturePackEnabled</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support a free Picture Pack upgrade. The Picture Pack feature is only available for eBay Motors vehicle listings. The Picture Pack feature includes up to 12 supersized photos with the zoom-in feature enabled for each one.
     * 					
     * 
     */
    @XmlEnumValue("FreePicturePackEnabled")
    FREE_PICTURE_PACK_ENABLED("FreePicturePackEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.ItemCompatibilityEnabled</b> and <b>Category.ItemCompatibilityEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the Parts Compatibility feature, and if so, the mode of compatibility that is used (by application or by specification). The Parts Compatibility feature allows sellers to list their motor vehicles parts and accessories items with parts compatibility name-value pairs specific to motor vehicles, and allows potential buyers to search for these items using parts compatibility search fields.
     * 					
     * 
     */
    @XmlEnumValue("CompatibilityEnabled")
    COMPATIBILITY_ENABLED("CompatibilityEnabled"),

    /**
     * 
     * 						If this value is specified, the  <b>Category.MinCompatibleApplications</b> fields in the <b>GetCategoryFeatures</b> response will indicate the minimum number of compatible applications that must be specified when listing a motor vehicle part or accessory in the given category.
     * 					
     * 
     */
    @XmlEnumValue("MinCompatibleApplications")
    MIN_COMPATIBLE_APPLICATIONS("MinCompatibleApplications"),

    /**
     * 
     * 						If this value is specified, the  <b>Category.MaxCompatibleApplications</b> fields in the <b>GetCategoryFeatures</b> response will indicate the maximum number of compatible applications that can be specified when listing a motor vehicle part or accessory in the given category.
     * 					
     * 
     */
    @XmlEnumValue("MaxCompatibleApplications")
    MAX_COMPATIBLE_APPLICATIONS("MaxCompatibleApplications"),

    /**
     * 
     * 						If this value is specified, the <b>Category.ConditionEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate which individual categories support (and even require) the use of <b>ConditionID</b> values to specify the condition of an item within a listing.
     * 					
     * 
     */
    @XmlEnumValue("ConditionEnabled")
    CONDITION_ENABLED("ConditionEnabled"),

    /**
     * 
     * 						If this value is specified, the  <b>Category.Condition</b> containers in the <b>GetCategoryFeatures</b> response will include Condition ID values and item conditions like 'Very Good', 'Acceptable', 'Used', etc. for all categories that support the use of Condition ID values.
     * 					
     * 
     */
    @XmlEnumValue("ConditionValues")
    CONDITION_VALUES("ConditionValues"),

    /**
     * 
     * 						If this value is specified, the  <b>Category.ValueCategory</b> boolean fields in the <b>GetCategoryFeatures</b> response will indicate the categories that are considered by eBay to be 'Value Categories'. 'Value Categories' are generally categories where buyers can find good deals on items. If sellers decide to list within a value category, only this category may be used, and a secondary category is not supported.
     * 					
     * 
     */
    @XmlEnumValue("ValueCategory")
    VALUE_CATEGORY("ValueCategory"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("ProductCreationEnabled")
    PRODUCT_CREATION_ENABLED("ProductCreationEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>Category.EANEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not items listed in the corresponding category may utilize EANs to identify a product. A value of <code>Disabled</code> indicates that EANs cannot be used for the category, a value of <code>Enabled</code> indicates that EANs can be used for the category, and a value of <code>Required</code> indicates that an EAN is required when listing a product in this category.
     * 					
     * 
     */
    @XmlEnumValue("EANEnabled")
    EAN_ENABLED("EANEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>Category.ISBNEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not items listed in the corresponding category may utilize ISBNs to identify a product. A value of <code>Disabled</code> indicates that ISBNs cannot be used for the category, a value of <code>Enabled</code> indicates that ISBNs can be used for the category, and a value of <code>Required</code> indicates that an ISBN is required when listing a product in this category.
     * 					
     * 
     */
    @XmlEnumValue("ISBNEnabled")
    ISBN_ENABLED("ISBNEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>Category.UPCEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not items listed in the corresponding category may utilize UPCs to identify a product. A value of <code>Disabled</code> indicates that UPCs cannot be used for the category, a value of <code>Enabled</code> indicates that UPCs can be used for the category, and a value of <code>Required</code> indicates that a UPC is required when listing a product in this category.
     * 					
     * 
     */
    @XmlEnumValue("UPCEnabled")
    UPC_ENABLED("UPCEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>Category.MaxGranularFitmentCount</b> fields in the <b>GetCategoryFeatures</b> response will indicate how many Parts Compatibility name-value pairs may be passed in for each motor vehicle aspect (Year, Make, and Model) in a motor vehicle parts and accessory listing. granularity. This field is only applicable to motor vehicle parts and accessory listings.
     * 					
     * 
     */
    @XmlEnumValue("MaxGranularFitmentCount")
    MAX_GRANULAR_FITMENT_COUNT("MaxGranularFitmentCount"),

    /**
     * 
     * 						If this value is specified, the <b>Category.CompatibleVehicleType</b> fields in the <b>GetCategoryFeatures</b> response will indicate the type of vehicle that parts compatibility name-value pairs in a listing will be referring to, such as 'cars and trucks', 'all-terrain vehicles (ATV)', 'boats', and 'motorcycles'. This field is only applicable to motor vehicle parts and accessory listings.
     * 					
     * 
     */
    @XmlEnumValue("CompatibleVehicleType")
    COMPATIBLE_VEHICLE_TYPE("CompatibleVehicleType"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("PaymentOptionsGroup")
    PAYMENT_OPTIONS_GROUP("PaymentOptionsGroup"),

    /**
     * 
     * 						If this value is specified, the <b>Category.ShippingProfileCategoryGroup</b> fields in the <b>GetCategoryFeatures</b> response will indicate which shipping business policy category group that each category will inherit as the default category group. Currently, there are only two Business Policies category groups - 'MOTORS_VEHICLE' covers all motor-vehicle related categories, and 'ALL' covers all other categories.
     * 					
     * 
     */
    @XmlEnumValue("ShippingProfileCategoryGroup")
    SHIPPING_PROFILE_CATEGORY_GROUP("ShippingProfileCategoryGroup"),

    /**
     * 
     * 						If this value is specified, the <b>Category.PaymentProfileCategoryGroup</b> fields in the <b>GetCategoryFeatures</b> response will indicate which payment business policy category group that each category will inherit as the default category group. Currently, there are only two Business Policies category groups - 'MOTORS_VEHICLE' covers all motor-vehicle related categories, and 'ALL' covers all other categories.
     * 					
     * 
     */
    @XmlEnumValue("PaymentProfileCategoryGroup")
    PAYMENT_PROFILE_CATEGORY_GROUP("PaymentProfileCategoryGroup"),

    /**
     * 
     * 						If this value is specified, the <b>Category.ReturnPolicyProfileCategoryGroup</b> fields in the <b>GetCategoryFeatures</b> response will indicate which return policy business policy category group that each category will inherit as the default category group. Currently, there are only two Business Policies category groups - 'MOTORS_VEHICLE' covers all motor-vehicle related categories, and 'ALL' covers all other categories.
     * 					
     * 
     */
    @XmlEnumValue("ReturnPolicyProfileCategoryGroup")
    RETURN_POLICY_PROFILE_CATEGORY_GROUP("ReturnPolicyProfileCategoryGroup"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("VINSupported")
    VIN_SUPPORTED("VINSupported"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("VRMSupported")
    VRM_SUPPORTED("VRMSupported"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.SellerProvidedTitleSupported</b> and <b>Category.SellerProvidedTitleSupported</b> fields in the <b>GetCategoryFeatures</b> response will indicate if the eBay site and individual categories support the use of a seller-provided title for a motor vehicle listing on the US or Canada Motors marketplaces. A seller-provided title is a descriptive title, given by the seller, that appears below eBay's pre-filled listing title for the motor vehicle.
     * 					
     * 
     */
    @XmlEnumValue("SellerProvidedTitleSupported")
    SELLER_PROVIDED_TITLE_SUPPORTED("SellerProvidedTitleSupported"),

    /**
     * 
     * 						This value is <b>deprecated</b> and should no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("DepositSupported")
    DEPOSIT_SUPPORTED("DepositSupported"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.GlobalShippingEnabled</b> and <b>Category.GlobalShippingEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate if the eBay site and individual categories support the Global Shipping Program (GSP) as a means for shipping items internationally. The GSP feature is only applicable to shipping items internationally.
     * 					
     * 
     */
    @XmlEnumValue("GlobalShippingEnabled")
    GLOBAL_SHIPPING_ENABLED("GlobalShippingEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>SiteDefaults.AdditionalCompatibilityEnabled</b> and <b>Category.AdditionalCompatibilityEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate whether or not the specified eBay site and individual categories support the second-generation Parts Compatibility feature where parts-compatibility name-value pairs can be passed in for boats, motorcycles, and other vehicles instead of just cars and trucks. This feature is only applicable to motor vehicle parts and accessory listings.
     * 					
     * 
     */
    @XmlEnumValue("AdditionalCompatibilityEnabled")
    ADDITIONAL_COMPATIBILITY_ENABLED("AdditionalCompatibilityEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>Category.PickupDropOffEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate that items listed in the corresponding category may be enabled with the 'Click and Collect' feature. With the 'Click and Collect' feature, a buyer can purchase certain items on the eBay site and collect them at a local store. Buyers are notified by eBay once their items are available. A <code>false</code> value in this field indicates that items listed in the category are not eligible for the 'Click and Collect' feature.
     * 						<br/><br/>
     * 						The 'Click and Collect' feature is only available to large merchants on the eBay UK (site ID - 3), eBay Australia (Site ID - 15), and eBay Germany (Site ID - 77) sites.
     * 					
     * 
     */
    @XmlEnumValue("PickupDropOffEnabled")
    PICKUP_DROP_OFF_ENABLED("PickupDropOffEnabled"),

    /**
     * 
     * 						If this value is specified, the <b>Category.DigitalGoodDeliveryEnabled</b> fields in the <b>GetCategoryFeatures</b> response will indicate that digital gift cards can be listed in the corresponding category. A <code>false</code> value in this field indicates that digital gift cards may not be listed in the category.
     * 						<br/><br/>
     * 						Digital gift cards are currently only supported on the US site. There are some restrictions when it comes to selling gift cards, including the following:
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="urn:ebay:apis:eBLBaseComponents" xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:ns="urn:ebay:apis:eBLBaseComponents" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xml="http://www.w3.org/XML/1998/namespace"/&gt;
     * </pre>
     * <ul><li>Each seller can only have one gift card listing at any given time;</li><li>The maximum dollar value of the gift card may not exceed 500.00; and</li><li>prepaid credit cards from American Express, Discover, MasterCard, or Visa are not allowed.</li></ul>
     * 						For more information on eBay's Gift Card policy, see the <a href="http://pages.ebay.com/help/policies/gift.html">Gift cards policy</a> Help page.
     * 					
     * 
     */
    @XmlEnumValue("DigitalGoodDeliveryEnabled")
    DIGITAL_GOOD_DELIVERY_ENABLED("DigitalGoodDeliveryEnabled"),

    /**
     * 
     * 						This value is used to see if an eBay Product ID (e.g. ePID) can be used in an Add/Revise/Relist API call to identify which motorcycles and/or scooters are compatible with a motor vehicle part or accessory is supported. ePIDs can only be used to identify motorcycles and scooters on the Germany and UK sites.
     * 						<br/><br/>
     *             For more information on using an ePID to identify a compatible motorcycle or scooter through an Add/Revise/Relist API call on the Germany or UK site, see the documentation for the <a href="
     *             https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddItem.html#Request.Item.ItemCompatibilityList.Compatibility.NameValueList">Compatibility.NameValueList</a> container.
     * 					
     * 
     */
    @XmlEnumValue("EpidSupported")
    EPID_SUPPORTED("EpidSupported"),

    /**
     * 
     * 						This value is used to see if a K Type vehicle number in an Add/Revise/Relist API call to identify which cars and/or trucks are compatible with a motor vehicle part or accessory is supported. K type vehicle numbers can only be used to identify cars and trucks on the Germany site.
     * 						<br/><br/>
     *             For more information on using a K Type vehicle number to identify a compatible car or truck through an Add/Revise/Relist API call on the Germany site, see the documentation for the <a href="
     *             https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/AddItem.html#Request.Item.ItemCompatibilityList.Compatibility.NameValueList">Compatibility.NameValueList</a> container.
     * 					
     * 
     */
    @XmlEnumValue("KTypeSupported")
    K_TYPE_SUPPORTED("KTypeSupported"),

    /**
     * 
     * 						The feature associated with this value is deprecated, so specifying this value as a <b>FeatureID</b> value has no practical use.
     * 					
     * 
     */
    @XmlEnumValue("ProductRequiredEnabled")
    PRODUCT_REQUIRED_ENABLED("ProductRequiredEnabled"),

    /**
     * 
     * 						Use this ID to return the values you can specify for whether or not a seller accepts domestic returns.
     *             <br><br>
     *             The values returned in this field are pertinent only if <b>ReturnPolicyEnabled</b> in GetCategoryFeatures is set to <code>true</code> for the associated marketplace and category.
     *             <br><br>
     * 						<span class="tablenote"><b>Note:</b>
     * 							Sellers have the option of using the same return policy settings for both domestic and international returns, or different settings for domestic and international return policies. To see the supported returns accepted options for international returns, the <b>InternationalReturnsAcceptedValues</b> enum should be used.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("DomesticReturnsAcceptedValues")
    DOMESTIC_RETURNS_ACCEPTED_VALUES("DomesticReturnsAcceptedValues"),

    /**
     * 
     * 						Use this ID to return the values you can specify for whether or not a seller accepts international returns.
     *             <br><br>
     *             The values returned in this field are pertinent only if <b>ReturnPolicyEnabled</b> in GetCategoryFeatures is set to <code>true</code> for the associated marketplace and category.
     *             <br><br>
     * 						<span class="tablenote"><b>Note:</b>
     * 							Sellers have the option of using the same return policy settings for both domestic and international returns, or different settings for domestic and international return policies. To see the supported returns accepted options for domestic returns, the <b>DomesticReturnsAcceptedValues</b> enum should be used.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("InternationalReturnsAcceptedValues")
    INTERNATIONAL_RETURNS_ACCEPTED_VALUES("InternationalReturnsAcceptedValues"),

    /**
     * 
     * 						Use this ID to return the values you can specify for the return duration for domestic returns.
     *             <br><br>
     *             The values returned in this field are pertinent only if <b>ReturnPolicyEnabled</b> in GetCategoryFeatures is set to <code>true</code> for the associated marketplace and category.
     *             <br><br>
     * 						<span class="tablenote"><b>Note:</b>
     * 							Sellers have the option of using the same return policy settings for both domestic and international returns, or different settings for domestic and international return policies. To see the supported return windows for international returns, the <b>InternationalReturnsDurationValues</b> enum should be used.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("DomesticReturnsDurationValues")
    DOMESTIC_RETURNS_DURATION_VALUES("DomesticReturnsDurationValues"),

    /**
     * 
     * 						Use this ID to return the values you can specify for the return duration for international returns.
     *             <br><br>
     *             The values returned in this field are pertinent only if <b>ReturnPolicyEnabled</b> in GetCategoryFeatures is set to <code>true</code> for the associated marketplace and category.
     *             <br><br>
     * 						<span class="tablenote"><b>Note:</b>
     * 							Sellers have the option of using the same return policy settings for both domestic and international returns, or different settings for domestic and international return policies. To see the supported return windows for domestic returns, the <b>DomesticReturnsDurationValues</b> enum should be used.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("InternationalReturnsDurationValues")
    INTERNATIONAL_RETURNS_DURATION_VALUES("InternationalReturnsDurationValues"),

    /**
     * 
     * 						Use this ID to return the values you can specify for who pays any return shipping costs for domestic returns.
     *             <br><br>
     *             The values returned in this field are pertinent only if <b>ReturnPolicyEnabled</b> in GetCategoryFeatures is set to <code>true</code> for the associated marketplace and category.
     *             <br><br>
     * 						<span class="tablenote"><b>Note:</b>
     * 							Sellers have the option of using the same return policy settings for both domestic and international returns, or different settings for domestic and international return policies. To see the supported return shipment payee values for international returns, the <b>InternationalReturnsShipmentPayeeValues</b> enum should be used.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("DomesticReturnsShipmentPayeeValues")
    DOMESTIC_RETURNS_SHIPMENT_PAYEE_VALUES("DomesticReturnsShipmentPayeeValues"),

    /**
     * 
     * 						Use this ID to return the values you can specify for who pays any return shipping costs for international returns.
     *             <br><br>
     *             The values returned in this field are pertinent only if <b>ReturnPolicyEnabled</b> in GetCategoryFeatures is set to <code>true</code> for the associated marketplace and category.
     *             <br><br>
     * 						<span class="tablenote"><b>Note:</b>
     * 							Sellers have the option of using the same return policy settings for both domestic and international returns, or different settings for domestic and international return policies. To see the supported return shipment payee values for domestic returns, the <b>DomesticReturnsShipmentPayeeValues</b> enum should be used.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("InternationalReturnsShipmentPayeeValues")
    INTERNATIONAL_RETURNS_SHIPMENT_PAYEE_VALUES("InternationalReturnsShipmentPayeeValues"),

    /**
     * 
     * 						In US, sellers can offer item replacement in addition to offering a money-back refund for domestic returns. Use this ID to return whether or not the seller can offer <code>MoneyBackorReplacement</code> for the specified category.
     *             <br><br>
     *             The values returned in this field are pertinent only if <b>ReturnPolicyEnabled</b> in GetCategoryFeatures is set to <code>true</code> for the associated marketplace and category.
     *             <br><br>
     * 						<span class="tablenote"><b>Note:</b>
     * 							Sellers have the option of using the same return policy settings for both domestic and international returns, or different settings for domestic and international return policies. To see the supported refund method options for international returns, the <b>InternationalRefundMethodValues</b> enum should be used.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("DomesticRefundMethodValues")
    DOMESTIC_REFUND_METHOD_VALUES("DomesticRefundMethodValues"),

    /**
     * 
     * 						In US, sellers can offer item replacement in addition to offering a money-back refund for international returns. Use this ID to return whether or not the seller can offer <code>MoneyBackorReplacement</code> for the specified category.
     *             <br><br>
     *             The values returned in this field are pertinent only if <b>ReturnPolicyEnabled</b> in GetCategoryFeatures is set to <code>true</code> for the associated marketplace and category.
     *             <br><br>
     * 						<span class="tablenote"><b>Note:</b>
     * 							Sellers have the option of using the same return policy settings for both domestic and international returns, or different settings for domestic and international return policies. To see the supported refund method options for domestic returns, the <b>DomesticRefundMethodValues</b> enum should be used.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("InternationalRefundMethodValues")
    INTERNATIONAL_REFUND_METHOD_VALUES("InternationalRefundMethodValues"),

    /**
     * 
     * 						In some EU countries, sellers are legally required to describe the return policy they offer. The value returned by this field indicates if sellers can provide such description within the given marketplace and category.
     *             <br><br>
     *             The values returned in this field are pertinent only if <b>ReturnPolicyEnabled</b> in GetCategoryFeatures is set to <code>true</code> for the associated marketplace and category.
     * 					
     * 
     */
    @XmlEnumValue("ReturnPolicyDescriptionEnabled")
    RETURN_POLICY_DESCRIPTION_ENABLED("ReturnPolicyDescriptionEnabled");
    private final String value;

    FeatureIDCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeatureIDCodeType fromValue(String v) {
        for (FeatureIDCodeType c: FeatureIDCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
