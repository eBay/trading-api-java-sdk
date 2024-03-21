
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains summary information about the items the seller is selling.
 * 			
 * 
 * <p>Java class for SellingSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellingSummaryType">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingSummaryType", propOrder = {
    "activeAuctionCount",
    "auctionSellingCount",
    "auctionBidCount",
    "totalAuctionSellingValue",
    "totalSoldCount",
    "totalSoldValue",
    "soldDurationInDays"
})
public class SellingSummaryType
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

}
