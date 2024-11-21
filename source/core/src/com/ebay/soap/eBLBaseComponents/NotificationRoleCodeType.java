
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationRoleCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationRoleCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Application"/>
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="UserData"/>
 *     &lt;enumeration value="Event"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "NotificationRoleCodeType")
@XmlEnum
public enum NotificationRoleCodeType {


    /**
     * 
     * 						(in) Specifies that you want to set or return application-level
     * 						preferences. Default value.
     * 					
     * 
     */
    @XmlEnumValue("Application")
    APPLICATION("Application"),

    /**
     * 
     * 						(in) Specifies that you want to set or return user-level preferences.
     * 					
     * 
     */
    @XmlEnumValue("User")
    USER("User"),

    /**
     * 
     * 						(in) Specifies that you want to set or return user data-level preferences.
     * 					
     * 
     */
    @XmlEnumValue("UserData")
    USER_DATA("UserData"),

    /**
     * 
     * 						(in) Specifies that you want to set or return event-level preferences.
     * 					
     * 
     */
    @XmlEnumValue("Event")
    EVENT("Event"),

    /**
     * 
     * 						Reserved for future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    NotificationRoleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationRoleCodeType fromValue(String v) {
        for (NotificationRoleCodeType c: NotificationRoleCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
