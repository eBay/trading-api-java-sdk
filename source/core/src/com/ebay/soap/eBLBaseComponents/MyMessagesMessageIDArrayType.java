
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
 * 				Contains a list of up to 10 MessageID values.
 * 			
 * 
 * <p>Java class for MyMessagesMessageIDArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesMessageIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageID" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesMessageIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesMessageIDArrayType", propOrder = {
    "messageID"
})
public class MyMessagesMessageIDArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MessageID")
    protected List<String> messageID;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getMessageID() {
        if (this.messageID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.messageID.toArray(new String[this.messageID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getMessageID(int idx) {
        if (this.messageID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.messageID.get(idx);
    }

    public int getMessageIDLength() {
        if (this.messageID == null) {
            return  0;
        }
        return this.messageID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setMessageID(String[] values) {
        this._getMessageID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.messageID.add(values[i]);
        }
    }

    protected List<String> _getMessageID() {
        if (messageID == null) {
            messageID = new ArrayList<String>();
        }
        return messageID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setMessageID(int idx, String value) {
        return this.messageID.set(idx, value);
    }

}
