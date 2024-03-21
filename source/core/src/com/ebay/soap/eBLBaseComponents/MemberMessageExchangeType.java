
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
 * 			Container for message metadata.
 * 		
 * 
 * <p>Java class for MemberMessageExchangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberMessageExchangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="Question" type="{urn:ebay:apis:eBLBaseComponents}MemberMessageType" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageStatus" type="{urn:ebay:apis:eBLBaseComponents}MessageStatusTypeCodeType" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "MemberMessageExchangeType", propOrder = {
    "item",
    "question",
    "response",
    "messageStatus",
    "creationDate",
    "lastModifiedDate",
    "messageMedia",
    "any"
})
public class MemberMessageExchangeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "Question")
    protected MemberMessageType question;
    @XmlElement(name = "Response")
    protected List<String> response;
    @XmlElement(name = "MessageStatus")
    protected MessageStatusTypeCodeType messageStatus;
    @XmlElement(name = "CreationDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar creationDate;
    @XmlElement(name = "LastModifiedDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModifiedDate;
    @XmlElement(name = "MessageMedia")
    protected List<MessageMediaType> messageMedia;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link MemberMessageType }
     *     
     */
    public MemberMessageType getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberMessageType }
     *     
     */
    public void setQuestion(MemberMessageType value) {
        this.question = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getResponse() {
        if (this.response == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.response.toArray(new String[this.response.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getResponse(int idx) {
        if (this.response == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.response.get(idx);
    }

    public int getResponseLength() {
        if (this.response == null) {
            return  0;
        }
        return this.response.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setResponse(String[] values) {
        this._getResponse().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.response.add(values[i]);
        }
    }

    protected List<String> _getResponse() {
        if (response == null) {
            response = new ArrayList<String>();
        }
        return response;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setResponse(int idx, String value) {
        return this.response.set(idx, value);
    }

    /**
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusTypeCodeType }
     *     
     */
    public MessageStatusTypeCodeType getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusTypeCodeType }
     *     
     */
    public void setMessageStatus(MessageStatusTypeCodeType value) {
        this.messageStatus = value;
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
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedDate(Calendar value) {
        this.lastModifiedDate = value;
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
