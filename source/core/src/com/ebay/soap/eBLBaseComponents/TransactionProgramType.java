
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
 * 				This type is used by the <b>Program</b> container, which provides details on whether the order line item has passed or failed the authenticity inspection.
 * 			
 * 
 * <p>Java class for TransactionProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionProgramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticityVerification" type="{urn:ebay:apis:eBLBaseComponents}AuthenticityVerificationType" minOccurs="0"/>
 *         &lt;element name="Fulfillment" type="{urn:ebay:apis:eBLBaseComponents}FulfillmentType" minOccurs="0"/>
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
@XmlType(name = "TransactionProgramType", propOrder = {
    "authenticityVerification",
    "fulfillment",
    "any"
})
public class TransactionProgramType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AuthenticityVerification")
    protected AuthenticityVerificationType authenticityVerification;
    @XmlElement(name = "Fulfillment")
    protected FulfillmentType fulfillment;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the authenticityVerification property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticityVerificationType }
     *     
     */
    public AuthenticityVerificationType getAuthenticityVerification() {
        return authenticityVerification;
    }

    /**
     * Sets the value of the authenticityVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticityVerificationType }
     *     
     */
    public void setAuthenticityVerification(AuthenticityVerificationType value) {
        this.authenticityVerification = value;
    }

    /**
     * Gets the value of the fulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentType }
     *     
     */
    public FulfillmentType getFulfillment() {
        return fulfillment;
    }

    /**
     * Sets the value of the fulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentType }
     *     
     */
    public void setFulfillment(FulfillmentType value) {
        this.fulfillment = value;
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
