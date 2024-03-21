
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
 * 			This type is used by the <b>ASQPreferences</b> container to allow the seller to add custom Ask Seller a Question (ASQ) subjects to item listings, or to reset the custom subjects to the default eBay values.
 * 		
 * 
 * <p>Java class for ASQPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASQPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResetDefaultSubjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ASQPreferencesType", propOrder = {
    "resetDefaultSubjects",
    "subject",
    "any"
})
public class ASQPreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ResetDefaultSubjects")
    protected Boolean resetDefaultSubjects;
    @XmlElement(name = "Subject")
    protected List<String> subject;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the resetDefaultSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetDefaultSubjects() {
        return resetDefaultSubjects;
    }

    /**
     * Sets the value of the resetDefaultSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetDefaultSubjects(Boolean value) {
        this.resetDefaultSubjects = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getSubject() {
        if (this.subject == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.subject.toArray(new String[this.subject.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getSubject(int idx) {
        if (this.subject == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.subject.get(idx);
    }

    public int getSubjectLength() {
        if (this.subject == null) {
            return  0;
        }
        return this.subject.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setSubject(String[] values) {
        this._getSubject().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.subject.add(values[i]);
        }
    }

    protected List<String> _getSubject() {
        if (subject == null) {
            subject = new ArrayList<String>();
        }
        return subject;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setSubject(int idx, String value) {
        return this.subject.set(idx, value);
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
