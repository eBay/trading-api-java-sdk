
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns information about an eBay seller's own account.
 * 			
 * 
 * <p>Java class for GetAccountResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAccountResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeeNettingStatus" type="{urn:ebay:apis:eBLBaseComponents}FeenettingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="AccountSummary" type="{urn:ebay:apis:eBLBaseComponents}AccountSummaryType" minOccurs="0"/>
 *         &lt;element name="Currency" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="AccountEntries" type="{urn:ebay:apis:eBLBaseComponents}AccountEntriesType" minOccurs="0"/>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *         &lt;element name="HasMoreEntries" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EntriesPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccountResponseType", propOrder = {
    "accountID",
    "feeNettingStatus",
    "accountSummary",
    "currency",
    "accountEntries",
    "paginationResult",
    "hasMoreEntries",
    "entriesPerPage",
    "pageNumber"
})
public class GetAccountResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AccountID")
    protected String accountID;
    @XmlElement(name = "FeeNettingStatus")
    protected FeenettingStatusCodeType feeNettingStatus;
    @XmlElement(name = "AccountSummary")
    protected AccountSummaryType accountSummary;
    @XmlElement(name = "Currency")
    protected CurrencyCodeType currency;
    @XmlElement(name = "AccountEntries")
    protected AccountEntriesType accountEntries;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;
    @XmlElement(name = "HasMoreEntries")
    protected Boolean hasMoreEntries;
    @XmlElement(name = "EntriesPerPage")
    protected Integer entriesPerPage;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the feeNettingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FeenettingStatusCodeType }
     *     
     */
    public FeenettingStatusCodeType getFeeNettingStatus() {
        return feeNettingStatus;
    }

    /**
     * Sets the value of the feeNettingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeenettingStatusCodeType }
     *     
     */
    public void setFeeNettingStatus(FeenettingStatusCodeType value) {
        this.feeNettingStatus = value;
    }

    /**
     * Gets the value of the accountSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSummaryType }
     *     
     */
    public AccountSummaryType getAccountSummary() {
        return accountSummary;
    }

    /**
     * Sets the value of the accountSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSummaryType }
     *     
     */
    public void setAccountSummary(AccountSummaryType value) {
        this.accountSummary = value;
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
     * Gets the value of the accountEntries property.
     * 
     * @return
     *     possible object is
     *     {@link AccountEntriesType }
     *     
     */
    public AccountEntriesType getAccountEntries() {
        return accountEntries;
    }

    /**
     * Sets the value of the accountEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountEntriesType }
     *     
     */
    public void setAccountEntries(AccountEntriesType value) {
        this.accountEntries = value;
    }

    /**
     * Gets the value of the paginationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationResultType }
     *     
     */
    public PaginationResultType getPaginationResult() {
        return paginationResult;
    }

    /**
     * Sets the value of the paginationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationResultType }
     *     
     */
    public void setPaginationResult(PaginationResultType value) {
        this.paginationResult = value;
    }

    /**
     * Gets the value of the hasMoreEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreEntries() {
        return hasMoreEntries;
    }

    /**
     * Sets the value of the hasMoreEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreEntries(Boolean value) {
        this.hasMoreEntries = value;
    }

    /**
     * Gets the value of the entriesPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntriesPerPage() {
        return entriesPerPage;
    }

    /**
     * Sets the value of the entriesPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntriesPerPage(Integer value) {
        this.entriesPerPage = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

}
