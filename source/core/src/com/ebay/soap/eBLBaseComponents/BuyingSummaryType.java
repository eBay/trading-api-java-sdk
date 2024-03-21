
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>BuyingSummary</b> container returned in
 * 				<b>GetMyeBayBuying</b>. The <b>BuyingSummary</b> container
 * 				consists of data that summarizes the buyer's recent buying activity, including the
 * 				number of items the user has bid on, the number of items the user is winning, and the number of items
 * 				the user has won. The <b>BuyingSummary</b> container is only returned if
 * 				the <b>BuyingSummary.Include</b> field is included in the <b>GetMyeBayBuying</b> request and set to
 * 				<code>true</code>.
 * 			
 * 
 * <p>Java class for BuyingSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyingSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BiddingCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WinningCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalWinningCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="WonCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalWonCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="WonDurationInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BestOfferCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyingSummaryType", propOrder = {
    "biddingCount",
    "winningCount",
    "totalWinningCost",
    "wonCount",
    "totalWonCost",
    "wonDurationInDays",
    "bestOfferCount"
})
public class BuyingSummaryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BiddingCount")
    protected Integer biddingCount;
    @XmlElement(name = "WinningCount")
    protected Integer winningCount;
    @XmlElement(name = "TotalWinningCost")
    protected AmountType totalWinningCost;
    @XmlElement(name = "WonCount")
    protected Integer wonCount;
    @XmlElement(name = "TotalWonCost")
    protected AmountType totalWonCost;
    @XmlElement(name = "WonDurationInDays")
    protected Integer wonDurationInDays;
    @XmlElement(name = "BestOfferCount")
    protected Integer bestOfferCount;

    /**
     * Gets the value of the biddingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBiddingCount() {
        return biddingCount;
    }

    /**
     * Sets the value of the biddingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBiddingCount(Integer value) {
        this.biddingCount = value;
    }

    /**
     * Gets the value of the winningCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWinningCount() {
        return winningCount;
    }

    /**
     * Sets the value of the winningCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWinningCount(Integer value) {
        this.winningCount = value;
    }

    /**
     * Gets the value of the totalWinningCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalWinningCost() {
        return totalWinningCost;
    }

    /**
     * Sets the value of the totalWinningCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalWinningCost(AmountType value) {
        this.totalWinningCost = value;
    }

    /**
     * Gets the value of the wonCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWonCount() {
        return wonCount;
    }

    /**
     * Sets the value of the wonCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWonCount(Integer value) {
        this.wonCount = value;
    }

    /**
     * Gets the value of the totalWonCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalWonCost() {
        return totalWonCost;
    }

    /**
     * Sets the value of the totalWonCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalWonCost(AmountType value) {
        this.totalWonCost = value;
    }

    /**
     * Gets the value of the wonDurationInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWonDurationInDays() {
        return wonDurationInDays;
    }

    /**
     * Sets the value of the wonDurationInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWonDurationInDays(Integer value) {
        this.wonDurationInDays = value;
    }

    /**
     * Gets the value of the bestOfferCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBestOfferCount() {
        return bestOfferCount;
    }

    /**
     * Sets the value of the bestOfferCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBestOfferCount(Integer value) {
        this.bestOfferCount = value;
    }

}
