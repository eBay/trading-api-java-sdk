
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InventoryTrackingMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InventoryTrackingMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemID"/>
 *     &lt;enumeration value="SKU"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "InventoryTrackingMethodCodeType")
@XmlEnum
public enum InventoryTrackingMethodCodeType {


    /**
     * 
     * 					Indicates the seller prefers to track the listing by its eBay item ID.
     * 					This is the default for all listings.
     * 				
     * 
     */
    @XmlEnumValue("ItemID")
    ITEM_ID("ItemID"),

    /**
     * 
     * 					Indicates the seller prefers to track the listing by their own SKU.
     * 					<br/><br/>
     * 					When you track by SKU, it means you can pass in your SKU instead of
     * 					the eBay item ID in other calls that support SKU as an input field.
     * 					If you choose SKU as your tracking preference for a listing,
     * 					the value in <b>Item.SKU</b> must be unique across your active listings.
     * 					You cannot create new listings with the same <b>Item.SKU</b> value while
     * 					the listing is active (that is, until the existing listing with that
     * 					SKU has ended).
     * 					<br/><br/>
     * 					However, you can use <b>ReviseInventoryStatus</b> to update the quantity
     * 					and/or price for the existing SKU as needed. When revising a listing
     * 					where the <b>InventoryTrackingMethod</b> was set to SKU, you must pass in both
     * 					the <b>InventoryTrackingMethod</b> tag (with the value set to SKU) and the SKU
     * 					tag with the SKU value from your original listing.
     * 				
     * 
     */
    SKU("SKU"),

    /**
     * 
     * 					Reserved for internal or future use.
     * 				
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    InventoryTrackingMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InventoryTrackingMethodCodeType fromValue(String v) {
        for (InventoryTrackingMethodCodeType c: InventoryTrackingMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
