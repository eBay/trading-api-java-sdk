
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
 * 				This call is used to retrieve an array of listings for the seller. The seller must be associated with the user/application token being used to make the call.
 * 				<br/><br/>
 * 				This call requires that either the 'Start Time' or 'End Time' date range filters be used. The date range specified by either of these filters can not exceed 120 days or an error will occur.
 * 				<br/><br/>
 * 				This call also requires that pagination be used.
 * 			
 * 
 * <p>Java class for GetSellerListRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellerListRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="MotorsDealerUsers" type="{urn:ebay:apis:eBLBaseComponents}UserIDArrayType" minOccurs="0"/>
 *         &lt;element name="EndTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Sort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StartTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StartTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="GranularityLevel" type="{urn:ebay:apis:eBLBaseComponents}GranularityLevelCodeType" minOccurs="0"/>
 *         &lt;element name="SKUArray" type="{urn:ebay:apis:eBLBaseComponents}SKUArrayType" minOccurs="0"/>
 *         &lt;element name="IncludeWatchCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdminEndedItemsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncludeVariations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerListRequestType", propOrder = {
    "userID",
    "motorsDealerUsers",
    "endTimeFrom",
    "endTimeTo",
    "sort",
    "startTimeFrom",
    "startTimeTo",
    "pagination",
    "granularityLevel",
    "skuArray",
    "includeWatchCount",
    "adminEndedItemsOnly",
    "categoryID",
    "includeVariations"
})
public class GetSellerListRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "MotorsDealerUsers")
    protected UserIDArrayType motorsDealerUsers;
    @XmlElement(name = "EndTimeFrom", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTimeFrom;
    @XmlElement(name = "EndTimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTimeTo;
    @XmlElement(name = "Sort")
    protected Integer sort;
    @XmlElement(name = "StartTimeFrom", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTimeFrom;
    @XmlElement(name = "StartTimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTimeTo;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;
    @XmlElement(name = "GranularityLevel")
    protected GranularityLevelCodeType granularityLevel;
    @XmlElement(name = "SKUArray")
    protected SKUArrayType skuArray;
    @XmlElement(name = "IncludeWatchCount")
    protected Boolean includeWatchCount;
    @XmlElement(name = "AdminEndedItemsOnly")
    protected Boolean adminEndedItemsOnly;
    @XmlElement(name = "CategoryID")
    protected Integer categoryID;
    @XmlElement(name = "IncludeVariations")
    protected Boolean includeVariations;

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
     * Gets the value of the motorsDealerUsers property.
     * 
     * @return
     *     possible object is
     *     {@link UserIDArrayType }
     *     
     */
    public UserIDArrayType getMotorsDealerUsers() {
        return motorsDealerUsers;
    }

    /**
     * Sets the value of the motorsDealerUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIDArrayType }
     *     
     */
    public void setMotorsDealerUsers(UserIDArrayType value) {
        this.motorsDealerUsers = value;
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
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSort(Integer value) {
        this.sort = value;
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
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the granularityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GranularityLevelCodeType }
     *     
     */
    public GranularityLevelCodeType getGranularityLevel() {
        return granularityLevel;
    }

    /**
     * Sets the value of the granularityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GranularityLevelCodeType }
     *     
     */
    public void setGranularityLevel(GranularityLevelCodeType value) {
        this.granularityLevel = value;
    }

    /**
     * Gets the value of the skuArray property.
     * 
     * @return
     *     possible object is
     *     {@link SKUArrayType }
     *     
     */
    public SKUArrayType getSKUArray() {
        return skuArray;
    }

    /**
     * Sets the value of the skuArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SKUArrayType }
     *     
     */
    public void setSKUArray(SKUArrayType value) {
        this.skuArray = value;
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
     * Gets the value of the adminEndedItemsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdminEndedItemsOnly() {
        return adminEndedItemsOnly;
    }

    /**
     * Sets the value of the adminEndedItemsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdminEndedItemsOnly(Boolean value) {
        this.adminEndedItemsOnly = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryID(Integer value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the includeVariations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeVariations() {
        return includeVariations;
    }

    /**
     * Sets the value of the includeVariations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeVariations(Boolean value) {
        this.includeVariations = value;
    }

}
