
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageStatusTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageStatusTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Answered"/>
 *     &lt;enumeration value="Unanswered"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "MessageStatusTypeCodeType")
@XmlEnum
public enum MessageStatusTypeCodeType {


    /**
     * 
     * 						The question has been answered at least once.
     * 					
     * 
     */
    @XmlEnumValue("Answered")
    ANSWERED("Answered"),

    /**
     * 
     * 						The question has not yet been answered.
     * 					
     * 
     */
    @XmlEnumValue("Unanswered")
    UNANSWERED("Unanswered"),

    /**
     * 
     * 						Reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MessageStatusTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageStatusTypeCodeType fromValue(String v) {
        for (MessageStatusTypeCodeType c: MessageStatusTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
