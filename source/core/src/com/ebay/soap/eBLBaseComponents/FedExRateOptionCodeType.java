
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FedExRateOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FedExRateOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FedExStandardList"/>
 *     &lt;enumeration value="FedExCounter"/>
 *     &lt;enumeration value="FedExDiscounted"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FedExRateOptionCodeType")
@XmlEnum
public enum FedExRateOptionCodeType {


    /**
     * 
     * 						This enumeration value indicates that the seller offers buyers the standard Federal Express shipping rates.
     * 					
     * 
     */
    @XmlEnumValue("FedExStandardList")
    FED_EX_STANDARD_LIST("FedExStandardList"),

    /**
     * 
     * 						This enumeration value indicates that the seller offers buyers Federal Express counter rates.
     * 					
     * 
     */
    @XmlEnumValue("FedExCounter")
    FED_EX_COUNTER("FedExCounter"),

    /**
     * 
     * 						This enumeration value indicates that the seller offers buyers discounted Federal Express shipping rates. Buyers will get these discounted shipping rates as long as they use the eBay-generated shipping labels.
     * 					
     * 
     */
    @XmlEnumValue("FedExDiscounted")
    FED_EX_DISCOUNTED("FedExDiscounted"),

    /**
     * 
     * 						 Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FedExRateOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FedExRateOptionCodeType fromValue(String v) {
        for (FedExRateOptionCodeType c: FedExRateOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
