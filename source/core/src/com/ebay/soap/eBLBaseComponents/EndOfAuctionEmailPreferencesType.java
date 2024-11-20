
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
import org.w3c.dom.Element;


/**
 * 
 * 				Contains the seller's preferences for the email that can be sent to the winner of an auction listing.
 * 			
 * 
 * <p>Java class for EndOfAuctionEmailPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndOfAuctionEmailPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TemplateText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="LogoType" type="{urn:ebay:apis:eBLBaseComponents}EndOfAuctionLogoTypeCodeType" minOccurs="0"/>
 *         &lt;element name="EmailCustomized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TextCustomized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LogoCustomized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CopyEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "EndOfAuctionEmailPreferencesType", propOrder = {
    "templateText",
    "logoURL",
    "logoType",
    "emailCustomized",
    "textCustomized",
    "logoCustomized",
    "copyEmail",
    "any"
})
public class EndOfAuctionEmailPreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TemplateText")
    protected String templateText;
    @XmlElement(name = "LogoURL")
    @XmlSchemaType(name = "anyURI")
    protected String logoURL;
    @XmlElement(name = "LogoType")
    protected EndOfAuctionLogoTypeCodeType logoType;
    @XmlElement(name = "EmailCustomized")
    protected Boolean emailCustomized;
    @XmlElement(name = "TextCustomized")
    protected Boolean textCustomized;
    @XmlElement(name = "LogoCustomized")
    protected Boolean logoCustomized;
    @XmlElement(name = "CopyEmail")
    protected Boolean copyEmail;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the templateText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateText() {
        return templateText;
    }

    /**
     * Sets the value of the templateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateText(String value) {
        this.templateText = value;
    }

    /**
     * Gets the value of the logoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoURL() {
        return logoURL;
    }

    /**
     * Sets the value of the logoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoURL(String value) {
        this.logoURL = value;
    }

    /**
     * Gets the value of the logoType property.
     * 
     * @return
     *     possible object is
     *     {@link EndOfAuctionLogoTypeCodeType }
     *     
     */
    public EndOfAuctionLogoTypeCodeType getLogoType() {
        return logoType;
    }

    /**
     * Sets the value of the logoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndOfAuctionLogoTypeCodeType }
     *     
     */
    public void setLogoType(EndOfAuctionLogoTypeCodeType value) {
        this.logoType = value;
    }

    /**
     * Gets the value of the emailCustomized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailCustomized() {
        return emailCustomized;
    }

    /**
     * Sets the value of the emailCustomized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailCustomized(Boolean value) {
        this.emailCustomized = value;
    }

    /**
     * Gets the value of the textCustomized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextCustomized() {
        return textCustomized;
    }

    /**
     * Sets the value of the textCustomized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextCustomized(Boolean value) {
        this.textCustomized = value;
    }

    /**
     * Gets the value of the logoCustomized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogoCustomized() {
        return logoCustomized;
    }

    /**
     * Sets the value of the logoCustomized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogoCustomized(Boolean value) {
        this.logoCustomized = value;
    }

    /**
     * Gets the value of the copyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyEmail() {
        return copyEmail;
    }

    /**
     * Sets the value of the copyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyEmail(Boolean value) {
        this.copyEmail = value;
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
