
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
 * 				This type defines the <strong>MonetaryDetails</strong> container, which consists of detailed information about one or more exchanges of funds that occur between the buyer, seller, eBay, and eBay partners during the lifecycle of an order, as well as detailed information about a merchant's refund (or store credit) to a buyer who has returned an In-Store Pickup item. 
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> At this time, the In-Store Pickup feature is generally only available to large retail merchants, and can only be applied to multi-quantity, fixed-price listings. 
 * 				</span>
 * 			
 * 
 * <p>Java class for PaymentsInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentsInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Payments" type="{urn:ebay:apis:eBLBaseComponents}PaymentInformationType" minOccurs="0"/>
 *         &lt;element name="Refunds" type="{urn:ebay:apis:eBLBaseComponents}RefundInformationType" minOccurs="0"/>
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
@XmlType(name = "PaymentsInformationType", propOrder = {
    "payments",
    "refunds",
    "any"
})
public class PaymentsInformationType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Payments")
    protected PaymentInformationType payments;
    @XmlElement(name = "Refunds")
    protected RefundInformationType refunds;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformationType }
     *     
     */
    public PaymentInformationType getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformationType }
     *     
     */
    public void setPayments(PaymentInformationType value) {
        this.payments = value;
    }

    /**
     * Gets the value of the refunds property.
     * 
     * @return
     *     possible object is
     *     {@link RefundInformationType }
     *     
     */
    public RefundInformationType getRefunds() {
        return refunds;
    }

    /**
     * Sets the value of the refunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundInformationType }
     *     
     */
    public void setRefunds(RefundInformationType value) {
        this.refunds = value;
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
