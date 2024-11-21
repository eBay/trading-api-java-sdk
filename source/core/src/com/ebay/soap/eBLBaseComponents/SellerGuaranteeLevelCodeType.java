
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerGuaranteeLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerGuaranteeLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NotEligible"/>
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Premium"/>
 *     &lt;enumeration value="Ultra"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellerGuaranteeLevelCodeType")
@XmlEnum
public enum SellerGuaranteeLevelCodeType {


    /**
     * 
     * 						(out) Not eligible for Seller Level Guarantee
     * 					
     * 
     */
    @XmlEnumValue("NotEligible")
    NOT_ELIGIBLE("NotEligible"),

    /**
     * 
     * 						(out) Regular eligibility level
     * 					
     * 
     */
    @XmlEnumValue("Regular")
    REGULAR("Regular"),

    /**
     * 
     * 						(out) Premium eligibility level
     * 					
     * 
     */
    @XmlEnumValue("Premium")
    PREMIUM("Premium"),

    /**
     * 
     * 						(out) Ultra eligibility level
     * 					
     * 
     */
    @XmlEnumValue("Ultra")
    ULTRA("Ultra"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerGuaranteeLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerGuaranteeLevelCodeType fromValue(String v) {
        for (SellerGuaranteeLevelCodeType c: SellerGuaranteeLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
