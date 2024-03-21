
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
 * 				This type is used by the <b>SuggestedBidValues</b> container that is returned if the buyer is attempting to bid on an auction item through the <b>PlaceOffer</b> call.
 * 			
 * 
 * <p>Java class for SuggestedBidValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestedBidValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidValue" type="{urn:ebay:apis:eBLBaseComponents}AmountType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SuggestedBidValueType", propOrder = {
    "bidValue",
    "any"
})
public class SuggestedBidValueType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BidValue")
    protected List<AmountType> bidValue;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AmountType }
     *     
     */
    public AmountType[] getBidValue() {
        if (this.bidValue == null) {
            return new AmountType[ 0 ] ;
        }
        return ((AmountType[]) this.bidValue.toArray(new AmountType[this.bidValue.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AmountType }
     *     
     */
    public AmountType getBidValue(int idx) {
        if (this.bidValue == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.bidValue.get(idx);
    }

    public int getBidValueLength() {
        if (this.bidValue == null) {
            return  0;
        }
        return this.bidValue.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AmountType }
     *     
     */
    public void setBidValue(AmountType[] values) {
        this._getBidValue().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.bidValue.add(values[i]);
        }
    }

    protected List<AmountType> _getBidValue() {
        if (bidValue == null) {
            bidValue = new ArrayList<AmountType>();
        }
        return bidValue;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public AmountType setBidValue(int idx, AmountType value) {
        return this.bidValue.set(idx, value);
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
