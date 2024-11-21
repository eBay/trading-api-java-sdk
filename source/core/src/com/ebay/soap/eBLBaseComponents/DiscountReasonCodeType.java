
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SpecialOffer"/>
 *     &lt;enumeration value="Promotion"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DiscountReasonCodeType")
@XmlEnum
public enum DiscountReasonCodeType {


    /**
     * 
     * 						An offer that applies to a limited number of listings during the offering
     * 						period. Example:  "There is no insertion fee for up to 5 auctions when
     * 						listing between 12/1 and 12/10."
     * 					
     * 
     */
    @XmlEnumValue("SpecialOffer")
    SPECIAL_OFFER("SpecialOffer"),

    /**
     * 
     * 						An offer that applies to an unlimited number of listings during the offering
     * 						period. Example:  "Get subtitle for $0.10 in Tech category when listing between
     * 						12/25 and 12/28.  No limit to the number of items listed during this period."
     * 					
     * 
     */
    @XmlEnumValue("Promotion")
    PROMOTION("Promotion"),

    /**
     * 
     * 						Reserved for future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DiscountReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountReasonCodeType fromValue(String v) {
        for (DiscountReasonCodeType c: DiscountReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
