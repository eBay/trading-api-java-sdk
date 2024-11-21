
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryWindowPeriodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SummaryWindowPeriodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Last24Hours"/>
 *     &lt;enumeration value="Last7Days"/>
 *     &lt;enumeration value="Last31Days"/>
 *     &lt;enumeration value="CurrentWeek"/>
 *     &lt;enumeration value="LastWeek"/>
 *     &lt;enumeration value="CurrentMonth"/>
 *     &lt;enumeration value="LastMonth"/>
 *     &lt;enumeration value="Last60Days"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SummaryWindowPeriodCodeType")
@XmlEnum
public enum SummaryWindowPeriodCodeType {


    /**
     * 
     * 						The last 24 hours.
     * 					
     * 
     */
    @XmlEnumValue("Last24Hours")
    LAST_24_HOURS("Last24Hours"),

    /**
     * 
     * 						The last 7 days.
     * 					
     * 
     */
    @XmlEnumValue("Last7Days")
    LAST_7_DAYS("Last7Days"),

    /**
     * 
     * 						The last 31 days.
     * 					
     * 
     */
    @XmlEnumValue("Last31Days")
    LAST_31_DAYS("Last31Days"),

    /**
     * 
     * 						The current week.
     * 					
     * 
     */
    @XmlEnumValue("CurrentWeek")
    CURRENT_WEEK("CurrentWeek"),

    /**
     * 
     * 						The prior week.
     * 					
     * 
     */
    @XmlEnumValue("LastWeek")
    LAST_WEEK("LastWeek"),

    /**
     * 
     * 						The current month.
     * 					
     * 
     */
    @XmlEnumValue("CurrentMonth")
    CURRENT_MONTH("CurrentMonth"),

    /**
     * 
     * 						The prior month.
     * 					
     * 
     */
    @XmlEnumValue("LastMonth")
    LAST_MONTH("LastMonth"),

    /**
     * 
     * 						The last 60 days.
     * 					
     * 
     */
    @XmlEnumValue("Last60Days")
    LAST_60_DAYS("Last60Days"),
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SummaryWindowPeriodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SummaryWindowPeriodCodeType fromValue(String v) {
        for (SummaryWindowPeriodCodeType c: SummaryWindowPeriodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
