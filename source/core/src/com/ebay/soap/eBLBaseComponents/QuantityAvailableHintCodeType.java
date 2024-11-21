
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityAvailableHintCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuantityAvailableHintCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Limited"/>
 *     &lt;enumeration value="MoreThan"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "QuantityAvailableHintCodeType")
@XmlEnum
public enum QuantityAvailableHintCodeType {


    /**
     * 
     * 						(out) The message "Limited quantity available" is shown in the web
     * 						flow (e.g., for a flash sale or a Daily Deal).
     * 					
     * 
     */
    @XmlEnumValue("Limited")
    LIMITED("Limited"),

    /**
     * 
     * 						(out) The message "More than 10 available" is shown in the web flow.
     * 						10 is the value of QuantityThreshold tag based on the seller's
     * 						preference.
     * 					
     * 
     */
    @XmlEnumValue("MoreThan")
    MORE_THAN("MoreThan"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    QuantityAvailableHintCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantityAvailableHintCodeType fromValue(String v) {
        for (QuantityAvailableHintCodeType c: QuantityAvailableHintCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
