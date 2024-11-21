
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerPaymentInstrumentCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerPaymentInstrumentCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="BankDirectDebit"/>
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="ELV"/>
 *     &lt;enumeration value="LocalPaymentCreditCardOther"/>
 *     &lt;enumeration value="LocalPaymentELV"/>
 *     &lt;enumeration value="LocalPaymentMasterCard"/>
 *     &lt;enumeration value="LocalPaymentAMEX"/>
 *     &lt;enumeration value="LocalPaymentVISA"/>
 *     &lt;enumeration value="LocalPaymentDiscover"/>
 *     &lt;enumeration value="LocalPaymentDinersclub"/>
 *     &lt;enumeration value="LocalPaymentJCB"/>
 *     &lt;enumeration value="LocalPaymentSWITCH"/>
 *     &lt;enumeration value="LocalPaymentSOLO"/>
 *     &lt;enumeration value="GIROPAY"/>
 *     &lt;enumeration value="BML"/>
 *     &lt;enumeration value="PayUponInvoice"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BuyerPaymentInstrumentCodeType")
@XmlEnum
public enum BuyerPaymentInstrumentCodeType {


    /**
     * 
     * 						This enumeration value indicates that no payment method was specified by the seller.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This enumeration value indicates that a credit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),

    /**
     * 
     * 						This enumeration value indicates that a bank debit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("BankDirectDebit")
    BANK_DIRECT_DEBIT("BankDirectDebit"),

    /**
     * 
     * 						This enumeration value indicates that PayPal was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     * 						This enumeration value indicates that Elektronisches Lastschriftverfahren (direct debit) was used to pay for the order.
     * 					
     * 
     */
    ELV("ELV"),

    /**
     * 
     * 						This enumeration value indicates that an unknown credit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("LocalPaymentCreditCardOther")
    LOCAL_PAYMENT_CREDIT_CARD_OTHER("LocalPaymentCreditCardOther"),

    /**
     * 
     * 						This enumeration value indicates that Elektronisches Lastschriftverfahren (direct debit) was used locally to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("LocalPaymentELV")
    LOCAL_PAYMENT_ELV("LocalPaymentELV"),

    /**
     * 
     * 						This enumeration value indicates that a Master Card credit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("LocalPaymentMasterCard")
    LOCAL_PAYMENT_MASTER_CARD("LocalPaymentMasterCard"),

    /**
     * 
     * 						This enumeration value indicates that an American Express credit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("LocalPaymentAMEX")
    LOCAL_PAYMENT_AMEX("LocalPaymentAMEX"),

    /**
     * 
     * 						This enumeration value indicates that a Visa credit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("LocalPaymentVISA")
    LOCAL_PAYMENT_VISA("LocalPaymentVISA"),

    /**
     * 
     * 						This enumeration value indicates that a Discover credit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("LocalPaymentDiscover")
    LOCAL_PAYMENT_DISCOVER("LocalPaymentDiscover"),

    /**
     * 
     * 						This enumeration value indicates that a Diners Club credit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("LocalPaymentDinersclub")
    LOCAL_PAYMENT_DINERSCLUB("LocalPaymentDinersclub"),

    /**
     * 
     * 						This enumeration value indicates that a JCB credit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("LocalPaymentJCB")
    LOCAL_PAYMENT_JCB("LocalPaymentJCB"),

    /**
     * 
     * 						This enumeration value indicates that a Switch debit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("LocalPaymentSWITCH")
    LOCAL_PAYMENT_SWITCH("LocalPaymentSWITCH"),

    /**
     * 
     * 						This enumeration value indicates that a Solo debit card was used to pay for the order.
     * 					
     * 
     */
    @XmlEnumValue("LocalPaymentSOLO")
    LOCAL_PAYMENT_SOLO("LocalPaymentSOLO"),

    /**
     * 
     * 						This enumeration value indicates that Giropay was used to pay for the order.
     * 					
     * 
     */
    GIROPAY("GIROPAY"),

    /**
     * 
     * 						This enumeration value indicates that BML was used to pay for the order.
     * 					
     * 
     */
    BML("BML"),

    /**
     * 
     * 						This enumeration value indicates that the 'Pay Upon Invoice' option was offered to the buyer on the Germany site.
     * 					
     * 
     */
    @XmlEnumValue("PayUponInvoice")
    PAY_UPON_INVOICE("PayUponInvoice"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BuyerPaymentInstrumentCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuyerPaymentInstrumentCodeType fromValue(String v) {
        for (BuyerPaymentInstrumentCodeType c: BuyerPaymentInstrumentCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
