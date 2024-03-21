
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
 * 			Container for individual message information.
 * 		
 * 
 * <p>Java class for MemberMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageType" type="{urn:ebay:apis:eBLBaseComponents}MessageTypeCodeType" minOccurs="0"/>
 *         &lt;element name="QuestionType" type="{urn:ebay:apis:eBLBaseComponents}QuestionTypeCodeType" minOccurs="0"/>
 *         &lt;element name="EmailCopyToSender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideSendersEmailAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayToPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentMessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "MemberMessageType", propOrder = {
    "messageType",
    "questionType",
    "emailCopyToSender",
    "hideSendersEmailAddress",
    "displayToPublic",
    "senderID",
    "senderEmail",
    "recipientID",
    "subject",
    "body",
    "messageID",
    "parentMessageID",
    "messageMedia",
    "any"
})
public class MemberMessageType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MessageType")
    protected MessageTypeCodeType messageType;
    @XmlElement(name = "QuestionType")
    protected QuestionTypeCodeType questionType;
    @XmlElement(name = "EmailCopyToSender")
    protected Boolean emailCopyToSender;
    @XmlElement(name = "HideSendersEmailAddress")
    protected Boolean hideSendersEmailAddress;
    @XmlElement(name = "DisplayToPublic")
    protected Boolean displayToPublic;
    @XmlElement(name = "SenderID")
    protected String senderID;
    @XmlElement(name = "SenderEmail")
    protected String senderEmail;
    @XmlElement(name = "RecipientID")
    protected List<String> recipientID;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Body")
    protected String body;
    @XmlElement(name = "MessageID")
    protected String messageID;
    @XmlElement(name = "ParentMessageID")
    protected String parentMessageID;
    @XmlElement(name = "MessageMedia")
    protected List<MessageMediaType> messageMedia;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the emailCopyToSender property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailCopyToSender() {
        return emailCopyToSender;
    }

    /**
     * Sets the value of the emailCopyToSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailCopyToSender(Boolean value) {
        this.emailCopyToSender = value;
    }

    /**
     * Gets the value of the hideSendersEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideSendersEmailAddress() {
        return hideSendersEmailAddress;
    }

    /**
     * Sets the value of the hideSendersEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideSendersEmailAddress(Boolean value) {
        this.hideSendersEmailAddress = value;
    }

    /**
     * Gets the value of the displayToPublic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayToPublic() {
        return displayToPublic;
    }

    /**
     * Sets the value of the displayToPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayToPublic(Boolean value) {
        this.displayToPublic = value;
    }

    /**
     * Gets the value of the senderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderID(String value) {
        this.senderID = value;
    }

    /**
     * Gets the value of the senderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEmail() {
        return senderEmail;
    }

    /**
     * Sets the value of the senderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEmail(String value) {
        this.senderEmail = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getRecipientID() {
        if (this.recipientID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.recipientID.toArray(new String[this.recipientID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getRecipientID(int idx) {
        if (this.recipientID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.recipientID.get(idx);
    }

    public int getRecipientIDLength() {
        if (this.recipientID == null) {
            return  0;
        }
        return this.recipientID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setRecipientID(String[] values) {
        this._getRecipientID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.recipientID.add(values[i]);
        }
    }

    protected List<String> _getRecipientID() {
        if (recipientID == null) {
            recipientID = new ArrayList<String>();
        }
        return recipientID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setRecipientID(int idx, String value) {
        return this.recipientID.set(idx, value);
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
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
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
     * Gets the value of the parentMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMessageID() {
        return parentMessageID;
    }

    /**
     * Sets the value of the parentMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMessageID(String value) {
        this.parentMessageID = value;
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
