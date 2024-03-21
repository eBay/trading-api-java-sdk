
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
 * 				Type used by the <b>BiddingSummary</b> container, which is returned in the <b>GetAllBidders</b> response if the <b>IncludeBiddingSummary</b> boolean field is included and set to <code>true</code> in the call request. The <b>BiddingSummary</b> container consists of bidding history information for a specific bidder (specified in the <b>User.UserID</b> field).
 * 			
 * 
 * <p>Java class for BiddingSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddingSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SummaryDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalBids" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BidActivityWithSeller" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BidsToUniqueSellers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BidsToUniqueCategories" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BidRetractions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemBidDetails" type="{urn:ebay:apis:eBLBaseComponents}ItemBidDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BiddingSummaryType", propOrder = {
    "summaryDays",
    "totalBids",
    "bidActivityWithSeller",
    "bidsToUniqueSellers",
    "bidsToUniqueCategories",
    "bidRetractions",
    "itemBidDetails",
    "any"
})
public class BiddingSummaryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SummaryDays")
    protected Integer summaryDays;
    @XmlElement(name = "TotalBids")
    protected Integer totalBids;
    @XmlElement(name = "BidActivityWithSeller")
    protected Integer bidActivityWithSeller;
    @XmlElement(name = "BidsToUniqueSellers")
    protected Integer bidsToUniqueSellers;
    @XmlElement(name = "BidsToUniqueCategories")
    protected Integer bidsToUniqueCategories;
    @XmlElement(name = "BidRetractions")
    protected Integer bidRetractions;
    @XmlElement(name = "ItemBidDetails")
    protected List<ItemBidDetailsType> itemBidDetails;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the summaryDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSummaryDays() {
        return summaryDays;
    }

    /**
     * Sets the value of the summaryDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSummaryDays(Integer value) {
        this.summaryDays = value;
    }

    /**
     * Gets the value of the totalBids property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalBids() {
        return totalBids;
    }

    /**
     * Sets the value of the totalBids property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalBids(Integer value) {
        this.totalBids = value;
    }

    /**
     * Gets the value of the bidActivityWithSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidActivityWithSeller() {
        return bidActivityWithSeller;
    }

    /**
     * Sets the value of the bidActivityWithSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidActivityWithSeller(Integer value) {
        this.bidActivityWithSeller = value;
    }

    /**
     * Gets the value of the bidsToUniqueSellers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidsToUniqueSellers() {
        return bidsToUniqueSellers;
    }

    /**
     * Sets the value of the bidsToUniqueSellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidsToUniqueSellers(Integer value) {
        this.bidsToUniqueSellers = value;
    }

    /**
     * Gets the value of the bidsToUniqueCategories property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidsToUniqueCategories() {
        return bidsToUniqueCategories;
    }

    /**
     * Sets the value of the bidsToUniqueCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidsToUniqueCategories(Integer value) {
        this.bidsToUniqueCategories = value;
    }

    /**
     * Gets the value of the bidRetractions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidRetractions() {
        return bidRetractions;
    }

    /**
     * Sets the value of the bidRetractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidRetractions(Integer value) {
        this.bidRetractions = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ItemBidDetailsType }
     *     
     */
    public ItemBidDetailsType[] getItemBidDetails() {
        if (this.itemBidDetails == null) {
            return new ItemBidDetailsType[ 0 ] ;
        }
        return ((ItemBidDetailsType[]) this.itemBidDetails.toArray(new ItemBidDetailsType[this.itemBidDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ItemBidDetailsType }
     *     
     */
    public ItemBidDetailsType getItemBidDetails(int idx) {
        if (this.itemBidDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.itemBidDetails.get(idx);
    }

    public int getItemBidDetailsLength() {
        if (this.itemBidDetails == null) {
            return  0;
        }
        return this.itemBidDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ItemBidDetailsType }
     *     
     */
    public void setItemBidDetails(ItemBidDetailsType[] values) {
        this._getItemBidDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.itemBidDetails.add(values[i]);
        }
    }

    protected List<ItemBidDetailsType> _getItemBidDetails() {
        if (itemBidDetails == null) {
            itemBidDetails = new ArrayList<ItemBidDetailsType>();
        }
        return itemBidDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ItemBidDetailsType }
     *     
     */
    public ItemBidDetailsType setItemBidDetails(int idx, ItemBidDetailsType value) {
        return this.itemBidDetails.set(idx, value);
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
