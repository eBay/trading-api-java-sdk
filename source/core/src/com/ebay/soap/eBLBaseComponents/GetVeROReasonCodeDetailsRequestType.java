
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Retrieves details for VeRO reason codes and their descriptions. You can specify a
 * 				reason code ID to get details for a specific reason on the site specified in the
 * 				request header. If <strong>ReasonCodeID</strong> is not passed in the request, all reason codes are
 * 				returned. Set <strong>ReturnAllSites</strong> to <code>true</code> to retrieve reason codes for all sites.
 * 				You must be a member of the Verified Rights Owner (VeRO) Program to use this call.
 * 			
 * 
 * <p>Java class for GetVeROReasonCodeDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVeROReasonCodeDetailsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ReasonCodeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReturnAllSites" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVeROReasonCodeDetailsRequestType", propOrder = {
    "reasonCodeID",
    "returnAllSites"
})
public class GetVeROReasonCodeDetailsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ReasonCodeID")
    protected Long reasonCodeID;
    @XmlElement(name = "ReturnAllSites")
    protected Boolean returnAllSites;

    /**
     * Gets the value of the reasonCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReasonCodeID() {
        return reasonCodeID;
    }

    /**
     * Sets the value of the reasonCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReasonCodeID(Long value) {
        this.reasonCodeID = value;
    }

    /**
     * Gets the value of the returnAllSites property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnAllSites() {
        return returnAllSites;
    }

    /**
     * Sets the value of the returnAllSites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnAllSites(Boolean value) {
        this.returnAllSites = value;
    }

}
