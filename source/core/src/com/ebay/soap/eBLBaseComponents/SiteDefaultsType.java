
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is used by the <b>SiteDefaults</b> container to display the features/settings that are default for most categories on the eBay marketplace.
 * 			
 * 
 * <p>Java class for SiteDefaultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteDefaultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingDuration" type="{urn:ebay:apis:eBLBaseComponents}ListingDurationReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingTermsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DutchBINEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserConsentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HomePageFeaturedEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProPackEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BasicUpgradePackEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValuePackEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProPackPlusEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdFormatEnabled" type="{urn:ebay:apis:eBLBaseComponents}AdFormatEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="BestOfferCounterEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestOfferAutoDeclineEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketSpecialitySubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketRegularSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketPremiumSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketNonSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressPicturesRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressConditionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinimumReservePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SellerContactDetailsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TransactionConfirmationRequestEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreInventoryEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SkypeMeTransactionalEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SkypeMeNonTransactionalEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalListingDistancesRegular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalListingDistancesSpecialty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalListingDistancesNonSubscription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdPaymentMethodEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdPaymentMethodEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdShippingMethodEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdBestOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdBestOfferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdCounterOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdAutoDeclineEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByPhoneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByEmailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SafePaymentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdPayPerLeadEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemSpecificsEnabled" type="{urn:ebay:apis:eBLBaseComponents}ItemSpecificsEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="BrandMPNIdentifierEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdAutoAcceptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestOfferAutoAcceptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CrossBorderTradeNorthAmericaEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CrossBorderTradeGBEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CrossBorderTradeAustraliaEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyerGuaranteeEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CombinedFixedPriceTreatmentEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GalleryFeaturedDurations" type="{urn:ebay:apis:eBLBaseComponents}ListingEnhancementDurationReferenceType" minOccurs="0"/>
 *         &lt;element name="PayPalRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProAdFormatEnabled" type="{urn:ebay:apis:eBLBaseComponents}AdFormatEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProContactByPhoneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProPhoneCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProContactByAddressEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProStreetCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProCompanyNameEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProContactByEmailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProBestOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdBestOfferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProAutoAcceptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProAutoDeclineEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProPaymentMethodCheckOutEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdPaymentMethodEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProShippingMethodEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProCounterOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProSellerContactDetailsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketAdFormatEnabled" type="{urn:ebay:apis:eBLBaseComponents}AdFormatEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="LocalMarketContactByPhoneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketPhoneCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocalMarketContactByAddressEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketStreetCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocalMarketCompanyNameEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketContactByEmailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketBestOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdBestOfferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="LocalMarketAutoAcceptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketAutoDeclineEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketPaymentMethodCheckOutEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdPaymentMethodEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="LocalMarketShippingMethodEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketCounterOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalMarketSellerContactDetailsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdPhoneCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByAddressEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdStreetCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdCompanyNameEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SpecialitySubscription" type="{urn:ebay:apis:eBLBaseComponents}GeographicExposureCodeType" minOccurs="0"/>
 *         &lt;element name="RegularSubscription" type="{urn:ebay:apis:eBLBaseComponents}GeographicExposureCodeType" minOccurs="0"/>
 *         &lt;element name="PremiumSubscription" type="{urn:ebay:apis:eBLBaseComponents}GeographicExposureCodeType" minOccurs="0"/>
 *         &lt;element name="NonSubscription" type="{urn:ebay:apis:eBLBaseComponents}GeographicExposureCodeType" minOccurs="0"/>
 *         &lt;element name="PayPalRequiredForStoreOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReviseQuantityAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RevisePriceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreOwnerExtendedListingDurationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreOwnerExtendedListingDurations" type="{urn:ebay:apis:eBLBaseComponents}StoreOwnerExtendedListingDurationsType" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandlingTimeEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="MaxFlatShippingCostCBTExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Group1MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Group2MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Group3MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AttributeConversionEnabled" type="{urn:ebay:apis:eBLBaseComponents}AttributeConversionEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="FreeGalleryPlusEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FreePicturePackEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemCompatibilityEnabled" type="{urn:ebay:apis:eBLBaseComponents}ItemCompatibilityEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="MinItemCompatibility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxItemCompatibility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConditionEnabled" type="{urn:ebay:apis:eBLBaseComponents}ConditionEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="ConditionValues" type="{urn:ebay:apis:eBLBaseComponents}ConditionValuesType" minOccurs="0"/>
 *         &lt;element name="SpecialFeatures" type="{urn:ebay:apis:eBLBaseComponents}ConditionValuesType" minOccurs="0"/>
 *         &lt;element name="ValueCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductCreationEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductCreationEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="EANEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductIdentiferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="ISBNEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductIdentiferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="UPCEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductIdentiferEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="MaxGranularFitmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CompatibleVehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingProfileCategoryGroup" type="{urn:ebay:apis:eBLBaseComponents}ProfileCategoryGroupCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentProfileCategoryGroup" type="{urn:ebay:apis:eBLBaseComponents}ProfileCategoryGroupCodeType" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyProfileCategoryGroup" type="{urn:ebay:apis:eBLBaseComponents}ProfileCategoryGroupCodeType" minOccurs="0"/>
 *         &lt;element name="VINSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VRMSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellerProvidedTitleSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DepositSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GlobalShippingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalCompatibilityEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PickupDropOffEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DigitalGoodDeliveryEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EpidSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KTypeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductRequiredEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductRequiredEnabledCodeType" minOccurs="0"/>
 *         &lt;element name="DomesticReturnsAcceptedValues" type="{urn:ebay:apis:eBLBaseComponents}DomesticReturnsAcceptedCodeType" minOccurs="0"/>
 *         &lt;element name="InternationalReturnsAcceptedValues" type="{urn:ebay:apis:eBLBaseComponents}InternationalReturnsAcceptedCodeType" minOccurs="0"/>
 *         &lt;element name="DomesticReturnsDurationValues" type="{urn:ebay:apis:eBLBaseComponents}DomesticReturnsDurationCodeType" minOccurs="0"/>
 *         &lt;element name="InternationalReturnsDurationValues" type="{urn:ebay:apis:eBLBaseComponents}InternationalReturnsDurationCodeType" minOccurs="0"/>
 *         &lt;element name="DomesticReturnsShipmentPayeeValues" type="{urn:ebay:apis:eBLBaseComponents}DomesticReturnsShipmentPayeeCodeType" minOccurs="0"/>
 *         &lt;element name="InternationalReturnsShipmentPayeeValues" type="{urn:ebay:apis:eBLBaseComponents}InternationalReturnsShipmentPayeeCodeType" minOccurs="0"/>
 *         &lt;element name="DomesticRefundMethodValues" type="{urn:ebay:apis:eBLBaseComponents}DomesticRefundMethodCodeType" minOccurs="0"/>
 *         &lt;element name="InternationalRefundMethodValues" type="{urn:ebay:apis:eBLBaseComponents}InternationalRefundMethodCodeType" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyDescriptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteDefaultsType", propOrder = {
    "listingDuration",
    "shippingTermsRequired",
    "bestOfferEnabled",
    "dutchBINEnabled",
    "userConsentRequired",
    "homePageFeaturedEnabled",
    "proPackEnabled",
    "basicUpgradePackEnabled",
    "valuePackEnabled",
    "proPackPlusEnabled",
    "adFormatEnabled",
    "bestOfferCounterEnabled",
    "bestOfferAutoDeclineEnabled",
    "localMarketSpecialitySubscription",
    "localMarketRegularSubscription",
    "localMarketPremiumSubscription",
    "localMarketNonSubscription",
    "expressEnabled",
    "expressPicturesRequired",
    "expressConditionRequired",
    "minimumReservePrice",
    "sellerContactDetailsEnabled",
    "transactionConfirmationRequestEnabled",
    "storeInventoryEnabled",
    "skypeMeTransactionalEnabled",
    "skypeMeNonTransactionalEnabled",
    "localListingDistancesRegular",
    "localListingDistancesSpecialty",
    "localListingDistancesNonSubscription",
    "classifiedAdPaymentMethodEnabled",
    "classifiedAdShippingMethodEnabled",
    "classifiedAdBestOfferEnabled",
    "classifiedAdCounterOfferEnabled",
    "classifiedAdAutoDeclineEnabled",
    "classifiedAdContactByPhoneEnabled",
    "classifiedAdContactByEmailEnabled",
    "safePaymentRequired",
    "classifiedAdPayPerLeadEnabled",
    "itemSpecificsEnabled",
    "brandMPNIdentifierEnabled",
    "classifiedAdAutoAcceptEnabled",
    "bestOfferAutoAcceptEnabled",
    "crossBorderTradeNorthAmericaEnabled",
    "crossBorderTradeGBEnabled",
    "crossBorderTradeAustraliaEnabled",
    "buyerGuaranteeEnabled",
    "combinedFixedPriceTreatmentEnabled",
    "galleryFeaturedDurations",
    "payPalRequired",
    "eBayMotorsProAdFormatEnabled",
    "eBayMotorsProContactByPhoneEnabled",
    "eBayMotorsProPhoneCount",
    "eBayMotorsProContactByAddressEnabled",
    "eBayMotorsProStreetCount",
    "eBayMotorsProCompanyNameEnabled",
    "eBayMotorsProContactByEmailEnabled",
    "eBayMotorsProBestOfferEnabled",
    "eBayMotorsProAutoAcceptEnabled",
    "eBayMotorsProAutoDeclineEnabled",
    "eBayMotorsProPaymentMethodCheckOutEnabled",
    "eBayMotorsProShippingMethodEnabled",
    "eBayMotorsProCounterOfferEnabled",
    "eBayMotorsProSellerContactDetailsEnabled",
    "localMarketAdFormatEnabled",
    "localMarketContactByPhoneEnabled",
    "localMarketPhoneCount",
    "localMarketContactByAddressEnabled",
    "localMarketStreetCount",
    "localMarketCompanyNameEnabled",
    "localMarketContactByEmailEnabled",
    "localMarketBestOfferEnabled",
    "localMarketAutoAcceptEnabled",
    "localMarketAutoDeclineEnabled",
    "localMarketPaymentMethodCheckOutEnabled",
    "localMarketShippingMethodEnabled",
    "localMarketCounterOfferEnabled",
    "localMarketSellerContactDetailsEnabled",
    "classifiedAdPhoneCount",
    "classifiedAdContactByAddressEnabled",
    "classifiedAdStreetCount",
    "classifiedAdCompanyNameEnabled",
    "specialitySubscription",
    "regularSubscription",
    "premiumSubscription",
    "nonSubscription",
    "payPalRequiredForStoreOwner",
    "reviseQuantityAllowed",
    "revisePriceAllowed",
    "storeOwnerExtendedListingDurationsEnabled",
    "storeOwnerExtendedListingDurations",
    "returnPolicyEnabled",
    "handlingTimeEnabled",
    "maxFlatShippingCost",
    "maxFlatShippingCostCBTExempt",
    "group1MaxFlatShippingCost",
    "group2MaxFlatShippingCost",
    "group3MaxFlatShippingCost",
    "paymentMethod",
    "variationsEnabled",
    "attributeConversionEnabled",
    "freeGalleryPlusEnabled",
    "freePicturePackEnabled",
    "itemCompatibilityEnabled",
    "minItemCompatibility",
    "maxItemCompatibility",
    "conditionEnabled",
    "conditionValues",
    "specialFeatures",
    "valueCategory",
    "productCreationEnabled",
    "eanEnabled",
    "isbnEnabled",
    "upcEnabled",
    "maxGranularFitmentCount",
    "compatibleVehicleType",
    "shippingProfileCategoryGroup",
    "paymentProfileCategoryGroup",
    "returnPolicyProfileCategoryGroup",
    "vinSupported",
    "vrmSupported",
    "sellerProvidedTitleSupported",
    "depositSupported",
    "globalShippingEnabled",
    "additionalCompatibilityEnabled",
    "pickupDropOffEnabled",
    "digitalGoodDeliveryEnabled",
    "epidSupported",
    "kTypeSupported",
    "productRequiredEnabled",
    "domesticReturnsAcceptedValues",
    "internationalReturnsAcceptedValues",
    "domesticReturnsDurationValues",
    "internationalReturnsDurationValues",
    "domesticReturnsShipmentPayeeValues",
    "internationalReturnsShipmentPayeeValues",
    "domesticRefundMethodValues",
    "internationalRefundMethodValues",
    "returnPolicyDescriptionEnabled",
    "any"
})
public class SiteDefaultsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ListingDuration")
    protected List<ListingDurationReferenceType> listingDuration;
    @XmlElement(name = "ShippingTermsRequired")
    protected Boolean shippingTermsRequired;
    @XmlElement(name = "BestOfferEnabled")
    protected Boolean bestOfferEnabled;
    @XmlElement(name = "DutchBINEnabled")
    protected Boolean dutchBINEnabled;
    @XmlElement(name = "UserConsentRequired")
    protected Boolean userConsentRequired;
    @XmlElement(name = "HomePageFeaturedEnabled")
    protected Boolean homePageFeaturedEnabled;
    @XmlElement(name = "ProPackEnabled")
    protected Boolean proPackEnabled;
    @XmlElement(name = "BasicUpgradePackEnabled")
    protected Boolean basicUpgradePackEnabled;
    @XmlElement(name = "ValuePackEnabled")
    protected Boolean valuePackEnabled;
    @XmlElement(name = "ProPackPlusEnabled")
    protected Boolean proPackPlusEnabled;
    @XmlElement(name = "AdFormatEnabled")
    protected AdFormatEnabledCodeType adFormatEnabled;
    @XmlElement(name = "BestOfferCounterEnabled")
    protected Boolean bestOfferCounterEnabled;
    @XmlElement(name = "BestOfferAutoDeclineEnabled")
    protected Boolean bestOfferAutoDeclineEnabled;
    @XmlElement(name = "LocalMarketSpecialitySubscription")
    protected Boolean localMarketSpecialitySubscription;
    @XmlElement(name = "LocalMarketRegularSubscription")
    protected Boolean localMarketRegularSubscription;
    @XmlElement(name = "LocalMarketPremiumSubscription")
    protected Boolean localMarketPremiumSubscription;
    @XmlElement(name = "LocalMarketNonSubscription")
    protected Boolean localMarketNonSubscription;
    @XmlElement(name = "ExpressEnabled")
    protected Boolean expressEnabled;
    @XmlElement(name = "ExpressPicturesRequired")
    protected Boolean expressPicturesRequired;
    @XmlElement(name = "ExpressConditionRequired")
    protected Boolean expressConditionRequired;
    @XmlElement(name = "MinimumReservePrice")
    protected Double minimumReservePrice;
    @XmlElement(name = "SellerContactDetailsEnabled")
    protected Boolean sellerContactDetailsEnabled;
    @XmlElement(name = "TransactionConfirmationRequestEnabled")
    protected Boolean transactionConfirmationRequestEnabled;
    @XmlElement(name = "StoreInventoryEnabled")
    protected Boolean storeInventoryEnabled;
    @XmlElement(name = "SkypeMeTransactionalEnabled")
    protected Boolean skypeMeTransactionalEnabled;
    @XmlElement(name = "SkypeMeNonTransactionalEnabled")
    protected Boolean skypeMeNonTransactionalEnabled;
    @XmlElement(name = "LocalListingDistancesRegular")
    protected String localListingDistancesRegular;
    @XmlElement(name = "LocalListingDistancesSpecialty")
    protected String localListingDistancesSpecialty;
    @XmlElement(name = "LocalListingDistancesNonSubscription")
    protected String localListingDistancesNonSubscription;
    @XmlElement(name = "ClassifiedAdPaymentMethodEnabled")
    protected ClassifiedAdPaymentMethodEnabledCodeType classifiedAdPaymentMethodEnabled;
    @XmlElement(name = "ClassifiedAdShippingMethodEnabled")
    protected Boolean classifiedAdShippingMethodEnabled;
    @XmlElement(name = "ClassifiedAdBestOfferEnabled")
    protected ClassifiedAdBestOfferEnabledCodeType classifiedAdBestOfferEnabled;
    @XmlElement(name = "ClassifiedAdCounterOfferEnabled")
    protected Boolean classifiedAdCounterOfferEnabled;
    @XmlElement(name = "ClassifiedAdAutoDeclineEnabled")
    protected Boolean classifiedAdAutoDeclineEnabled;
    @XmlElement(name = "ClassifiedAdContactByPhoneEnabled")
    protected Boolean classifiedAdContactByPhoneEnabled;
    @XmlElement(name = "ClassifiedAdContactByEmailEnabled")
    protected Boolean classifiedAdContactByEmailEnabled;
    @XmlElement(name = "SafePaymentRequired")
    protected Boolean safePaymentRequired;
    @XmlElement(name = "ClassifiedAdPayPerLeadEnabled")
    protected Boolean classifiedAdPayPerLeadEnabled;
    @XmlElement(name = "ItemSpecificsEnabled")
    protected ItemSpecificsEnabledCodeType itemSpecificsEnabled;
    @XmlElement(name = "BrandMPNIdentifierEnabled")
    protected Boolean brandMPNIdentifierEnabled;
    @XmlElement(name = "ClassifiedAdAutoAcceptEnabled")
    protected Boolean classifiedAdAutoAcceptEnabled;
    @XmlElement(name = "BestOfferAutoAcceptEnabled")
    protected Boolean bestOfferAutoAcceptEnabled;
    @XmlElement(name = "CrossBorderTradeNorthAmericaEnabled")
    protected Boolean crossBorderTradeNorthAmericaEnabled;
    @XmlElement(name = "CrossBorderTradeGBEnabled")
    protected Boolean crossBorderTradeGBEnabled;
    @XmlElement(name = "CrossBorderTradeAustraliaEnabled")
    protected Boolean crossBorderTradeAustraliaEnabled;
    @XmlElement(name = "BuyerGuaranteeEnabled")
    protected Boolean buyerGuaranteeEnabled;
    @XmlElement(name = "CombinedFixedPriceTreatmentEnabled")
    protected Boolean combinedFixedPriceTreatmentEnabled;
    @XmlElement(name = "GalleryFeaturedDurations")
    protected ListingEnhancementDurationReferenceType galleryFeaturedDurations;
    @XmlElement(name = "PayPalRequired")
    protected Boolean payPalRequired;
    protected AdFormatEnabledCodeType eBayMotorsProAdFormatEnabled;
    protected Boolean eBayMotorsProContactByPhoneEnabled;
    protected Integer eBayMotorsProPhoneCount;
    protected Boolean eBayMotorsProContactByAddressEnabled;
    protected Integer eBayMotorsProStreetCount;
    protected Boolean eBayMotorsProCompanyNameEnabled;
    protected Boolean eBayMotorsProContactByEmailEnabled;
    protected ClassifiedAdBestOfferEnabledCodeType eBayMotorsProBestOfferEnabled;
    protected Boolean eBayMotorsProAutoAcceptEnabled;
    protected Boolean eBayMotorsProAutoDeclineEnabled;
    protected ClassifiedAdPaymentMethodEnabledCodeType eBayMotorsProPaymentMethodCheckOutEnabled;
    protected Boolean eBayMotorsProShippingMethodEnabled;
    protected Boolean eBayMotorsProCounterOfferEnabled;
    protected Boolean eBayMotorsProSellerContactDetailsEnabled;
    @XmlElement(name = "LocalMarketAdFormatEnabled")
    protected AdFormatEnabledCodeType localMarketAdFormatEnabled;
    @XmlElement(name = "LocalMarketContactByPhoneEnabled")
    protected Boolean localMarketContactByPhoneEnabled;
    @XmlElement(name = "LocalMarketPhoneCount")
    protected Integer localMarketPhoneCount;
    @XmlElement(name = "LocalMarketContactByAddressEnabled")
    protected Boolean localMarketContactByAddressEnabled;
    @XmlElement(name = "LocalMarketStreetCount")
    protected Integer localMarketStreetCount;
    @XmlElement(name = "LocalMarketCompanyNameEnabled")
    protected Boolean localMarketCompanyNameEnabled;
    @XmlElement(name = "LocalMarketContactByEmailEnabled")
    protected Boolean localMarketContactByEmailEnabled;
    @XmlElement(name = "LocalMarketBestOfferEnabled")
    protected ClassifiedAdBestOfferEnabledCodeType localMarketBestOfferEnabled;
    @XmlElement(name = "LocalMarketAutoAcceptEnabled")
    protected Boolean localMarketAutoAcceptEnabled;
    @XmlElement(name = "LocalMarketAutoDeclineEnabled")
    protected Boolean localMarketAutoDeclineEnabled;
    @XmlElement(name = "LocalMarketPaymentMethodCheckOutEnabled")
    protected ClassifiedAdPaymentMethodEnabledCodeType localMarketPaymentMethodCheckOutEnabled;
    @XmlElement(name = "LocalMarketShippingMethodEnabled")
    protected Boolean localMarketShippingMethodEnabled;
    @XmlElement(name = "LocalMarketCounterOfferEnabled")
    protected Boolean localMarketCounterOfferEnabled;
    @XmlElement(name = "LocalMarketSellerContactDetailsEnabled")
    protected Boolean localMarketSellerContactDetailsEnabled;
    @XmlElement(name = "ClassifiedAdPhoneCount")
    protected Integer classifiedAdPhoneCount;
    @XmlElement(name = "ClassifiedAdContactByAddressEnabled")
    protected Boolean classifiedAdContactByAddressEnabled;
    @XmlElement(name = "ClassifiedAdStreetCount")
    protected Integer classifiedAdStreetCount;
    @XmlElement(name = "ClassifiedAdCompanyNameEnabled")
    protected Boolean classifiedAdCompanyNameEnabled;
    @XmlElement(name = "SpecialitySubscription")
    protected GeographicExposureCodeType specialitySubscription;
    @XmlElement(name = "RegularSubscription")
    protected GeographicExposureCodeType regularSubscription;
    @XmlElement(name = "PremiumSubscription")
    protected GeographicExposureCodeType premiumSubscription;
    @XmlElement(name = "NonSubscription")
    protected GeographicExposureCodeType nonSubscription;
    @XmlElement(name = "PayPalRequiredForStoreOwner")
    protected Boolean payPalRequiredForStoreOwner;
    @XmlElement(name = "ReviseQuantityAllowed")
    protected Boolean reviseQuantityAllowed;
    @XmlElement(name = "RevisePriceAllowed")
    protected Boolean revisePriceAllowed;
    @XmlElement(name = "StoreOwnerExtendedListingDurationsEnabled")
    protected Boolean storeOwnerExtendedListingDurationsEnabled;
    @XmlElement(name = "StoreOwnerExtendedListingDurations")
    protected StoreOwnerExtendedListingDurationsType storeOwnerExtendedListingDurations;
    @XmlElement(name = "ReturnPolicyEnabled")
    protected Boolean returnPolicyEnabled;
    @XmlElement(name = "HandlingTimeEnabled")
    protected Boolean handlingTimeEnabled;
    @XmlElement(name = "MaxFlatShippingCost")
    protected AmountType maxFlatShippingCost;
    @XmlElement(name = "MaxFlatShippingCostCBTExempt")
    protected Boolean maxFlatShippingCostCBTExempt;
    @XmlElement(name = "Group1MaxFlatShippingCost")
    protected AmountType group1MaxFlatShippingCost;
    @XmlElement(name = "Group2MaxFlatShippingCost")
    protected AmountType group2MaxFlatShippingCost;
    @XmlElement(name = "Group3MaxFlatShippingCost")
    protected AmountType group3MaxFlatShippingCost;
    @XmlElement(name = "PaymentMethod")
    protected List<BuyerPaymentMethodCodeType> paymentMethod;
    @XmlElement(name = "VariationsEnabled")
    protected Boolean variationsEnabled;
    @XmlElement(name = "AttributeConversionEnabled")
    protected AttributeConversionEnabledCodeType attributeConversionEnabled;
    @XmlElement(name = "FreeGalleryPlusEnabled")
    protected Boolean freeGalleryPlusEnabled;
    @XmlElement(name = "FreePicturePackEnabled")
    protected Boolean freePicturePackEnabled;
    @XmlElement(name = "ItemCompatibilityEnabled")
    protected ItemCompatibilityEnabledCodeType itemCompatibilityEnabled;
    @XmlElement(name = "MinItemCompatibility")
    protected Integer minItemCompatibility;
    @XmlElement(name = "MaxItemCompatibility")
    protected Integer maxItemCompatibility;
    @XmlElement(name = "ConditionEnabled")
    protected ConditionEnabledCodeType conditionEnabled;
    @XmlElement(name = "ConditionValues")
    protected ConditionValuesType conditionValues;
    @XmlElement(name = "SpecialFeatures")
    protected ConditionValuesType specialFeatures;
    @XmlElement(name = "ValueCategory")
    protected Boolean valueCategory;
    @XmlElement(name = "ProductCreationEnabled")
    protected ProductCreationEnabledCodeType productCreationEnabled;
    @XmlElement(name = "EANEnabled")
    protected ProductIdentiferEnabledCodeType eanEnabled;
    @XmlElement(name = "ISBNEnabled")
    protected ProductIdentiferEnabledCodeType isbnEnabled;
    @XmlElement(name = "UPCEnabled")
    protected ProductIdentiferEnabledCodeType upcEnabled;
    @XmlElement(name = "MaxGranularFitmentCount")
    protected Integer maxGranularFitmentCount;
    @XmlElement(name = "CompatibleVehicleType")
    protected String compatibleVehicleType;
    @XmlElement(name = "ShippingProfileCategoryGroup")
    protected ProfileCategoryGroupCodeType shippingProfileCategoryGroup;
    @XmlElement(name = "PaymentProfileCategoryGroup")
    protected ProfileCategoryGroupCodeType paymentProfileCategoryGroup;
    @XmlElement(name = "ReturnPolicyProfileCategoryGroup")
    protected ProfileCategoryGroupCodeType returnPolicyProfileCategoryGroup;
    @XmlElement(name = "VINSupported")
    protected Boolean vinSupported;
    @XmlElement(name = "VRMSupported")
    protected Boolean vrmSupported;
    @XmlElement(name = "SellerProvidedTitleSupported")
    protected Boolean sellerProvidedTitleSupported;
    @XmlElement(name = "DepositSupported")
    protected Boolean depositSupported;
    @XmlElement(name = "GlobalShippingEnabled")
    protected Boolean globalShippingEnabled;
    @XmlElement(name = "AdditionalCompatibilityEnabled")
    protected Boolean additionalCompatibilityEnabled;
    @XmlElement(name = "PickupDropOffEnabled")
    protected Boolean pickupDropOffEnabled;
    @XmlElement(name = "DigitalGoodDeliveryEnabled")
    protected Boolean digitalGoodDeliveryEnabled;
    @XmlElement(name = "EpidSupported")
    protected Boolean epidSupported;
    @XmlElement(name = "KTypeSupported")
    protected Boolean kTypeSupported;
    @XmlElement(name = "ProductRequiredEnabled")
    protected ProductRequiredEnabledCodeType productRequiredEnabled;
    @XmlElement(name = "DomesticReturnsAcceptedValues")
    protected DomesticReturnsAcceptedCodeType domesticReturnsAcceptedValues;
    @XmlElement(name = "InternationalReturnsAcceptedValues")
    protected InternationalReturnsAcceptedCodeType internationalReturnsAcceptedValues;
    @XmlElement(name = "DomesticReturnsDurationValues")
    protected DomesticReturnsDurationCodeType domesticReturnsDurationValues;
    @XmlElement(name = "InternationalReturnsDurationValues")
    protected InternationalReturnsDurationCodeType internationalReturnsDurationValues;
    @XmlElement(name = "DomesticReturnsShipmentPayeeValues")
    protected DomesticReturnsShipmentPayeeCodeType domesticReturnsShipmentPayeeValues;
    @XmlElement(name = "InternationalReturnsShipmentPayeeValues")
    protected InternationalReturnsShipmentPayeeCodeType internationalReturnsShipmentPayeeValues;
    @XmlElement(name = "DomesticRefundMethodValues")
    protected DomesticRefundMethodCodeType domesticRefundMethodValues;
    @XmlElement(name = "InternationalRefundMethodValues")
    protected InternationalRefundMethodCodeType internationalRefundMethodValues;
    @XmlElement(name = "ReturnPolicyDescriptionEnabled")
    protected Boolean returnPolicyDescriptionEnabled;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ListingDurationReferenceType }
     *     
     */
    public ListingDurationReferenceType[] getListingDuration() {
        if (this.listingDuration == null) {
            return new ListingDurationReferenceType[ 0 ] ;
        }
        return ((ListingDurationReferenceType[]) this.listingDuration.toArray(new ListingDurationReferenceType[this.listingDuration.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ListingDurationReferenceType }
     *     
     */
    public ListingDurationReferenceType getListingDuration(int idx) {
        if (this.listingDuration == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listingDuration.get(idx);
    }

    public int getListingDurationLength() {
        if (this.listingDuration == null) {
            return  0;
        }
        return this.listingDuration.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ListingDurationReferenceType }
     *     
     */
    public void setListingDuration(ListingDurationReferenceType[] values) {
        this._getListingDuration().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.listingDuration.add(values[i]);
        }
    }

    protected List<ListingDurationReferenceType> _getListingDuration() {
        if (listingDuration == null) {
            listingDuration = new ArrayList<ListingDurationReferenceType>();
        }
        return listingDuration;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ListingDurationReferenceType }
     *     
     */
    public ListingDurationReferenceType setListingDuration(int idx, ListingDurationReferenceType value) {
        return this.listingDuration.set(idx, value);
    }

    /**
     * Gets the value of the shippingTermsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingTermsRequired() {
        return shippingTermsRequired;
    }

    /**
     * Sets the value of the shippingTermsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingTermsRequired(Boolean value) {
        this.shippingTermsRequired = value;
    }

    /**
     * Gets the value of the bestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferEnabled() {
        return bestOfferEnabled;
    }

    /**
     * Sets the value of the bestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferEnabled(Boolean value) {
        this.bestOfferEnabled = value;
    }

    /**
     * Gets the value of the dutchBINEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDutchBINEnabled() {
        return dutchBINEnabled;
    }

    /**
     * Sets the value of the dutchBINEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDutchBINEnabled(Boolean value) {
        this.dutchBINEnabled = value;
    }

    /**
     * Gets the value of the userConsentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserConsentRequired() {
        return userConsentRequired;
    }

    /**
     * Sets the value of the userConsentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserConsentRequired(Boolean value) {
        this.userConsentRequired = value;
    }

    /**
     * Gets the value of the homePageFeaturedEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomePageFeaturedEnabled() {
        return homePageFeaturedEnabled;
    }

    /**
     * Sets the value of the homePageFeaturedEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomePageFeaturedEnabled(Boolean value) {
        this.homePageFeaturedEnabled = value;
    }

    /**
     * Gets the value of the proPackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProPackEnabled() {
        return proPackEnabled;
    }

    /**
     * Sets the value of the proPackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProPackEnabled(Boolean value) {
        this.proPackEnabled = value;
    }

    /**
     * Gets the value of the basicUpgradePackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasicUpgradePackEnabled() {
        return basicUpgradePackEnabled;
    }

    /**
     * Sets the value of the basicUpgradePackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasicUpgradePackEnabled(Boolean value) {
        this.basicUpgradePackEnabled = value;
    }

    /**
     * Gets the value of the valuePackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValuePackEnabled() {
        return valuePackEnabled;
    }

    /**
     * Sets the value of the valuePackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValuePackEnabled(Boolean value) {
        this.valuePackEnabled = value;
    }

    /**
     * Gets the value of the proPackPlusEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProPackPlusEnabled() {
        return proPackPlusEnabled;
    }

    /**
     * Sets the value of the proPackPlusEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProPackPlusEnabled(Boolean value) {
        this.proPackPlusEnabled = value;
    }

    /**
     * Gets the value of the adFormatEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public AdFormatEnabledCodeType getAdFormatEnabled() {
        return adFormatEnabled;
    }

    /**
     * Sets the value of the adFormatEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public void setAdFormatEnabled(AdFormatEnabledCodeType value) {
        this.adFormatEnabled = value;
    }

    /**
     * Gets the value of the bestOfferCounterEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferCounterEnabled() {
        return bestOfferCounterEnabled;
    }

    /**
     * Sets the value of the bestOfferCounterEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferCounterEnabled(Boolean value) {
        this.bestOfferCounterEnabled = value;
    }

    /**
     * Gets the value of the bestOfferAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferAutoDeclineEnabled() {
        return bestOfferAutoDeclineEnabled;
    }

    /**
     * Sets the value of the bestOfferAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferAutoDeclineEnabled(Boolean value) {
        this.bestOfferAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the localMarketSpecialitySubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketSpecialitySubscription() {
        return localMarketSpecialitySubscription;
    }

    /**
     * Sets the value of the localMarketSpecialitySubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketSpecialitySubscription(Boolean value) {
        this.localMarketSpecialitySubscription = value;
    }

    /**
     * Gets the value of the localMarketRegularSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketRegularSubscription() {
        return localMarketRegularSubscription;
    }

    /**
     * Sets the value of the localMarketRegularSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketRegularSubscription(Boolean value) {
        this.localMarketRegularSubscription = value;
    }

    /**
     * Gets the value of the localMarketPremiumSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketPremiumSubscription() {
        return localMarketPremiumSubscription;
    }

    /**
     * Sets the value of the localMarketPremiumSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketPremiumSubscription(Boolean value) {
        this.localMarketPremiumSubscription = value;
    }

    /**
     * Gets the value of the localMarketNonSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketNonSubscription() {
        return localMarketNonSubscription;
    }

    /**
     * Sets the value of the localMarketNonSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketNonSubscription(Boolean value) {
        this.localMarketNonSubscription = value;
    }

    /**
     * Gets the value of the expressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressEnabled() {
        return expressEnabled;
    }

    /**
     * Sets the value of the expressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressEnabled(Boolean value) {
        this.expressEnabled = value;
    }

    /**
     * Gets the value of the expressPicturesRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressPicturesRequired() {
        return expressPicturesRequired;
    }

    /**
     * Sets the value of the expressPicturesRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressPicturesRequired(Boolean value) {
        this.expressPicturesRequired = value;
    }

    /**
     * Gets the value of the expressConditionRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressConditionRequired() {
        return expressConditionRequired;
    }

    /**
     * Sets the value of the expressConditionRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressConditionRequired(Boolean value) {
        this.expressConditionRequired = value;
    }

    /**
     * Gets the value of the minimumReservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumReservePrice() {
        return minimumReservePrice;
    }

    /**
     * Sets the value of the minimumReservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumReservePrice(Double value) {
        this.minimumReservePrice = value;
    }

    /**
     * Gets the value of the sellerContactDetailsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerContactDetailsEnabled() {
        return sellerContactDetailsEnabled;
    }

    /**
     * Sets the value of the sellerContactDetailsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerContactDetailsEnabled(Boolean value) {
        this.sellerContactDetailsEnabled = value;
    }

    /**
     * Gets the value of the transactionConfirmationRequestEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransactionConfirmationRequestEnabled() {
        return transactionConfirmationRequestEnabled;
    }

    /**
     * Sets the value of the transactionConfirmationRequestEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransactionConfirmationRequestEnabled(Boolean value) {
        this.transactionConfirmationRequestEnabled = value;
    }

    /**
     * Gets the value of the storeInventoryEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreInventoryEnabled() {
        return storeInventoryEnabled;
    }

    /**
     * Sets the value of the storeInventoryEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreInventoryEnabled(Boolean value) {
        this.storeInventoryEnabled = value;
    }

    /**
     * Gets the value of the skypeMeTransactionalEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkypeMeTransactionalEnabled() {
        return skypeMeTransactionalEnabled;
    }

    /**
     * Sets the value of the skypeMeTransactionalEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkypeMeTransactionalEnabled(Boolean value) {
        this.skypeMeTransactionalEnabled = value;
    }

    /**
     * Gets the value of the skypeMeNonTransactionalEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkypeMeNonTransactionalEnabled() {
        return skypeMeNonTransactionalEnabled;
    }

    /**
     * Sets the value of the skypeMeNonTransactionalEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkypeMeNonTransactionalEnabled(Boolean value) {
        this.skypeMeNonTransactionalEnabled = value;
    }

    /**
     * Gets the value of the localListingDistancesRegular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalListingDistancesRegular() {
        return localListingDistancesRegular;
    }

    /**
     * Sets the value of the localListingDistancesRegular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalListingDistancesRegular(String value) {
        this.localListingDistancesRegular = value;
    }

    /**
     * Gets the value of the localListingDistancesSpecialty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalListingDistancesSpecialty() {
        return localListingDistancesSpecialty;
    }

    /**
     * Sets the value of the localListingDistancesSpecialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalListingDistancesSpecialty(String value) {
        this.localListingDistancesSpecialty = value;
    }

    /**
     * Gets the value of the localListingDistancesNonSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalListingDistancesNonSubscription() {
        return localListingDistancesNonSubscription;
    }

    /**
     * Sets the value of the localListingDistancesNonSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalListingDistancesNonSubscription(String value) {
        this.localListingDistancesNonSubscription = value;
    }

    /**
     * Gets the value of the classifiedAdPaymentMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public ClassifiedAdPaymentMethodEnabledCodeType getClassifiedAdPaymentMethodEnabled() {
        return classifiedAdPaymentMethodEnabled;
    }

    /**
     * Sets the value of the classifiedAdPaymentMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public void setClassifiedAdPaymentMethodEnabled(ClassifiedAdPaymentMethodEnabledCodeType value) {
        this.classifiedAdPaymentMethodEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdShippingMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdShippingMethodEnabled() {
        return classifiedAdShippingMethodEnabled;
    }

    /**
     * Sets the value of the classifiedAdShippingMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdShippingMethodEnabled(Boolean value) {
        this.classifiedAdShippingMethodEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdBestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public ClassifiedAdBestOfferEnabledCodeType getClassifiedAdBestOfferEnabled() {
        return classifiedAdBestOfferEnabled;
    }

    /**
     * Sets the value of the classifiedAdBestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public void setClassifiedAdBestOfferEnabled(ClassifiedAdBestOfferEnabledCodeType value) {
        this.classifiedAdBestOfferEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdCounterOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdCounterOfferEnabled() {
        return classifiedAdCounterOfferEnabled;
    }

    /**
     * Sets the value of the classifiedAdCounterOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdCounterOfferEnabled(Boolean value) {
        this.classifiedAdCounterOfferEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdAutoDeclineEnabled() {
        return classifiedAdAutoDeclineEnabled;
    }

    /**
     * Sets the value of the classifiedAdAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdAutoDeclineEnabled(Boolean value) {
        this.classifiedAdAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdContactByPhoneEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdContactByPhoneEnabled() {
        return classifiedAdContactByPhoneEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByPhoneEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdContactByPhoneEnabled(Boolean value) {
        this.classifiedAdContactByPhoneEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdContactByEmailEnabled() {
        return classifiedAdContactByEmailEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdContactByEmailEnabled(Boolean value) {
        this.classifiedAdContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the safePaymentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSafePaymentRequired() {
        return safePaymentRequired;
    }

    /**
     * Sets the value of the safePaymentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafePaymentRequired(Boolean value) {
        this.safePaymentRequired = value;
    }

    /**
     * Gets the value of the classifiedAdPayPerLeadEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdPayPerLeadEnabled() {
        return classifiedAdPayPerLeadEnabled;
    }

    /**
     * Sets the value of the classifiedAdPayPerLeadEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdPayPerLeadEnabled(Boolean value) {
        this.classifiedAdPayPerLeadEnabled = value;
    }

    /**
     * Gets the value of the itemSpecificsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSpecificsEnabledCodeType }
     *     
     */
    public ItemSpecificsEnabledCodeType getItemSpecificsEnabled() {
        return itemSpecificsEnabled;
    }

    /**
     * Sets the value of the itemSpecificsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSpecificsEnabledCodeType }
     *     
     */
    public void setItemSpecificsEnabled(ItemSpecificsEnabledCodeType value) {
        this.itemSpecificsEnabled = value;
    }

    /**
     * Gets the value of the brandMPNIdentifierEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrandMPNIdentifierEnabled() {
        return brandMPNIdentifierEnabled;
    }

    /**
     * Sets the value of the brandMPNIdentifierEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrandMPNIdentifierEnabled(Boolean value) {
        this.brandMPNIdentifierEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdAutoAcceptEnabled() {
        return classifiedAdAutoAcceptEnabled;
    }

    /**
     * Sets the value of the classifiedAdAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdAutoAcceptEnabled(Boolean value) {
        this.classifiedAdAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the bestOfferAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferAutoAcceptEnabled() {
        return bestOfferAutoAcceptEnabled;
    }

    /**
     * Sets the value of the bestOfferAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferAutoAcceptEnabled(Boolean value) {
        this.bestOfferAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the crossBorderTradeNorthAmericaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorderTradeNorthAmericaEnabled() {
        return crossBorderTradeNorthAmericaEnabled;
    }

    /**
     * Sets the value of the crossBorderTradeNorthAmericaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorderTradeNorthAmericaEnabled(Boolean value) {
        this.crossBorderTradeNorthAmericaEnabled = value;
    }

    /**
     * Gets the value of the crossBorderTradeGBEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorderTradeGBEnabled() {
        return crossBorderTradeGBEnabled;
    }

    /**
     * Sets the value of the crossBorderTradeGBEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorderTradeGBEnabled(Boolean value) {
        this.crossBorderTradeGBEnabled = value;
    }

    /**
     * Gets the value of the crossBorderTradeAustraliaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorderTradeAustraliaEnabled() {
        return crossBorderTradeAustraliaEnabled;
    }

    /**
     * Sets the value of the crossBorderTradeAustraliaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorderTradeAustraliaEnabled(Boolean value) {
        this.crossBorderTradeAustraliaEnabled = value;
    }

    /**
     * Gets the value of the buyerGuaranteeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyerGuaranteeEnabled() {
        return buyerGuaranteeEnabled;
    }

    /**
     * Sets the value of the buyerGuaranteeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyerGuaranteeEnabled(Boolean value) {
        this.buyerGuaranteeEnabled = value;
    }

    /**
     * Gets the value of the combinedFixedPriceTreatmentEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCombinedFixedPriceTreatmentEnabled() {
        return combinedFixedPriceTreatmentEnabled;
    }

    /**
     * Sets the value of the combinedFixedPriceTreatmentEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombinedFixedPriceTreatmentEnabled(Boolean value) {
        this.combinedFixedPriceTreatmentEnabled = value;
    }

    /**
     * Gets the value of the galleryFeaturedDurations property.
     * 
     * @return
     *     possible object is
     *     {@link ListingEnhancementDurationReferenceType }
     *     
     */
    public ListingEnhancementDurationReferenceType getGalleryFeaturedDurations() {
        return galleryFeaturedDurations;
    }

    /**
     * Sets the value of the galleryFeaturedDurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingEnhancementDurationReferenceType }
     *     
     */
    public void setGalleryFeaturedDurations(ListingEnhancementDurationReferenceType value) {
        this.galleryFeaturedDurations = value;
    }

    /**
     * Gets the value of the payPalRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayPalRequired() {
        return payPalRequired;
    }

    /**
     * Sets the value of the payPalRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayPalRequired(Boolean value) {
        this.payPalRequired = value;
    }

    /**
     * Gets the value of the eBayMotorsProAdFormatEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public AdFormatEnabledCodeType getEBayMotorsProAdFormatEnabled() {
        return eBayMotorsProAdFormatEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProAdFormatEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public void setEBayMotorsProAdFormatEnabled(AdFormatEnabledCodeType value) {
        this.eBayMotorsProAdFormatEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProContactByPhoneEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProContactByPhoneEnabled() {
        return eBayMotorsProContactByPhoneEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProContactByPhoneEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProContactByPhoneEnabled(Boolean value) {
        this.eBayMotorsProContactByPhoneEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProPhoneCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEBayMotorsProPhoneCount() {
        return eBayMotorsProPhoneCount;
    }

    /**
     * Sets the value of the eBayMotorsProPhoneCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEBayMotorsProPhoneCount(Integer value) {
        this.eBayMotorsProPhoneCount = value;
    }

    /**
     * Gets the value of the eBayMotorsProContactByAddressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProContactByAddressEnabled() {
        return eBayMotorsProContactByAddressEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProContactByAddressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProContactByAddressEnabled(Boolean value) {
        this.eBayMotorsProContactByAddressEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProStreetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEBayMotorsProStreetCount() {
        return eBayMotorsProStreetCount;
    }

    /**
     * Sets the value of the eBayMotorsProStreetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEBayMotorsProStreetCount(Integer value) {
        this.eBayMotorsProStreetCount = value;
    }

    /**
     * Gets the value of the eBayMotorsProCompanyNameEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProCompanyNameEnabled() {
        return eBayMotorsProCompanyNameEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProCompanyNameEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProCompanyNameEnabled(Boolean value) {
        this.eBayMotorsProCompanyNameEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProContactByEmailEnabled() {
        return eBayMotorsProContactByEmailEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProContactByEmailEnabled(Boolean value) {
        this.eBayMotorsProContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProBestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public ClassifiedAdBestOfferEnabledCodeType getEBayMotorsProBestOfferEnabled() {
        return eBayMotorsProBestOfferEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProBestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public void setEBayMotorsProBestOfferEnabled(ClassifiedAdBestOfferEnabledCodeType value) {
        this.eBayMotorsProBestOfferEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProAutoAcceptEnabled() {
        return eBayMotorsProAutoAcceptEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProAutoAcceptEnabled(Boolean value) {
        this.eBayMotorsProAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProAutoDeclineEnabled() {
        return eBayMotorsProAutoDeclineEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProAutoDeclineEnabled(Boolean value) {
        this.eBayMotorsProAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProPaymentMethodCheckOutEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public ClassifiedAdPaymentMethodEnabledCodeType getEBayMotorsProPaymentMethodCheckOutEnabled() {
        return eBayMotorsProPaymentMethodCheckOutEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProPaymentMethodCheckOutEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public void setEBayMotorsProPaymentMethodCheckOutEnabled(ClassifiedAdPaymentMethodEnabledCodeType value) {
        this.eBayMotorsProPaymentMethodCheckOutEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProShippingMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProShippingMethodEnabled() {
        return eBayMotorsProShippingMethodEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProShippingMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProShippingMethodEnabled(Boolean value) {
        this.eBayMotorsProShippingMethodEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProCounterOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProCounterOfferEnabled() {
        return eBayMotorsProCounterOfferEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProCounterOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProCounterOfferEnabled(Boolean value) {
        this.eBayMotorsProCounterOfferEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProSellerContactDetailsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayMotorsProSellerContactDetailsEnabled() {
        return eBayMotorsProSellerContactDetailsEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProSellerContactDetailsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayMotorsProSellerContactDetailsEnabled(Boolean value) {
        this.eBayMotorsProSellerContactDetailsEnabled = value;
    }

    /**
     * Gets the value of the localMarketAdFormatEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public AdFormatEnabledCodeType getLocalMarketAdFormatEnabled() {
        return localMarketAdFormatEnabled;
    }

    /**
     * Sets the value of the localMarketAdFormatEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdFormatEnabledCodeType }
     *     
     */
    public void setLocalMarketAdFormatEnabled(AdFormatEnabledCodeType value) {
        this.localMarketAdFormatEnabled = value;
    }

    /**
     * Gets the value of the localMarketContactByPhoneEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketContactByPhoneEnabled() {
        return localMarketContactByPhoneEnabled;
    }

    /**
     * Sets the value of the localMarketContactByPhoneEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketContactByPhoneEnabled(Boolean value) {
        this.localMarketContactByPhoneEnabled = value;
    }

    /**
     * Gets the value of the localMarketPhoneCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalMarketPhoneCount() {
        return localMarketPhoneCount;
    }

    /**
     * Sets the value of the localMarketPhoneCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalMarketPhoneCount(Integer value) {
        this.localMarketPhoneCount = value;
    }

    /**
     * Gets the value of the localMarketContactByAddressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketContactByAddressEnabled() {
        return localMarketContactByAddressEnabled;
    }

    /**
     * Sets the value of the localMarketContactByAddressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketContactByAddressEnabled(Boolean value) {
        this.localMarketContactByAddressEnabled = value;
    }

    /**
     * Gets the value of the localMarketStreetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalMarketStreetCount() {
        return localMarketStreetCount;
    }

    /**
     * Sets the value of the localMarketStreetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalMarketStreetCount(Integer value) {
        this.localMarketStreetCount = value;
    }

    /**
     * Gets the value of the localMarketCompanyNameEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketCompanyNameEnabled() {
        return localMarketCompanyNameEnabled;
    }

    /**
     * Sets the value of the localMarketCompanyNameEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketCompanyNameEnabled(Boolean value) {
        this.localMarketCompanyNameEnabled = value;
    }

    /**
     * Gets the value of the localMarketContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketContactByEmailEnabled() {
        return localMarketContactByEmailEnabled;
    }

    /**
     * Sets the value of the localMarketContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketContactByEmailEnabled(Boolean value) {
        this.localMarketContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the localMarketBestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public ClassifiedAdBestOfferEnabledCodeType getLocalMarketBestOfferEnabled() {
        return localMarketBestOfferEnabled;
    }

    /**
     * Sets the value of the localMarketBestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdBestOfferEnabledCodeType }
     *     
     */
    public void setLocalMarketBestOfferEnabled(ClassifiedAdBestOfferEnabledCodeType value) {
        this.localMarketBestOfferEnabled = value;
    }

    /**
     * Gets the value of the localMarketAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketAutoAcceptEnabled() {
        return localMarketAutoAcceptEnabled;
    }

    /**
     * Sets the value of the localMarketAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketAutoAcceptEnabled(Boolean value) {
        this.localMarketAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the localMarketAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketAutoDeclineEnabled() {
        return localMarketAutoDeclineEnabled;
    }

    /**
     * Sets the value of the localMarketAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketAutoDeclineEnabled(Boolean value) {
        this.localMarketAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the localMarketPaymentMethodCheckOutEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public ClassifiedAdPaymentMethodEnabledCodeType getLocalMarketPaymentMethodCheckOutEnabled() {
        return localMarketPaymentMethodCheckOutEnabled;
    }

    /**
     * Sets the value of the localMarketPaymentMethodCheckOutEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdPaymentMethodEnabledCodeType }
     *     
     */
    public void setLocalMarketPaymentMethodCheckOutEnabled(ClassifiedAdPaymentMethodEnabledCodeType value) {
        this.localMarketPaymentMethodCheckOutEnabled = value;
    }

    /**
     * Gets the value of the localMarketShippingMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketShippingMethodEnabled() {
        return localMarketShippingMethodEnabled;
    }

    /**
     * Sets the value of the localMarketShippingMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketShippingMethodEnabled(Boolean value) {
        this.localMarketShippingMethodEnabled = value;
    }

    /**
     * Gets the value of the localMarketCounterOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketCounterOfferEnabled() {
        return localMarketCounterOfferEnabled;
    }

    /**
     * Sets the value of the localMarketCounterOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketCounterOfferEnabled(Boolean value) {
        this.localMarketCounterOfferEnabled = value;
    }

    /**
     * Gets the value of the localMarketSellerContactDetailsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalMarketSellerContactDetailsEnabled() {
        return localMarketSellerContactDetailsEnabled;
    }

    /**
     * Sets the value of the localMarketSellerContactDetailsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalMarketSellerContactDetailsEnabled(Boolean value) {
        this.localMarketSellerContactDetailsEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdPhoneCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassifiedAdPhoneCount() {
        return classifiedAdPhoneCount;
    }

    /**
     * Sets the value of the classifiedAdPhoneCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassifiedAdPhoneCount(Integer value) {
        this.classifiedAdPhoneCount = value;
    }

    /**
     * Gets the value of the classifiedAdContactByAddressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdContactByAddressEnabled() {
        return classifiedAdContactByAddressEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByAddressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdContactByAddressEnabled(Boolean value) {
        this.classifiedAdContactByAddressEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdStreetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassifiedAdStreetCount() {
        return classifiedAdStreetCount;
    }

    /**
     * Sets the value of the classifiedAdStreetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassifiedAdStreetCount(Integer value) {
        this.classifiedAdStreetCount = value;
    }

    /**
     * Gets the value of the classifiedAdCompanyNameEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdCompanyNameEnabled() {
        return classifiedAdCompanyNameEnabled;
    }

    /**
     * Sets the value of the classifiedAdCompanyNameEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdCompanyNameEnabled(Boolean value) {
        this.classifiedAdCompanyNameEnabled = value;
    }

    /**
     * Gets the value of the specialitySubscription property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public GeographicExposureCodeType getSpecialitySubscription() {
        return specialitySubscription;
    }

    /**
     * Sets the value of the specialitySubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public void setSpecialitySubscription(GeographicExposureCodeType value) {
        this.specialitySubscription = value;
    }

    /**
     * Gets the value of the regularSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public GeographicExposureCodeType getRegularSubscription() {
        return regularSubscription;
    }

    /**
     * Sets the value of the regularSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public void setRegularSubscription(GeographicExposureCodeType value) {
        this.regularSubscription = value;
    }

    /**
     * Gets the value of the premiumSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public GeographicExposureCodeType getPremiumSubscription() {
        return premiumSubscription;
    }

    /**
     * Sets the value of the premiumSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public void setPremiumSubscription(GeographicExposureCodeType value) {
        this.premiumSubscription = value;
    }

    /**
     * Gets the value of the nonSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public GeographicExposureCodeType getNonSubscription() {
        return nonSubscription;
    }

    /**
     * Sets the value of the nonSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicExposureCodeType }
     *     
     */
    public void setNonSubscription(GeographicExposureCodeType value) {
        this.nonSubscription = value;
    }

    /**
     * Gets the value of the payPalRequiredForStoreOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayPalRequiredForStoreOwner() {
        return payPalRequiredForStoreOwner;
    }

    /**
     * Sets the value of the payPalRequiredForStoreOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayPalRequiredForStoreOwner(Boolean value) {
        this.payPalRequiredForStoreOwner = value;
    }

    /**
     * Gets the value of the reviseQuantityAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReviseQuantityAllowed() {
        return reviseQuantityAllowed;
    }

    /**
     * Sets the value of the reviseQuantityAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReviseQuantityAllowed(Boolean value) {
        this.reviseQuantityAllowed = value;
    }

    /**
     * Gets the value of the revisePriceAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevisePriceAllowed() {
        return revisePriceAllowed;
    }

    /**
     * Sets the value of the revisePriceAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevisePriceAllowed(Boolean value) {
        this.revisePriceAllowed = value;
    }

    /**
     * Gets the value of the storeOwnerExtendedListingDurationsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreOwnerExtendedListingDurationsEnabled() {
        return storeOwnerExtendedListingDurationsEnabled;
    }

    /**
     * Sets the value of the storeOwnerExtendedListingDurationsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreOwnerExtendedListingDurationsEnabled(Boolean value) {
        this.storeOwnerExtendedListingDurationsEnabled = value;
    }

    /**
     * Gets the value of the storeOwnerExtendedListingDurations property.
     * 
     * @return
     *     possible object is
     *     {@link StoreOwnerExtendedListingDurationsType }
     *     
     */
    public StoreOwnerExtendedListingDurationsType getStoreOwnerExtendedListingDurations() {
        return storeOwnerExtendedListingDurations;
    }

    /**
     * Sets the value of the storeOwnerExtendedListingDurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreOwnerExtendedListingDurationsType }
     *     
     */
    public void setStoreOwnerExtendedListingDurations(StoreOwnerExtendedListingDurationsType value) {
        this.storeOwnerExtendedListingDurations = value;
    }

    /**
     * Gets the value of the returnPolicyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnPolicyEnabled() {
        return returnPolicyEnabled;
    }

    /**
     * Sets the value of the returnPolicyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnPolicyEnabled(Boolean value) {
        this.returnPolicyEnabled = value;
    }

    /**
     * Gets the value of the handlingTimeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandlingTimeEnabled() {
        return handlingTimeEnabled;
    }

    /**
     * Sets the value of the handlingTimeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandlingTimeEnabled(Boolean value) {
        this.handlingTimeEnabled = value;
    }

    /**
     * Gets the value of the maxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaxFlatShippingCost() {
        return maxFlatShippingCost;
    }

    /**
     * Sets the value of the maxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaxFlatShippingCost(AmountType value) {
        this.maxFlatShippingCost = value;
    }

    /**
     * Gets the value of the maxFlatShippingCostCBTExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxFlatShippingCostCBTExempt() {
        return maxFlatShippingCostCBTExempt;
    }

    /**
     * Sets the value of the maxFlatShippingCostCBTExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxFlatShippingCostCBTExempt(Boolean value) {
        this.maxFlatShippingCostCBTExempt = value;
    }

    /**
     * Gets the value of the group1MaxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGroup1MaxFlatShippingCost() {
        return group1MaxFlatShippingCost;
    }

    /**
     * Sets the value of the group1MaxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGroup1MaxFlatShippingCost(AmountType value) {
        this.group1MaxFlatShippingCost = value;
    }

    /**
     * Gets the value of the group2MaxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGroup2MaxFlatShippingCost() {
        return group2MaxFlatShippingCost;
    }

    /**
     * Sets the value of the group2MaxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGroup2MaxFlatShippingCost(AmountType value) {
        this.group2MaxFlatShippingCost = value;
    }

    /**
     * Gets the value of the group3MaxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGroup3MaxFlatShippingCost() {
        return group3MaxFlatShippingCost;
    }

    /**
     * Sets the value of the group3MaxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGroup3MaxFlatShippingCost(AmountType value) {
        this.group3MaxFlatShippingCost = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType[] getPaymentMethod() {
        if (this.paymentMethod == null) {
            return new BuyerPaymentMethodCodeType[ 0 ] ;
        }
        return ((BuyerPaymentMethodCodeType[]) this.paymentMethod.toArray(new BuyerPaymentMethodCodeType[this.paymentMethod.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType getPaymentMethod(int idx) {
        if (this.paymentMethod == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.paymentMethod.get(idx);
    }

    public int getPaymentMethodLength() {
        if (this.paymentMethod == null) {
            return  0;
        }
        return this.paymentMethod.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public void setPaymentMethod(BuyerPaymentMethodCodeType[] values) {
        this._getPaymentMethod().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.paymentMethod.add(values[i]);
        }
    }

    protected List<BuyerPaymentMethodCodeType> _getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<BuyerPaymentMethodCodeType>();
        }
        return paymentMethod;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType setPaymentMethod(int idx, BuyerPaymentMethodCodeType value) {
        return this.paymentMethod.set(idx, value);
    }

    /**
     * Gets the value of the variationsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVariationsEnabled() {
        return variationsEnabled;
    }

    /**
     * Sets the value of the variationsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVariationsEnabled(Boolean value) {
        this.variationsEnabled = value;
    }

    /**
     * Gets the value of the attributeConversionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeConversionEnabledCodeType }
     *     
     */
    public AttributeConversionEnabledCodeType getAttributeConversionEnabled() {
        return attributeConversionEnabled;
    }

    /**
     * Sets the value of the attributeConversionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeConversionEnabledCodeType }
     *     
     */
    public void setAttributeConversionEnabled(AttributeConversionEnabledCodeType value) {
        this.attributeConversionEnabled = value;
    }

    /**
     * Gets the value of the freeGalleryPlusEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeGalleryPlusEnabled() {
        return freeGalleryPlusEnabled;
    }

    /**
     * Sets the value of the freeGalleryPlusEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeGalleryPlusEnabled(Boolean value) {
        this.freeGalleryPlusEnabled = value;
    }

    /**
     * Gets the value of the freePicturePackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreePicturePackEnabled() {
        return freePicturePackEnabled;
    }

    /**
     * Sets the value of the freePicturePackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreePicturePackEnabled(Boolean value) {
        this.freePicturePackEnabled = value;
    }

    /**
     * Gets the value of the itemCompatibilityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCompatibilityEnabledCodeType }
     *     
     */
    public ItemCompatibilityEnabledCodeType getItemCompatibilityEnabled() {
        return itemCompatibilityEnabled;
    }

    /**
     * Sets the value of the itemCompatibilityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCompatibilityEnabledCodeType }
     *     
     */
    public void setItemCompatibilityEnabled(ItemCompatibilityEnabledCodeType value) {
        this.itemCompatibilityEnabled = value;
    }

    /**
     * Gets the value of the minItemCompatibility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinItemCompatibility() {
        return minItemCompatibility;
    }

    /**
     * Sets the value of the minItemCompatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinItemCompatibility(Integer value) {
        this.minItemCompatibility = value;
    }

    /**
     * Gets the value of the maxItemCompatibility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxItemCompatibility() {
        return maxItemCompatibility;
    }

    /**
     * Sets the value of the maxItemCompatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxItemCompatibility(Integer value) {
        this.maxItemCompatibility = value;
    }

    /**
     * Gets the value of the conditionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionEnabledCodeType }
     *     
     */
    public ConditionEnabledCodeType getConditionEnabled() {
        return conditionEnabled;
    }

    /**
     * Sets the value of the conditionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionEnabledCodeType }
     *     
     */
    public void setConditionEnabled(ConditionEnabledCodeType value) {
        this.conditionEnabled = value;
    }

    /**
     * Gets the value of the conditionValues property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionValuesType }
     *     
     */
    public ConditionValuesType getConditionValues() {
        return conditionValues;
    }

    /**
     * Sets the value of the conditionValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionValuesType }
     *     
     */
    public void setConditionValues(ConditionValuesType value) {
        this.conditionValues = value;
    }

    /**
     * Gets the value of the specialFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionValuesType }
     *     
     */
    public ConditionValuesType getSpecialFeatures() {
        return specialFeatures;
    }

    /**
     * Sets the value of the specialFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionValuesType }
     *     
     */
    public void setSpecialFeatures(ConditionValuesType value) {
        this.specialFeatures = value;
    }

    /**
     * Gets the value of the valueCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValueCategory() {
        return valueCategory;
    }

    /**
     * Sets the value of the valueCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValueCategory(Boolean value) {
        this.valueCategory = value;
    }

    /**
     * Gets the value of the productCreationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCreationEnabledCodeType }
     *     
     */
    public ProductCreationEnabledCodeType getProductCreationEnabled() {
        return productCreationEnabled;
    }

    /**
     * Sets the value of the productCreationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCreationEnabledCodeType }
     *     
     */
    public void setProductCreationEnabled(ProductCreationEnabledCodeType value) {
        this.productCreationEnabled = value;
    }

    /**
     * Gets the value of the eanEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public ProductIdentiferEnabledCodeType getEANEnabled() {
        return eanEnabled;
    }

    /**
     * Sets the value of the eanEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public void setEANEnabled(ProductIdentiferEnabledCodeType value) {
        this.eanEnabled = value;
    }

    /**
     * Gets the value of the isbnEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public ProductIdentiferEnabledCodeType getISBNEnabled() {
        return isbnEnabled;
    }

    /**
     * Sets the value of the isbnEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public void setISBNEnabled(ProductIdentiferEnabledCodeType value) {
        this.isbnEnabled = value;
    }

    /**
     * Gets the value of the upcEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public ProductIdentiferEnabledCodeType getUPCEnabled() {
        return upcEnabled;
    }

    /**
     * Sets the value of the upcEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentiferEnabledCodeType }
     *     
     */
    public void setUPCEnabled(ProductIdentiferEnabledCodeType value) {
        this.upcEnabled = value;
    }

    /**
     * Gets the value of the maxGranularFitmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxGranularFitmentCount() {
        return maxGranularFitmentCount;
    }

    /**
     * Sets the value of the maxGranularFitmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxGranularFitmentCount(Integer value) {
        this.maxGranularFitmentCount = value;
    }

    /**
     * Gets the value of the compatibleVehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleVehicleType() {
        return compatibleVehicleType;
    }

    /**
     * Sets the value of the compatibleVehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleVehicleType(String value) {
        this.compatibleVehicleType = value;
    }

    /**
     * Gets the value of the shippingProfileCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public ProfileCategoryGroupCodeType getShippingProfileCategoryGroup() {
        return shippingProfileCategoryGroup;
    }

    /**
     * Sets the value of the shippingProfileCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public void setShippingProfileCategoryGroup(ProfileCategoryGroupCodeType value) {
        this.shippingProfileCategoryGroup = value;
    }

    /**
     * Gets the value of the paymentProfileCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public ProfileCategoryGroupCodeType getPaymentProfileCategoryGroup() {
        return paymentProfileCategoryGroup;
    }

    /**
     * Sets the value of the paymentProfileCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public void setPaymentProfileCategoryGroup(ProfileCategoryGroupCodeType value) {
        this.paymentProfileCategoryGroup = value;
    }

    /**
     * Gets the value of the returnPolicyProfileCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public ProfileCategoryGroupCodeType getReturnPolicyProfileCategoryGroup() {
        return returnPolicyProfileCategoryGroup;
    }

    /**
     * Sets the value of the returnPolicyProfileCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCategoryGroupCodeType }
     *     
     */
    public void setReturnPolicyProfileCategoryGroup(ProfileCategoryGroupCodeType value) {
        this.returnPolicyProfileCategoryGroup = value;
    }

    /**
     * Gets the value of the vinSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVINSupported() {
        return vinSupported;
    }

    /**
     * Sets the value of the vinSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVINSupported(Boolean value) {
        this.vinSupported = value;
    }

    /**
     * Gets the value of the vrmSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVRMSupported() {
        return vrmSupported;
    }

    /**
     * Sets the value of the vrmSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVRMSupported(Boolean value) {
        this.vrmSupported = value;
    }

    /**
     * Gets the value of the sellerProvidedTitleSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerProvidedTitleSupported() {
        return sellerProvidedTitleSupported;
    }

    /**
     * Sets the value of the sellerProvidedTitleSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerProvidedTitleSupported(Boolean value) {
        this.sellerProvidedTitleSupported = value;
    }

    /**
     * Gets the value of the depositSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositSupported() {
        return depositSupported;
    }

    /**
     * Sets the value of the depositSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositSupported(Boolean value) {
        this.depositSupported = value;
    }

    /**
     * Gets the value of the globalShippingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalShippingEnabled() {
        return globalShippingEnabled;
    }

    /**
     * Sets the value of the globalShippingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalShippingEnabled(Boolean value) {
        this.globalShippingEnabled = value;
    }

    /**
     * Gets the value of the additionalCompatibilityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalCompatibilityEnabled() {
        return additionalCompatibilityEnabled;
    }

    /**
     * Sets the value of the additionalCompatibilityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalCompatibilityEnabled(Boolean value) {
        this.additionalCompatibilityEnabled = value;
    }

    /**
     * Gets the value of the pickupDropOffEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupDropOffEnabled() {
        return pickupDropOffEnabled;
    }

    /**
     * Sets the value of the pickupDropOffEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupDropOffEnabled(Boolean value) {
        this.pickupDropOffEnabled = value;
    }

    /**
     * Gets the value of the digitalGoodDeliveryEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigitalGoodDeliveryEnabled() {
        return digitalGoodDeliveryEnabled;
    }

    /**
     * Sets the value of the digitalGoodDeliveryEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigitalGoodDeliveryEnabled(Boolean value) {
        this.digitalGoodDeliveryEnabled = value;
    }

    /**
     * Gets the value of the epidSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEpidSupported() {
        return epidSupported;
    }

    /**
     * Sets the value of the epidSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEpidSupported(Boolean value) {
        this.epidSupported = value;
    }

    /**
     * Gets the value of the kTypeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKTypeSupported() {
        return kTypeSupported;
    }

    /**
     * Sets the value of the kTypeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKTypeSupported(Boolean value) {
        this.kTypeSupported = value;
    }

    /**
     * Gets the value of the productRequiredEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRequiredEnabledCodeType }
     *     
     */
    public ProductRequiredEnabledCodeType getProductRequiredEnabled() {
        return productRequiredEnabled;
    }

    /**
     * Sets the value of the productRequiredEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRequiredEnabledCodeType }
     *     
     */
    public void setProductRequiredEnabled(ProductRequiredEnabledCodeType value) {
        this.productRequiredEnabled = value;
    }

    /**
     * Gets the value of the domesticReturnsAcceptedValues property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticReturnsAcceptedCodeType }
     *     
     */
    public DomesticReturnsAcceptedCodeType getDomesticReturnsAcceptedValues() {
        return domesticReturnsAcceptedValues;
    }

    /**
     * Sets the value of the domesticReturnsAcceptedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticReturnsAcceptedCodeType }
     *     
     */
    public void setDomesticReturnsAcceptedValues(DomesticReturnsAcceptedCodeType value) {
        this.domesticReturnsAcceptedValues = value;
    }

    /**
     * Gets the value of the internationalReturnsAcceptedValues property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalReturnsAcceptedCodeType }
     *     
     */
    public InternationalReturnsAcceptedCodeType getInternationalReturnsAcceptedValues() {
        return internationalReturnsAcceptedValues;
    }

    /**
     * Sets the value of the internationalReturnsAcceptedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalReturnsAcceptedCodeType }
     *     
     */
    public void setInternationalReturnsAcceptedValues(InternationalReturnsAcceptedCodeType value) {
        this.internationalReturnsAcceptedValues = value;
    }

    /**
     * Gets the value of the domesticReturnsDurationValues property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticReturnsDurationCodeType }
     *     
     */
    public DomesticReturnsDurationCodeType getDomesticReturnsDurationValues() {
        return domesticReturnsDurationValues;
    }

    /**
     * Sets the value of the domesticReturnsDurationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticReturnsDurationCodeType }
     *     
     */
    public void setDomesticReturnsDurationValues(DomesticReturnsDurationCodeType value) {
        this.domesticReturnsDurationValues = value;
    }

    /**
     * Gets the value of the internationalReturnsDurationValues property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalReturnsDurationCodeType }
     *     
     */
    public InternationalReturnsDurationCodeType getInternationalReturnsDurationValues() {
        return internationalReturnsDurationValues;
    }

    /**
     * Sets the value of the internationalReturnsDurationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalReturnsDurationCodeType }
     *     
     */
    public void setInternationalReturnsDurationValues(InternationalReturnsDurationCodeType value) {
        this.internationalReturnsDurationValues = value;
    }

    /**
     * Gets the value of the domesticReturnsShipmentPayeeValues property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticReturnsShipmentPayeeCodeType }
     *     
     */
    public DomesticReturnsShipmentPayeeCodeType getDomesticReturnsShipmentPayeeValues() {
        return domesticReturnsShipmentPayeeValues;
    }

    /**
     * Sets the value of the domesticReturnsShipmentPayeeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticReturnsShipmentPayeeCodeType }
     *     
     */
    public void setDomesticReturnsShipmentPayeeValues(DomesticReturnsShipmentPayeeCodeType value) {
        this.domesticReturnsShipmentPayeeValues = value;
    }

    /**
     * Gets the value of the internationalReturnsShipmentPayeeValues property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalReturnsShipmentPayeeCodeType }
     *     
     */
    public InternationalReturnsShipmentPayeeCodeType getInternationalReturnsShipmentPayeeValues() {
        return internationalReturnsShipmentPayeeValues;
    }

    /**
     * Sets the value of the internationalReturnsShipmentPayeeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalReturnsShipmentPayeeCodeType }
     *     
     */
    public void setInternationalReturnsShipmentPayeeValues(InternationalReturnsShipmentPayeeCodeType value) {
        this.internationalReturnsShipmentPayeeValues = value;
    }

    /**
     * Gets the value of the domesticRefundMethodValues property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticRefundMethodCodeType }
     *     
     */
    public DomesticRefundMethodCodeType getDomesticRefundMethodValues() {
        return domesticRefundMethodValues;
    }

    /**
     * Sets the value of the domesticRefundMethodValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticRefundMethodCodeType }
     *     
     */
    public void setDomesticRefundMethodValues(DomesticRefundMethodCodeType value) {
        this.domesticRefundMethodValues = value;
    }

    /**
     * Gets the value of the internationalRefundMethodValues property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalRefundMethodCodeType }
     *     
     */
    public InternationalRefundMethodCodeType getInternationalRefundMethodValues() {
        return internationalRefundMethodValues;
    }

    /**
     * Sets the value of the internationalRefundMethodValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalRefundMethodCodeType }
     *     
     */
    public void setInternationalRefundMethodValues(InternationalRefundMethodCodeType value) {
        this.internationalRefundMethodValues = value;
    }

    /**
     * Gets the value of the returnPolicyDescriptionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnPolicyDescriptionEnabled() {
        return returnPolicyDescriptionEnabled;
    }

    /**
     * Sets the value of the returnPolicyDescriptionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnPolicyDescriptionEnabled(Boolean value) {
        this.returnPolicyDescriptionEnabled = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
