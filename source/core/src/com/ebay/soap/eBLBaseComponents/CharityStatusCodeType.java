
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharityStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CharityStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Valid"/>
 *     &lt;enumeration value="NoLongerValid"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CharityStatusCodeType")
@XmlEnum
public enum CharityStatusCodeType {


    /**
     * 
     * 					  The specified nonprofit charity organization is a valid nonprofit charity organization according to the requirements of the PayPal Giving Fund.
     * 					
     * 
     */
    @XmlEnumValue("Valid")
    VALID("Valid"),

    /**
     * 
     * 					  The specified nonprofit charity organization is no longer a valid nonprofit charity organization according to the requirements of the PayPal Giving Fund.
     * 					
     * 
     */
    @XmlEnumValue("NoLongerValid")
    NO_LONGER_VALID("NoLongerValid"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CharityStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharityStatusCodeType fromValue(String v) {
        for (CharityStatusCodeType c: CharityStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
