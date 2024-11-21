
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMSSubscriptionErrorCodeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SMSSubscriptionErrorCodeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SMSAggregatorNotAvailable"/>
 *     &lt;enumeration value="PhoneNumberInvalid"/>
 *     &lt;enumeration value="PhoneNumberChanged"/>
 *     &lt;enumeration value="PhoneNumberCarrierChanged"/>
 *     &lt;enumeration value="UserRequestedUnregistration"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SMSSubscriptionErrorCodeCodeType")
@XmlEnum
public enum SMSSubscriptionErrorCodeCodeType {


    /**
     * 
     * 						Aggregator not available.
     * 					
     * 
     */
    @XmlEnumValue("SMSAggregatorNotAvailable")
    SMS_AGGREGATOR_NOT_AVAILABLE("SMSAggregatorNotAvailable"),

    /**
     * 
     * 						Phone number invalid.
     * 					
     * 
     */
    @XmlEnumValue("PhoneNumberInvalid")
    PHONE_NUMBER_INVALID("PhoneNumberInvalid"),

    /**
     * 
     * 						Phone number has changed.
     * 					
     * 
     */
    @XmlEnumValue("PhoneNumberChanged")
    PHONE_NUMBER_CHANGED("PhoneNumberChanged"),

    /**
     * 
     * 						The carrier has changed.
     * 					
     * 
     */
    @XmlEnumValue("PhoneNumberCarrierChanged")
    PHONE_NUMBER_CARRIER_CHANGED("PhoneNumberCarrierChanged"),

    /**
     * 
     * 						The user has requested to be unregistered.
     * 					
     * 
     */
    @XmlEnumValue("UserRequestedUnregistration")
    USER_REQUESTED_UNREGISTRATION("UserRequestedUnregistration"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SMSSubscriptionErrorCodeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SMSSubscriptionErrorCodeCodeType fromValue(String v) {
        for (SMSSubscriptionErrorCodeCodeType c: SMSSubscriptionErrorCodeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
