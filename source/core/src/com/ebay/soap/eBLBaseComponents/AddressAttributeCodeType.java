
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressAttributeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressAttributeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ReferenceNumber"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AddressAttributeCodeType")
@XmlEnum
public enum AddressAttributeCodeType {


    /**
     * 
     * 						This value indicates that the value returned in the <b>AddressAttribute</b> field is the reference ID for a "Click and Collect" order.
     * 					
     * 
     */
    @XmlEnumValue("ReferenceNumber")
    REFERENCE_NUMBER("ReferenceNumber"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AddressAttributeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressAttributeCodeType fromValue(String v) {
        for (AddressAttributeCodeType c: AddressAttributeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
