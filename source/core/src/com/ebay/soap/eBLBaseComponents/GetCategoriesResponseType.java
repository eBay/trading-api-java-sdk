
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
 * 				Contains the category data for the eBay site specified as input. The category
 * 				data is contained in a CategoryArrayType object, within which are zero, one, or
 * 				multiple CategoryType objects. Each CategoryType object contains the detail data
 * 				for one category. Other fields tell how many categories are returned in a call,
 * 				when the category hierarchy was last updated, and the version of the category
 * 				hierarchy (all three of which can differ from one eBay site to the next).
 * 			
 * 
 * <p>Java class for GetCategoriesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategoriesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CategoryArray" type="{urn:ebay:apis:eBLBaseComponents}CategoryArrayType" minOccurs="0"/>
 *         &lt;element name="CategoryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CategoryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservePriceAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinimumReservePrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ReduceReserveAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoriesResponseType", propOrder = {
    "categoryArray",
    "categoryCount",
    "updateTime",
    "categoryVersion",
    "reservePriceAllowed",
    "minimumReservePrice",
    "reduceReserveAllowed"
})
public class GetCategoriesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryArray")
    protected CategoryArrayType categoryArray;
    @XmlElement(name = "CategoryCount")
    protected Integer categoryCount;
    @XmlElement(name = "UpdateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar updateTime;
    @XmlElement(name = "CategoryVersion")
    protected String categoryVersion;
    @XmlElement(name = "ReservePriceAllowed")
    protected Boolean reservePriceAllowed;
    @XmlElement(name = "MinimumReservePrice")
    protected Double minimumReservePrice;
    @XmlElement(name = "ReduceReserveAllowed")
    protected Boolean reduceReserveAllowed;

    /**
     * Gets the value of the categoryArray property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryArrayType }
     *     
     */
    public CategoryArrayType getCategoryArray() {
        return categoryArray;
    }

    /**
     * Sets the value of the categoryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryArrayType }
     *     
     */
    public void setCategoryArray(CategoryArrayType value) {
        this.categoryArray = value;
    }

    /**
     * Gets the value of the categoryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryCount() {
        return categoryCount;
    }

    /**
     * Sets the value of the categoryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryCount(Integer value) {
        this.categoryCount = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(Calendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the categoryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryVersion() {
        return categoryVersion;
    }

    /**
     * Sets the value of the categoryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryVersion(String value) {
        this.categoryVersion = value;
    }

    /**
     * Gets the value of the reservePriceAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReservePriceAllowed() {
        return reservePriceAllowed;
    }

    /**
     * Sets the value of the reservePriceAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReservePriceAllowed(Boolean value) {
        this.reservePriceAllowed = value;
    }

    /**
     * Gets the value of the minimumReservePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumReservePrice() {
        return minimumReservePrice;
    }

    /**
     * Sets the value of the minimumReservePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumReservePrice(Double value) {
        this.minimumReservePrice = value;
    }

    /**
     * Gets the value of the reduceReserveAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReduceReserveAllowed() {
        return reduceReserveAllowed;
    }

    /**
     * Sets the value of the reduceReserveAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReduceReserveAllowed(Boolean value) {
        this.reduceReserveAllowed = value;
    }

}
