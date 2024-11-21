
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
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
 * 				Type defining the <b>ShippingDetails</b> container, which contains the shipping-related
 * 				details for an order line item (pre-checkout) or order (post-checkout).
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>IMPORTANT:</strong> To avoid loss of shipping details when revising a listing, you must include all <strong>ShippingDetails</strong> fields that were originally provided. Do not omit any tag, even if its value does not change. Omitting a shipping field when revising an item will remove that detail from the listing.
 * 				</span>
 * 			
 * 
 * <p>Java class for ShippingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowPaymentEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyShippingDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GlobalShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingRate" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingRateType" minOccurs="0"/>
 *         &lt;element name="ChangePaymentInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentEdited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SalesTax" type="{urn:ebay:apis:eBLBaseComponents}SalesTaxType" minOccurs="0"/>
 *         &lt;element name="ShippingRateErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingRateType" type="{urn:ebay:apis:eBLBaseComponents}ShippingRateTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceOptions" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InternationalShippingServiceOption" type="{urn:ebay:apis:eBLBaseComponents}InternationalShippingServiceOptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingType" type="{urn:ebay:apis:eBLBaseComponents}ShippingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SellingManagerSalesRecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ThirdPartyCheckout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TaxTable" type="{urn:ebay:apis:eBLBaseComponents}TaxTableType" minOccurs="0"/>
 *         &lt;element name="GetItFast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingServiceUsed" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="DefaultShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingDiscountProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlatShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="PromotionalShippingDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InternationalShippingDiscountProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalFlatShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="InternationalCalculatedShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="InternationalPromotionalShippingDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PromotionalShippingDiscountDetails" type="{urn:ebay:apis:eBLBaseComponents}PromotionalShippingDiscountDetailsType" minOccurs="0"/>
 *         &lt;element name="ExcludeShipToLocation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eBayEstimatedLabelCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="SellerExcludeShipToLocationsPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipmentTrackingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShipmentTrackingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateTableDetails" type="{urn:ebay:apis:eBLBaseComponents}RateTableDetailsType" minOccurs="0"/>
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
@XmlType(name = "ShippingDetailsType", propOrder = {
    "allowPaymentEdit",
    "applyShippingDiscount",
    "globalShipping",
    "calculatedShippingRate",
    "changePaymentInstructions",
    "paymentEdited",
    "salesTax",
    "shippingRateErrorMessage",
    "shippingRateType",
    "shippingServiceOptions",
    "internationalShippingServiceOption",
    "shippingType",
    "sellingManagerSalesRecordNumber",
    "thirdPartyCheckout",
    "taxTable",
    "getItFast",
    "shippingServiceUsed",
    "defaultShippingCost",
    "shippingDiscountProfileID",
    "flatShippingDiscount",
    "calculatedShippingDiscount",
    "promotionalShippingDiscount",
    "internationalShippingDiscountProfileID",
    "internationalFlatShippingDiscount",
    "internationalCalculatedShippingDiscount",
    "internationalPromotionalShippingDiscount",
    "promotionalShippingDiscountDetails",
    "excludeShipToLocation",
    "eBayEstimatedLabelCost",
    "sellerExcludeShipToLocationsPreference",
    "shipmentTrackingDetails",
    "rateTableDetails",
    "any"
})
public class ShippingDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AllowPaymentEdit")
    protected Boolean allowPaymentEdit;
    @XmlElement(name = "ApplyShippingDiscount")
    protected Boolean applyShippingDiscount;
    @XmlElement(name = "GlobalShipping")
    protected Boolean globalShipping;
    @XmlElement(name = "CalculatedShippingRate")
    protected CalculatedShippingRateType calculatedShippingRate;
    @XmlElement(name = "ChangePaymentInstructions")
    protected Boolean changePaymentInstructions;
    @XmlElement(name = "PaymentEdited")
    protected Boolean paymentEdited;
    @XmlElement(name = "SalesTax")
    protected SalesTaxType salesTax;
    @XmlElement(name = "ShippingRateErrorMessage")
    protected String shippingRateErrorMessage;
    @XmlElement(name = "ShippingRateType")
    protected ShippingRateTypeCodeType shippingRateType;
    @XmlElement(name = "ShippingServiceOptions")
    protected List<ShippingServiceOptionsType> shippingServiceOptions;
    @XmlElement(name = "InternationalShippingServiceOption")
    protected List<InternationalShippingServiceOptionsType> internationalShippingServiceOption;
    @XmlElement(name = "ShippingType")
    protected ShippingTypeCodeType shippingType;
    @XmlElement(name = "SellingManagerSalesRecordNumber")
    protected Integer sellingManagerSalesRecordNumber;
    @XmlElement(name = "ThirdPartyCheckout")
    protected Boolean thirdPartyCheckout;
    @XmlElement(name = "TaxTable")
    protected TaxTableType taxTable;
    @XmlElement(name = "GetItFast")
    protected Boolean getItFast;
    @XmlElement(name = "ShippingServiceUsed")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingServiceUsed;
    @XmlElement(name = "DefaultShippingCost")
    protected AmountType defaultShippingCost;
    @XmlElement(name = "ShippingDiscountProfileID")
    protected String shippingDiscountProfileID;
    @XmlElement(name = "FlatShippingDiscount")
    protected FlatShippingDiscountType flatShippingDiscount;
    @XmlElement(name = "CalculatedShippingDiscount")
    protected CalculatedShippingDiscountType calculatedShippingDiscount;
    @XmlElement(name = "PromotionalShippingDiscount")
    protected Boolean promotionalShippingDiscount;
    @XmlElement(name = "InternationalShippingDiscountProfileID")
    protected String internationalShippingDiscountProfileID;
    @XmlElement(name = "InternationalFlatShippingDiscount")
    protected FlatShippingDiscountType internationalFlatShippingDiscount;
    @XmlElement(name = "InternationalCalculatedShippingDiscount")
    protected CalculatedShippingDiscountType internationalCalculatedShippingDiscount;
    @XmlElement(name = "InternationalPromotionalShippingDiscount")
    protected Boolean internationalPromotionalShippingDiscount;
    @XmlElement(name = "PromotionalShippingDiscountDetails")
    protected PromotionalShippingDiscountDetailsType promotionalShippingDiscountDetails;
    @XmlElement(name = "ExcludeShipToLocation")
    protected List<String> excludeShipToLocation;
    protected AmountType eBayEstimatedLabelCost;
    @XmlElement(name = "SellerExcludeShipToLocationsPreference")
    protected Boolean sellerExcludeShipToLocationsPreference;
    @XmlElement(name = "ShipmentTrackingDetails")
    protected List<ShipmentTrackingDetailsType> shipmentTrackingDetails;
    @XmlElement(name = "RateTableDetails")
    protected RateTableDetailsType rateTableDetails;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the allowPaymentEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPaymentEdit() {
        return allowPaymentEdit;
    }

    /**
     * Sets the value of the allowPaymentEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPaymentEdit(Boolean value) {
        this.allowPaymentEdit = value;
    }

    /**
     * Gets the value of the applyShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyShippingDiscount() {
        return applyShippingDiscount;
    }

    /**
     * Sets the value of the applyShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyShippingDiscount(Boolean value) {
        this.applyShippingDiscount = value;
    }

    /**
     * Gets the value of the globalShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalShipping() {
        return globalShipping;
    }

    /**
     * Sets the value of the globalShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalShipping(Boolean value) {
        this.globalShipping = value;
    }

    /**
     * Gets the value of the calculatedShippingRate property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingRateType }
     *     
     */
    public CalculatedShippingRateType getCalculatedShippingRate() {
        return calculatedShippingRate;
    }

    /**
     * Sets the value of the calculatedShippingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingRateType }
     *     
     */
    public void setCalculatedShippingRate(CalculatedShippingRateType value) {
        this.calculatedShippingRate = value;
    }

    /**
     * Gets the value of the changePaymentInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangePaymentInstructions() {
        return changePaymentInstructions;
    }

    /**
     * Sets the value of the changePaymentInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangePaymentInstructions(Boolean value) {
        this.changePaymentInstructions = value;
    }

    /**
     * Gets the value of the paymentEdited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentEdited() {
        return paymentEdited;
    }

    /**
     * Sets the value of the paymentEdited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentEdited(Boolean value) {
        this.paymentEdited = value;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxType }
     *     
     */
    public SalesTaxType getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxType }
     *     
     */
    public void setSalesTax(SalesTaxType value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the shippingRateErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingRateErrorMessage() {
        return shippingRateErrorMessage;
    }

    /**
     * Sets the value of the shippingRateErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingRateErrorMessage(String value) {
        this.shippingRateErrorMessage = value;
    }

    /**
     * Gets the value of the shippingRateType property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingRateTypeCodeType }
     *     
     */
    public ShippingRateTypeCodeType getShippingRateType() {
        return shippingRateType;
    }

    /**
     * Sets the value of the shippingRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingRateTypeCodeType }
     *     
     */
    public void setShippingRateType(ShippingRateTypeCodeType value) {
        this.shippingRateType = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public ShippingServiceOptionsType[] getShippingServiceOptions() {
        if (this.shippingServiceOptions == null) {
            return new ShippingServiceOptionsType[ 0 ] ;
        }
        return ((ShippingServiceOptionsType[]) this.shippingServiceOptions.toArray(new ShippingServiceOptionsType[this.shippingServiceOptions.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public ShippingServiceOptionsType getShippingServiceOptions(int idx) {
        if (this.shippingServiceOptions == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingServiceOptions.get(idx);
    }

    public int getShippingServiceOptionsLength() {
        if (this.shippingServiceOptions == null) {
            return  0;
        }
        return this.shippingServiceOptions.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public void setShippingServiceOptions(ShippingServiceOptionsType[] values) {
        this._getShippingServiceOptions().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingServiceOptions.add(values[i]);
        }
    }

    protected List<ShippingServiceOptionsType> _getShippingServiceOptions() {
        if (shippingServiceOptions == null) {
            shippingServiceOptions = new ArrayList<ShippingServiceOptionsType>();
        }
        return shippingServiceOptions;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceOptionsType }
     *     
     */
    public ShippingServiceOptionsType setShippingServiceOptions(int idx, ShippingServiceOptionsType value) {
        return this.shippingServiceOptions.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link InternationalShippingServiceOptionsType }
     *     
     */
    public InternationalShippingServiceOptionsType[] getInternationalShippingServiceOption() {
        if (this.internationalShippingServiceOption == null) {
            return new InternationalShippingServiceOptionsType[ 0 ] ;
        }
        return ((InternationalShippingServiceOptionsType[]) this.internationalShippingServiceOption.toArray(new InternationalShippingServiceOptionsType[this.internationalShippingServiceOption.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link InternationalShippingServiceOptionsType }
     *     
     */
    public InternationalShippingServiceOptionsType getInternationalShippingServiceOption(int idx) {
        if (this.internationalShippingServiceOption == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.internationalShippingServiceOption.get(idx);
    }

    public int getInternationalShippingServiceOptionLength() {
        if (this.internationalShippingServiceOption == null) {
            return  0;
        }
        return this.internationalShippingServiceOption.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link InternationalShippingServiceOptionsType }
     *     
     */
    public void setInternationalShippingServiceOption(InternationalShippingServiceOptionsType[] values) {
        this._getInternationalShippingServiceOption().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.internationalShippingServiceOption.add(values[i]);
        }
    }

    protected List<InternationalShippingServiceOptionsType> _getInternationalShippingServiceOption() {
        if (internationalShippingServiceOption == null) {
            internationalShippingServiceOption = new ArrayList<InternationalShippingServiceOptionsType>();
        }
        return internationalShippingServiceOption;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalShippingServiceOptionsType }
     *     
     */
    public InternationalShippingServiceOptionsType setInternationalShippingServiceOption(int idx, InternationalShippingServiceOptionsType value) {
        return this.internationalShippingServiceOption.set(idx, value);
    }

    /**
     * Gets the value of the shippingType property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingTypeCodeType }
     *     
     */
    public ShippingTypeCodeType getShippingType() {
        return shippingType;
    }

    /**
     * Sets the value of the shippingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingTypeCodeType }
     *     
     */
    public void setShippingType(ShippingTypeCodeType value) {
        this.shippingType = value;
    }

    /**
     * Gets the value of the sellingManagerSalesRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSellingManagerSalesRecordNumber() {
        return sellingManagerSalesRecordNumber;
    }

    /**
     * Sets the value of the sellingManagerSalesRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSellingManagerSalesRecordNumber(Integer value) {
        this.sellingManagerSalesRecordNumber = value;
    }

    /**
     * Gets the value of the thirdPartyCheckout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isThirdPartyCheckout() {
        return thirdPartyCheckout;
    }

    /**
     * Sets the value of the thirdPartyCheckout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThirdPartyCheckout(Boolean value) {
        this.thirdPartyCheckout = value;
    }

    /**
     * Gets the value of the taxTable property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTableType }
     *     
     */
    public TaxTableType getTaxTable() {
        return taxTable;
    }

    /**
     * Sets the value of the taxTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTableType }
     *     
     */
    public void setTaxTable(TaxTableType value) {
        this.taxTable = value;
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
     * Gets the value of the shippingServiceUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingServiceUsed() {
        return shippingServiceUsed;
    }

    /**
     * Sets the value of the shippingServiceUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingServiceUsed(String value) {
        this.shippingServiceUsed = value;
    }

    /**
     * Gets the value of the defaultShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDefaultShippingCost() {
        return defaultShippingCost;
    }

    /**
     * Sets the value of the defaultShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDefaultShippingCost(AmountType value) {
        this.defaultShippingCost = value;
    }

    /**
     * Gets the value of the shippingDiscountProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingDiscountProfileID() {
        return shippingDiscountProfileID;
    }

    /**
     * Sets the value of the shippingDiscountProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingDiscountProfileID(String value) {
        this.shippingDiscountProfileID = value;
    }

    /**
     * Gets the value of the flatShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public FlatShippingDiscountType getFlatShippingDiscount() {
        return flatShippingDiscount;
    }

    /**
     * Sets the value of the flatShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public void setFlatShippingDiscount(FlatShippingDiscountType value) {
        this.flatShippingDiscount = value;
    }

    /**
     * Gets the value of the calculatedShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public CalculatedShippingDiscountType getCalculatedShippingDiscount() {
        return calculatedShippingDiscount;
    }

    /**
     * Sets the value of the calculatedShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public void setCalculatedShippingDiscount(CalculatedShippingDiscountType value) {
        this.calculatedShippingDiscount = value;
    }

    /**
     * Gets the value of the promotionalShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromotionalShippingDiscount() {
        return promotionalShippingDiscount;
    }

    /**
     * Sets the value of the promotionalShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromotionalShippingDiscount(Boolean value) {
        this.promotionalShippingDiscount = value;
    }

    /**
     * Gets the value of the internationalShippingDiscountProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalShippingDiscountProfileID() {
        return internationalShippingDiscountProfileID;
    }

    /**
     * Sets the value of the internationalShippingDiscountProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalShippingDiscountProfileID(String value) {
        this.internationalShippingDiscountProfileID = value;
    }

    /**
     * Gets the value of the internationalFlatShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public FlatShippingDiscountType getInternationalFlatShippingDiscount() {
        return internationalFlatShippingDiscount;
    }

    /**
     * Sets the value of the internationalFlatShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatShippingDiscountType }
     *     
     */
    public void setInternationalFlatShippingDiscount(FlatShippingDiscountType value) {
        this.internationalFlatShippingDiscount = value;
    }

    /**
     * Gets the value of the internationalCalculatedShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public CalculatedShippingDiscountType getInternationalCalculatedShippingDiscount() {
        return internationalCalculatedShippingDiscount;
    }

    /**
     * Sets the value of the internationalCalculatedShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingDiscountType }
     *     
     */
    public void setInternationalCalculatedShippingDiscount(CalculatedShippingDiscountType value) {
        this.internationalCalculatedShippingDiscount = value;
    }

    /**
     * Gets the value of the internationalPromotionalShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternationalPromotionalShippingDiscount() {
        return internationalPromotionalShippingDiscount;
    }

    /**
     * Sets the value of the internationalPromotionalShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternationalPromotionalShippingDiscount(Boolean value) {
        this.internationalPromotionalShippingDiscount = value;
    }

    /**
     * Gets the value of the promotionalShippingDiscountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalShippingDiscountDetailsType }
     *     
     */
    public PromotionalShippingDiscountDetailsType getPromotionalShippingDiscountDetails() {
        return promotionalShippingDiscountDetails;
    }

    /**
     * Sets the value of the promotionalShippingDiscountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalShippingDiscountDetailsType }
     *     
     */
    public void setPromotionalShippingDiscountDetails(PromotionalShippingDiscountDetailsType value) {
        this.promotionalShippingDiscountDetails = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getExcludeShipToLocation() {
        if (this.excludeShipToLocation == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.excludeShipToLocation.toArray(new String[this.excludeShipToLocation.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getExcludeShipToLocation(int idx) {
        if (this.excludeShipToLocation == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.excludeShipToLocation.get(idx);
    }

    public int getExcludeShipToLocationLength() {
        if (this.excludeShipToLocation == null) {
            return  0;
        }
        return this.excludeShipToLocation.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setExcludeShipToLocation(String[] values) {
        this._getExcludeShipToLocation().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.excludeShipToLocation.add(values[i]);
        }
    }

    protected List<String> _getExcludeShipToLocation() {
        if (excludeShipToLocation == null) {
            excludeShipToLocation = new ArrayList<String>();
        }
        return excludeShipToLocation;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setExcludeShipToLocation(int idx, String value) {
        return this.excludeShipToLocation.set(idx, value);
    }

    /**
     * Gets the value of the eBayEstimatedLabelCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEBayEstimatedLabelCost() {
        return eBayEstimatedLabelCost;
    }

    /**
     * Sets the value of the eBayEstimatedLabelCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEBayEstimatedLabelCost(AmountType value) {
        this.eBayEstimatedLabelCost = value;
    }

    /**
     * Gets the value of the sellerExcludeShipToLocationsPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerExcludeShipToLocationsPreference() {
        return sellerExcludeShipToLocationsPreference;
    }

    /**
     * Sets the value of the sellerExcludeShipToLocationsPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerExcludeShipToLocationsPreference(Boolean value) {
        this.sellerExcludeShipToLocationsPreference = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public ShipmentTrackingDetailsType[] getShipmentTrackingDetails() {
        if (this.shipmentTrackingDetails == null) {
            return new ShipmentTrackingDetailsType[ 0 ] ;
        }
        return ((ShipmentTrackingDetailsType[]) this.shipmentTrackingDetails.toArray(new ShipmentTrackingDetailsType[this.shipmentTrackingDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public ShipmentTrackingDetailsType getShipmentTrackingDetails(int idx) {
        if (this.shipmentTrackingDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shipmentTrackingDetails.get(idx);
    }

    public int getShipmentTrackingDetailsLength() {
        if (this.shipmentTrackingDetails == null) {
            return  0;
        }
        return this.shipmentTrackingDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public void setShipmentTrackingDetails(ShipmentTrackingDetailsType[] values) {
        this._getShipmentTrackingDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shipmentTrackingDetails.add(values[i]);
        }
    }

    protected List<ShipmentTrackingDetailsType> _getShipmentTrackingDetails() {
        if (shipmentTrackingDetails == null) {
            shipmentTrackingDetails = new ArrayList<ShipmentTrackingDetailsType>();
        }
        return shipmentTrackingDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public ShipmentTrackingDetailsType setShipmentTrackingDetails(int idx, ShipmentTrackingDetailsType value) {
        return this.shipmentTrackingDetails.set(idx, value);
    }

    /**
     * Gets the value of the rateTableDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RateTableDetailsType }
     *     
     */
    public RateTableDetailsType getRateTableDetails() {
        return rateTableDetails;
    }

    /**
     * Sets the value of the rateTableDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTableDetailsType }
     *     
     */
    public void setRateTableDetails(RateTableDetailsType value) {
        this.rateTableDetails = value;
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
