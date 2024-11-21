
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerProtectionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerProtectionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemIneligible"/>
 *     &lt;enumeration value="ItemEligible"/>
 *     &lt;enumeration value="ItemMarkedIneligible"/>
 *     &lt;enumeration value="ItemMarkedEligible"/>
 *     &lt;enumeration value="NoCoverage"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BuyerProtectionCodeType")
@XmlEnum
public enum BuyerProtectionCodeType {


    /**
     * 
     * 						This value indicates that the item is ineligible for buyer protection. In many
     * 						cases, the item is ineligible for buyer protection due to the listing category.
     * 					
     * 
     */
    @XmlEnumValue("ItemIneligible")
    ITEM_INELIGIBLE("ItemIneligible"),

    /**
     * 
     * 						This value indicates that the item is eligible for buyer protection.
     * 					
     * 
     */
    @XmlEnumValue("ItemEligible")
    ITEM_ELIGIBLE("ItemEligible"),

    /**
     * 
     * 						This value indicates that customer support has marked the item as
     * 						ineligible per special criteria (e.g., seller's account closed).
     * 					
     * 
     */
    @XmlEnumValue("ItemMarkedIneligible")
    ITEM_MARKED_INELIGIBLE("ItemMarkedIneligible"),

    /**
     * 
     * 						This value indicates that customer support has marked the item as
     * 						eligible per special criteria.
     * 					
     * 
     */
    @XmlEnumValue("ItemMarkedEligible")
    ITEM_MARKED_ELIGIBLE("ItemMarkedEligible"),

    /**
     * 
     * 						This value indicates that the item is ineligible for coverage under any buyer
     * 						protection program.
     * 					
     * 
     */
    @XmlEnumValue("NoCoverage")
    NO_COVERAGE("NoCoverage"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BuyerProtectionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuyerProtectionCodeType fromValue(String v) {
        for (BuyerProtectionCodeType c: BuyerProtectionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
