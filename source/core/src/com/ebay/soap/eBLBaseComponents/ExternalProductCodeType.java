
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalProductCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalProductCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ISBN"/>
 *     &lt;enumeration value="UPC"/>
 *     &lt;enumeration value="ProductID"/>
 *     &lt;enumeration value="EAN"/>
 *     &lt;enumeration value="Keywords"/>
 *     &lt;enumeration value="MPN"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ExternalProductCodeType")
@XmlEnum
public enum ExternalProductCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    ISBN("ISBN"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    UPC("UPC"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ProductID")
    PRODUCT_ID("ProductID"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    EAN("EAN"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Keywords")
    KEYWORDS("Keywords"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    MPN("MPN"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ExternalProductCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalProductCodeType fromValue(String v) {
        for (ExternalProductCodeType c: ExternalProductCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
