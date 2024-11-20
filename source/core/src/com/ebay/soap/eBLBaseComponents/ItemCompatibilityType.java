
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
 * 				All information corresponding to an individual parts compatibility by application.
 * 			
 * 
 * <p>Java class for ItemCompatibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemCompatibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NameValueList" type="{urn:ebay:apis:eBLBaseComponents}NameValueListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CompatibilityNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ItemCompatibilityType", propOrder = {
    "delete",
    "nameValueList",
    "compatibilityNotes",
    "any"
})
public class ItemCompatibilityType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Delete")
    protected Boolean delete;
    @XmlElement(name = "NameValueList")
    protected List<NameValueListType> nameValueList;
    @XmlElement(name = "CompatibilityNotes")
    protected String compatibilityNotes;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link NameValueListType }
     *     
     */
    public NameValueListType[] getNameValueList() {
        if (this.nameValueList == null) {
            return new NameValueListType[ 0 ] ;
        }
        return ((NameValueListType[]) this.nameValueList.toArray(new NameValueListType[this.nameValueList.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NameValueListType }
     *     
     */
    public NameValueListType getNameValueList(int idx) {
        if (this.nameValueList == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.nameValueList.get(idx);
    }

    public int getNameValueListLength() {
        if (this.nameValueList == null) {
            return  0;
        }
        return this.nameValueList.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NameValueListType }
     *     
     */
    public void setNameValueList(NameValueListType[] values) {
        this._getNameValueList().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.nameValueList.add(values[i]);
        }
    }

    protected List<NameValueListType> _getNameValueList() {
        if (nameValueList == null) {
            nameValueList = new ArrayList<NameValueListType>();
        }
        return nameValueList;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListType }
     *     
     */
    public NameValueListType setNameValueList(int idx, NameValueListType value) {
        return this.nameValueList.set(idx, value);
    }

    /**
     * Gets the value of the compatibilityNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibilityNotes() {
        return compatibilityNotes;
    }

    /**
     * Sets the value of the compatibilityNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibilityNotes(String value) {
        this.compatibilityNotes = value;
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
