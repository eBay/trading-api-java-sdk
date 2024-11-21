
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescriptionTemplateCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DescriptionTemplateCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Layout"/>
 *     &lt;enumeration value="Theme"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DescriptionTemplateCodeType")
@XmlEnum
public enum DescriptionTemplateCodeType {


    /**
     * 
     * 						This value indicates that the Listing Designer template is a layout template that controls how pictures and description text are
     * 						positioned on the View Item page.
     * 					
     * 
     */
    @XmlEnumValue("Layout")
    LAYOUT("Layout"),

    /**
     * 
     * 						This value indicates that the Listing Designer template is a theme template that determines which eBay-provided theme (e.g. Valentine's Day) is to be applied for presenting pictures and description text.
     * 					
     * 
     */
    @XmlEnumValue("Theme")
    THEME("Theme"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DescriptionTemplateCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DescriptionTemplateCodeType fromValue(String v) {
        for (DescriptionTemplateCodeType c: DescriptionTemplateCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
