
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.math.BigDecimal;
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
import org.w3c.dom.Element;


/**
 * 
 * 				Contains information about a sales transaction from an eBay listing. This identifier is automatically created by the eBay system once a buyer has committed to make a purchase in an
 * 				auction or fixed-price listing. A fixed-priced listing (single or multiple-variation) with multiple quantity can spawn one or more sales transactions.
 * 			
 * 
 * <p>Java class for TransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountPaid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustmentAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertedAdjustmentAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Buyer" type="{urn:ebay:apis:eBLBaseComponents}UserType" minOccurs="0"/>
 *         &lt;element name="ShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="ConvertedAmountPaid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertedTransactionPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepositType" type="{urn:ebay:apis:eBLBaseComponents}DepositTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="QuantityPurchased" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}TransactionStatusType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="BestOfferSale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VATPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ShippingServiceSelected" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceOptionsType" minOccurs="0"/>
 *         &lt;element name="BuyerMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerPaidStatus" type="{urn:ebay:apis:eBLBaseComponents}PaidStatusCodeType" minOccurs="0"/>
 *         &lt;element name="SellerPaidStatus" type="{urn:ebay:apis:eBLBaseComponents}PaidStatusCodeType" minOccurs="0"/>
 *         &lt;element name="PaidTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShippedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="FeedbackLeft" type="{urn:ebay:apis:eBLBaseComponents}FeedbackInfoType" minOccurs="0"/>
 *         &lt;element name="FeedbackReceived" type="{urn:ebay:apis:eBLBaseComponents}FeedbackInfoType" minOccurs="0"/>
 *         &lt;element name="ContainingOrder" type="{urn:ebay:apis:eBLBaseComponents}OrderType" minOccurs="0"/>
 *         &lt;element name="FinalValueFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TransactionSiteID" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="Platform" type="{urn:ebay:apis:eBLBaseComponents}TransactionPlatformCodeType" minOccurs="0"/>
 *         &lt;element name="Variation" type="{urn:ebay:apis:eBLBaseComponents}VariationType" minOccurs="0"/>
 *         &lt;element name="BuyerCheckoutMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalTransactionPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{urn:ebay:apis:eBLBaseComponents}TaxesType" minOccurs="0"/>
 *         &lt;element name="BundlePurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ActualShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ActualHandlingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eBayPaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerDiscounts" type="{urn:ebay:apis:eBLBaseComponents}SellerDiscountsType" minOccurs="0"/>
 *         &lt;element name="CodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsMultiLegShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MultiLegShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}MultiLegShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="InvoiceSentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IntangibleItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MonetaryDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentsInformationType" minOccurs="0"/>
 *         &lt;element name="PickupDetails" type="{urn:ebay:apis:eBLBaseComponents}PickupDetailsType" minOccurs="0"/>
 *         &lt;element name="PickupMethodSelected" type="{urn:ebay:apis:eBLBaseComponents}PickupMethodSelectedType" minOccurs="0"/>
 *         &lt;element name="LogisticsPlanType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="BuyerPackageEnclosures" type="{urn:ebay:apis:eBLBaseComponents}BuyerPackageEnclosuresType" minOccurs="0"/>
 *         &lt;element name="InventoryReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtendedOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eBayPlusTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GiftSummary" type="{urn:ebay:apis:eBLBaseComponents}GiftSummaryType" minOccurs="0"/>
 *         &lt;element name="DigitalDeliverySelected" type="{urn:ebay:apis:eBLBaseComponents}DigitalDeliverySelectedType" minOccurs="0"/>
 *         &lt;element name="Gift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GuaranteedShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GuaranteedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayCollectAndRemitTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayCollectAndRemitTaxes" type="{urn:ebay:apis:eBLBaseComponents}TaxesType" minOccurs="0"/>
 *         &lt;element name="Program" type="{urn:ebay:apis:eBLBaseComponents}TransactionProgramType" minOccurs="0"/>
 *         &lt;any/>
 *         &lt;element name="LinkedLineItemArray" type="{urn:ebay:apis:eBLBaseComponents}LinkedLineItemArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionType", propOrder = {
    "amountPaid",
    "adjustmentAmount",
    "convertedAdjustmentAmount",
    "buyer",
    "shippingDetails",
    "convertedAmountPaid",
    "convertedTransactionPrice",
    "createdDate",
    "depositType",
    "item",
    "quantityPurchased",
    "status",
    "transactionID",
    "transactionPrice",
    "bestOfferSale",
    "vatPercent",
    "shippingServiceSelected",
    "buyerMessage",
    "buyerPaidStatus",
    "sellerPaidStatus",
    "paidTime",
    "shippedTime",
    "totalPrice",
    "feedbackLeft",
    "feedbackReceived",
    "containingOrder",
    "finalValueFee",
    "transactionSiteID",
    "platform",
    "variation",
    "buyerCheckoutMessage",
    "totalTransactionPrice",
    "taxes",
    "bundlePurchase",
    "actualShippingCost",
    "actualHandlingCost",
    "orderLineItemID",
    "eBayPaymentID",
    "sellerDiscounts",
    "codiceFiscale",
    "isMultiLegShipping",
    "multiLegShippingDetails",
    "invoiceSentTime",
    "intangibleItem",
    "monetaryDetails",
    "pickupDetails",
    "pickupMethodSelected",
    "logisticsPlanType",
    "buyerPackageEnclosures",
    "inventoryReservationID",
    "extendedOrderID",
    "eBayPlusTransaction",
    "giftSummary",
    "digitalDeliverySelected",
    "gift",
    "guaranteedShipping",
    "guaranteedDelivery",
    "eBayCollectAndRemitTax",
    "eBayCollectAndRemitTaxes",
    "program",
    "any",
    "linkedLineItemArray"
})
public class TransactionType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AmountPaid")
    protected AmountType amountPaid;
    @XmlElement(name = "AdjustmentAmount")
    protected AmountType adjustmentAmount;
    @XmlElement(name = "ConvertedAdjustmentAmount")
    protected AmountType convertedAdjustmentAmount;
    @XmlElement(name = "Buyer")
    protected UserType buyer;
    @XmlElement(name = "ShippingDetails")
    protected ShippingDetailsType shippingDetails;
    @XmlElement(name = "ConvertedAmountPaid")
    protected AmountType convertedAmountPaid;
    @XmlElement(name = "ConvertedTransactionPrice")
    protected AmountType convertedTransactionPrice;
    @XmlElement(name = "CreatedDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createdDate;
    @XmlElement(name = "DepositType")
    protected DepositTypeCodeType depositType;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "QuantityPurchased")
    protected Integer quantityPurchased;
    @XmlElement(name = "Status")
    protected TransactionStatusType status;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "TransactionPrice")
    protected AmountType transactionPrice;
    @XmlElement(name = "BestOfferSale")
    protected Boolean bestOfferSale;
    @XmlElement(name = "VATPercent")
    protected BigDecimal vatPercent;
    @XmlElement(name = "ShippingServiceSelected")
    protected ShippingServiceOptionsType shippingServiceSelected;
    @XmlElement(name = "BuyerMessage")
    protected String buyerMessage;
    @XmlElement(name = "BuyerPaidStatus")
    protected PaidStatusCodeType buyerPaidStatus;
    @XmlElement(name = "SellerPaidStatus")
    protected PaidStatusCodeType sellerPaidStatus;
    @XmlElement(name = "PaidTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar paidTime;
    @XmlElement(name = "ShippedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar shippedTime;
    @XmlElement(name = "TotalPrice")
    protected AmountType totalPrice;
    @XmlElement(name = "FeedbackLeft")
    protected FeedbackInfoType feedbackLeft;
    @XmlElement(name = "FeedbackReceived")
    protected FeedbackInfoType feedbackReceived;
    @XmlElement(name = "ContainingOrder")
    protected OrderType containingOrder;
    @XmlElement(name = "FinalValueFee")
    protected AmountType finalValueFee;
    @XmlElement(name = "TransactionSiteID")
    protected SiteCodeType transactionSiteID;
    @XmlElement(name = "Platform")
    protected TransactionPlatformCodeType platform;
    @XmlElement(name = "Variation")
    protected VariationType variation;
    @XmlElement(name = "BuyerCheckoutMessage")
    protected String buyerCheckoutMessage;
    @XmlElement(name = "TotalTransactionPrice")
    protected AmountType totalTransactionPrice;
    @XmlElement(name = "Taxes")
    protected TaxesType taxes;
    @XmlElement(name = "BundlePurchase")
    protected Boolean bundlePurchase;
    @XmlElement(name = "ActualShippingCost")
    protected AmountType actualShippingCost;
    @XmlElement(name = "ActualHandlingCost")
    protected AmountType actualHandlingCost;
    @XmlElement(name = "OrderLineItemID")
    protected String orderLineItemID;
    protected String eBayPaymentID;
    @XmlElement(name = "SellerDiscounts")
    protected SellerDiscountsType sellerDiscounts;
    @XmlElement(name = "CodiceFiscale")
    protected String codiceFiscale;
    @XmlElement(name = "IsMultiLegShipping")
    protected Boolean isMultiLegShipping;
    @XmlElement(name = "MultiLegShippingDetails")
    protected MultiLegShippingDetailsType multiLegShippingDetails;
    @XmlElement(name = "InvoiceSentTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar invoiceSentTime;
    @XmlElement(name = "IntangibleItem")
    protected Boolean intangibleItem;
    @XmlElement(name = "MonetaryDetails")
    protected PaymentsInformationType monetaryDetails;
    @XmlElement(name = "PickupDetails")
    protected PickupDetailsType pickupDetails;
    @XmlElement(name = "PickupMethodSelected")
    protected PickupMethodSelectedType pickupMethodSelected;
    @XmlElement(name = "LogisticsPlanType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String logisticsPlanType;
    @XmlElement(name = "BuyerPackageEnclosures")
    protected BuyerPackageEnclosuresType buyerPackageEnclosures;
    @XmlElement(name = "InventoryReservationID")
    protected String inventoryReservationID;
    @XmlElement(name = "ExtendedOrderID")
    protected String extendedOrderID;
    protected Boolean eBayPlusTransaction;
    @XmlElement(name = "GiftSummary")
    protected GiftSummaryType giftSummary;
    @XmlElement(name = "DigitalDeliverySelected")
    protected DigitalDeliverySelectedType digitalDeliverySelected;
    @XmlElement(name = "Gift")
    protected Boolean gift;
    @XmlElement(name = "GuaranteedShipping")
    protected Boolean guaranteedShipping;
    @XmlElement(name = "GuaranteedDelivery")
    protected Boolean guaranteedDelivery;
    protected Boolean eBayCollectAndRemitTax;
    protected TaxesType eBayCollectAndRemitTaxes;
    @XmlElement(name = "Program")
    protected TransactionProgramType program;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "LinkedLineItemArray")
    protected LinkedLineItemArrayType linkedLineItemArray;

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountPaid(AmountType value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentAmount(AmountType value) {
        this.adjustmentAmount = value;
    }

    /**
     * Gets the value of the convertedAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedAdjustmentAmount() {
        return convertedAdjustmentAmount;
    }

    /**
     * Sets the value of the convertedAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedAdjustmentAmount(AmountType value) {
        this.convertedAdjustmentAmount = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setBuyer(UserType value) {
        this.buyer = value;
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
     * Gets the value of the convertedAmountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedAmountPaid() {
        return convertedAmountPaid;
    }

    /**
     * Sets the value of the convertedAmountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedAmountPaid(AmountType value) {
        this.convertedAmountPaid = value;
    }

    /**
     * Gets the value of the convertedTransactionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedTransactionPrice() {
        return convertedTransactionPrice;
    }

    /**
     * Sets the value of the convertedTransactionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedTransactionPrice(AmountType value) {
        this.convertedTransactionPrice = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(Calendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link DepositTypeCodeType }
     *     
     */
    public DepositTypeCodeType getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositTypeCodeType }
     *     
     */
    public void setDepositType(DepositTypeCodeType value) {
        this.depositType = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the quantityPurchased property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityPurchased() {
        return quantityPurchased;
    }

    /**
     * Sets the value of the quantityPurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityPurchased(Integer value) {
        this.quantityPurchased = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusType }
     *     
     */
    public TransactionStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusType }
     *     
     */
    public void setStatus(TransactionStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the transactionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransactionPrice() {
        return transactionPrice;
    }

    /**
     * Sets the value of the transactionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransactionPrice(AmountType value) {
        this.transactionPrice = value;
    }

    /**
     * Gets the value of the bestOfferSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferSale() {
        return bestOfferSale;
    }

    /**
     * Sets the value of the bestOfferSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferSale(Boolean value) {
        this.bestOfferSale = value;
    }

    /**
     * Gets the value of the vatPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATPercent() {
        return vatPercent;
    }

    /**
     * Sets the value of the vatPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATPercent(BigDecimal value) {
        this.vatPercent = value;
    }

    /**
     * Gets the value of the shippingServiceSelected property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public ShippingServiceOptionsType getShippingServiceSelected() {
        return shippingServiceSelected;
    }

    /**
     * Sets the value of the shippingServiceSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public void setShippingServiceSelected(ShippingServiceOptionsType value) {
        this.shippingServiceSelected = value;
    }

    /**
     * Gets the value of the buyerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * Sets the value of the buyerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerMessage(String value) {
        this.buyerMessage = value;
    }

    /**
     * Gets the value of the buyerPaidStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaidStatusCodeType }
     *     
     */
    public PaidStatusCodeType getBuyerPaidStatus() {
        return buyerPaidStatus;
    }

    /**
     * Sets the value of the buyerPaidStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidStatusCodeType }
     *     
     */
    public void setBuyerPaidStatus(PaidStatusCodeType value) {
        this.buyerPaidStatus = value;
    }

    /**
     * Gets the value of the sellerPaidStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaidStatusCodeType }
     *     
     */
    public PaidStatusCodeType getSellerPaidStatus() {
        return sellerPaidStatus;
    }

    /**
     * Sets the value of the sellerPaidStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidStatusCodeType }
     *     
     */
    public void setSellerPaidStatus(PaidStatusCodeType value) {
        this.sellerPaidStatus = value;
    }

    /**
     * Gets the value of the paidTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPaidTime() {
        return paidTime;
    }

    /**
     * Sets the value of the paidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidTime(Calendar value) {
        this.paidTime = value;
    }

    /**
     * Gets the value of the shippedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getShippedTime() {
        return shippedTime;
    }

    /**
     * Sets the value of the shippedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippedTime(Calendar value) {
        this.shippedTime = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalPrice(AmountType value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the feedbackLeft property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackInfoType }
     *     
     */
    public FeedbackInfoType getFeedbackLeft() {
        return feedbackLeft;
    }

    /**
     * Sets the value of the feedbackLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackInfoType }
     *     
     */
    public void setFeedbackLeft(FeedbackInfoType value) {
        this.feedbackLeft = value;
    }

    /**
     * Gets the value of the feedbackReceived property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackInfoType }
     *     
     */
    public FeedbackInfoType getFeedbackReceived() {
        return feedbackReceived;
    }

    /**
     * Sets the value of the feedbackReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackInfoType }
     *     
     */
    public void setFeedbackReceived(FeedbackInfoType value) {
        this.feedbackReceived = value;
    }

    /**
     * Gets the value of the containingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getContainingOrder() {
        return containingOrder;
    }

    /**
     * Sets the value of the containingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setContainingOrder(OrderType value) {
        this.containingOrder = value;
    }

    /**
     * Gets the value of the finalValueFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinalValueFee() {
        return finalValueFee;
    }

    /**
     * Sets the value of the finalValueFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinalValueFee(AmountType value) {
        this.finalValueFee = value;
    }

    /**
     * Gets the value of the transactionSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getTransactionSiteID() {
        return transactionSiteID;
    }

    /**
     * Sets the value of the transactionSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setTransactionSiteID(SiteCodeType value) {
        this.transactionSiteID = value;
    }

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPlatformCodeType }
     *     
     */
    public TransactionPlatformCodeType getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPlatformCodeType }
     *     
     */
    public void setPlatform(TransactionPlatformCodeType value) {
        this.platform = value;
    }

    /**
     * Gets the value of the variation property.
     * 
     * @return
     *     possible object is
     *     {@link VariationType }
     *     
     */
    public VariationType getVariation() {
        return variation;
    }

    /**
     * Sets the value of the variation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationType }
     *     
     */
    public void setVariation(VariationType value) {
        this.variation = value;
    }

    /**
     * Gets the value of the buyerCheckoutMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerCheckoutMessage() {
        return buyerCheckoutMessage;
    }

    /**
     * Sets the value of the buyerCheckoutMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerCheckoutMessage(String value) {
        this.buyerCheckoutMessage = value;
    }

    /**
     * Gets the value of the totalTransactionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalTransactionPrice() {
        return totalTransactionPrice;
    }

    /**
     * Sets the value of the totalTransactionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalTransactionPrice(AmountType value) {
        this.totalTransactionPrice = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxes(TaxesType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the bundlePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBundlePurchase() {
        return bundlePurchase;
    }

    /**
     * Sets the value of the bundlePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBundlePurchase(Boolean value) {
        this.bundlePurchase = value;
    }

    /**
     * Gets the value of the actualShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getActualShippingCost() {
        return actualShippingCost;
    }

    /**
     * Sets the value of the actualShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setActualShippingCost(AmountType value) {
        this.actualShippingCost = value;
    }

    /**
     * Gets the value of the actualHandlingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getActualHandlingCost() {
        return actualHandlingCost;
    }

    /**
     * Sets the value of the actualHandlingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setActualHandlingCost(AmountType value) {
        this.actualHandlingCost = value;
    }

    /**
     * Gets the value of the orderLineItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineItemID() {
        return orderLineItemID;
    }

    /**
     * Sets the value of the orderLineItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineItemID(String value) {
        this.orderLineItemID = value;
    }

    /**
     * Gets the value of the eBayPaymentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBayPaymentID() {
        return eBayPaymentID;
    }

    /**
     * Sets the value of the eBayPaymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBayPaymentID(String value) {
        this.eBayPaymentID = value;
    }

    /**
     * Gets the value of the sellerDiscounts property.
     * 
     * @return
     *     possible object is
     *     {@link SellerDiscountsType }
     *     
     */
    public SellerDiscountsType getSellerDiscounts() {
        return sellerDiscounts;
    }

    /**
     * Sets the value of the sellerDiscounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerDiscountsType }
     *     
     */
    public void setSellerDiscounts(SellerDiscountsType value) {
        this.sellerDiscounts = value;
    }

    /**
     * Gets the value of the codiceFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Sets the value of the codiceFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Gets the value of the isMultiLegShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiLegShipping() {
        return isMultiLegShipping;
    }

    /**
     * Sets the value of the isMultiLegShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiLegShipping(Boolean value) {
        this.isMultiLegShipping = value;
    }

    /**
     * Gets the value of the multiLegShippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLegShippingDetailsType }
     *     
     */
    public MultiLegShippingDetailsType getMultiLegShippingDetails() {
        return multiLegShippingDetails;
    }

    /**
     * Sets the value of the multiLegShippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLegShippingDetailsType }
     *     
     */
    public void setMultiLegShippingDetails(MultiLegShippingDetailsType value) {
        this.multiLegShippingDetails = value;
    }

    /**
     * Gets the value of the invoiceSentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getInvoiceSentTime() {
        return invoiceSentTime;
    }

    /**
     * Sets the value of the invoiceSentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSentTime(Calendar value) {
        this.invoiceSentTime = value;
    }

    /**
     * Gets the value of the intangibleItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntangibleItem() {
        return intangibleItem;
    }

    /**
     * Sets the value of the intangibleItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntangibleItem(Boolean value) {
        this.intangibleItem = value;
    }

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsInformationType }
     *     
     */
    public PaymentsInformationType getMonetaryDetails() {
        return monetaryDetails;
    }

    /**
     * Sets the value of the monetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsInformationType }
     *     
     */
    public void setMonetaryDetails(PaymentsInformationType value) {
        this.monetaryDetails = value;
    }

    /**
     * Gets the value of the pickupDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PickupDetailsType }
     *     
     */
    public PickupDetailsType getPickupDetails() {
        return pickupDetails;
    }

    /**
     * Sets the value of the pickupDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupDetailsType }
     *     
     */
    public void setPickupDetails(PickupDetailsType value) {
        this.pickupDetails = value;
    }

    /**
     * Gets the value of the pickupMethodSelected property.
     * 
     * @return
     *     possible object is
     *     {@link PickupMethodSelectedType }
     *     
     */
    public PickupMethodSelectedType getPickupMethodSelected() {
        return pickupMethodSelected;
    }

    /**
     * Sets the value of the pickupMethodSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupMethodSelectedType }
     *     
     */
    public void setPickupMethodSelected(PickupMethodSelectedType value) {
        this.pickupMethodSelected = value;
    }

    /**
     * Gets the value of the logisticsPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsPlanType() {
        return logisticsPlanType;
    }

    /**
     * Sets the value of the logisticsPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsPlanType(String value) {
        this.logisticsPlanType = value;
    }

    /**
     * Gets the value of the buyerPackageEnclosures property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPackageEnclosuresType }
     *     
     */
    public BuyerPackageEnclosuresType getBuyerPackageEnclosures() {
        return buyerPackageEnclosures;
    }

    /**
     * Sets the value of the buyerPackageEnclosures property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPackageEnclosuresType }
     *     
     */
    public void setBuyerPackageEnclosures(BuyerPackageEnclosuresType value) {
        this.buyerPackageEnclosures = value;
    }

    /**
     * Gets the value of the inventoryReservationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryReservationID() {
        return inventoryReservationID;
    }

    /**
     * Sets the value of the inventoryReservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryReservationID(String value) {
        this.inventoryReservationID = value;
    }

    /**
     * Gets the value of the extendedOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedOrderID() {
        return extendedOrderID;
    }

    /**
     * Sets the value of the extendedOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedOrderID(String value) {
        this.extendedOrderID = value;
    }

    /**
     * Gets the value of the eBayPlusTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayPlusTransaction() {
        return eBayPlusTransaction;
    }

    /**
     * Sets the value of the eBayPlusTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayPlusTransaction(Boolean value) {
        this.eBayPlusTransaction = value;
    }

    /**
     * Gets the value of the giftSummary property.
     * 
     * @return
     *     possible object is
     *     {@link GiftSummaryType }
     *     
     */
    public GiftSummaryType getGiftSummary() {
        return giftSummary;
    }

    /**
     * Sets the value of the giftSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftSummaryType }
     *     
     */
    public void setGiftSummary(GiftSummaryType value) {
        this.giftSummary = value;
    }

    /**
     * Gets the value of the digitalDeliverySelected property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalDeliverySelectedType }
     *     
     */
    public DigitalDeliverySelectedType getDigitalDeliverySelected() {
        return digitalDeliverySelected;
    }

    /**
     * Sets the value of the digitalDeliverySelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalDeliverySelectedType }
     *     
     */
    public void setDigitalDeliverySelected(DigitalDeliverySelectedType value) {
        this.digitalDeliverySelected = value;
    }

    /**
     * Gets the value of the gift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGift() {
        return gift;
    }

    /**
     * Sets the value of the gift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGift(Boolean value) {
        this.gift = value;
    }

    /**
     * Gets the value of the guaranteedShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedShipping() {
        return guaranteedShipping;
    }

    /**
     * Sets the value of the guaranteedShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedShipping(Boolean value) {
        this.guaranteedShipping = value;
    }

    /**
     * Gets the value of the guaranteedDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedDelivery() {
        return guaranteedDelivery;
    }

    /**
     * Sets the value of the guaranteedDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedDelivery(Boolean value) {
        this.guaranteedDelivery = value;
    }

    /**
     * Gets the value of the eBayCollectAndRemitTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayCollectAndRemitTax() {
        return eBayCollectAndRemitTax;
    }

    /**
     * Sets the value of the eBayCollectAndRemitTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayCollectAndRemitTax(Boolean value) {
        this.eBayCollectAndRemitTax = value;
    }

    /**
     * Gets the value of the eBayCollectAndRemitTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getEBayCollectAndRemitTaxes() {
        return eBayCollectAndRemitTaxes;
    }

    /**
     * Sets the value of the eBayCollectAndRemitTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setEBayCollectAndRemitTaxes(TaxesType value) {
        this.eBayCollectAndRemitTaxes = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionProgramType }
     *     
     */
    public TransactionProgramType getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionProgramType }
     *     
     */
    public void setProgram(TransactionProgramType value) {
        this.program = value;
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
     * Gets the value of the linkedLineItemArray property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedLineItemArrayType }
     *     
     */
    public LinkedLineItemArrayType getLinkedLineItemArray() {
        return linkedLineItemArray;
    }

    /**
     * Sets the value of the linkedLineItemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedLineItemArrayType }
     *     
     */
    public void setLinkedLineItemArray(LinkedLineItemArrayType value) {
        this.linkedLineItemArray = value;
    }

}
