
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
 * 				This type is used to set/display details related to VAT (Value-Added Tax) and Business Seller features.
 * 				<br>
 * 				<br>
 * 				<span class="tablenote"><b>Note:</b>
 * 					VAT is not applicable to all countries, including the US. Sellers must be registered as Business Sellers on the site they are selling on in order to use the Business Seller-related fields.
 * 				</span>
 * 			
 * 
 * <p>Java class for VATDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VATDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RestrictedToBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VATPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="VATSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "VATDetailsType", propOrder = {
    "businessSeller",
    "restrictedToBusiness",
    "vatPercent",
    "vatSite",
    "vatid",
    "any"
})
public class VATDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BusinessSeller")
    protected Boolean businessSeller;
    @XmlElement(name = "RestrictedToBusiness")
    protected Boolean restrictedToBusiness;
    @XmlElement(name = "VATPercent")
    protected Float vatPercent;
    @XmlElement(name = "VATSite")
    protected String vatSite;
    @XmlElement(name = "VATID")
    protected String vatid;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the businessSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessSeller() {
        return businessSeller;
    }

    /**
     * Sets the value of the businessSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessSeller(Boolean value) {
        this.businessSeller = value;
    }

    /**
     * Gets the value of the restrictedToBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedToBusiness() {
        return restrictedToBusiness;
    }

    /**
     * Sets the value of the restrictedToBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedToBusiness(Boolean value) {
        this.restrictedToBusiness = value;
    }

    /**
     * Gets the value of the vatPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVATPercent() {
        return vatPercent;
    }

    /**
     * Sets the value of the vatPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVATPercent(Float value) {
        this.vatPercent = value;
    }

    /**
     * Gets the value of the vatSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATSite() {
        return vatSite;
    }

    /**
     * Sets the value of the vatSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATSite(String value) {
        this.vatSite = value;
    }

    /**
     * Gets the value of the vatid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATID() {
        return vatid;
    }

    /**
     * Sets the value of the vatid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATID(String value) {
        this.vatid = value;
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
