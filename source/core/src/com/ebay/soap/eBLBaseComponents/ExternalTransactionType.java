
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
 * 				Container consisting of details related to payment of an eBay order on an external system. This container is only returned if order payment has been made on an external system. For <b>GetSellerTransaactions</b> and <b>GetItemTransactions</b>, this container is not returned for multiple line item orders.
 * 			
 * 
 * <p>Java class for ExternalTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalTransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FeeOrCreditAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentOrRefundAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ExternalTransactionStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentTransactionStatusCodeType" minOccurs="0"/>
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
@XmlType(name = "ExternalTransactionType", propOrder = {
    "externalTransactionID",
    "externalTransactionTime",
    "feeOrCreditAmount",
    "paymentOrRefundAmount",
    "externalTransactionStatus",
    "any"
})
public class ExternalTransactionType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ExternalTransactionID")
    protected String externalTransactionID;
    @XmlElement(name = "ExternalTransactionTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar externalTransactionTime;
    @XmlElement(name = "FeeOrCreditAmount")
    protected AmountType feeOrCreditAmount;
    @XmlElement(name = "PaymentOrRefundAmount")
    protected AmountType paymentOrRefundAmount;
    @XmlElement(name = "ExternalTransactionStatus")
    protected PaymentTransactionStatusCodeType externalTransactionStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the externalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransactionID() {
        return externalTransactionID;
    }

    /**
     * Sets the value of the externalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransactionID(String value) {
        this.externalTransactionID = value;
    }

    /**
     * Gets the value of the externalTransactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExternalTransactionTime() {
        return externalTransactionTime;
    }

    /**
     * Sets the value of the externalTransactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransactionTime(Calendar value) {
        this.externalTransactionTime = value;
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
     * Gets the value of the paymentOrRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentOrRefundAmount() {
        return paymentOrRefundAmount;
    }

    /**
     * Sets the value of the paymentOrRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentOrRefundAmount(AmountType value) {
        this.paymentOrRefundAmount = value;
    }

    /**
     * Gets the value of the externalTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionStatusCodeType }
     *     
     */
    public PaymentTransactionStatusCodeType getExternalTransactionStatus() {
        return externalTransactionStatus;
    }

    /**
     * Sets the value of the externalTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionStatusCodeType }
     *     
     */
    public void setExternalTransactionStatus(PaymentTransactionStatusCodeType value) {
        this.externalTransactionStatus = value;
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
