
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
 * 				This type is used to provide contact hours for a seller of a Classified Ad listing, including motor vehicles. There is also a boolean field in this type that indicates whether or not potential buyer can contact the seller by email.
 * 		
 * 
 * <p>Java class for ExtendedContactDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedContactDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactHoursDetails" type="{urn:ebay:apis:eBLBaseComponents}ContactHoursDetailsType" minOccurs="0"/>
 *         &lt;element name="ClassifiedAdContactByEmailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PayPerLeadPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ExtendedContactDetailsType", propOrder = {
    "contactHoursDetails",
    "classifiedAdContactByEmailEnabled",
    "payPerLeadPhoneNumber",
    "any"
})
public class ExtendedContactDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ContactHoursDetails")
    protected ContactHoursDetailsType contactHoursDetails;
    @XmlElement(name = "ClassifiedAdContactByEmailEnabled")
    protected Boolean classifiedAdContactByEmailEnabled;
    @XmlElement(name = "PayPerLeadPhoneNumber")
    protected String payPerLeadPhoneNumber;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the contactHoursDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactHoursDetailsType }
     *     
     */
    public ContactHoursDetailsType getContactHoursDetails() {
        return contactHoursDetails;
    }

    /**
     * Sets the value of the contactHoursDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactHoursDetailsType }
     *     
     */
    public void setContactHoursDetails(ContactHoursDetailsType value) {
        this.contactHoursDetails = value;
    }

    /**
     * Gets the value of the classifiedAdContactByEmailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClassifiedAdContactByEmailEnabled() {
        return classifiedAdContactByEmailEnabled;
    }

    /**
     * Sets the value of the classifiedAdContactByEmailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClassifiedAdContactByEmailEnabled(Boolean value) {
        this.classifiedAdContactByEmailEnabled = value;
    }

    /**
     * Gets the value of the payPerLeadPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPerLeadPhoneNumber() {
        return payPerLeadPhoneNumber;
    }

    /**
     * Sets the value of the payPerLeadPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPerLeadPhoneNumber(String value) {
        this.payPerLeadPhoneNumber = value;
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
