
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
 * <p>Java class for FlatShippingPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlatShippingPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountPerAdditionalItem" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="DeductionAmountPerAdditionalItem" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="FlatShippingRateOption" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingRateOptionCodeType" minOccurs="0"/>
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
@XmlType(name = "FlatShippingPreferencesType", propOrder = {
    "amountPerAdditionalItem",
    "deductionAmountPerAdditionalItem",
    "flatShippingRateOption",
    "insuranceOption",
    "any"
})
public class FlatShippingPreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AmountPerAdditionalItem")
    protected AmountType amountPerAdditionalItem;
    @XmlElement(name = "DeductionAmountPerAdditionalItem")
    protected AmountType deductionAmountPerAdditionalItem;
    @XmlElement(name = "FlatShippingRateOption")
    protected FlatShippingRateOptionCodeType flatShippingRateOption;
    @XmlElement(name = "InsuranceOption")
    protected InsuranceOptionCodeType insuranceOption;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the amountPerAdditionalItem property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountPerAdditionalItem() {
        return amountPerAdditionalItem;
    }

    /**
     * Sets the value of the amountPerAdditionalItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountPerAdditionalItem(AmountType value) {
        this.amountPerAdditionalItem = value;
    }

    /**
     * Gets the value of the deductionAmountPerAdditionalItem property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeductionAmountPerAdditionalItem() {
        return deductionAmountPerAdditionalItem;
    }

    /**
     * Sets the value of the deductionAmountPerAdditionalItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeductionAmountPerAdditionalItem(AmountType value) {
        this.deductionAmountPerAdditionalItem = value;
    }

    /**
     * Gets the value of the flatShippingRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link FlatShippingRateOptionCodeType }
     *     
     */
    public FlatShippingRateOptionCodeType getFlatShippingRateOption() {
        return flatShippingRateOption;
    }

    /**
     * Sets the value of the flatShippingRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlatShippingRateOptionCodeType }
     *     
     */
    public void setFlatShippingRateOption(FlatShippingRateOptionCodeType value) {
        this.flatShippingRateOption = value;
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
