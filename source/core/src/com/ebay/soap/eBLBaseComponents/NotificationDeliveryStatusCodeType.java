
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationDeliveryStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationDeliveryStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="MarkedDown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "NotificationDeliveryStatusCodeType")
@XmlEnum
public enum NotificationDeliveryStatusCodeType {

    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("MarkedDown")
    MARKED_DOWN("MarkedDown");
    private final String value;

    NotificationDeliveryStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationDeliveryStatusCodeType fromValue(String v) {
        for (NotificationDeliveryStatusCodeType c: NotificationDeliveryStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
