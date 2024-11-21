
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreItemListSortOrderCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreItemListSortOrderCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EndingFirst"/>
 *     &lt;enumeration value="NewlyListed"/>
 *     &lt;enumeration value="LowestPriced"/>
 *     &lt;enumeration value="HighestPriced"/>
 *     &lt;enumeration value="LowestPricedPlusShipping"/>
 *     &lt;enumeration value="HighestPricedPlusShipping"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreItemListSortOrderCodeType")
@XmlEnum
public enum StoreItemListSortOrderCodeType {


    /**
     * 
     * 						Lists items with those ending soon listed first.
     * 					
     * 
     */
    @XmlEnumValue("EndingFirst")
    ENDING_FIRST("EndingFirst"),

    /**
     * 
     * 						Lists items with those newly listed appearing in the list first.
     * 					
     * 
     */
    @XmlEnumValue("NewlyListed")
    NEWLY_LISTED("NewlyListed"),

    /**
     * 
     * 						Lists items by price in ascending order. The item with the lowest
     * 						starting price is listed first.
     * 					
     * 
     */
    @XmlEnumValue("LowestPriced")
    LOWEST_PRICED("LowestPriced"),

    /**
     * 
     * 						Lists items by price in descending order. The item with the highest
     * 						starting price is listed first.
     * 					
     * 
     */
    @XmlEnumValue("HighestPriced")
    HIGHEST_PRICED("HighestPriced"),

    /**
     * 
     * 						Lists items by combined price and shipping cost in ascending order. The item 
     * 						with the lowest combined starting price plus shipping cost is listed first.
     * 					
     * 
     */
    @XmlEnumValue("LowestPricedPlusShipping")
    LOWEST_PRICED_PLUS_SHIPPING("LowestPricedPlusShipping"),

    /**
     * 
     * 						Reserved for future use.
     * 						Lists items by combined price and shipping cost in descending order. The item 
     * 						with the highest combined starting price plus shipping cost is listed first.
     * 					
     * 
     */
    @XmlEnumValue("HighestPricedPlusShipping")
    HIGHEST_PRICED_PLUS_SHIPPING("HighestPricedPlusShipping"),

    /**
     * 
     * 					   (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreItemListSortOrderCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreItemListSortOrderCodeType fromValue(String v) {
        for (StoreItemListSortOrderCodeType c: StoreItemListSortOrderCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
