
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
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for ExpressItemRequirementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressItemRequirementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellerExpressEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressEligibleListingType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressEnabledCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EligiblePayPalAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DomesticShippingCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EligibleReturnPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EligibleItemCondition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PriceAboveMinimum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PriceBelowMaximum" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EligibleCheckout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NoPreapprovedBidderList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NoCharity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CombinedShippingDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipFromEligibleCountry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PayPalAccountAcceptsUnconfirmedAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ExpressItemRequirementsType", propOrder = {
    "sellerExpressEligible",
    "expressOptOut",
    "expressApproved",
    "expressEligibleListingType",
    "expressEnabledCategory",
    "eligiblePayPalAccount",
    "domesticShippingCost",
    "eligibleReturnPolicy",
    "picture",
    "eligibleItemCondition",
    "priceAboveMinimum",
    "priceBelowMaximum",
    "eligibleCheckout",
    "noPreapprovedBidderList",
    "noCharity",
    "combinedShippingDiscount",
    "shipFromEligibleCountry",
    "payPalAccountAcceptsUnconfirmedAddress",
    "any"
})
public class ExpressItemRequirementsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellerExpressEligible")
    protected Boolean sellerExpressEligible;
    @XmlElement(name = "ExpressOptOut")
    protected Boolean expressOptOut;
    @XmlElement(name = "ExpressApproved")
    protected Boolean expressApproved;
    @XmlElement(name = "ExpressEligibleListingType")
    protected Boolean expressEligibleListingType;
    @XmlElement(name = "ExpressEnabledCategory")
    protected Boolean expressEnabledCategory;
    @XmlElement(name = "EligiblePayPalAccount")
    protected Boolean eligiblePayPalAccount;
    @XmlElement(name = "DomesticShippingCost")
    protected Boolean domesticShippingCost;
    @XmlElement(name = "EligibleReturnPolicy")
    protected Boolean eligibleReturnPolicy;
    @XmlElement(name = "Picture")
    protected Boolean picture;
    @XmlElement(name = "EligibleItemCondition")
    protected Boolean eligibleItemCondition;
    @XmlElement(name = "PriceAboveMinimum")
    protected Boolean priceAboveMinimum;
    @XmlElement(name = "PriceBelowMaximum")
    protected Boolean priceBelowMaximum;
    @XmlElement(name = "EligibleCheckout")
    protected Boolean eligibleCheckout;
    @XmlElement(name = "NoPreapprovedBidderList")
    protected Boolean noPreapprovedBidderList;
    @XmlElement(name = "NoCharity")
    protected Boolean noCharity;
    @XmlElement(name = "CombinedShippingDiscount")
    protected Boolean combinedShippingDiscount;
    @XmlElement(name = "ShipFromEligibleCountry")
    protected Boolean shipFromEligibleCountry;
    @XmlElement(name = "PayPalAccountAcceptsUnconfirmedAddress")
    protected Boolean payPalAccountAcceptsUnconfirmedAddress;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the sellerExpressEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerExpressEligible() {
        return sellerExpressEligible;
    }

    /**
     * Sets the value of the sellerExpressEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerExpressEligible(Boolean value) {
        this.sellerExpressEligible = value;
    }

    /**
     * Gets the value of the expressOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressOptOut() {
        return expressOptOut;
    }

    /**
     * Sets the value of the expressOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressOptOut(Boolean value) {
        this.expressOptOut = value;
    }

    /**
     * Gets the value of the expressApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressApproved() {
        return expressApproved;
    }

    /**
     * Sets the value of the expressApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressApproved(Boolean value) {
        this.expressApproved = value;
    }

    /**
     * Gets the value of the expressEligibleListingType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressEligibleListingType() {
        return expressEligibleListingType;
    }

    /**
     * Sets the value of the expressEligibleListingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressEligibleListingType(Boolean value) {
        this.expressEligibleListingType = value;
    }

    /**
     * Gets the value of the expressEnabledCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressEnabledCategory() {
        return expressEnabledCategory;
    }

    /**
     * Sets the value of the expressEnabledCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressEnabledCategory(Boolean value) {
        this.expressEnabledCategory = value;
    }

    /**
     * Gets the value of the eligiblePayPalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligiblePayPalAccount() {
        return eligiblePayPalAccount;
    }

    /**
     * Sets the value of the eligiblePayPalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligiblePayPalAccount(Boolean value) {
        this.eligiblePayPalAccount = value;
    }

    /**
     * Gets the value of the domesticShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDomesticShippingCost() {
        return domesticShippingCost;
    }

    /**
     * Sets the value of the domesticShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDomesticShippingCost(Boolean value) {
        this.domesticShippingCost = value;
    }

    /**
     * Gets the value of the eligibleReturnPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleReturnPolicy() {
        return eligibleReturnPolicy;
    }

    /**
     * Sets the value of the eligibleReturnPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleReturnPolicy(Boolean value) {
        this.eligibleReturnPolicy = value;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPicture(Boolean value) {
        this.picture = value;
    }

    /**
     * Gets the value of the eligibleItemCondition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleItemCondition() {
        return eligibleItemCondition;
    }

    /**
     * Sets the value of the eligibleItemCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleItemCondition(Boolean value) {
        this.eligibleItemCondition = value;
    }

    /**
     * Gets the value of the priceAboveMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceAboveMinimum() {
        return priceAboveMinimum;
    }

    /**
     * Sets the value of the priceAboveMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceAboveMinimum(Boolean value) {
        this.priceAboveMinimum = value;
    }

    /**
     * Gets the value of the priceBelowMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceBelowMaximum() {
        return priceBelowMaximum;
    }

    /**
     * Sets the value of the priceBelowMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceBelowMaximum(Boolean value) {
        this.priceBelowMaximum = value;
    }

    /**
     * Gets the value of the eligibleCheckout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleCheckout() {
        return eligibleCheckout;
    }

    /**
     * Sets the value of the eligibleCheckout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleCheckout(Boolean value) {
        this.eligibleCheckout = value;
    }

    /**
     * Gets the value of the noPreapprovedBidderList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoPreapprovedBidderList() {
        return noPreapprovedBidderList;
    }

    /**
     * Sets the value of the noPreapprovedBidderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoPreapprovedBidderList(Boolean value) {
        this.noPreapprovedBidderList = value;
    }

    /**
     * Gets the value of the noCharity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoCharity() {
        return noCharity;
    }

    /**
     * Sets the value of the noCharity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoCharity(Boolean value) {
        this.noCharity = value;
    }

    /**
     * Gets the value of the combinedShippingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCombinedShippingDiscount() {
        return combinedShippingDiscount;
    }

    /**
     * Sets the value of the combinedShippingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombinedShippingDiscount(Boolean value) {
        this.combinedShippingDiscount = value;
    }

    /**
     * Gets the value of the shipFromEligibleCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipFromEligibleCountry() {
        return shipFromEligibleCountry;
    }

    /**
     * Sets the value of the shipFromEligibleCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipFromEligibleCountry(Boolean value) {
        this.shipFromEligibleCountry = value;
    }

    /**
     * Gets the value of the payPalAccountAcceptsUnconfirmedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayPalAccountAcceptsUnconfirmedAddress() {
        return payPalAccountAcceptsUnconfirmedAddress;
    }

    /**
     * Sets the value of the payPalAccountAcceptsUnconfirmedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayPalAccountAcceptsUnconfirmedAddress(Boolean value) {
        this.payPalAccountAcceptsUnconfirmedAddress = value;
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
