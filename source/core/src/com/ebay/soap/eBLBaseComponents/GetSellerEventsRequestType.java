
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				This call is used by a seller to retrieve changes to their own listings that have occurred within the last 48 hours, including price changes, available quantity, and other revisions to listing.
 * 				<br/><br/>
 * 				One of the available date range filters must be used with this call.
 * 			
 * 
 * <p>Java class for GetSellerEventsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellerEventsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="StartTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StartTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ModTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ModTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NewItemFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeWatchCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeVariationSpecifics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HideVariations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerEventsRequestType", propOrder = {
    "userID",
    "startTimeFrom",
    "startTimeTo",
    "endTimeFrom",
    "endTimeTo",
    "modTimeFrom",
    "modTimeTo",
    "newItemFilter",
    "includeWatchCount",
    "includeVariationSpecifics",
    "hideVariations"
})
public class GetSellerEventsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "StartTimeFrom", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTimeFrom;
    @XmlElement(name = "StartTimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTimeTo;
    @XmlElement(name = "EndTimeFrom", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTimeFrom;
    @XmlElement(name = "EndTimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTimeTo;
    @XmlElement(name = "ModTimeFrom", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modTimeFrom;
    @XmlElement(name = "ModTimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modTimeTo;
    @XmlElement(name = "NewItemFilter")
    protected Boolean newItemFilter;
    @XmlElement(name = "IncludeWatchCount")
    protected Boolean includeWatchCount;
    @XmlElement(name = "IncludeVariationSpecifics")
    protected Boolean includeVariationSpecifics;
    @XmlElement(name = "HideVariations")
    protected Boolean hideVariations;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the startTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartTimeFrom() {
        return startTimeFrom;
    }

    /**
     * Sets the value of the startTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeFrom(Calendar value) {
        this.startTimeFrom = value;
    }

    /**
     * Gets the value of the startTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartTimeTo() {
        return startTimeTo;
    }

    /**
     * Sets the value of the startTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeTo(Calendar value) {
        this.startTimeTo = value;
    }

    /**
     * Gets the value of the endTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndTimeFrom() {
        return endTimeFrom;
    }

    /**
     * Sets the value of the endTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeFrom(Calendar value) {
        this.endTimeFrom = value;
    }

    /**
     * Gets the value of the endTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndTimeTo() {
        return endTimeTo;
    }

    /**
     * Sets the value of the endTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeTo(Calendar value) {
        this.endTimeTo = value;
    }

    /**
     * Gets the value of the modTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getModTimeFrom() {
        return modTimeFrom;
    }

    /**
     * Sets the value of the modTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModTimeFrom(Calendar value) {
        this.modTimeFrom = value;
    }

    /**
     * Gets the value of the modTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getModTimeTo() {
        return modTimeTo;
    }

    /**
     * Sets the value of the modTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModTimeTo(Calendar value) {
        this.modTimeTo = value;
    }

    /**
     * Gets the value of the newItemFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewItemFilter() {
        return newItemFilter;
    }

    /**
     * Sets the value of the newItemFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewItemFilter(Boolean value) {
        this.newItemFilter = value;
    }

    /**
     * Gets the value of the includeWatchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeWatchCount() {
        return includeWatchCount;
    }

    /**
     * Sets the value of the includeWatchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeWatchCount(Boolean value) {
        this.includeWatchCount = value;
    }

    /**
     * Gets the value of the includeVariationSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeVariationSpecifics() {
        return includeVariationSpecifics;
    }

    /**
     * Sets the value of the includeVariationSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeVariationSpecifics(Boolean value) {
        this.includeVariationSpecifics = value;
    }

    /**
     * Gets the value of the hideVariations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideVariations() {
        return hideVariations;
    }

    /**
     * Sets the value of the hideVariations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideVariations(Boolean value) {
        this.hideVariations = value;
    }

}
