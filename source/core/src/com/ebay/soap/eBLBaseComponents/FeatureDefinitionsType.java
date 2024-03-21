
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
 * 				This type is used by the <b>FeatureDefinitions</b> container that is returned in the <b>GetCategoryFeatures</b> response to indicate which eBay features are available on one more eBay marketplaces. If no <b>FeatureID</b> field is included in the call request, all eBay features available for one more eBay marketplaces are returned. If one or more <b>FeatureID</b> fields are included in the call request, only those eBay features specified in each <b>FeatureID</b> field are returned in the response.
 * 			
 * 
 * <p>Java class for FeatureDefinitionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureDefinitionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListingDurations" type="{urn:ebay:apis:eBLBaseComponents}ListingDurationDefinitionsType" minOccurs="0"/>
 *         &lt;element name="ShippingTermsRequired" type="{urn:ebay:apis:eBLBaseComponents}ShippingTermRequiredDefinitionType" minOccurs="0"/>
 *         &lt;element name="BestOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}BestOfferEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="DutchBINEnabled" type="{urn:ebay:apis:eBLBaseComponents}DutchBINEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="UserConsentRequired" type="{urn:ebay:apis:eBLBaseComponents}UserConsentRequiredDefinitionType" minOccurs="0"/>
 *         &lt;element name="HomePageFeaturedEnabled" type="{urn:ebay:apis:eBLBaseComponents}HomePageFeaturedEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ProPackEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProPackEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="BasicUpgradePackEnabled" type="{urn:ebay:apis:eBLBaseComponents}BasicUpgradePackEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ValuePackEnabled" type="{urn:ebay:apis:eBLBaseComponents}ValuePackEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ProPackPlusEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProPackPlusEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="AdFormatEnabled" type="{urn:ebay:apis:eBLBaseComponents}AdFormatEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="BestOfferCounterEnabled" type="{urn:ebay:apis:eBLBaseComponents}BestOfferCounterEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="BestOfferAutoDeclineEnabled" type="{urn:ebay:apis:eBLBaseComponents}BestOfferAutoDeclineEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketSpecialitySubscription" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketSpecialitySubscriptionDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketRegularSubscription" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketRegularSubscriptionDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketPremiumSubscription" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketPremiumSubscriptionDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketNonSubscription" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketNonSubscriptionDefinitionType" minOccurs="0"/>
 *         &lt;element name="ExpressEnabled" type="{urn:ebay:apis:eBLBaseComponents}ExpressEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ExpressPicturesRequired" type="{urn:ebay:apis:eBLBaseComponents}ExpressPicturesRequiredDefinitionType" minOccurs="0"/>
 *         &lt;element name="ExpressConditionRequired" type="{urn:ebay:apis:eBLBaseComponents}ExpressConditionRequiredDefinitionType" minOccurs="0"/>
 *         &lt;element name="MinimumReservePrice" type="{urn:ebay:apis:eBLBaseComponents}MinimumReservePriceDefinitionType" minOccurs="0"/>
 *         &lt;element name="TransactionConfirmationRequestEnabled" type="{urn:ebay:apis:eBLBaseComponents}TCREnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="SellerContactDetailsEnabled" type="{urn:ebay:apis:eBLBaseComponents}SellerContactDetailsEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="StoreInventoryEnabled" type="{urn:ebay:apis:eBLBaseComponents}StoreInventoryEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="SkypeMeTransactionalEnabled" type="{urn:ebay:apis:eBLBaseComponents}SkypeMeTransactionalEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="SkypeMeNonTransactionalEnabled" type="{urn:ebay:apis:eBLBaseComponents}SkypeMeNonTransactionalEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalListingDistancesRegular" type="{urn:ebay:apis:eBLBaseComponents}LocalListingDistancesRegularDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalListingDistancesSpecialty" type="{urn:ebay:apis:eBLBaseComponents}LocalListingDistancesSpecialtyDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalListingDistancesNonSubscription" type="{urn:ebay:apis:eBLBaseComponents}LocalListingDistancesNonSubscriptionDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdPaymentMethodEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdPaymentMethodEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdShippingMethodEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdShippingMethodEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdBestOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdBestOfferEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdCounterOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdCounterOfferEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdAutoDeclineEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdAutoDeclineEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByPhoneEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdContactByPhoneEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByEmailEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdContactByEmailEnabledDefintionType" minOccurs="0"/>
 *         &lt;element name="SafePaymentRequired" type="{urn:ebay:apis:eBLBaseComponents}SafePaymentRequiredDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdPayPerLeadEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdPayPerLeadEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ItemSpecificsEnabled" type="{urn:ebay:apis:eBLBaseComponents}ItemSpecificsEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="PaisaPayFullEscrowEnabled" type="{urn:ebay:apis:eBLBaseComponents}PaisaPayFullEscrowEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ISBNIdentifierEnabled" type="{urn:ebay:apis:eBLBaseComponents}ISBNIdentifierEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="UPCIdentifierEnabled" type="{urn:ebay:apis:eBLBaseComponents}UPCIdentifierEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="EANIdentifierEnabled" type="{urn:ebay:apis:eBLBaseComponents}EANIdentifierEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="BrandMPNIdentifierEnabled" type="{urn:ebay:apis:eBLBaseComponents}BrandMPNIdentifierEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="BestOfferAutoAcceptEnabled" type="{urn:ebay:apis:eBLBaseComponents}BestOfferAutoAcceptEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdAutoAcceptEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdAutoAcceptEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="CrossBorderTradeNorthAmericaEnabled" type="{urn:ebay:apis:eBLBaseComponents}CrossBorderTradeNorthAmericaEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="CrossBorderTradeGBEnabled" type="{urn:ebay:apis:eBLBaseComponents}CrossBorderTradeGBEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="CrossBorderTradeAustraliaEnabled" type="{urn:ebay:apis:eBLBaseComponents}CrossBorderTradeAustraliaEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="PayPalBuyerProtectionEnabled" type="{urn:ebay:apis:eBLBaseComponents}PayPalBuyerProtectionEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="BuyerGuaranteeEnabled" type="{urn:ebay:apis:eBLBaseComponents}BuyerGuaranteeEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="CombinedFixedPriceTreatmentEnabled" type="{urn:ebay:apis:eBLBaseComponents}CombinedFixedPriceTreatmentEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="GalleryFeaturedDurations" type="{urn:ebay:apis:eBLBaseComponents}ListingEnhancementDurationDefinitionType" minOccurs="0"/>
 *         &lt;element name="INEscrowWorkflowTimeline" type="{urn:ebay:apis:eBLBaseComponents}INEscrowWorkflowTimelineDefinitionType" minOccurs="0"/>
 *         &lt;element name="PayPalRequired" type="{urn:ebay:apis:eBLBaseComponents}PayPalRequiredDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProAdFormatEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProAdFormatEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProContactByPhoneEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProContactByPhoneEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProPhoneCount" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProPhoneCountDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProContactByAddressEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProContactByAddressEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProStreetCount" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProStreetCountDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProCompanyNameEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProCompanyNameEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProContactByEmailEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProContactByEmailEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProBestOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProBestOfferEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProAutoAcceptEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProAutoAcceptEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProAutoDeclineEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProAutoDeclineEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProPaymentMethodCheckOutEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProPaymentMethodCheckOutEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProShippingMethodEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProShippingMethodEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProCounterOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProCounterOfferEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="eBayMotorsProSellerContactDetailsEnabled" type="{urn:ebay:apis:eBLBaseComponents}eBayMotorsProSellerContactDetailsEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketAdFormatEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketAdFormatEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketContactByPhoneEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketContactByPhoneEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketPhoneCount" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketPhoneCountDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketContactByAddressEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketContactByAddressEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketStreetCount" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketStreetCountDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketCompanyNameEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketCompanyNameEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketContactByEmailEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketContactByEmailEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketBestOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketBestOfferEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketAutoAcceptEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketAutoAcceptEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketAutoDeclineEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketAutoDeclineEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketPaymentMethodCheckOutEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketPaymentMethodCheckOutEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketShippingMethodEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketShippingMethodEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketCounterOfferEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketCounterOfferEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="LocalMarketSellerContactDetailsEnabled" type="{urn:ebay:apis:eBLBaseComponents}LocalMarketSellerContactDetailsEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdPhoneCount" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdPhoneCountDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByAddressEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdContactByAddressEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdStreetCount" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdStreetCountDefinitionType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdCompanyNameEnabled" type="{urn:ebay:apis:eBLBaseComponents}ClassifiedAdCompanyNameEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="SpecialitySubscription" type="{urn:ebay:apis:eBLBaseComponents}SpecialitySubscriptionDefinitionType" minOccurs="0"/>
 *         &lt;element name="RegularSubscription" type="{urn:ebay:apis:eBLBaseComponents}RegularSubscriptionDefinitionType" minOccurs="0"/>
 *         &lt;element name="PremiumSubscription" type="{urn:ebay:apis:eBLBaseComponents}PremiumSubscriptionDefinitionType" minOccurs="0"/>
 *         &lt;element name="NonSubscription" type="{urn:ebay:apis:eBLBaseComponents}NonSubscriptionDefinitionType" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyEnabled" type="{urn:ebay:apis:eBLBaseComponents}ReturnPolicyEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="HandlingTimeEnabled" type="{urn:ebay:apis:eBLBaseComponents}HandlingTimeEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="PayPalRequiredForStoreOwner" type="{urn:ebay:apis:eBLBaseComponents}PayPalRequiredForStoreOwnerDefinitionType" minOccurs="0"/>
 *         &lt;element name="ReviseQuantityAllowed" type="{urn:ebay:apis:eBLBaseComponents}ReviseQuantityAllowedDefinitionType" minOccurs="0"/>
 *         &lt;element name="RevisePriceAllowed" type="{urn:ebay:apis:eBLBaseComponents}RevisePriceAllowedDefinitionType" minOccurs="0"/>
 *         &lt;element name="StoreOwnerExtendedListingDurationsEnabled" type="{urn:ebay:apis:eBLBaseComponents}StoreOwnerExtendedListingDurationsEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="StoreOwnerExtendedListingDurations" type="{urn:ebay:apis:eBLBaseComponents}StoreOwnerExtendedListingDurationsDefinitionType" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}PaymentMethodDefinitionType" minOccurs="0"/>
 *         &lt;element name="Group1MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}Group1MaxFlatShippingCostDefinitionType" minOccurs="0"/>
 *         &lt;element name="Group2MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}Group2MaxFlatShippingCostDefinitionType" minOccurs="0"/>
 *         &lt;element name="Group3MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}Group3MaxFlatShippingCostDefinitionType" minOccurs="0"/>
 *         &lt;element name="MaxFlatShippingCostCBTExempt" type="{urn:ebay:apis:eBLBaseComponents}MaxFlatShippingCostCBTExemptDefinitionType" minOccurs="0"/>
 *         &lt;element name="MaxFlatShippingCost" type="{urn:ebay:apis:eBLBaseComponents}MaxFlatShippingCostDefinitionType" minOccurs="0"/>
 *         &lt;element name="VariationsEnabled" type="{urn:ebay:apis:eBLBaseComponents}VariationsEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="AttributeConversionEnabled" type="{urn:ebay:apis:eBLBaseComponents}AttributeConversionEnabledFeatureDefinitionType" minOccurs="0"/>
 *         &lt;element name="FreeGalleryPlusEnabled" type="{urn:ebay:apis:eBLBaseComponents}FreeGalleryPlusEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="FreePicturePackEnabled" type="{urn:ebay:apis:eBLBaseComponents}FreePicturePackEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ItemCompatibilityEnabled" type="{urn:ebay:apis:eBLBaseComponents}ItemCompatibilityEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="MaxItemCompatibility" type="{urn:ebay:apis:eBLBaseComponents}MaxItemCompatibilityDefinitionType" minOccurs="0"/>
 *         &lt;element name="MinItemCompatibility" type="{urn:ebay:apis:eBLBaseComponents}MinItemCompatibilityDefinitionType" minOccurs="0"/>
 *         &lt;element name="ConditionEnabled" type="{urn:ebay:apis:eBLBaseComponents}ConditionEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ConditionValues" type="{urn:ebay:apis:eBLBaseComponents}ConditionValuesDefinitionType" minOccurs="0"/>
 *         &lt;element name="ValueCategory" type="{urn:ebay:apis:eBLBaseComponents}ValueCategoryDefinitionType" minOccurs="0"/>
 *         &lt;element name="ProductCreationEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductCreationEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="EANEnabled" type="{urn:ebay:apis:eBLBaseComponents}EANEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ISBNEnabled" type="{urn:ebay:apis:eBLBaseComponents}ISBNEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="UPCEnabled" type="{urn:ebay:apis:eBLBaseComponents}UPCEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="CompatibleVehicleType" type="{urn:ebay:apis:eBLBaseComponents}CompatibleVehicleTypeDefinitionType" minOccurs="0"/>
 *         &lt;element name="MaxGranularFitmentCount" type="{urn:ebay:apis:eBLBaseComponents}MaxGranularFitmentCountDefinitionType" minOccurs="0"/>
 *         &lt;element name="PaymentOptionsGroup" type="{urn:ebay:apis:eBLBaseComponents}PaymentOptionsGroupEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="ShippingProfileCategoryGroup" type="{urn:ebay:apis:eBLBaseComponents}ProfileCategoryGroupDefinitionType" minOccurs="0"/>
 *         &lt;element name="PaymentProfileCategoryGroup" type="{urn:ebay:apis:eBLBaseComponents}ProfileCategoryGroupDefinitionType" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyProfileCategoryGroup" type="{urn:ebay:apis:eBLBaseComponents}ProfileCategoryGroupDefinitionType" minOccurs="0"/>
 *         &lt;element name="VINSupported" type="{urn:ebay:apis:eBLBaseComponents}VINSupportedDefinitionType" minOccurs="0"/>
 *         &lt;element name="VRMSupported" type="{urn:ebay:apis:eBLBaseComponents}VRMSupportedDefinitionType" minOccurs="0"/>
 *         &lt;element name="SellerProvidedTitleSupported" type="{urn:ebay:apis:eBLBaseComponents}SellerProvidedTitleSupportedDefinitionType" minOccurs="0"/>
 *         &lt;element name="DepositSupported" type="{urn:ebay:apis:eBLBaseComponents}DepositSupportedDefinitionType" minOccurs="0"/>
 *         &lt;element name="GlobalShippingEnabled" type="{urn:ebay:apis:eBLBaseComponents}GlobalShippingEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="AdditionalCompatibilityEnabled" type="{urn:ebay:apis:eBLBaseComponents}AdditionalCompatibilityEnabledDefinitionType" minOccurs="0"/>
 *         &lt;any/>
 *         &lt;element name="PickupDropOffEnabled" type="{urn:ebay:apis:eBLBaseComponents}PickupDropOffEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="DigitalGoodDeliveryEnabled" type="{urn:ebay:apis:eBLBaseComponents}DigitalGoodDeliveryEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="EpidSupported" type="{urn:ebay:apis:eBLBaseComponents}EpidSupportedDefinitionType" minOccurs="0"/>
 *         &lt;element name="KTypeSupported" type="{urn:ebay:apis:eBLBaseComponents}KTypeSupportedDefinitionType" minOccurs="0"/>
 *         &lt;element name="ProductRequiredEnabled" type="{urn:ebay:apis:eBLBaseComponents}ProductRequiredEnabledDefinitionType" minOccurs="0"/>
 *         &lt;element name="DomesticReturnsAcceptedValues" type="{urn:ebay:apis:eBLBaseComponents}DomesticReturnsAcceptedDefinitionType" minOccurs="0"/>
 *         &lt;element name="InternationalReturnsAcceptedValues" type="{urn:ebay:apis:eBLBaseComponents}InternationalReturnsAcceptedDefinitionType" minOccurs="0"/>
 *         &lt;element name="DomesticReturnsDurationValues" type="{urn:ebay:apis:eBLBaseComponents}DomesticReturnsDurationDefinitionType" minOccurs="0"/>
 *         &lt;element name="InternationalReturnsDurationValues" type="{urn:ebay:apis:eBLBaseComponents}InternationalReturnsDurationDefinitionType" minOccurs="0"/>
 *         &lt;element name="DomesticReturnsShipmentPayeeValues" type="{urn:ebay:apis:eBLBaseComponents}DomesticReturnsShipmentPayeeDefinitionType" minOccurs="0"/>
 *         &lt;element name="InternationalReturnsShipmentPayeeValues" type="{urn:ebay:apis:eBLBaseComponents}InternationalReturnsShipmentPayeeDefinitionType" minOccurs="0"/>
 *         &lt;element name="DomesticRefundMethodValues" type="{urn:ebay:apis:eBLBaseComponents}DomesticRefundMethodCodeType" minOccurs="0"/>
 *         &lt;element name="InternationalRefundMethodValues" type="{urn:ebay:apis:eBLBaseComponents}InternationalRefundMethodCodeType" minOccurs="0"/>
 *         &lt;element name="ReturnPolicyDescriptionEnabled" type="{urn:ebay:apis:eBLBaseComponents}ReturnPolicyDescriptionEnabledDefinitionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureDefinitionsType", propOrder = {
    "listingDurations",
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
    "transactionConfirmationRequestEnabled",
    "sellerContactDetailsEnabled",
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
    "paisaPayFullEscrowEnabled",
    "isbnIdentifierEnabled",
    "upcIdentifierEnabled",
    "eanIdentifierEnabled",
    "brandMPNIdentifierEnabled",
    "bestOfferAutoAcceptEnabled",
    "classifiedAdAutoAcceptEnabled",
    "crossBorderTradeNorthAmericaEnabled",
    "crossBorderTradeGBEnabled",
    "crossBorderTradeAustraliaEnabled",
    "payPalBuyerProtectionEnabled",
    "buyerGuaranteeEnabled",
    "combinedFixedPriceTreatmentEnabled",
    "galleryFeaturedDurations",
    "inEscrowWorkflowTimeline",
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
    "returnPolicyEnabled",
    "handlingTimeEnabled",
    "payPalRequiredForStoreOwner",
    "reviseQuantityAllowed",
    "revisePriceAllowed",
    "storeOwnerExtendedListingDurationsEnabled",
    "storeOwnerExtendedListingDurations",
    "paymentMethod",
    "group1MaxFlatShippingCost",
    "group2MaxFlatShippingCost",
    "group3MaxFlatShippingCost",
    "maxFlatShippingCostCBTExempt",
    "maxFlatShippingCost",
    "variationsEnabled",
    "attributeConversionEnabled",
    "freeGalleryPlusEnabled",
    "freePicturePackEnabled",
    "itemCompatibilityEnabled",
    "maxItemCompatibility",
    "minItemCompatibility",
    "conditionEnabled",
    "conditionValues",
    "valueCategory",
    "productCreationEnabled",
    "eanEnabled",
    "isbnEnabled",
    "upcEnabled",
    "compatibleVehicleType",
    "maxGranularFitmentCount",
    "paymentOptionsGroup",
    "shippingProfileCategoryGroup",
    "paymentProfileCategoryGroup",
    "returnPolicyProfileCategoryGroup",
    "vinSupported",
    "vrmSupported",
    "sellerProvidedTitleSupported",
    "depositSupported",
    "globalShippingEnabled",
    "additionalCompatibilityEnabled",
    "any",
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
    "returnPolicyDescriptionEnabled"
})
public class FeatureDefinitionsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ListingDurations")
    protected ListingDurationDefinitionsType listingDurations;
    @XmlElement(name = "ShippingTermsRequired")
    protected ShippingTermRequiredDefinitionType shippingTermsRequired;
    @XmlElement(name = "BestOfferEnabled")
    protected BestOfferEnabledDefinitionType bestOfferEnabled;
    @XmlElement(name = "DutchBINEnabled")
    protected DutchBINEnabledDefinitionType dutchBINEnabled;
    @XmlElement(name = "UserConsentRequired")
    protected UserConsentRequiredDefinitionType userConsentRequired;
    @XmlElement(name = "HomePageFeaturedEnabled")
    protected HomePageFeaturedEnabledDefinitionType homePageFeaturedEnabled;
    @XmlElement(name = "ProPackEnabled")
    protected ProPackEnabledDefinitionType proPackEnabled;
    @XmlElement(name = "BasicUpgradePackEnabled")
    protected BasicUpgradePackEnabledDefinitionType basicUpgradePackEnabled;
    @XmlElement(name = "ValuePackEnabled")
    protected ValuePackEnabledDefinitionType valuePackEnabled;
    @XmlElement(name = "ProPackPlusEnabled")
    protected ProPackPlusEnabledDefinitionType proPackPlusEnabled;
    @XmlElement(name = "AdFormatEnabled")
    protected AdFormatEnabledDefinitionType adFormatEnabled;
    @XmlElement(name = "BestOfferCounterEnabled")
    protected BestOfferCounterEnabledDefinitionType bestOfferCounterEnabled;
    @XmlElement(name = "BestOfferAutoDeclineEnabled")
    protected BestOfferAutoDeclineEnabledDefinitionType bestOfferAutoDeclineEnabled;
    @XmlElement(name = "LocalMarketSpecialitySubscription")
    protected LocalMarketSpecialitySubscriptionDefinitionType localMarketSpecialitySubscription;
    @XmlElement(name = "LocalMarketRegularSubscription")
    protected LocalMarketRegularSubscriptionDefinitionType localMarketRegularSubscription;
    @XmlElement(name = "LocalMarketPremiumSubscription")
    protected LocalMarketPremiumSubscriptionDefinitionType localMarketPremiumSubscription;
    @XmlElement(name = "LocalMarketNonSubscription")
    protected LocalMarketNonSubscriptionDefinitionType localMarketNonSubscription;
    @XmlElement(name = "ExpressEnabled")
    protected ExpressEnabledDefinitionType expressEnabled;
    @XmlElement(name = "ExpressPicturesRequired")
    protected ExpressPicturesRequiredDefinitionType expressPicturesRequired;
    @XmlElement(name = "ExpressConditionRequired")
    protected ExpressConditionRequiredDefinitionType expressConditionRequired;
    @XmlElement(name = "MinimumReservePrice")
    protected MinimumReservePriceDefinitionType minimumReservePrice;
    @XmlElement(name = "TransactionConfirmationRequestEnabled")
    protected TCREnabledDefinitionType transactionConfirmationRequestEnabled;
    @XmlElement(name = "SellerContactDetailsEnabled")
    protected SellerContactDetailsEnabledDefinitionType sellerContactDetailsEnabled;
    @XmlElement(name = "StoreInventoryEnabled")
    protected StoreInventoryEnabledDefinitionType storeInventoryEnabled;
    @XmlElement(name = "SkypeMeTransactionalEnabled")
    protected SkypeMeTransactionalEnabledDefinitionType skypeMeTransactionalEnabled;
    @XmlElement(name = "SkypeMeNonTransactionalEnabled")
    protected SkypeMeNonTransactionalEnabledDefinitionType skypeMeNonTransactionalEnabled;
    @XmlElement(name = "LocalListingDistancesRegular")
    protected LocalListingDistancesRegularDefinitionType localListingDistancesRegular;
    @XmlElement(name = "LocalListingDistancesSpecialty")
    protected LocalListingDistancesSpecialtyDefinitionType localListingDistancesSpecialty;
    @XmlElement(name = "LocalListingDistancesNonSubscription")
    protected LocalListingDistancesNonSubscriptionDefinitionType localListingDistancesNonSubscription;
    @XmlElement(name = "ClassifiedAdPaymentMethodEnabled")
    protected ClassifiedAdPaymentMethodEnabledDefinitionType classifiedAdPaymentMethodEnabled;
    @XmlElement(name = "ClassifiedAdShippingMethodEnabled")
    protected ClassifiedAdShippingMethodEnabledDefinitionType classifiedAdShippingMethodEnabled;
    @XmlElement(name = "ClassifiedAdBestOfferEnabled")
    protected ClassifiedAdBestOfferEnabledDefinitionType classifiedAdBestOfferEnabled;
    @XmlElement(name = "ClassifiedAdCounterOfferEnabled")
    protected ClassifiedAdCounterOfferEnabledDefinitionType classifiedAdCounterOfferEnabled;
    @XmlElement(name = "ClassifiedAdAutoDeclineEnabled")
    protected ClassifiedAdAutoDeclineEnabledDefinitionType classifiedAdAutoDeclineEnabled;
    @XmlElement(name = "ClassifiedAdContactByPhoneEnabled")
    protected ClassifiedAdContactByPhoneEnabledDefinitionType classifiedAdContactByPhoneEnabled;
    @XmlElement(name = "ClassifiedAdContactByEmailEnabled")
    protected ClassifiedAdContactByEmailEnabledDefintionType classifiedAdContactByEmailEnabled;
    @XmlElement(name = "SafePaymentRequired")
    protected SafePaymentRequiredDefinitionType safePaymentRequired;
    @XmlElement(name = "ClassifiedAdPayPerLeadEnabled")
    protected ClassifiedAdPayPerLeadEnabledDefinitionType classifiedAdPayPerLeadEnabled;
    @XmlElement(name = "ItemSpecificsEnabled")
    protected ItemSpecificsEnabledDefinitionType itemSpecificsEnabled;
    @XmlElement(name = "PaisaPayFullEscrowEnabled")
    protected PaisaPayFullEscrowEnabledDefinitionType paisaPayFullEscrowEnabled;
    @XmlElement(name = "ISBNIdentifierEnabled")
    protected ISBNIdentifierEnabledDefinitionType isbnIdentifierEnabled;
    @XmlElement(name = "UPCIdentifierEnabled")
    protected UPCIdentifierEnabledDefinitionType upcIdentifierEnabled;
    @XmlElement(name = "EANIdentifierEnabled")
    protected EANIdentifierEnabledDefinitionType eanIdentifierEnabled;
    @XmlElement(name = "BrandMPNIdentifierEnabled")
    protected BrandMPNIdentifierEnabledDefinitionType brandMPNIdentifierEnabled;
    @XmlElement(name = "BestOfferAutoAcceptEnabled")
    protected BestOfferAutoAcceptEnabledDefinitionType bestOfferAutoAcceptEnabled;
    @XmlElement(name = "ClassifiedAdAutoAcceptEnabled")
    protected ClassifiedAdAutoAcceptEnabledDefinitionType classifiedAdAutoAcceptEnabled;
    @XmlElement(name = "CrossBorderTradeNorthAmericaEnabled")
    protected CrossBorderTradeNorthAmericaEnabledDefinitionType crossBorderTradeNorthAmericaEnabled;
    @XmlElement(name = "CrossBorderTradeGBEnabled")
    protected CrossBorderTradeGBEnabledDefinitionType crossBorderTradeGBEnabled;
    @XmlElement(name = "CrossBorderTradeAustraliaEnabled")
    protected CrossBorderTradeAustraliaEnabledDefinitionType crossBorderTradeAustraliaEnabled;
    @XmlElement(name = "PayPalBuyerProtectionEnabled")
    protected PayPalBuyerProtectionEnabledDefinitionType payPalBuyerProtectionEnabled;
    @XmlElement(name = "BuyerGuaranteeEnabled")
    protected BuyerGuaranteeEnabledDefinitionType buyerGuaranteeEnabled;
    @XmlElement(name = "CombinedFixedPriceTreatmentEnabled")
    protected CombinedFixedPriceTreatmentEnabledDefinitionType combinedFixedPriceTreatmentEnabled;
    @XmlElement(name = "GalleryFeaturedDurations")
    protected ListingEnhancementDurationDefinitionType galleryFeaturedDurations;
    @XmlElement(name = "INEscrowWorkflowTimeline")
    protected INEscrowWorkflowTimelineDefinitionType inEscrowWorkflowTimeline;
    @XmlElement(name = "PayPalRequired")
    protected PayPalRequiredDefinitionType payPalRequired;
    protected EBayMotorsProAdFormatEnabledDefinitionType eBayMotorsProAdFormatEnabled;
    protected EBayMotorsProContactByPhoneEnabledDefinitionType eBayMotorsProContactByPhoneEnabled;
    protected EBayMotorsProPhoneCountDefinitionType eBayMotorsProPhoneCount;
    protected EBayMotorsProContactByAddressEnabledDefinitionType eBayMotorsProContactByAddressEnabled;
    protected EBayMotorsProStreetCountDefinitionType eBayMotorsProStreetCount;
    protected EBayMotorsProCompanyNameEnabledDefinitionType eBayMotorsProCompanyNameEnabled;
    protected EBayMotorsProContactByEmailEnabledDefinitionType eBayMotorsProContactByEmailEnabled;
    protected EBayMotorsProBestOfferEnabledDefinitionType eBayMotorsProBestOfferEnabled;
    protected EBayMotorsProAutoAcceptEnabledDefinitionType eBayMotorsProAutoAcceptEnabled;
    protected EBayMotorsProAutoDeclineEnabledDefinitionType eBayMotorsProAutoDeclineEnabled;
    protected EBayMotorsProPaymentMethodCheckOutEnabledDefinitionType eBayMotorsProPaymentMethodCheckOutEnabled;
    protected EBayMotorsProShippingMethodEnabledDefinitionType eBayMotorsProShippingMethodEnabled;
    protected EBayMotorsProCounterOfferEnabledDefinitionType eBayMotorsProCounterOfferEnabled;
    protected EBayMotorsProSellerContactDetailsEnabledDefinitionType eBayMotorsProSellerContactDetailsEnabled;
    @XmlElement(name = "LocalMarketAdFormatEnabled")
    protected LocalMarketAdFormatEnabledDefinitionType localMarketAdFormatEnabled;
    @XmlElement(name = "LocalMarketContactByPhoneEnabled")
    protected LocalMarketContactByPhoneEnabledDefinitionType localMarketContactByPhoneEnabled;
    @XmlElement(name = "LocalMarketPhoneCount")
    protected LocalMarketPhoneCountDefinitionType localMarketPhoneCount;
    @XmlElement(name = "LocalMarketContactByAddressEnabled")
    protected LocalMarketContactByAddressEnabledDefinitionType localMarketContactByAddressEnabled;
    @XmlElement(name = "LocalMarketStreetCount")
    protected LocalMarketStreetCountDefinitionType localMarketStreetCount;
    @XmlElement(name = "LocalMarketCompanyNameEnabled")
    protected LocalMarketCompanyNameEnabledDefinitionType localMarketCompanyNameEnabled;
    @XmlElement(name = "LocalMarketContactByEmailEnabled")
    protected LocalMarketContactByEmailEnabledDefinitionType localMarketContactByEmailEnabled;
    @XmlElement(name = "LocalMarketBestOfferEnabled")
    protected LocalMarketBestOfferEnabledDefinitionType localMarketBestOfferEnabled;
    @XmlElement(name = "LocalMarketAutoAcceptEnabled")
    protected LocalMarketAutoAcceptEnabledDefinitionType localMarketAutoAcceptEnabled;
    @XmlElement(name = "LocalMarketAutoDeclineEnabled")
    protected LocalMarketAutoDeclineEnabledDefinitionType localMarketAutoDeclineEnabled;
    @XmlElement(name = "LocalMarketPaymentMethodCheckOutEnabled")
    protected LocalMarketPaymentMethodCheckOutEnabledDefinitionType localMarketPaymentMethodCheckOutEnabled;
    @XmlElement(name = "LocalMarketShippingMethodEnabled")
    protected LocalMarketShippingMethodEnabledDefinitionType localMarketShippingMethodEnabled;
    @XmlElement(name = "LocalMarketCounterOfferEnabled")
    protected LocalMarketCounterOfferEnabledDefinitionType localMarketCounterOfferEnabled;
    @XmlElement(name = "LocalMarketSellerContactDetailsEnabled")
    protected LocalMarketSellerContactDetailsEnabledDefinitionType localMarketSellerContactDetailsEnabled;
    @XmlElement(name = "ClassifiedAdPhoneCount")
    protected ClassifiedAdPhoneCountDefinitionType classifiedAdPhoneCount;
    @XmlElement(name = "ClassifiedAdContactByAddressEnabled")
    protected ClassifiedAdContactByAddressEnabledDefinitionType classifiedAdContactByAddressEnabled;
    @XmlElement(name = "ClassifiedAdStreetCount")
    protected ClassifiedAdStreetCountDefinitionType classifiedAdStreetCount;
    @XmlElement(name = "ClassifiedAdCompanyNameEnabled")
    protected ClassifiedAdCompanyNameEnabledDefinitionType classifiedAdCompanyNameEnabled;
    @XmlElement(name = "SpecialitySubscription")
    protected SpecialitySubscriptionDefinitionType specialitySubscription;
    @XmlElement(name = "RegularSubscription")
    protected RegularSubscriptionDefinitionType regularSubscription;
    @XmlElement(name = "PremiumSubscription")
    protected PremiumSubscriptionDefinitionType premiumSubscription;
    @XmlElement(name = "NonSubscription")
    protected NonSubscriptionDefinitionType nonSubscription;
    @XmlElement(name = "ReturnPolicyEnabled")
    protected ReturnPolicyEnabledDefinitionType returnPolicyEnabled;
    @XmlElement(name = "HandlingTimeEnabled")
    protected HandlingTimeEnabledDefinitionType handlingTimeEnabled;
    @XmlElement(name = "PayPalRequiredForStoreOwner")
    protected PayPalRequiredForStoreOwnerDefinitionType payPalRequiredForStoreOwner;
    @XmlElement(name = "ReviseQuantityAllowed")
    protected ReviseQuantityAllowedDefinitionType reviseQuantityAllowed;
    @XmlElement(name = "RevisePriceAllowed")
    protected RevisePriceAllowedDefinitionType revisePriceAllowed;
    @XmlElement(name = "StoreOwnerExtendedListingDurationsEnabled")
    protected StoreOwnerExtendedListingDurationsEnabledDefinitionType storeOwnerExtendedListingDurationsEnabled;
    @XmlElement(name = "StoreOwnerExtendedListingDurations")
    protected StoreOwnerExtendedListingDurationsDefinitionType storeOwnerExtendedListingDurations;
    @XmlElement(name = "PaymentMethod")
    protected PaymentMethodDefinitionType paymentMethod;
    @XmlElement(name = "Group1MaxFlatShippingCost")
    protected Group1MaxFlatShippingCostDefinitionType group1MaxFlatShippingCost;
    @XmlElement(name = "Group2MaxFlatShippingCost")
    protected Group2MaxFlatShippingCostDefinitionType group2MaxFlatShippingCost;
    @XmlElement(name = "Group3MaxFlatShippingCost")
    protected Group3MaxFlatShippingCostDefinitionType group3MaxFlatShippingCost;
    @XmlElement(name = "MaxFlatShippingCostCBTExempt")
    protected MaxFlatShippingCostCBTExemptDefinitionType maxFlatShippingCostCBTExempt;
    @XmlElement(name = "MaxFlatShippingCost")
    protected MaxFlatShippingCostDefinitionType maxFlatShippingCost;
    @XmlElement(name = "VariationsEnabled")
    protected VariationsEnabledDefinitionType variationsEnabled;
    @XmlElement(name = "AttributeConversionEnabled")
    protected AttributeConversionEnabledFeatureDefinitionType attributeConversionEnabled;
    @XmlElement(name = "FreeGalleryPlusEnabled")
    protected FreeGalleryPlusEnabledDefinitionType freeGalleryPlusEnabled;
    @XmlElement(name = "FreePicturePackEnabled")
    protected FreePicturePackEnabledDefinitionType freePicturePackEnabled;
    @XmlElement(name = "ItemCompatibilityEnabled")
    protected ItemCompatibilityEnabledDefinitionType itemCompatibilityEnabled;
    @XmlElement(name = "MaxItemCompatibility")
    protected MaxItemCompatibilityDefinitionType maxItemCompatibility;
    @XmlElement(name = "MinItemCompatibility")
    protected MinItemCompatibilityDefinitionType minItemCompatibility;
    @XmlElement(name = "ConditionEnabled")
    protected ConditionEnabledDefinitionType conditionEnabled;
    @XmlElement(name = "ConditionValues")
    protected ConditionValuesDefinitionType conditionValues;
    @XmlElement(name = "ValueCategory")
    protected ValueCategoryDefinitionType valueCategory;
    @XmlElement(name = "ProductCreationEnabled")
    protected ProductCreationEnabledDefinitionType productCreationEnabled;
    @XmlElement(name = "EANEnabled")
    protected EANEnabledDefinitionType eanEnabled;
    @XmlElement(name = "ISBNEnabled")
    protected ISBNEnabledDefinitionType isbnEnabled;
    @XmlElement(name = "UPCEnabled")
    protected UPCEnabledDefinitionType upcEnabled;
    @XmlElement(name = "CompatibleVehicleType")
    protected CompatibleVehicleTypeDefinitionType compatibleVehicleType;
    @XmlElement(name = "MaxGranularFitmentCount")
    protected MaxGranularFitmentCountDefinitionType maxGranularFitmentCount;
    @XmlElement(name = "PaymentOptionsGroup")
    protected PaymentOptionsGroupEnabledDefinitionType paymentOptionsGroup;
    @XmlElement(name = "ShippingProfileCategoryGroup")
    protected ProfileCategoryGroupDefinitionType shippingProfileCategoryGroup;
    @XmlElement(name = "PaymentProfileCategoryGroup")
    protected ProfileCategoryGroupDefinitionType paymentProfileCategoryGroup;
    @XmlElement(name = "ReturnPolicyProfileCategoryGroup")
    protected ProfileCategoryGroupDefinitionType returnPolicyProfileCategoryGroup;
    @XmlElement(name = "VINSupported")
    protected VINSupportedDefinitionType vinSupported;
    @XmlElement(name = "VRMSupported")
    protected VRMSupportedDefinitionType vrmSupported;
    @XmlElement(name = "SellerProvidedTitleSupported")
    protected SellerProvidedTitleSupportedDefinitionType sellerProvidedTitleSupported;
    @XmlElement(name = "DepositSupported")
    protected DepositSupportedDefinitionType depositSupported;
    @XmlElement(name = "GlobalShippingEnabled")
    protected GlobalShippingEnabledDefinitionType globalShippingEnabled;
    @XmlElement(name = "AdditionalCompatibilityEnabled")
    protected AdditionalCompatibilityEnabledDefinitionType additionalCompatibilityEnabled;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "PickupDropOffEnabled")
    protected PickupDropOffEnabledDefinitionType pickupDropOffEnabled;
    @XmlElement(name = "DigitalGoodDeliveryEnabled")
    protected DigitalGoodDeliveryEnabledDefinitionType digitalGoodDeliveryEnabled;
    @XmlElement(name = "EpidSupported")
    protected EpidSupportedDefinitionType epidSupported;
    @XmlElement(name = "KTypeSupported")
    protected KTypeSupportedDefinitionType kTypeSupported;
    @XmlElement(name = "ProductRequiredEnabled")
    protected ProductRequiredEnabledDefinitionType productRequiredEnabled;
    @XmlElement(name = "DomesticReturnsAcceptedValues")
    protected DomesticReturnsAcceptedDefinitionType domesticReturnsAcceptedValues;
    @XmlElement(name = "InternationalReturnsAcceptedValues")
    protected InternationalReturnsAcceptedDefinitionType internationalReturnsAcceptedValues;
    @XmlElement(name = "DomesticReturnsDurationValues")
    protected DomesticReturnsDurationDefinitionType domesticReturnsDurationValues;
    @XmlElement(name = "InternationalReturnsDurationValues")
    protected InternationalReturnsDurationDefinitionType internationalReturnsDurationValues;
    @XmlElement(name = "DomesticReturnsShipmentPayeeValues")
    protected DomesticReturnsShipmentPayeeDefinitionType domesticReturnsShipmentPayeeValues;
    @XmlElement(name = "InternationalReturnsShipmentPayeeValues")
    protected InternationalReturnsShipmentPayeeDefinitionType internationalReturnsShipmentPayeeValues;
    @XmlElement(name = "DomesticRefundMethodValues")
    protected DomesticRefundMethodCodeType domesticRefundMethodValues;
    @XmlElement(name = "InternationalRefundMethodValues")
    protected InternationalRefundMethodCodeType internationalRefundMethodValues;
    @XmlElement(name = "ReturnPolicyDescriptionEnabled")
    protected ReturnPolicyDescriptionEnabledDefinitionType returnPolicyDescriptionEnabled;

    /**
     * Gets the value of the listingDurations property.
     * 
     * @return
     *     possible object is
     *     {@link ListingDurationDefinitionsType }
     *     
     */
    public ListingDurationDefinitionsType getListingDurations() {
        return listingDurations;
    }

    /**
     * Sets the value of the listingDurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingDurationDefinitionsType }
     *     
     */
    public void setListingDurations(ListingDurationDefinitionsType value) {
        this.listingDurations = value;
    }

    /**
     * Gets the value of the shippingTermsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingTermRequiredDefinitionType }
     *     
     */
    public ShippingTermRequiredDefinitionType getShippingTermsRequired() {
        return shippingTermsRequired;
    }

    /**
     * Sets the value of the shippingTermsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingTermRequiredDefinitionType }
     *     
     */
    public void setShippingTermsRequired(ShippingTermRequiredDefinitionType value) {
        this.shippingTermsRequired = value;
    }

    /**
     * Gets the value of the bestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferEnabledDefinitionType }
     *     
     */
    public BestOfferEnabledDefinitionType getBestOfferEnabled() {
        return bestOfferEnabled;
    }

    /**
     * Sets the value of the bestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferEnabledDefinitionType }
     *     
     */
    public void setBestOfferEnabled(BestOfferEnabledDefinitionType value) {
        this.bestOfferEnabled = value;
    }

    /**
     * Gets the value of the dutchBINEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBINEnabledDefinitionType }
     *     
     */
    public DutchBINEnabledDefinitionType getDutchBINEnabled() {
        return dutchBINEnabled;
    }

    /**
     * Sets the value of the dutchBINEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBINEnabledDefinitionType }
     *     
     */
    public void setDutchBINEnabled(DutchBINEnabledDefinitionType value) {
        this.dutchBINEnabled = value;
    }

    /**
     * Gets the value of the userConsentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link UserConsentRequiredDefinitionType }
     *     
     */
    public UserConsentRequiredDefinitionType getUserConsentRequired() {
        return userConsentRequired;
    }

    /**
     * Sets the value of the userConsentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserConsentRequiredDefinitionType }
     *     
     */
    public void setUserConsentRequired(UserConsentRequiredDefinitionType value) {
        this.userConsentRequired = value;
    }

    /**
     * Gets the value of the homePageFeaturedEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link HomePageFeaturedEnabledDefinitionType }
     *     
     */
    public HomePageFeaturedEnabledDefinitionType getHomePageFeaturedEnabled() {
        return homePageFeaturedEnabled;
    }

    /**
     * Sets the value of the homePageFeaturedEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomePageFeaturedEnabledDefinitionType }
     *     
     */
    public void setHomePageFeaturedEnabled(HomePageFeaturedEnabledDefinitionType value) {
        this.homePageFeaturedEnabled = value;
    }

    /**
     * Gets the value of the proPackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProPackEnabledDefinitionType }
     *     
     */
    public ProPackEnabledDefinitionType getProPackEnabled() {
        return proPackEnabled;
    }

    /**
     * Sets the value of the proPackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProPackEnabledDefinitionType }
     *     
     */
    public void setProPackEnabled(ProPackEnabledDefinitionType value) {
        this.proPackEnabled = value;
    }

    /**
     * Gets the value of the basicUpgradePackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BasicUpgradePackEnabledDefinitionType }
     *     
     */
    public BasicUpgradePackEnabledDefinitionType getBasicUpgradePackEnabled() {
        return basicUpgradePackEnabled;
    }

    /**
     * Sets the value of the basicUpgradePackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicUpgradePackEnabledDefinitionType }
     *     
     */
    public void setBasicUpgradePackEnabled(BasicUpgradePackEnabledDefinitionType value) {
        this.basicUpgradePackEnabled = value;
    }

    /**
     * Gets the value of the valuePackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ValuePackEnabledDefinitionType }
     *     
     */
    public ValuePackEnabledDefinitionType getValuePackEnabled() {
        return valuePackEnabled;
    }

    /**
     * Sets the value of the valuePackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuePackEnabledDefinitionType }
     *     
     */
    public void setValuePackEnabled(ValuePackEnabledDefinitionType value) {
        this.valuePackEnabled = value;
    }

    /**
     * Gets the value of the proPackPlusEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProPackPlusEnabledDefinitionType }
     *     
     */
    public ProPackPlusEnabledDefinitionType getProPackPlusEnabled() {
        return proPackPlusEnabled;
    }

    /**
     * Sets the value of the proPackPlusEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProPackPlusEnabledDefinitionType }
     *     
     */
    public void setProPackPlusEnabled(ProPackPlusEnabledDefinitionType value) {
        this.proPackPlusEnabled = value;
    }

    /**
     * Gets the value of the adFormatEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AdFormatEnabledDefinitionType }
     *     
     */
    public AdFormatEnabledDefinitionType getAdFormatEnabled() {
        return adFormatEnabled;
    }

    /**
     * Sets the value of the adFormatEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdFormatEnabledDefinitionType }
     *     
     */
    public void setAdFormatEnabled(AdFormatEnabledDefinitionType value) {
        this.adFormatEnabled = value;
    }

    /**
     * Gets the value of the bestOfferCounterEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferCounterEnabledDefinitionType }
     *     
     */
    public BestOfferCounterEnabledDefinitionType getBestOfferCounterEnabled() {
        return bestOfferCounterEnabled;
    }

    /**
     * Sets the value of the bestOfferCounterEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferCounterEnabledDefinitionType }
     *     
     */
    public void setBestOfferCounterEnabled(BestOfferCounterEnabledDefinitionType value) {
        this.bestOfferCounterEnabled = value;
    }

    /**
     * Gets the value of the bestOfferAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferAutoDeclineEnabledDefinitionType }
     *     
     */
    public BestOfferAutoDeclineEnabledDefinitionType getBestOfferAutoDeclineEnabled() {
        return bestOfferAutoDeclineEnabled;
    }

    /**
     * Sets the value of the bestOfferAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferAutoDeclineEnabledDefinitionType }
     *     
     */
    public void setBestOfferAutoDeclineEnabled(BestOfferAutoDeclineEnabledDefinitionType value) {
        this.bestOfferAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the localMarketSpecialitySubscription property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketSpecialitySubscriptionDefinitionType }
     *     
     */
    public LocalMarketSpecialitySubscriptionDefinitionType getLocalMarketSpecialitySubscription() {
        return localMarketSpecialitySubscription;
    }

    /**
     * Sets the value of the localMarketSpecialitySubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketSpecialitySubscriptionDefinitionType }
     *     
     */
    public void setLocalMarketSpecialitySubscription(LocalMarketSpecialitySubscriptionDefinitionType value) {
        this.localMarketSpecialitySubscription = value;
    }

    /**
     * Gets the value of the localMarketRegularSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketRegularSubscriptionDefinitionType }
     *     
     */
    public LocalMarketRegularSubscriptionDefinitionType getLocalMarketRegularSubscription() {
        return localMarketRegularSubscription;
    }

    /**
     * Sets the value of the localMarketRegularSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketRegularSubscriptionDefinitionType }
     *     
     */
    public void setLocalMarketRegularSubscription(LocalMarketRegularSubscriptionDefinitionType value) {
        this.localMarketRegularSubscription = value;
    }

    /**
     * Gets the value of the localMarketPremiumSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketPremiumSubscriptionDefinitionType }
     *     
     */
    public LocalMarketPremiumSubscriptionDefinitionType getLocalMarketPremiumSubscription() {
        return localMarketPremiumSubscription;
    }

    /**
     * Sets the value of the localMarketPremiumSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketPremiumSubscriptionDefinitionType }
     *     
     */
    public void setLocalMarketPremiumSubscription(LocalMarketPremiumSubscriptionDefinitionType value) {
        this.localMarketPremiumSubscription = value;
    }

    /**
     * Gets the value of the localMarketNonSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketNonSubscriptionDefinitionType }
     *     
     */
    public LocalMarketNonSubscriptionDefinitionType getLocalMarketNonSubscription() {
        return localMarketNonSubscription;
    }

    /**
     * Sets the value of the localMarketNonSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketNonSubscriptionDefinitionType }
     *     
     */
    public void setLocalMarketNonSubscription(LocalMarketNonSubscriptionDefinitionType value) {
        this.localMarketNonSubscription = value;
    }

    /**
     * Gets the value of the expressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressEnabledDefinitionType }
     *     
     */
    public ExpressEnabledDefinitionType getExpressEnabled() {
        return expressEnabled;
    }

    /**
     * Sets the value of the expressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressEnabledDefinitionType }
     *     
     */
    public void setExpressEnabled(ExpressEnabledDefinitionType value) {
        this.expressEnabled = value;
    }

    /**
     * Gets the value of the expressPicturesRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressPicturesRequiredDefinitionType }
     *     
     */
    public ExpressPicturesRequiredDefinitionType getExpressPicturesRequired() {
        return expressPicturesRequired;
    }

    /**
     * Sets the value of the expressPicturesRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressPicturesRequiredDefinitionType }
     *     
     */
    public void setExpressPicturesRequired(ExpressPicturesRequiredDefinitionType value) {
        this.expressPicturesRequired = value;
    }

    /**
     * Gets the value of the expressConditionRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressConditionRequiredDefinitionType }
     *     
     */
    public ExpressConditionRequiredDefinitionType getExpressConditionRequired() {
        return expressConditionRequired;
    }

    /**
     * Sets the value of the expressConditionRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressConditionRequiredDefinitionType }
     *     
     */
    public void setExpressConditionRequired(ExpressConditionRequiredDefinitionType value) {
        this.expressConditionRequired = value;
    }

    /**
     * Gets the value of the minimumReservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumReservePriceDefinitionType }
     *     
     */
    public MinimumReservePriceDefinitionType getMinimumReservePrice() {
        return minimumReservePrice;
    }

    /**
     * Sets the value of the minimumReservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumReservePriceDefinitionType }
     *     
     */
    public void setMinimumReservePrice(MinimumReservePriceDefinitionType value) {
        this.minimumReservePrice = value;
    }

    /**
     * Gets the value of the transactionConfirmationRequestEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link TCREnabledDefinitionType }
     *     
     */
    public TCREnabledDefinitionType getTransactionConfirmationRequestEnabled() {
        return transactionConfirmationRequestEnabled;
    }

    /**
     * Sets the value of the transactionConfirmationRequestEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCREnabledDefinitionType }
     *     
     */
    public void setTransactionConfirmationRequestEnabled(TCREnabledDefinitionType value) {
        this.transactionConfirmationRequestEnabled = value;
    }

    /**
     * Gets the value of the sellerContactDetailsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link SellerContactDetailsEnabledDefinitionType }
     *     
     */
    public SellerContactDetailsEnabledDefinitionType getSellerContactDetailsEnabled() {
        return sellerContactDetailsEnabled;
    }

    /**
     * Sets the value of the sellerContactDetailsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerContactDetailsEnabledDefinitionType }
     *     
     */
    public void setSellerContactDetailsEnabled(SellerContactDetailsEnabledDefinitionType value) {
        this.sellerContactDetailsEnabled = value;
    }

    /**
     * Gets the value of the storeInventoryEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link StoreInventoryEnabledDefinitionType }
     *     
     */
    public StoreInventoryEnabledDefinitionType getStoreInventoryEnabled() {
        return storeInventoryEnabled;
    }

    /**
     * Sets the value of the storeInventoryEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreInventoryEnabledDefinitionType }
     *     
     */
    public void setStoreInventoryEnabled(StoreInventoryEnabledDefinitionType value) {
        this.storeInventoryEnabled = value;
    }

    /**
     * Gets the value of the skypeMeTransactionalEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link SkypeMeTransactionalEnabledDefinitionType }
     *     
     */
    public SkypeMeTransactionalEnabledDefinitionType getSkypeMeTransactionalEnabled() {
        return skypeMeTransactionalEnabled;
    }

    /**
     * Sets the value of the skypeMeTransactionalEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkypeMeTransactionalEnabledDefinitionType }
     *     
     */
    public void setSkypeMeTransactionalEnabled(SkypeMeTransactionalEnabledDefinitionType value) {
        this.skypeMeTransactionalEnabled = value;
    }

    /**
     * Gets the value of the skypeMeNonTransactionalEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link SkypeMeNonTransactionalEnabledDefinitionType }
     *     
     */
    public SkypeMeNonTransactionalEnabledDefinitionType getSkypeMeNonTransactionalEnabled() {
        return skypeMeNonTransactionalEnabled;
    }

    /**
     * Sets the value of the skypeMeNonTransactionalEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkypeMeNonTransactionalEnabledDefinitionType }
     *     
     */
    public void setSkypeMeNonTransactionalEnabled(SkypeMeNonTransactionalEnabledDefinitionType value) {
        this.skypeMeNonTransactionalEnabled = value;
    }

    /**
     * Gets the value of the localListingDistancesRegular property.
     * 
     * @return
     *     possible object is
     *     {@link LocalListingDistancesRegularDefinitionType }
     *     
     */
    public LocalListingDistancesRegularDefinitionType getLocalListingDistancesRegular() {
        return localListingDistancesRegular;
    }

    /**
     * Sets the value of the localListingDistancesRegular property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalListingDistancesRegularDefinitionType }
     *     
     */
    public void setLocalListingDistancesRegular(LocalListingDistancesRegularDefinitionType value) {
        this.localListingDistancesRegular = value;
    }

    /**
     * Gets the value of the localListingDistancesSpecialty property.
     * 
     * @return
     *     possible object is
     *     {@link LocalListingDistancesSpecialtyDefinitionType }
     *     
     */
    public LocalListingDistancesSpecialtyDefinitionType getLocalListingDistancesSpecialty() {
        return localListingDistancesSpecialty;
    }

    /**
     * Sets the value of the localListingDistancesSpecialty property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalListingDistancesSpecialtyDefinitionType }
     *     
     */
    public void setLocalListingDistancesSpecialty(LocalListingDistancesSpecialtyDefinitionType value) {
        this.localListingDistancesSpecialty = value;
    }

    /**
     * Gets the value of the localListingDistancesNonSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link LocalListingDistancesNonSubscriptionDefinitionType }
     *     
     */
    public LocalListingDistancesNonSubscriptionDefinitionType getLocalListingDistancesNonSubscription() {
        return localListingDistancesNonSubscription;
    }

    /**
     * Sets the value of the localListingDistancesNonSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalListingDistancesNonSubscriptionDefinitionType }
     *     
     */
    public void setLocalListingDistancesNonSubscription(LocalListingDistancesNonSubscriptionDefinitionType value) {
        this.localListingDistancesNonSubscription = value;
    }

    /**
     * Gets the value of the classifiedAdPaymentMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdPaymentMethodEnabledDefinitionType }
     *     
     */
    public ClassifiedAdPaymentMethodEnabledDefinitionType getClassifiedAdPaymentMethodEnabled() {
        return classifiedAdPaymentMethodEnabled;
    }

    /**
     * Sets the value of the classifiedAdPaymentMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdPaymentMethodEnabledDefinitionType }
     *     
     */
    public void setClassifiedAdPaymentMethodEnabled(ClassifiedAdPaymentMethodEnabledDefinitionType value) {
        this.classifiedAdPaymentMethodEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdShippingMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdShippingMethodEnabledDefinitionType }
     *     
     */
    public ClassifiedAdShippingMethodEnabledDefinitionType getClassifiedAdShippingMethodEnabled() {
        return classifiedAdShippingMethodEnabled;
    }

    /**
     * Sets the value of the classifiedAdShippingMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdShippingMethodEnabledDefinitionType }
     *     
     */
    public void setClassifiedAdShippingMethodEnabled(ClassifiedAdShippingMethodEnabledDefinitionType value) {
        this.classifiedAdShippingMethodEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdBestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdBestOfferEnabledDefinitionType }
     *     
     */
    public ClassifiedAdBestOfferEnabledDefinitionType getClassifiedAdBestOfferEnabled() {
        return classifiedAdBestOfferEnabled;
    }

    /**
     * Sets the value of the classifiedAdBestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdBestOfferEnabledDefinitionType }
     *     
     */
    public void setClassifiedAdBestOfferEnabled(ClassifiedAdBestOfferEnabledDefinitionType value) {
        this.classifiedAdBestOfferEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdCounterOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdCounterOfferEnabledDefinitionType }
     *     
     */
    public ClassifiedAdCounterOfferEnabledDefinitionType getClassifiedAdCounterOfferEnabled() {
        return classifiedAdCounterOfferEnabled;
    }

    /**
     * Sets the value of the classifiedAdCounterOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdCounterOfferEnabledDefinitionType }
     *     
     */
    public void setClassifiedAdCounterOfferEnabled(ClassifiedAdCounterOfferEnabledDefinitionType value) {
        this.classifiedAdCounterOfferEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdAutoDeclineEnabledDefinitionType }
     *     
     */
    public ClassifiedAdAutoDeclineEnabledDefinitionType getClassifiedAdAutoDeclineEnabled() {
        return classifiedAdAutoDeclineEnabled;
    }

    /**
     * Sets the value of the classifiedAdAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdAutoDeclineEnabledDefinitionType }
     *     
     */
    public void setClassifiedAdAutoDeclineEnabled(ClassifiedAdAutoDeclineEnabledDefinitionType value) {
        this.classifiedAdAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdContactByPhoneEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdContactByPhoneEnabledDefinitionType }
     *     
     */
    public ClassifiedAdContactByPhoneEnabledDefinitionType getClassifiedAdContactByPhoneEnabled() {
        return classifiedAdContactByPhoneEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByPhoneEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdContactByPhoneEnabledDefinitionType }
     *     
     */
    public void setClassifiedAdContactByPhoneEnabled(ClassifiedAdContactByPhoneEnabledDefinitionType value) {
        this.classifiedAdContactByPhoneEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdContactByEmailEnabledDefintionType }
     *     
     */
    public ClassifiedAdContactByEmailEnabledDefintionType getClassifiedAdContactByEmailEnabled() {
        return classifiedAdContactByEmailEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdContactByEmailEnabledDefintionType }
     *     
     */
    public void setClassifiedAdContactByEmailEnabled(ClassifiedAdContactByEmailEnabledDefintionType value) {
        this.classifiedAdContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the safePaymentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link SafePaymentRequiredDefinitionType }
     *     
     */
    public SafePaymentRequiredDefinitionType getSafePaymentRequired() {
        return safePaymentRequired;
    }

    /**
     * Sets the value of the safePaymentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafePaymentRequiredDefinitionType }
     *     
     */
    public void setSafePaymentRequired(SafePaymentRequiredDefinitionType value) {
        this.safePaymentRequired = value;
    }

    /**
     * Gets the value of the classifiedAdPayPerLeadEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdPayPerLeadEnabledDefinitionType }
     *     
     */
    public ClassifiedAdPayPerLeadEnabledDefinitionType getClassifiedAdPayPerLeadEnabled() {
        return classifiedAdPayPerLeadEnabled;
    }

    /**
     * Sets the value of the classifiedAdPayPerLeadEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdPayPerLeadEnabledDefinitionType }
     *     
     */
    public void setClassifiedAdPayPerLeadEnabled(ClassifiedAdPayPerLeadEnabledDefinitionType value) {
        this.classifiedAdPayPerLeadEnabled = value;
    }

    /**
     * Gets the value of the itemSpecificsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSpecificsEnabledDefinitionType }
     *     
     */
    public ItemSpecificsEnabledDefinitionType getItemSpecificsEnabled() {
        return itemSpecificsEnabled;
    }

    /**
     * Sets the value of the itemSpecificsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSpecificsEnabledDefinitionType }
     *     
     */
    public void setItemSpecificsEnabled(ItemSpecificsEnabledDefinitionType value) {
        this.itemSpecificsEnabled = value;
    }

    /**
     * Gets the value of the paisaPayFullEscrowEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link PaisaPayFullEscrowEnabledDefinitionType }
     *     
     */
    public PaisaPayFullEscrowEnabledDefinitionType getPaisaPayFullEscrowEnabled() {
        return paisaPayFullEscrowEnabled;
    }

    /**
     * Sets the value of the paisaPayFullEscrowEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaisaPayFullEscrowEnabledDefinitionType }
     *     
     */
    public void setPaisaPayFullEscrowEnabled(PaisaPayFullEscrowEnabledDefinitionType value) {
        this.paisaPayFullEscrowEnabled = value;
    }

    /**
     * Gets the value of the isbnIdentifierEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ISBNIdentifierEnabledDefinitionType }
     *     
     */
    public ISBNIdentifierEnabledDefinitionType getISBNIdentifierEnabled() {
        return isbnIdentifierEnabled;
    }

    /**
     * Sets the value of the isbnIdentifierEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISBNIdentifierEnabledDefinitionType }
     *     
     */
    public void setISBNIdentifierEnabled(ISBNIdentifierEnabledDefinitionType value) {
        this.isbnIdentifierEnabled = value;
    }

    /**
     * Gets the value of the upcIdentifierEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link UPCIdentifierEnabledDefinitionType }
     *     
     */
    public UPCIdentifierEnabledDefinitionType getUPCIdentifierEnabled() {
        return upcIdentifierEnabled;
    }

    /**
     * Sets the value of the upcIdentifierEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link UPCIdentifierEnabledDefinitionType }
     *     
     */
    public void setUPCIdentifierEnabled(UPCIdentifierEnabledDefinitionType value) {
        this.upcIdentifierEnabled = value;
    }

    /**
     * Gets the value of the eanIdentifierEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EANIdentifierEnabledDefinitionType }
     *     
     */
    public EANIdentifierEnabledDefinitionType getEANIdentifierEnabled() {
        return eanIdentifierEnabled;
    }

    /**
     * Sets the value of the eanIdentifierEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EANIdentifierEnabledDefinitionType }
     *     
     */
    public void setEANIdentifierEnabled(EANIdentifierEnabledDefinitionType value) {
        this.eanIdentifierEnabled = value;
    }

    /**
     * Gets the value of the brandMPNIdentifierEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BrandMPNIdentifierEnabledDefinitionType }
     *     
     */
    public BrandMPNIdentifierEnabledDefinitionType getBrandMPNIdentifierEnabled() {
        return brandMPNIdentifierEnabled;
    }

    /**
     * Sets the value of the brandMPNIdentifierEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandMPNIdentifierEnabledDefinitionType }
     *     
     */
    public void setBrandMPNIdentifierEnabled(BrandMPNIdentifierEnabledDefinitionType value) {
        this.brandMPNIdentifierEnabled = value;
    }

    /**
     * Gets the value of the bestOfferAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferAutoAcceptEnabledDefinitionType }
     *     
     */
    public BestOfferAutoAcceptEnabledDefinitionType getBestOfferAutoAcceptEnabled() {
        return bestOfferAutoAcceptEnabled;
    }

    /**
     * Sets the value of the bestOfferAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferAutoAcceptEnabledDefinitionType }
     *     
     */
    public void setBestOfferAutoAcceptEnabled(BestOfferAutoAcceptEnabledDefinitionType value) {
        this.bestOfferAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdAutoAcceptEnabledDefinitionType }
     *     
     */
    public ClassifiedAdAutoAcceptEnabledDefinitionType getClassifiedAdAutoAcceptEnabled() {
        return classifiedAdAutoAcceptEnabled;
    }

    /**
     * Sets the value of the classifiedAdAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdAutoAcceptEnabledDefinitionType }
     *     
     */
    public void setClassifiedAdAutoAcceptEnabled(ClassifiedAdAutoAcceptEnabledDefinitionType value) {
        this.classifiedAdAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the crossBorderTradeNorthAmericaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link CrossBorderTradeNorthAmericaEnabledDefinitionType }
     *     
     */
    public CrossBorderTradeNorthAmericaEnabledDefinitionType getCrossBorderTradeNorthAmericaEnabled() {
        return crossBorderTradeNorthAmericaEnabled;
    }

    /**
     * Sets the value of the crossBorderTradeNorthAmericaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossBorderTradeNorthAmericaEnabledDefinitionType }
     *     
     */
    public void setCrossBorderTradeNorthAmericaEnabled(CrossBorderTradeNorthAmericaEnabledDefinitionType value) {
        this.crossBorderTradeNorthAmericaEnabled = value;
    }

    /**
     * Gets the value of the crossBorderTradeGBEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link CrossBorderTradeGBEnabledDefinitionType }
     *     
     */
    public CrossBorderTradeGBEnabledDefinitionType getCrossBorderTradeGBEnabled() {
        return crossBorderTradeGBEnabled;
    }

    /**
     * Sets the value of the crossBorderTradeGBEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossBorderTradeGBEnabledDefinitionType }
     *     
     */
    public void setCrossBorderTradeGBEnabled(CrossBorderTradeGBEnabledDefinitionType value) {
        this.crossBorderTradeGBEnabled = value;
    }

    /**
     * Gets the value of the crossBorderTradeAustraliaEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link CrossBorderTradeAustraliaEnabledDefinitionType }
     *     
     */
    public CrossBorderTradeAustraliaEnabledDefinitionType getCrossBorderTradeAustraliaEnabled() {
        return crossBorderTradeAustraliaEnabled;
    }

    /**
     * Sets the value of the crossBorderTradeAustraliaEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossBorderTradeAustraliaEnabledDefinitionType }
     *     
     */
    public void setCrossBorderTradeAustraliaEnabled(CrossBorderTradeAustraliaEnabledDefinitionType value) {
        this.crossBorderTradeAustraliaEnabled = value;
    }

    /**
     * Gets the value of the payPalBuyerProtectionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalBuyerProtectionEnabledDefinitionType }
     *     
     */
    public PayPalBuyerProtectionEnabledDefinitionType getPayPalBuyerProtectionEnabled() {
        return payPalBuyerProtectionEnabled;
    }

    /**
     * Sets the value of the payPalBuyerProtectionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalBuyerProtectionEnabledDefinitionType }
     *     
     */
    public void setPayPalBuyerProtectionEnabled(PayPalBuyerProtectionEnabledDefinitionType value) {
        this.payPalBuyerProtectionEnabled = value;
    }

    /**
     * Gets the value of the buyerGuaranteeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerGuaranteeEnabledDefinitionType }
     *     
     */
    public BuyerGuaranteeEnabledDefinitionType getBuyerGuaranteeEnabled() {
        return buyerGuaranteeEnabled;
    }

    /**
     * Sets the value of the buyerGuaranteeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerGuaranteeEnabledDefinitionType }
     *     
     */
    public void setBuyerGuaranteeEnabled(BuyerGuaranteeEnabledDefinitionType value) {
        this.buyerGuaranteeEnabled = value;
    }

    /**
     * Gets the value of the combinedFixedPriceTreatmentEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedFixedPriceTreatmentEnabledDefinitionType }
     *     
     */
    public CombinedFixedPriceTreatmentEnabledDefinitionType getCombinedFixedPriceTreatmentEnabled() {
        return combinedFixedPriceTreatmentEnabled;
    }

    /**
     * Sets the value of the combinedFixedPriceTreatmentEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedFixedPriceTreatmentEnabledDefinitionType }
     *     
     */
    public void setCombinedFixedPriceTreatmentEnabled(CombinedFixedPriceTreatmentEnabledDefinitionType value) {
        this.combinedFixedPriceTreatmentEnabled = value;
    }

    /**
     * Gets the value of the galleryFeaturedDurations property.
     * 
     * @return
     *     possible object is
     *     {@link ListingEnhancementDurationDefinitionType }
     *     
     */
    public ListingEnhancementDurationDefinitionType getGalleryFeaturedDurations() {
        return galleryFeaturedDurations;
    }

    /**
     * Sets the value of the galleryFeaturedDurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingEnhancementDurationDefinitionType }
     *     
     */
    public void setGalleryFeaturedDurations(ListingEnhancementDurationDefinitionType value) {
        this.galleryFeaturedDurations = value;
    }

    /**
     * Gets the value of the inEscrowWorkflowTimeline property.
     * 
     * @return
     *     possible object is
     *     {@link INEscrowWorkflowTimelineDefinitionType }
     *     
     */
    public INEscrowWorkflowTimelineDefinitionType getINEscrowWorkflowTimeline() {
        return inEscrowWorkflowTimeline;
    }

    /**
     * Sets the value of the inEscrowWorkflowTimeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link INEscrowWorkflowTimelineDefinitionType }
     *     
     */
    public void setINEscrowWorkflowTimeline(INEscrowWorkflowTimelineDefinitionType value) {
        this.inEscrowWorkflowTimeline = value;
    }

    /**
     * Gets the value of the payPalRequired property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalRequiredDefinitionType }
     *     
     */
    public PayPalRequiredDefinitionType getPayPalRequired() {
        return payPalRequired;
    }

    /**
     * Sets the value of the payPalRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalRequiredDefinitionType }
     *     
     */
    public void setPayPalRequired(PayPalRequiredDefinitionType value) {
        this.payPalRequired = value;
    }

    /**
     * Gets the value of the eBayMotorsProAdFormatEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProAdFormatEnabledDefinitionType }
     *     
     */
    public EBayMotorsProAdFormatEnabledDefinitionType getEBayMotorsProAdFormatEnabled() {
        return eBayMotorsProAdFormatEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProAdFormatEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProAdFormatEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProAdFormatEnabled(EBayMotorsProAdFormatEnabledDefinitionType value) {
        this.eBayMotorsProAdFormatEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProContactByPhoneEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProContactByPhoneEnabledDefinitionType }
     *     
     */
    public EBayMotorsProContactByPhoneEnabledDefinitionType getEBayMotorsProContactByPhoneEnabled() {
        return eBayMotorsProContactByPhoneEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProContactByPhoneEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProContactByPhoneEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProContactByPhoneEnabled(EBayMotorsProContactByPhoneEnabledDefinitionType value) {
        this.eBayMotorsProContactByPhoneEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProPhoneCount property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProPhoneCountDefinitionType }
     *     
     */
    public EBayMotorsProPhoneCountDefinitionType getEBayMotorsProPhoneCount() {
        return eBayMotorsProPhoneCount;
    }

    /**
     * Sets the value of the eBayMotorsProPhoneCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProPhoneCountDefinitionType }
     *     
     */
    public void setEBayMotorsProPhoneCount(EBayMotorsProPhoneCountDefinitionType value) {
        this.eBayMotorsProPhoneCount = value;
    }

    /**
     * Gets the value of the eBayMotorsProContactByAddressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProContactByAddressEnabledDefinitionType }
     *     
     */
    public EBayMotorsProContactByAddressEnabledDefinitionType getEBayMotorsProContactByAddressEnabled() {
        return eBayMotorsProContactByAddressEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProContactByAddressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProContactByAddressEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProContactByAddressEnabled(EBayMotorsProContactByAddressEnabledDefinitionType value) {
        this.eBayMotorsProContactByAddressEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProStreetCount property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProStreetCountDefinitionType }
     *     
     */
    public EBayMotorsProStreetCountDefinitionType getEBayMotorsProStreetCount() {
        return eBayMotorsProStreetCount;
    }

    /**
     * Sets the value of the eBayMotorsProStreetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProStreetCountDefinitionType }
     *     
     */
    public void setEBayMotorsProStreetCount(EBayMotorsProStreetCountDefinitionType value) {
        this.eBayMotorsProStreetCount = value;
    }

    /**
     * Gets the value of the eBayMotorsProCompanyNameEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProCompanyNameEnabledDefinitionType }
     *     
     */
    public EBayMotorsProCompanyNameEnabledDefinitionType getEBayMotorsProCompanyNameEnabled() {
        return eBayMotorsProCompanyNameEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProCompanyNameEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProCompanyNameEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProCompanyNameEnabled(EBayMotorsProCompanyNameEnabledDefinitionType value) {
        this.eBayMotorsProCompanyNameEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProContactByEmailEnabledDefinitionType }
     *     
     */
    public EBayMotorsProContactByEmailEnabledDefinitionType getEBayMotorsProContactByEmailEnabled() {
        return eBayMotorsProContactByEmailEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProContactByEmailEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProContactByEmailEnabled(EBayMotorsProContactByEmailEnabledDefinitionType value) {
        this.eBayMotorsProContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProBestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProBestOfferEnabledDefinitionType }
     *     
     */
    public EBayMotorsProBestOfferEnabledDefinitionType getEBayMotorsProBestOfferEnabled() {
        return eBayMotorsProBestOfferEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProBestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProBestOfferEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProBestOfferEnabled(EBayMotorsProBestOfferEnabledDefinitionType value) {
        this.eBayMotorsProBestOfferEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProAutoAcceptEnabledDefinitionType }
     *     
     */
    public EBayMotorsProAutoAcceptEnabledDefinitionType getEBayMotorsProAutoAcceptEnabled() {
        return eBayMotorsProAutoAcceptEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProAutoAcceptEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProAutoAcceptEnabled(EBayMotorsProAutoAcceptEnabledDefinitionType value) {
        this.eBayMotorsProAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProAutoDeclineEnabledDefinitionType }
     *     
     */
    public EBayMotorsProAutoDeclineEnabledDefinitionType getEBayMotorsProAutoDeclineEnabled() {
        return eBayMotorsProAutoDeclineEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProAutoDeclineEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProAutoDeclineEnabled(EBayMotorsProAutoDeclineEnabledDefinitionType value) {
        this.eBayMotorsProAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProPaymentMethodCheckOutEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProPaymentMethodCheckOutEnabledDefinitionType }
     *     
     */
    public EBayMotorsProPaymentMethodCheckOutEnabledDefinitionType getEBayMotorsProPaymentMethodCheckOutEnabled() {
        return eBayMotorsProPaymentMethodCheckOutEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProPaymentMethodCheckOutEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProPaymentMethodCheckOutEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProPaymentMethodCheckOutEnabled(EBayMotorsProPaymentMethodCheckOutEnabledDefinitionType value) {
        this.eBayMotorsProPaymentMethodCheckOutEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProShippingMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProShippingMethodEnabledDefinitionType }
     *     
     */
    public EBayMotorsProShippingMethodEnabledDefinitionType getEBayMotorsProShippingMethodEnabled() {
        return eBayMotorsProShippingMethodEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProShippingMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProShippingMethodEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProShippingMethodEnabled(EBayMotorsProShippingMethodEnabledDefinitionType value) {
        this.eBayMotorsProShippingMethodEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProCounterOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProCounterOfferEnabledDefinitionType }
     *     
     */
    public EBayMotorsProCounterOfferEnabledDefinitionType getEBayMotorsProCounterOfferEnabled() {
        return eBayMotorsProCounterOfferEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProCounterOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProCounterOfferEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProCounterOfferEnabled(EBayMotorsProCounterOfferEnabledDefinitionType value) {
        this.eBayMotorsProCounterOfferEnabled = value;
    }

    /**
     * Gets the value of the eBayMotorsProSellerContactDetailsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EBayMotorsProSellerContactDetailsEnabledDefinitionType }
     *     
     */
    public EBayMotorsProSellerContactDetailsEnabledDefinitionType getEBayMotorsProSellerContactDetailsEnabled() {
        return eBayMotorsProSellerContactDetailsEnabled;
    }

    /**
     * Sets the value of the eBayMotorsProSellerContactDetailsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayMotorsProSellerContactDetailsEnabledDefinitionType }
     *     
     */
    public void setEBayMotorsProSellerContactDetailsEnabled(EBayMotorsProSellerContactDetailsEnabledDefinitionType value) {
        this.eBayMotorsProSellerContactDetailsEnabled = value;
    }

    /**
     * Gets the value of the localMarketAdFormatEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketAdFormatEnabledDefinitionType }
     *     
     */
    public LocalMarketAdFormatEnabledDefinitionType getLocalMarketAdFormatEnabled() {
        return localMarketAdFormatEnabled;
    }

    /**
     * Sets the value of the localMarketAdFormatEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketAdFormatEnabledDefinitionType }
     *     
     */
    public void setLocalMarketAdFormatEnabled(LocalMarketAdFormatEnabledDefinitionType value) {
        this.localMarketAdFormatEnabled = value;
    }

    /**
     * Gets the value of the localMarketContactByPhoneEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketContactByPhoneEnabledDefinitionType }
     *     
     */
    public LocalMarketContactByPhoneEnabledDefinitionType getLocalMarketContactByPhoneEnabled() {
        return localMarketContactByPhoneEnabled;
    }

    /**
     * Sets the value of the localMarketContactByPhoneEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketContactByPhoneEnabledDefinitionType }
     *     
     */
    public void setLocalMarketContactByPhoneEnabled(LocalMarketContactByPhoneEnabledDefinitionType value) {
        this.localMarketContactByPhoneEnabled = value;
    }

    /**
     * Gets the value of the localMarketPhoneCount property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketPhoneCountDefinitionType }
     *     
     */
    public LocalMarketPhoneCountDefinitionType getLocalMarketPhoneCount() {
        return localMarketPhoneCount;
    }

    /**
     * Sets the value of the localMarketPhoneCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketPhoneCountDefinitionType }
     *     
     */
    public void setLocalMarketPhoneCount(LocalMarketPhoneCountDefinitionType value) {
        this.localMarketPhoneCount = value;
    }

    /**
     * Gets the value of the localMarketContactByAddressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketContactByAddressEnabledDefinitionType }
     *     
     */
    public LocalMarketContactByAddressEnabledDefinitionType getLocalMarketContactByAddressEnabled() {
        return localMarketContactByAddressEnabled;
    }

    /**
     * Sets the value of the localMarketContactByAddressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketContactByAddressEnabledDefinitionType }
     *     
     */
    public void setLocalMarketContactByAddressEnabled(LocalMarketContactByAddressEnabledDefinitionType value) {
        this.localMarketContactByAddressEnabled = value;
    }

    /**
     * Gets the value of the localMarketStreetCount property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketStreetCountDefinitionType }
     *     
     */
    public LocalMarketStreetCountDefinitionType getLocalMarketStreetCount() {
        return localMarketStreetCount;
    }

    /**
     * Sets the value of the localMarketStreetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketStreetCountDefinitionType }
     *     
     */
    public void setLocalMarketStreetCount(LocalMarketStreetCountDefinitionType value) {
        this.localMarketStreetCount = value;
    }

    /**
     * Gets the value of the localMarketCompanyNameEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketCompanyNameEnabledDefinitionType }
     *     
     */
    public LocalMarketCompanyNameEnabledDefinitionType getLocalMarketCompanyNameEnabled() {
        return localMarketCompanyNameEnabled;
    }

    /**
     * Sets the value of the localMarketCompanyNameEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketCompanyNameEnabledDefinitionType }
     *     
     */
    public void setLocalMarketCompanyNameEnabled(LocalMarketCompanyNameEnabledDefinitionType value) {
        this.localMarketCompanyNameEnabled = value;
    }

    /**
     * Gets the value of the localMarketContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketContactByEmailEnabledDefinitionType }
     *     
     */
    public LocalMarketContactByEmailEnabledDefinitionType getLocalMarketContactByEmailEnabled() {
        return localMarketContactByEmailEnabled;
    }

    /**
     * Sets the value of the localMarketContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketContactByEmailEnabledDefinitionType }
     *     
     */
    public void setLocalMarketContactByEmailEnabled(LocalMarketContactByEmailEnabledDefinitionType value) {
        this.localMarketContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the localMarketBestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketBestOfferEnabledDefinitionType }
     *     
     */
    public LocalMarketBestOfferEnabledDefinitionType getLocalMarketBestOfferEnabled() {
        return localMarketBestOfferEnabled;
    }

    /**
     * Sets the value of the localMarketBestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketBestOfferEnabledDefinitionType }
     *     
     */
    public void setLocalMarketBestOfferEnabled(LocalMarketBestOfferEnabledDefinitionType value) {
        this.localMarketBestOfferEnabled = value;
    }

    /**
     * Gets the value of the localMarketAutoAcceptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketAutoAcceptEnabledDefinitionType }
     *     
     */
    public LocalMarketAutoAcceptEnabledDefinitionType getLocalMarketAutoAcceptEnabled() {
        return localMarketAutoAcceptEnabled;
    }

    /**
     * Sets the value of the localMarketAutoAcceptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketAutoAcceptEnabledDefinitionType }
     *     
     */
    public void setLocalMarketAutoAcceptEnabled(LocalMarketAutoAcceptEnabledDefinitionType value) {
        this.localMarketAutoAcceptEnabled = value;
    }

    /**
     * Gets the value of the localMarketAutoDeclineEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketAutoDeclineEnabledDefinitionType }
     *     
     */
    public LocalMarketAutoDeclineEnabledDefinitionType getLocalMarketAutoDeclineEnabled() {
        return localMarketAutoDeclineEnabled;
    }

    /**
     * Sets the value of the localMarketAutoDeclineEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketAutoDeclineEnabledDefinitionType }
     *     
     */
    public void setLocalMarketAutoDeclineEnabled(LocalMarketAutoDeclineEnabledDefinitionType value) {
        this.localMarketAutoDeclineEnabled = value;
    }

    /**
     * Gets the value of the localMarketPaymentMethodCheckOutEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketPaymentMethodCheckOutEnabledDefinitionType }
     *     
     */
    public LocalMarketPaymentMethodCheckOutEnabledDefinitionType getLocalMarketPaymentMethodCheckOutEnabled() {
        return localMarketPaymentMethodCheckOutEnabled;
    }

    /**
     * Sets the value of the localMarketPaymentMethodCheckOutEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketPaymentMethodCheckOutEnabledDefinitionType }
     *     
     */
    public void setLocalMarketPaymentMethodCheckOutEnabled(LocalMarketPaymentMethodCheckOutEnabledDefinitionType value) {
        this.localMarketPaymentMethodCheckOutEnabled = value;
    }

    /**
     * Gets the value of the localMarketShippingMethodEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketShippingMethodEnabledDefinitionType }
     *     
     */
    public LocalMarketShippingMethodEnabledDefinitionType getLocalMarketShippingMethodEnabled() {
        return localMarketShippingMethodEnabled;
    }

    /**
     * Sets the value of the localMarketShippingMethodEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketShippingMethodEnabledDefinitionType }
     *     
     */
    public void setLocalMarketShippingMethodEnabled(LocalMarketShippingMethodEnabledDefinitionType value) {
        this.localMarketShippingMethodEnabled = value;
    }

    /**
     * Gets the value of the localMarketCounterOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketCounterOfferEnabledDefinitionType }
     *     
     */
    public LocalMarketCounterOfferEnabledDefinitionType getLocalMarketCounterOfferEnabled() {
        return localMarketCounterOfferEnabled;
    }

    /**
     * Sets the value of the localMarketCounterOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketCounterOfferEnabledDefinitionType }
     *     
     */
    public void setLocalMarketCounterOfferEnabled(LocalMarketCounterOfferEnabledDefinitionType value) {
        this.localMarketCounterOfferEnabled = value;
    }

    /**
     * Gets the value of the localMarketSellerContactDetailsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link LocalMarketSellerContactDetailsEnabledDefinitionType }
     *     
     */
    public LocalMarketSellerContactDetailsEnabledDefinitionType getLocalMarketSellerContactDetailsEnabled() {
        return localMarketSellerContactDetailsEnabled;
    }

    /**
     * Sets the value of the localMarketSellerContactDetailsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalMarketSellerContactDetailsEnabledDefinitionType }
     *     
     */
    public void setLocalMarketSellerContactDetailsEnabled(LocalMarketSellerContactDetailsEnabledDefinitionType value) {
        this.localMarketSellerContactDetailsEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdPhoneCount property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdPhoneCountDefinitionType }
     *     
     */
    public ClassifiedAdPhoneCountDefinitionType getClassifiedAdPhoneCount() {
        return classifiedAdPhoneCount;
    }

    /**
     * Sets the value of the classifiedAdPhoneCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdPhoneCountDefinitionType }
     *     
     */
    public void setClassifiedAdPhoneCount(ClassifiedAdPhoneCountDefinitionType value) {
        this.classifiedAdPhoneCount = value;
    }

    /**
     * Gets the value of the classifiedAdContactByAddressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdContactByAddressEnabledDefinitionType }
     *     
     */
    public ClassifiedAdContactByAddressEnabledDefinitionType getClassifiedAdContactByAddressEnabled() {
        return classifiedAdContactByAddressEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByAddressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdContactByAddressEnabledDefinitionType }
     *     
     */
    public void setClassifiedAdContactByAddressEnabled(ClassifiedAdContactByAddressEnabledDefinitionType value) {
        this.classifiedAdContactByAddressEnabled = value;
    }

    /**
     * Gets the value of the classifiedAdStreetCount property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdStreetCountDefinitionType }
     *     
     */
    public ClassifiedAdStreetCountDefinitionType getClassifiedAdStreetCount() {
        return classifiedAdStreetCount;
    }

    /**
     * Sets the value of the classifiedAdStreetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdStreetCountDefinitionType }
     *     
     */
    public void setClassifiedAdStreetCount(ClassifiedAdStreetCountDefinitionType value) {
        this.classifiedAdStreetCount = value;
    }

    /**
     * Gets the value of the classifiedAdCompanyNameEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedAdCompanyNameEnabledDefinitionType }
     *     
     */
    public ClassifiedAdCompanyNameEnabledDefinitionType getClassifiedAdCompanyNameEnabled() {
        return classifiedAdCompanyNameEnabled;
    }

    /**
     * Sets the value of the classifiedAdCompanyNameEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedAdCompanyNameEnabledDefinitionType }
     *     
     */
    public void setClassifiedAdCompanyNameEnabled(ClassifiedAdCompanyNameEnabledDefinitionType value) {
        this.classifiedAdCompanyNameEnabled = value;
    }

    /**
     * Gets the value of the specialitySubscription property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialitySubscriptionDefinitionType }
     *     
     */
    public SpecialitySubscriptionDefinitionType getSpecialitySubscription() {
        return specialitySubscription;
    }

    /**
     * Sets the value of the specialitySubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialitySubscriptionDefinitionType }
     *     
     */
    public void setSpecialitySubscription(SpecialitySubscriptionDefinitionType value) {
        this.specialitySubscription = value;
    }

    /**
     * Gets the value of the regularSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link RegularSubscriptionDefinitionType }
     *     
     */
    public RegularSubscriptionDefinitionType getRegularSubscription() {
        return regularSubscription;
    }

    /**
     * Sets the value of the regularSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularSubscriptionDefinitionType }
     *     
     */
    public void setRegularSubscription(RegularSubscriptionDefinitionType value) {
        this.regularSubscription = value;
    }

    /**
     * Gets the value of the premiumSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumSubscriptionDefinitionType }
     *     
     */
    public PremiumSubscriptionDefinitionType getPremiumSubscription() {
        return premiumSubscription;
    }

    /**
     * Sets the value of the premiumSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumSubscriptionDefinitionType }
     *     
     */
    public void setPremiumSubscription(PremiumSubscriptionDefinitionType value) {
        this.premiumSubscription = value;
    }

    /**
     * Gets the value of the nonSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link NonSubscriptionDefinitionType }
     *     
     */
    public NonSubscriptionDefinitionType getNonSubscription() {
        return nonSubscription;
    }

    /**
     * Sets the value of the nonSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonSubscriptionDefinitionType }
     *     
     */
    public void setNonSubscription(NonSubscriptionDefinitionType value) {
        this.nonSubscription = value;
    }

    /**
     * Gets the value of the returnPolicyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnPolicyEnabledDefinitionType }
     *     
     */
    public ReturnPolicyEnabledDefinitionType getReturnPolicyEnabled() {
        return returnPolicyEnabled;
    }

    /**
     * Sets the value of the returnPolicyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnPolicyEnabledDefinitionType }
     *     
     */
    public void setReturnPolicyEnabled(ReturnPolicyEnabledDefinitionType value) {
        this.returnPolicyEnabled = value;
    }

    /**
     * Gets the value of the handlingTimeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingTimeEnabledDefinitionType }
     *     
     */
    public HandlingTimeEnabledDefinitionType getHandlingTimeEnabled() {
        return handlingTimeEnabled;
    }

    /**
     * Sets the value of the handlingTimeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingTimeEnabledDefinitionType }
     *     
     */
    public void setHandlingTimeEnabled(HandlingTimeEnabledDefinitionType value) {
        this.handlingTimeEnabled = value;
    }

    /**
     * Gets the value of the payPalRequiredForStoreOwner property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalRequiredForStoreOwnerDefinitionType }
     *     
     */
    public PayPalRequiredForStoreOwnerDefinitionType getPayPalRequiredForStoreOwner() {
        return payPalRequiredForStoreOwner;
    }

    /**
     * Sets the value of the payPalRequiredForStoreOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalRequiredForStoreOwnerDefinitionType }
     *     
     */
    public void setPayPalRequiredForStoreOwner(PayPalRequiredForStoreOwnerDefinitionType value) {
        this.payPalRequiredForStoreOwner = value;
    }

    /**
     * Gets the value of the reviseQuantityAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link ReviseQuantityAllowedDefinitionType }
     *     
     */
    public ReviseQuantityAllowedDefinitionType getReviseQuantityAllowed() {
        return reviseQuantityAllowed;
    }

    /**
     * Sets the value of the reviseQuantityAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviseQuantityAllowedDefinitionType }
     *     
     */
    public void setReviseQuantityAllowed(ReviseQuantityAllowedDefinitionType value) {
        this.reviseQuantityAllowed = value;
    }

    /**
     * Gets the value of the revisePriceAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link RevisePriceAllowedDefinitionType }
     *     
     */
    public RevisePriceAllowedDefinitionType getRevisePriceAllowed() {
        return revisePriceAllowed;
    }

    /**
     * Sets the value of the revisePriceAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisePriceAllowedDefinitionType }
     *     
     */
    public void setRevisePriceAllowed(RevisePriceAllowedDefinitionType value) {
        this.revisePriceAllowed = value;
    }

    /**
     * Gets the value of the storeOwnerExtendedListingDurationsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link StoreOwnerExtendedListingDurationsEnabledDefinitionType }
     *     
     */
    public StoreOwnerExtendedListingDurationsEnabledDefinitionType getStoreOwnerExtendedListingDurationsEnabled() {
        return storeOwnerExtendedListingDurationsEnabled;
    }

    /**
     * Sets the value of the storeOwnerExtendedListingDurationsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreOwnerExtendedListingDurationsEnabledDefinitionType }
     *     
     */
    public void setStoreOwnerExtendedListingDurationsEnabled(StoreOwnerExtendedListingDurationsEnabledDefinitionType value) {
        this.storeOwnerExtendedListingDurationsEnabled = value;
    }

    /**
     * Gets the value of the storeOwnerExtendedListingDurations property.
     * 
     * @return
     *     possible object is
     *     {@link StoreOwnerExtendedListingDurationsDefinitionType }
     *     
     */
    public StoreOwnerExtendedListingDurationsDefinitionType getStoreOwnerExtendedListingDurations() {
        return storeOwnerExtendedListingDurations;
    }

    /**
     * Sets the value of the storeOwnerExtendedListingDurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreOwnerExtendedListingDurationsDefinitionType }
     *     
     */
    public void setStoreOwnerExtendedListingDurations(StoreOwnerExtendedListingDurationsDefinitionType value) {
        this.storeOwnerExtendedListingDurations = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodDefinitionType }
     *     
     */
    public PaymentMethodDefinitionType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodDefinitionType }
     *     
     */
    public void setPaymentMethod(PaymentMethodDefinitionType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the group1MaxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Group1MaxFlatShippingCostDefinitionType }
     *     
     */
    public Group1MaxFlatShippingCostDefinitionType getGroup1MaxFlatShippingCost() {
        return group1MaxFlatShippingCost;
    }

    /**
     * Sets the value of the group1MaxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group1MaxFlatShippingCostDefinitionType }
     *     
     */
    public void setGroup1MaxFlatShippingCost(Group1MaxFlatShippingCostDefinitionType value) {
        this.group1MaxFlatShippingCost = value;
    }

    /**
     * Gets the value of the group2MaxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Group2MaxFlatShippingCostDefinitionType }
     *     
     */
    public Group2MaxFlatShippingCostDefinitionType getGroup2MaxFlatShippingCost() {
        return group2MaxFlatShippingCost;
    }

    /**
     * Sets the value of the group2MaxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group2MaxFlatShippingCostDefinitionType }
     *     
     */
    public void setGroup2MaxFlatShippingCost(Group2MaxFlatShippingCostDefinitionType value) {
        this.group2MaxFlatShippingCost = value;
    }

    /**
     * Gets the value of the group3MaxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Group3MaxFlatShippingCostDefinitionType }
     *     
     */
    public Group3MaxFlatShippingCostDefinitionType getGroup3MaxFlatShippingCost() {
        return group3MaxFlatShippingCost;
    }

    /**
     * Sets the value of the group3MaxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group3MaxFlatShippingCostDefinitionType }
     *     
     */
    public void setGroup3MaxFlatShippingCost(Group3MaxFlatShippingCostDefinitionType value) {
        this.group3MaxFlatShippingCost = value;
    }

    /**
     * Gets the value of the maxFlatShippingCostCBTExempt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxFlatShippingCostCBTExemptDefinitionType }
     *     
     */
    public MaxFlatShippingCostCBTExemptDefinitionType getMaxFlatShippingCostCBTExempt() {
        return maxFlatShippingCostCBTExempt;
    }

    /**
     * Sets the value of the maxFlatShippingCostCBTExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxFlatShippingCostCBTExemptDefinitionType }
     *     
     */
    public void setMaxFlatShippingCostCBTExempt(MaxFlatShippingCostCBTExemptDefinitionType value) {
        this.maxFlatShippingCostCBTExempt = value;
    }

    /**
     * Gets the value of the maxFlatShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link MaxFlatShippingCostDefinitionType }
     *     
     */
    public MaxFlatShippingCostDefinitionType getMaxFlatShippingCost() {
        return maxFlatShippingCost;
    }

    /**
     * Sets the value of the maxFlatShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxFlatShippingCostDefinitionType }
     *     
     */
    public void setMaxFlatShippingCost(MaxFlatShippingCostDefinitionType value) {
        this.maxFlatShippingCost = value;
    }

    /**
     * Gets the value of the variationsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link VariationsEnabledDefinitionType }
     *     
     */
    public VariationsEnabledDefinitionType getVariationsEnabled() {
        return variationsEnabled;
    }

    /**
     * Sets the value of the variationsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationsEnabledDefinitionType }
     *     
     */
    public void setVariationsEnabled(VariationsEnabledDefinitionType value) {
        this.variationsEnabled = value;
    }

    /**
     * Gets the value of the attributeConversionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeConversionEnabledFeatureDefinitionType }
     *     
     */
    public AttributeConversionEnabledFeatureDefinitionType getAttributeConversionEnabled() {
        return attributeConversionEnabled;
    }

    /**
     * Sets the value of the attributeConversionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeConversionEnabledFeatureDefinitionType }
     *     
     */
    public void setAttributeConversionEnabled(AttributeConversionEnabledFeatureDefinitionType value) {
        this.attributeConversionEnabled = value;
    }

    /**
     * Gets the value of the freeGalleryPlusEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link FreeGalleryPlusEnabledDefinitionType }
     *     
     */
    public FreeGalleryPlusEnabledDefinitionType getFreeGalleryPlusEnabled() {
        return freeGalleryPlusEnabled;
    }

    /**
     * Sets the value of the freeGalleryPlusEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeGalleryPlusEnabledDefinitionType }
     *     
     */
    public void setFreeGalleryPlusEnabled(FreeGalleryPlusEnabledDefinitionType value) {
        this.freeGalleryPlusEnabled = value;
    }

    /**
     * Gets the value of the freePicturePackEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link FreePicturePackEnabledDefinitionType }
     *     
     */
    public FreePicturePackEnabledDefinitionType getFreePicturePackEnabled() {
        return freePicturePackEnabled;
    }

    /**
     * Sets the value of the freePicturePackEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreePicturePackEnabledDefinitionType }
     *     
     */
    public void setFreePicturePackEnabled(FreePicturePackEnabledDefinitionType value) {
        this.freePicturePackEnabled = value;
    }

    /**
     * Gets the value of the itemCompatibilityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCompatibilityEnabledDefinitionType }
     *     
     */
    public ItemCompatibilityEnabledDefinitionType getItemCompatibilityEnabled() {
        return itemCompatibilityEnabled;
    }

    /**
     * Sets the value of the itemCompatibilityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCompatibilityEnabledDefinitionType }
     *     
     */
    public void setItemCompatibilityEnabled(ItemCompatibilityEnabledDefinitionType value) {
        this.itemCompatibilityEnabled = value;
    }

    /**
     * Gets the value of the maxItemCompatibility property.
     * 
     * @return
     *     possible object is
     *     {@link MaxItemCompatibilityDefinitionType }
     *     
     */
    public MaxItemCompatibilityDefinitionType getMaxItemCompatibility() {
        return maxItemCompatibility;
    }

    /**
     * Sets the value of the maxItemCompatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxItemCompatibilityDefinitionType }
     *     
     */
    public void setMaxItemCompatibility(MaxItemCompatibilityDefinitionType value) {
        this.maxItemCompatibility = value;
    }

    /**
     * Gets the value of the minItemCompatibility property.
     * 
     * @return
     *     possible object is
     *     {@link MinItemCompatibilityDefinitionType }
     *     
     */
    public MinItemCompatibilityDefinitionType getMinItemCompatibility() {
        return minItemCompatibility;
    }

    /**
     * Sets the value of the minItemCompatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinItemCompatibilityDefinitionType }
     *     
     */
    public void setMinItemCompatibility(MinItemCompatibilityDefinitionType value) {
        this.minItemCompatibility = value;
    }

    /**
     * Gets the value of the conditionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionEnabledDefinitionType }
     *     
     */
    public ConditionEnabledDefinitionType getConditionEnabled() {
        return conditionEnabled;
    }

    /**
     * Sets the value of the conditionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionEnabledDefinitionType }
     *     
     */
    public void setConditionEnabled(ConditionEnabledDefinitionType value) {
        this.conditionEnabled = value;
    }

    /**
     * Gets the value of the conditionValues property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionValuesDefinitionType }
     *     
     */
    public ConditionValuesDefinitionType getConditionValues() {
        return conditionValues;
    }

    /**
     * Sets the value of the conditionValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionValuesDefinitionType }
     *     
     */
    public void setConditionValues(ConditionValuesDefinitionType value) {
        this.conditionValues = value;
    }

    /**
     * Gets the value of the valueCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ValueCategoryDefinitionType }
     *     
     */
    public ValueCategoryDefinitionType getValueCategory() {
        return valueCategory;
    }

    /**
     * Sets the value of the valueCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueCategoryDefinitionType }
     *     
     */
    public void setValueCategory(ValueCategoryDefinitionType value) {
        this.valueCategory = value;
    }

    /**
     * Gets the value of the productCreationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCreationEnabledDefinitionType }
     *     
     */
    public ProductCreationEnabledDefinitionType getProductCreationEnabled() {
        return productCreationEnabled;
    }

    /**
     * Sets the value of the productCreationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCreationEnabledDefinitionType }
     *     
     */
    public void setProductCreationEnabled(ProductCreationEnabledDefinitionType value) {
        this.productCreationEnabled = value;
    }

    /**
     * Gets the value of the eanEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EANEnabledDefinitionType }
     *     
     */
    public EANEnabledDefinitionType getEANEnabled() {
        return eanEnabled;
    }

    /**
     * Sets the value of the eanEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EANEnabledDefinitionType }
     *     
     */
    public void setEANEnabled(EANEnabledDefinitionType value) {
        this.eanEnabled = value;
    }

    /**
     * Gets the value of the isbnEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ISBNEnabledDefinitionType }
     *     
     */
    public ISBNEnabledDefinitionType getISBNEnabled() {
        return isbnEnabled;
    }

    /**
     * Sets the value of the isbnEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISBNEnabledDefinitionType }
     *     
     */
    public void setISBNEnabled(ISBNEnabledDefinitionType value) {
        this.isbnEnabled = value;
    }

    /**
     * Gets the value of the upcEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link UPCEnabledDefinitionType }
     *     
     */
    public UPCEnabledDefinitionType getUPCEnabled() {
        return upcEnabled;
    }

    /**
     * Sets the value of the upcEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link UPCEnabledDefinitionType }
     *     
     */
    public void setUPCEnabled(UPCEnabledDefinitionType value) {
        this.upcEnabled = value;
    }

    /**
     * Gets the value of the compatibleVehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link CompatibleVehicleTypeDefinitionType }
     *     
     */
    public CompatibleVehicleTypeDefinitionType getCompatibleVehicleType() {
        return compatibleVehicleType;
    }

    /**
     * Sets the value of the compatibleVehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompatibleVehicleTypeDefinitionType }
     *     
     */
    public void setCompatibleVehicleType(CompatibleVehicleTypeDefinitionType value) {
        this.compatibleVehicleType = value;
    }

    /**
     * Gets the value of the maxGranularFitmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link MaxGranularFitmentCountDefinitionType }
     *     
     */
    public MaxGranularFitmentCountDefinitionType getMaxGranularFitmentCount() {
        return maxGranularFitmentCount;
    }

    /**
     * Sets the value of the maxGranularFitmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxGranularFitmentCountDefinitionType }
     *     
     */
    public void setMaxGranularFitmentCount(MaxGranularFitmentCountDefinitionType value) {
        this.maxGranularFitmentCount = value;
    }

    /**
     * Gets the value of the paymentOptionsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOptionsGroupEnabledDefinitionType }
     *     
     */
    public PaymentOptionsGroupEnabledDefinitionType getPaymentOptionsGroup() {
        return paymentOptionsGroup;
    }

    /**
     * Sets the value of the paymentOptionsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOptionsGroupEnabledDefinitionType }
     *     
     */
    public void setPaymentOptionsGroup(PaymentOptionsGroupEnabledDefinitionType value) {
        this.paymentOptionsGroup = value;
    }

    /**
     * Gets the value of the shippingProfileCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCategoryGroupDefinitionType }
     *     
     */
    public ProfileCategoryGroupDefinitionType getShippingProfileCategoryGroup() {
        return shippingProfileCategoryGroup;
    }

    /**
     * Sets the value of the shippingProfileCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCategoryGroupDefinitionType }
     *     
     */
    public void setShippingProfileCategoryGroup(ProfileCategoryGroupDefinitionType value) {
        this.shippingProfileCategoryGroup = value;
    }

    /**
     * Gets the value of the paymentProfileCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCategoryGroupDefinitionType }
     *     
     */
    public ProfileCategoryGroupDefinitionType getPaymentProfileCategoryGroup() {
        return paymentProfileCategoryGroup;
    }

    /**
     * Sets the value of the paymentProfileCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCategoryGroupDefinitionType }
     *     
     */
    public void setPaymentProfileCategoryGroup(ProfileCategoryGroupDefinitionType value) {
        this.paymentProfileCategoryGroup = value;
    }

    /**
     * Gets the value of the returnPolicyProfileCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCategoryGroupDefinitionType }
     *     
     */
    public ProfileCategoryGroupDefinitionType getReturnPolicyProfileCategoryGroup() {
        return returnPolicyProfileCategoryGroup;
    }

    /**
     * Sets the value of the returnPolicyProfileCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCategoryGroupDefinitionType }
     *     
     */
    public void setReturnPolicyProfileCategoryGroup(ProfileCategoryGroupDefinitionType value) {
        this.returnPolicyProfileCategoryGroup = value;
    }

    /**
     * Gets the value of the vinSupported property.
     * 
     * @return
     *     possible object is
     *     {@link VINSupportedDefinitionType }
     *     
     */
    public VINSupportedDefinitionType getVINSupported() {
        return vinSupported;
    }

    /**
     * Sets the value of the vinSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link VINSupportedDefinitionType }
     *     
     */
    public void setVINSupported(VINSupportedDefinitionType value) {
        this.vinSupported = value;
    }

    /**
     * Gets the value of the vrmSupported property.
     * 
     * @return
     *     possible object is
     *     {@link VRMSupportedDefinitionType }
     *     
     */
    public VRMSupportedDefinitionType getVRMSupported() {
        return vrmSupported;
    }

    /**
     * Sets the value of the vrmSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link VRMSupportedDefinitionType }
     *     
     */
    public void setVRMSupported(VRMSupportedDefinitionType value) {
        this.vrmSupported = value;
    }

    /**
     * Gets the value of the sellerProvidedTitleSupported property.
     * 
     * @return
     *     possible object is
     *     {@link SellerProvidedTitleSupportedDefinitionType }
     *     
     */
    public SellerProvidedTitleSupportedDefinitionType getSellerProvidedTitleSupported() {
        return sellerProvidedTitleSupported;
    }

    /**
     * Sets the value of the sellerProvidedTitleSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerProvidedTitleSupportedDefinitionType }
     *     
     */
    public void setSellerProvidedTitleSupported(SellerProvidedTitleSupportedDefinitionType value) {
        this.sellerProvidedTitleSupported = value;
    }

    /**
     * Gets the value of the depositSupported property.
     * 
     * @return
     *     possible object is
     *     {@link DepositSupportedDefinitionType }
     *     
     */
    public DepositSupportedDefinitionType getDepositSupported() {
        return depositSupported;
    }

    /**
     * Sets the value of the depositSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositSupportedDefinitionType }
     *     
     */
    public void setDepositSupported(DepositSupportedDefinitionType value) {
        this.depositSupported = value;
    }

    /**
     * Gets the value of the globalShippingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalShippingEnabledDefinitionType }
     *     
     */
    public GlobalShippingEnabledDefinitionType getGlobalShippingEnabled() {
        return globalShippingEnabled;
    }

    /**
     * Sets the value of the globalShippingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalShippingEnabledDefinitionType }
     *     
     */
    public void setGlobalShippingEnabled(GlobalShippingEnabledDefinitionType value) {
        this.globalShippingEnabled = value;
    }

    /**
     * Gets the value of the additionalCompatibilityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCompatibilityEnabledDefinitionType }
     *     
     */
    public AdditionalCompatibilityEnabledDefinitionType getAdditionalCompatibilityEnabled() {
        return additionalCompatibilityEnabled;
    }

    /**
     * Sets the value of the additionalCompatibilityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCompatibilityEnabledDefinitionType }
     *     
     */
    public void setAdditionalCompatibilityEnabled(AdditionalCompatibilityEnabledDefinitionType value) {
        this.additionalCompatibilityEnabled = value;
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

    /**
     * Gets the value of the pickupDropOffEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link PickupDropOffEnabledDefinitionType }
     *     
     */
    public PickupDropOffEnabledDefinitionType getPickupDropOffEnabled() {
        return pickupDropOffEnabled;
    }

    /**
     * Sets the value of the pickupDropOffEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupDropOffEnabledDefinitionType }
     *     
     */
    public void setPickupDropOffEnabled(PickupDropOffEnabledDefinitionType value) {
        this.pickupDropOffEnabled = value;
    }

    /**
     * Gets the value of the digitalGoodDeliveryEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalGoodDeliveryEnabledDefinitionType }
     *     
     */
    public DigitalGoodDeliveryEnabledDefinitionType getDigitalGoodDeliveryEnabled() {
        return digitalGoodDeliveryEnabled;
    }

    /**
     * Sets the value of the digitalGoodDeliveryEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalGoodDeliveryEnabledDefinitionType }
     *     
     */
    public void setDigitalGoodDeliveryEnabled(DigitalGoodDeliveryEnabledDefinitionType value) {
        this.digitalGoodDeliveryEnabled = value;
    }

    /**
     * Gets the value of the epidSupported property.
     * 
     * @return
     *     possible object is
     *     {@link EpidSupportedDefinitionType }
     *     
     */
    public EpidSupportedDefinitionType getEpidSupported() {
        return epidSupported;
    }

    /**
     * Sets the value of the epidSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link EpidSupportedDefinitionType }
     *     
     */
    public void setEpidSupported(EpidSupportedDefinitionType value) {
        this.epidSupported = value;
    }

    /**
     * Gets the value of the kTypeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link KTypeSupportedDefinitionType }
     *     
     */
    public KTypeSupportedDefinitionType getKTypeSupported() {
        return kTypeSupported;
    }

    /**
     * Sets the value of the kTypeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link KTypeSupportedDefinitionType }
     *     
     */
    public void setKTypeSupported(KTypeSupportedDefinitionType value) {
        this.kTypeSupported = value;
    }

    /**
     * Gets the value of the productRequiredEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link ProductRequiredEnabledDefinitionType }
     *     
     */
    public ProductRequiredEnabledDefinitionType getProductRequiredEnabled() {
        return productRequiredEnabled;
    }

    /**
     * Sets the value of the productRequiredEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductRequiredEnabledDefinitionType }
     *     
     */
    public void setProductRequiredEnabled(ProductRequiredEnabledDefinitionType value) {
        this.productRequiredEnabled = value;
    }

    /**
     * Gets the value of the domesticReturnsAcceptedValues property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticReturnsAcceptedDefinitionType }
     *     
     */
    public DomesticReturnsAcceptedDefinitionType getDomesticReturnsAcceptedValues() {
        return domesticReturnsAcceptedValues;
    }

    /**
     * Sets the value of the domesticReturnsAcceptedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticReturnsAcceptedDefinitionType }
     *     
     */
    public void setDomesticReturnsAcceptedValues(DomesticReturnsAcceptedDefinitionType value) {
        this.domesticReturnsAcceptedValues = value;
    }

    /**
     * Gets the value of the internationalReturnsAcceptedValues property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalReturnsAcceptedDefinitionType }
     *     
     */
    public InternationalReturnsAcceptedDefinitionType getInternationalReturnsAcceptedValues() {
        return internationalReturnsAcceptedValues;
    }

    /**
     * Sets the value of the internationalReturnsAcceptedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalReturnsAcceptedDefinitionType }
     *     
     */
    public void setInternationalReturnsAcceptedValues(InternationalReturnsAcceptedDefinitionType value) {
        this.internationalReturnsAcceptedValues = value;
    }

    /**
     * Gets the value of the domesticReturnsDurationValues property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticReturnsDurationDefinitionType }
     *     
     */
    public DomesticReturnsDurationDefinitionType getDomesticReturnsDurationValues() {
        return domesticReturnsDurationValues;
    }

    /**
     * Sets the value of the domesticReturnsDurationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticReturnsDurationDefinitionType }
     *     
     */
    public void setDomesticReturnsDurationValues(DomesticReturnsDurationDefinitionType value) {
        this.domesticReturnsDurationValues = value;
    }

    /**
     * Gets the value of the internationalReturnsDurationValues property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalReturnsDurationDefinitionType }
     *     
     */
    public InternationalReturnsDurationDefinitionType getInternationalReturnsDurationValues() {
        return internationalReturnsDurationValues;
    }

    /**
     * Sets the value of the internationalReturnsDurationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalReturnsDurationDefinitionType }
     *     
     */
    public void setInternationalReturnsDurationValues(InternationalReturnsDurationDefinitionType value) {
        this.internationalReturnsDurationValues = value;
    }

    /**
     * Gets the value of the domesticReturnsShipmentPayeeValues property.
     * 
     * @return
     *     possible object is
     *     {@link DomesticReturnsShipmentPayeeDefinitionType }
     *     
     */
    public DomesticReturnsShipmentPayeeDefinitionType getDomesticReturnsShipmentPayeeValues() {
        return domesticReturnsShipmentPayeeValues;
    }

    /**
     * Sets the value of the domesticReturnsShipmentPayeeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomesticReturnsShipmentPayeeDefinitionType }
     *     
     */
    public void setDomesticReturnsShipmentPayeeValues(DomesticReturnsShipmentPayeeDefinitionType value) {
        this.domesticReturnsShipmentPayeeValues = value;
    }

    /**
     * Gets the value of the internationalReturnsShipmentPayeeValues property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalReturnsShipmentPayeeDefinitionType }
     *     
     */
    public InternationalReturnsShipmentPayeeDefinitionType getInternationalReturnsShipmentPayeeValues() {
        return internationalReturnsShipmentPayeeValues;
    }

    /**
     * Sets the value of the internationalReturnsShipmentPayeeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalReturnsShipmentPayeeDefinitionType }
     *     
     */
    public void setInternationalReturnsShipmentPayeeValues(InternationalReturnsShipmentPayeeDefinitionType value) {
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
     *     {@link ReturnPolicyDescriptionEnabledDefinitionType }
     *     
     */
    public ReturnPolicyDescriptionEnabledDefinitionType getReturnPolicyDescriptionEnabled() {
        return returnPolicyDescriptionEnabled;
    }

    /**
     * Sets the value of the returnPolicyDescriptionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnPolicyDescriptionEnabledDefinitionType }
     *     
     */
    public void setReturnPolicyDescriptionEnabled(ReturnPolicyDescriptionEnabledDefinitionType value) {
        this.returnPolicyDescriptionEnabled = value;
    }

}
