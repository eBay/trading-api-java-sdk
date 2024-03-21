
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
 * 				This type is used by the <b>ItemTransactionIDArray</b> container in the <b>GetOrderTransactions</b> call. The <b>ItemTransactionIDArray</b> container is used to specify one or more specific order line items to retrieve.
 * 			
 * 
 * <p>Java class for ItemTransactionIDArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemTransactionIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemTransactionID" type="{urn:ebay:apis:eBLBaseComponents}ItemTransactionIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemTransactionIDArrayType", propOrder = {
    "itemTransactionID"
})
public class ItemTransactionIDArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemTransactionID")
    protected List<ItemTransactionIDType> itemTransactionID;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ItemTransactionIDType }
     *     
     */
    public ItemTransactionIDType[] getItemTransactionID() {
        if (this.itemTransactionID == null) {
            return new ItemTransactionIDType[ 0 ] ;
        }
        return ((ItemTransactionIDType[]) this.itemTransactionID.toArray(new ItemTransactionIDType[this.itemTransactionID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ItemTransactionIDType }
     *     
     */
    public ItemTransactionIDType getItemTransactionID(int idx) {
        if (this.itemTransactionID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.itemTransactionID.get(idx);
    }

    public int getItemTransactionIDLength() {
        if (this.itemTransactionID == null) {
            return  0;
        }
        return this.itemTransactionID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ItemTransactionIDType }
     *     
     */
    public void setItemTransactionID(ItemTransactionIDType[] values) {
        this._getItemTransactionID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.itemTransactionID.add(values[i]);
        }
    }

    protected List<ItemTransactionIDType> _getItemTransactionID() {
        if (itemTransactionID == null) {
            itemTransactionID = new ArrayList<ItemTransactionIDType>();
        }
        return itemTransactionID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTransactionIDType }
     *     
     */
    public ItemTransactionIDType setItemTransactionID(int idx, ItemTransactionIDType value) {
        return this.itemTransactionID.set(idx, value);
    }

}
