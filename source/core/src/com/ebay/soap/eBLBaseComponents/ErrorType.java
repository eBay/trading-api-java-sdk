
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				These are request errors (as opposed to system errors) that occur due to problems
 * 				with business-level data (e.g., an invalid combination of arguments) that
 * 				the application passed in.
 * 			
 * 
 * <p>Java class for ErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShortMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="UserDisplayHint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SeverityCode" type="{urn:ebay:apis:eBLBaseComponents}SeverityCodeType" minOccurs="0"/>
 *         &lt;element name="ErrorParameters" type="{urn:ebay:apis:eBLBaseComponents}ErrorParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ErrorClassification" type="{urn:ebay:apis:eBLBaseComponents}ErrorClassificationCodeType" minOccurs="0"/>
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
@XmlType(name = "ErrorType", propOrder = {
    "shortMessage",
    "longMessage",
    "errorCode",
    "userDisplayHint",
    "severityCode",
    "errorParameters",
    "errorClassification",
    "any"
})
public class ErrorType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShortMessage")
    protected String shortMessage;
    @XmlElement(name = "LongMessage")
    protected String longMessage;
    @XmlElement(name = "ErrorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String errorCode;
    @XmlElement(name = "UserDisplayHint")
    protected Boolean userDisplayHint;
    @XmlElement(name = "SeverityCode")
    protected SeverityCodeType severityCode;
    @XmlElement(name = "ErrorParameters")
    protected List<ErrorParameterType> errorParameters;
    @XmlElement(name = "ErrorClassification")
    protected ErrorClassificationCodeType errorClassification;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the shortMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMessage() {
        return shortMessage;
    }

    /**
     * Sets the value of the shortMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMessage(String value) {
        this.shortMessage = value;
    }

    /**
     * Gets the value of the longMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongMessage() {
        return longMessage;
    }

    /**
     * Sets the value of the longMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongMessage(String value) {
        this.longMessage = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the userDisplayHint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserDisplayHint() {
        return userDisplayHint;
    }

    /**
     * Sets the value of the userDisplayHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserDisplayHint(Boolean value) {
        this.userDisplayHint = value;
    }

    /**
     * Gets the value of the severityCode property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityCodeType }
     *     
     */
    public SeverityCodeType getSeverityCode() {
        return severityCode;
    }

    /**
     * Sets the value of the severityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityCodeType }
     *     
     */
    public void setSeverityCode(SeverityCodeType value) {
        this.severityCode = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ErrorParameterType }
     *     
     */
    public ErrorParameterType[] getErrorParameters() {
        if (this.errorParameters == null) {
            return new ErrorParameterType[ 0 ] ;
        }
        return ((ErrorParameterType[]) this.errorParameters.toArray(new ErrorParameterType[this.errorParameters.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ErrorParameterType }
     *     
     */
    public ErrorParameterType getErrorParameters(int idx) {
        if (this.errorParameters == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.errorParameters.get(idx);
    }

    public int getErrorParametersLength() {
        if (this.errorParameters == null) {
            return  0;
        }
        return this.errorParameters.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ErrorParameterType }
     *     
     */
    public void setErrorParameters(ErrorParameterType[] values) {
        this._getErrorParameters().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.errorParameters.add(values[i]);
        }
    }

    protected List<ErrorParameterType> _getErrorParameters() {
        if (errorParameters == null) {
            errorParameters = new ArrayList<ErrorParameterType>();
        }
        return errorParameters;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorParameterType }
     *     
     */
    public ErrorParameterType setErrorParameters(int idx, ErrorParameterType value) {
        return this.errorParameters.set(idx, value);
    }

    /**
     * Gets the value of the errorClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorClassificationCodeType }
     *     
     */
    public ErrorClassificationCodeType getErrorClassification() {
        return errorClassification;
    }

    /**
     * Sets the value of the errorClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorClassificationCodeType }
     *     
     */
    public void setErrorClassification(ErrorClassificationCodeType value) {
        this.errorClassification = value;
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
