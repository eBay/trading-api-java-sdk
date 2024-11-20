
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
 * 				Contains data indicating whether an item has been revised since the
 * 				listing became active and, if so, which among a subset of properties
 * 				have been changed by the revision.
 * 			
 * 
 * <p>Java class for ReviseStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemRevised" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BuyItNowAdded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyItNowLowered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReserveLowered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReserveRemoved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ReviseStatusType", propOrder = {
    "itemRevised",
    "buyItNowAdded",
    "buyItNowLowered",
    "reserveLowered",
    "reserveRemoved",
    "any"
})
public class ReviseStatusType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemRevised")
    protected boolean itemRevised;
    @XmlElement(name = "BuyItNowAdded")
    protected Boolean buyItNowAdded;
    @XmlElement(name = "BuyItNowLowered")
    protected Boolean buyItNowLowered;
    @XmlElement(name = "ReserveLowered")
    protected Boolean reserveLowered;
    @XmlElement(name = "ReserveRemoved")
    protected Boolean reserveRemoved;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the itemRevised property.
     * 
     */
    public boolean isItemRevised() {
        return itemRevised;
    }

    /**
     * Sets the value of the itemRevised property.
     * 
     */
    public void setItemRevised(boolean value) {
        this.itemRevised = value;
    }

    /**
     * Gets the value of the buyItNowAdded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyItNowAdded() {
        return buyItNowAdded;
    }

    /**
     * Sets the value of the buyItNowAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyItNowAdded(Boolean value) {
        this.buyItNowAdded = value;
    }

    /**
     * Gets the value of the buyItNowLowered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyItNowLowered() {
        return buyItNowLowered;
    }

    /**
     * Sets the value of the buyItNowLowered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyItNowLowered(Boolean value) {
        this.buyItNowLowered = value;
    }

    /**
     * Gets the value of the reserveLowered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReserveLowered() {
        return reserveLowered;
    }

    /**
     * Sets the value of the reserveLowered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReserveLowered(Boolean value) {
        this.reserveLowered = value;
    }

    /**
     * Gets the value of the reserveRemoved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReserveRemoved() {
        return reserveRemoved;
    }

    /**
     * Sets the value of the reserveRemoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReserveRemoved(Boolean value) {
        this.reserveRemoved = value;
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
