
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
 * 				Security header used for SOAP API calls.
 * 			
 * 
 * <p>Java class for CustomSecurityHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomSecurityHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eBayAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardExpirationWarning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Credentials" type="{urn:ebay:apis:eBLBaseComponents}UserIdPasswordType" minOccurs="0"/>
 *         &lt;element name="NotificationSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CustomSecurityHeaderType", propOrder = {
    "eBayAuthToken",
    "hardExpirationWarning",
    "credentials",
    "notificationSignature",
    "any"
})
public class CustomSecurityHeaderType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String eBayAuthToken;
    @XmlElement(name = "HardExpirationWarning")
    protected String hardExpirationWarning;
    @XmlElement(name = "Credentials")
    protected UserIdPasswordType credentials;
    @XmlElement(name = "NotificationSignature")
    protected String notificationSignature;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the hardExpirationWarning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardExpirationWarning() {
        return hardExpirationWarning;
    }

    /**
     * Sets the value of the hardExpirationWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardExpirationWarning(String value) {
        this.hardExpirationWarning = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdPasswordType }
     *     
     */
    public UserIdPasswordType getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdPasswordType }
     *     
     */
    public void setCredentials(UserIdPasswordType value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the notificationSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationSignature() {
        return notificationSignature;
    }

    /**
     * Sets the value of the notificationSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationSignature(String value) {
        this.notificationSignature = value;
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
