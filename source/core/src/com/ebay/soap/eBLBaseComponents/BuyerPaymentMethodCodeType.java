
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerPaymentMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerPaymentMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MOCC"/>
 *     &lt;enumeration value="AmEx"/>
 *     &lt;enumeration value="PaymentSeeDescription"/>
 *     &lt;enumeration value="CCAccepted"/>
 *     &lt;enumeration value="PersonalCheck"/>
 *     &lt;enumeration value="VisaMC"/>
 *     &lt;enumeration value="PaisaPayAccepted"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="CashOnPickup"/>
 *     &lt;enumeration value="MoneyXferAccepted"/>
 *     &lt;enumeration value="MoneyXferAcceptedInCheckout"/>
 *     &lt;enumeration value="OtherOnlinePayments"/>
 *     &lt;enumeration value="Escrow"/>
 *     &lt;enumeration value="PrePayDelivery"/>
 *     &lt;enumeration value="CODPrePayDelivery"/>
 *     &lt;enumeration value="PostalTransfer"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="LoanCheck"/>
 *     &lt;enumeration value="CashInPerson"/>
 *     &lt;enumeration value="ELV"/>
 *     &lt;enumeration value="PaisaPayEscrow"/>
 *     &lt;enumeration value="PaisaPayEscrowEMI"/>
 *     &lt;enumeration value="IntegratedMerchantCreditCard"/>
 *     &lt;enumeration value="Moneybookers"/>
 *     &lt;enumeration value="Paymate"/>
 *     &lt;enumeration value="ProPay"/>
 *     &lt;enumeration value="PayOnPickup"/>
 *     &lt;enumeration value="Diners"/>
 *     &lt;enumeration value="StandardPayment"/>
 *     &lt;enumeration value="DirectDebit"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="PayUponInvoice"/>
 *     &lt;enumeration value="QIWI"/>
 *     &lt;enumeration value="PayPalCredit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BuyerPaymentMethodCodeType")
@XmlEnum
public enum BuyerPaymentMethodCodeType {


    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This enumeration value indicates that a money order or cashiers check is accepted for payment. This value is only applicable for offline payments and is not supported on all marketplaces.
     * 					
     * 
     */
    MOCC("MOCC"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("PaymentSeeDescription")
    PAYMENT_SEE_DESCRIPTION("PaymentSeeDescription"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("CCAccepted")
    CC_ACCEPTED("CCAccepted"),

    /**
     * 
     * 						This enumeration value indicates that a personal check is accepted for payment. This value is only applicable for offline payments and is not supported on all marketplaces.
     * 					
     * 
     */
    @XmlEnumValue("PersonalCheck")
    PERSONAL_CHECK("PersonalCheck"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("VisaMC")
    VISA_MC("VisaMC"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayAccepted")
    PAISA_PAY_ACCEPTED("PaisaPayAccepted"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),

    /**
     * 
     * 						This enumeration value indicates that cash on pickup is accepted for payment. This value is only applicable for offline payments.
     * 					
     * 
     */
    @XmlEnumValue("CashOnPickup")
    CASH_ON_PICKUP("CashOnPickup"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAccepted")
    MONEY_XFER_ACCEPTED("MoneyXferAccepted"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAcceptedInCheckout")
    MONEY_XFER_ACCEPTED_IN_CHECKOUT("MoneyXferAcceptedInCheckout"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("OtherOnlinePayments")
    OTHER_ONLINE_PAYMENTS("OtherOnlinePayments"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("Escrow")
    ESCROW("Escrow"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("PrePayDelivery")
    PRE_PAY_DELIVERY("PrePayDelivery"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("CODPrePayDelivery")
    COD_PRE_PAY_DELIVERY("CODPrePayDelivery"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("PostalTransfer")
    POSTAL_TRANSFER("PostalTransfer"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("LoanCheck")
    LOAN_CHECK("LoanCheck"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("CashInPerson")
    CASH_IN_PERSON("CashInPerson"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 						
     * 					
     * 
     */
    ELV("ELV"),

    /**
     * 
     * 						This payment type is no longer applicable since eBay India is no longer a functioning site.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayEscrow")
    PAISA_PAY_ESCROW("PaisaPayEscrow"),

    /**
     * 
     * 						This payment type is no longer applicable since eBay India is no longer a functioning site.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayEscrowEMI")
    PAISA_PAY_ESCROW_EMI("PaisaPayEscrowEMI"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("IntegratedMerchantCreditCard")
    INTEGRATED_MERCHANT_CREDIT_CARD("IntegratedMerchantCreditCard"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Moneybookers")
    MONEYBOOKERS("Moneybookers"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Paymate")
    PAYMATE("Paymate"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ProPay")
    PRO_PAY("ProPay"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("PayOnPickup")
    PAY_ON_PICKUP("PayOnPickup"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("Diners")
    DINERS("Diners"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("StandardPayment")
    STANDARD_PAYMENT("StandardPayment"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebit")
    DIRECT_DEBIT("DirectDebit"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),

    /**
     * 
     * 						This enumeration value is deprecated, and should no longer be used in listing flows.
     * 					
     * 
     */
    @XmlEnumValue("PayUponInvoice")
    PAY_UPON_INVOICE("PayUponInvoice"),

    /**
     * 
     * 					This payment method is deprecated.
     * 				
     * 
     */
    QIWI("QIWI"),

    /**
     * 
     * 					This payment method is deprecated.
     * 				
     * 
     */
    @XmlEnumValue("PayPalCredit")
    PAY_PAL_CREDIT("PayPalCredit");
    private final String value;

    BuyerPaymentMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuyerPaymentMethodCodeType fromValue(String v) {
        for (BuyerPaymentMethodCodeType c: BuyerPaymentMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
