
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopRatedProgramCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TopRatedProgramCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="Global"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TopRatedProgramCodeType")
@XmlEnum
public enum TopRatedProgramCodeType {


    /**
     * 
     * 						If this enumeration value is returned, it indicates that the eBay user is in the US Top-Rated Seller program.
     * 					
     * 
     */
    US("US"),

    /**
     * 
     * 						If this enumeration value is returned, it indicates that the eBay user is in the UK Top-Rated Seller program.
     * 					
     * 
     */
    UK("UK"),

    /**
     * 
     * 						If this enumeration value is returned, it indicates that the eBay user is in the Germany Top-Rated Seller program.
     * 					
     * 
     */
    DE("DE"),

    /**
     * 
     * 						If this enumeration value is returned, it indicates that the eBay user is in the Global Top-Rated Seller program.
     * 					
     * 
     */
    @XmlEnumValue("Global")
    GLOBAL("Global"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TopRatedProgramCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TopRatedProgramCodeType fromValue(String v) {
        for (TopRatedProgramCodeType c: TopRatedProgramCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
