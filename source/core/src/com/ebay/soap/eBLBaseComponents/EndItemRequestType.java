
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Ends the specified item listing before the date and time at which it would normally end per the listing duration.
 * 			
 * 
 * <p>Java class for EndItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="EndingReason" type="{urn:ebay:apis:eBLBaseComponents}EndReasonCodeType" minOccurs="0"/>
 *         &lt;element name="SellerInventoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndItemRequestType", propOrder = {
    "itemID",
    "endingReason",
    "sellerInventoryID"
})
public class EndItemRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "EndingReason")
    protected EndReasonCodeType endingReason;
    @XmlElement(name = "SellerInventoryID")
    protected String sellerInventoryID;

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
     * Gets the value of the endingReason property.
     * 
     * @return
     *     possible object is
     *     {@link EndReasonCodeType }
     *     
     */
    public EndReasonCodeType getEndingReason() {
        return endingReason;
    }

    /**
     * Sets the value of the endingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndReasonCodeType }
     *     
     */
    public void setEndingReason(EndReasonCodeType value) {
        this.endingReason = value;
    }

    /**
     * Gets the value of the sellerInventoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerInventoryID() {
        return sellerInventoryID;
    }

    /**
     * Sets the value of the sellerInventoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerInventoryID(String value) {
        this.sellerInventoryID = value;
    }

}
