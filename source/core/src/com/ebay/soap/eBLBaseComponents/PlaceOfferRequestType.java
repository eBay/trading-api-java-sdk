
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables the authenticated user to to make a bid on an auction item, propose a Best Offer, or purchase a fixed-price/Buy It Now item. Note that this call cannot be used to purchase items that require immediate payment.
 * 			
 * 
 * <p>Java class for PlaceOfferRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceOfferRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Offer" type="{urn:ebay:apis:eBLBaseComponents}OfferType" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="BlockOnWarning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AffiliateTrackingDetails" type="{urn:ebay:apis:eBLBaseComponents}AffiliateTrackingDetailsType" minOccurs="0"/>
 *         &lt;element name="VariationSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOfferRequestType", propOrder = {
    "offer",
    "itemID",
    "blockOnWarning",
    "affiliateTrackingDetails",
    "variationSpecifics"
})
public class PlaceOfferRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Offer")
    protected OfferType offer;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "BlockOnWarning")
    protected Boolean blockOnWarning;
    @XmlElement(name = "AffiliateTrackingDetails")
    protected AffiliateTrackingDetailsType affiliateTrackingDetails;
    @XmlElement(name = "VariationSpecifics")
    protected NameValueListArrayType variationSpecifics;

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setOffer(OfferType value) {
        this.offer = value;
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
     * Gets the value of the blockOnWarning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockOnWarning() {
        return blockOnWarning;
    }

    /**
     * Sets the value of the blockOnWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockOnWarning(Boolean value) {
        this.blockOnWarning = value;
    }

    /**
     * Gets the value of the affiliateTrackingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliateTrackingDetailsType }
     *     
     */
    public AffiliateTrackingDetailsType getAffiliateTrackingDetails() {
        return affiliateTrackingDetails;
    }

    /**
     * Sets the value of the affiliateTrackingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliateTrackingDetailsType }
     *     
     */
    public void setAffiliateTrackingDetails(AffiliateTrackingDetailsType value) {
        this.affiliateTrackingDetails = value;
    }

    /**
     * Gets the value of the variationSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getVariationSpecifics() {
        return variationSpecifics;
    }

    /**
     * Sets the value of the variationSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setVariationSpecifics(NameValueListArrayType value) {
        this.variationSpecifics = value;
    }

}
