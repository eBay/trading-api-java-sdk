
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
 * 				This type contains details about the allocation of funds to one payee from a buyer payment for a specified order.
 * 			
 * 
 * <p>Java class for PaymentTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentTransactionStatusCodeType" minOccurs="0"/>
 *         &lt;element name="Payer" type="{urn:ebay:apis:eBLBaseComponents}UserIdentityType" minOccurs="0"/>
 *         &lt;element name="Payee" type="{urn:ebay:apis:eBLBaseComponents}UserIdentityType" minOccurs="0"/>
 *         &lt;element name="PaymentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{urn:ebay:apis:eBLBaseComponents}TransactionReferenceType" minOccurs="0"/>
 *         &lt;element name="FeeOrCreditAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentReferenceID" type="{urn:ebay:apis:eBLBaseComponents}TransactionReferenceType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PaymentTransactionType", propOrder = {
    "paymentStatus",
    "payer",
    "payee",
    "paymentTime",
    "paymentAmount",
    "referenceID",
    "feeOrCreditAmount",
    "paymentReferenceID",
    "any"
})
public class PaymentTransactionType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PaymentStatus")
    protected PaymentTransactionStatusCodeType paymentStatus;
    @XmlElement(name = "Payer")
    protected UserIdentityType payer;
    @XmlElement(name = "Payee")
    protected UserIdentityType payee;
    @XmlElement(name = "PaymentTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar paymentTime;
    @XmlElement(name = "PaymentAmount")
    protected AmountType paymentAmount;
    @XmlElement(name = "ReferenceID")
    protected TransactionReferenceType referenceID;
    @XmlElement(name = "FeeOrCreditAmount")
    protected AmountType feeOrCreditAmount;
    @XmlElement(name = "PaymentReferenceID")
    protected List<TransactionReferenceType> paymentReferenceID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionStatusCodeType }
     *     
     */
    public PaymentTransactionStatusCodeType getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionStatusCodeType }
     *     
     */
    public void setPaymentStatus(PaymentTransactionStatusCodeType value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentityType }
     *     
     */
    public UserIdentityType getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentityType }
     *     
     */
    public void setPayer(UserIdentityType value) {
        this.payer = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentityType }
     *     
     */
    public UserIdentityType getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentityType }
     *     
     */
    public void setPayee(UserIdentityType value) {
        this.payee = value;
    }

    /**
     * Gets the value of the paymentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPaymentTime() {
        return paymentTime;
    }

    /**
     * Sets the value of the paymentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTime(Calendar value) {
        this.paymentTime = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentAmount(AmountType value) {
        this.paymentAmount = value;
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
     *     {@link TransactionReferenceType }
     *     
     */
    public TransactionReferenceType[] getPaymentReferenceID() {
        if (this.paymentReferenceID == null) {
            return new TransactionReferenceType[ 0 ] ;
        }
        return ((TransactionReferenceType[]) this.paymentReferenceID.toArray(new TransactionReferenceType[this.paymentReferenceID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link TransactionReferenceType }
     *     
     */
    public TransactionReferenceType getPaymentReferenceID(int idx) {
        if (this.paymentReferenceID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.paymentReferenceID.get(idx);
    }

    public int getPaymentReferenceIDLength() {
        if (this.paymentReferenceID == null) {
            return  0;
        }
        return this.paymentReferenceID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link TransactionReferenceType }
     *     
     */
    public void setPaymentReferenceID(TransactionReferenceType[] values) {
        this._getPaymentReferenceID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.paymentReferenceID.add(values[i]);
        }
    }

    protected List<TransactionReferenceType> _getPaymentReferenceID() {
        if (paymentReferenceID == null) {
            paymentReferenceID = new ArrayList<TransactionReferenceType>();
        }
        return paymentReferenceID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferenceType }
     *     
     */
    public TransactionReferenceType setPaymentReferenceID(int idx, TransactionReferenceType value) {
        return this.paymentReferenceID.set(idx, value);
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
