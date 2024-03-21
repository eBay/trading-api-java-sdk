
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base request type for the <b>GetOrderTransactions</b> call. This call retrieves detailed information about one or more orders or order line items created (or modified) in the last 90 days.
 * 				<br><br>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 				This call is deprecated and will be decommissioned on January 31, 2024. No further updates are planned for this API during the deprecation period. Developers have the option of migrating to the <a href="/Devzone/XML/docs/Reference/eBay/GetOrders.html" target="_blank">GetOrders</a> call in the <b>Trading API</b>, or the <a href="/api-docs/sell/fulfillment/resources/order/methods/getOrders" target="_blank">getOrders</a> method of the <a href="/api-docs/sell/fulfillment/overview.html" target="_blank">Fulfillment API</a>. Please note that the <a href="/api-docs/sell/fulfillment/overview.html" target="_blank">Fulfillment API</a> only returns paid orders, so if your use case calls for retrieving both paid and unpaid orders, we recommend migrating to the <a href="/Devzone/XML/docs/Reference/eBay/GetOrders.html" target="_blank">GetOrders</a> call in the <b>Trading API</b>.
 * 				</span>
 * 				<br>
 * 				Unlike <b>GetOrders</b>, which can be used to retrieve specific orders, or orders created (or modified) within a specific time period, the <b>GetOrderTransactions</b> call only supports the retrieval of specific orders and/or order line items.
 * 			
 * 
 * <p>Java class for GetOrderTransactionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrderTransactionsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemTransactionIDArray" type="{urn:ebay:apis:eBLBaseComponents}ItemTransactionIDArrayType" minOccurs="0"/>
 *         &lt;element name="OrderIDArray" type="{urn:ebay:apis:eBLBaseComponents}OrderIDArrayType" minOccurs="0"/>
 *         &lt;element name="Platform" type="{urn:ebay:apis:eBLBaseComponents}TransactionPlatformCodeType" minOccurs="0"/>
 *         &lt;element name="IncludeFinalValueFees" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderTransactionsRequestType", propOrder = {
    "itemTransactionIDArray",
    "orderIDArray",
    "platform",
    "includeFinalValueFees"
})
public class GetOrderTransactionsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemTransactionIDArray")
    protected ItemTransactionIDArrayType itemTransactionIDArray;
    @XmlElement(name = "OrderIDArray")
    protected OrderIDArrayType orderIDArray;
    @XmlElement(name = "Platform")
    protected TransactionPlatformCodeType platform;
    @XmlElement(name = "IncludeFinalValueFees")
    protected Boolean includeFinalValueFees;

    /**
     * Gets the value of the itemTransactionIDArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTransactionIDArrayType }
     *     
     */
    public ItemTransactionIDArrayType getItemTransactionIDArray() {
        return itemTransactionIDArray;
    }

    /**
     * Sets the value of the itemTransactionIDArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTransactionIDArrayType }
     *     
     */
    public void setItemTransactionIDArray(ItemTransactionIDArrayType value) {
        this.itemTransactionIDArray = value;
    }

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
     * Gets the value of the includeFinalValueFees property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFinalValueFees() {
        return includeFinalValueFees;
    }

    /**
     * Sets the value of the includeFinalValueFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFinalValueFees(Boolean value) {
        this.includeFinalValueFees = value;
    }

}
