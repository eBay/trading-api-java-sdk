
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
 * 				A collection of details about the Best Offers received for a specific item. Empty if there are no Best Offers. Includes the buyer and seller messages only if
 * 				the <code>ReturnAll</code> detail level is used.
 * 			
 * 
 * <p>Java class for ItemBestOffersArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemBestOffersArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemBestOffers" type="{urn:ebay:apis:eBLBaseComponents}ItemBestOffersType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ItemBestOffersArrayType", propOrder = {
    "itemBestOffers",
    "any"
})
public class ItemBestOffersArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemBestOffers")
    protected List<ItemBestOffersType> itemBestOffers;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ItemBestOffersType }
     *     
     */
    public ItemBestOffersType[] getItemBestOffers() {
        if (this.itemBestOffers == null) {
            return new ItemBestOffersType[ 0 ] ;
        }
        return ((ItemBestOffersType[]) this.itemBestOffers.toArray(new ItemBestOffersType[this.itemBestOffers.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ItemBestOffersType }
     *     
     */
    public ItemBestOffersType getItemBestOffers(int idx) {
        if (this.itemBestOffers == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.itemBestOffers.get(idx);
    }

    public int getItemBestOffersLength() {
        if (this.itemBestOffers == null) {
            return  0;
        }
        return this.itemBestOffers.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ItemBestOffersType }
     *     
     */
    public void setItemBestOffers(ItemBestOffersType[] values) {
        this._getItemBestOffers().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.itemBestOffers.add(values[i]);
        }
    }

    protected List<ItemBestOffersType> _getItemBestOffers() {
        if (itemBestOffers == null) {
            itemBestOffers = new ArrayList<ItemBestOffersType>();
        }
        return itemBestOffers;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ItemBestOffersType }
     *     
     */
    public ItemBestOffersType setItemBestOffers(int idx, ItemBestOffersType value) {
        return this.itemBestOffers.set(idx, value);
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
