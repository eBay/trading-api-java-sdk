
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundFailureCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundFailureCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PaypalBillingAgreementCanceled"/>
 *     &lt;enumeration value="PaypalRiskDeclinesTransaction"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RefundFailureCodeType")
@XmlEnum
public enum RefundFailureCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("PaypalBillingAgreementCanceled")
    PAYPAL_BILLING_AGREEMENT_CANCELED("PaypalBillingAgreementCanceled"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("PaypalRiskDeclinesTransaction")
    PAYPAL_RISK_DECLINES_TRANSACTION("PaypalRiskDeclinesTransaction"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundFailureCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundFailureCodeType fromValue(String v) {
        for (RefundFailureCodeType c: RefundFailureCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
