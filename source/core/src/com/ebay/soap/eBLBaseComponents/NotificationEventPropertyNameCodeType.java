
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationEventPropertyNameCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationEventPropertyNameCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="TimeLeft"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "NotificationEventPropertyNameCodeType")
@XmlEnum
public enum NotificationEventPropertyNameCodeType {


    /**
     * 
     * 						Property name for WatchedItemEndingSoon events, enabling a user to specify a time in minutes
     * 						before the end of the listing. Acceptable values: 5, 10, 15, 30, 60, 75, and 180. For example,
     * 						to receive a WatchedItemEndingSoon notification 30 minutes before the item listing ends,
     * 						specify 30.
     * 					
     * 
     */
    @XmlEnumValue("TimeLeft")
    TIME_LEFT("TimeLeft"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    NotificationEventPropertyNameCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationEventPropertyNameCodeType fromValue(String v) {
        for (NotificationEventPropertyNameCodeType c: NotificationEventPropertyNameCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
