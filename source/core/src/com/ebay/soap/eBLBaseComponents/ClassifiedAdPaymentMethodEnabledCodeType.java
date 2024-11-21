
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassifiedAdPaymentMethodEnabledCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassifiedAdPaymentMethodEnabledCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EnabledWithCheckout"/>
 *     &lt;enumeration value="EnabledWithoutCheckout"/>
 *     &lt;enumeration value="NotSupported"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ClassifiedAdPaymentMethodEnabledCodeType")
@XmlEnum
public enum ClassifiedAdPaymentMethodEnabledCodeType {


    /**
     * 
     * 						Display the payment method and permit checkout.
     * 					
     * 
     */
    @XmlEnumValue("EnabledWithCheckout")
    ENABLED_WITH_CHECKOUT("EnabledWithCheckout"),

    /**
     * 
     * 						Display the payment method and suppress checkout.
     * 					
     * 
     */
    @XmlEnumValue("EnabledWithoutCheckout")
    ENABLED_WITHOUT_CHECKOUT("EnabledWithoutCheckout"),

    /**
     * 
     * 						Do not display the payment method.
     * 					
     * 
     */
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ClassifiedAdPaymentMethodEnabledCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassifiedAdPaymentMethodEnabledCodeType fromValue(String v) {
        for (ClassifiedAdPaymentMethodEnabledCodeType c: ClassifiedAdPaymentMethodEnabledCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
