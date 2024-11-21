
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VATStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VATStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoVATTax"/>
 *     &lt;enumeration value="VATTax"/>
 *     &lt;enumeration value="VATExempt"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "VATStatusCodeType")
@XmlEnum
public enum VATStatusCodeType {


    /**
     * 
     * 						(out) VAT is not applicable
     * 					
     * 
     */
    @XmlEnumValue("NoVATTax")
    NO_VAT_TAX("NoVATTax"),

    /**
     * 
     * 						(out) Residence in a country with VAT and user is not registered as VAT-exempt
     * 					
     * 
     */
    @XmlEnumValue("VATTax")
    VAT_TAX("VATTax"),

    /**
     * 
     * 						(out) Residence in a country with VAT and user is registered as VAT-exempt
     * 					
     * 
     */
    @XmlEnumValue("VATExempt")
    VAT_EXEMPT("VATExempt"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    VATStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VATStatusCodeType fromValue(String v) {
        for (VATStatusCodeType c: VATStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
