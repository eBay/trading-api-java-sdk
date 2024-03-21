
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Type defining the <strong>Refund</strong> container, which consists of detailed information on an In-Store Pickup item refund.
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> At this time, the In-Store Pickup feature is generally only available to large retail merchants in US, and can only be applied to multi-quantity, fixed-price listings.
 * 				</span>
 * 			
 * 
 * <p>Java class for RefundTransactionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundTransactionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentTransactionStatusCodeType" minOccurs="0"/>
 *         &lt;element name="RefundType" type="{urn:ebay:apis:eBLBaseComponents}RefundSourceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="RefundTo" type="{urn:ebay:apis:eBLBaseComponents}UserIdentityType" minOccurs="0"/>
 *         &lt;element name="RefundTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{urn:ebay:apis:eBLBaseComponents}TransactionReferenceType" minOccurs="0"/>
 *         &lt;element name="FeeOrCreditAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
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
@XmlType(name = "RefundTransactionInfoType", propOrder = {
    "refundStatus",
    "refundType",
    "refundTo",
    "refundTime",
    "refundAmount",
    "referenceID",
    "feeOrCreditAmount",
    "any"
})
public class RefundTransactionInfoType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RefundStatus")
    protected PaymentTransactionStatusCodeType refundStatus;
    @XmlElement(name = "RefundType")
    protected RefundSourceTypeCodeType refundType;
    @XmlElement(name = "RefundTo")
    protected UserIdentityType refundTo;
    @XmlElement(name = "RefundTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar refundTime;
    @XmlElement(name = "RefundAmount")
    protected AmountType refundAmount;
    @XmlElement(name = "ReferenceID")
    protected TransactionReferenceType referenceID;
    @XmlElement(name = "FeeOrCreditAmount")
    protected AmountType feeOrCreditAmount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the refundStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionStatusCodeType }
     *     
     */
    public PaymentTransactionStatusCodeType getRefundStatus() {
        return refundStatus;
    }

    /**
     * Sets the value of the refundStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionStatusCodeType }
     *     
     */
    public void setRefundStatus(PaymentTransactionStatusCodeType value) {
        this.refundStatus = value;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link RefundSourceTypeCodeType }
     *     
     */
    public RefundSourceTypeCodeType getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundSourceTypeCodeType }
     *     
     */
    public void setRefundType(RefundSourceTypeCodeType value) {
        this.refundType = value;
    }

    /**
     * Gets the value of the refundTo property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentityType }
     *     
     */
    public UserIdentityType getRefundTo() {
        return refundTo;
    }

    /**
     * Sets the value of the refundTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentityType }
     *     
     */
    public void setRefundTo(UserIdentityType value) {
        this.refundTo = value;
    }

    /**
     * Gets the value of the refundTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRefundTime() {
        return refundTime;
    }

    /**
     * Sets the value of the refundTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundTime(Calendar value) {
        this.refundTime = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRefundAmount(AmountType value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferenceType }
     *     
     */
    public TransactionReferenceType getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferenceType }
     *     
     */
    public void setReferenceID(TransactionReferenceType value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the feeOrCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFeeOrCreditAmount() {
        return feeOrCreditAmount;
    }

    /**
     * Sets the value of the feeOrCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFeeOrCreditAmount(AmountType value) {
        this.feeOrCreditAmount = value;
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
