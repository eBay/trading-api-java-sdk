
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Includes the authentication token for the user and the date it expires.
 * 			
 * 
 * <p>Java class for FetchTokenResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FetchTokenResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="eBayAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardExpirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RESTToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FetchTokenResponseType", propOrder = {
    "eBayAuthToken",
    "hardExpirationTime",
    "restToken"
})
public class FetchTokenResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String eBayAuthToken;
    @XmlElement(name = "HardExpirationTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar hardExpirationTime;
    @XmlElement(name = "RESTToken")
    protected String restToken;

    /**
     * Gets the value of the eBayAuthToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBayAuthToken() {
        return eBayAuthToken;
    }

    /**
     * Sets the value of the eBayAuthToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBayAuthToken(String value) {
        this.eBayAuthToken = value;
    }

    /**
     * Gets the value of the hardExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getHardExpirationTime() {
        return hardExpirationTime;
    }

    /**
     * Sets the value of the hardExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardExpirationTime(Calendar value) {
        this.hardExpirationTime = value;
    }

    /**
     * Gets the value of the restToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESTToken() {
        return restToken;
    }

    /**
     * Sets the value of the restToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESTToken(String value) {
        this.restToken = value;
    }

}
