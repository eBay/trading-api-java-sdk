
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
 * 				This type defines the <b>PaymentHoldDetails</b> container, which consists of information related to eBay holding the payment proceeds for an order, including the reason why eBay is holding the money, the expected release date of the funds to the seller, and possible action(s) the seller can take to expedite the release of funds.
 * 			
 * 
 * <p>Java class for PaymentHoldDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentHoldDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpectedReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequiredSellerActionArray" type="{urn:ebay:apis:eBLBaseComponents}RequiredSellerActionArrayType" minOccurs="0"/>
 *         &lt;element name="NumOfReqSellerActions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentHoldReason" type="{urn:ebay:apis:eBLBaseComponents}PaymentHoldReasonCodeType" minOccurs="0"/>
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
@XmlType(name = "PaymentHoldDetailType", propOrder = {
    "expectedReleaseDate",
    "requiredSellerActionArray",
    "numOfReqSellerActions",
    "paymentHoldReason",
    "any"
})
public class PaymentHoldDetailType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ExpectedReleaseDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar expectedReleaseDate;
    @XmlElement(name = "RequiredSellerActionArray")
    protected RequiredSellerActionArrayType requiredSellerActionArray;
    @XmlElement(name = "NumOfReqSellerActions")
    protected Integer numOfReqSellerActions;
    @XmlElement(name = "PaymentHoldReason")
    protected PaymentHoldReasonCodeType paymentHoldReason;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the expectedReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpectedReleaseDate() {
        return expectedReleaseDate;
    }

    /**
     * Sets the value of the expectedReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedReleaseDate(Calendar value) {
        this.expectedReleaseDate = value;
    }

    /**
     * Gets the value of the requiredSellerActionArray property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredSellerActionArrayType }
     *     
     */
    public RequiredSellerActionArrayType getRequiredSellerActionArray() {
        return requiredSellerActionArray;
    }

    /**
     * Sets the value of the requiredSellerActionArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredSellerActionArrayType }
     *     
     */
    public void setRequiredSellerActionArray(RequiredSellerActionArrayType value) {
        this.requiredSellerActionArray = value;
    }

    /**
     * Gets the value of the numOfReqSellerActions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOfReqSellerActions() {
        return numOfReqSellerActions;
    }

    /**
     * Sets the value of the numOfReqSellerActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOfReqSellerActions(Integer value) {
        this.numOfReqSellerActions = value;
    }

    /**
     * Gets the value of the paymentHoldReason property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHoldReasonCodeType }
     *     
     */
    public PaymentHoldReasonCodeType getPaymentHoldReason() {
        return paymentHoldReason;
    }

    /**
     * Sets the value of the paymentHoldReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHoldReasonCodeType }
     *     
     */
    public void setPaymentHoldReason(PaymentHoldReasonCodeType value) {
        this.paymentHoldReason = value;
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
