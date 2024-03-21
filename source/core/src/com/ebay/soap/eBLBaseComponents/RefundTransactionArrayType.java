
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
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for RefundTransactionArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundTransactionArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundTransaction" type="{urn:ebay:apis:eBLBaseComponents}RefundTransactionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RefundTransactionArrayType", propOrder = {
    "refundTransaction",
    "any"
})
public class RefundTransactionArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RefundTransaction")
    protected List<RefundTransactionType> refundTransaction;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RefundTransactionType }
     *     
     */
    public RefundTransactionType[] getRefundTransaction() {
        if (this.refundTransaction == null) {
            return new RefundTransactionType[ 0 ] ;
        }
        return ((RefundTransactionType[]) this.refundTransaction.toArray(new RefundTransactionType[this.refundTransaction.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RefundTransactionType }
     *     
     */
    public RefundTransactionType getRefundTransaction(int idx) {
        if (this.refundTransaction == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.refundTransaction.get(idx);
    }

    public int getRefundTransactionLength() {
        if (this.refundTransaction == null) {
            return  0;
        }
        return this.refundTransaction.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RefundTransactionType }
     *     
     */
    public void setRefundTransaction(RefundTransactionType[] values) {
        this._getRefundTransaction().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.refundTransaction.add(values[i]);
        }
    }

    protected List<RefundTransactionType> _getRefundTransaction() {
        if (refundTransaction == null) {
            refundTransaction = new ArrayList<RefundTransactionType>();
        }
        return refundTransaction;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RefundTransactionType }
     *     
     */
    public RefundTransactionType setRefundTransaction(int idx, RefundTransactionType value) {
        return this.refundTransaction.set(idx, value);
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
