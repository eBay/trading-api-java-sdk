
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerBusinessCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerBusinessCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Commercial"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellerBusinessCodeType")
@XmlEnum
public enum SellerBusinessCodeType {


    /**
     * 
     * 							Type of seller account not defined.
     * 						
     * 
     */
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),

    /**
     * 
     * 							Private seller account.
     * 						
     * 
     */
    @XmlEnumValue("Private")
    PRIVATE("Private"),

    /**
     * 
     * 							Commercial seller account.
     * 						
     * 
     */
    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial"),

    /**
     * 
     * 							Reserved for internal or future use.
     * 						
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerBusinessCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerBusinessCodeType fromValue(String v) {
        for (SellerBusinessCodeType c: SellerBusinessCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
