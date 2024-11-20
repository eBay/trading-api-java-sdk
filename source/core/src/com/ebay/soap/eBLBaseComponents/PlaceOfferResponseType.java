
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The <b>PlaceOffer</b> response notifies you about the success and result
 * 				of the call.
 * 			
 * 
 * <p>Java class for PlaceOfferResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceOfferResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SellingStatus" type="{urn:ebay:apis:eBLBaseComponents}SellingStatusType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BestOffer" type="{urn:ebay:apis:eBLBaseComponents}BestOfferType" minOccurs="0"/>
 *         &lt;element name="OrderLineItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOfferResponseType", propOrder = {
    "sellingStatus",
    "transactionID",
    "bestOffer",
    "orderLineItemID"
})
public class PlaceOfferResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellingStatus")
    protected SellingStatusType sellingStatus;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "BestOffer")
    protected BestOfferType bestOffer;
    @XmlElement(name = "OrderLineItemID")
    protected String orderLineItemID;

    /**
     * Gets the value of the sellingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellingStatusType }
     *     
     */
    public SellingStatusType getSellingStatus() {
        return sellingStatus;
    }

    /**
     * Sets the value of the sellingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingStatusType }
     *     
     */
    public void setSellingStatus(SellingStatusType value) {
        this.sellingStatus = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the bestOffer property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferType }
     *     
     */
    public BestOfferType getBestOffer() {
        return bestOffer;
    }

    /**
     * Sets the value of the bestOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferType }
     *     
     */
    public void setBestOffer(BestOfferType value) {
        this.bestOffer = value;
    }

    /**
     * Gets the value of the orderLineItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineItemID() {
        return orderLineItemID;
    }

    /**
     * Sets the value of the orderLineItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineItemID(String value) {
        this.orderLineItemID = value;
    }

}
