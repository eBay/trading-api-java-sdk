
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Enables a seller to add custom Ask Seller a Question (ASQ) subjects to their
 * 				Ask a Question page, or to reset any custom subjects to their default values.
 * 			
 * 
 * <p>Java class for SetMessagePreferencesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetMessagePreferencesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ASQPreferences" type="{urn:ebay:apis:eBLBaseComponents}ASQPreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetMessagePreferencesRequestType", propOrder = {
    "asqPreferences"
})
public class SetMessagePreferencesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ASQPreferences")
    protected ASQPreferencesType asqPreferences;

    /**
     * Gets the value of the asqPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ASQPreferencesType }
     *     
     */
    public ASQPreferencesType getASQPreferences() {
        return asqPreferences;
    }

    /**
     * Sets the value of the asqPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASQPreferencesType }
     *     
     */
    public void setASQPreferences(ASQPreferencesType value) {
        this.asqPreferences = value;
    }

}
