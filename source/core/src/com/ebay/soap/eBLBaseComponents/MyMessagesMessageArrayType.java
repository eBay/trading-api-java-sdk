
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type used by the <b>Messages</b> container that is returned in <b>GetMyMessages</b>. The <b>Messages</b> container consists of an array of one or more messages.
 * 			
 * 
 * <p>Java class for MyMessagesMessageArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesMessageArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesMessageArrayType", propOrder = {
    "message"
})
public class MyMessagesMessageArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Message")
    protected List<MyMessagesMessageType> message;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link MyMessagesMessageType }
     *     
     */
    public MyMessagesMessageType[] getMessage() {
        if (this.message == null) {
            return new MyMessagesMessageType[ 0 ] ;
        }
        return ((MyMessagesMessageType[]) this.message.toArray(new MyMessagesMessageType[this.message.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MyMessagesMessageType }
     *     
     */
    public MyMessagesMessageType getMessage(int idx) {
        if (this.message == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.message.get(idx);
    }

    public int getMessageLength() {
        if (this.message == null) {
            return  0;
        }
        return this.message.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MyMessagesMessageType }
     *     
     */
    public void setMessage(MyMessagesMessageType[] values) {
        this._getMessage().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.message.add(values[i]);
        }
    }

    protected List<MyMessagesMessageType> _getMessage() {
        if (message == null) {
            message = new ArrayList<MyMessagesMessageType>();
        }
        return message;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesMessageType }
     *     
     */
    public MyMessagesMessageType setMessage(int idx, MyMessagesMessageType value) {
        return this.message.set(idx, value);
    }

}
