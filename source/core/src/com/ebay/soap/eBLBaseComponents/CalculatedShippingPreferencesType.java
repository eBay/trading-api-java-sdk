
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
 * <p>Java class for CalculatedShippingPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculatedShippingPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalculatedShippingAmountForEntireOrder" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingChargeOption" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingChargeOptionCodeType" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingRateOption" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingRateOptionCodeType" minOccurs="0"/>
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
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
@XmlType(name = "CalculatedShippingPreferencesType", propOrder = {
    "calculatedShippingAmountForEntireOrder",
    "calculatedShippingChargeOption",
    "calculatedShippingRateOption",
    "insuranceOption",
    "any"
})
public class CalculatedShippingPreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CalculatedShippingAmountForEntireOrder")
    protected AmountType calculatedShippingAmountForEntireOrder;
    @XmlElement(name = "CalculatedShippingChargeOption")
    protected CalculatedShippingChargeOptionCodeType calculatedShippingChargeOption;
    @XmlElement(name = "CalculatedShippingRateOption")
    protected CalculatedShippingRateOptionCodeType calculatedShippingRateOption;
    @XmlElement(name = "InsuranceOption")
    protected InsuranceOptionCodeType insuranceOption;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the calculatedShippingAmountForEntireOrder property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCalculatedShippingAmountForEntireOrder() {
        return calculatedShippingAmountForEntireOrder;
    }

    /**
     * Sets the value of the calculatedShippingAmountForEntireOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCalculatedShippingAmountForEntireOrder(AmountType value) {
        this.calculatedShippingAmountForEntireOrder = value;
    }

    /**
     * Gets the value of the calculatedShippingChargeOption property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingChargeOptionCodeType }
     *     
     */
    public CalculatedShippingChargeOptionCodeType getCalculatedShippingChargeOption() {
        return calculatedShippingChargeOption;
    }

    /**
     * Sets the value of the calculatedShippingChargeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingChargeOptionCodeType }
     *     
     */
    public void setCalculatedShippingChargeOption(CalculatedShippingChargeOptionCodeType value) {
        this.calculatedShippingChargeOption = value;
    }

    /**
     * Gets the value of the calculatedShippingRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingRateOptionCodeType }
     *     
     */
    public CalculatedShippingRateOptionCodeType getCalculatedShippingRateOption() {
        return calculatedShippingRateOption;
    }

    /**
     * Sets the value of the calculatedShippingRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingRateOptionCodeType }
     *     
     */
    public void setCalculatedShippingRateOption(CalculatedShippingRateOptionCodeType value) {
        this.calculatedShippingRateOption = value;
    }

    /**
     * Gets the value of the insuranceOption property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public InsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }

    /**
     * Sets the value of the insuranceOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public void setInsuranceOption(InsuranceOptionCodeType value) {
        this.insuranceOption = value;
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
