
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EscrowCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EscrowCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ByBuyer"/>
 *     &lt;enumeration value="BySeller"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "EscrowCodeType")
@XmlEnum
public enum EscrowCodeType {


    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ByBuyer")
    BY_BUYER("ByBuyer"),

    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("BySeller")
    BY_SELLER("BySeller"),

    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    EscrowCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EscrowCodeType fromValue(String v) {
        for (EscrowCodeType c: EscrowCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
