
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerPaymentMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerPaymentMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NothingOnFile"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="DirectDebit"/>
 *     &lt;enumeration value="DirectDebitPendingSignatureMandate"/>
 *     &lt;enumeration value="eBayDirectPay"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="DirectDebitPendingVerification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellerPaymentMethodCodeType")
@XmlEnum
public enum SellerPaymentMethodCodeType {


    /**
     * 
     * 						This enumeration value indicates that eBay does not currently have a payment method on file for the eBay user.
     * 					
     * 
     */
    @XmlEnumValue("NothingOnFile")
    NOTHING_ON_FILE("NothingOnFile"),

    /**
     * 
     * 						This enumeration value indicates that eBay will use the credit card on file to process the eBay user's monthly invoice.
     * 					
     * 
     */
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     * 						This enumeration value indicates that eBay will debit the bank account on file to process the eBay user's monthly invoice.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebit")
    DIRECT_DEBIT("DirectDebit"),

    /**
     * 
     * 						 This enumeration value indicates that eBay will debit the bank account on file to process the eBay user's monthly invoice. A signature will be needed from the eBay user before a payment can be processed.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebitPendingSignatureMandate")
    DIRECT_DEBIT_PENDING_SIGNATURE_MANDATE("DirectDebitPendingSignatureMandate"),

    /**
     * 
     * 						 This enumeration value indicates that the eBay user will use eBay Direct Pay to pay the monthly invoice.
     * 					
     * 
     */
    @XmlEnumValue("eBayDirectPay")
    E_BAY_DIRECT_PAY("eBayDirectPay"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This enumeration value indicates that eBay will debit the bank account on file to process the eBay user's monthly invoice. However, the bank account information must be verified before a payment can be processed.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebitPendingVerification")
    DIRECT_DEBIT_PENDING_VERIFICATION("DirectDebitPendingVerification");
    private final String value;

    SellerPaymentMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerPaymentMethodCodeType fromValue(String v) {
        for (SellerPaymentMethodCodeType c: SellerPaymentMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
