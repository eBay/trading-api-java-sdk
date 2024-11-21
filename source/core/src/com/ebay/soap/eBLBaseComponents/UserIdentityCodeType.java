
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserIdentityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserIdentityCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="eBayUser"/>
 *     &lt;enumeration value="eBayPartner"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "UserIdentityCodeType")
@XmlEnum
public enum UserIdentityCodeType {


    /**
     * 
     * 						This enumeration value indicates that an eBay user initiated the monetary transaction.
     * 					
     * 
     */
    @XmlEnumValue("eBayUser")
    E_BAY_USER("eBayUser"),

    /**
     * 
     * 						This enumeration value indicates that an eBay partner (such as Pitney Bowes) initiated the monetary transaction.
     * 					
     * 
     */
    @XmlEnumValue("eBayPartner")
    E_BAY_PARTNER("eBayPartner"),

    /**
     * 
     * 						This value is reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    UserIdentityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserIdentityCodeType fromValue(String v) {
        for (UserIdentityCodeType c: UserIdentityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
