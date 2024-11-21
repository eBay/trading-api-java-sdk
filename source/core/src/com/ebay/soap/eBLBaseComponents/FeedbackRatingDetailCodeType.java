
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedbackRatingDetailCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedbackRatingDetailCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemAsDescribed"/>
 *     &lt;enumeration value="Communication"/>
 *     &lt;enumeration value="ShippingTime"/>
 *     &lt;enumeration value="ShippingAndHandlingCharges"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FeedbackRatingDetailCodeType")
@XmlEnum
public enum FeedbackRatingDetailCodeType {


    /**
     * 
     * 						Detailed seller rating in the area of "item as described."
     * 					
     * 
     */
    @XmlEnumValue("ItemAsDescribed")
    ITEM_AS_DESCRIBED("ItemAsDescribed"),

    /**
     * 
     * 						Detailed seller rating in the area of "communication."
     * 					
     * 
     */
    @XmlEnumValue("Communication")
    COMMUNICATION("Communication"),

    /**
     * 
     * 						Detailed seller rating in the area of "shipping time." Inapplicable to
     * 						motor vehicle items.
     * 					
     * 
     */
    @XmlEnumValue("ShippingTime")
    SHIPPING_TIME("ShippingTime"),

    /**
     * 
     * 						Detailed seller rating in the area of "charges for shipping and handling."
     * 						Inapplicable to motor vehicle items.
     * 					
     * 
     */
    @XmlEnumValue("ShippingAndHandlingCharges")
    SHIPPING_AND_HANDLING_CHARGES("ShippingAndHandlingCharges"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FeedbackRatingDetailCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedbackRatingDetailCodeType fromValue(String v) {
        for (FeedbackRatingDetailCodeType c: FeedbackRatingDetailCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
