
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedbackSummaryPeriodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedbackSummaryPeriodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ThirtyDays"/>
 *     &lt;enumeration value="FiftyTwoWeeks"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FeedbackSummaryPeriodCodeType")
@XmlEnum
public enum FeedbackSummaryPeriodCodeType {


    /**
     * 
     * 						This enumeration value indicates that the Detailed Seller Rating statistics shown under each <b>AverageRatingDetails</b> container were compiled over the last 30 days.
     * 					
     * 
     */
    @XmlEnumValue("ThirtyDays")
    THIRTY_DAYS("ThirtyDays"),

    /**
     * 
     * 						This enumeration value indicates that the Detailed Seller Rating statistics shown under each <b>AverageRatingDetails</b> container were compiled over the last 52 weeks, or one year.
     * 					
     * 
     */
    @XmlEnumValue("FiftyTwoWeeks")
    FIFTY_TWO_WEEKS("FiftyTwoWeeks"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FeedbackSummaryPeriodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedbackSummaryPeriodCodeType fromValue(String v) {
        for (FeedbackSummaryPeriodCodeType c: FeedbackSummaryPeriodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
