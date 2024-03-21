
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
 * 				Type defining the <b>CheckoutStatus</b> container that is returned in
 * 				<b>GetOrders</b> and <b>GetOrderTransactions</b> to indicate
 * 				the current checkout status of the order.
 * 			
 * 
 * <p>Java class for CheckoutStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckoutStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eBayPaymentStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="LastModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}CompleteStatusCodeType" minOccurs="0"/>
 *         &lt;element name="IntegratedMerchantCreditCardEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayPaymentMismatchDetails" type="{urn:ebay:apis:eBLBaseComponents}eBayPaymentMismatchDetailsType" minOccurs="0"/>
 *         &lt;element name="PaymentInstrument" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentInstrumentCodeType" minOccurs="0"/>
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
@XmlType(name = "CheckoutStatusType", propOrder = {
    "eBayPaymentStatus",
    "lastModifiedTime",
    "paymentMethod",
    "status",
    "integratedMerchantCreditCardEnabled",
    "eBayPaymentMismatchDetails",
    "paymentInstrument",
    "any"
})
public class CheckoutStatusType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected PaymentStatusCodeType eBayPaymentStatus;
    @XmlElement(name = "LastModifiedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModifiedTime;
    @XmlElement(name = "PaymentMethod")
    protected BuyerPaymentMethodCodeType paymentMethod;
    @XmlElement(name = "Status")
    protected CompleteStatusCodeType status;
    @XmlElement(name = "IntegratedMerchantCreditCardEnabled")
    protected Boolean integratedMerchantCreditCardEnabled;
    protected EBayPaymentMismatchDetailsType eBayPaymentMismatchDetails;
    @XmlElement(name = "PaymentInstrument")
    protected BuyerPaymentInstrumentCodeType paymentInstrument;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eBayPaymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCodeType }
     *     
     */
    public PaymentStatusCodeType getEBayPaymentStatus() {
        return eBayPaymentStatus;
    }

    /**
     * Sets the value of the eBayPaymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCodeType }
     *     
     */
    public void setEBayPaymentStatus(PaymentStatusCodeType value) {
        this.eBayPaymentStatus = value;
    }

    /**
     * Gets the value of the lastModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * Sets the value of the lastModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedTime(Calendar value) {
        this.lastModifiedTime = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public BuyerPaymentMethodCodeType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPaymentMethodCodeType }
     *     
     */
    public void setPaymentMethod(BuyerPaymentMethodCodeType value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CompleteStatusCodeType }
     *     
     */
    public CompleteStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompleteStatusCodeType }
     *     
     */
    public void setStatus(CompleteStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedMerchantCreditCardEnabled() {
        return integratedMerchantCreditCardEnabled;
    }

    /**
     * Sets the value of the integratedMerchantCreditCardEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedMerchantCreditCardEnabled(Boolean value) {
        this.integratedMerchantCreditCardEnabled = value;
    }

    /**
     * Gets the value of the eBayPaymentMismatchDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EBayPaymentMismatchDetailsType }
     *     
     */
    public EBayPaymentMismatchDetailsType getEBayPaymentMismatchDetails() {
        return eBayPaymentMismatchDetails;
    }

    /**
     * Sets the value of the eBayPaymentMismatchDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBayPaymentMismatchDetailsType }
     *     
     */
    public void setEBayPaymentMismatchDetails(EBayPaymentMismatchDetailsType value) {
        this.eBayPaymentMismatchDetails = value;
    }

    /**
     * Gets the value of the paymentInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPaymentInstrumentCodeType }
     *     
     */
    public BuyerPaymentInstrumentCodeType getPaymentInstrument() {
        return paymentInstrument;
    }

    /**
     * Sets the value of the paymentInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPaymentInstrumentCodeType }
     *     
     */
    public void setPaymentInstrument(BuyerPaymentInstrumentCodeType value) {
        this.paymentInstrument = value;
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
