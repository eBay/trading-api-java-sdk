
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
 * 	      This type is used to provide details about a seller's eBay Store.
 * 	    
 * 
 * <p>Java class for StoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URLPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Logo" type="{urn:ebay:apis:eBLBaseComponents}StoreLogoType" minOccurs="0"/>
 *         &lt;element name="CustomCategories" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomCategoryArrayType" minOccurs="0"/>
 *         &lt;element name="MerchDisplay" type="{urn:ebay:apis:eBLBaseComponents}MerchDisplayCodeType" minOccurs="0"/>
 *         &lt;element name="LastOpenedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "StoreType", propOrder = {
    "name",
    "urlPath",
    "url",
    "description",
    "logo",
    "customCategories",
    "merchDisplay",
    "lastOpenedTime",
    "any"
})
public class StoreType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "URLPath")
    protected String urlPath;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Logo")
    protected StoreLogoType logo;
    @XmlElement(name = "CustomCategories")
    protected StoreCustomCategoryArrayType customCategories;
    @XmlElement(name = "MerchDisplay")
    protected MerchDisplayCodeType merchDisplay;
    @XmlElement(name = "LastOpenedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastOpenedTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the urlPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPath() {
        return urlPath;
    }

    /**
     * Sets the value of the urlPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPath(String value) {
        this.urlPath = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link StoreLogoType }
     *     
     */
    public StoreLogoType getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreLogoType }
     *     
     */
    public void setLogo(StoreLogoType value) {
        this.logo = value;
    }

    /**
     * Gets the value of the customCategories property.
     * 
     * @return
     *     possible object is
     *     {@link StoreCustomCategoryArrayType }
     *     
     */
    public StoreCustomCategoryArrayType getCustomCategories() {
        return customCategories;
    }

    /**
     * Sets the value of the customCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCustomCategoryArrayType }
     *     
     */
    public void setCustomCategories(StoreCustomCategoryArrayType value) {
        this.customCategories = value;
    }

    /**
     * Gets the value of the merchDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link MerchDisplayCodeType }
     *     
     */
    public MerchDisplayCodeType getMerchDisplay() {
        return merchDisplay;
    }

    /**
     * Sets the value of the merchDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchDisplayCodeType }
     *     
     */
    public void setMerchDisplay(MerchDisplayCodeType value) {
        this.merchDisplay = value;
    }

    /**
     * Gets the value of the lastOpenedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastOpenedTime() {
        return lastOpenedTime;
    }

    /**
     * Sets the value of the lastOpenedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastOpenedTime(Calendar value) {
        this.lastOpenedTime = value;
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
