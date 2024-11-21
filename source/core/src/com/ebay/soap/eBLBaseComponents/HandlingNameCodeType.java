
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandlingNameCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HandlingNameCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EachAdditionalAmount"/>
 *     &lt;enumeration value="EachAdditionalAmountOff"/>
 *     &lt;enumeration value="EachAdditionalPercentOff"/>
 *     &lt;enumeration value="IndividualHandlingFee"/>
 *     &lt;enumeration value="CombinedHandlingFee"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "HandlingNameCodeType")
@XmlEnum
public enum HandlingNameCodeType {


    /**
     * 
     * 						After eBay assigns the highest packaging/handling cost to the first item, the
     * 						packaging/handling cost for each additional item is $n.
     * 					
     * 
     */
    @XmlEnumValue("EachAdditionalAmount")
    EACH_ADDITIONAL_AMOUNT("EachAdditionalAmount"),

    /**
     * 
     * 						After eBay assigns the highest packaging/handling cost to the first item, the
     * 						packaging/handling cost for each additional item is to be reduced by amount N.
     * 					
     * 
     */
    @XmlEnumValue("EachAdditionalAmountOff")
    EACH_ADDITIONAL_AMOUNT_OFF("EachAdditionalAmountOff"),

    /**
     * 
     * 						After eBay assigns the highest packaging/handling cost to the first item, the
     * 						packaging/handling cost for each additional item is to be reduced by N percent.
     * 					
     * 
     */
    @XmlEnumValue("EachAdditionalPercentOff")
    EACH_ADDITIONAL_PERCENT_OFF("EachAdditionalPercentOff"),

    /**
     * 
     * 						The total packaging/handling cost is to be the sum of the
     * 						packaging/handling costs of the individual items.
     * 					
     * 
     */
    @XmlEnumValue("IndividualHandlingFee")
    INDIVIDUAL_HANDLING_FEE("IndividualHandlingFee"),

    /**
     * 
     * 						The packaging/handling cost is to be N for the entire order.
     * 					
     * 
     */
    @XmlEnumValue("CombinedHandlingFee")
    COMBINED_HANDLING_FEE("CombinedHandlingFee"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    HandlingNameCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HandlingNameCodeType fromValue(String v) {
        for (HandlingNameCodeType c: HandlingNameCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
