
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for ExtendedProductFinderIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedProductFinderIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductFinderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductFinderBuySide" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedProductFinderIDType", propOrder = {
    "productFinderID",
    "productFinderBuySide"
})
public class ExtendedProductFinderIDType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ProductFinderID")
    protected Integer productFinderID;
    @XmlElement(name = "ProductFinderBuySide")
    protected Boolean productFinderBuySide;

    /**
     * Gets the value of the productFinderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductFinderID() {
        return productFinderID;
    }

    /**
     * Sets the value of the productFinderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductFinderID(Integer value) {
        this.productFinderID = value;
    }

    /**
     * Gets the value of the productFinderBuySide property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductFinderBuySide() {
        return productFinderBuySide;
    }

    /**
     * Sets the value of the productFinderBuySide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductFinderBuySide(Boolean value) {
        this.productFinderBuySide = value;
    }

}
