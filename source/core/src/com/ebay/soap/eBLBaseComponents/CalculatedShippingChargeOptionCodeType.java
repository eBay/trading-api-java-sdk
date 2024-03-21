
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculatedShippingChargeOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculatedShippingChargeOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ChargeEachItem"/>
 *     &lt;enumeration value="ChargeEntireOrder"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CalculatedShippingChargeOptionCodeType")
@XmlEnum
public enum CalculatedShippingChargeOptionCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ChargeEachItem")
    CHARGE_EACH_ITEM("ChargeEachItem"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ChargeEntireOrder")
    CHARGE_ENTIRE_ORDER("ChargeEntireOrder"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CalculatedShippingChargeOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculatedShippingChargeOptionCodeType fromValue(String v) {
        for (CalculatedShippingChargeOptionCodeType c: CalculatedShippingChargeOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
