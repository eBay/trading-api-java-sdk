
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProPackCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProPackCodeType">
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
@XmlType(name = "ProPackCodeType")
@XmlEnum
public enum ProPackCodeType {


    /**
     * 
     * 						This value indicates that the Pro Pack listing upgrade is available for all sellers on the listing site.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						This value indicates that the Pro Pack listing upgrade is not available to any sellers on the listing site.
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						This value indicates that the Pro Pack listing upgrade is only available to seller with Power Seller status on the listing site.
     * 					
     * 
     */
    @XmlEnumValue("PowerSellerOnly")
    POWER_SELLER_ONLY("PowerSellerOnly"),

    /**
     * 
     * 						This value indicates that the Pro Pack listing upgrade is only available to Top Rated sellers on the listing site.
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

    ProPackCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProPackCodeType fromValue(String v) {
        for (ProPackCodeType c: ProPackCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
