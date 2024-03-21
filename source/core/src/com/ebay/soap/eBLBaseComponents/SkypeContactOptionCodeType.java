
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkypeContactOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SkypeContactOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Chat"/>
 *     &lt;enumeration value="Voice"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SkypeContactOptionCodeType")
@XmlEnum
public enum SkypeContactOptionCodeType {


    /**
     * 
     * 						The seller can communicate with the buyer by Skype Chat.
     * 					
     * 
     */
    @XmlEnumValue("Chat")
    CHAT("Chat"),

    /**
     * 
     * 						The seller can communicate with the buyer by Skype Voice.
     * 					
     * 
     */
    @XmlEnumValue("Voice")
    VOICE("Voice"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SkypeContactOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SkypeContactOptionCodeType fromValue(String v) {
        for (SkypeContactOptionCodeType c: SkypeContactOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
