
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
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for CharityAffiliationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharityAffiliationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharityID" type="{urn:ebay:apis:eBLBaseComponents}CharityIDType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CharityAffiliationsType", propOrder = {
    "charityID",
    "any"
})
public class CharityAffiliationsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CharityID")
    protected List<CharityIDType> charityID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CharityIDType }
     *     
     */
    public CharityIDType[] getCharityID() {
        if (this.charityID == null) {
            return new CharityIDType[ 0 ] ;
        }
        return ((CharityIDType[]) this.charityID.toArray(new CharityIDType[this.charityID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CharityIDType }
     *     
     */
    public CharityIDType getCharityID(int idx) {
        if (this.charityID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.charityID.get(idx);
    }

    public int getCharityIDLength() {
        if (this.charityID == null) {
            return  0;
        }
        return this.charityID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CharityIDType }
     *     
     */
    public void setCharityID(CharityIDType[] values) {
        this._getCharityID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.charityID.add(values[i]);
        }
    }

    protected List<CharityIDType> _getCharityID() {
        if (charityID == null) {
            charityID = new ArrayList<CharityIDType>();
        }
        return charityID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CharityIDType }
     *     
     */
    public CharityIDType setCharityID(int idx, CharityIDType value) {
        return this.charityID.set(idx, value);
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
