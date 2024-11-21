
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementSystemCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementSystemCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="Metric"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "MeasurementSystemCodeType")
@XmlEnum
public enum MeasurementSystemCodeType {


    /**
     * 
     * 						This enumeration value indicates that the English system of measurement is being used. Also known as the Imperial System of Measurement. Weights in this system are expressed as pounds and ounces, and package dimensions are expressed as feet or inches.
     * 					
     * 
     */
    @XmlEnumValue("English")
    ENGLISH("English"),

    /**
     * 
     * 						This enumeration value indicates that the English system of measurement is being used. Weights in this system are expressed as kilograms and grams, and package dimensions are expressed as meters or centimeters.
     * 					
     * 
     */
    @XmlEnumValue("Metric")
    METRIC("Metric");
    private final String value;

    MeasurementSystemCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementSystemCodeType fromValue(String v) {
        for (MeasurementSystemCodeType c: MeasurementSystemCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
