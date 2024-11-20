
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type used by the <b>BidArray</b> container that is returned in the <b>GetAllBidders</b> response. The <b>BidArray</b> container is an array of all bids made on an auction listing that is specified in the call request.
 * 			
 * 
 * <p>Java class for OfferArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Offer" type="{urn:ebay:apis:eBLBaseComponents}OfferType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferArrayType", propOrder = {
    "offer"
})
public class OfferArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Offer")
    protected List<OfferType> offer;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link OfferType }
     *     
     */
    public OfferType[] getOffer() {
        if (this.offer == null) {
            return new OfferType[ 0 ] ;
        }
        return ((OfferType[]) this.offer.toArray(new OfferType[this.offer.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link OfferType }
     *     
     */
    public OfferType getOffer(int idx) {
        if (this.offer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.offer.get(idx);
    }

    public int getOfferLength() {
        if (this.offer == null) {
            return  0;
        }
        return this.offer.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link OfferType }
     *     
     */
    public void setOffer(OfferType[] values) {
        this._getOffer().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.offer.add(values[i]);
        }
    }

    protected List<OfferType> _getOffer() {
        if (offer == null) {
            offer = new ArrayList<OfferType>();
        }
        return offer;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public OfferType setOffer(int idx, OfferType value) {
        return this.offer.set(idx, value);
    }

}
