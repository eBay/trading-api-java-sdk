
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PickupStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="PendingMerchantConfirmation"/>
 *     &lt;enumeration value="ReadyToPickup"/>
 *     &lt;enumeration value="Pickedup"/>
 *     &lt;enumeration value="PickupCancelledOutOfStock"/>
 *     &lt;enumeration value="PickupCancelledBuyerRejected"/>
 *     &lt;enumeration value="PickupCancelledBuyerNoShow"/>
 *     &lt;enumeration value="PickupCancelled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PickupStatusCodeType")
@XmlEnum
public enum PickupStatusCodeType {


    /**
     * 
     * 						This value indicates that the current status value of the In-Store Pickup order is invalid.
     * 					
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 						This value indicates that the current status value of the In-Store Pickup order is not applicable.
     * 					
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * 
     * 						This status indicates that the In-Store Pickup order has yet to be acknowledged by the merchant. This is typically the state before the merchant sends the <strong>ORDER.READY_FOR_PICKUP</strong> notification to eBay through the <strong>Inbound Notifications API</strong>.
     * 					
     * 
     */
    @XmlEnumValue("PendingMerchantConfirmation")
    PENDING_MERCHANT_CONFIRMATION("PendingMerchantConfirmation"),

    /**
     * 
     * 						This status indicates that the In-Store Pickup order is ready to be picked up by the buyer. This state occurs after the merchant sends the <strong>ORDER.READY_FOR_PICKUP</strong> notification to eBay through the <strong>Inbound Notifications API</strong>.
     * 					
     * 
     */
    @XmlEnumValue("ReadyToPickup")
    READY_TO_PICKUP("ReadyToPickup"),

    /**
     * 
     * 						This status indicates that the In-Store Pickup order has been picked up by the buyer. This state occurs after the merchant sends the <strong>ORDER.PICKEDUP</strong> notification to eBay through the <strong>Inbound Notifications API</strong>.
     * 					
     * 
     */
    @XmlEnumValue("Pickedup")
    PICKEDUP("Pickedup"),

    /**
     * 
     * 						This status indicates that the In-Store Pickup order has been cancelled by the merchant, because the product was out of stock. This state occurs after the merchant sends the <strong>ORDER.PICKUP_CANCELED</strong> notification (with the <strong>CANCEL_TYPE</strong> parameter in the notification payload set to "OUT_OF_STOCK") to eBay through the <strong>Inbound Notifications API</strong>.
     * 			    
     * 
     */
    @XmlEnumValue("PickupCancelledOutOfStock")
    PICKUP_CANCELLED_OUT_OF_STOCK("PickupCancelledOutOfStock"),

    /**
     * 
     * 						This status indicates that the In-Store Pickup order has been cancelled by the merchant, because the buyer rejected the item. This state occurs after the merchant sends the <strong>ORDER.PICKUP_CANCELED</strong> notification (with the <strong>CANCEL_TYPE</strong> parameter in the notification payload set to "BUYER_REJECTED") to eBay through the <strong>Inbound Notifications API</strong>.
     * 					
     * 
     */
    @XmlEnumValue("PickupCancelledBuyerRejected")
    PICKUP_CANCELLED_BUYER_REJECTED("PickupCancelledBuyerRejected"),

    /**
     * 
     * 						This status indicates that the In-Store Pickup order has been cancelled by the merchant, because the buyer never showed up to pick up the item. This state occurs after the merchant sends the <strong>ORDER.PICKUP_CANCELED</strong> notification (with the <strong>CANCEL_TYPE</strong> parameter in the notification payload set to "BUYER_NO_SHOW") to eBay through the <strong>Inbound Notifications API</strong>.
     * 					
     * 
     */
    @XmlEnumValue("PickupCancelledBuyerNoShow")
    PICKUP_CANCELLED_BUYER_NO_SHOW("PickupCancelledBuyerNoShow"),

    /**
     * 
     * 						This status indicates that the In-Store Pickup order has been cancelled, and the exact reason is not available.
     * 					
     * 
     */
    @XmlEnumValue("PickupCancelled")
    PICKUP_CANCELLED("PickupCancelled"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PickupStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PickupStatusCodeType fromValue(String v) {
        for (PickupStatusCodeType c: PickupStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
