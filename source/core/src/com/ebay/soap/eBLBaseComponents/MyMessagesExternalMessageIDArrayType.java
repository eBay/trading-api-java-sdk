
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
 * 				Contains a list of up to 10 external message IDs.
 * 			
 * 
 * <p>Java class for MyMessagesExternalMessageIDArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyMessagesExternalMessageIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalMessageID" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesExternalMessageIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyMessagesExternalMessageIDArrayType", propOrder = {
    "externalMessageID"
})
public class MyMessagesExternalMessageIDArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ExternalMessageID")
    protected List<String> externalMessageID;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getExternalMessageID() {
        if (this.externalMessageID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.externalMessageID.toArray(new String[this.externalMessageID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getExternalMessageID(int idx) {
        if (this.externalMessageID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.externalMessageID.get(idx);
    }

    public int getExternalMessageIDLength() {
        if (this.externalMessageID == null) {
            return  0;
        }
        return this.externalMessageID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setExternalMessageID(String[] values) {
        this._getExternalMessageID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.externalMessageID.add(values[i]);
        }
    }

    protected List<String> _getExternalMessageID() {
        if (externalMessageID == null) {
            externalMessageID = new ArrayList<String>();
        }
        return externalMessageID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setExternalMessageID(int idx, String value) {
        return this.externalMessageID.set(idx, value);
    }

}
