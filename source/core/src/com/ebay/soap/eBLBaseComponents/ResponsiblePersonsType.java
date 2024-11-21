
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
 *                 Type that provides an array of each EU-based Responsible Person or entity associated with the listing. 
 * 				<br />
 * 				<span class="tablenote"><b>Note: </b> As a part of General Product Safety Regulation (GPSR) requirements effective on December 13th, 2024, sellers operating in, or shipping to, EU-based countries or Northern Ireland are conditionally required to provide Responsible Persons information in their eBay listings if the manufacture is not based in the EU. For more information on GPSR, see <a href = "https://www.ebay.com/sellercenter/resources/general-product-safety-regulation" target="_blank">General Product Safety Regulation (GPSR)</a>.</span>
 *             
 * 
 * <p>Java class for ResponsiblePersonsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsiblePersonsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponsiblePerson" type="{urn:ebay:apis:eBLBaseComponents}ResponsiblePersonType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ResponsiblePersonsType", propOrder = {
    "responsiblePerson",
    "any"
})
public class ResponsiblePersonsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ResponsiblePerson")
    protected List<ResponsiblePersonType> responsiblePerson;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ResponsiblePersonType }
     *     
     */
    public ResponsiblePersonType[] getResponsiblePerson() {
        if (this.responsiblePerson == null) {
            return new ResponsiblePersonType[ 0 ] ;
        }
        return ((ResponsiblePersonType[]) this.responsiblePerson.toArray(new ResponsiblePersonType[this.responsiblePerson.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ResponsiblePersonType }
     *     
     */
    public ResponsiblePersonType getResponsiblePerson(int idx) {
        if (this.responsiblePerson == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.responsiblePerson.get(idx);
    }

    public int getResponsiblePersonLength() {
        if (this.responsiblePerson == null) {
            return  0;
        }
        return this.responsiblePerson.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ResponsiblePersonType }
     *     
     */
    public void setResponsiblePerson(ResponsiblePersonType[] values) {
        this._getResponsiblePerson().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.responsiblePerson.add(values[i]);
        }
    }

    protected List<ResponsiblePersonType> _getResponsiblePerson() {
        if (responsiblePerson == null) {
            responsiblePerson = new ArrayList<ResponsiblePersonType>();
        }
        return responsiblePerson;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsiblePersonType }
     *     
     */
    public ResponsiblePersonType setResponsiblePerson(int idx, ResponsiblePersonType value) {
        return this.responsiblePerson.set(idx, value);
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
