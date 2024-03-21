
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
 * 				 A list of possible My eBay Second Chance Offers.
 * 			
 * 
 * <p>Java class for MyeBaySecondChanceOfferListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyeBaySecondChanceOfferListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecondChanceOffer" type="{urn:ebay:apis:eBLBaseComponents}ItemType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MyeBaySecondChanceOfferListType", propOrder = {
    "totalAvailable",
    "secondChanceOffer",
    "any"
})
public class MyeBaySecondChanceOfferListType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TotalAvailable")
    protected Integer totalAvailable;
    @XmlElement(name = "SecondChanceOffer")
    protected List<ItemType> secondChanceOffer;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the totalAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAvailable() {
        return totalAvailable;
    }

    /**
     * Sets the value of the totalAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAvailable(Integer value) {
        this.totalAvailable = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ItemType }
     *     
     */
    public ItemType[] getSecondChanceOffer() {
        if (this.secondChanceOffer == null) {
            return new ItemType[ 0 ] ;
        }
        return ((ItemType[]) this.secondChanceOffer.toArray(new ItemType[this.secondChanceOffer.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ItemType }
     *     
     */
    public ItemType getSecondChanceOffer(int idx) {
        if (this.secondChanceOffer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.secondChanceOffer.get(idx);
    }

    public int getSecondChanceOfferLength() {
        if (this.secondChanceOffer == null) {
            return  0;
        }
        return this.secondChanceOffer.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ItemType }
     *     
     */
    public void setSecondChanceOffer(ItemType[] values) {
        this._getSecondChanceOffer().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.secondChanceOffer.add(values[i]);
        }
    }

    protected List<ItemType> _getSecondChanceOffer() {
        if (secondChanceOffer == null) {
            secondChanceOffer = new ArrayList<ItemType>();
        }
        return secondChanceOffer;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public ItemType setSecondChanceOffer(int idx, ItemType value) {
        return this.secondChanceOffer.set(idx, value);
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
