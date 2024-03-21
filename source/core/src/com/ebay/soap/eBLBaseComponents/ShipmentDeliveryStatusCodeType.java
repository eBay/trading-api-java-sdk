
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentDeliveryStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentDeliveryStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="DroppedOff"/>
 *     &lt;enumeration value="InTransit"/>
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="Returned"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="LabelPrinted"/>
 *     &lt;enumeration value="Unconfirmed"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShipmentDeliveryStatusCodeType")
@XmlEnum
public enum ShipmentDeliveryStatusCodeType {


    /**
     * 
     * 						Created (default).
     * 					
     * 
     */
    @XmlEnumValue("Created")
    CREATED("Created"),

    /**
     * 
     * 						Dropped off.
     * 					
     * 
     */
    @XmlEnumValue("DroppedOff")
    DROPPED_OFF("DroppedOff"),

    /**
     * 
     * 						In transit.
     * 					
     * 
     */
    @XmlEnumValue("InTransit")
    IN_TRANSIT("InTransit"),

    /**
     * 
     * 						Delivered.
     * 					
     * 
     */
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),

    /**
     * 
     * 						Returned.
     * 					
     * 
     */
    @XmlEnumValue("Returned")
    RETURNED("Returned"),

    /**
     * 
     * 						Cancelled.
     * 					
     * 
     */
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),

    /**
     * 
     * 						Label printed.
     * 					
     * 
     */
    @XmlEnumValue("LabelPrinted")
    LABEL_PRINTED("LabelPrinted"),

    /**
     * 
     * 						Unconfirmed.
     * 					
     * 
     */
    @XmlEnumValue("Unconfirmed")
    UNCONFIRMED("Unconfirmed"),

    /**
     * 
     * 						Unknown.
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						Error.
     * 					
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShipmentDeliveryStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShipmentDeliveryStatusCodeType fromValue(String v) {
        for (ShipmentDeliveryStatusCodeType c: ShipmentDeliveryStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
