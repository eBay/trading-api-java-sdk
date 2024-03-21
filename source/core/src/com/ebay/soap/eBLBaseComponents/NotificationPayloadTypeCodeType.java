
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationPayloadTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationPayloadTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="eBLSchemaSOAP"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "NotificationPayloadTypeCodeType")
@XmlEnum
public enum NotificationPayloadTypeCodeType {


    /**
     * 
     * 						New Schema format (used by the new schema XML API and SOAP API).
     * 					
     * 
     */
    @XmlEnumValue("eBLSchemaSOAP")
    E_BL_SCHEMA_SOAP("eBLSchemaSOAP"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    NotificationPayloadTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationPayloadTypeCodeType fromValue(String v) {
        for (NotificationPayloadTypeCodeType c: NotificationPayloadTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
