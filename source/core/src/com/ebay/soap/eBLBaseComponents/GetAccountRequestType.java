
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
 * 				Returns a seller's invoice data for their eBay account, including the account's
 * 				summary data.
 * 			
 * 
 * <p>Java class for GetAccountRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AccountHistorySelection" type="{urn:ebay:apis:eBLBaseComponents}AccountHistorySelectionCodeType" minOccurs="0"/>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *         &lt;element name="ExcludeBalance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExcludeSummary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeConversionRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeNettedEntries" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AccountEntrySortType" type="{urn:ebay:apis:eBLBaseComponents}AccountEntrySortTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Currency" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountRequestType", propOrder = {
    "accountHistorySelection",
    "invoiceDate",
    "beginDate",
    "endDate",
    "pagination",
    "excludeBalance",
    "excludeSummary",
    "includeConversionRate",
    "includeNettedEntries",
    "accountEntrySortType",
    "currency",
    "itemID",
    "orderID"
})
public class GetAccountRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AccountHistorySelection")
    protected AccountHistorySelectionCodeType accountHistorySelection;
    @XmlElement(name = "InvoiceDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar invoiceDate;
    @XmlElement(name = "BeginDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar beginDate;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endDate;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;
    @XmlElement(name = "ExcludeBalance")
    protected Boolean excludeBalance;
    @XmlElement(name = "ExcludeSummary")
    protected Boolean excludeSummary;
    @XmlElement(name = "IncludeConversionRate")
    protected Boolean includeConversionRate;
    @XmlElement(name = "IncludeNettedEntries")
    protected Boolean includeNettedEntries;
    @XmlElement(name = "AccountEntrySortType")
    protected AccountEntrySortTypeCodeType accountEntrySortType;
    @XmlElement(name = "Currency")
    protected CurrencyCodeType currency;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "OrderID")
    protected String orderID;

    /**
     * Gets the value of the accountHistorySelection property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHistorySelectionCodeType }
     *     
     */
    public AccountHistorySelectionCodeType getAccountHistorySelection() {
        return accountHistorySelection;
    }

    /**
     * Sets the value of the accountHistorySelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHistorySelectionCodeType }
     *     
     */
    public void setAccountHistorySelection(AccountHistorySelectionCodeType value) {
        this.accountHistorySelection = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(Calendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(Calendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Calendar value) {
        this.endDate = value;
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
     * Gets the value of the excludeBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeBalance() {
        return excludeBalance;
    }

    /**
     * Sets the value of the excludeBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeBalance(Boolean value) {
        this.excludeBalance = value;
    }

    /**
     * Gets the value of the excludeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeSummary() {
        return excludeSummary;
    }

    /**
     * Sets the value of the excludeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeSummary(Boolean value) {
        this.excludeSummary = value;
    }

    /**
     * Gets the value of the includeConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeConversionRate() {
        return includeConversionRate;
    }

    /**
     * Sets the value of the includeConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeConversionRate(Boolean value) {
        this.includeConversionRate = value;
    }

    /**
     * Gets the value of the includeNettedEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeNettedEntries() {
        return includeNettedEntries;
    }

    /**
     * Sets the value of the includeNettedEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeNettedEntries(Boolean value) {
        this.includeNettedEntries = value;
    }

    /**
     * Gets the value of the accountEntrySortType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountEntrySortTypeCodeType }
     *     
     */
    public AccountEntrySortTypeCodeType getAccountEntrySortType() {
        return accountEntrySortType;
    }

    /**
     * Sets the value of the accountEntrySortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountEntrySortTypeCodeType }
     *     
     */
    public void setAccountEntrySortType(AccountEntrySortTypeCodeType value) {
        this.accountEntrySortType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrency(CurrencyCodeType value) {
        this.currency = value;
    }

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
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

}
