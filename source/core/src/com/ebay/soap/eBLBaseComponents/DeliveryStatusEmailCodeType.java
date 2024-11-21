
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryStatusEmailCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryStatusEmailCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Notified"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DeliveryStatusEmailCodeType")
@XmlEnum
public enum DeliveryStatusEmailCodeType {


    /**
     * 
     * 						This value indicates that the link to download the digital gift card has been sent to the recipient by email.
     * 					
     * 
     */
    @XmlEnumValue("Notified")
    NOTIFIED("Notified"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DeliveryStatusEmailCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryStatusEmailCodeType fromValue(String v) {
        for (DeliveryStatusEmailCodeType c: DeliveryStatusEmailCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
