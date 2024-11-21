
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnouncementMessageCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnnouncementMessageCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Deprecation"/>
 *     &lt;enumeration value="Mapping"/>
 *     &lt;enumeration value="DeprecationAndMapping"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AnnouncementMessageCodeType")
@XmlEnum
public enum AnnouncementMessageCodeType {


    /**
     * 
     * 						No message is to be made available.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						A deprecation message is to be made available,
     * 						but only if today's date is between <b>AnnouncementMessageType.AnnouncementStartTime</b>
     * 						and <b>AnnouncementMessageType.EventTime</b>.
     * 					
     * 
     */
    @XmlEnumValue("Deprecation")
    DEPRECATION("Deprecation"),

    /**
     * 
     * 						A mapping message is to be made available,
     * 						but only if today's date is after <b>AnnouncementMessageType.EventTime</b>.
     * 					
     * 
     */
    @XmlEnumValue("Mapping")
    MAPPING("Mapping"),

    /**
     * 
     * 						Both "Deprecation" and "Mapping" enumerations are to apply.
     * 					
     * 
     */
    @XmlEnumValue("DeprecationAndMapping")
    DEPRECATION_AND_MAPPING("DeprecationAndMapping"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AnnouncementMessageCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnnouncementMessageCodeType fromValue(String v) {
        for (AnnouncementMessageCodeType c: AnnouncementMessageCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
