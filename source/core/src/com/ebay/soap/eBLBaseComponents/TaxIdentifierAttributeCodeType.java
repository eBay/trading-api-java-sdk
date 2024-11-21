
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxIdentifierAttributeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxIdentifierAttributeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="IssuingCountry"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TaxIdentifierAttributeCodeType")
@XmlEnum
public enum TaxIdentifierAttributeCodeType {


    /**
     * 
     * 						This value indicates that the value returned in the <b>BuyerTaxIdentifier.Attribute</b> field is the country that issued the buyer tax ID.
     * 					
     * 
     */
    @XmlEnumValue("IssuingCountry")
    ISSUING_COUNTRY("IssuingCountry"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TaxIdentifierAttributeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxIdentifierAttributeCodeType fromValue(String v) {
        for (TaxIdentifierAttributeCodeType c: TaxIdentifierAttributeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
