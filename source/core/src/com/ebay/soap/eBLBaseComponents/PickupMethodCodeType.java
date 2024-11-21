
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PickupMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="InStorePickup"/>
 *     &lt;enumeration value="PickUpDropOff"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PickupMethodCodeType")
@XmlEnum
public enum PickupMethodCodeType {


    /**
     * 
     * 						This value indicates that the buyer will pick up the In-Store Pickup item at the merchant's physical store.
     * 						<br/><br/>
     * 						<span class="tablenote">
     * 						<strong>Note:</strong> A merchant must be eligible for the In-Store Pickup feature to list an item that is eligible for In-Store Pickup. At this time, the In-Store Pickup feature is generally only available to large retail merchants in US, and can only be applied to multi-quantity, fixed-price listings.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("InStorePickup")
    IN_STORE_PICKUP("InStorePickup"),

    /**
     * 
     * 						This value indicates that the buyer will pick up the "Click and Collect" item at the merchant's physical store.
     * 						<br/><br/>
     * 						<span class="tablenote">
     * 						<strong>Note:</strong> A merchant must be eligible for the "Click and Collect" feature to list an item that is eligible for "Click and Collect". At this time, the "Click and Collect" feature is only available to large merchants on the eBay UK (site ID - 3), eBay Australia (Site ID - 15), and eBay Germany (Site ID - 77) sites. sites.
     * 					
     * 
     */
    @XmlEnumValue("PickUpDropOff")
    PICK_UP_DROP_OFF("PickUpDropOff"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PickupMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PickupMethodCodeType fromValue(String v) {
        for (PickupMethodCodeType c: PickupMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
