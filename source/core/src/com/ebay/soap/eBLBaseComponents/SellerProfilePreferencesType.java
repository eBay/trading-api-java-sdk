
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  Type defining the <b>SellerProfilePreferences</b> container. This container
 * 				consists of a flag that indicates whether or not the seller has opted into Business
 * 				Policies, as well as a list of Business Policies profiles that have been set up for the 
 * 				seller's account.
 * 			
 * 
 * <p>Java class for SellerProfilePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerProfilePreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellerProfileOptedIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SupportedSellerProfiles" type="{urn:ebay:apis:eBLBaseComponents}SupportedSellerProfilesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerProfilePreferencesType", propOrder = {
    "sellerProfileOptedIn",
    "supportedSellerProfiles"
})
public class SellerProfilePreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellerProfileOptedIn")
    protected Boolean sellerProfileOptedIn;
    @XmlElement(name = "SupportedSellerProfiles")
    protected SupportedSellerProfilesType supportedSellerProfiles;

    /**
     * Gets the value of the sellerProfileOptedIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerProfileOptedIn() {
        return sellerProfileOptedIn;
    }

    /**
     * Sets the value of the sellerProfileOptedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerProfileOptedIn(Boolean value) {
        this.sellerProfileOptedIn = value;
    }

    /**
     * Gets the value of the supportedSellerProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedSellerProfilesType }
     *     
     */
    public SupportedSellerProfilesType getSupportedSellerProfiles() {
        return supportedSellerProfiles;
    }

    /**
     * Sets the value of the supportedSellerProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedSellerProfilesType }
     *     
     */
    public void setSupportedSellerProfiles(SupportedSellerProfilesType value) {
        this.supportedSellerProfiles = value;
    }

}
