
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
 * 				Container for a list of items. Can contain zero, one, or multiple
 * 				<b>ItemType</b> objects, each of which conveys the data for one item listing.
 * 			
 * 
 * <p>Java class for ItemArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemArrayType", propOrder = {
    "item"
})
public class ItemArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Item")
    protected List<ItemType> item;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ItemType }
     *     
     */
    public ItemType[] getItem() {
        if (this.item == null) {
            return new ItemType[ 0 ] ;
        }
        return ((ItemType[]) this.item.toArray(new ItemType[this.item.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ItemType }
     *     
     */
    public ItemType getItem(int idx) {
        if (this.item == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.item.get(idx);
    }

    public int getItemLength() {
        if (this.item == null) {
            return  0;
        }
        return this.item.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType[] values) {
        this._getItem().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.item.add(values[i]);
        }
    }

    protected List<ItemType> _getItem() {
        if (item == null) {
            item = new ArrayList<ItemType>();
        }
        return item;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public ItemType setItem(int idx, ItemType value) {
        return this.item.set(idx, value);
    }

}
