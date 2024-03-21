
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
 * 				<span class="tablenote"><b>Note: </b> This type was only used for Half.com order refunds, and since the Half.com site has been shut down, this type is no longer applicable.
 * 				</span>
 * 				Type used by the <strong>RefundArray</strong> container, which consists of an array of Half.com refunds.
 * 			
 * 
 * <p>Java class for RefundArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Refund" type="{urn:ebay:apis:eBLBaseComponents}RefundType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundArrayType", propOrder = {
    "refund"
})
public class RefundArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Refund")
    protected List<RefundType> refund;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RefundType }
     *     
     */
    public RefundType[] getRefund() {
        if (this.refund == null) {
            return new RefundType[ 0 ] ;
        }
        return ((RefundType[]) this.refund.toArray(new RefundType[this.refund.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RefundType }
     *     
     */
    public RefundType getRefund(int idx) {
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
     *     {@link RefundType }
     *     
     */
    public void setRefund(RefundType[] values) {
        this._getRefund().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.refund.add(values[i]);
        }
    }

    protected List<RefundType> _getRefund() {
        if (refund == null) {
            refund = new ArrayList<RefundType>();
        }
        return refund;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RefundType }
     *     
     */
    public RefundType setRefund(int idx, RefundType value) {
        return this.refund.set(idx, value);
    }

}
