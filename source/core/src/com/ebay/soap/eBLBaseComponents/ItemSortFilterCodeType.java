
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSortFilterCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSortFilterCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EndingLast"/>
 *     &lt;enumeration value="EndingSoonest"/>
 *     &lt;enumeration value="HighestPrice"/>
 *     &lt;enumeration value="LowestPrice"/>
 *     &lt;enumeration value="NewlyListed"/>
 *     &lt;enumeration value="RandomlySelected"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemSortFilterCodeType")
@XmlEnum
public enum ItemSortFilterCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("EndingLast")
    ENDING_LAST("EndingLast"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("EndingSoonest")
    ENDING_SOONEST("EndingSoonest"),

    /**
     * 
     * 					Sort items by price, with the highest price first.
     * 					
     * 
     */
    @XmlEnumValue("HighestPrice")
    HIGHEST_PRICE("HighestPrice"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("LowestPrice")
    LOWEST_PRICE("LowestPrice"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("NewlyListed")
    NEWLY_LISTED("NewlyListed"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("RandomlySelected")
    RANDOMLY_SELECTED("RandomlySelected"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemSortFilterCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSortFilterCodeType fromValue(String v) {
        for (ItemSortFilterCodeType c: ItemSortFilterCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
