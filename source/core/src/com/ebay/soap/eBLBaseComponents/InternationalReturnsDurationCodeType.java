
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
 * 				This type defines the available options for the return durations for international returns.
 * 			
 * 
 * <p>Java class for InternationalReturnsDurationCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalReturnsDurationCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternationalReturnsDuration" type="{urn:ebay:apis:eBLBaseComponents}ReturnsDurationCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalReturnsDurationCodeType", propOrder = {
    "internationalReturnsDuration",
    "any"
})
public class InternationalReturnsDurationCodeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "InternationalReturnsDuration")
    protected List<ReturnsDurationCodeType> internationalReturnsDuration;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ReturnsDurationCodeType }
     *     
     */
    public ReturnsDurationCodeType[] getInternationalReturnsDuration() {
        if (this.internationalReturnsDuration == null) {
            return new ReturnsDurationCodeType[ 0 ] ;
        }
        return ((ReturnsDurationCodeType[]) this.internationalReturnsDuration.toArray(new ReturnsDurationCodeType[this.internationalReturnsDuration.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReturnsDurationCodeType }
     *     
     */
    public ReturnsDurationCodeType getInternationalReturnsDuration(int idx) {
        if (this.internationalReturnsDuration == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.internationalReturnsDuration.get(idx);
    }

    public int getInternationalReturnsDurationLength() {
        if (this.internationalReturnsDuration == null) {
            return  0;
        }
        return this.internationalReturnsDuration.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReturnsDurationCodeType }
     *     
     */
    public void setInternationalReturnsDuration(ReturnsDurationCodeType[] values) {
        this._getInternationalReturnsDuration().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.internationalReturnsDuration.add(values[i]);
        }
    }

    protected List<ReturnsDurationCodeType> _getInternationalReturnsDuration() {
        if (internationalReturnsDuration == null) {
            internationalReturnsDuration = new ArrayList<ReturnsDurationCodeType>();
        }
        return internationalReturnsDuration;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsDurationCodeType }
     *     
     */
    public ReturnsDurationCodeType setInternationalReturnsDuration(int idx, ReturnsDurationCodeType value) {
        return this.internationalReturnsDuration.set(idx, value);
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
