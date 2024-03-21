
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionItemSelectionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionItemSelectionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PromotionItemSelectionCodeType")
@XmlEnum
public enum PromotionItemSelectionCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PromotionItemSelectionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionItemSelectionCodeType fromValue(String v) {
        for (PromotionItemSelectionCodeType c: PromotionItemSelectionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
