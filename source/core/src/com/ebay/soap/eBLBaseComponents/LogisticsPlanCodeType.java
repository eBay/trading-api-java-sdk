
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogisticsPlanCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogisticsPlanCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PickUpDropOff"/>
 *     &lt;enumeration value="DigitalDelivery"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "LogisticsPlanCodeType")
@XmlEnum
public enum LogisticsPlanCodeType {


    /**
     * 
     * 						This value indicates that the buyer has selected "Click and Collect" as the logistics plan. With the 'Click and Collect' feature, a buyer can purchase certain items on eBay and collect them at a local store. Buyers are notified by eBay once their items are available. The "Click and Collect" feature is only available to large merchants on the eBay UK (site ID - 3), eBay Australia (Site ID - 15), and eBay Germany (Site ID - 77) sites.
     * 					
     * 
     */
    @XmlEnumValue("PickUpDropOff")
    PICK_UP_DROP_OFF("PickUpDropOff"),

    /**
     * 
     * 						This value indicates that the order or order line item is a digital gift card that will be delivered to the buyer or the recipient of the gift card by email.
     * 					
     * 
     */
    @XmlEnumValue("DigitalDelivery")
    DIGITAL_DELIVERY("DigitalDelivery"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    LogisticsPlanCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogisticsPlanCodeType fromValue(String v) {
        for (LogisticsPlanCodeType c: LogisticsPlanCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
