
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundingSourceTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundingSourceTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ScheduledPayout"/>
 *     &lt;enumeration value="Paypal"/>
 *     &lt;enumeration value="BankAccount"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RefundingSourceTypeCodeType")
@XmlEnum
public enum RefundingSourceTypeCodeType {


    /**
     * 
     * 					 This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ScheduledPayout")
    SCHEDULED_PAYOUT("ScheduledPayout"),

    /**
     * 
     * 					 This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Paypal")
    PAYPAL("Paypal"),

    /**
     * 
     * 					 This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("BankAccount")
    BANK_ACCOUNT("BankAccount"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundingSourceTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundingSourceTypeCodeType fromValue(String v) {
        for (RefundingSourceTypeCodeType c: RefundingSourceTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
