
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentHoldStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentHoldStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PaymentReview"/>
 *     &lt;enumeration value="MerchantHold"/>
 *     &lt;enumeration value="Released"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="NewSellerHold"/>
 *     &lt;enumeration value="PaymentHold"/>
 *     &lt;enumeration value="ReleasePending"/>
 *     &lt;enumeration value="ReleaseConfirmed"/>
 *     &lt;enumeration value="ReleaseFailed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaymentHoldStatusCodeType")
@XmlEnum
public enum PaymentHoldStatusCodeType {


    /**
     * 
     * 						This value indicates a possible issue with the buyer that needs to be reviewed by eBay.
     * 					
     * 
     */
    @XmlEnumValue("PaymentReview")
    PAYMENT_REVIEW("PaymentReview"),

    /**
     * 
     * 						This value indicates a possible issue with the seller that needs to be reviewed by eBay.
     * 					
     * 
     */
    @XmlEnumValue("MerchantHold")
    MERCHANT_HOLD("MerchantHold"),

    /**
     * 
     * 						This value indicates that a payment hold on the order has been released.
     * 					
     * 
     */
    @XmlEnumValue("Released")
    RELEASED("Released"),

    /**
     * 
     * 						This value indicates that there is no payment hold on the order.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This value indicates that there is a "new seller hold" on the order. eBay
     * 						may hold payments to a new seller for up to 21 days.
     * 					
     * 
     */
    @XmlEnumValue("NewSellerHold")
    NEW_SELLER_HOLD("NewSellerHold"),

    /**
     * 
     * 						This value indicates that there is a payment hold on the order.
     * 					
     * 
     */
    @XmlEnumValue("PaymentHold")
    PAYMENT_HOLD("PaymentHold"),

    /**
     * 
     * 						This value indicates that the process for the release of funds for the
     * 						order has been initiated.
     * 					
     * 
     */
    @XmlEnumValue("ReleasePending")
    RELEASE_PENDING("ReleasePending"),

    /**
     * 
     * 						This value indicates that the funds are available in the seller's account.
     * 					
     * 
     */
    @XmlEnumValue("ReleaseConfirmed")
    RELEASE_CONFIRMED("ReleaseConfirmed"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("ReleaseFailed")
    RELEASE_FAILED("ReleaseFailed"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PaymentHoldStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentHoldStatusCodeType fromValue(String v) {
        for (PaymentHoldStatusCodeType c: PaymentHoldStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
