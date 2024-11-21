
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkUpMarkDownEventTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarkUpMarkDownEventTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MarkUp"/>
 *     &lt;enumeration value="MarkDown"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "MarkUpMarkDownEventTypeCodeType")
@XmlEnum
public enum MarkUpMarkDownEventTypeCodeType {


    /**
     * 
     * 						Status indicating the application was or is marked up.
     * 					
     * 
     */
    @XmlEnumValue("MarkUp")
    MARK_UP("MarkUp"),

    /**
     * 
     * 						Status indicating the application was marked down.
     * 					
     * 
     */
    @XmlEnumValue("MarkDown")
    MARK_DOWN("MarkDown"),

    /**
     * 
     * 						Reserved for future internal or external use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MarkUpMarkDownEventTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarkUpMarkDownEventTypeCodeType fromValue(String v) {
        for (MarkUpMarkDownEventTypeCodeType c: MarkUpMarkDownEventTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
