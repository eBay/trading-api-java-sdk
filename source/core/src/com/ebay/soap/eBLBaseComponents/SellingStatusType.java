
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
 * 				Contains various details about the current status of a listing. These
 * 				values are computed by eBay and cannot be specified at listing time.
 * 			
 * 
 * <p>Java class for SellingStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BidIncrement" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertedCurrentPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="HighBidder" type="{urn:ebay:apis:eBLBaseComponents}UserType" minOccurs="0"/>
 *         &lt;element name="LeadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumToBid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReserveMet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SecondChanceEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BidderCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ListingStatus" type="{urn:ebay:apis:eBLBaseComponents}ListingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="FinalValueFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PromotionalSaleDetails" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleDetailsType" minOccurs="0"/>
 *         &lt;element name="AdminEnded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SoldAsBin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QuantitySoldByPickupInStore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuggestedBidValues" type="{urn:ebay:apis:eBLBaseComponents}SuggestedBidValueType" minOccurs="0"/>
 *         &lt;element name="ListingOnHold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "SellingStatusType", propOrder = {
    "bidCount",
    "bidIncrement",
    "convertedCurrentPrice",
    "currentPrice",
    "highBidder",
    "leadCount",
    "minimumToBid",
    "quantitySold",
    "reserveMet",
    "secondChanceEligible",
    "bidderCount",
    "listingStatus",
    "finalValueFee",
    "promotionalSaleDetails",
    "adminEnded",
    "soldAsBin",
    "quantitySoldByPickupInStore",
    "suggestedBidValues",
    "listingOnHold",
    "any"
})
public class SellingStatusType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BidCount")
    protected Integer bidCount;
    @XmlElement(name = "BidIncrement")
    protected AmountType bidIncrement;
    @XmlElement(name = "ConvertedCurrentPrice")
    protected AmountType convertedCurrentPrice;
    @XmlElement(name = "CurrentPrice")
    protected AmountType currentPrice;
    @XmlElement(name = "HighBidder")
    protected UserType highBidder;
    @XmlElement(name = "LeadCount")
    protected Integer leadCount;
    @XmlElement(name = "MinimumToBid")
    protected AmountType minimumToBid;
    @XmlElement(name = "QuantitySold")
    protected Integer quantitySold;
    @XmlElement(name = "ReserveMet")
    protected Boolean reserveMet;
    @XmlElement(name = "SecondChanceEligible")
    protected Boolean secondChanceEligible;
    @XmlElement(name = "BidderCount")
    protected Long bidderCount;
    @XmlElement(name = "ListingStatus")
    protected ListingStatusCodeType listingStatus;
    @XmlElement(name = "FinalValueFee")
    protected AmountType finalValueFee;
    @XmlElement(name = "PromotionalSaleDetails")
    protected PromotionalSaleDetailsType promotionalSaleDetails;
    @XmlElement(name = "AdminEnded")
    protected Boolean adminEnded;
    @XmlElement(name = "SoldAsBin")
    protected Boolean soldAsBin;
    @XmlElement(name = "QuantitySoldByPickupInStore")
    protected Integer quantitySoldByPickupInStore;
    @XmlElement(name = "SuggestedBidValues")
    protected SuggestedBidValueType suggestedBidValues;
    @XmlElement(name = "ListingOnHold")
    protected Boolean listingOnHold;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the bidIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBidIncrement() {
        return bidIncrement;
    }

    /**
     * Sets the value of the bidIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBidIncrement(AmountType value) {
        this.bidIncrement = value;
    }

    /**
     * Gets the value of the convertedCurrentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedCurrentPrice() {
        return convertedCurrentPrice;
    }

    /**
     * Sets the value of the convertedCurrentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedCurrentPrice(AmountType value) {
        this.convertedCurrentPrice = value;
    }

    /**
     * Gets the value of the currentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Sets the value of the currentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentPrice(AmountType value) {
        this.currentPrice = value;
    }

    /**
     * Gets the value of the highBidder property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getHighBidder() {
        return highBidder;
    }

    /**
     * Sets the value of the highBidder property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setHighBidder(UserType value) {
        this.highBidder = value;
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
     * Gets the value of the minimumToBid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumToBid() {
        return minimumToBid;
    }

    /**
     * Sets the value of the minimumToBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumToBid(AmountType value) {
        this.minimumToBid = value;
    }

    /**
     * Gets the value of the quantitySold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySold() {
        return quantitySold;
    }

    /**
     * Sets the value of the quantitySold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySold(Integer value) {
        this.quantitySold = value;
    }

    /**
     * Gets the value of the reserveMet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReserveMet() {
        return reserveMet;
    }

    /**
     * Sets the value of the reserveMet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReserveMet(Boolean value) {
        this.reserveMet = value;
    }

    /**
     * Gets the value of the secondChanceEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecondChanceEligible() {
        return secondChanceEligible;
    }

    /**
     * Sets the value of the secondChanceEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecondChanceEligible(Boolean value) {
        this.secondChanceEligible = value;
    }

    /**
     * Gets the value of the bidderCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBidderCount() {
        return bidderCount;
    }

    /**
     * Sets the value of the bidderCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBidderCount(Long value) {
        this.bidderCount = value;
    }

    /**
     * Gets the value of the listingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ListingStatusCodeType }
     *     
     */
    public ListingStatusCodeType getListingStatus() {
        return listingStatus;
    }

    /**
     * Sets the value of the listingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingStatusCodeType }
     *     
     */
    public void setListingStatus(ListingStatusCodeType value) {
        this.listingStatus = value;
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
     * Gets the value of the promotionalSaleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalSaleDetailsType }
     *     
     */
    public PromotionalSaleDetailsType getPromotionalSaleDetails() {
        return promotionalSaleDetails;
    }

    /**
     * Sets the value of the promotionalSaleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleDetailsType }
     *     
     */
    public void setPromotionalSaleDetails(PromotionalSaleDetailsType value) {
        this.promotionalSaleDetails = value;
    }

    /**
     * Gets the value of the adminEnded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdminEnded() {
        return adminEnded;
    }

    /**
     * Sets the value of the adminEnded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdminEnded(Boolean value) {
        this.adminEnded = value;
    }

    /**
     * Gets the value of the soldAsBin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldAsBin() {
        return soldAsBin;
    }

    /**
     * Sets the value of the soldAsBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldAsBin(Boolean value) {
        this.soldAsBin = value;
    }

    /**
     * Gets the value of the quantitySoldByPickupInStore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySoldByPickupInStore() {
        return quantitySoldByPickupInStore;
    }

    /**
     * Sets the value of the quantitySoldByPickupInStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySoldByPickupInStore(Integer value) {
        this.quantitySoldByPickupInStore = value;
    }

    /**
     * Gets the value of the suggestedBidValues property.
     * 
     * @return
     *     possible object is
     *     {@link SuggestedBidValueType }
     *     
     */
    public SuggestedBidValueType getSuggestedBidValues() {
        return suggestedBidValues;
    }

    /**
     * Sets the value of the suggestedBidValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestedBidValueType }
     *     
     */
    public void setSuggestedBidValues(SuggestedBidValueType value) {
        this.suggestedBidValues = value;
    }

    /**
     * Gets the value of the listingOnHold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListingOnHold() {
        return listingOnHold;
    }

    /**
     * Sets the value of the listingOnHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListingOnHold(Boolean value) {
        this.listingOnHold = value;
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
