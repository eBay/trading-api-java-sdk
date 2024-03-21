
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Container for the message information for each message specified in
 * 				MessageIDs. The amount and type of information returned varies based on
 * 				the requested detail level.
 * 			
 * 
 * <p>Java class for MyMessagesMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageID" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesMessageIDType" minOccurs="0"/>
 *         &lt;element name="ExternalMessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flagged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Read" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReceiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="ResponseDetails" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesResponseDetailsType" minOccurs="0"/>
 *         &lt;element name="Folder" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesFolderType" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageType" type="{urn:ebay:apis:eBLBaseComponents}MessageTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ListingStatus" type="{urn:ebay:apis:eBLBaseComponents}ListingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="QuestionType" type="{urn:ebay:apis:eBLBaseComponents}QuestionTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Replied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HighPriority" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ItemTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageMedia" type="{urn:ebay:apis:eBLBaseComponents}MessageMediaType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MyMessagesMessageType", propOrder = {
    "sender",
    "recipientUserID",
    "sendToName",
    "subject",
    "messageID",
    "externalMessageID",
    "text",
    "flagged",
    "read",
    "creationDate",
    "receiveDate",
    "expirationDate",
    "itemID",
    "responseDetails",
    "folder",
    "content",
    "messageType",
    "listingStatus",
    "questionType",
    "replied",
    "highPriority",
    "itemEndTime",
    "itemTitle",
    "messageMedia",
    "any"
})
public class MyMessagesMessageType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Sender")
    protected String sender;
    @XmlElement(name = "RecipientUserID")
    protected String recipientUserID;
    @XmlElement(name = "SendToName")
    protected String sendToName;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "MessageID")
    protected String messageID;
    @XmlElement(name = "ExternalMessageID")
    protected String externalMessageID;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Flagged")
    protected Boolean flagged;
    @XmlElement(name = "Read")
    protected Boolean read;
    @XmlElement(name = "CreationDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creationDate;
    @XmlElement(name = "ReceiveDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar receiveDate;
    @XmlElement(name = "ExpirationDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar expirationDate;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "ResponseDetails")
    protected MyMessagesResponseDetailsType responseDetails;
    @XmlElement(name = "Folder")
    protected MyMessagesFolderType folder;
    @XmlElement(name = "Content")
    protected String content;
    @XmlElement(name = "MessageType")
    protected MessageTypeCodeType messageType;
    @XmlElement(name = "ListingStatus")
    protected ListingStatusCodeType listingStatus;
    @XmlElement(name = "QuestionType")
    protected QuestionTypeCodeType questionType;
    @XmlElement(name = "Replied")
    protected Boolean replied;
    @XmlElement(name = "HighPriority")
    protected Boolean highPriority;
    @XmlElement(name = "ItemEndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar itemEndTime;
    @XmlElement(name = "ItemTitle")
    protected String itemTitle;
    @XmlElement(name = "MessageMedia")
    protected List<MessageMediaType> messageMedia;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the recipientUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientUserID() {
        return recipientUserID;
    }

    /**
     * Sets the value of the recipientUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientUserID(String value) {
        this.recipientUserID = value;
    }

    /**
     * Gets the value of the sendToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendToName() {
        return sendToName;
    }

    /**
     * Sets the value of the sendToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendToName(String value) {
        this.sendToName = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the externalMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalMessageID() {
        return externalMessageID;
    }

    /**
     * Sets the value of the externalMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalMessageID(String value) {
        this.externalMessageID = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(Calendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveDate(Calendar value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(Calendar value) {
        this.expirationDate = value;
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
     * Gets the value of the responseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesResponseDetailsType }
     *     
     */
    public MyMessagesResponseDetailsType getResponseDetails() {
        return responseDetails;
    }

    /**
     * Sets the value of the responseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesResponseDetailsType }
     *     
     */
    public void setResponseDetails(MyMessagesResponseDetailsType value) {
        this.responseDetails = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesFolderType }
     *     
     */
    public MyMessagesFolderType getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesFolderType }
     *     
     */
    public void setFolder(MyMessagesFolderType value) {
        this.folder = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageTypeCodeType }
     *     
     */
    public MessageTypeCodeType getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTypeCodeType }
     *     
     */
    public void setMessageType(MessageTypeCodeType value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the listingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ListingStatusCodeType }
     *     
     */
    public ListingStatusCodeType getListingStatus() {
        return listingStatus;
    }

    /**
     * Sets the value of the listingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingStatusCodeType }
     *     
     */
    public void setListingStatus(ListingStatusCodeType value) {
        this.listingStatus = value;
    }

    /**
     * Gets the value of the questionType property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionTypeCodeType }
     *     
     */
    public QuestionTypeCodeType getQuestionType() {
        return questionType;
    }

    /**
     * Sets the value of the questionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionTypeCodeType }
     *     
     */
    public void setQuestionType(QuestionTypeCodeType value) {
        this.questionType = value;
    }

    /**
     * Gets the value of the replied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplied() {
        return replied;
    }

    /**
     * Sets the value of the replied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplied(Boolean value) {
        this.replied = value;
    }

    /**
     * Gets the value of the highPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighPriority() {
        return highPriority;
    }

    /**
     * Sets the value of the highPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighPriority(Boolean value) {
        this.highPriority = value;
    }

    /**
     * Gets the value of the itemEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getItemEndTime() {
        return itemEndTime;
    }

    /**
     * Sets the value of the itemEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemEndTime(Calendar value) {
        this.itemEndTime = value;
    }

    /**
     * Gets the value of the itemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * Sets the value of the itemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link MessageMediaType }
     *     
     */
    public MessageMediaType[] getMessageMedia() {
        if (this.messageMedia == null) {
            return new MessageMediaType[ 0 ] ;
        }
        return ((MessageMediaType[]) this.messageMedia.toArray(new MessageMediaType[this.messageMedia.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MessageMediaType }
     *     
     */
    public MessageMediaType getMessageMedia(int idx) {
        if (this.messageMedia == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.messageMedia.get(idx);
    }

    public int getMessageMediaLength() {
        if (this.messageMedia == null) {
            return  0;
        }
        return this.messageMedia.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MessageMediaType }
     *     
     */
    public void setMessageMedia(MessageMediaType[] values) {
        this._getMessageMedia().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.messageMedia.add(values[i]);
        }
    }

    protected List<MessageMediaType> _getMessageMedia() {
        if (messageMedia == null) {
            messageMedia = new ArrayList<MessageMediaType>();
        }
        return messageMedia;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MessageMediaType }
     *     
     */
    public MessageMediaType setMessageMedia(int idx, MessageMediaType value) {
        return this.messageMedia.set(idx, value);
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
