
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns an array of order line item (transaction) data for the seller specified in the request. The results can be used to create a report of data that is commonly necessary for order processing. <br/><br/> Zero, one, or many <b>Transaction</b> objects can be returned in the <b>TransactionArray</b>. The set of order line items returned is limited to those that were modified between the times specified in the request's <b>ModTimeFrom</b> and <b>ModTimeTo</b> filters. The order line items returned are sorted by <b>Transaction.Status.LastTimeModified</b>, ascending order (that is, order line items that more recently were modified are returned last). This call also returns information about the seller whose order line items were requested. <br/><br/> If pagination filters were specified in the request, returns meta-data describing the effects of those filters on the current response and the estimated effects if the same filters are used in subsequent calls.
 * 			
 * 
 * <p>Java class for GetSellerTransactionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSellerTransactionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *         &lt;element name="HasMoreTransactions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TransactionsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReturnedTransactionCountActual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Seller" type="{urn:ebay:apis:eBLBaseComponents}UserType" minOccurs="0"/>
 *         &lt;element name="TransactionArray" type="{urn:ebay:apis:eBLBaseComponents}TransactionArrayType" minOccurs="0"/>
 *         &lt;element name="PayPalPreferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerTransactionsResponseType", propOrder = {
    "paginationResult",
    "hasMoreTransactions",
    "transactionsPerPage",
    "pageNumber",
    "returnedTransactionCountActual",
    "seller",
    "transactionArray",
    "payPalPreferred"
})
public class GetSellerTransactionsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;
    @XmlElement(name = "HasMoreTransactions")
    protected Boolean hasMoreTransactions;
    @XmlElement(name = "TransactionsPerPage")
    protected Integer transactionsPerPage;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "ReturnedTransactionCountActual")
    protected Integer returnedTransactionCountActual;
    @XmlElement(name = "Seller")
    protected UserType seller;
    @XmlElement(name = "TransactionArray")
    protected TransactionArrayType transactionArray;
    @XmlElement(name = "PayPalPreferred")
    protected Boolean payPalPreferred;

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
     * Gets the value of the hasMoreTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreTransactions() {
        return hasMoreTransactions;
    }

    /**
     * Sets the value of the hasMoreTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreTransactions(Boolean value) {
        this.hasMoreTransactions = value;
    }

    /**
     * Gets the value of the transactionsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionsPerPage() {
        return transactionsPerPage;
    }

    /**
     * Sets the value of the transactionsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionsPerPage(Integer value) {
        this.transactionsPerPage = value;
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

    /**
     * Gets the value of the returnedTransactionCountActual property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnedTransactionCountActual() {
        return returnedTransactionCountActual;
    }

    /**
     * Sets the value of the returnedTransactionCountActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnedTransactionCountActual(Integer value) {
        this.returnedTransactionCountActual = value;
    }

    /**
     * Gets the value of the seller property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getSeller() {
        return seller;
    }

    /**
     * Sets the value of the seller property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setSeller(UserType value) {
        this.seller = value;
    }

    /**
     * Gets the value of the transactionArray property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionArrayType }
     *     
     */
    public TransactionArrayType getTransactionArray() {
        return transactionArray;
    }

    /**
     * Sets the value of the transactionArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionArrayType }
     *     
     */
    public void setTransactionArray(TransactionArrayType value) {
        this.transactionArray = value;
    }

    /**
     * Gets the value of the payPalPreferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayPalPreferred() {
        return payPalPreferred;
    }

    /**
     * Sets the value of the payPalPreferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayPalPreferred(Boolean value) {
        this.payPalPreferred = value;
    }

}
