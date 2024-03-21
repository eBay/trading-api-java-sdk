
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
 * <p>Java class for RefundFundingSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundFundingSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefundingSourceType" type="{urn:ebay:apis:eBLBaseComponents}RefundingSourceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="SellerExternalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerExternalTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RefundFundingSourceType", propOrder = {
    "refundingSourceType",
    "accountNumber",
    "refundAmount",
    "sellerExternalTransactionID",
    "buyerExternalTransactionID",
    "any"
})
public class RefundFundingSourceType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RefundingSourceType")
    protected RefundingSourceTypeCodeType refundingSourceType;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "RefundAmount")
    protected AmountType refundAmount;
    @XmlElement(name = "SellerExternalTransactionID")
    protected String sellerExternalTransactionID;
    @XmlElement(name = "BuyerExternalTransactionID")
    protected String buyerExternalTransactionID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the refundingSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link RefundingSourceTypeCodeType }
     *     
     */
    public RefundingSourceTypeCodeType getRefundingSourceType() {
        return refundingSourceType;
    }

    /**
     * Sets the value of the refundingSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundingSourceTypeCodeType }
     *     
     */
    public void setRefundingSourceType(RefundingSourceTypeCodeType value) {
        this.refundingSourceType = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
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
     * Gets the value of the sellerExternalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerExternalTransactionID() {
        return sellerExternalTransactionID;
    }

    /**
     * Sets the value of the sellerExternalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerExternalTransactionID(String value) {
        this.sellerExternalTransactionID = value;
    }

    /**
     * Gets the value of the buyerExternalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerExternalTransactionID() {
        return buyerExternalTransactionID;
    }

    /**
     * Sets the value of the buyerExternalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerExternalTransactionID(String value) {
        this.buyerExternalTransactionID = value;
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
