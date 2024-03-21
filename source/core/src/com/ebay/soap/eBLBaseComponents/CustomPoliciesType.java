
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
 * 				This type is used by the <strong>CustomPolicies</strong> container, which specifies custom policy IDs. A custom policy ID refers to the relevant policy created for product compliance and other purposes. For more information, see the <b>Custom Policies</b> page for your site (for example, <a href="https://www.ebay.fr/help/selling/custom-policies/custom-policies?id=5311" target="_blank">https://www.ebay.fr/help/selling/custom-policies/custom-policies?id=5311</a>). To create and manage custom policies, use the <a href="https://developer.ebay.com/api-docs/sell/account/resources/methods#h2-custom_policy" target="_blank">custom_policy</a> resource of the <b>Account API</b>. 
 * 			
 * 
 * <p>Java class for CustomPoliciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomPoliciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TakeBackPolicyID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RegionalTakeBackPolicies" type="{urn:ebay:apis:eBLBaseComponents}CountryPoliciesArrayType" minOccurs="0"/>
 *         &lt;element name="ProductCompliancePolicyID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="RegionalProductCompliancePolicies" type="{urn:ebay:apis:eBLBaseComponents}CountryPoliciesArrayType" minOccurs="0"/>
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
@XmlType(name = "CustomPoliciesType", propOrder = {
    "takeBackPolicyID",
    "regionalTakeBackPolicies",
    "productCompliancePolicyID",
    "regionalProductCompliancePolicies",
    "any"
})
public class CustomPoliciesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TakeBackPolicyID")
    protected Long takeBackPolicyID;
    @XmlElement(name = "RegionalTakeBackPolicies")
    protected CountryPoliciesArrayType regionalTakeBackPolicies;
    @XmlElement(name = "ProductCompliancePolicyID", type = Long.class)
    protected List<Long> productCompliancePolicyID;
    @XmlElement(name = "RegionalProductCompliancePolicies")
    protected CountryPoliciesArrayType regionalProductCompliancePolicies;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the takeBackPolicyID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTakeBackPolicyID() {
        return takeBackPolicyID;
    }

    /**
     * Sets the value of the takeBackPolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTakeBackPolicyID(Long value) {
        this.takeBackPolicyID = value;
    }

    /**
     * Gets the value of the regionalTakeBackPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPoliciesArrayType }
     *     
     */
    public CountryPoliciesArrayType getRegionalTakeBackPolicies() {
        return regionalTakeBackPolicies;
    }

    /**
     * Sets the value of the regionalTakeBackPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPoliciesArrayType }
     *     
     */
    public void setRegionalTakeBackPolicies(CountryPoliciesArrayType value) {
        this.regionalTakeBackPolicies = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Long }
     *     
     */
    public long[] getProductCompliancePolicyID() {
        if (this.productCompliancePolicyID == null) {
            return new long[ 0 ] ;
        }
        long[] r = new long[this.productCompliancePolicyID.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.productCompliancePolicyID.get(__i).longValue();
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
    public long getProductCompliancePolicyID(int idx) {
        if (this.productCompliancePolicyID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productCompliancePolicyID.get(idx).longValue();
    }

    public int getProductCompliancePolicyIDLength() {
        if (this.productCompliancePolicyID == null) {
            return  0;
        }
        return this.productCompliancePolicyID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Long }
     *     
     */
    public void setProductCompliancePolicyID(long[] values) {
        this._getProductCompliancePolicyID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.productCompliancePolicyID.add(new Long(values[i]));
        }
    }

    protected List<Long> _getProductCompliancePolicyID() {
        if (productCompliancePolicyID == null) {
            productCompliancePolicyID = new ArrayList<Long>();
        }
        return productCompliancePolicyID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public long setProductCompliancePolicyID(int idx, long value) {
        return this.productCompliancePolicyID.set(idx, new Long(value)).longValue();
    }

    /**
     * Gets the value of the regionalProductCompliancePolicies property.
     * 
     * @return
     *     possible object is
     *     {@link CountryPoliciesArrayType }
     *     
     */
    public CountryPoliciesArrayType getRegionalProductCompliancePolicies() {
        return regionalProductCompliancePolicies;
    }

    /**
     * Sets the value of the regionalProductCompliancePolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPoliciesArrayType }
     *     
     */
    public void setRegionalProductCompliancePolicies(CountryPoliciesArrayType value) {
        this.regionalProductCompliancePolicies = value;
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
