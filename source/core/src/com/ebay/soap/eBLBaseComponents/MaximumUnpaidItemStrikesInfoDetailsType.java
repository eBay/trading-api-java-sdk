
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
 * 				Details of a buyer's maximum unpaid item strikes in a pre-defined time period. This is applicable only to sellers.
 * 			
 * 
 * <p>Java class for MaximumUnpaidItemStrikesInfoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumUnpaidItemStrikesInfoDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumUnpaidItemStrikesCount" type="{urn:ebay:apis:eBLBaseComponents}MaximumUnpaidItemStrikesCountDetailsType" minOccurs="0"/>
 *         &lt;element name="MaximumUnpaidItemStrikesDuration" type="{urn:ebay:apis:eBLBaseComponents}MaximumUnpaidItemStrikesDurationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MaximumUnpaidItemStrikesInfoDetailsType", propOrder = {
    "maximumUnpaidItemStrikesCount",
    "maximumUnpaidItemStrikesDuration",
    "any"
})
public class MaximumUnpaidItemStrikesInfoDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MaximumUnpaidItemStrikesCount")
    protected MaximumUnpaidItemStrikesCountDetailsType maximumUnpaidItemStrikesCount;
    @XmlElement(name = "MaximumUnpaidItemStrikesDuration")
    protected List<MaximumUnpaidItemStrikesDurationDetailsType> maximumUnpaidItemStrikesDuration;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the maximumUnpaidItemStrikesCount property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumUnpaidItemStrikesCountDetailsType }
     *     
     */
    public MaximumUnpaidItemStrikesCountDetailsType getMaximumUnpaidItemStrikesCount() {
        return maximumUnpaidItemStrikesCount;
    }

    /**
     * Sets the value of the maximumUnpaidItemStrikesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumUnpaidItemStrikesCountDetailsType }
     *     
     */
    public void setMaximumUnpaidItemStrikesCount(MaximumUnpaidItemStrikesCountDetailsType value) {
        this.maximumUnpaidItemStrikesCount = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link MaximumUnpaidItemStrikesDurationDetailsType }
     *     
     */
    public MaximumUnpaidItemStrikesDurationDetailsType[] getMaximumUnpaidItemStrikesDuration() {
        if (this.maximumUnpaidItemStrikesDuration == null) {
            return new MaximumUnpaidItemStrikesDurationDetailsType[ 0 ] ;
        }
        return ((MaximumUnpaidItemStrikesDurationDetailsType[]) this.maximumUnpaidItemStrikesDuration.toArray(new MaximumUnpaidItemStrikesDurationDetailsType[this.maximumUnpaidItemStrikesDuration.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MaximumUnpaidItemStrikesDurationDetailsType }
     *     
     */
    public MaximumUnpaidItemStrikesDurationDetailsType getMaximumUnpaidItemStrikesDuration(int idx) {
        if (this.maximumUnpaidItemStrikesDuration == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.maximumUnpaidItemStrikesDuration.get(idx);
    }

    public int getMaximumUnpaidItemStrikesDurationLength() {
        if (this.maximumUnpaidItemStrikesDuration == null) {
            return  0;
        }
        return this.maximumUnpaidItemStrikesDuration.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MaximumUnpaidItemStrikesDurationDetailsType }
     *     
     */
    public void setMaximumUnpaidItemStrikesDuration(MaximumUnpaidItemStrikesDurationDetailsType[] values) {
        this._getMaximumUnpaidItemStrikesDuration().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.maximumUnpaidItemStrikesDuration.add(values[i]);
        }
    }

    protected List<MaximumUnpaidItemStrikesDurationDetailsType> _getMaximumUnpaidItemStrikesDuration() {
        if (maximumUnpaidItemStrikesDuration == null) {
            maximumUnpaidItemStrikesDuration = new ArrayList<MaximumUnpaidItemStrikesDurationDetailsType>();
        }
        return maximumUnpaidItemStrikesDuration;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumUnpaidItemStrikesDurationDetailsType }
     *     
     */
    public MaximumUnpaidItemStrikesDurationDetailsType setMaximumUnpaidItemStrikesDuration(int idx, MaximumUnpaidItemStrikesDurationDetailsType value) {
        return this.maximumUnpaidItemStrikesDuration.set(idx, value);
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
