
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response of the <b>GetShippingDiscountProfiles</b> call.
 * 			
 * 
 * <p>Java class for GetShippingDiscountProfilesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetShippingDiscountProfilesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyID" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="FlatShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingDiscount" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingDiscountType" minOccurs="0"/>
 *         &lt;element name="PromotionalShippingDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculatedHandlingDiscount" type="{urn:ebay:apis:eBLBaseComponents}CalculatedHandlingDiscountType" minOccurs="0"/>
 *         &lt;element name="PromotionalShippingDiscountDetails" type="{urn:ebay:apis:eBLBaseComponents}PromotionalShippingDiscountDetailsType" minOccurs="0"/>
 *         &lt;element name="CombinedDuration" type="{urn:ebay:apis:eBLBaseComponents}CombinedPaymentPeriodCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetShippingDiscountProfilesResponseType", propOrder = {
    "currencyID",
    "flatShippingDiscount",
    "calculatedShippingDiscount",
    "promotionalShippingDiscount",
    "calculatedHandlingDiscount",
    "promotionalShippingDiscountDetails",
    "combinedDuration"
})
public class GetShippingDiscountProfilesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CurrencyID")
    protected CurrencyCodeType currencyID;
    @XmlElement(name = "FlatShippingDiscount")
    protected FlatShippingDiscountType flatShippingDiscount;
    @XmlElement(name = "CalculatedShippingDiscount")
    protected CalculatedShippingDiscountType calculatedShippingDiscount;
    @XmlElement(name = "PromotionalShippingDiscount")
    protected Boolean promotionalShippingDiscount;
    @XmlElement(name = "CalculatedHandlingDiscount")
    protected CalculatedHandlingDiscountType calculatedHandlingDiscount;
    @XmlElement(name = "PromotionalShippingDiscountDetails")
    protected PromotionalShippingDiscountDetailsType promotionalShippingDiscountDetails;
    @XmlElement(name = "CombinedDuration")
    protected CombinedPaymentPeriodCodeType combinedDuration;

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyID(CurrencyCodeType value) {
        this.currencyID = value;
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
     * Gets the value of the calculatedHandlingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedHandlingDiscountType }
     *     
     */
    public CalculatedHandlingDiscountType getCalculatedHandlingDiscount() {
        return calculatedHandlingDiscount;
    }

    /**
     * Sets the value of the calculatedHandlingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedHandlingDiscountType }
     *     
     */
    public void setCalculatedHandlingDiscount(CalculatedHandlingDiscountType value) {
        this.calculatedHandlingDiscount = value;
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
     * Gets the value of the combinedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedPaymentPeriodCodeType }
     *     
     */
    public CombinedPaymentPeriodCodeType getCombinedDuration() {
        return combinedDuration;
    }

    /**
     * Sets the value of the combinedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedPaymentPeriodCodeType }
     *     
     */
    public void setCombinedDuration(CombinedPaymentPeriodCodeType value) {
        this.combinedDuration = value;
    }

}
