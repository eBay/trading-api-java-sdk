
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityOperatorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuantityOperatorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="LessThanOrEqual"/>
 *     &lt;enumeration value="Equal"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="GreaterThanOrEqual"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "QuantityOperatorCodeType")
@XmlEnum
public enum QuantityOperatorCodeType {


    /**
     * 
     * 						This enumeration value indicates that the quantity sought (specified in <b>Quantity</b> field) is less than the quantity available (specified in <b>TotalAvailable</b> field).
     * 					
     * 
     */
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),

    /**
     * 
     * 						This enumeration value indicates that the quantity sought (specified in <b>Quantity</b> field) is less than or equal to the quantity available (specified in <b>TotalAvailable</b> field).
     * 					
     * 
     */
    @XmlEnumValue("LessThanOrEqual")
    LESS_THAN_OR_EQUAL("LessThanOrEqual"),

    /**
     * 
     * 						This enumeration value indicates that the quantity sought (specified in <b>Quantity</b> field) is equal to the quantity available (specified in <b>TotalAvailable</b> field).
     * 					
     * 
     */
    @XmlEnumValue("Equal")
    EQUAL("Equal"),

    /**
     * 
     * 						This enumeration value indicates that the quantity sought (specified in <b>Quantity</b> field) is greater than the quantity available (specified in <b>TotalAvailable</b> field).
     * 					
     * 
     */
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),

    /**
     * 
     * 						This enumeration value indicates that the quantity sought (specified in <b>Quantity</b> field) is greater than or equal to the quantity available (specified in <b>TotalAvailable</b> field).
     * 					
     * 
     */
    @XmlEnumValue("GreaterThanOrEqual")
    GREATER_THAN_OR_EQUAL("GreaterThanOrEqual"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    QuantityOperatorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantityOperatorCodeType fromValue(String v) {
        for (QuantityOperatorCodeType c: QuantityOperatorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
