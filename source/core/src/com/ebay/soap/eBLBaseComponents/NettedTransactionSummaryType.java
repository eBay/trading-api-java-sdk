
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>NettedTransactionSummary</b> container, which shows the total amount of fees (and credits if applicable) that have already been paid through seller payout deductions.
 * 			
 * 
 * <p>Java class for NettedTransactionSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NettedTransactionSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalNettedChargeAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalNettedCreditAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NettedTransactionSummaryType", propOrder = {
    "totalNettedChargeAmount",
    "totalNettedCreditAmount"
})
public class NettedTransactionSummaryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TotalNettedChargeAmount")
    protected AmountType totalNettedChargeAmount;
    @XmlElement(name = "TotalNettedCreditAmount")
    protected AmountType totalNettedCreditAmount;

    /**
     * Gets the value of the totalNettedChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalNettedChargeAmount() {
        return totalNettedChargeAmount;
    }

    /**
     * Sets the value of the totalNettedChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalNettedChargeAmount(AmountType value) {
        this.totalNettedChargeAmount = value;
    }

    /**
     * Gets the value of the totalNettedCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalNettedCreditAmount() {
        return totalNettedCreditAmount;
    }

    /**
     * Sets the value of the totalNettedCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalNettedCreditAmount(AmountType value) {
        this.totalNettedCreditAmount = value;
    }

}
