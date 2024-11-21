
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CombinedPaymentOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CombinedPaymentOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoCombinedPayment"/>
 *     &lt;enumeration value="DiscountSpecified"/>
 *     &lt;enumeration value="SpecifyDiscountLater"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CombinedPaymentOptionCodeType")
@XmlEnum
public enum CombinedPaymentOptionCodeType {


    /**
     * 
     * 					This value indicates that the seller does not allow Combined Invoice orders. In
     * 					other words, the buyer must pay for each order line item separately, and cannot
     * 					combine multiple single line item orders into one Combined Invoice order and make
     * 					one payment for that order.
     * 				
     * 
     */
    @XmlEnumValue("NoCombinedPayment")
    NO_COMBINED_PAYMENT("NoCombinedPayment"),

    /**
     * 
     * 					This value indicates that the seller allows Combined Invoice orders, and that the
     * 					seller has one or more shipping discount rules (Flat, Calculated, or Promotional)
     * 					that can be applied at the listing level.
     * 				
     * 
     */
    @XmlEnumValue("DiscountSpecified")
    DISCOUNT_SPECIFIED("DiscountSpecified"),

    /**
     * 
     * 					This value indicates that the seller allows Combined Invoice orders, and that the
     * 					seller will apply any shipping discounts after the creation of the Combined Invoice
     * 					order.
     * 				
     * 
     */
    @XmlEnumValue("SpecifyDiscountLater")
    SPECIFY_DISCOUNT_LATER("SpecifyDiscountLater"),

    /**
     * 
     * 					Reserved for internal or future use.
     * 				
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CombinedPaymentOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CombinedPaymentOptionCodeType fromValue(String v) {
        for (CombinedPaymentOptionCodeType c: CombinedPaymentOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
