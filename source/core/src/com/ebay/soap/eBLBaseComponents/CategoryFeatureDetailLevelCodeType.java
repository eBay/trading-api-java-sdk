
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryFeatureDetailLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryFeatureDetailLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ReturnAll"/>
 *     &lt;enumeration value="ReturnFeatureDefinitions"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CategoryFeatureDetailLevelCodeType")
@XmlEnum
public enum CategoryFeatureDetailLevelCodeType {


    /**
     * 
     * 						
     * 					  Return all available data.
     * 					
     * 
     */
    @XmlEnumValue("ReturnAll")
    RETURN_ALL("ReturnAll"),

    /**
     * 
     * 						
     * 					  Return the category feature definitions only.
     * 					
     * 
     */
    @XmlEnumValue("ReturnFeatureDefinitions")
    RETURN_FEATURE_DEFINITIONS("ReturnFeatureDefinitions"),

    /**
     * 
     * 						
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CategoryFeatureDetailLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryFeatureDetailLevelCodeType fromValue(String v) {
        for (CategoryFeatureDetailLevelCodeType c: CategoryFeatureDetailLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
