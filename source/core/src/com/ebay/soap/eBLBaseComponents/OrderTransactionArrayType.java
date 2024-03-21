
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
 * 				Type used by the <b>OrderTransactionArray</b> container that is returned in the <b>GetMyeBaySelling</b> and <b>GetMyeBayBuying</b> calls. The <b>OrderTransactionArray</b> container consists a list of orders and each order line item in that order.
 * 			
 * 
 * <p>Java class for OrderTransactionArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderTransactionArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderTransaction" type="{urn:ebay:apis:eBLBaseComponents}OrderTransactionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderTransactionArrayType", propOrder = {
    "orderTransaction"
})
public class OrderTransactionArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderTransaction")
    protected List<OrderTransactionType> orderTransaction;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link OrderTransactionType }
     *     
     */
    public OrderTransactionType[] getOrderTransaction() {
        if (this.orderTransaction == null) {
            return new OrderTransactionType[ 0 ] ;
        }
        return ((OrderTransactionType[]) this.orderTransaction.toArray(new OrderTransactionType[this.orderTransaction.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link OrderTransactionType }
     *     
     */
    public OrderTransactionType getOrderTransaction(int idx) {
        if (this.orderTransaction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.orderTransaction.get(idx);
    }

    public int getOrderTransactionLength() {
        if (this.orderTransaction == null) {
            return  0;
        }
        return this.orderTransaction.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link OrderTransactionType }
     *     
     */
    public void setOrderTransaction(OrderTransactionType[] values) {
        this._getOrderTransaction().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.orderTransaction.add(values[i]);
        }
    }

    protected List<OrderTransactionType> _getOrderTransaction() {
        if (orderTransaction == null) {
            orderTransaction = new ArrayList<OrderTransactionType>();
        }
        return orderTransaction;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link OrderTransactionType }
     *     
     */
    public OrderTransactionType setOrderTransaction(int idx, OrderTransactionType value) {
        return this.orderTransaction.set(idx, value);
    }

}
