
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsiblePersonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponsiblePersonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EUResponsiblePerson"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ResponsiblePersonCodeType")
@XmlEnum
public enum ResponsiblePersonCodeType {


    /**
     * 
     * 						This value indicates the Responsible person is an EU Responsible Person. An EU Responsible Person is crucial for ensuring that products comply with all relevant regulations and safety standards to protect human health.
     * 					
     * 
     */
    @XmlEnumValue("EUResponsiblePerson")
    EU_RESPONSIBLE_PERSON("EUResponsiblePerson"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ResponsiblePersonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponsiblePersonCodeType fromValue(String v) {
        for (ResponsiblePersonCodeType c: ResponsiblePersonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
