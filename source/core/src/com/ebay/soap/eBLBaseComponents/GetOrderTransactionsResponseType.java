
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response type for the <b>GetOrderTransactions</b> call. This call retrieves detailed information about one or more eBay.com orders. An <b>OrderArray.Order</b> container is returned for each order that matches the input criteria in the call request.
 * 				<br><br>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 				This call is deprecated and will be decommissioned on January 31, 2024. No further updates are planned for this API during the deprecation period. Developers have the option of migrating to the <a href="/Devzone/XML/docs/Reference/eBay/GetOrders.html" target="_blank">GetOrders</a> call in the <b>Trading API</b>, or the <a href="/api-docs/sell/fulfillment/resources/order/methods/getOrders" target="_blank">getOrders</a> method of the <a href="/api-docs/sell/fulfillment/overview.html" target="_blank">Fulfillment API</a>. Please note that the <a href="/api-docs/sell/fulfillment/overview.html" target="_blank">Fulfillment API</a> only returns paid orders, so if your use case calls for retrieving both paid and unpaid orders, we recommend migrating to the <a href="/Devzone/XML/docs/Reference/eBay/GetOrders.html" target="_blank">GetOrders</a> call in the <b>Trading API</b>.
 * 				</span>
 * 			
 * 
 * <p>Java class for GetOrderTransactionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrderTransactionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="OrderArray" type="{urn:ebay:apis:eBLBaseComponents}OrderArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderTransactionsResponseType", propOrder = {
    "orderArray"
})
public class GetOrderTransactionsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderArray")
    protected OrderArrayType orderArray;

    /**
     * Gets the value of the orderArray property.
     * 
     * @return
     *     possible object is
     *     {@link OrderArrayType }
     *     
     */
    public OrderArrayType getOrderArray() {
        return orderArray;
    }

    /**
     * Sets the value of the orderArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderArrayType }
     *     
     */
    public void setOrderArray(OrderArrayType value) {
        this.orderArray = value;
    }

}
