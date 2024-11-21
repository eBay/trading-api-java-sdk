
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdFormatLeadStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdFormatLeadStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Responded"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AdFormatLeadStatusCodeType")
@XmlEnum
public enum AdFormatLeadStatusCodeType {


    /**
     * 
     * 						This value will appear in the response if there is a new message from a prospective buyer that the seller has not yet responded to.
     * 					
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * 
     * 						This value will appear in the response if the seller has already responded to the prospective buyer's message.
     * 					
     * 
     */
    @XmlEnumValue("Responded")
    RESPONDED("Responded"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AdFormatLeadStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdFormatLeadStatusCodeType fromValue(String v) {
        for (AdFormatLeadStatusCodeType c: AdFormatLeadStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
