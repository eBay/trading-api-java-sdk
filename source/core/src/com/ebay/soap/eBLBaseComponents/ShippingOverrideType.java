
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         This type is reserved for internal or future use.
 * 
 *       
 * 
 * <p>Java class for ShippingOverrideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingOverrideType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingServiceCostOverrideList" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceCostOverrideListType" minOccurs="0"/>
 *         &lt;element name="DispatchTimeMaxOverride" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingOverrideType", propOrder = {
    "shippingServiceCostOverrideList",
    "dispatchTimeMaxOverride"
})
public class ShippingOverrideType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShippingServiceCostOverrideList")
    protected ShippingServiceCostOverrideListType shippingServiceCostOverrideList;
    @XmlElement(name = "DispatchTimeMaxOverride")
    protected Integer dispatchTimeMaxOverride;

    /**
     * Gets the value of the shippingServiceCostOverrideList property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceCostOverrideListType }
     *     
     */
    public ShippingServiceCostOverrideListType getShippingServiceCostOverrideList() {
        return shippingServiceCostOverrideList;
    }

    /**
     * Sets the value of the shippingServiceCostOverrideList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceCostOverrideListType }
     *     
     */
    public void setShippingServiceCostOverrideList(ShippingServiceCostOverrideListType value) {
        this.shippingServiceCostOverrideList = value;
    }

    /**
     * Gets the value of the dispatchTimeMaxOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDispatchTimeMaxOverride() {
        return dispatchTimeMaxOverride;
    }

    /**
     * Sets the value of the dispatchTimeMaxOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDispatchTimeMaxOverride(Integer value) {
        this.dispatchTimeMaxOverride = value;
    }

}
