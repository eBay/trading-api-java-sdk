
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>AddMemberMessagesAAQToBidderRequestContainer</b> container. An <b>AddMemberMessagesAAQToBidderRequestContainer</b> container is required for each bidder the seller is sending a message to. The seller can communicate with up to 10 bidders with one <b>AddMemberMessagesAAQToBidder</b> call.
 * 			
 * 
 * <p>Java class for AddMemberMessagesAAQToBidderRequestContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMemberMessagesAAQToBidderRequestContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemberMessage" type="{urn:ebay:apis:eBLBaseComponents}MemberMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMemberMessagesAAQToBidderRequestContainerType", propOrder = {
    "correlationID",
    "itemID",
    "memberMessage"
})
public class AddMemberMessagesAAQToBidderRequestContainerType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "MemberMessage")
    protected MemberMessageType memberMessage;

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
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
     * Gets the value of the memberMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MemberMessageType }
     *     
     */
    public MemberMessageType getMemberMessage() {
        return memberMessage;
    }

    /**
     * Sets the value of the memberMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberMessageType }
     *     
     */
    public void setMemberMessage(MemberMessageType value) {
        this.memberMessage = value;
    }

}
