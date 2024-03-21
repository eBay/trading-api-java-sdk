
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
 * <p>Java class for RefundLineArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundLineArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundLine" type="{urn:ebay:apis:eBLBaseComponents}RefundLineType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RefundLineArrayType", propOrder = {
    "refundLine",
    "any"
})
public class RefundLineArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RefundLine")
    protected List<RefundLineType> refundLine;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RefundLineType }
     *     
     */
    public RefundLineType[] getRefundLine() {
        if (this.refundLine == null) {
            return new RefundLineType[ 0 ] ;
        }
        return ((RefundLineType[]) this.refundLine.toArray(new RefundLineType[this.refundLine.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RefundLineType }
     *     
     */
    public RefundLineType getRefundLine(int idx) {
        if (this.refundLine == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.refundLine.get(idx);
    }

    public int getRefundLineLength() {
        if (this.refundLine == null) {
            return  0;
        }
        return this.refundLine.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RefundLineType }
     *     
     */
    public void setRefundLine(RefundLineType[] values) {
        this._getRefundLine().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.refundLine.add(values[i]);
        }
    }

    protected List<RefundLineType> _getRefundLine() {
        if (refundLine == null) {
            refundLine = new ArrayList<RefundLineType>();
        }
        return refundLine;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RefundLineType }
     *     
     */
    public RefundLineType setRefundLine(int idx, RefundLineType value) {
        return this.refundLine.set(idx, value);
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
