
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HitCounterCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HitCounterCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoHitCounter"/>
 *     &lt;enumeration value="HonestyStyle"/>
 *     &lt;enumeration value="GreenLED"/>
 *     &lt;enumeration value="Hidden"/>
 *     &lt;enumeration value="BasicStyle"/>
 *     &lt;enumeration value="RetroStyle"/>
 *     &lt;enumeration value="HiddenStyle"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "HitCounterCodeType")
@XmlEnum
public enum HitCounterCodeType {


    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("NoHitCounter")
    NO_HIT_COUNTER("NoHitCounter"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("HonestyStyle")
    HONESTY_STYLE("HonestyStyle"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("GreenLED")
    GREEN_LED("GreenLED"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Hidden")
    HIDDEN("Hidden"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("BasicStyle")
    BASIC_STYLE("BasicStyle"),

    /**
     * 
     * 						 This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("RetroStyle")
    RETRO_STYLE("RetroStyle"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("HiddenStyle")
    HIDDEN_STYLE("HiddenStyle"),

    /**
     * 
     * 							Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    HitCounterCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HitCounterCodeType fromValue(String v) {
        for (HitCounterCodeType c: HitCounterCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
