
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				This type includes the acknowledgement of the date and time when an eBay listing was ended due to the call to <b>EndItems</b>.
 * 			
 * 
 * <p>Java class for EndItemResponseContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndItemResponseContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errors" type="{urn:ebay:apis:eBLBaseComponents}ErrorType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "EndItemResponseContainerType", propOrder = {
    "endTime",
    "correlationID",
    "errors",
    "any"
})
public class EndItemResponseContainerType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTime;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "Errors")
    protected List<ErrorType> errors;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(Calendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ErrorType }
     *     
     */
    public ErrorType[] getErrors() {
        if (this.errors == null) {
            return new ErrorType[ 0 ] ;
        }
        return ((ErrorType[]) this.errors.toArray(new ErrorType[this.errors.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrors(int idx) {
        if (this.errors == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.errors.get(idx);
    }

    public int getErrorsLength() {
        if (this.errors == null) {
            return  0;
        }
        return this.errors.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ErrorType }
     *     
     */
    public void setErrors(ErrorType[] values) {
        this._getErrors().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.errors.add(values[i]);
        }
    }

    protected List<ErrorType> _getErrors() {
        if (errors == null) {
            errors = new ArrayList<ErrorType>();
        }
        return errors;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType setErrors(int idx, ErrorType value) {
        return this.errors.set(idx, value);
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
