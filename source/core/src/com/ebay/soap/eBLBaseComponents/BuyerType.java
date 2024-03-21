
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
 * 				This type is used by various <b>Get</b> calls, including <b>GetItem</b> and <b>GetOrders</b>. Only the order management calls return the <b>BuyerTaxIdentifier</b> container, and each call that uses <b>BuyerType</b> uses the <b>ShippingAddress</b> container a little differently.
 * 			
 * 
 * <p>Java class for BuyerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="BuyerTaxIdentifier" type="{urn:ebay:apis:eBLBaseComponents}TaxIdentifierType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BuyerType", propOrder = {
    "shippingAddress",
    "buyerTaxIdentifier",
    "any"
})
public class BuyerType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShippingAddress")
    protected AddressType shippingAddress;
    @XmlElement(name = "BuyerTaxIdentifier")
    protected List<TaxIdentifierType> buyerTaxIdentifier;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShippingAddress(AddressType value) {
        this.shippingAddress = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link TaxIdentifierType }
     *     
     */
    public TaxIdentifierType[] getBuyerTaxIdentifier() {
        if (this.buyerTaxIdentifier == null) {
            return new TaxIdentifierType[ 0 ] ;
        }
        return ((TaxIdentifierType[]) this.buyerTaxIdentifier.toArray(new TaxIdentifierType[this.buyerTaxIdentifier.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link TaxIdentifierType }
     *     
     */
    public TaxIdentifierType getBuyerTaxIdentifier(int idx) {
        if (this.buyerTaxIdentifier == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.buyerTaxIdentifier.get(idx);
    }

    public int getBuyerTaxIdentifierLength() {
        if (this.buyerTaxIdentifier == null) {
            return  0;
        }
        return this.buyerTaxIdentifier.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link TaxIdentifierType }
     *     
     */
    public void setBuyerTaxIdentifier(TaxIdentifierType[] values) {
        this._getBuyerTaxIdentifier().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.buyerTaxIdentifier.add(values[i]);
        }
    }

    protected List<TaxIdentifierType> _getBuyerTaxIdentifier() {
        if (buyerTaxIdentifier == null) {
            buyerTaxIdentifier = new ArrayList<TaxIdentifierType>();
        }
        return buyerTaxIdentifier;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentifierType }
     *     
     */
    public TaxIdentifierType setBuyerTaxIdentifier(int idx, TaxIdentifierType value) {
        return this.buyerTaxIdentifier.set(idx, value);
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
