
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Days_1"/>
 *     &lt;enumeration value="Days_30"/>
 *     &lt;enumeration value="Days_180"/>
 *     &lt;enumeration value="Days_360"/>
 *     &lt;enumeration value="Days_540"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PeriodCodeType")
@XmlEnum
public enum PeriodCodeType {


    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("Days_1")
    DAYS_1("Days_1"),

    /**
     * 
     * 						This value indicates that the evaluation period is set back 30 days from the
     * 						present date.
     * 					
     * 
     */
    @XmlEnumValue("Days_30")
    DAYS_30("Days_30"),

    /**
     * 
     * 						This value indicates that the evaluation period is set back 180 days (approximately 6 months) from the present date.
     * 					
     * 
     */
    @XmlEnumValue("Days_180")
    DAYS_180("Days_180"),

    /**
     * 
     * 						This value indicates that the evaluation period is set back 360 days (approximately 12 months) from the present date.
     * 					
     * 
     */
    @XmlEnumValue("Days_360")
    DAYS_360("Days_360"),

    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("Days_540")
    DAYS_540("Days_540"),

    /**
     * 
     * 						This value is reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PeriodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeriodCodeType fromValue(String v) {
        for (PeriodCodeType c: PeriodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
