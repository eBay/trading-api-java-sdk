
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				A container for VeRO reason code details.
 * 			
 * 
 * <p>Java class for ReasonCodeDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReasonCodeDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BriefText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailedText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="codeID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReasonCodeDetailType", propOrder = {
    "briefText",
    "detailedText",
    "any"
})
public class ReasonCodeDetailType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BriefText")
    protected String briefText;
    @XmlElement(name = "DetailedText")
    protected String detailedText;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute
    protected Long codeID;

    /**
     * Gets the value of the briefText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBriefText() {
        return briefText;
    }

    /**
     * Sets the value of the briefText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBriefText(String value) {
        this.briefText = value;
    }

    /**
     * Gets the value of the detailedText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedText() {
        return detailedText;
    }

    /**
     * Sets the value of the detailedText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedText(String value) {
        this.detailedText = value;
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

    /**
     * Gets the value of the codeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeID() {
        return codeID;
    }

    /**
     * Sets the value of the codeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeID(Long value) {
        this.codeID = value;
    }

}
