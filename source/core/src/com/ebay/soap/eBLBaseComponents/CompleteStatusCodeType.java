
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompleteStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompleteStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Incomplete"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CompleteStatusCodeType")
@XmlEnum
public enum CompleteStatusCodeType {


    /**
     * 
     * 						This value indicates that the order or order line item is in the incomplete state. Generally speaking, an order or order line item is considered incomplete when payment from the buyer has yet to be initiated.
     * 					
     * 
     */
    @XmlEnumValue("Incomplete")
    INCOMPLETE("Incomplete"),

    /**
     * 
     * 						This value indicates that the order or order line item is complete. Generally speaking, an order or order line item is complete when payment from the buyer has been initiated and has been processed.
     * 						<br><br>
     * 						<span class="tablenote"><b>Note:</b>
     * 						If the <b>PaymentMethodUsed</b> is <code>CashOnPickup</code>,
     * 						the <b>CheckoutStatus.Status</b> value in <b>GetOrders</b> will be
     * 						<code>Complete</code> at checkout time, even though the seller may not have been officially paid
     * 						yet. The <b>CheckoutStatus.Status</b> value in <b>GetOrders</b> will
     * 						remain as <code>Complete</code> even if the seller
     * 						changes the checkout status to Pending. However, the <b>eBayPaymentStatus</b>
     * 						value in <b>GetOrders</b> will change from <code>NoPaymentFailure</code> to
     * 						<code>PaymentInProcess</code>.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),

    /**
     * 
     * 						This value indicates that the order or order line item is in the pending state. Generally speaking, an order is considered pending when payment
     * 						from the buyer has been initiated but has yet to be fully processed.
     * 						<br><br>
     * 						<span class="tablenote"><b>Note:</b>
     * 						If the payment method is <code>CashOnPickup</code>, the
     * 						<b>CheckoutStatus.Status</b> value in <b>GetOrders</b> will read <code>Complete</code> at checkout time,
     * 						even though the seller may not have been officially paid yet. The
     * 						<b>CheckoutStatus.Status</b> value in <b>GetOrders</b> will remain as <code>Complete</code> even if the
     * 						seller changes the checkout status to Pending.
     * 						However, the <b>eBayPaymentStatus</b> value in <b>GetOrders</b> will change from
     * 						<code>NoPaymentFailure</code> to <code>PaymentInProcess</code>.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CompleteStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompleteStatusCodeType fromValue(String v) {
        for (CompleteStatusCodeType c: CompleteStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
