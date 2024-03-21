
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is used by the <b>DigitalDeliverySelected</b>	container that is returned by <b>GetOrders</b> and other order management calls. The <b>DigitalDeliverySelected</b> container is only applicable and returned if the buyer purchased a digital gift card for themselves, or is giving the digital gift card to someone else as a gift.
 * 			
 * 
 * <p>Java class for DigitalDeliverySelectedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalDeliverySelectedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{urn:ebay:apis:eBLBaseComponents}DeliveryStatusType" minOccurs="0"/>
 *         &lt;element name="DeliveryDetails" type="{urn:ebay:apis:eBLBaseComponents}DeliveryDetailsType" minOccurs="0"/>
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
@XmlType(name = "DigitalDeliverySelectedType", propOrder = {
    "deliveryMethod",
    "deliveryStatus",
    "deliveryDetails",
    "any"
})
public class DigitalDeliverySelectedType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DeliveryMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryMethod;
    @XmlElement(name = "DeliveryStatus")
    protected DeliveryStatusType deliveryStatus;
    @XmlElement(name = "DeliveryDetails")
    protected DeliveryDetailsType deliveryDetails;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryStatusType }
     *     
     */
    public DeliveryStatusType getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryStatusType }
     *     
     */
    public void setDeliveryStatus(DeliveryStatusType value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the deliveryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDetailsType }
     *     
     */
    public DeliveryDetailsType getDeliveryDetails() {
        return deliveryDetails;
    }

    /**
     * Sets the value of the deliveryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDetailsType }
     *     
     */
    public void setDeliveryDetails(DeliveryDetailsType value) {
        this.deliveryDetails = value;
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
