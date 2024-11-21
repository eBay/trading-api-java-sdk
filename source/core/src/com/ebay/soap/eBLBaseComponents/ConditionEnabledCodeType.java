
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionEnabledCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionEnabledCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ConditionEnabledCodeType")
@XmlEnum
public enum ConditionEnabledCodeType {


    /**
     * 
     * 						This value indicates that Condition IDs are disabled for all/most of a site's categories (if returned in the <b>SiteDefaults.ConditionEnabled</b> field), or disabled for a specific category (if returned in the <b>Category.ConditionEnabled</b> field).
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 					This value indicates that Condition IDs are enabled for all/most of a site's categories (if returned in the <b>SiteDefaults.ConditionEnabled</b> field), or enabled for a specific category (if returned in the <b>Category.ConditionEnabled</b> field).
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						This value indicates that Condition IDs are required for a specific category (if returned in the <b>Category.ConditionEnabled</b> field). This value is not applicable at the site level (<b>SiteDefaults</b> container).
     * 					
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 				  
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ConditionEnabledCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionEnabledCodeType fromValue(String v) {
        for (ConditionEnabledCodeType c: ConditionEnabledCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
