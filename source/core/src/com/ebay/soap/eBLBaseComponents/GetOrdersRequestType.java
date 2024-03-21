
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
 * 				Retrieves the orders for which the authenticated user is a participant, either as the buyer or the seller. The call returns all the orders that meet the request criteria. Orders older than 90 days old will not be returned.
 * 			
 * 
 * <p>Java class for GetOrdersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrdersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="OrderIDArray" type="{urn:ebay:apis:eBLBaseComponents}OrderIDArrayType" minOccurs="0"/>
 *         &lt;element name="CreateTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrderRole" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{urn:ebay:apis:eBLBaseComponents}OrderStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="ModTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ModTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncludeFinalValueFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SortingOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrdersRequestType", propOrder = {
    "orderIDArray",
    "createTimeFrom",
    "createTimeTo",
    "orderRole",
    "orderStatus",
    "listingType",
    "pagination",
    "modTimeFrom",
    "modTimeTo",
    "numberOfDays",
    "includeFinalValueFee",
    "sortingOrder"
})
public class GetOrdersRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderIDArray")
    protected OrderIDArrayType orderIDArray;
    @XmlElement(name = "CreateTimeFrom", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createTimeFrom;
    @XmlElement(name = "CreateTimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createTimeTo;
    @XmlElement(name = "OrderRole")
    protected TradingRoleCodeType orderRole;
    @XmlElement(name = "OrderStatus")
    protected OrderStatusCodeType orderStatus;
    @XmlElement(name = "ListingType")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;
    @XmlElement(name = "ModTimeFrom", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modTimeFrom;
    @XmlElement(name = "ModTimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modTimeTo;
    @XmlElement(name = "NumberOfDays")
    protected Integer numberOfDays;
    @XmlElement(name = "IncludeFinalValueFee")
    protected Boolean includeFinalValueFee;
    @XmlElement(name = "SortingOrder")
    protected SortOrderCodeType sortingOrder;

    /**
     * Gets the value of the orderIDArray property.
     * 
     * @return
     *     possible object is
     *     {@link OrderIDArrayType }
     *     
     */
    public OrderIDArrayType getOrderIDArray() {
        return orderIDArray;
    }

    /**
     * Sets the value of the orderIDArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIDArrayType }
     *     
     */
    public void setOrderIDArray(OrderIDArrayType value) {
        this.orderIDArray = value;
    }

    /**
     * Gets the value of the createTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreateTimeFrom() {
        return createTimeFrom;
    }

    /**
     * Sets the value of the createTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTimeFrom(Calendar value) {
        this.createTimeFrom = value;
    }

    /**
     * Gets the value of the createTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCreateTimeTo() {
        return createTimeTo;
    }

    /**
     * Sets the value of the createTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTimeTo(Calendar value) {
        this.createTimeTo = value;
    }

    /**
     * Gets the value of the orderRole property.
     * 
     * @return
     *     possible object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public TradingRoleCodeType getOrderRole() {
        return orderRole;
    }

    /**
     * Sets the value of the orderRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public void setOrderRole(TradingRoleCodeType value) {
        this.orderRole = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusCodeType }
     *     
     */
    public OrderStatusCodeType getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusCodeType }
     *     
     */
    public void setOrderStatus(OrderStatusCodeType value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public ListingTypeCodeType getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public void setListingType(ListingTypeCodeType value) {
        this.listingType = value;
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
     * Gets the value of the numberOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * Sets the value of the numberOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDays(Integer value) {
        this.numberOfDays = value;
    }

    /**
     * Gets the value of the includeFinalValueFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFinalValueFee() {
        return includeFinalValueFee;
    }

    /**
     * Sets the value of the includeFinalValueFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFinalValueFee(Boolean value) {
        this.includeFinalValueFee = value;
    }

    /**
     * Gets the value of the sortingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderCodeType }
     *     
     */
    public SortOrderCodeType getSortingOrder() {
        return sortingOrder;
    }

    /**
     * Sets the value of the sortingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderCodeType }
     *     
     */
    public void setSortingOrder(SortOrderCodeType value) {
        this.sortingOrder = value;
    }

}
