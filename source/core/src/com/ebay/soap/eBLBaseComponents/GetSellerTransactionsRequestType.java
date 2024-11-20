
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
 * 				Retrieves a seller's order line item information. To retrieve order line items for another seller, the <b>GetItemTransactions</b>) call should be used. This call cannot retrieve sales older than 90 days old.
 * 				<br><br>
 * 				If one or more <b>SKU</b> values or the date range filters (<b>ModTimeFrom</b>/<b>ModTimeTo</b> or <b>NumberOfDays</b>) are not used, the <b>GetItemTransactions</b>) call will retrieve order line items created (or modified) within the last 30 days.
 * 			
 * 
 * <p>Java class for GetSellerTransactionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellerTransactionsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ModTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ModTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="IncludeFinalValueFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeContainingOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SKUArray" type="{urn:ebay:apis:eBLBaseComponents}SKUArrayType" minOccurs="0"/>
 *         &lt;element name="Platform" type="{urn:ebay:apis:eBLBaseComponents}TransactionPlatformCodeType" minOccurs="0"/>
 *         &lt;element name="NumberOfDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InventoryTrackingMethod" type="{urn:ebay:apis:eBLBaseComponents}InventoryTrackingMethodCodeType" minOccurs="0"/>
 *         &lt;element name="IncludeCodiceFiscale" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerTransactionsRequestType", propOrder = {
    "modTimeFrom",
    "modTimeTo",
    "pagination",
    "includeFinalValueFee",
    "includeContainingOrder",
    "skuArray",
    "platform",
    "numberOfDays",
    "inventoryTrackingMethod",
    "includeCodiceFiscale"
})
public class GetSellerTransactionsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ModTimeFrom", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modTimeFrom;
    @XmlElement(name = "ModTimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modTimeTo;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;
    @XmlElement(name = "IncludeFinalValueFee")
    protected Boolean includeFinalValueFee;
    @XmlElement(name = "IncludeContainingOrder")
    protected Boolean includeContainingOrder;
    @XmlElement(name = "SKUArray")
    protected SKUArrayType skuArray;
    @XmlElement(name = "Platform")
    protected TransactionPlatformCodeType platform;
    @XmlElement(name = "NumberOfDays")
    protected Integer numberOfDays;
    @XmlElement(name = "InventoryTrackingMethod")
    protected InventoryTrackingMethodCodeType inventoryTrackingMethod;
    @XmlElement(name = "IncludeCodiceFiscale")
    protected Boolean includeCodiceFiscale;

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
     * Gets the value of the includeContainingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeContainingOrder() {
        return includeContainingOrder;
    }

    /**
     * Sets the value of the includeContainingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeContainingOrder(Boolean value) {
        this.includeContainingOrder = value;
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
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionPlatformCodeType }
     *     
     */
    public TransactionPlatformCodeType getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionPlatformCodeType }
     *     
     */
    public void setPlatform(TransactionPlatformCodeType value) {
        this.platform = value;
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
     * Gets the value of the inventoryTrackingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTrackingMethodCodeType }
     *     
     */
    public InventoryTrackingMethodCodeType getInventoryTrackingMethod() {
        return inventoryTrackingMethod;
    }

    /**
     * Sets the value of the inventoryTrackingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTrackingMethodCodeType }
     *     
     */
    public void setInventoryTrackingMethod(InventoryTrackingMethodCodeType value) {
        this.inventoryTrackingMethod = value;
    }

    /**
     * Gets the value of the includeCodiceFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCodiceFiscale() {
        return includeCodiceFiscale;
    }

    /**
     * Sets the value of the includeCodiceFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCodiceFiscale(Boolean value) {
        this.includeCodiceFiscale = value;
    }

}
