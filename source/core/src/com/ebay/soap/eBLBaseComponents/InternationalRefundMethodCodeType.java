
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
 * 				This type defines the available options the seller has for handling international returns.
 * 			
 * 
 * <p>Java class for InternationalRefundMethodCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalRefundMethodCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternationalRefundMethod" type="{urn:ebay:apis:eBLBaseComponents}ReturnsRefundMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalRefundMethodCodeType", propOrder = {
    "internationalRefundMethod",
    "any"
})
public class InternationalRefundMethodCodeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "InternationalRefundMethod")
    protected List<ReturnsRefundMethodCodeType> internationalRefundMethod;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ReturnsRefundMethodCodeType }
     *     
     */
    public ReturnsRefundMethodCodeType[] getInternationalRefundMethod() {
        if (this.internationalRefundMethod == null) {
            return new ReturnsRefundMethodCodeType[ 0 ] ;
        }
        return ((ReturnsRefundMethodCodeType[]) this.internationalRefundMethod.toArray(new ReturnsRefundMethodCodeType[this.internationalRefundMethod.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReturnsRefundMethodCodeType }
     *     
     */
    public ReturnsRefundMethodCodeType getInternationalRefundMethod(int idx) {
        if (this.internationalRefundMethod == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.internationalRefundMethod.get(idx);
    }

    public int getInternationalRefundMethodLength() {
        if (this.internationalRefundMethod == null) {
            return  0;
        }
        return this.internationalRefundMethod.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReturnsRefundMethodCodeType }
     *     
     */
    public void setInternationalRefundMethod(ReturnsRefundMethodCodeType[] values) {
        this._getInternationalRefundMethod().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.internationalRefundMethod.add(values[i]);
        }
    }

    protected List<ReturnsRefundMethodCodeType> _getInternationalRefundMethod() {
        if (internationalRefundMethod == null) {
            internationalRefundMethod = new ArrayList<ReturnsRefundMethodCodeType>();
        }
        return internationalRefundMethod;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsRefundMethodCodeType }
     *     
     */
    public ReturnsRefundMethodCodeType setInternationalRefundMethod(int idx, ReturnsRefundMethodCodeType value) {
        return this.internationalRefundMethod.set(idx, value);
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
