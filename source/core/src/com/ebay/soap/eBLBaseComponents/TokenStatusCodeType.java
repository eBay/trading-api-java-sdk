
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TokenStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="RevokedByeBay"/>
 *     &lt;enumeration value="RevokedByUser"/>
 *     &lt;enumeration value="RevokedByApp"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TokenStatusCodeType")
@XmlEnum
public enum TokenStatusCodeType {


    /**
     * 
     * 					Token is Active
     * 				
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 					Token is Expired
     * 				
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * 
     * 					Token is revoked by eBay
     * 				
     * 
     */
    @XmlEnumValue("RevokedByeBay")
    REVOKED_BYE_BAY("RevokedByeBay"),

    /**
     * 
     * 					Token is revoked by user
     * 				
     * 
     */
    @XmlEnumValue("RevokedByUser")
    REVOKED_BY_USER("RevokedByUser"),

    /**
     * 
     * 					Token is revoked by Application
     * 				
     * 
     */
    @XmlEnumValue("RevokedByApp")
    REVOKED_BY_APP("RevokedByApp"),

    /**
     * 
     * 					Token is Invalid
     * 				
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 					Reserved for internal or future use
     * 				
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TokenStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TokenStatusCodeType fromValue(String v) {
        for (TokenStatusCodeType c: TokenStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
