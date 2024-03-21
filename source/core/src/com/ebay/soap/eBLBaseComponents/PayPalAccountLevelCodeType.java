
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayPalAccountLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayPalAccountLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unverified"/>
 *     &lt;enumeration value="InternationalUnverified"/>
 *     &lt;enumeration value="Verified"/>
 *     &lt;enumeration value="InternationalVerified"/>
 *     &lt;enumeration value="Trusted"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PayPalAccountLevelCodeType")
@XmlEnum
public enum PayPalAccountLevelCodeType {


    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Unverified")
    UNVERIFIED("Unverified"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("InternationalUnverified")
    INTERNATIONAL_UNVERIFIED("InternationalUnverified"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Verified")
    VERIFIED("Verified"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("InternationalVerified")
    INTERNATIONAL_VERIFIED("InternationalVerified"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Trusted")
    TRUSTED("Trusted"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 						 Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PayPalAccountLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayPalAccountLevelCodeType fromValue(String v) {
        for (PayPalAccountLevelCodeType c: PayPalAccountLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
