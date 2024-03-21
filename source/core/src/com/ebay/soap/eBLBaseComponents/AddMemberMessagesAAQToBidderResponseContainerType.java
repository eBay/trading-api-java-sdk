
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>AddMemberMessagesAAQToBidderResponseContainer</b> container. A <b>AddMemberMessagesAAQToBidderResponseContainer</b> container is returned for each message that was sent from the seller to the bidders/potential buyers through a separate <b>AddMemberMessagesAAQToBidderRequestContainer</b>. The <b>Ack</b> value in each <b>AddMemberMessagesAAQToBidderResponseContainer</b>  container indicates whether or not each message sent through the call was successful or not, and an <b>AddMemberMessagesAAQToBidderResponseContainer</b> is matched up to the corresponding <b>AddMemberMessagesAAQToBidderRequestContainer</b> through the <b>CorrelationID</b> value.
 * 			
 * 
 * <p>Java class for AddMemberMessagesAAQToBidderResponseContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddMemberMessagesAAQToBidderResponseContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ack" type="{urn:ebay:apis:eBLBaseComponents}AckCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMemberMessagesAAQToBidderResponseContainerType", propOrder = {
    "correlationID",
    "ack"
})
public class AddMemberMessagesAAQToBidderResponseContainerType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "Ack")
    protected AckCodeType ack;

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
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link AckCodeType }
     *     
     */
    public AckCodeType getAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link AckCodeType }
     *     
     */
    public void setAck(AckCodeType value) {
        this.ack = value;
    }

}
