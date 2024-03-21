
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for eBayPaymentMismatchDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eBayPaymentMismatchDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MismatchType" type="{urn:ebay:apis:eBLBaseComponents}MismatchTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ActionRequiredBy" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MismatchAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
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
@XmlType(name = "eBayPaymentMismatchDetailsType", propOrder = {
    "mismatchType",
    "actionRequiredBy",
    "mismatchAmount",
    "any"
})
public class EBayPaymentMismatchDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MismatchType")
    protected MismatchTypeCodeType mismatchType;
    @XmlElement(name = "ActionRequiredBy", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar actionRequiredBy;
    @XmlElement(name = "MismatchAmount")
    protected AmountType mismatchAmount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the mismatchType property.
     * 
     * @return
     *     possible object is
     *     {@link MismatchTypeCodeType }
     *     
     */
    public MismatchTypeCodeType getMismatchType() {
        return mismatchType;
    }

    /**
     * Sets the value of the mismatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MismatchTypeCodeType }
     *     
     */
    public void setMismatchType(MismatchTypeCodeType value) {
        this.mismatchType = value;
    }

    /**
     * Gets the value of the actionRequiredBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getActionRequiredBy() {
        return actionRequiredBy;
    }

    /**
     * Sets the value of the actionRequiredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionRequiredBy(Calendar value) {
        this.actionRequiredBy = value;
    }

    /**
     * Gets the value of the mismatchAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMismatchAmount() {
        return mismatchAmount;
    }

    /**
     * Sets the value of the mismatchAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMismatchAmount(AmountType value) {
        this.mismatchAmount = value;
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
