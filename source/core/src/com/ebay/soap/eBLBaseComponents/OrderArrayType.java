
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
 * 			Type used by the <b>OrderArray</b> container that is returned in order management calls. The <b>OrderArray</b> container consists of one or more eBay orders that match the input criteria.
 * 		
 * 
 * <p>Java class for OrderArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Order" type="{urn:ebay:apis:eBLBaseComponents}OrderType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Errors" type="{urn:ebay:apis:eBLBaseComponents}ErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderArrayType", propOrder = {
    "order",
    "errors"
})
public class OrderArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Order")
    protected List<OrderType> order;
    @XmlElement(name = "Errors")
    protected List<ErrorType> errors;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link OrderType }
     *     
     */
    public OrderType[] getOrder() {
        if (this.order == null) {
            return new OrderType[ 0 ] ;
        }
        return ((OrderType[]) this.order.toArray(new OrderType[this.order.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder(int idx) {
        if (this.order == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.order.get(idx);
    }

    public int getOrderLength() {
        if (this.order == null) {
            return  0;
        }
        return this.order.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType[] values) {
        this._getOrder().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.order.add(values[i]);
        }
    }

    protected List<OrderType> _getOrder() {
        if (order == null) {
            order = new ArrayList<OrderType>();
        }
        return order;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public OrderType setOrder(int idx, OrderType value) {
        return this.order.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ErrorType }
     *     
     */
    public ErrorType[] getErrors() {
        if (this.errors == null) {
            return new ErrorType[ 0 ] ;
        }
        return ((ErrorType[]) this.errors.toArray(new ErrorType[this.errors.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrors(int idx) {
        if (this.errors == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.errors.get(idx);
    }

    public int getErrorsLength() {
        if (this.errors == null) {
            return  0;
        }
        return this.errors.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ErrorType }
     *     
     */
    public void setErrors(ErrorType[] values) {
        this._getErrors().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.errors.add(values[i]);
        }
    }

    protected List<ErrorType> _getErrors() {
        if (errors == null) {
            errors = new ArrayList<ErrorType>();
        }
        return errors;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType setErrors(int idx, ErrorType value) {
        return this.errors.set(idx, value);
    }

}
