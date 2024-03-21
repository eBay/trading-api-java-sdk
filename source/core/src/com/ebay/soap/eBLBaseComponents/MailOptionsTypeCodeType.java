
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MailOptionsTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MailOptionsTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DoNotSendEmail"/>
 *     &lt;enumeration value="EmailCopyToSender"/>
 *     &lt;enumeration value="HideSenderEmailAddress"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "MailOptionsTypeCodeType")
@XmlEnum
public enum MailOptionsTypeCodeType {


    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("DoNotSendEmail")
    DO_NOT_SEND_EMAIL("DoNotSendEmail"),

    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("EmailCopyToSender")
    EMAIL_COPY_TO_SENDER("EmailCopyToSender"),

    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("HideSenderEmailAddress")
    HIDE_SENDER_EMAIL_ADDRESS("HideSenderEmailAddress"),

    /**
     * 
     * 						This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MailOptionsTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailOptionsTypeCodeType fromValue(String v) {
        for (MailOptionsTypeCodeType c: MailOptionsTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
