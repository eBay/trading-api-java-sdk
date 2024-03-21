
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
 * 				Type defining the <b>OrderIDArray</b> container, which consists of an array of order IDs. The <b>OrderIDArray</b> container is used to specify one or more orders to retrieve in a <b>GetOrders</b> or <b>GetOrderTransactions</b> call.
 * 			
 * 
 * <p>Java class for OrderIDArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderIDArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{urn:ebay:apis:eBLBaseComponents}OrderIDType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderIDArrayType", propOrder = {
    "orderID"
})
public class OrderIDArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderID")
    protected List<String> orderID;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getOrderID() {
        if (this.orderID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.orderID.toArray(new String[this.orderID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getOrderID(int idx) {
        if (this.orderID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.orderID.get(idx);
    }

    public int getOrderIDLength() {
        if (this.orderID == null) {
            return  0;
        }
        return this.orderID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setOrderID(String[] values) {
        this._getOrderID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.orderID.add(values[i]);
        }
    }

    protected List<String> _getOrderID() {
        if (orderID == null) {
            orderID = new ArrayList<String>();
        }
        return orderID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setOrderID(int idx, String value) {
        return this.orderID.set(idx, value);
    }

}
