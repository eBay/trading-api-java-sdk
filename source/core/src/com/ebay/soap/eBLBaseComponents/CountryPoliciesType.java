
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
 * 				This type specifies custom product compliance and/or take-back policies that apply to a specified country.
 * 			
 * 
 * <p>Java class for CountryPoliciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryPoliciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="PolicyID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CountryPoliciesType", propOrder = {
    "country",
    "policyID",
    "any"
})
public class CountryPoliciesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Country")
    protected CountryCodeType country;
    @XmlElement(name = "PolicyID", type = Long.class)
    protected List<Long> policyID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Long }
     *     
     */
    public long[] getPolicyID() {
        if (this.policyID == null) {
            return new long[ 0 ] ;
        }
        long[] r = new long[this.policyID.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.policyID.get(__i).longValue();
        }
        return r;
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Long }
     *     
     */
    public long getPolicyID(int idx) {
        if (this.policyID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.policyID.get(idx).longValue();
    }

    public int getPolicyIDLength() {
        if (this.policyID == null) {
            return  0;
        }
        return this.policyID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Long }
     *     
     */
    public void setPolicyID(long[] values) {
        this._getPolicyID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.policyID.add(new Long(values[i]));
        }
    }

    protected List<Long> _getPolicyID() {
        if (policyID == null) {
            policyID = new ArrayList<Long>();
        }
        return policyID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public long setPolicyID(int idx, long value) {
        return this.policyID.set(idx, new Long(value)).longValue();
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
