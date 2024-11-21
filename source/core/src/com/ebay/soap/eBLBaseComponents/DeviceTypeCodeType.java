
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Platform"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="ClientAlerts"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DeviceTypeCodeType")
@XmlEnum
public enum DeviceTypeCodeType {


    /**
     * 
     * 						This enumeration value indicates that buyer/seller notifications will be delivered through the Platform Notifications system.
     * 					
     * 
     */
    @XmlEnumValue("Platform")
    PLATFORM("Platform"),

    /**
     * 
     * 						This enumeration value indicates that buyer/seller notifications will be delivered through the SMS system to a wireless device.
     * 					
     * 
     */
    SMS("SMS"),

    /**
     * 
     * 						This enumeration value indicates that buyer/seller notifications will be delivered through the Client Alerts system.
     * 					
     * 
     */
    @XmlEnumValue("ClientAlerts")
    CLIENT_ALERTS("ClientAlerts"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DeviceTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceTypeCodeType fromValue(String v) {
        for (DeviceTypeCodeType c: DeviceTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
