
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
 *         Contains data that links line item objects from separate orders.
 *       
 * 
 * <p>Java class for LinkedLineItemArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedLineItemArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkedLineItem" type="{urn:ebay:apis:eBLBaseComponents}LinkedLineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedLineItemArrayType", propOrder = {
    "linkedLineItem"
})
public class LinkedLineItemArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "LinkedLineItem")
    protected List<LinkedLineItemType> linkedLineItem;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link LinkedLineItemType }
     *     
     */
    public LinkedLineItemType[] getLinkedLineItem() {
        if (this.linkedLineItem == null) {
            return new LinkedLineItemType[ 0 ] ;
        }
        return ((LinkedLineItemType[]) this.linkedLineItem.toArray(new LinkedLineItemType[this.linkedLineItem.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link LinkedLineItemType }
     *     
     */
    public LinkedLineItemType getLinkedLineItem(int idx) {
        if (this.linkedLineItem == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.linkedLineItem.get(idx);
    }

    public int getLinkedLineItemLength() {
        if (this.linkedLineItem == null) {
            return  0;
        }
        return this.linkedLineItem.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link LinkedLineItemType }
     *     
     */
    public void setLinkedLineItem(LinkedLineItemType[] values) {
        this._getLinkedLineItem().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.linkedLineItem.add(values[i]);
        }
    }

    protected List<LinkedLineItemType> _getLinkedLineItem() {
        if (linkedLineItem == null) {
            linkedLineItem = new ArrayList<LinkedLineItemType>();
        }
        return linkedLineItem;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedLineItemType }
     *     
     */
    public LinkedLineItemType setLinkedLineItem(int idx, LinkedLineItemType value) {
        return this.linkedLineItem.set(idx, value);
    }

}
