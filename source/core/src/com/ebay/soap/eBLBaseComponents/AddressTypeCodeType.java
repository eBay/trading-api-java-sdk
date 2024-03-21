
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Contact"/>
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AddressTypeCodeType")
@XmlEnum
public enum AddressTypeCodeType {


    /**
     * 
     * 						This value indicates that the address contained in the <b>NonProfitAddress</b>
     * 						container is for a non-registered charity organization.
     * 					
     * 
     */
    @XmlEnumValue("Contact")
    CONTACT("Contact"),

    /**
     * 
     * 						This value indicates that the address contained in the <b>NonProfitAddress</b>
     * 						container is for a charity organization registered with the PayPal Giving Fund.
     * 					
     * 
     */
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AddressTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressTypeCodeType fromValue(String v) {
        for (AddressTypeCodeType c: AddressTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
