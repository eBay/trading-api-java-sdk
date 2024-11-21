
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemConditionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemConditionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Used"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemConditionCodeType")
@XmlEnum
public enum ItemConditionCodeType {


    /**
     * 
     * 						The seller specified the Item Condition as New, or
     * 						did not specify a condition.
     * 						(Excludes items that the seller listed as Used.)
     * 					
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * 
     * 						The seller specified the Item Condition as Used, or
     * 						did not specify a condition.
     * 						(Excludes items that the seller listed as New.)
     * 					
     * 
     */
    @XmlEnumValue("Used")
    USED("Used"),

    /**
     * 
     * 								(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemConditionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemConditionCodeType fromValue(String v) {
        for (ItemConditionCodeType c: ItemConditionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
