
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Shipped"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Authenticated"/>
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="CancelPending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "OrderStatusCodeType")
@XmlEnum
public enum OrderStatusCodeType {


    /**
     * 
     * 						This value indicates that the order is not yet complete. An order in the <code>Active</code> state means that the buyer has not initiated payment for the order. While an order is in this state, it can be combined into a <a href="https://developer.ebay.com/DevZone/guides/features-guide/default.html#development/Listing-AnItem.html#CombinedInvoice">Combined Invoice</a>, a buyer can request a cancellation, and/or a seller can update payment details (including a change in order price) or shipping details (including shipping cost and shipping service).
     * 						<br><br>
     * 						This value can be used a filter value in the <b>OrderStatus</b> field of the <b>GetOrders</b> request payload, and it can also be returned in any of the order management calls.
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						This value can be used a filter value in the <b>OrderStatus</b> field, and if used, all inactive orders will be returned.
     * 					
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * 
     * 						This value indicates that the order is paid for and complete. An order in the <code>Completed</code> state means that no other changes to the order can be made.
     * 						<br><br>
     * 						This value can be used a filter value in the <b>OrderStatus</b> field of the <b>GetOrders</b> request payload, and it can also be returned in any of the order management calls.
     * 					
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * 
     * 						This value indicates that the order has been cancelled. Depending on whether payment was made or not, the seller may also need to refund the buyer after an order is cancelled.
     * 						<br><br>
     * 						This value can be used a filter value in the <b>OrderStatus</b> field of the <b>GetOrders</b> request payload, and it can also be returned in any of the order management calls.
     * 					
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * 
     * 						This enumeration value was only used for the deprecated Half.com site, so is no longer applicable and should not be used as an <b>OrderStatus</b> value in the <b>GetOrders</b> request payload.
     * 					
     * 
     */
    @XmlEnumValue("Shipped")
    SHIPPED("Shipped"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Default")
    DEFAULT("Default"),

    /**
     * 
     * 						This enumeration value is no longer applicable and should not be used as an <b>OrderStatus</b> value in the <b>GetOrders</b> request payload.
     * 					
     * 
     */
    @XmlEnumValue("Authenticated")
    AUTHENTICATED("Authenticated"),

    /**
     * 
     * 						This enumeration value indicates that the order is currently in the state of being processed, but is not yet complete.
     * 						<br><br>
     * 						This value is not supported by the <b>OrderStatus</b> field of the <b>GetOrders</b> request payload, but it can be returned in any of the order management calls.
     * 					
     * 
     */
    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),

    /**
     * 
     * 						This enumeration value is no longer applicable and should not be used as an <b>OrderStatus</b> value in the <b>GetOrders</b> request payload.
     * 					
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This enumeration value is passed into the <b>OrderStatus</b> of <b>GetOrders</b> to retrieve orders in all states. This is the default value. This value is not applicable to the response payloads of the order management calls.
     * 					
     * 
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     * 
     * 						This value indicates that a buyer has initiated a cancellation request on the order. If a seller sees an order in this state, that seller must either approve or reject the cancellation request through My eBay Web flows or through the Post-Order API cancellation calls.
     * 						<br/><br/>
     * 						This enumeration value cannot be used as an <b>OrderStatus</b> value in the <b>GetOrders</b> request payload.
     * 					
     * 
     */
    @XmlEnumValue("CancelPending")
    CANCEL_PENDING("CancelPending");
    private final String value;

    OrderStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatusCodeType fromValue(String v) {
        for (OrderStatusCodeType c: OrderStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
