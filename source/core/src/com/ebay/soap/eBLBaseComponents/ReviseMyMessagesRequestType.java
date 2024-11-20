
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This call can be used to mark one or more messages as 'Read', to flag one or more messages, and/or to move one or more messages to another My Messages folder. Any of these actions can be applied on up to 10 messages with one call.
 * 			
 * 
 * <p>Java class for ReviseMyMessagesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseMyMessagesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="MessageIDs" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesMessageIDArrayType" minOccurs="0"/>
 *         &lt;element name="Read" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Flagged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseMyMessagesRequestType", propOrder = {
    "messageIDs",
    "read",
    "flagged",
    "folderID"
})
public class ReviseMyMessagesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MessageIDs")
    protected MyMessagesMessageIDArrayType messageIDs;
    @XmlElement(name = "Read")
    protected Boolean read;
    @XmlElement(name = "Flagged")
    protected Boolean flagged;
    @XmlElement(name = "FolderID")
    protected Long folderID;

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

    /**
     * Gets the value of the read property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRead(Boolean value) {
        this.read = value;
    }

    /**
     * Gets the value of the flagged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlagged() {
        return flagged;
    }

    /**
     * Sets the value of the flagged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlagged(Boolean value) {
        this.flagged = value;
    }

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderID(Long value) {
        this.folderID = value;
    }

}
