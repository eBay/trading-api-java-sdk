
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingTrackingEventCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingTrackingEventCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ValetReadyForPickup"/>
 *     &lt;enumeration value="ValetPickedUpOrder"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShippingTrackingEventCodeType")
@XmlEnum
public enum ShippingTrackingEventCodeType {


    /**
     * 
     * 						This value indicates that the eBay Now order is ready for pickup by the eBay Now valet at the store.
     * 					
     * 
     */
    @XmlEnumValue("ValetReadyForPickup")
    VALET_READY_FOR_PICKUP("ValetReadyForPickup"),

    /**
     * 
     * 					  This value indicates that the eBay Now order was picked up by the eBay Now valet.
     * 					
     * 
     */
    @XmlEnumValue("ValetPickedUpOrder")
    VALET_PICKED_UP_ORDER("ValetPickedUpOrder"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingTrackingEventCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingTrackingEventCodeType fromValue(String v) {
        for (ShippingTrackingEventCodeType c: ShippingTrackingEventCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
