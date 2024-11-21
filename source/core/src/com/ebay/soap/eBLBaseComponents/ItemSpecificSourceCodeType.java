
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSpecificSourceCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSpecificSourceCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemSpecific"/>
 *     &lt;enumeration value="Attribute"/>
 *     &lt;enumeration value="Product"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemSpecificSourceCodeType")
@XmlEnum
public enum ItemSpecificSourceCodeType {


    /**
     * 
     * 						This enumeration value indicates that the corresponding Item Specific was specified by the seller in Add/Revise/Relist call or flow. In an Add/Revise/Relist API call, Item Specifics for a listing are specified through the <b>ItemSpecifics.NameValueList</b> or <b>VariationSpecifics.NameValueList</b> (for a variation in a multiple-variation listing) containers.
     * 					
     * 
     */
    @XmlEnumValue("ItemSpecific")
    ITEM_SPECIFIC("ItemSpecific"),

    /**
     * 
     * 						This value is no longer applicable and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute"),

    /**
     * 
     * 						This enumeration value indicates that the corresponding Item Specific was derived from a product in the eBay Catalog, and was automatically picked up by the listing when the seller created, revised, or relisted an item referencing and matching an eBay catalog product through the use of an ePID or GTIN value in the <b>ProductListingDetails</b> container.
     * 					
     * 
     */
    @XmlEnumValue("Product")
    PRODUCT("Product"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemSpecificSourceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSpecificSourceCodeType fromValue(String v) {
        for (ItemSpecificSourceCodeType c: ItemSpecificSourceCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
