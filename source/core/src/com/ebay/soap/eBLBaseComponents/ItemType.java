
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import org.w3c.dom.Element;


/**
 * 
 * 				Contains the data defining one item. A seller populates an object of this type at listing time with the definition of a new item. A seller also uses an object of this type to relist or revise an item. Calls that retrieve item data (such as the <b>GetSellerList</b> call) return an object of this type, filled with the item's data.
 * 			
 * 
 * <p>Java class for ItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BiddingDetails" type="{urn:ebay:apis:eBLBaseComponents}BiddingDetailsType" minOccurs="0"/>
 *         &lt;element name="BuyerProtection" type="{urn:ebay:apis:eBLBaseComponents}BuyerProtectionCodeType" minOccurs="0"/>
 *         &lt;element name="BuyItNowPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CategoryMappingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Charity" type="{urn:ebay:apis:eBLBaseComponents}CharityType" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="Currency" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptionReviseMode" type="{urn:ebay:apis:eBLBaseComponents}DescriptionReviseModeCodeType" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="ListingDetails" type="{urn:ebay:apis:eBLBaseComponents}ListingDetailsType" minOccurs="0"/>
 *         &lt;element name="ListingDuration" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ListingEnhancement" type="{urn:ebay:apis:eBLBaseComponents}ListingEnhancementsCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LotSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentDetailsType" minOccurs="0"/>
 *         &lt;element name="PaymentMethods" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PayPalEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCategory" type="{urn:ebay:apis:eBLBaseComponents}CategoryType" minOccurs="0"/>
 *         &lt;element name="PrivateListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductListingDetails" type="{urn:ebay:apis:eBLBaseComponents}ProductListingDetailsType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrivateNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelistLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsItemEMSEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReservePrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ReviseStatus" type="{urn:ebay:apis:eBLBaseComponents}ReviseStatusType" minOccurs="0"/>
 *         &lt;element name="ScheduleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SecondaryCategory" type="{urn:ebay:apis:eBLBaseComponents}CategoryType" minOccurs="0"/>
 *         &lt;element name="FreeAddedCategory" type="{urn:ebay:apis:eBLBaseComponents}CategoryType" minOccurs="0"/>
 *         &lt;element name="Seller" type="{urn:ebay:apis:eBLBaseComponents}UserType" minOccurs="0"/>
 *         &lt;element name="SellingStatus" type="{urn:ebay:apis:eBLBaseComponents}SellingStatusType" minOccurs="0"/>
 *         &lt;element name="ShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="ShipToLocations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Site" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="StartPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Storefront" type="{urn:ebay:apis:eBLBaseComponents}StorefrontType" minOccurs="0"/>
 *         &lt;element name="SubTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeLeft" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UUID" type="{urn:ebay:apis:eBLBaseComponents}UUIDType" minOccurs="0"/>
 *         &lt;element name="VATDetails" type="{urn:ebay:apis:eBLBaseComponents}VATDetailsType" minOccurs="0"/>
 *         &lt;element name="SellerVacationNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WatchCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HitCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DisableBuyerRequirements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BestOfferDetails" type="{urn:ebay:apis:eBLBaseComponents}BestOfferDetailsType" minOccurs="0"/>
 *         &lt;element name="LocationDefaulted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseTaxTable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetItFast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyerResponsibleForShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuestionCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Relisted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QuantityAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SKU" type="{urn:ebay:apis:eBLBaseComponents}SKUType" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PictureDetails" type="{urn:ebay:apis:eBLBaseComponents}PictureDetailsType" minOccurs="0"/>
 *         &lt;element name="VideoDetails" type="{urn:ebay:apis:eBLBaseComponents}VideoDetailsType" minOccurs="0"/>
 *         &lt;element name="ExtendedProducerResponsibility" type="{urn:ebay:apis:eBLBaseComponents}ExtendedProducerResponsibilityType" minOccurs="0"/>
 *         &lt;element name="CustomPolicies" type="{urn:ebay:apis:eBLBaseComponents}CustomPoliciesType" minOccurs="0"/>
 *         &lt;element name="DispatchTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellerContactDetails" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="TotalQuestionCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProxyItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtendedSellerContactDetails" type="{urn:ebay:apis:eBLBaseComponents}ExtendedContactDetailsType" minOccurs="0"/>
 *         &lt;element name="LeadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NewLeadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdPayPerLeadFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ApplyBuyerProtection" type="{urn:ebay:apis:eBLBaseComponents}BuyerProtectionDetailsType" minOccurs="0"/>
 *         &lt;element name="ListingSubtype2" type="{urn:ebay:apis:eBLBaseComponents}ListingSubtypeCodeType" minOccurs="0"/>
 *         &lt;element name="MechanicalCheckAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemPolicyViolation" type="{urn:ebay:apis:eBLBaseComponents}ItemPolicyViolationType" minOccurs="0"/>
 *         &lt;element name="CrossBorderTrade" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BusinessSellerDetails" type="{urn:ebay:apis:eBLBaseComponents}BusinessSellerDetailsType" minOccurs="0"/>
 *         &lt;element name="BuyerGuaranteePrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="BuyerRequirementDetails" type="{urn:ebay:apis:eBLBaseComponents}BuyerRequirementDetailsType" minOccurs="0"/>
 *         &lt;element name="ReturnPolicy" type="{urn:ebay:apis:eBLBaseComponents}ReturnPolicyType" minOccurs="0"/>
 *         &lt;element name="PaymentAllowedSite" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InventoryTrackingMethod" type="{urn:ebay:apis:eBLBaseComponents}InventoryTrackingMethodCodeType" minOccurs="0"/>
 *         &lt;element name="IntegratedMerchantCreditCardEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Variations" type="{urn:ebay:apis:eBLBaseComponents}VariationsType" minOccurs="0"/>
 *         &lt;element name="ItemCompatibilityList" type="{urn:ebay:apis:eBLBaseComponents}ItemCompatibilityListType" minOccurs="0"/>
 *         &lt;element name="ItemCompatibilityCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConditionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConditionDescriptors" type="{urn:ebay:apis:eBLBaseComponents}ConditionDescriptorsType" minOccurs="0"/>
 *         &lt;element name="ConditionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConditionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Regulatory" type="{urn:ebay:apis:eBLBaseComponents}RegulatoryType" minOccurs="0"/>
 *         &lt;element name="TaxCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityAvailableHint" type="{urn:ebay:apis:eBLBaseComponents}QuantityAvailableHintCodeType" minOccurs="0"/>
 *         &lt;element name="QuantityThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DiscountPriceInfo" type="{urn:ebay:apis:eBLBaseComponents}DiscountPriceInfoType" minOccurs="0"/>
 *         &lt;element name="SellerProvidedTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VINLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VRM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VRMLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerProfiles" type="{urn:ebay:apis:eBLBaseComponents}SellerProfilesType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCostOverrideList" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceCostOverrideListType" minOccurs="0"/>
 *         &lt;element name="ShippingPackageDetails" type="{urn:ebay:apis:eBLBaseComponents}ShipPackageDetailsType" minOccurs="0"/>
 *         &lt;element name="TopRatedListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QuantityRestrictionPerBuyer" type="{urn:ebay:apis:eBLBaseComponents}QuantityRestrictionPerBuyerInfoType" minOccurs="0"/>
 *         &lt;element name="FloorPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CeilingPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="IsIntermediatedShippingEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UnitInfo" type="{urn:ebay:apis:eBLBaseComponents}UnitInfoType" minOccurs="0"/>
 *         &lt;element name="RelistParentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ConditionDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HideFromSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReasonHideFromSearch" type="{urn:ebay:apis:eBLBaseComponents}ReasonHideFromSearchCodeType" minOccurs="0"/>
 *         &lt;element name="PickupInStoreDetails" type="{urn:ebay:apis:eBLBaseComponents}PickupInStoreDetailsType" minOccurs="0"/>
 *         &lt;element name="IgnoreQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AvailableForPickupDropOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EligibleForPickupDropOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DigitalGoodInfo" type="{urn:ebay:apis:eBLBaseComponents}DigitalGoodInfoType" minOccurs="0"/>
 *         &lt;element name="eBayPlus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayPlusEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eMailDeliveryAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSecureDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ItemType", propOrder = {
    "applicationData",
    "autoPay",
    "biddingDetails",
    "buyerProtection",
    "buyItNowPrice",
    "categoryMappingAllowed",
    "charity",
    "country",
    "currency",
    "description",
    "descriptionReviseMode",
    "itemID",
    "listingDetails",
    "listingDuration",
    "listingEnhancement",
    "listingType",
    "location",
    "lotSize",
    "paymentDetails",
    "paymentMethods",
    "payPalEmailAddress",
    "primaryCategory",
    "privateListing",
    "productListingDetails",
    "quantity",
    "privateNotes",
    "relistLink",
    "isItemEMSEligible",
    "reservePrice",
    "reviseStatus",
    "scheduleTime",
    "secondaryCategory",
    "freeAddedCategory",
    "seller",
    "sellingStatus",
    "shippingDetails",
    "shipToLocations",
    "site",
    "startPrice",
    "storefront",
    "subTitle",
    "timeLeft",
    "title",
    "uuid",
    "vatDetails",
    "sellerVacationNote",
    "watchCount",
    "hitCount",
    "disableBuyerRequirements",
    "bestOfferDetails",
    "locationDefaulted",
    "useTaxTable",
    "getItFast",
    "buyerResponsibleForShipping",
    "eBayNotes",
    "questionCount",
    "relisted",
    "quantityAvailable",
    "sku",
    "postalCode",
    "pictureDetails",
    "videoDetails",
    "extendedProducerResponsibility",
    "customPolicies",
    "dispatchTimeMax",
    "sellerContactDetails",
    "totalQuestionCount",
    "proxyItem",
    "extendedSellerContactDetails",
    "leadCount",
    "newLeadCount",
    "itemSpecifics",
    "classifiedAdPayPerLeadFee",
    "applyBuyerProtection",
    "listingSubtype2",
    "mechanicalCheckAccepted",
    "itemPolicyViolation",
    "crossBorderTrade",
    "businessSellerDetails",
    "buyerGuaranteePrice",
    "buyerRequirementDetails",
    "returnPolicy",
    "paymentAllowedSite",
    "inventoryTrackingMethod",
    "integratedMerchantCreditCardEnabled",
    "variations",
    "itemCompatibilityList",
    "itemCompatibilityCount",
    "conditionID",
    "conditionDescriptors",
    "conditionDescription",
    "conditionDisplayName",
    "regulatory",
    "taxCategory",
    "quantityAvailableHint",
    "quantityThreshold",
    "discountPriceInfo",
    "sellerProvidedTitle",
    "vin",
    "vinLink",
    "vrm",
    "vrmLink",
    "sellerProfiles",
    "shippingServiceCostOverrideList",
    "shippingPackageDetails",
    "topRatedListing",
    "quantityRestrictionPerBuyer",
    "floorPrice",
    "ceilingPrice",
    "isIntermediatedShippingEligible",
    "unitInfo",
    "relistParentID",
    "conditionDefinition",
    "hideFromSearch",
    "reasonHideFromSearch",
    "pickupInStoreDetails",
    "ignoreQuantity",
    "availableForPickupDropOff",
    "eligibleForPickupDropOff",
    "digitalGoodInfo",
    "eBayPlus",
    "eBayPlusEligible",
    "eMailDeliveryAvailable",
    "isSecureDescription",
    "any"
})
public class ItemType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ApplicationData")
    protected String applicationData;
    @XmlElement(name = "AutoPay")
    protected Boolean autoPay;
    @XmlElement(name = "BiddingDetails")
    protected BiddingDetailsType biddingDetails;
    @XmlElement(name = "BuyerProtection")
    protected BuyerProtectionCodeType buyerProtection;
    @XmlElement(name = "BuyItNowPrice")
    protected AmountType buyItNowPrice;
    @XmlElement(name = "CategoryMappingAllowed", defaultValue = "false")
    protected Boolean categoryMappingAllowed;
    @XmlElement(name = "Charity")
    protected CharityType charity;
    @XmlElement(name = "Country")
    protected CountryCodeType country;
    @XmlElement(name = "Currency")
    protected CurrencyCodeType currency;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DescriptionReviseMode")
    protected DescriptionReviseModeCodeType descriptionReviseMode;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "ListingDetails")
    protected ListingDetailsType listingDetails;
    @XmlElement(name = "ListingDuration")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String listingDuration;
    @XmlElement(name = "ListingEnhancement")
    protected List<ListingEnhancementsCodeType> listingEnhancement;
    @XmlElement(name = "ListingType")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "LotSize")
    protected Integer lotSize;
    @XmlElement(name = "PaymentDetails")
    protected PaymentDetailsType paymentDetails;
    @XmlElement(name = "PaymentMethods")
    protected List<BuyerPaymentMethodCodeType> paymentMethods;
    @XmlElement(name = "PayPalEmailAddress")
    protected String payPalEmailAddress;
    @XmlElement(name = "PrimaryCategory")
    protected CategoryType primaryCategory;
    @XmlElement(name = "PrivateListing")
    protected Boolean privateListing;
    @XmlElement(name = "ProductListingDetails")
    protected ProductListingDetailsType productListingDetails;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "PrivateNotes")
    protected String privateNotes;
    @XmlElement(name = "RelistLink")
    protected Boolean relistLink;
    @XmlElement(name = "IsItemEMSEligible")
    protected Boolean isItemEMSEligible;
    @XmlElement(name = "ReservePrice")
    protected AmountType reservePrice;
    @XmlElement(name = "ReviseStatus")
    protected ReviseStatusType reviseStatus;
    @XmlElement(name = "ScheduleTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar scheduleTime;
    @XmlElement(name = "SecondaryCategory")
    protected CategoryType secondaryCategory;
    @XmlElement(name = "FreeAddedCategory")
    protected CategoryType freeAddedCategory;
    @XmlElement(name = "Seller")
    protected UserType seller;
    @XmlElement(name = "SellingStatus")
    protected SellingStatusType sellingStatus;
    @XmlElement(name = "ShippingDetails")
    protected ShippingDetailsType shippingDetails;
    @XmlElement(name = "ShipToLocations")
    protected List<String> shipToLocations;
    @XmlElement(name = "Site")
    protected SiteCodeType site;
    @XmlElement(name = "StartPrice")
    protected AmountType startPrice;
    @XmlElement(name = "Storefront")
    protected StorefrontType storefront;
    @XmlElement(name = "SubTitle")
    protected String subTitle;
    @XmlElement(name = "TimeLeft")
    protected Duration timeLeft;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "VATDetails")
    protected VATDetailsType vatDetails;
    @XmlElement(name = "SellerVacationNote")
    protected String sellerVacationNote;
    @XmlElement(name = "WatchCount")
    protected Long watchCount;
    @XmlElement(name = "HitCount")
    protected Long hitCount;
    @XmlElement(name = "DisableBuyerRequirements")
    protected Boolean disableBuyerRequirements;
    @XmlElement(name = "BestOfferDetails")
    protected BestOfferDetailsType bestOfferDetails;
    @XmlElement(name = "LocationDefaulted")
    protected Boolean locationDefaulted;
    @XmlElement(name = "UseTaxTable")
    protected Boolean useTaxTable;
    @XmlElement(name = "GetItFast")
    protected Boolean getItFast;
    @XmlElement(name = "BuyerResponsibleForShipping")
    protected Boolean buyerResponsibleForShipping;
    protected String eBayNotes;
    @XmlElement(name = "QuestionCount")
    protected Long questionCount;
    @XmlElement(name = "Relisted")
    protected Boolean relisted;
    @XmlElement(name = "QuantityAvailable")
    protected Integer quantityAvailable;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PictureDetails")
    protected PictureDetailsType pictureDetails;
    @XmlElement(name = "VideoDetails")
    protected VideoDetailsType videoDetails;
    @XmlElement(name = "ExtendedProducerResponsibility")
    protected ExtendedProducerResponsibilityType extendedProducerResponsibility;
    @XmlElement(name = "CustomPolicies")
    protected CustomPoliciesType customPolicies;
    @XmlElement(name = "DispatchTimeMax")
    protected Integer dispatchTimeMax;
    @XmlElement(name = "SellerContactDetails")
    protected AddressType sellerContactDetails;
    @XmlElement(name = "TotalQuestionCount")
    protected Long totalQuestionCount;
    @XmlElement(name = "ProxyItem")
    protected Boolean proxyItem;
    @XmlElement(name = "ExtendedSellerContactDetails")
    protected ExtendedContactDetailsType extendedSellerContactDetails;
    @XmlElement(name = "LeadCount")
    protected Integer leadCount;
    @XmlElement(name = "NewLeadCount")
    protected Integer newLeadCount;
    @XmlElement(name = "ItemSpecifics")
    protected NameValueListArrayType itemSpecifics;
    @XmlElement(name = "ClassifiedAdPayPerLeadFee")
    protected AmountType classifiedAdPayPerLeadFee;
    @XmlElement(name = "ApplyBuyerProtection")
    protected BuyerProtectionDetailsType applyBuyerProtection;
    @XmlElement(name = "ListingSubtype2")
    protected ListingSubtypeCodeType listingSubtype2;
    @XmlElement(name = "MechanicalCheckAccepted")
    protected Boolean mechanicalCheckAccepted;
    @XmlElement(name = "ItemPolicyViolation")
    protected ItemPolicyViolationType itemPolicyViolation;
    @XmlElement(name = "CrossBorderTrade")
    protected List<String> crossBorderTrade;
    @XmlElement(name = "BusinessSellerDetails")
    protected BusinessSellerDetailsType businessSellerDetails;
    @XmlElement(name = "BuyerGuaranteePrice")
    protected AmountType buyerGuaranteePrice;
    @XmlElement(name = "BuyerRequirementDetails")
    protected BuyerRequirementDetailsType buyerRequirementDetails;
    @XmlElement(name = "ReturnPolicy")
    protected ReturnPolicyType returnPolicy;
    @XmlElement(name = "PaymentAllowedSite")
    protected List<SiteCodeType> paymentAllowedSite;
    @XmlElement(name = "InventoryTrackingMethod")
    protected InventoryTrackingMethodCodeType inventoryTrackingMethod;
    @XmlElement(name = "IntegratedMerchantCreditCardEnabled")
    protected Boolean integratedMerchantCreditCardEnabled;
    @XmlElement(name = "Variations")
    protected VariationsType variations;
    @XmlElement(name = "ItemCompatibilityList")
    protected ItemCompatibilityListType itemCompatibilityList;
    @XmlElement(name = "ItemCompatibilityCount")
    protected Integer itemCompatibilityCount;
    @XmlElement(name = "ConditionID")
    protected Integer conditionID;
    @XmlElement(name = "ConditionDescriptors")
    protected ConditionDescriptorsType conditionDescriptors;
    @XmlElement(name = "ConditionDescription")
    protected String conditionDescription;
    @XmlElement(name = "ConditionDisplayName")
    protected String conditionDisplayName;
    @XmlElement(name = "Regulatory")
    protected RegulatoryType regulatory;
    @XmlElement(name = "TaxCategory")
    protected String taxCategory;
    @XmlElement(name = "QuantityAvailableHint")
    protected QuantityAvailableHintCodeType quantityAvailableHint;
    @XmlElement(name = "QuantityThreshold")
    protected Integer quantityThreshold;
    @XmlElement(name = "DiscountPriceInfo")
    protected DiscountPriceInfoType discountPriceInfo;
    @XmlElement(name = "SellerProvidedTitle")
    protected String sellerProvidedTitle;
    @XmlElement(name = "VIN")
    protected String vin;
    @XmlElement(name = "VINLink")
    protected String vinLink;
    @XmlElement(name = "VRM")
    protected String vrm;
    @XmlElement(name = "VRMLink")
    protected String vrmLink;
    @XmlElement(name = "SellerProfiles")
    protected SellerProfilesType sellerProfiles;
    @XmlElement(name = "ShippingServiceCostOverrideList")
    protected ShippingServiceCostOverrideListType shippingServiceCostOverrideList;
    @XmlElement(name = "ShippingPackageDetails")
    protected ShipPackageDetailsType shippingPackageDetails;
    @XmlElement(name = "TopRatedListing")
    protected Boolean topRatedListing;
    @XmlElement(name = "QuantityRestrictionPerBuyer")
    protected QuantityRestrictionPerBuyerInfoType quantityRestrictionPerBuyer;
    @XmlElement(name = "FloorPrice")
    protected AmountType floorPrice;
    @XmlElement(name = "CeilingPrice")
    protected AmountType ceilingPrice;
    @XmlElement(name = "IsIntermediatedShippingEligible")
    protected Boolean isIntermediatedShippingEligible;
    @XmlElement(name = "UnitInfo")
    protected UnitInfoType unitInfo;
    @XmlElement(name = "RelistParentID")
    protected Long relistParentID;
    @XmlElement(name = "ConditionDefinition")
    protected String conditionDefinition;
    @XmlElement(name = "HideFromSearch")
    protected Boolean hideFromSearch;
    @XmlElement(name = "ReasonHideFromSearch")
    protected ReasonHideFromSearchCodeType reasonHideFromSearch;
    @XmlElement(name = "PickupInStoreDetails")
    protected PickupInStoreDetailsType pickupInStoreDetails;
    @XmlElement(name = "IgnoreQuantity")
    protected Boolean ignoreQuantity;
    @XmlElement(name = "AvailableForPickupDropOff")
    protected Boolean availableForPickupDropOff;
    @XmlElement(name = "EligibleForPickupDropOff")
    protected Boolean eligibleForPickupDropOff;
    @XmlElement(name = "DigitalGoodInfo")
    protected DigitalGoodInfoType digitalGoodInfo;
    protected Boolean eBayPlus;
    protected Boolean eBayPlusEligible;
    protected Boolean eMailDeliveryAvailable;
    @XmlElement(name = "IsSecureDescription")
    protected Boolean isSecureDescription;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the applicationData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationData() {
        return applicationData;
    }

    /**
     * Sets the value of the applicationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationData(String value) {
        this.applicationData = value;
    }

    /**
     * Gets the value of the autoPay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPay() {
        return autoPay;
    }

    /**
     * Sets the value of the autoPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPay(Boolean value) {
        this.autoPay = value;
    }

    /**
     * Gets the value of the biddingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingDetailsType }
     *     
     */
    public BiddingDetailsType getBiddingDetails() {
        return biddingDetails;
    }

    /**
     * Sets the value of the biddingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingDetailsType }
     *     
     */
    public void setBiddingDetails(BiddingDetailsType value) {
        this.biddingDetails = value;
    }

    /**
     * Gets the value of the buyerProtection property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProtectionCodeType }
     *     
     */
    public BuyerProtectionCodeType getBuyerProtection() {
        return buyerProtection;
    }

    /**
     * Sets the value of the buyerProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProtectionCodeType }
     *     
     */
    public void setBuyerProtection(BuyerProtectionCodeType value) {
        this.buyerProtection = value;
    }

    /**
     * Gets the value of the buyItNowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBuyItNowPrice() {
        return buyItNowPrice;
    }

    /**
     * Sets the value of the buyItNowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBuyItNowPrice(AmountType value) {
        this.buyItNowPrice = value;
    }

    /**
     * Gets the value of the categoryMappingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategoryMappingAllowed() {
        return categoryMappingAllowed;
    }

    /**
     * Sets the value of the categoryMappingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoryMappingAllowed(Boolean value) {
        this.categoryMappingAllowed = value;
    }

    /**
     * Gets the value of the charity property.
     * 
     * @return
     *     possible object is
     *     {@link CharityType }
     *     
     */
    public CharityType getCharity() {
        return charity;
    }

    /**
     * Sets the value of the charity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharityType }
     *     
     */
    public void setCharity(CharityType value) {
        this.charity = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrency(CurrencyCodeType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionReviseMode property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionReviseModeCodeType }
     *     
     */
    public DescriptionReviseModeCodeType getDescriptionReviseMode() {
        return descriptionReviseMode;
    }

    /**
     * Sets the value of the descriptionReviseMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionReviseModeCodeType }
     *     
     */
    public void setDescriptionReviseMode(DescriptionReviseModeCodeType value) {
        this.descriptionReviseMode = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the listingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ListingDetailsType }
     *     
     */
    public ListingDetailsType getListingDetails() {
        return listingDetails;
    }

    /**
     * Sets the value of the listingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingDetailsType }
     *     
     */
    public void setListingDetails(ListingDetailsType value) {
        this.listingDetails = value;
    }

    /**
     * Gets the value of the listingDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingDuration() {
        return listingDuration;
    }

    /**
     * Sets the value of the listingDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingDuration(String value) {
        this.listingDuration = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ListingEnhancementsCodeType }
     *     
     */
    public ListingEnhancementsCodeType[] getListingEnhancement() {
        if (this.listingEnhancement == null) {
            return new ListingEnhancementsCodeType[ 0 ] ;
        }
        return ((ListingEnhancementsCodeType[]) this.listingEnhancement.toArray(new ListingEnhancementsCodeType[this.listingEnhancement.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ListingEnhancementsCodeType }
     *     
     */
    public ListingEnhancementsCodeType getListingEnhancement(int idx) {
        if (this.listingEnhancement == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.listingEnhancement.get(idx);
    }

    public int getListingEnhancementLength() {
        if (this.listingEnhancement == null) {
            return  0;
        }
        return this.listingEnhancement.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ListingEnhancementsCodeType }
     *     
     */
    public void setListingEnhancement(ListingEnhancementsCodeType[] values) {
        this._getListingEnhancement().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.listingEnhancement.add(values[i]);
        }
    }

    protected List<ListingEnhancementsCodeType> _getListingEnhancement() {
        if (listingEnhancement == null) {
            listingEnhancement = new ArrayList<ListingEnhancementsCodeType>();
        }
        return listingEnhancement;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ListingEnhancementsCodeType }
     *     
     */
    public ListingEnhancementsCodeType setListingEnhancement(int idx, ListingEnhancementsCodeType value) {
        return this.listingEnhancement.set(idx, value);
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public ListingTypeCodeType getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public void setListingType(ListingTypeCodeType value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the lotSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLotSize() {
        return lotSize;
    }

    /**
     * Sets the value of the lotSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLotSize(Integer value) {
        this.lotSize = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsType }
     *     
     */
    public PaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsType }
     *     
     */
    public void setPaymentDetails(PaymentDetailsType value) {
        this.paymentDetails = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType[] getPaymentMethods() {
        if (this.paymentMethods == null) {
            return new BuyerPaymentMethodCodeType[ 0 ] ;
        }
        return ((BuyerPaymentMethodCodeType[]) this.paymentMethods.toArray(new BuyerPaymentMethodCodeType[this.paymentMethods.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType getPaymentMethods(int idx) {
        if (this.paymentMethods == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.paymentMethods.get(idx);
    }

    public int getPaymentMethodsLength() {
        if (this.paymentMethods == null) {
            return  0;
        }
        return this.paymentMethods.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public void setPaymentMethods(BuyerPaymentMethodCodeType[] values) {
        this._getPaymentMethods().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.paymentMethods.add(values[i]);
        }
    }

    protected List<BuyerPaymentMethodCodeType> _getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<BuyerPaymentMethodCodeType>();
        }
        return paymentMethods;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType setPaymentMethods(int idx, BuyerPaymentMethodCodeType value) {
        return this.paymentMethods.set(idx, value);
    }

    /**
     * Gets the value of the payPalEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalEmailAddress() {
        return payPalEmailAddress;
    }

    /**
     * Sets the value of the payPalEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalEmailAddress(String value) {
        this.payPalEmailAddress = value;
    }

    /**
     * Gets the value of the primaryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryType }
     *     
     */
    public CategoryType getPrimaryCategory() {
        return primaryCategory;
    }

    /**
     * Sets the value of the primaryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *     
     */
    public void setPrimaryCategory(CategoryType value) {
        this.primaryCategory = value;
    }

    /**
     * Gets the value of the privateListing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateListing() {
        return privateListing;
    }

    /**
     * Sets the value of the privateListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivateListing(Boolean value) {
        this.privateListing = value;
    }

    /**
     * Gets the value of the productListingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductListingDetailsType }
     *     
     */
    public ProductListingDetailsType getProductListingDetails() {
        return productListingDetails;
    }

    /**
     * Sets the value of the productListingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductListingDetailsType }
     *     
     */
    public void setProductListingDetails(ProductListingDetailsType value) {
        this.productListingDetails = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the privateNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateNotes() {
        return privateNotes;
    }

    /**
     * Sets the value of the privateNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateNotes(String value) {
        this.privateNotes = value;
    }

    /**
     * Gets the value of the relistLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelistLink() {
        return relistLink;
    }

    /**
     * Sets the value of the relistLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelistLink(Boolean value) {
        this.relistLink = value;
    }

    /**
     * Gets the value of the isItemEMSEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsItemEMSEligible() {
        return isItemEMSEligible;
    }

    /**
     * Sets the value of the isItemEMSEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsItemEMSEligible(Boolean value) {
        this.isItemEMSEligible = value;
    }

    /**
     * Gets the value of the reservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReservePrice() {
        return reservePrice;
    }

    /**
     * Sets the value of the reservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReservePrice(AmountType value) {
        this.reservePrice = value;
    }

    /**
     * Gets the value of the reviseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReviseStatusType }
     *     
     */
    public ReviseStatusType getReviseStatus() {
        return reviseStatus;
    }

    /**
     * Sets the value of the reviseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviseStatusType }
     *     
     */
    public void setReviseStatus(ReviseStatusType value) {
        this.reviseStatus = value;
    }

    /**
     * Gets the value of the scheduleTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getScheduleTime() {
        return scheduleTime;
    }

    /**
     * Sets the value of the scheduleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleTime(Calendar value) {
        this.scheduleTime = value;
    }

    /**
     * Gets the value of the secondaryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryType }
     *     
     */
    public CategoryType getSecondaryCategory() {
        return secondaryCategory;
    }

    /**
     * Sets the value of the secondaryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *     
     */
    public void setSecondaryCategory(CategoryType value) {
        this.secondaryCategory = value;
    }

    /**
     * Gets the value of the freeAddedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryType }
     *     
     */
    public CategoryType getFreeAddedCategory() {
        return freeAddedCategory;
    }

    /**
     * Sets the value of the freeAddedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *     
     */
    public void setFreeAddedCategory(CategoryType value) {
        this.freeAddedCategory = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setSeller(UserType value) {
        this.seller = value;
    }

    /**
     * Gets the value of the sellingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellingStatusType }
     *     
     */
    public SellingStatusType getSellingStatus() {
        return sellingStatus;
    }

    /**
     * Sets the value of the sellingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingStatusType }
     *     
     */
    public void setSellingStatus(SellingStatusType value) {
        this.sellingStatus = value;
    }

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsType }
     *     
     */
    public ShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsType }
     *     
     */
    public void setShippingDetails(ShippingDetailsType value) {
        this.shippingDetails = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getShipToLocations() {
        if (this.shipToLocations == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.shipToLocations.toArray(new String[this.shipToLocations.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getShipToLocations(int idx) {
        if (this.shipToLocations == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shipToLocations.get(idx);
    }

    public int getShipToLocationsLength() {
        if (this.shipToLocations == null) {
            return  0;
        }
        return this.shipToLocations.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setShipToLocations(String[] values) {
        this._getShipToLocations().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shipToLocations.add(values[i]);
        }
    }

    protected List<String> _getShipToLocations() {
        if (shipToLocations == null) {
            shipToLocations = new ArrayList<String>();
        }
        return shipToLocations;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setShipToLocations(int idx, String value) {
        return this.shipToLocations.set(idx, value);
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setSite(SiteCodeType value) {
        this.site = value;
    }

    /**
     * Gets the value of the startPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStartPrice() {
        return startPrice;
    }

    /**
     * Sets the value of the startPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStartPrice(AmountType value) {
        this.startPrice = value;
    }

    /**
     * Gets the value of the storefront property.
     * 
     * @return
     *     possible object is
     *     {@link StorefrontType }
     *     
     */
    public StorefrontType getStorefront() {
        return storefront;
    }

    /**
     * Sets the value of the storefront property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorefrontType }
     *     
     */
    public void setStorefront(StorefrontType value) {
        this.storefront = value;
    }

    /**
     * Gets the value of the subTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Sets the value of the subTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitle(String value) {
        this.subTitle = value;
    }

    /**
     * Gets the value of the timeLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeLeft() {
        return timeLeft;
    }

    /**
     * Sets the value of the timeLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeLeft(Duration value) {
        this.timeLeft = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the vatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VATDetailsType }
     *     
     */
    public VATDetailsType getVATDetails() {
        return vatDetails;
    }

    /**
     * Sets the value of the vatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VATDetailsType }
     *     
     */
    public void setVATDetails(VATDetailsType value) {
        this.vatDetails = value;
    }

    /**
     * Gets the value of the sellerVacationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerVacationNote() {
        return sellerVacationNote;
    }

    /**
     * Sets the value of the sellerVacationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerVacationNote(String value) {
        this.sellerVacationNote = value;
    }

    /**
     * Gets the value of the watchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWatchCount() {
        return watchCount;
    }

    /**
     * Sets the value of the watchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWatchCount(Long value) {
        this.watchCount = value;
    }

    /**
     * Gets the value of the hitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHitCount() {
        return hitCount;
    }

    /**
     * Sets the value of the hitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHitCount(Long value) {
        this.hitCount = value;
    }

    /**
     * Gets the value of the disableBuyerRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableBuyerRequirements() {
        return disableBuyerRequirements;
    }

    /**
     * Sets the value of the disableBuyerRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableBuyerRequirements(Boolean value) {
        this.disableBuyerRequirements = value;
    }

    /**
     * Gets the value of the bestOfferDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferDetailsType }
     *     
     */
    public BestOfferDetailsType getBestOfferDetails() {
        return bestOfferDetails;
    }

    /**
     * Sets the value of the bestOfferDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferDetailsType }
     *     
     */
    public void setBestOfferDetails(BestOfferDetailsType value) {
        this.bestOfferDetails = value;
    }

    /**
     * Gets the value of the locationDefaulted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocationDefaulted() {
        return locationDefaulted;
    }

    /**
     * Sets the value of the locationDefaulted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocationDefaulted(Boolean value) {
        this.locationDefaulted = value;
    }

    /**
     * Gets the value of the useTaxTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTaxTable() {
        return useTaxTable;
    }

    /**
     * Sets the value of the useTaxTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTaxTable(Boolean value) {
        this.useTaxTable = value;
    }

    /**
     * Gets the value of the getItFast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetItFast() {
        return getItFast;
    }

    /**
     * Sets the value of the getItFast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetItFast(Boolean value) {
        this.getItFast = value;
    }

    /**
     * Gets the value of the buyerResponsibleForShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyerResponsibleForShipping() {
        return buyerResponsibleForShipping;
    }

    /**
     * Sets the value of the buyerResponsibleForShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyerResponsibleForShipping(Boolean value) {
        this.buyerResponsibleForShipping = value;
    }

    /**
     * Gets the value of the eBayNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBayNotes() {
        return eBayNotes;
    }

    /**
     * Sets the value of the eBayNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBayNotes(String value) {
        this.eBayNotes = value;
    }

    /**
     * Gets the value of the questionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuestionCount() {
        return questionCount;
    }

    /**
     * Sets the value of the questionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuestionCount(Long value) {
        this.questionCount = value;
    }

    /**
     * Gets the value of the relisted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelisted() {
        return relisted;
    }

    /**
     * Sets the value of the relisted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelisted(Boolean value) {
        this.relisted = value;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the value of the quantityAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityAvailable(Integer value) {
        this.quantityAvailable = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the pictureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PictureDetailsType }
     *     
     */
    public PictureDetailsType getPictureDetails() {
        return pictureDetails;
    }

    /**
     * Sets the value of the pictureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureDetailsType }
     *     
     */
    public void setPictureDetails(PictureDetailsType value) {
        this.pictureDetails = value;
    }

    /**
     * Gets the value of the videoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VideoDetailsType }
     *     
     */
    public VideoDetailsType getVideoDetails() {
        return videoDetails;
    }

    /**
     * Sets the value of the videoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoDetailsType }
     *     
     */
    public void setVideoDetails(VideoDetailsType value) {
        this.videoDetails = value;
    }

    /**
     * Gets the value of the extendedProducerResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedProducerResponsibilityType }
     *     
     */
    public ExtendedProducerResponsibilityType getExtendedProducerResponsibility() {
        return extendedProducerResponsibility;
    }

    /**
     * Sets the value of the extendedProducerResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedProducerResponsibilityType }
     *     
     */
    public void setExtendedProducerResponsibility(ExtendedProducerResponsibilityType value) {
        this.extendedProducerResponsibility = value;
    }

    /**
     * Gets the value of the customPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link CustomPoliciesType }
     *     
     */
    public CustomPoliciesType getCustomPolicies() {
        return customPolicies;
    }

    /**
     * Sets the value of the customPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomPoliciesType }
     *     
     */
    public void setCustomPolicies(CustomPoliciesType value) {
        this.customPolicies = value;
    }

    /**
     * Gets the value of the dispatchTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDispatchTimeMax() {
        return dispatchTimeMax;
    }

    /**
     * Sets the value of the dispatchTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDispatchTimeMax(Integer value) {
        this.dispatchTimeMax = value;
    }

    /**
     * Gets the value of the sellerContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getSellerContactDetails() {
        return sellerContactDetails;
    }

    /**
     * Sets the value of the sellerContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setSellerContactDetails(AddressType value) {
        this.sellerContactDetails = value;
    }

    /**
     * Gets the value of the totalQuestionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalQuestionCount() {
        return totalQuestionCount;
    }

    /**
     * Sets the value of the totalQuestionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalQuestionCount(Long value) {
        this.totalQuestionCount = value;
    }

    /**
     * Gets the value of the proxyItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProxyItem() {
        return proxyItem;
    }

    /**
     * Sets the value of the proxyItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProxyItem(Boolean value) {
        this.proxyItem = value;
    }

    /**
     * Gets the value of the extendedSellerContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedContactDetailsType }
     *     
     */
    public ExtendedContactDetailsType getExtendedSellerContactDetails() {
        return extendedSellerContactDetails;
    }

    /**
     * Sets the value of the extendedSellerContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedContactDetailsType }
     *     
     */
    public void setExtendedSellerContactDetails(ExtendedContactDetailsType value) {
        this.extendedSellerContactDetails = value;
    }

    /**
     * Gets the value of the leadCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeadCount() {
        return leadCount;
    }

    /**
     * Sets the value of the leadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeadCount(Integer value) {
        this.leadCount = value;
    }

    /**
     * Gets the value of the newLeadCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewLeadCount() {
        return newLeadCount;
    }

    /**
     * Sets the value of the newLeadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewLeadCount(Integer value) {
        this.newLeadCount = value;
    }

    /**
     * Gets the value of the itemSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getItemSpecifics() {
        return itemSpecifics;
    }

    /**
     * Sets the value of the itemSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setItemSpecifics(NameValueListArrayType value) {
        this.itemSpecifics = value;
    }

    /**
     * Gets the value of the classifiedAdPayPerLeadFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getClassifiedAdPayPerLeadFee() {
        return classifiedAdPayPerLeadFee;
    }

    /**
     * Sets the value of the classifiedAdPayPerLeadFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setClassifiedAdPayPerLeadFee(AmountType value) {
        this.classifiedAdPayPerLeadFee = value;
    }

    /**
     * Gets the value of the applyBuyerProtection property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProtectionDetailsType }
     *     
     */
    public BuyerProtectionDetailsType getApplyBuyerProtection() {
        return applyBuyerProtection;
    }

    /**
     * Sets the value of the applyBuyerProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProtectionDetailsType }
     *     
     */
    public void setApplyBuyerProtection(BuyerProtectionDetailsType value) {
        this.applyBuyerProtection = value;
    }

    /**
     * Gets the value of the listingSubtype2 property.
     * 
     * @return
     *     possible object is
     *     {@link ListingSubtypeCodeType }
     *     
     */
    public ListingSubtypeCodeType getListingSubtype2() {
        return listingSubtype2;
    }

    /**
     * Sets the value of the listingSubtype2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingSubtypeCodeType }
     *     
     */
    public void setListingSubtype2(ListingSubtypeCodeType value) {
        this.listingSubtype2 = value;
    }

    /**
     * Gets the value of the mechanicalCheckAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMechanicalCheckAccepted() {
        return mechanicalCheckAccepted;
    }

    /**
     * Sets the value of the mechanicalCheckAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMechanicalCheckAccepted(Boolean value) {
        this.mechanicalCheckAccepted = value;
    }

    /**
     * Gets the value of the itemPolicyViolation property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPolicyViolationType }
     *     
     */
    public ItemPolicyViolationType getItemPolicyViolation() {
        return itemPolicyViolation;
    }

    /**
     * Sets the value of the itemPolicyViolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPolicyViolationType }
     *     
     */
    public void setItemPolicyViolation(ItemPolicyViolationType value) {
        this.itemPolicyViolation = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getCrossBorderTrade() {
        if (this.crossBorderTrade == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.crossBorderTrade.toArray(new String[this.crossBorderTrade.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getCrossBorderTrade(int idx) {
        if (this.crossBorderTrade == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.crossBorderTrade.get(idx);
    }

    public int getCrossBorderTradeLength() {
        if (this.crossBorderTrade == null) {
            return  0;
        }
        return this.crossBorderTrade.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setCrossBorderTrade(String[] values) {
        this._getCrossBorderTrade().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.crossBorderTrade.add(values[i]);
        }
    }

    protected List<String> _getCrossBorderTrade() {
        if (crossBorderTrade == null) {
            crossBorderTrade = new ArrayList<String>();
        }
        return crossBorderTrade;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setCrossBorderTrade(int idx, String value) {
        return this.crossBorderTrade.set(idx, value);
    }

    /**
     * Gets the value of the businessSellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSellerDetailsType }
     *     
     */
    public BusinessSellerDetailsType getBusinessSellerDetails() {
        return businessSellerDetails;
    }

    /**
     * Sets the value of the businessSellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSellerDetailsType }
     *     
     */
    public void setBusinessSellerDetails(BusinessSellerDetailsType value) {
        this.businessSellerDetails = value;
    }

    /**
     * Gets the value of the buyerGuaranteePrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBuyerGuaranteePrice() {
        return buyerGuaranteePrice;
    }

    /**
     * Sets the value of the buyerGuaranteePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBuyerGuaranteePrice(AmountType value) {
        this.buyerGuaranteePrice = value;
    }

    /**
     * Gets the value of the buyerRequirementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerRequirementDetailsType }
     *     
     */
    public BuyerRequirementDetailsType getBuyerRequirementDetails() {
        return buyerRequirementDetails;
    }

    /**
     * Sets the value of the buyerRequirementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerRequirementDetailsType }
     *     
     */
    public void setBuyerRequirementDetails(BuyerRequirementDetailsType value) {
        this.buyerRequirementDetails = value;
    }

    /**
     * Gets the value of the returnPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnPolicyType }
     *     
     */
    public ReturnPolicyType getReturnPolicy() {
        return returnPolicy;
    }

    /**
     * Sets the value of the returnPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnPolicyType }
     *     
     */
    public void setReturnPolicy(ReturnPolicyType value) {
        this.returnPolicy = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType[] getPaymentAllowedSite() {
        if (this.paymentAllowedSite == null) {
            return new SiteCodeType[ 0 ] ;
        }
        return ((SiteCodeType[]) this.paymentAllowedSite.toArray(new SiteCodeType[this.paymentAllowedSite.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getPaymentAllowedSite(int idx) {
        if (this.paymentAllowedSite == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.paymentAllowedSite.get(idx);
    }

    public int getPaymentAllowedSiteLength() {
        if (this.paymentAllowedSite == null) {
            return  0;
        }
        return this.paymentAllowedSite.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SiteCodeType }
     *     
     */
    public void setPaymentAllowedSite(SiteCodeType[] values) {
        this._getPaymentAllowedSite().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.paymentAllowedSite.add(values[i]);
        }
    }

    protected List<SiteCodeType> _getPaymentAllowedSite() {
        if (paymentAllowedSite == null) {
            paymentAllowedSite = new ArrayList<SiteCodeType>();
        }
        return paymentAllowedSite;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType setPaymentAllowedSite(int idx, SiteCodeType value) {
        return this.paymentAllowedSite.set(idx, value);
    }

    /**
     * Gets the value of the inventoryTrackingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTrackingMethodCodeType }
     *     
     */
    public InventoryTrackingMethodCodeType getInventoryTrackingMethod() {
        return inventoryTrackingMethod;
    }

    /**
     * Sets the value of the inventoryTrackingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTrackingMethodCodeType }
     *     
     */
    public void setInventoryTrackingMethod(InventoryTrackingMethodCodeType value) {
        this.inventoryTrackingMethod = value;
    }

    /**
     * Gets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedMerchantCreditCardEnabled() {
        return integratedMerchantCreditCardEnabled;
    }

    /**
     * Sets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedMerchantCreditCardEnabled(Boolean value) {
        this.integratedMerchantCreditCardEnabled = value;
    }

    /**
     * Gets the value of the variations property.
     * 
     * @return
     *     possible object is
     *     {@link VariationsType }
     *     
     */
    public VariationsType getVariations() {
        return variations;
    }

    /**
     * Sets the value of the variations property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationsType }
     *     
     */
    public void setVariations(VariationsType value) {
        this.variations = value;
    }

    /**
     * Gets the value of the itemCompatibilityList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemCompatibilityListType }
     *     
     */
    public ItemCompatibilityListType getItemCompatibilityList() {
        return itemCompatibilityList;
    }

    /**
     * Sets the value of the itemCompatibilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCompatibilityListType }
     *     
     */
    public void setItemCompatibilityList(ItemCompatibilityListType value) {
        this.itemCompatibilityList = value;
    }

    /**
     * Gets the value of the itemCompatibilityCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCompatibilityCount() {
        return itemCompatibilityCount;
    }

    /**
     * Sets the value of the itemCompatibilityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCompatibilityCount(Integer value) {
        this.itemCompatibilityCount = value;
    }

    /**
     * Gets the value of the conditionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConditionID() {
        return conditionID;
    }

    /**
     * Sets the value of the conditionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConditionID(Integer value) {
        this.conditionID = value;
    }

    /**
     * Gets the value of the conditionDescriptors property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionDescriptorsType }
     *     
     */
    public ConditionDescriptorsType getConditionDescriptors() {
        return conditionDescriptors;
    }

    /**
     * Sets the value of the conditionDescriptors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionDescriptorsType }
     *     
     */
    public void setConditionDescriptors(ConditionDescriptorsType value) {
        this.conditionDescriptors = value;
    }

    /**
     * Gets the value of the conditionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionDescription() {
        return conditionDescription;
    }

    /**
     * Sets the value of the conditionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionDescription(String value) {
        this.conditionDescription = value;
    }

    /**
     * Gets the value of the conditionDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionDisplayName() {
        return conditionDisplayName;
    }

    /**
     * Sets the value of the conditionDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionDisplayName(String value) {
        this.conditionDisplayName = value;
    }

    /**
     * Gets the value of the regulatory property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryType }
     *     
     */
    public RegulatoryType getRegulatory() {
        return regulatory;
    }

    /**
     * Sets the value of the regulatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryType }
     *     
     */
    public void setRegulatory(RegulatoryType value) {
        this.regulatory = value;
    }

    /**
     * Gets the value of the taxCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCategory() {
        return taxCategory;
    }

    /**
     * Sets the value of the taxCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCategory(String value) {
        this.taxCategory = value;
    }

    /**
     * Gets the value of the quantityAvailableHint property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAvailableHintCodeType }
     *     
     */
    public QuantityAvailableHintCodeType getQuantityAvailableHint() {
        return quantityAvailableHint;
    }

    /**
     * Sets the value of the quantityAvailableHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAvailableHintCodeType }
     *     
     */
    public void setQuantityAvailableHint(QuantityAvailableHintCodeType value) {
        this.quantityAvailableHint = value;
    }

    /**
     * Gets the value of the quantityThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityThreshold() {
        return quantityThreshold;
    }

    /**
     * Sets the value of the quantityThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityThreshold(Integer value) {
        this.quantityThreshold = value;
    }

    /**
     * Gets the value of the discountPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPriceInfoType }
     *     
     */
    public DiscountPriceInfoType getDiscountPriceInfo() {
        return discountPriceInfo;
    }

    /**
     * Sets the value of the discountPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPriceInfoType }
     *     
     */
    public void setDiscountPriceInfo(DiscountPriceInfoType value) {
        this.discountPriceInfo = value;
    }

    /**
     * Gets the value of the sellerProvidedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerProvidedTitle() {
        return sellerProvidedTitle;
    }

    /**
     * Sets the value of the sellerProvidedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerProvidedTitle(String value) {
        this.sellerProvidedTitle = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the vinLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVINLink() {
        return vinLink;
    }

    /**
     * Sets the value of the vinLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVINLink(String value) {
        this.vinLink = value;
    }

    /**
     * Gets the value of the vrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRM() {
        return vrm;
    }

    /**
     * Sets the value of the vrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRM(String value) {
        this.vrm = value;
    }

    /**
     * Gets the value of the vrmLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRMLink() {
        return vrmLink;
    }

    /**
     * Sets the value of the vrmLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRMLink(String value) {
        this.vrmLink = value;
    }

    /**
     * Gets the value of the sellerProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link SellerProfilesType }
     *     
     */
    public SellerProfilesType getSellerProfiles() {
        return sellerProfiles;
    }

    /**
     * Sets the value of the sellerProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerProfilesType }
     *     
     */
    public void setSellerProfiles(SellerProfilesType value) {
        this.sellerProfiles = value;
    }

    /**
     * Gets the value of the shippingServiceCostOverrideList property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceCostOverrideListType }
     *     
     */
    public ShippingServiceCostOverrideListType getShippingServiceCostOverrideList() {
        return shippingServiceCostOverrideList;
    }

    /**
     * Sets the value of the shippingServiceCostOverrideList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceCostOverrideListType }
     *     
     */
    public void setShippingServiceCostOverrideList(ShippingServiceCostOverrideListType value) {
        this.shippingServiceCostOverrideList = value;
    }

    /**
     * Gets the value of the shippingPackageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShipPackageDetailsType }
     *     
     */
    public ShipPackageDetailsType getShippingPackageDetails() {
        return shippingPackageDetails;
    }

    /**
     * Sets the value of the shippingPackageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipPackageDetailsType }
     *     
     */
    public void setShippingPackageDetails(ShipPackageDetailsType value) {
        this.shippingPackageDetails = value;
    }

    /**
     * Gets the value of the topRatedListing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopRatedListing() {
        return topRatedListing;
    }

    /**
     * Sets the value of the topRatedListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopRatedListing(Boolean value) {
        this.topRatedListing = value;
    }

    /**
     * Gets the value of the quantityRestrictionPerBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityRestrictionPerBuyerInfoType }
     *     
     */
    public QuantityRestrictionPerBuyerInfoType getQuantityRestrictionPerBuyer() {
        return quantityRestrictionPerBuyer;
    }

    /**
     * Sets the value of the quantityRestrictionPerBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityRestrictionPerBuyerInfoType }
     *     
     */
    public void setQuantityRestrictionPerBuyer(QuantityRestrictionPerBuyerInfoType value) {
        this.quantityRestrictionPerBuyer = value;
    }

    /**
     * Gets the value of the floorPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFloorPrice() {
        return floorPrice;
    }

    /**
     * Sets the value of the floorPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFloorPrice(AmountType value) {
        this.floorPrice = value;
    }

    /**
     * Gets the value of the ceilingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCeilingPrice() {
        return ceilingPrice;
    }

    /**
     * Sets the value of the ceilingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCeilingPrice(AmountType value) {
        this.ceilingPrice = value;
    }

    /**
     * Gets the value of the isIntermediatedShippingEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIntermediatedShippingEligible() {
        return isIntermediatedShippingEligible;
    }

    /**
     * Sets the value of the isIntermediatedShippingEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntermediatedShippingEligible(Boolean value) {
        this.isIntermediatedShippingEligible = value;
    }

    /**
     * Gets the value of the unitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UnitInfoType }
     *     
     */
    public UnitInfoType getUnitInfo() {
        return unitInfo;
    }

    /**
     * Sets the value of the unitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitInfoType }
     *     
     */
    public void setUnitInfo(UnitInfoType value) {
        this.unitInfo = value;
    }

    /**
     * Gets the value of the relistParentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRelistParentID() {
        return relistParentID;
    }

    /**
     * Sets the value of the relistParentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRelistParentID(Long value) {
        this.relistParentID = value;
    }

    /**
     * Gets the value of the conditionDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionDefinition() {
        return conditionDefinition;
    }

    /**
     * Sets the value of the conditionDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionDefinition(String value) {
        this.conditionDefinition = value;
    }

    /**
     * Gets the value of the hideFromSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideFromSearch() {
        return hideFromSearch;
    }

    /**
     * Sets the value of the hideFromSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideFromSearch(Boolean value) {
        this.hideFromSearch = value;
    }

    /**
     * Gets the value of the reasonHideFromSearch property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonHideFromSearchCodeType }
     *     
     */
    public ReasonHideFromSearchCodeType getReasonHideFromSearch() {
        return reasonHideFromSearch;
    }

    /**
     * Sets the value of the reasonHideFromSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonHideFromSearchCodeType }
     *     
     */
    public void setReasonHideFromSearch(ReasonHideFromSearchCodeType value) {
        this.reasonHideFromSearch = value;
    }

    /**
     * Gets the value of the pickupInStoreDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PickupInStoreDetailsType }
     *     
     */
    public PickupInStoreDetailsType getPickupInStoreDetails() {
        return pickupInStoreDetails;
    }

    /**
     * Sets the value of the pickupInStoreDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupInStoreDetailsType }
     *     
     */
    public void setPickupInStoreDetails(PickupInStoreDetailsType value) {
        this.pickupInStoreDetails = value;
    }

    /**
     * Gets the value of the ignoreQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreQuantity() {
        return ignoreQuantity;
    }

    /**
     * Sets the value of the ignoreQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreQuantity(Boolean value) {
        this.ignoreQuantity = value;
    }

    /**
     * Gets the value of the availableForPickupDropOff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableForPickupDropOff() {
        return availableForPickupDropOff;
    }

    /**
     * Sets the value of the availableForPickupDropOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableForPickupDropOff(Boolean value) {
        this.availableForPickupDropOff = value;
    }

    /**
     * Gets the value of the eligibleForPickupDropOff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForPickupDropOff() {
        return eligibleForPickupDropOff;
    }

    /**
     * Sets the value of the eligibleForPickupDropOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForPickupDropOff(Boolean value) {
        this.eligibleForPickupDropOff = value;
    }

    /**
     * Gets the value of the digitalGoodInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalGoodInfoType }
     *     
     */
    public DigitalGoodInfoType getDigitalGoodInfo() {
        return digitalGoodInfo;
    }

    /**
     * Sets the value of the digitalGoodInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalGoodInfoType }
     *     
     */
    public void setDigitalGoodInfo(DigitalGoodInfoType value) {
        this.digitalGoodInfo = value;
    }

    /**
     * Gets the value of the eBayPlus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayPlus() {
        return eBayPlus;
    }

    /**
     * Sets the value of the eBayPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayPlus(Boolean value) {
        this.eBayPlus = value;
    }

    /**
     * Gets the value of the eBayPlusEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayPlusEligible() {
        return eBayPlusEligible;
    }

    /**
     * Sets the value of the eBayPlusEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayPlusEligible(Boolean value) {
        this.eBayPlusEligible = value;
    }

    /**
     * Gets the value of the eMailDeliveryAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEMailDeliveryAvailable() {
        return eMailDeliveryAvailable;
    }

    /**
     * Sets the value of the eMailDeliveryAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEMailDeliveryAvailable(Boolean value) {
        this.eMailDeliveryAvailable = value;
    }

    /**
     * Gets the value of the isSecureDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSecureDescription() {
        return isSecureDescription;
    }

    /**
     * Sets the value of the isSecureDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSecureDescription(Boolean value) {
        this.isSecureDescription = value;
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
