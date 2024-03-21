
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
 * 				Type defining the <b>CalculatedHandlingDiscount</b> container that is used in the <b>SetShippingDiscountProfiles</b> call to specify the rules used to determine package handling costs for an order in which calculated shipping is used.
 * 			
 * 
 * <p>Java class for CalculatedHandlingDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculatedHandlingDiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscountName" type="{urn:ebay:apis:eBLBaseComponents}HandlingNameCodeType" minOccurs="0"/>
 *         &lt;element name="OrderHandlingAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="EachAdditionalAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="EachAdditionalOffAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="EachAdditionalPercentOff" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "CalculatedHandlingDiscountType", propOrder = {
    "discountName",
    "orderHandlingAmount",
    "eachAdditionalAmount",
    "eachAdditionalOffAmount",
    "eachAdditionalPercentOff",
    "any"
})
public class CalculatedHandlingDiscountType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DiscountName")
    protected HandlingNameCodeType discountName;
    @XmlElement(name = "OrderHandlingAmount")
    protected AmountType orderHandlingAmount;
    @XmlElement(name = "EachAdditionalAmount")
    protected AmountType eachAdditionalAmount;
    @XmlElement(name = "EachAdditionalOffAmount")
    protected AmountType eachAdditionalOffAmount;
    @XmlElement(name = "EachAdditionalPercentOff")
    protected Float eachAdditionalPercentOff;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the discountName property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingNameCodeType }
     *     
     */
    public HandlingNameCodeType getDiscountName() {
        return discountName;
    }

    /**
     * Sets the value of the discountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingNameCodeType }
     *     
     */
    public void setDiscountName(HandlingNameCodeType value) {
        this.discountName = value;
    }

    /**
     * Gets the value of the orderHandlingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOrderHandlingAmount() {
        return orderHandlingAmount;
    }

    /**
     * Sets the value of the orderHandlingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOrderHandlingAmount(AmountType value) {
        this.orderHandlingAmount = value;
    }

    /**
     * Gets the value of the eachAdditionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEachAdditionalAmount() {
        return eachAdditionalAmount;
    }

    /**
     * Sets the value of the eachAdditionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEachAdditionalAmount(AmountType value) {
        this.eachAdditionalAmount = value;
    }

    /**
     * Gets the value of the eachAdditionalOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEachAdditionalOffAmount() {
        return eachAdditionalOffAmount;
    }

    /**
     * Sets the value of the eachAdditionalOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEachAdditionalOffAmount(AmountType value) {
        this.eachAdditionalOffAmount = value;
    }

    /**
     * Gets the value of the eachAdditionalPercentOff property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEachAdditionalPercentOff() {
        return eachAdditionalPercentOff;
    }

    /**
     * Sets the value of the eachAdditionalPercentOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEachAdditionalPercentOff(Float value) {
        this.eachAdditionalPercentOff = value;
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
