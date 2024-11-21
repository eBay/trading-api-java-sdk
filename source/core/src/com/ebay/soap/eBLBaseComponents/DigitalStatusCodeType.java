
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DigitalStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DigitalStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Activated"/>
 *     &lt;enumeration value="Downloaded"/>
 *     &lt;enumeration value="Deactivated"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DigitalStatusCodeType")
@XmlEnum
public enum DigitalStatusCodeType {


    /**
     * 
     * 						This enumeration value indicates that the digital gift card has yet to be activated by the buyer or recipient of gift card.
     * 					
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * 
     * 						This enumeration value indicates that the digital gift card has been activated by the buyer or recipient of gift card.
     * 					
     * 
     */
    @XmlEnumValue("Activated")
    ACTIVATED("Activated"),

    /**
     * 
     * 						This enumeration value indicates that the digital gift card has been downloaded by the buyer or recipient of gift card. The next step would be to activate the gift card.
     * 					
     * 
     */
    @XmlEnumValue("Downloaded")
    DOWNLOADED("Downloaded"),

    /**
     * 
     * 						This enumeration value indicates that the digital gift card has been deactivated.
     * 					
     * 
     */
    @XmlEnumValue("Deactivated")
    DEACTIVATED("Deactivated"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DigitalStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DigitalStatusCodeType fromValue(String v) {
        for (DigitalStatusCodeType c: DigitalStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
