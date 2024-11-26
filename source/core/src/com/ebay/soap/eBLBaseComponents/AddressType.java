
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
 * 			Contains the data for an eBay user's address. This is the base type for a
 * 			number of user addresses, including seller payment address, buyer
 * 			shipping address, and buyer and seller registration address.
 * 		
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneCountryCode" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="PhoneCountryPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneAreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneLocalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressOwner" type="{urn:ebay:apis:eBLBaseComponents}AddressOwnerCodeType" minOccurs="0"/>
 *         &lt;element name="AddressStatus" type="{urn:ebay:apis:eBLBaseComponents}AddressStatusCodeType" minOccurs="0"/>
 *         &lt;element name="InternationalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalStateAndCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressRecordType" type="{urn:ebay:apis:eBLBaseComponents}AddressRecordTypeCodeType" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressAttribute" type="{urn:ebay:apis:eBLBaseComponents}AddressAttributeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AddressType", propOrder = {
    "name",
    "street",
    "street1",
    "street2",
    "cityName",
    "county",
    "stateOrProvince",
    "country",
    "countryName",
    "phone",
    "phoneCountryCode",
    "phoneCountryPrefix",
    "phoneAreaOrCityCode",
    "phoneLocalNumber",
    "postalCode",
    "addressID",
    "addressOwner",
    "addressStatus",
    "internationalName",
    "internationalStateAndCity",
    "internationalStreet",
    "companyName",
    "addressRecordType",
    "firstName",
    "lastName",
    "phone2",
    "referenceID",
    "addressAttribute",
    "any"
})
public class AddressType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "Street1")
    protected String street1;
    @XmlElement(name = "Street2")
    protected String street2;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "StateOrProvince")
    protected String stateOrProvince;
    @XmlElement(name = "Country")
    protected CountryCodeType country;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "PhoneCountryCode")
    protected CountryCodeType phoneCountryCode;
    @XmlElement(name = "PhoneCountryPrefix")
    protected String phoneCountryPrefix;
    @XmlElement(name = "PhoneAreaOrCityCode")
    protected String phoneAreaOrCityCode;
    @XmlElement(name = "PhoneLocalNumber")
    protected String phoneLocalNumber;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "AddressID")
    protected String addressID;
    @XmlElement(name = "AddressOwner")
    protected AddressOwnerCodeType addressOwner;
    @XmlElement(name = "AddressStatus")
    protected AddressStatusCodeType addressStatus;
    @XmlElement(name = "InternationalName")
    protected String internationalName;
    @XmlElement(name = "InternationalStateAndCity")
    protected String internationalStateAndCity;
    @XmlElement(name = "InternationalStreet")
    protected String internationalStreet;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "AddressRecordType")
    protected AddressRecordTypeCodeType addressRecordType;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Phone2")
    protected String phone2;
    @XmlElement(name = "ReferenceID")
    protected String referenceID;
    @XmlElement(name = "AddressAttribute")
    protected List<AddressAttributeType> addressAttribute;
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
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the street1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the street2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Sets the value of the street2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getPhoneCountryCode() {
        return phoneCountryCode;
    }

    /**
     * Sets the value of the phoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setPhoneCountryCode(CountryCodeType value) {
        this.phoneCountryCode = value;
    }

    /**
     * Gets the value of the phoneCountryPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCountryPrefix() {
        return phoneCountryPrefix;
    }

    /**
     * Sets the value of the phoneCountryPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCountryPrefix(String value) {
        this.phoneCountryPrefix = value;
    }

    /**
     * Gets the value of the phoneAreaOrCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneAreaOrCityCode() {
        return phoneAreaOrCityCode;
    }

    /**
     * Sets the value of the phoneAreaOrCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneAreaOrCityCode(String value) {
        this.phoneAreaOrCityCode = value;
    }

    /**
     * Gets the value of the phoneLocalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneLocalNumber() {
        return phoneLocalNumber;
    }

    /**
     * Sets the value of the phoneLocalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneLocalNumber(String value) {
        this.phoneLocalNumber = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the addressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * Sets the value of the addressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressID(String value) {
        this.addressID = value;
    }

    /**
     * Gets the value of the addressOwner property.
     * 
     * @return
     *     possible object is
     *     {@link AddressOwnerCodeType }
     *     
     */
    public AddressOwnerCodeType getAddressOwner() {
        return addressOwner;
    }

    /**
     * Sets the value of the addressOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressOwnerCodeType }
     *     
     */
    public void setAddressOwner(AddressOwnerCodeType value) {
        this.addressOwner = value;
    }

    /**
     * Gets the value of the addressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AddressStatusCodeType }
     *     
     */
    public AddressStatusCodeType getAddressStatus() {
        return addressStatus;
    }

    /**
     * Sets the value of the addressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStatusCodeType }
     *     
     */
    public void setAddressStatus(AddressStatusCodeType value) {
        this.addressStatus = value;
    }

    /**
     * Gets the value of the internationalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalName() {
        return internationalName;
    }

    /**
     * Sets the value of the internationalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalName(String value) {
        this.internationalName = value;
    }

    /**
     * Gets the value of the internationalStateAndCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalStateAndCity() {
        return internationalStateAndCity;
    }

    /**
     * Sets the value of the internationalStateAndCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalStateAndCity(String value) {
        this.internationalStateAndCity = value;
    }

    /**
     * Gets the value of the internationalStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalStreet() {
        return internationalStreet;
    }

    /**
     * Sets the value of the internationalStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalStreet(String value) {
        this.internationalStreet = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the addressRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRecordTypeCodeType }
     *     
     */
    public AddressRecordTypeCodeType getAddressRecordType() {
        return addressRecordType;
    }

    /**
     * Sets the value of the addressRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRecordTypeCodeType }
     *     
     */
    public void setAddressRecordType(AddressRecordTypeCodeType value) {
        this.addressRecordType = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2(String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AddressAttributeType }
     *     
     */
    public AddressAttributeType[] getAddressAttribute() {
        if (this.addressAttribute == null) {
            return new AddressAttributeType[ 0 ] ;
        }
        return ((AddressAttributeType[]) this.addressAttribute.toArray(new AddressAttributeType[this.addressAttribute.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AddressAttributeType }
     *     
     */
    public AddressAttributeType getAddressAttribute(int idx) {
        if (this.addressAttribute == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.addressAttribute.get(idx);
    }

    public int getAddressAttributeLength() {
        if (this.addressAttribute == null) {
            return  0;
        }
        return this.addressAttribute.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AddressAttributeType }
     *     
     */
    public void setAddressAttribute(AddressAttributeType[] values) {
        this._getAddressAttribute().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.addressAttribute.add(values[i]);
        }
    }

    protected List<AddressAttributeType> _getAddressAttribute() {
        if (addressAttribute == null) {
            addressAttribute = new ArrayList<AddressAttributeType>();
        }
        return addressAttribute;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AddressAttributeType }
     *     
     */
    public AddressAttributeType setAddressAttribute(int idx, AddressAttributeType value) {
        return this.addressAttribute.set(idx, value);
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
