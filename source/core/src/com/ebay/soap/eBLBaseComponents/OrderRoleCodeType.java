
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderRoleCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderRoleCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Buyer"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "OrderRoleCodeType")
@XmlEnum
public enum OrderRoleCodeType {

    @XmlEnumValue("Buyer")
    BUYER("Buyer"),
    @XmlEnumValue("Seller")
    SELLER("Seller"),
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    OrderRoleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderRoleCodeType fromValue(String v) {
        for (OrderRoleCodeType c: OrderRoleCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
