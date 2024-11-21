
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoPaymentFailure"/>
 *     &lt;enumeration value="BuyerECheckBounced"/>
 *     &lt;enumeration value="BuyerCreditCardFailed"/>
 *     &lt;enumeration value="BuyerFailedPaymentReportedBySeller"/>
 *     &lt;enumeration value="PayPalPaymentInProcess"/>
 *     &lt;enumeration value="PaymentInProcess"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaymentStatusCodeType")
@XmlEnum
public enum PaymentStatusCodeType {


    /**
     * 
     * 						This value indicates that the buyer's payment for the order has cleared. A 
     * 						<b>CheckoutStatus.eBayPaymentStatus</b> value of 'NoPaymentFailure' 
     * 						and a <b>CheckoutStatus.Status</b> value of 'Complete' indicates that 
     * 						checkout is complete.
     * 					
     * 
     */
    @XmlEnumValue("NoPaymentFailure")
    NO_PAYMENT_FAILURE("NoPaymentFailure"),

    /**
     * 
     * 						This value should no longer be returned as electronic checks are no longer a valid buyer payment method on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("BuyerECheckBounced")
    BUYER_E_CHECK_BOUNCED("BuyerECheckBounced"),

    /**
     * 
     * 						This value should no longer be returned as the buyer's form of electronic payment is no longer exposed to the seller since eBay now receives payment from the buyer.
     * 					
     * 
     */
    @XmlEnumValue("BuyerCreditCardFailed")
    BUYER_CREDIT_CARD_FAILED("BuyerCreditCardFailed"),

    /**
     * 
     * 						This value indicates that the seller reported the buyer's offline payment as failed. This enumeration value would only be applicable for a sales transaction that occurred off of eBay's platform.
     * 					
     * 
     */
    @XmlEnumValue("BuyerFailedPaymentReportedBySeller")
    BUYER_FAILED_PAYMENT_REPORTED_BY_SELLER("BuyerFailedPaymentReportedBySeller"),

    /**
     * 
     * 						This value should no longer be returned as the buyer's form of electronic payment is no longer exposed to the seller since eBay now receives payment from the buyer.
     * 					
     * 
     */
    @XmlEnumValue("PayPalPaymentInProcess")
    PAY_PAL_PAYMENT_IN_PROCESS("PayPalPaymentInProcess"),

    /**
     * 
     * 						This value indicates that the buyer's payment is in process, but has not yet cleared. 
     * 						<br/>
     * 						<br/>
     * 							<span class="tablenote"><b>Note:</b>
     * 							This value may also get returned for a sales transaction that occurred off of eBay's platform, and the payment status may stay in this state unless the seller marks the order as paid.</span>
     * 					
     * 
     */
    @XmlEnumValue("PaymentInProcess")
    PAYMENT_IN_PROCESS("PaymentInProcess"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PaymentStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentStatusCodeType fromValue(String v) {
        for (PaymentStatusCodeType c: PaymentStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
