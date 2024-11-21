
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used to provide details about an order line item being fulfilled by eBay or an eBay fulfillment partner.
 * 			
 * 
 * <p>Java class for FulfillmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FulfillmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FulfillmentBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FulfillmentRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfillmentType", propOrder = {
    "fulfillmentBy",
    "fulfillmentRefId"
})
public class FulfillmentType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FulfillmentBy")
    protected String fulfillmentBy;
    @XmlElement(name = "FulfillmentRefId")
    protected String fulfillmentRefId;

    /**
     * Gets the value of the fulfillmentBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentBy() {
        return fulfillmentBy;
    }

    /**
     * Sets the value of the fulfillmentBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentBy(String value) {
        this.fulfillmentBy = value;
    }

    /**
     * Gets the value of the fulfillmentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentRefId() {
        return fulfillmentRefId;
    }

    /**
     * Sets the value of the fulfillmentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentRefId(String value) {
        this.fulfillmentRefId = value;
    }

}
