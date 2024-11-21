
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharitySellerStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CharitySellerStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="CreditCardExpired"/>
 *     &lt;enumeration value="TokenExpired"/>
 *     &lt;enumeration value="CreditCardAboutToExpire"/>
 *     &lt;enumeration value="RegisteredNoCreditCard"/>
 *     &lt;enumeration value="NotRegisteredLostDirectSellerStatus"/>
 *     &lt;enumeration value="DirectDebitRejected"/>
 *     &lt;enumeration value="RegisteredDirectSeller"/>
 *     &lt;enumeration value="RegisteredNoPaymentMethod"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CharitySellerStatusCodeType")
@XmlEnum
public enum CharitySellerStatusCodeType {


    /**
     * 
     * 					  The seller's charity seller account is suspended.
     * 					
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * 
     * 					  The seller is a registered charity seller.
     * 					
     * 
     */
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),

    /**
     * 
     * 					  The seller is no longer a registered charity seller. The account with the PayPal Giving Fund is closed.
     * 					
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * 
     * 					  The credit card associated with a seller's charity seller account has expired.
     * 					
     * 
     */
    @XmlEnumValue("CreditCardExpired")
    CREDIT_CARD_EXPIRED("CreditCardExpired"),

    /**
     * 
     * 					  The token associated with a seller's charity seller account has expired.
     * 					
     * 
     */
    @XmlEnumValue("TokenExpired")
    TOKEN_EXPIRED("TokenExpired"),

    /**
     * 
     * 					  The credit card associated with a seller's charity seller account will expire in 15 (or fewer) days.
     * 					
     * 
     */
    @XmlEnumValue("CreditCardAboutToExpire")
    CREDIT_CARD_ABOUT_TO_EXPIRE("CreditCardAboutToExpire"),
    @XmlEnumValue("RegisteredNoCreditCard")
    REGISTERED_NO_CREDIT_CARD("RegisteredNoCreditCard"),

    /**
     * 
     * 					  The seller is no longer a registered charity seller and has lost direct seller status.
     * 					
     * 
     */
    @XmlEnumValue("NotRegisteredLostDirectSellerStatus")
    NOT_REGISTERED_LOST_DIRECT_SELLER_STATUS("NotRegisteredLostDirectSellerStatus"),
    @XmlEnumValue("DirectDebitRejected")
    DIRECT_DEBIT_REJECTED("DirectDebitRejected"),

    /**
     * 
     * 					  The seller is a registered direct seller, but has no credit card associated with the charity seller account.
     * 					
     * 
     */
    @XmlEnumValue("RegisteredDirectSeller")
    REGISTERED_DIRECT_SELLER("RegisteredDirectSeller"),

    /**
     * 
     * 					  The seller is a registered charity seller with no donation payment method on file.
     * 					
     * 
     */
    @XmlEnumValue("RegisteredNoPaymentMethod")
    REGISTERED_NO_PAYMENT_METHOD("RegisteredNoPaymentMethod"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CharitySellerStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharitySellerStatusCodeType fromValue(String v) {
        for (CharitySellerStatusCodeType c: CharitySellerStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
