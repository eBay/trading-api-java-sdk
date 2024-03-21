
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
 * 				Details of an individual discount profile defined by the
 * 				user for flat-rate shipping.
 * 			
 * 
 * <p>Java class for FlatShippingDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlatShippingDiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscountName" type="{urn:ebay:apis:eBLBaseComponents}DiscountNameCodeType" minOccurs="0"/>
 *         &lt;element name="DiscountProfile" type="{urn:ebay:apis:eBLBaseComponents}DiscountProfileType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FlatShippingDiscountType", propOrder = {
    "discountName",
    "discountProfile",
    "any"
})
public class FlatShippingDiscountType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DiscountName")
    protected DiscountNameCodeType discountName;
    @XmlElement(name = "DiscountProfile")
    protected List<DiscountProfileType> discountProfile;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the discountName property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountNameCodeType }
     *     
     */
    public DiscountNameCodeType getDiscountName() {
        return discountName;
    }

    /**
     * Sets the value of the discountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountNameCodeType }
     *     
     */
    public void setDiscountName(DiscountNameCodeType value) {
        this.discountName = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DiscountProfileType }
     *     
     */
    public DiscountProfileType[] getDiscountProfile() {
        if (this.discountProfile == null) {
            return new DiscountProfileType[ 0 ] ;
        }
        return ((DiscountProfileType[]) this.discountProfile.toArray(new DiscountProfileType[this.discountProfile.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DiscountProfileType }
     *     
     */
    public DiscountProfileType getDiscountProfile(int idx) {
        if (this.discountProfile == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.discountProfile.get(idx);
    }

    public int getDiscountProfileLength() {
        if (this.discountProfile == null) {
            return  0;
        }
        return this.discountProfile.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DiscountProfileType }
     *     
     */
    public void setDiscountProfile(DiscountProfileType[] values) {
        this._getDiscountProfile().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.discountProfile.add(values[i]);
        }
    }

    protected List<DiscountProfileType> _getDiscountProfile() {
        if (discountProfile == null) {
            discountProfile = new ArrayList<DiscountProfileType>();
        }
        return discountProfile;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountProfileType }
     *     
     */
    public DiscountProfileType setDiscountProfile(int idx, DiscountProfileType value) {
        return this.discountProfile.set(idx, value);
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
