
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
 * 			Type used to indicate if the seller supports <a href="https://developer.ebay.com/api-docs/user-guides/static/trading-user-guide/manage-fulfill-combine-invoices.html">Combined Invoice</a>
 * 			orders, and if so, defines whether the seller specifies any shipping discount before or after purchase.
 * 			
 * 
 * <p>Java class for CombinedPaymentPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinedPaymentPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CombinedPaymentOption" type="{urn:ebay:apis:eBLBaseComponents}CombinedPaymentOptionCodeType" minOccurs="0"/>
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
@XmlType(name = "CombinedPaymentPreferencesType", propOrder = {
    "combinedPaymentOption",
    "any"
})
public class CombinedPaymentPreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CombinedPaymentOption")
    protected CombinedPaymentOptionCodeType combinedPaymentOption;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the combinedPaymentOption property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedPaymentOptionCodeType }
     *     
     */
    public CombinedPaymentOptionCodeType getCombinedPaymentOption() {
        return combinedPaymentOption;
    }

    /**
     * Sets the value of the combinedPaymentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedPaymentOptionCodeType }
     *     
     */
    public void setCombinedPaymentOption(CombinedPaymentOptionCodeType value) {
        this.combinedPaymentOption = value;
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
