
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="kg"/>
 *     &lt;enumeration value="gm"/>
 *     &lt;enumeration value="lbs"/>
 *     &lt;enumeration value="oz"/>
 *     &lt;enumeration value="cm"/>
 *     &lt;enumeration value="mm"/>
 *     &lt;enumeration value="inches"/>
 *     &lt;enumeration value="ft"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "UnitCodeType")
@XmlEnum
public enum UnitCodeType {


    /**
     * 
     * 						Kilograms
     * 					
     * 
     */
    @XmlEnumValue("kg")
    KG("kg"),

    /**
     * 
     * 						Grams
     * 					
     * 
     */
    @XmlEnumValue("gm")
    GM("gm"),

    /**
     * 
     * 						Pounds
     * 					
     * 
     */
    @XmlEnumValue("lbs")
    LBS("lbs"),

    /**
     * 
     * 						Ounces
     * 					
     * 
     */
    @XmlEnumValue("oz")
    OZ("oz"),

    /**
     * 
     * 						Centimeters
     * 					
     * 
     */
    @XmlEnumValue("cm")
    CM("cm"),

    /**
     * 
     * 						Milimeters
     * 					
     * 
     */
    @XmlEnumValue("mm")
    MM("mm"),

    /**
     * 
     * 						Inches
     * 					
     * 
     */
    @XmlEnumValue("inches")
    INCHES("inches"),

    /**
     * 
     * 						Feet
     * 					
     * 
     */
    @XmlEnumValue("ft")
    FT("ft"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    UnitCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitCodeType fromValue(String v) {
        for (UnitCodeType c: UnitCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
