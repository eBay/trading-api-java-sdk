
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxIdentifierCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxIdentifierCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CodiceFiscale"/>
 *     &lt;enumeration value="DNI"/>
 *     &lt;enumeration value="RussianPassport"/>
 *     &lt;enumeration value="CPFTaxID"/>
 *     &lt;enumeration value="TurkeyID"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TaxIdentifierCodeType")
@XmlEnum
public enum TaxIdentifierCodeType {

    @XmlEnumValue("CodiceFiscale")
    CODICE_FISCALE("CodiceFiscale"),
    DNI("DNI"),
    @XmlEnumValue("RussianPassport")
    RUSSIAN_PASSPORT("RussianPassport"),
    @XmlEnumValue("CPFTaxID")
    CPF_TAX_ID("CPFTaxID"),
    @XmlEnumValue("TurkeyID")
    TURKEY_ID("TurkeyID"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TaxIdentifierCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxIdentifierCodeType fromValue(String v) {
        for (TaxIdentifierCodeType c: TaxIdentifierCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
