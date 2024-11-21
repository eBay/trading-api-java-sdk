
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryFrequencyCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SummaryFrequencyCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EverySunday"/>
 *     &lt;enumeration value="EveryMonday"/>
 *     &lt;enumeration value="EveryTuesday"/>
 *     &lt;enumeration value="EveryWednesday"/>
 *     &lt;enumeration value="EveryThursday"/>
 *     &lt;enumeration value="EveryFriday"/>
 *     &lt;enumeration value="EverySaturday"/>
 *     &lt;enumeration value="MonthlyOn1st"/>
 *     &lt;enumeration value="MonthlyOn2nd"/>
 *     &lt;enumeration value="MonthlyOn3rd"/>
 *     &lt;enumeration value="MonthlyOn4th"/>
 *     &lt;enumeration value="MonthlyOn5th"/>
 *     &lt;enumeration value="MonthlyOn6th"/>
 *     &lt;enumeration value="MonthlyOn7th"/>
 *     &lt;enumeration value="MonthlyOn8th"/>
 *     &lt;enumeration value="MonthlyOn9th"/>
 *     &lt;enumeration value="MonthlyOn10th"/>
 *     &lt;enumeration value="MonthlyOn11th"/>
 *     &lt;enumeration value="MonthlyOn12th"/>
 *     &lt;enumeration value="MonthlyOn13th"/>
 *     &lt;enumeration value="MonthlyOn14th"/>
 *     &lt;enumeration value="MonthlyOn15th"/>
 *     &lt;enumeration value="MonthlyOn16th"/>
 *     &lt;enumeration value="MonthlyOn17th"/>
 *     &lt;enumeration value="MonthlyOn18th"/>
 *     &lt;enumeration value="MonthlyOn19th"/>
 *     &lt;enumeration value="MonthlyOn20th"/>
 *     &lt;enumeration value="MonthlyOn21st"/>
 *     &lt;enumeration value="MonthlyOn22nd"/>
 *     &lt;enumeration value="MonthlyOn23rd"/>
 *     &lt;enumeration value="MonthlyOn24th"/>
 *     &lt;enumeration value="MonthlyOn25th"/>
 *     &lt;enumeration value="MonthlyOn26th"/>
 *     &lt;enumeration value="MonthlyOn27th"/>
 *     &lt;enumeration value="MonthlyOn28th"/>
 *     &lt;enumeration value="MonthlyOn29th"/>
 *     &lt;enumeration value="MonthlyOn30th"/>
 *     &lt;enumeration value="MonthlyOn31st"/>
 *     &lt;enumeration value="Every31Days"/>
 *     &lt;enumeration value="Every60Days"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SummaryFrequencyCodeType")
@XmlEnum
public enum SummaryFrequencyCodeType {


    /**
     * 
     * 						Deliver every Sunday.
     * 					
     * 
     */
    @XmlEnumValue("EverySunday")
    EVERY_SUNDAY("EverySunday"),

    /**
     * 
     * 						Deliver every Monday.
     * 					
     * 
     */
    @XmlEnumValue("EveryMonday")
    EVERY_MONDAY("EveryMonday"),

    /**
     * 
     * 						Deliver every Tuesday.
     * 					
     * 
     */
    @XmlEnumValue("EveryTuesday")
    EVERY_TUESDAY("EveryTuesday"),

    /**
     * 
     * 						Deliver every Wednesday.
     * 					
     * 
     */
    @XmlEnumValue("EveryWednesday")
    EVERY_WEDNESDAY("EveryWednesday"),

    /**
     * 
     * 						Deliver every Thursday.
     * 					
     * 
     */
    @XmlEnumValue("EveryThursday")
    EVERY_THURSDAY("EveryThursday"),

    /**
     * 
     * 						Deliver every Friday.
     * 					
     * 
     */
    @XmlEnumValue("EveryFriday")
    EVERY_FRIDAY("EveryFriday"),

    /**
     * 
     * 						Deliver every Saturday.
     * 					
     * 
     */
    @XmlEnumValue("EverySaturday")
    EVERY_SATURDAY("EverySaturday"),

    /**
     * 
     * 						On day 1 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn1st")
    MONTHLY_ON_1_ST("MonthlyOn1st"),

    /**
     * 
     * 						On day 2 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn2nd")
    MONTHLY_ON_2_ND("MonthlyOn2nd"),

    /**
     * 
     * 						On day 3 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn3rd")
    MONTHLY_ON_3_RD("MonthlyOn3rd"),

    /**
     * 
     * 						On day 4 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn4th")
    MONTHLY_ON_4_TH("MonthlyOn4th"),

    /**
     * 
     * 						On day 5 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn5th")
    MONTHLY_ON_5_TH("MonthlyOn5th"),

    /**
     * 
     * 						On day 6 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn6th")
    MONTHLY_ON_6_TH("MonthlyOn6th"),

    /**
     * 
     * 						On day 7 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn7th")
    MONTHLY_ON_7_TH("MonthlyOn7th"),

    /**
     * 
     * 						On day 8 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn8th")
    MONTHLY_ON_8_TH("MonthlyOn8th"),

    /**
     * 
     * 						On day 9 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn9th")
    MONTHLY_ON_9_TH("MonthlyOn9th"),

    /**
     * 
     * 						On day 10 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn10th")
    MONTHLY_ON_10_TH("MonthlyOn10th"),

    /**
     * 
     * 						On day 11 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn11th")
    MONTHLY_ON_11_TH("MonthlyOn11th"),

    /**
     * 
     * 						On day 12 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn12th")
    MONTHLY_ON_12_TH("MonthlyOn12th"),

    /**
     * 
     * 						On day 13 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn13th")
    MONTHLY_ON_13_TH("MonthlyOn13th"),

    /**
     * 
     * 						On day 14 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn14th")
    MONTHLY_ON_14_TH("MonthlyOn14th"),

    /**
     * 
     * 						On day 15 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn15th")
    MONTHLY_ON_15_TH("MonthlyOn15th"),

    /**
     * 
     * 						On day 16 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn16th")
    MONTHLY_ON_16_TH("MonthlyOn16th"),

    /**
     * 
     * 						On day 17 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn17th")
    MONTHLY_ON_17_TH("MonthlyOn17th"),

    /**
     * 
     * 						On day 18 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn18th")
    MONTHLY_ON_18_TH("MonthlyOn18th"),

    /**
     * 
     * 						On day 19 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn19th")
    MONTHLY_ON_19_TH("MonthlyOn19th"),

    /**
     * 
     * 						On day 20 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn20th")
    MONTHLY_ON_20_TH("MonthlyOn20th"),

    /**
     * 
     * 						On day 21 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn21st")
    MONTHLY_ON_21_ST("MonthlyOn21st"),

    /**
     * 
     * 						On day 22 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn22nd")
    MONTHLY_ON_22_ND("MonthlyOn22nd"),

    /**
     * 
     * 						On day 23 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn23rd")
    MONTHLY_ON_23_RD("MonthlyOn23rd"),

    /**
     * 
     * 						On day 24 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn24th")
    MONTHLY_ON_24_TH("MonthlyOn24th"),

    /**
     * 
     * 						On day 25 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn25th")
    MONTHLY_ON_25_TH("MonthlyOn25th"),

    /**
     * 
     * 						On day 26 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn26th")
    MONTHLY_ON_26_TH("MonthlyOn26th"),

    /**
     * 
     * 						On day 27 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn27th")
    MONTHLY_ON_27_TH("MonthlyOn27th"),

    /**
     * 
     * 						On day 28 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn28th")
    MONTHLY_ON_28_TH("MonthlyOn28th"),

    /**
     * 
     * 						On day 29 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn29th")
    MONTHLY_ON_29_TH("MonthlyOn29th"),

    /**
     * 
     * 						On day 30 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn30th")
    MONTHLY_ON_30_TH("MonthlyOn30th"),

    /**
     * 
     * 						On day 31 of the month.
     * 					
     * 
     */
    @XmlEnumValue("MonthlyOn31st")
    MONTHLY_ON_31_ST("MonthlyOn31st"),

    /**
     * 
     * 						Every 31 days.
     * 					
     * 
     */
    @XmlEnumValue("Every31Days")
    EVERY_31_DAYS("Every31Days"),

    /**
     * 
     * 						Every 60 days.
     * 					
     * 
     */
    @XmlEnumValue("Every60Days")
    EVERY_60_DAYS("Every60Days"),
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SummaryFrequencyCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SummaryFrequencyCodeType fromValue(String v) {
        for (SummaryFrequencyCodeType c: SummaryFrequencyCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
