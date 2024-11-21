
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnableCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnableCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Enable"/>
 *     &lt;enumeration value="Disable"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "EnableCodeType")
@XmlEnum
public enum EnableCodeType {


    /**
     * 
     * 						This enumeration value indicates that an application/URL/device is enabled to receive notifications, or to indicate that a specific notification event is enabled.
     * 					
     * 
     */
    @XmlEnumValue("Enable")
    ENABLE("Enable"),

    /**
     * 
     * 						This enumeration value indicates that an application/URL/device is disabled, or being blocked from receiving notifications, or to indicate that a specific notification event is disabled.
     * 					
     * 
     */
    @XmlEnumValue("Disable")
    DISABLE("Disable"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    EnableCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnableCodeType fromValue(String v) {
        for (EnableCodeType c: EnableCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
