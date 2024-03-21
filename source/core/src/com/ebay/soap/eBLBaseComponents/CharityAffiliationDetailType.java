
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
 * 				Type defining the <b>CharityAffiliationDetail</b> container that is returned in the <b>GetUser</b> response. The <b>CharityAffiliationDetail</b> container consists of information on a nonprofit charity organization associated with the seller's account. A separate <b>CharityAffiliationDetail</b> container is returned for each nonprofit charity organization associated with the seller's account.
 * 			
 * 
 * <p>Java class for CharityAffiliationDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharityAffiliationDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AffiliationType" type="{urn:ebay:apis:eBLBaseComponents}CharityAffiliationTypeCodeType" minOccurs="0"/>
 *         &lt;element name="LastUsedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "CharityAffiliationDetailType", propOrder = {
    "charityID",
    "affiliationType",
    "lastUsedTime",
    "any"
})
public class CharityAffiliationDetailType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CharityID")
    protected String charityID;
    @XmlElement(name = "AffiliationType")
    protected CharityAffiliationTypeCodeType affiliationType;
    @XmlElement(name = "LastUsedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastUsedTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the charityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityID() {
        return charityID;
    }

    /**
     * Sets the value of the charityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityID(String value) {
        this.charityID = value;
    }

    /**
     * Gets the value of the affiliationType property.
     * 
     * @return
     *     possible object is
     *     {@link CharityAffiliationTypeCodeType }
     *     
     */
    public CharityAffiliationTypeCodeType getAffiliationType() {
        return affiliationType;
    }

    /**
     * Sets the value of the affiliationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharityAffiliationTypeCodeType }
     *     
     */
    public void setAffiliationType(CharityAffiliationTypeCodeType value) {
        this.affiliationType = value;
    }

    /**
     * Gets the value of the lastUsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastUsedTime() {
        return lastUsedTime;
    }

    /**
     * Sets the value of the lastUsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUsedTime(Calendar value) {
        this.lastUsedTime = value;
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
