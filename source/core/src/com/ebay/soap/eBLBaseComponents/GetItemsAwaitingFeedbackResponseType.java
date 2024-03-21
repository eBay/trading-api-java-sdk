
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the base response type of the <b>GetItemsAwaitingFeedback</b> call. This call retrieves all completed order line items for which the user (buyer or seller) still needs to leave Feedback for their order partner.
 * 			
 * 
 * <p>Java class for GetItemsAwaitingFeedbackResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemsAwaitingFeedbackResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ItemsAwaitingFeedback" type="{urn:ebay:apis:eBLBaseComponents}PaginatedTransactionArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemsAwaitingFeedbackResponseType", propOrder = {
    "itemsAwaitingFeedback"
})
public class GetItemsAwaitingFeedbackResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemsAwaitingFeedback")
    protected PaginatedTransactionArrayType itemsAwaitingFeedback;

    /**
     * Gets the value of the itemsAwaitingFeedback property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedTransactionArrayType }
     *     
     */
    public PaginatedTransactionArrayType getItemsAwaitingFeedback() {
        return itemsAwaitingFeedback;
    }

    /**
     * Sets the value of the itemsAwaitingFeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedTransactionArrayType }
     *     
     */
    public void setItemsAwaitingFeedback(PaginatedTransactionArrayType value) {
        this.itemsAwaitingFeedback = value;
    }

}
