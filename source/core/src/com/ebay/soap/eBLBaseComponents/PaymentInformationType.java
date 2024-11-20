
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
 * 				This type contains information about one or more payments made by the buyer to pay for an order.
 * 			
 * 
 * <p>Java class for PaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Payment" type="{urn:ebay:apis:eBLBaseComponents}PaymentTransactionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PaymentInformationType", propOrder = {
    "payment",
    "any"
})
public class PaymentInformationType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Payment")
    protected List<PaymentTransactionType> payment;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PaymentTransactionType }
     *     
     */
    public PaymentTransactionType[] getPayment() {
        if (this.payment == null) {
            return new PaymentTransactionType[ 0 ] ;
        }
        return ((PaymentTransactionType[]) this.payment.toArray(new PaymentTransactionType[this.payment.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PaymentTransactionType }
     *     
     */
    public PaymentTransactionType getPayment(int idx) {
        if (this.payment == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.payment.get(idx);
    }

    public int getPaymentLength() {
        if (this.payment == null) {
            return  0;
        }
        return this.payment.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PaymentTransactionType }
     *     
     */
    public void setPayment(PaymentTransactionType[] values) {
        this._getPayment().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.payment.add(values[i]);
        }
    }

    protected List<PaymentTransactionType> _getPayment() {
        if (payment == null) {
            payment = new ArrayList<PaymentTransactionType>();
        }
        return payment;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionType }
     *     
     */
    public PaymentTransactionType setPayment(int idx, PaymentTransactionType value) {
        return this.payment.set(idx, value);
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
