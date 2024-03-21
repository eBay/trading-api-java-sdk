
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Contains information pertaining to an offer made on an item listing and
 * 				the current bidding or purchase state of the listing.
 * 			
 * 
 * <p>Java class for OfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{urn:ebay:apis:eBLBaseComponents}BidActionCodeType" minOccurs="0"/>
 *         &lt;element name="Currency" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="MaxBid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Discounts" type="{urn:ebay:apis:eBLBaseComponents}OfferDiscountsType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecondChanceEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SiteCurrency" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="TimeBid" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HighestBid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertedPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{urn:ebay:apis:eBLBaseComponents}UserType" minOccurs="0"/>
 *         &lt;element name="UserConsent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BidCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BestOfferID" type="{urn:ebay:apis:eBLBaseComponents}BestOfferIDType" minOccurs="0"/>
 *         &lt;element name="MyMaxBid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
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
@XmlType(name = "OfferType", propOrder = {
    "action",
    "currency",
    "itemID",
    "maxBid",
    "discounts",
    "quantity",
    "secondChanceEnabled",
    "siteCurrency",
    "timeBid",
    "highestBid",
    "convertedPrice",
    "transactionID",
    "user",
    "userConsent",
    "bidCount",
    "message",
    "bestOfferID",
    "myMaxBid",
    "any"
})
public class OfferType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Action")
    protected BidActionCodeType action;
    @XmlElement(name = "Currency")
    protected CurrencyCodeType currency;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "MaxBid")
    protected AmountType maxBid;
    @XmlElement(name = "Discounts")
    protected OfferDiscountsType discounts;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "SecondChanceEnabled")
    protected Boolean secondChanceEnabled;
    @XmlElement(name = "SiteCurrency")
    protected CurrencyCodeType siteCurrency;
    @XmlElement(name = "TimeBid", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar timeBid;
    @XmlElement(name = "HighestBid")
    protected AmountType highestBid;
    @XmlElement(name = "ConvertedPrice")
    protected AmountType convertedPrice;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "User")
    protected UserType user;
    @XmlElement(name = "UserConsent")
    protected Boolean userConsent;
    @XmlElement(name = "BidCount")
    protected Integer bidCount;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "BestOfferID")
    protected String bestOfferID;
    @XmlElement(name = "MyMaxBid")
    protected AmountType myMaxBid;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link BidActionCodeType }
     *     
     */
    public BidActionCodeType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidActionCodeType }
     *     
     */
    public void setAction(BidActionCodeType value) {
        this.action = value;
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
     * Gets the value of the maxBid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaxBid() {
        return maxBid;
    }

    /**
     * Sets the value of the maxBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaxBid(AmountType value) {
        this.maxBid = value;
    }

    /**
     * Gets the value of the discounts property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDiscountsType }
     *     
     */
    public OfferDiscountsType getDiscounts() {
        return discounts;
    }

    /**
     * Sets the value of the discounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDiscountsType }
     *     
     */
    public void setDiscounts(OfferDiscountsType value) {
        this.discounts = value;
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
     * Gets the value of the secondChanceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecondChanceEnabled() {
        return secondChanceEnabled;
    }

    /**
     * Sets the value of the secondChanceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecondChanceEnabled(Boolean value) {
        this.secondChanceEnabled = value;
    }

    /**
     * Gets the value of the siteCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getSiteCurrency() {
        return siteCurrency;
    }

    /**
     * Sets the value of the siteCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setSiteCurrency(CurrencyCodeType value) {
        this.siteCurrency = value;
    }

    /**
     * Gets the value of the timeBid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTimeBid() {
        return timeBid;
    }

    /**
     * Sets the value of the timeBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeBid(Calendar value) {
        this.timeBid = value;
    }

    /**
     * Gets the value of the highestBid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighestBid() {
        return highestBid;
    }

    /**
     * Sets the value of the highestBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighestBid(AmountType value) {
        this.highestBid = value;
    }

    /**
     * Gets the value of the convertedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedPrice() {
        return convertedPrice;
    }

    /**
     * Sets the value of the convertedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedPrice(AmountType value) {
        this.convertedPrice = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the userConsent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserConsent() {
        return userConsent;
    }

    /**
     * Sets the value of the userConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserConsent(Boolean value) {
        this.userConsent = value;
    }

    /**
     * Gets the value of the bidCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidCount() {
        return bidCount;
    }

    /**
     * Sets the value of the bidCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidCount(Integer value) {
        this.bidCount = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the bestOfferID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestOfferID() {
        return bestOfferID;
    }

    /**
     * Sets the value of the bestOfferID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestOfferID(String value) {
        this.bestOfferID = value;
    }

    /**
     * Gets the value of the myMaxBid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMyMaxBid() {
        return myMaxBid;
    }

    /**
     * Sets the value of the myMaxBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMyMaxBid(AmountType value) {
        this.myMaxBid = value;
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
