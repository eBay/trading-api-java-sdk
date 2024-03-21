
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
 * 				Contains summary information about the items the seller is selling.
 * 			
 * 
 * <p>Java class for MyeBaySellingSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyeBaySellingSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActiveAuctionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AuctionSellingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AuctionBidCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalAuctionSellingValue" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalSoldCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalSoldValue" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="SoldDurationInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalLeadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdOfferCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalListingsWithLeads" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantityLimitRemaining" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AmountLimitRemaining" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
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
@XmlType(name = "MyeBaySellingSummaryType", propOrder = {
    "activeAuctionCount",
    "auctionSellingCount",
    "auctionBidCount",
    "totalAuctionSellingValue",
    "totalSoldCount",
    "totalSoldValue",
    "soldDurationInDays",
    "classifiedAdCount",
    "totalLeadCount",
    "classifiedAdOfferCount",
    "totalListingsWithLeads",
    "quantityLimitRemaining",
    "amountLimitRemaining",
    "any"
})
public class MyeBaySellingSummaryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ActiveAuctionCount")
    protected Integer activeAuctionCount;
    @XmlElement(name = "AuctionSellingCount")
    protected Integer auctionSellingCount;
    @XmlElement(name = "AuctionBidCount")
    protected Integer auctionBidCount;
    @XmlElement(name = "TotalAuctionSellingValue")
    protected AmountType totalAuctionSellingValue;
    @XmlElement(name = "TotalSoldCount")
    protected Integer totalSoldCount;
    @XmlElement(name = "TotalSoldValue")
    protected AmountType totalSoldValue;
    @XmlElement(name = "SoldDurationInDays")
    protected Integer soldDurationInDays;
    @XmlElement(name = "ClassifiedAdCount")
    protected Integer classifiedAdCount;
    @XmlElement(name = "TotalLeadCount")
    protected Integer totalLeadCount;
    @XmlElement(name = "ClassifiedAdOfferCount")
    protected Integer classifiedAdOfferCount;
    @XmlElement(name = "TotalListingsWithLeads")
    protected Integer totalListingsWithLeads;
    @XmlElement(name = "QuantityLimitRemaining")
    protected Long quantityLimitRemaining;
    @XmlElement(name = "AmountLimitRemaining")
    protected AmountType amountLimitRemaining;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the activeAuctionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActiveAuctionCount() {
        return activeAuctionCount;
    }

    /**
     * Sets the value of the activeAuctionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActiveAuctionCount(Integer value) {
        this.activeAuctionCount = value;
    }

    /**
     * Gets the value of the auctionSellingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuctionSellingCount() {
        return auctionSellingCount;
    }

    /**
     * Sets the value of the auctionSellingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuctionSellingCount(Integer value) {
        this.auctionSellingCount = value;
    }

    /**
     * Gets the value of the auctionBidCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuctionBidCount() {
        return auctionBidCount;
    }

    /**
     * Sets the value of the auctionBidCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuctionBidCount(Integer value) {
        this.auctionBidCount = value;
    }

    /**
     * Gets the value of the totalAuctionSellingValue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAuctionSellingValue() {
        return totalAuctionSellingValue;
    }

    /**
     * Sets the value of the totalAuctionSellingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAuctionSellingValue(AmountType value) {
        this.totalAuctionSellingValue = value;
    }

    /**
     * Gets the value of the totalSoldCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalSoldCount() {
        return totalSoldCount;
    }

    /**
     * Sets the value of the totalSoldCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalSoldCount(Integer value) {
        this.totalSoldCount = value;
    }

    /**
     * Gets the value of the totalSoldValue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalSoldValue() {
        return totalSoldValue;
    }

    /**
     * Sets the value of the totalSoldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalSoldValue(AmountType value) {
        this.totalSoldValue = value;
    }

    /**
     * Gets the value of the soldDurationInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSoldDurationInDays() {
        return soldDurationInDays;
    }

    /**
     * Sets the value of the soldDurationInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSoldDurationInDays(Integer value) {
        this.soldDurationInDays = value;
    }

    /**
     * Gets the value of the classifiedAdCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassifiedAdCount() {
        return classifiedAdCount;
    }

    /**
     * Sets the value of the classifiedAdCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassifiedAdCount(Integer value) {
        this.classifiedAdCount = value;
    }

    /**
     * Gets the value of the totalLeadCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalLeadCount() {
        return totalLeadCount;
    }

    /**
     * Sets the value of the totalLeadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalLeadCount(Integer value) {
        this.totalLeadCount = value;
    }

    /**
     * Gets the value of the classifiedAdOfferCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassifiedAdOfferCount() {
        return classifiedAdOfferCount;
    }

    /**
     * Sets the value of the classifiedAdOfferCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassifiedAdOfferCount(Integer value) {
        this.classifiedAdOfferCount = value;
    }

    /**
     * Gets the value of the totalListingsWithLeads property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalListingsWithLeads() {
        return totalListingsWithLeads;
    }

    /**
     * Sets the value of the totalListingsWithLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalListingsWithLeads(Integer value) {
        this.totalListingsWithLeads = value;
    }

    /**
     * Gets the value of the quantityLimitRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantityLimitRemaining() {
        return quantityLimitRemaining;
    }

    /**
     * Sets the value of the quantityLimitRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantityLimitRemaining(Long value) {
        this.quantityLimitRemaining = value;
    }

    /**
     * Gets the value of the amountLimitRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountLimitRemaining() {
        return amountLimitRemaining;
    }

    /**
     * Sets the value of the amountLimitRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountLimitRemaining(AmountType value) {
        this.amountLimitRemaining = value;
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
