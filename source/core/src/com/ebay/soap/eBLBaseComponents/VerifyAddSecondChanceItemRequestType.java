
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Simulates the creation of a new Second Chance Offer
 * 				listing of an item without actually creating a listing.
 * 			
 * 
 * <p>Java class for VerifyAddSecondChanceItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyAddSecondChanceItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="RecipientBidderUserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="BuyItNowPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Duration" type="{urn:ebay:apis:eBLBaseComponents}SecondChanceOfferDurationCodeType" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="SellerMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyAddSecondChanceItemRequestType", propOrder = {
    "recipientBidderUserID",
    "buyItNowPrice",
    "duration",
    "itemID",
    "sellerMessage"
})
public class VerifyAddSecondChanceItemRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RecipientBidderUserID")
    protected String recipientBidderUserID;
    @XmlElement(name = "BuyItNowPrice")
    protected AmountType buyItNowPrice;
    @XmlElement(name = "Duration")
    protected SecondChanceOfferDurationCodeType duration;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "SellerMessage")
    protected String sellerMessage;

    /**
     * Gets the value of the recipientBidderUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientBidderUserID() {
        return recipientBidderUserID;
    }

    /**
     * Sets the value of the recipientBidderUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientBidderUserID(String value) {
        this.recipientBidderUserID = value;
    }

    /**
     * Gets the value of the buyItNowPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBuyItNowPrice() {
        return buyItNowPrice;
    }

    /**
     * Sets the value of the buyItNowPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBuyItNowPrice(AmountType value) {
        this.buyItNowPrice = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link SecondChanceOfferDurationCodeType }
     *     
     */
    public SecondChanceOfferDurationCodeType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondChanceOfferDurationCodeType }
     *     
     */
    public void setDuration(SecondChanceOfferDurationCodeType value) {
        this.duration = value;
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
     * Gets the value of the sellerMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerMessage() {
        return sellerMessage;
    }

    /**
     * Sets the value of the sellerMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerMessage(String value) {
        this.sellerMessage = value;
    }

}
