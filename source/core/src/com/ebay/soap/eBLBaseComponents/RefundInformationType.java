
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
 * 				Type defining the <strong>Refunds</strong> container, which contains an array of <strong>Refund</strong> containers. A <strong>Refund</strong> container consists of detailed information on an In-Store Pickup item refund.
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> At this time, the In-Store Pickup feature is generally only available to large retail merchants on the US site, and can only be applied to multi-quantity, fixed-price listings.
 * 				</span>
 * 			
 * 
 * <p>Java class for RefundInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Refund" type="{urn:ebay:apis:eBLBaseComponents}RefundTransactionInfoType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RefundInformationType", propOrder = {
    "refund",
    "any"
})
public class RefundInformationType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Refund")
    protected List<RefundTransactionInfoType> refund;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RefundTransactionInfoType }
     *     
     */
    public RefundTransactionInfoType[] getRefund() {
        if (this.refund == null) {
            return new RefundTransactionInfoType[ 0 ] ;
        }
        return ((RefundTransactionInfoType[]) this.refund.toArray(new RefundTransactionInfoType[this.refund.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RefundTransactionInfoType }
     *     
     */
    public RefundTransactionInfoType getRefund(int idx) {
        if (this.refund == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.refund.get(idx);
    }

    public int getRefundLength() {
        if (this.refund == null) {
            return  0;
        }
        return this.refund.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RefundTransactionInfoType }
     *     
     */
    public void setRefund(RefundTransactionInfoType[] values) {
        this._getRefund().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.refund.add(values[i]);
        }
    }

    protected List<RefundTransactionInfoType> _getRefund() {
        if (refund == null) {
            refund = new ArrayList<RefundTransactionInfoType>();
        }
        return refund;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RefundTransactionInfoType }
     *     
     */
    public RefundTransactionInfoType setRefund(int idx, RefundTransactionInfoType value) {
        return this.refund.set(idx, value);
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
