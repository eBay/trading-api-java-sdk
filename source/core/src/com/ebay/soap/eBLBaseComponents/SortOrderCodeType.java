
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrderCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrderCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Ascending"/>
 *     &lt;enumeration value="Descending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SortOrderCodeType")
@XmlEnum
public enum SortOrderCodeType {


    /**
     * 
     * 						The results will be sorted by the specified key in ascending (low to high) order.
     * 					
     * 
     */
    @XmlEnumValue("Ascending")
    ASCENDING("Ascending"),

    /**
     * 
     * 						The results will be sorted by the specified key in descending (high to low) order.
     * 					
     * 
     */
    @XmlEnumValue("Descending")
    DESCENDING("Descending"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SortOrderCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrderCodeType fromValue(String v) {
        for (SortOrderCodeType c: SortOrderCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
