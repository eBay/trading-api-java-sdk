
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFormatSortFilterCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFormatSortFilterCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ShowAnyItems"/>
 *     &lt;enumeration value="ShowItemsWithBINFirst"/>
 *     &lt;enumeration value="ShowOnlyItemsWithBIN"/>
 *     &lt;enumeration value="ShowOnlyStoreItems"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemFormatSortFilterCodeType")
@XmlEnum
public enum ItemFormatSortFilterCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ShowAnyItems")
    SHOW_ANY_ITEMS("ShowAnyItems"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ShowItemsWithBINFirst")
    SHOW_ITEMS_WITH_BIN_FIRST("ShowItemsWithBINFirst"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ShowOnlyItemsWithBIN")
    SHOW_ONLY_ITEMS_WITH_BIN("ShowOnlyItemsWithBIN"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ShowOnlyStoreItems")
    SHOW_ONLY_STORE_ITEMS("ShowOnlyStoreItems"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemFormatSortFilterCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFormatSortFilterCodeType fromValue(String v) {
        for (ItemFormatSortFilterCodeType c: ItemFormatSortFilterCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
