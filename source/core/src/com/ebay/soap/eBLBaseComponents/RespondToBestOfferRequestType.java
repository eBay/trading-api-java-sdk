
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This call enables the seller to accept or decline a buyer's Best Offer on an item, or make a counter offer to the buyer's Best Offer. A seller can decline multiple Best Offers with one call, but the seller cannot accept or counter offer multiple Best Offers with one call. Best Offers are not applicable to auction listings.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note: </b>
 * 				Historically, the Best Offer feature has not been available for auction listings, but beginning with Version 1027, sellers in the US, UK, and DE sites are able to offer the Best Offer feature in auction listings. The seller can offer Buy It Now or Best Offer in an auction listing, but not both.
 * 				</span>
 * 			
 * 
 * <p>Java class for RespondToBestOfferRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespondToBestOfferRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="BestOfferID" type="{urn:ebay:apis:eBLBaseComponents}BestOfferIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Action" type="{urn:ebay:apis:eBLBaseComponents}BestOfferActionCodeType" minOccurs="0"/>
 *         &lt;element name="SellerResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterOfferPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CounterOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondToBestOfferRequestType", propOrder = {
    "itemID",
    "bestOfferID",
    "action",
    "sellerResponse",
    "counterOfferPrice",
    "counterOfferQuantity"
})
public class RespondToBestOfferRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "BestOfferID")
    protected List<String> bestOfferID;
    @XmlElement(name = "Action")
    protected BestOfferActionCodeType action;
    @XmlElement(name = "SellerResponse")
    protected String sellerResponse;
    @XmlElement(name = "CounterOfferPrice")
    protected AmountType counterOfferPrice;
    @XmlElement(name = "CounterOfferQuantity")
    protected Integer counterOfferQuantity;

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
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getBestOfferID() {
        if (this.bestOfferID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.bestOfferID.toArray(new String[this.bestOfferID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getBestOfferID(int idx) {
        if (this.bestOfferID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.bestOfferID.get(idx);
    }

    public int getBestOfferIDLength() {
        if (this.bestOfferID == null) {
            return  0;
        }
        return this.bestOfferID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setBestOfferID(String[] values) {
        this._getBestOfferID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.bestOfferID.add(values[i]);
        }
    }

    protected List<String> _getBestOfferID() {
        if (bestOfferID == null) {
            bestOfferID = new ArrayList<String>();
        }
        return bestOfferID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setBestOfferID(int idx, String value) {
        return this.bestOfferID.set(idx, value);
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferActionCodeType }
     *     
     */
    public BestOfferActionCodeType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferActionCodeType }
     *     
     */
    public void setAction(BestOfferActionCodeType value) {
        this.action = value;
    }

    /**
     * Gets the value of the sellerResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerResponse() {
        return sellerResponse;
    }

    /**
     * Sets the value of the sellerResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerResponse(String value) {
        this.sellerResponse = value;
    }

    /**
     * Gets the value of the counterOfferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCounterOfferPrice() {
        return counterOfferPrice;
    }

    /**
     * Sets the value of the counterOfferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCounterOfferPrice(AmountType value) {
        this.counterOfferPrice = value;
    }

    /**
     * Gets the value of the counterOfferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCounterOfferQuantity() {
        return counterOfferQuantity;
    }

    /**
     * Sets the value of the counterOfferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCounterOfferQuantity(Integer value) {
        this.counterOfferQuantity = value;
    }

}
