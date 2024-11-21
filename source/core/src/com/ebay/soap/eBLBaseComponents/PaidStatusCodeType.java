
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaidStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaidStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotPaid"/>
 *     &lt;enumeration value="BuyerHasNotCompletedCheckout"/>
 *     &lt;enumeration value="PaymentPendingWithPayPal"/>
 *     &lt;enumeration value="PaidWithPayPal"/>
 *     &lt;enumeration value="MarkedAsPaid"/>
 *     &lt;enumeration value="PaymentPendingWithEscrow"/>
 *     &lt;enumeration value="PaidWithEscrow"/>
 *     &lt;enumeration value="EscrowPaymentCancelled"/>
 *     &lt;enumeration value="PaymentPendingWithPaisaPay"/>
 *     &lt;enumeration value="PaidWithPaisaPay"/>
 *     &lt;enumeration value="PaymentPending"/>
 *     &lt;enumeration value="PaymentPendingWithPaisaPayEscrow"/>
 *     &lt;enumeration value="PaidWithPaisaPayEscrow"/>
 *     &lt;enumeration value="PaisaPayNotPaid"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="WaitingForCODPayment"/>
 *     &lt;enumeration value="PaidCOD"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="PayUponInvoice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaidStatusCodeType")
@XmlEnum
public enum PaidStatusCodeType {


    /**
     * 
     * 						This enumeration value is returned if the buyer has completed checkout, but eBay cannot confirm whether or not the buyer has paid for the order. It is possible that the buyer has paid with an 'offline' payment method, but the order has not been marked as paid.
     * 					
     * 
     */
    @XmlEnumValue("NotPaid")
    NOT_PAID("NotPaid"),

    /**
     * 
     * 						This enumeration value is returned if the buyer has not completed the checkout process and so has not made payment.
     * 					
     * 
     */
    @XmlEnumValue("BuyerHasNotCompletedCheckout")
    BUYER_HAS_NOT_COMPLETED_CHECKOUT("BuyerHasNotCompletedCheckout"),

    /**
     * 
     * 						This value is deprecated and should no longer be returned.
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithPayPal")
    PAYMENT_PENDING_WITH_PAY_PAL("PaymentPendingWithPayPal"),

    /**
     * 
     * 						This value is deprecated and should no longer be returned.
     * 					
     * 
     */
    @XmlEnumValue("PaidWithPayPal")
    PAID_WITH_PAY_PAL("PaidWithPayPal"),

    /**
     * 
     * 						This enumeration value is returned if the order was marked as paid by eBay or the seller.
     * 					
     * 
     */
    @XmlEnumValue("MarkedAsPaid")
    MARKED_AS_PAID("MarkedAsPaid"),

    /**
     * 
     * 						No longer an applicable value.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithEscrow")
    PAYMENT_PENDING_WITH_ESCROW("PaymentPendingWithEscrow"),

    /**
     * 
     * 						No longer an applicable value.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaidWithEscrow")
    PAID_WITH_ESCROW("PaidWithEscrow"),

    /**
     * 
     * 						No longer an applicable value.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("EscrowPaymentCancelled")
    ESCROW_PAYMENT_CANCELLED("EscrowPaymentCancelled"),

    /**
     * 
     * 						PaisaPay is a deprecated payment method, so this value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithPaisaPay")
    PAYMENT_PENDING_WITH_PAISA_PAY("PaymentPendingWithPaisaPay"),

    /**
     * 
     * 						PaisaPay is a deprecated payment method, so this value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaidWithPaisaPay")
    PAID_WITH_PAISA_PAY("PaidWithPaisaPay"),

    /**
     * 
     * 						This enumeration value is returned if the buyer's payment is in process, but not yet complete.
     * 					
     * 
     */
    @XmlEnumValue("PaymentPending")
    PAYMENT_PENDING("PaymentPending"),

    /**
     * 
     * 						PaisaPay is a deprecated payment method, so this value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaymentPendingWithPaisaPayEscrow")
    PAYMENT_PENDING_WITH_PAISA_PAY_ESCROW("PaymentPendingWithPaisaPayEscrow"),

    /**
     * 
     * 						PaisaPay is a deprecated payment method, so this value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaidWithPaisaPayEscrow")
    PAID_WITH_PAISA_PAY_ESCROW("PaidWithPaisaPayEscrow"),

    /**
     * 
     * 						PaisaPay is a deprecated payment method, so this value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayNotPaid")
    PAISA_PAY_NOT_PAID("PaisaPayNotPaid"),

    /**
     * 
     * 						This enumeration value is returned if the buyer's payment was refunded.
     * 					
     * 
     */
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),

    /**
     * 
     * 						The selected payment method is COD and the buyer will make the payment upon delivery.
     * 					
     * 
     */
    @XmlEnumValue("WaitingForCODPayment")
    WAITING_FOR_COD_PAYMENT("WaitingForCODPayment"),

    /**
     * 
     * 						The buyer has paid for the order with the COD payment method.
     * 					
     * 
     */
    @XmlEnumValue("PaidCOD")
    PAID_COD("PaidCOD"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This enumeration value is returned if the buyer has paid for the order.
     * 					
     * 
     */
    @XmlEnumValue("Paid")
    PAID("Paid"),

    /**
     * 
     * 						This enumeration value is returned if the buyer was offered the 'Pay Upon Invoice' option. The 'Pay Upon Invoice' option is only available to eligible German buyers as part of Progressive Checkout on the German site. If a German buyer is offered the 'Pay Upon Invoice' option, that buyer is not required to pay for the order until after receiving an order invoice from the seller.
     * 					
     * 
     */
    @XmlEnumValue("PayUponInvoice")
    PAY_UPON_INVOICE("PayUponInvoice");
    private final String value;

    PaidStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaidStatusCodeType fromValue(String v) {
        for (PaidStatusCodeType c: PaidStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
