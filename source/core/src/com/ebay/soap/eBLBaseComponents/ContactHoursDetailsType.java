
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
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * 
 * 			Type defining the <b>ContactHoursDetails</b> container, which is used in Add/Revise/Relist calls to provide contact hours for the owner of a Classified Ad. The <b>ContactHoursDetails</b> container is only applicable to Classified Ad listings.
 * 		
 * 
 * <p>Java class for ContactHoursDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactHoursDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeZoneID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hours1Days" type="{urn:ebay:apis:eBLBaseComponents}DaysCodeType" minOccurs="0"/>
 *         &lt;element name="Hours1AnyTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hours1From" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Hours1To" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Hours2Days" type="{urn:ebay:apis:eBLBaseComponents}DaysCodeType" minOccurs="0"/>
 *         &lt;element name="Hours2AnyTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Hours2From" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="Hours2To" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
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
@XmlType(name = "ContactHoursDetailsType", propOrder = {
    "timeZoneID",
    "hours1Days",
    "hours1AnyTime",
    "hours1From",
    "hours1To",
    "hours2Days",
    "hours2AnyTime",
    "hours2From",
    "hours2To",
    "any"
})
public class ContactHoursDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TimeZoneID")
    protected String timeZoneID;
    @XmlElement(name = "Hours1Days")
    protected DaysCodeType hours1Days;
    @XmlElement(name = "Hours1AnyTime")
    protected Boolean hours1AnyTime;
    @XmlElement(name = "Hours1From")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hours1From;
    @XmlElement(name = "Hours1To")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hours1To;
    @XmlElement(name = "Hours2Days")
    protected DaysCodeType hours2Days;
    @XmlElement(name = "Hours2AnyTime")
    protected Boolean hours2AnyTime;
    @XmlElement(name = "Hours2From")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hours2From;
    @XmlElement(name = "Hours2To")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar hours2To;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the timeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Sets the value of the timeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneID(String value) {
        this.timeZoneID = value;
    }

    /**
     * Gets the value of the hours1Days property.
     * 
     * @return
     *     possible object is
     *     {@link DaysCodeType }
     *     
     */
    public DaysCodeType getHours1Days() {
        return hours1Days;
    }

    /**
     * Sets the value of the hours1Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysCodeType }
     *     
     */
    public void setHours1Days(DaysCodeType value) {
        this.hours1Days = value;
    }

    /**
     * Gets the value of the hours1AnyTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHours1AnyTime() {
        return hours1AnyTime;
    }

    /**
     * Sets the value of the hours1AnyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHours1AnyTime(Boolean value) {
        this.hours1AnyTime = value;
    }

    /**
     * Gets the value of the hours1From property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHours1From() {
        return hours1From;
    }

    /**
     * Sets the value of the hours1From property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHours1From(XMLGregorianCalendar value) {
        this.hours1From = value;
    }

    /**
     * Gets the value of the hours1To property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHours1To() {
        return hours1To;
    }

    /**
     * Sets the value of the hours1To property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHours1To(XMLGregorianCalendar value) {
        this.hours1To = value;
    }

    /**
     * Gets the value of the hours2Days property.
     * 
     * @return
     *     possible object is
     *     {@link DaysCodeType }
     *     
     */
    public DaysCodeType getHours2Days() {
        return hours2Days;
    }

    /**
     * Sets the value of the hours2Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysCodeType }
     *     
     */
    public void setHours2Days(DaysCodeType value) {
        this.hours2Days = value;
    }

    /**
     * Gets the value of the hours2AnyTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHours2AnyTime() {
        return hours2AnyTime;
    }

    /**
     * Sets the value of the hours2AnyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHours2AnyTime(Boolean value) {
        this.hours2AnyTime = value;
    }

    /**
     * Gets the value of the hours2From property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHours2From() {
        return hours2From;
    }

    /**
     * Sets the value of the hours2From property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHours2From(XMLGregorianCalendar value) {
        this.hours2From = value;
    }

    /**
     * Gets the value of the hours2To property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHours2To() {
        return hours2To;
    }

    /**
     * Sets the value of the hours2To property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHours2To(XMLGregorianCalendar value) {
        this.hours2To = value;
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
