
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusFilterCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusFilterCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="AwaitingPayment"/>
 *     &lt;enumeration value="AwaitingShipment"/>
 *     &lt;enumeration value="PaidAndShipped"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "OrderStatusFilterCodeType")
@XmlEnum
public enum OrderStatusFilterCodeType {


    /**
     * 
     * 						All applicable sold listings, regardless of 
     * 						their Paid or Shipped status.
     * 					
     * 
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     * 
     * 						Sold listings that have not yet been marked as
     * 						Paid in My eBay.
     * 					
     * 
     */
    @XmlEnumValue("AwaitingPayment")
    AWAITING_PAYMENT("AwaitingPayment"),

    /**
     * 
     * 						Sold listings that have not yet been marked as
     * 						Shipped in My eBay.
     * 					
     * 
     */
    @XmlEnumValue("AwaitingShipment")
    AWAITING_SHIPMENT("AwaitingShipment"),

    /**
     * 
     * 						Sold listings that have been marked as
     * 						Paid and Shipped in My eBay.
     * 					
     * 
     */
    @XmlEnumValue("PaidAndShipped")
    PAID_AND_SHIPPED("PaidAndShipped"),

    /**
     * 
     * 						Reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    OrderStatusFilterCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderStatusFilterCodeType fromValue(String v) {
        for (OrderStatusFilterCodeType c: OrderStatusFilterCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
