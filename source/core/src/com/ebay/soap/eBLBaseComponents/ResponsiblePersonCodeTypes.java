
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
 *                 Container for collection of possible responsible person enumerations.
 *             
 * 
 * <p>Java class for ResponsiblePersonCodeTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsiblePersonCodeTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:ebay:apis:eBLBaseComponents}ResponsiblePersonCodeType" maxOccurs="unbounded"/>
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
@XmlType(name = "ResponsiblePersonCodeTypes", propOrder = {
    "type",
    "any"
})
public class ResponsiblePersonCodeTypes
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Type", required = true)
    protected List<ResponsiblePersonCodeType> type;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ResponsiblePersonCodeType }
     *     
     */
    public ResponsiblePersonCodeType[] getType() {
        if (this.type == null) {
            return new ResponsiblePersonCodeType[ 0 ] ;
        }
        return ((ResponsiblePersonCodeType[]) this.type.toArray(new ResponsiblePersonCodeType[this.type.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ResponsiblePersonCodeType }
     *     
     */
    public ResponsiblePersonCodeType getType(int idx) {
        if (this.type == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.type.get(idx);
    }

    public int getTypeLength() {
        if (this.type == null) {
            return  0;
        }
        return this.type.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ResponsiblePersonCodeType }
     *     
     */
    public void setType(ResponsiblePersonCodeType[] values) {
        this._getType().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.type.add(values[i]);
        }
    }

    protected List<ResponsiblePersonCodeType> _getType() {
        if (type == null) {
            type = new ArrayList<ResponsiblePersonCodeType>();
        }
        return type;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsiblePersonCodeType }
     *     
     */
    public ResponsiblePersonCodeType setType(int idx, ResponsiblePersonCodeType value) {
        return this.type.set(idx, value);
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
