
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  Type defining the <b>SupportedSellerProfile</b> container, which contains
 * 				summary information related to specific Business Policies payment, return policy, and shipping 
 * 				profiles. The profile type is found in the <b>ProfileType</b> field.
 * 			
 * 
 * <p>Java class for SupportedSellerProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedSellerProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryGroup" type="{urn:ebay:apis:eBLBaseComponents}CategoryGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedSellerProfileType", propOrder = {
    "profileID",
    "profileType",
    "profileName",
    "shortSummary",
    "categoryGroup"
})
public class SupportedSellerProfileType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ProfileID")
    protected Long profileID;
    @XmlElement(name = "ProfileType")
    protected String profileType;
    @XmlElement(name = "ProfileName")
    protected String profileName;
    @XmlElement(name = "ShortSummary")
    protected String shortSummary;
    @XmlElement(name = "CategoryGroup")
    protected CategoryGroupType categoryGroup;

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfileID(Long value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the shortSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortSummary() {
        return shortSummary;
    }

    /**
     * Sets the value of the shortSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortSummary(String value) {
        this.shortSummary = value;
    }

    /**
     * Gets the value of the categoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryGroupType }
     *     
     */
    public CategoryGroupType getCategoryGroup() {
        return categoryGroup;
    }

    /**
     * Sets the value of the categoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryGroupType }
     *     
     */
    public void setCategoryGroup(CategoryGroupType value) {
        this.categoryGroup = value;
    }

}
