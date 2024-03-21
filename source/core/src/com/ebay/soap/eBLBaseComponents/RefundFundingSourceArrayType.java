
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
 * <p>Java class for RefundFundingSourceArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundFundingSourceArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundFundingSource" type="{urn:ebay:apis:eBLBaseComponents}RefundFundingSourceType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RefundFundingSourceArrayType", propOrder = {
    "refundFundingSource",
    "any"
})
public class RefundFundingSourceArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RefundFundingSource")
    protected List<RefundFundingSourceType> refundFundingSource;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RefundFundingSourceType }
     *     
     */
    public RefundFundingSourceType[] getRefundFundingSource() {
        if (this.refundFundingSource == null) {
            return new RefundFundingSourceType[ 0 ] ;
        }
        return ((RefundFundingSourceType[]) this.refundFundingSource.toArray(new RefundFundingSourceType[this.refundFundingSource.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RefundFundingSourceType }
     *     
     */
    public RefundFundingSourceType getRefundFundingSource(int idx) {
        if (this.refundFundingSource == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.refundFundingSource.get(idx);
    }

    public int getRefundFundingSourceLength() {
        if (this.refundFundingSource == null) {
            return  0;
        }
        return this.refundFundingSource.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RefundFundingSourceType }
     *     
     */
    public void setRefundFundingSource(RefundFundingSourceType[] values) {
        this._getRefundFundingSource().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.refundFundingSource.add(values[i]);
        }
    }

    protected List<RefundFundingSourceType> _getRefundFundingSource() {
        if (refundFundingSource == null) {
            refundFundingSource = new ArrayList<RefundFundingSourceType>();
        }
        return refundFundingSource;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RefundFundingSourceType }
     *     
     */
    public RefundFundingSourceType setRefundFundingSource(int idx, RefundFundingSourceType value) {
        return this.refundFundingSource.set(idx, value);
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
