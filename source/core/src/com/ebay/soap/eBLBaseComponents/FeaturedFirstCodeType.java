
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeaturedFirstCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeaturedFirstCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="PowerSellerOnly"/>
 *     &lt;enumeration value="TopRatedSellerOnly"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FeaturedFirstCodeType")
@XmlEnum
public enum FeaturedFirstCodeType {


    /**
     * 
     * 						This enumeration value indicates that the Featured First listing upgrade is enabled for all sellers on the site.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						This enumeration value indicates that the Featured First listing upgrade is not available for any sellers on the site.
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						This enumeration value indicates that the Featured First listing upgrade is only enabled for Power Sellers on the site.
     * 					
     * 
     */
    @XmlEnumValue("PowerSellerOnly")
    POWER_SELLER_ONLY("PowerSellerOnly"),

    /**
     * 
     * 						This enumeration value indicates that the Featured First listing upgrade is only enabled for Top-Rated Sellers on the site.
     * 					
     * 
     */
    @XmlEnumValue("TopRatedSellerOnly")
    TOP_RATED_SELLER_ONLY("TopRatedSellerOnly"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FeaturedFirstCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeaturedFirstCodeType fromValue(String v) {
        for (FeaturedFirstCodeType c: FeaturedFirstCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
