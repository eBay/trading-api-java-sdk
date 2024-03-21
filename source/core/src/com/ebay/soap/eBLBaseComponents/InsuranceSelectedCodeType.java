
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceSelectedCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InsuranceSelectedCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotOffered"/>
 *     &lt;enumeration value="OfferedNotSelected"/>
 *     &lt;enumeration value="OfferedSelected"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="IncludedInShippingHandling"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "InsuranceSelectedCodeType")
@XmlEnum
public enum InsuranceSelectedCodeType {


    /**
     * 
     * 						Shipping insurance was not offered.
     * 					
     * 
     */
    @XmlEnumValue("NotOffered")
    NOT_OFFERED("NotOffered"),

    /**
     * 
     * 						Shipping insurance was offered but not selected.
     * 					
     * 
     */
    @XmlEnumValue("OfferedNotSelected")
    OFFERED_NOT_SELECTED("OfferedNotSelected"),

    /**
     * 
     * 						Shipping insurance was offered and selected.
     * 					
     * 
     */
    @XmlEnumValue("OfferedSelected")
    OFFERED_SELECTED("OfferedSelected"),

    /**
     * 
     * 						Shipping insurance was required.
     * 					
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * 
     * 						Shipping insurance was included in Shipping and Handling fee.
     * 					
     * 
     */
    @XmlEnumValue("IncludedInShippingHandling")
    INCLUDED_IN_SHIPPING_HANDLING("IncludedInShippingHandling"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    InsuranceSelectedCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsuranceSelectedCodeType fromValue(String v) {
        for (InsuranceSelectedCodeType c: InsuranceSelectedCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
