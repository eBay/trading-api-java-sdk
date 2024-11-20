
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
 * 				An array of one or more Best Offers. This type is used in the responses of the  <b>GetBestOffers</b> and <b>RespondToBestOffer</b> calls. 
 * 			
 * 
 * <p>Java class for BestOfferArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestOfferArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BestOffer" type="{urn:ebay:apis:eBLBaseComponents}BestOfferType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestOfferArrayType", propOrder = {
    "bestOffer"
})
public class BestOfferArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BestOffer")
    protected List<BestOfferType> bestOffer;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link BestOfferType }
     *     
     */
    public BestOfferType[] getBestOffer() {
        if (this.bestOffer == null) {
            return new BestOfferType[ 0 ] ;
        }
        return ((BestOfferType[]) this.bestOffer.toArray(new BestOfferType[this.bestOffer.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link BestOfferType }
     *     
     */
    public BestOfferType getBestOffer(int idx) {
        if (this.bestOffer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.bestOffer.get(idx);
    }

    public int getBestOfferLength() {
        if (this.bestOffer == null) {
            return  0;
        }
        return this.bestOffer.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link BestOfferType }
     *     
     */
    public void setBestOffer(BestOfferType[] values) {
        this._getBestOffer().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.bestOffer.add(values[i]);
        }
    }

    protected List<BestOfferType> _getBestOffer() {
        if (bestOffer == null) {
            bestOffer = new ArrayList<BestOfferType>();
        }
        return bestOffer;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferType }
     *     
     */
    public BestOfferType setBestOffer(int idx, BestOfferType value) {
        return this.bestOffer.set(idx, value);
    }

}
