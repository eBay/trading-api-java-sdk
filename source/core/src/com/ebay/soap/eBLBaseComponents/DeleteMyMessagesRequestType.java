
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Removes selected messages for a given user.
 * 				
 * 
 * <p>Java class for DeleteMyMessagesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteMyMessagesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="MessageIDs" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesMessageIDArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteMyMessagesRequestType", propOrder = {
    "messageIDs"
})
public class DeleteMyMessagesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MessageIDs")
    protected MyMessagesMessageIDArrayType messageIDs;

    /**
     * Gets the value of the messageIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesMessageIDArrayType }
     *     
     */
    public MyMessagesMessageIDArrayType getMessageIDs() {
        return messageIDs;
    }

    /**
     * Sets the value of the messageIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesMessageIDArrayType }
     *     
     */
    public void setMessageIDs(MyMessagesMessageIDArrayType value) {
        this.messageIDs = value;
    }

}
