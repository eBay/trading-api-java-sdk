
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassifiedAdBestOfferEnabledCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassifiedAdBestOfferEnabledCodeType">
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
@XmlType(name = "ClassifiedAdBestOfferEnabledCodeType")
@XmlEnum
public enum ClassifiedAdBestOfferEnabledCodeType {


    /**
     * 
     * 						This value indicates that Classified Ad Best Offer feature is disabled for all/most of a site's categories (if returned in the <b>SiteDefaults.ClassifiedAdBestOfferEnabled</b> field), or disabled for a specific category (if returned in the <b>Category.ClassifiedAdBestOfferEnabled</b> field).
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						This value indicates that Classified Ad Best Offer feature is enabled for all/most of a site's categories (if returned in the <b>SiteDefaults.ClassifiedAdBestOfferEnabled</b> field), or enabled for a specific category (if returned in the <b>Category.ClassifiedAdBestOfferEnabled</b> field).
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						This value indicates that Classified Ad Best Offer feature is required for a specific category (if returned in the <b>Category.ClassifiedAdBestOfferEnabled</b> field). This value is not applicable at the site level (<b>SiteDefaults</b> container).
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

    ClassifiedAdBestOfferEnabledCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassifiedAdBestOfferEnabledCodeType fromValue(String v) {
        for (ClassifiedAdBestOfferEnabledCodeType c: ClassifiedAdBestOfferEnabledCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
