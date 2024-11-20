
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
 * 				This type defines the available options the seller has for handling domestic returns.
 * 			
 * 
 * <p>Java class for DomesticRefundMethodCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomesticRefundMethodCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomesticRefundMethod" type="{urn:ebay:apis:eBLBaseComponents}ReturnsRefundMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DomesticRefundMethodCodeType", propOrder = {
    "domesticRefundMethod",
    "any"
})
public class DomesticRefundMethodCodeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DomesticRefundMethod")
    protected List<ReturnsRefundMethodCodeType> domesticRefundMethod;
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
    public ReturnsRefundMethodCodeType[] getDomesticRefundMethod() {
        if (this.domesticRefundMethod == null) {
            return new ReturnsRefundMethodCodeType[ 0 ] ;
        }
        return ((ReturnsRefundMethodCodeType[]) this.domesticRefundMethod.toArray(new ReturnsRefundMethodCodeType[this.domesticRefundMethod.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReturnsRefundMethodCodeType }
     *     
     */
    public ReturnsRefundMethodCodeType getDomesticRefundMethod(int idx) {
        if (this.domesticRefundMethod == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.domesticRefundMethod.get(idx);
    }

    public int getDomesticRefundMethodLength() {
        if (this.domesticRefundMethod == null) {
            return  0;
        }
        return this.domesticRefundMethod.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReturnsRefundMethodCodeType }
     *     
     */
    public void setDomesticRefundMethod(ReturnsRefundMethodCodeType[] values) {
        this._getDomesticRefundMethod().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.domesticRefundMethod.add(values[i]);
        }
    }

    protected List<ReturnsRefundMethodCodeType> _getDomesticRefundMethod() {
        if (domesticRefundMethod == null) {
            domesticRefundMethod = new ArrayList<ReturnsRefundMethodCodeType>();
        }
        return domesticRefundMethod;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsRefundMethodCodeType }
     *     
     */
    public ReturnsRefundMethodCodeType setDomesticRefundMethod(int idx, ReturnsRefundMethodCodeType value) {
        return this.domesticRefundMethod.set(idx, value);
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
