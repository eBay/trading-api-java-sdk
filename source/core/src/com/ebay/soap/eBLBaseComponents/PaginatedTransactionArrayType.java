
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a paginated list of order line items.
 * 			
 * 
 * <p>Java class for PaginatedTransactionArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaginatedTransactionArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionArray" type="{urn:ebay:apis:eBLBaseComponents}TransactionArrayType" minOccurs="0"/>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginatedTransactionArrayType", propOrder = {
    "transactionArray",
    "paginationResult"
})
public class PaginatedTransactionArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TransactionArray")
    protected TransactionArrayType transactionArray;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;

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

}
