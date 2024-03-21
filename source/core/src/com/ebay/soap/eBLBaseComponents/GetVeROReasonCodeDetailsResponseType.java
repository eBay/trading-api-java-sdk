
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Base response of the <strong>GetVeROReasonCodeDetails</strong> call. This response will consists of one or more VeRO Program copyright/intellectual property infringement violation types.
 * 			
 * 
 * <p>Java class for GetVeROReasonCodeDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVeROReasonCodeDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="VeROReasonCodeDetails" type="{urn:ebay:apis:eBLBaseComponents}VeROReasonCodeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVeROReasonCodeDetailsResponseType", propOrder = {
    "veROReasonCodeDetails"
})
public class GetVeROReasonCodeDetailsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "VeROReasonCodeDetails")
    protected VeROReasonCodeDetailsType veROReasonCodeDetails;

    /**
     * Gets the value of the veROReasonCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VeROReasonCodeDetailsType }
     *     
     */
    public VeROReasonCodeDetailsType getVeROReasonCodeDetails() {
        return veROReasonCodeDetails;
    }

    /**
     * Sets the value of the veROReasonCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeROReasonCodeDetailsType }
     *     
     */
    public void setVeROReasonCodeDetails(VeROReasonCodeDetailsType value) {
        this.veROReasonCodeDetails = value;
    }

}
