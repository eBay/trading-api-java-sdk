
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
 *          This type provides information about one or more order line items in a package.
 * 		
 * 
 * <p>Java class for ShipmentLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentLineItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineItem" type="{urn:ebay:apis:eBLBaseComponents}LineItemType" maxOccurs="unbounded"/>
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
@XmlType(name = "ShipmentLineItemType", propOrder = {
    "lineItem",
    "any"
})
public class ShipmentLineItemType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "LineItem", required = true)
    protected List<LineItemType> lineItem;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link LineItemType }
     *     
     */
    public LineItemType[] getLineItem() {
        if (this.lineItem == null) {
            return new LineItemType[ 0 ] ;
        }
        return ((LineItemType[]) this.lineItem.toArray(new LineItemType[this.lineItem.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link LineItemType }
     *     
     */
    public LineItemType getLineItem(int idx) {
        if (this.lineItem == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.lineItem.get(idx);
    }

    public int getLineItemLength() {
        if (this.lineItem == null) {
            return  0;
        }
        return this.lineItem.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link LineItemType }
     *     
     */
    public void setLineItem(LineItemType[] values) {
        this._getLineItem().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.lineItem.add(values[i]);
        }
    }

    protected List<LineItemType> _getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<LineItemType>();
        }
        return lineItem;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType }
     *     
     */
    public LineItemType setLineItem(int idx, LineItemType value) {
        return this.lineItem.set(idx, value);
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
