
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureManagerSubscriptionLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureManagerSubscriptionLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="Level1"/>
 *     &lt;enumeration value="Level2"/>
 *     &lt;enumeration value="Level3"/>
 *     &lt;enumeration value="Level4"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PictureManagerSubscriptionLevelCodeType")
@XmlEnum
public enum PictureManagerSubscriptionLevelCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Free")
    FREE("Free"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Level1")
    LEVEL_1("Level1"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Level2")
    LEVEL_2("Level2"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Level3")
    LEVEL_3("Level3"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Level4")
    LEVEL_4("Level4"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PictureManagerSubscriptionLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureManagerSubscriptionLevelCodeType fromValue(String v) {
        for (PictureManagerSubscriptionLevelCodeType c: PictureManagerSubscriptionLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
