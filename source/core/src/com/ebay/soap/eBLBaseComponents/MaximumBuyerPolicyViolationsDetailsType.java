
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
 * 				Although the <b>MaximumBuyerPolicyViolations</b> container is still returned in <b>GeteBayDetails</b>, a Maximum Buyer Policy Violations threshold value can no longer be set at the account or listing level, so this type is no longer applicable.
 * 			
 * 
 * <p>Java class for MaximumBuyerPolicyViolationsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumBuyerPolicyViolationsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfPolicyViolations" type="{urn:ebay:apis:eBLBaseComponents}NumberOfPolicyViolationsDetailsType" minOccurs="0"/>
 *         &lt;element name="PolicyViolationDuration" type="{urn:ebay:apis:eBLBaseComponents}PolicyViolationDurationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MaximumBuyerPolicyViolationsDetailsType", propOrder = {
    "numberOfPolicyViolations",
    "policyViolationDuration",
    "any"
})
public class MaximumBuyerPolicyViolationsDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "NumberOfPolicyViolations")
    protected NumberOfPolicyViolationsDetailsType numberOfPolicyViolations;
    @XmlElement(name = "PolicyViolationDuration")
    protected List<PolicyViolationDurationDetailsType> policyViolationDuration;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the numberOfPolicyViolations property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfPolicyViolationsDetailsType }
     *     
     */
    public NumberOfPolicyViolationsDetailsType getNumberOfPolicyViolations() {
        return numberOfPolicyViolations;
    }

    /**
     * Sets the value of the numberOfPolicyViolations property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfPolicyViolationsDetailsType }
     *     
     */
    public void setNumberOfPolicyViolations(NumberOfPolicyViolationsDetailsType value) {
        this.numberOfPolicyViolations = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PolicyViolationDurationDetailsType }
     *     
     */
    public PolicyViolationDurationDetailsType[] getPolicyViolationDuration() {
        if (this.policyViolationDuration == null) {
            return new PolicyViolationDurationDetailsType[ 0 ] ;
        }
        return ((PolicyViolationDurationDetailsType[]) this.policyViolationDuration.toArray(new PolicyViolationDurationDetailsType[this.policyViolationDuration.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PolicyViolationDurationDetailsType }
     *     
     */
    public PolicyViolationDurationDetailsType getPolicyViolationDuration(int idx) {
        if (this.policyViolationDuration == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.policyViolationDuration.get(idx);
    }

    public int getPolicyViolationDurationLength() {
        if (this.policyViolationDuration == null) {
            return  0;
        }
        return this.policyViolationDuration.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PolicyViolationDurationDetailsType }
     *     
     */
    public void setPolicyViolationDuration(PolicyViolationDurationDetailsType[] values) {
        this._getPolicyViolationDuration().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.policyViolationDuration.add(values[i]);
        }
    }

    protected List<PolicyViolationDurationDetailsType> _getPolicyViolationDuration() {
        if (policyViolationDuration == null) {
            policyViolationDuration = new ArrayList<PolicyViolationDurationDetailsType>();
        }
        return policyViolationDuration;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyViolationDurationDetailsType }
     *     
     */
    public PolicyViolationDurationDetailsType setPolicyViolationDuration(int idx, PolicyViolationDurationDetailsType value) {
        return this.policyViolationDuration.set(idx, value);
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
