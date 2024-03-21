
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
 * 				This type defines the available options for the return durations for domestic returns.
 * 			
 * 
 * <p>Java class for DomesticReturnsDurationCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomesticReturnsDurationCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomesticReturnsDuration" type="{urn:ebay:apis:eBLBaseComponents}ReturnsDurationCodeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DomesticReturnsDurationCodeType", propOrder = {
    "domesticReturnsDuration",
    "any"
})
public class DomesticReturnsDurationCodeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DomesticReturnsDuration")
    protected List<ReturnsDurationCodeType> domesticReturnsDuration;
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
    public ReturnsDurationCodeType[] getDomesticReturnsDuration() {
        if (this.domesticReturnsDuration == null) {
            return new ReturnsDurationCodeType[ 0 ] ;
        }
        return ((ReturnsDurationCodeType[]) this.domesticReturnsDuration.toArray(new ReturnsDurationCodeType[this.domesticReturnsDuration.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReturnsDurationCodeType }
     *     
     */
    public ReturnsDurationCodeType getDomesticReturnsDuration(int idx) {
        if (this.domesticReturnsDuration == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.domesticReturnsDuration.get(idx);
    }

    public int getDomesticReturnsDurationLength() {
        if (this.domesticReturnsDuration == null) {
            return  0;
        }
        return this.domesticReturnsDuration.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReturnsDurationCodeType }
     *     
     */
    public void setDomesticReturnsDuration(ReturnsDurationCodeType[] values) {
        this._getDomesticReturnsDuration().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.domesticReturnsDuration.add(values[i]);
        }
    }

    protected List<ReturnsDurationCodeType> _getDomesticReturnsDuration() {
        if (domesticReturnsDuration == null) {
            domesticReturnsDuration = new ArrayList<ReturnsDurationCodeType>();
        }
        return domesticReturnsDuration;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsDurationCodeType }
     *     
     */
    public ReturnsDurationCodeType setDomesticReturnsDuration(int idx, ReturnsDurationCodeType value) {
        return this.domesticReturnsDuration.set(idx, value);
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
