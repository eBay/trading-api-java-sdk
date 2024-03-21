
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayPalAccountTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayPalAccountTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Premier"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PayPalAccountTypeCodeType")
@XmlEnum
public enum PayPalAccountTypeCodeType {


    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Premier")
    PREMIER("Premier"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Business")
    BUSINESS("Business"),

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
     * 						 Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PayPalAccountTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayPalAccountTypeCodeType fromValue(String v) {
        for (PayPalAccountTypeCodeType c: PayPalAccountTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
