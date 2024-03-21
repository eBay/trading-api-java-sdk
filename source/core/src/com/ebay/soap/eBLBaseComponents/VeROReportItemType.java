
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
 * 				This type is used by the <b>ReportItem</b> container. A <b>ReportItem</b> container is required for each eBay item that the product owner is reporting as violating the product owner's copyright, trademark, or intellectual property rights.
 * 			
 * 
 * <p>Java class for VeROReportItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeROReportItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="VeROReasonCodeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MessageToSeller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CopyEmailToRightsOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Region" type="{urn:ebay:apis:eBLBaseComponents}ShippingRegionCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Patent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "VeROReportItemType", propOrder = {
    "itemID",
    "veROReasonCodeID",
    "messageToSeller",
    "copyEmailToRightsOwner",
    "region",
    "country",
    "patent",
    "brand",
    "detailedMessage",
    "any"
})
public class VeROReportItemType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "VeROReasonCodeID")
    protected Long veROReasonCodeID;
    @XmlElement(name = "MessageToSeller")
    protected String messageToSeller;
    @XmlElement(name = "CopyEmailToRightsOwner")
    protected Boolean copyEmailToRightsOwner;
    @XmlElement(name = "Region")
    protected List<ShippingRegionCodeType> region;
    @XmlElement(name = "Country")
    protected List<CountryCodeType> country;
    @XmlElement(name = "Patent")
    protected String patent;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "DetailedMessage")
    protected String detailedMessage;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the veROReasonCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVeROReasonCodeID() {
        return veROReasonCodeID;
    }

    /**
     * Sets the value of the veROReasonCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVeROReasonCodeID(Long value) {
        this.veROReasonCodeID = value;
    }

    /**
     * Gets the value of the messageToSeller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageToSeller() {
        return messageToSeller;
    }

    /**
     * Sets the value of the messageToSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageToSeller(String value) {
        this.messageToSeller = value;
    }

    /**
     * Gets the value of the copyEmailToRightsOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopyEmailToRightsOwner() {
        return copyEmailToRightsOwner;
    }

    /**
     * Sets the value of the copyEmailToRightsOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyEmailToRightsOwner(Boolean value) {
        this.copyEmailToRightsOwner = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingRegionCodeType }
     *     
     */
    public ShippingRegionCodeType[] getRegion() {
        if (this.region == null) {
            return new ShippingRegionCodeType[ 0 ] ;
        }
        return ((ShippingRegionCodeType[]) this.region.toArray(new ShippingRegionCodeType[this.region.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingRegionCodeType }
     *     
     */
    public ShippingRegionCodeType getRegion(int idx) {
        if (this.region == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.region.get(idx);
    }

    public int getRegionLength() {
        if (this.region == null) {
            return  0;
        }
        return this.region.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingRegionCodeType }
     *     
     */
    public void setRegion(ShippingRegionCodeType[] values) {
        this._getRegion().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.region.add(values[i]);
        }
    }

    protected List<ShippingRegionCodeType> _getRegion() {
        if (region == null) {
            region = new ArrayList<ShippingRegionCodeType>();
        }
        return region;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingRegionCodeType }
     *     
     */
    public ShippingRegionCodeType setRegion(int idx, ShippingRegionCodeType value) {
        return this.region.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType[] getCountry() {
        if (this.country == null) {
            return new CountryCodeType[ 0 ] ;
        }
        return ((CountryCodeType[]) this.country.toArray(new CountryCodeType[this.country.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry(int idx) {
        if (this.country == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.country.get(idx);
    }

    public int getCountryLength() {
        if (this.country == null) {
            return  0;
        }
        return this.country.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType[] values) {
        this._getCountry().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.country.add(values[i]);
        }
    }

    protected List<CountryCodeType> _getCountry() {
        if (country == null) {
            country = new ArrayList<CountryCodeType>();
        }
        return country;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType setCountry(int idx, CountryCodeType value) {
        return this.country.set(idx, value);
    }

    /**
     * Gets the value of the patent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatent() {
        return patent;
    }

    /**
     * Sets the value of the patent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatent(String value) {
        this.patent = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the detailedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedMessage() {
        return detailedMessage;
    }

    /**
     * Sets the value of the detailedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedMessage(String value) {
        this.detailedMessage = value;
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
