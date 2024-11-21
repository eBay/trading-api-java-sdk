
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedbackRatingStarCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedbackRatingStarCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Yellow"/>
 *     &lt;enumeration value="Blue"/>
 *     &lt;enumeration value="Turquoise"/>
 *     &lt;enumeration value="Purple"/>
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="YellowShooting"/>
 *     &lt;enumeration value="TurquoiseShooting"/>
 *     &lt;enumeration value="PurpleShooting"/>
 *     &lt;enumeration value="RedShooting"/>
 *     &lt;enumeration value="GreenShooting"/>
 *     &lt;enumeration value="SilverShooting"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FeedbackRatingStarCodeType")
@XmlEnum
public enum FeedbackRatingStarCodeType {


    /**
     * 
     * 						No graphic displayed, feedback score 0-9.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Yellow Star, feedback score 10-49.
     * 					
     * 
     */
    @XmlEnumValue("Yellow")
    YELLOW("Yellow"),

    /**
     * 
     * 						Blue Star, feedback score 50-99.
     * 					
     * 
     */
    @XmlEnumValue("Blue")
    BLUE("Blue"),

    /**
     * 
     * 						Turquoise Star, feedback score 100-499.
     * 					
     * 
     */
    @XmlEnumValue("Turquoise")
    TURQUOISE("Turquoise"),

    /**
     * 
     * 						Purple Star, feedback score 500-999.
     * 					
     * 
     */
    @XmlEnumValue("Purple")
    PURPLE("Purple"),

    /**
     * 
     * 						Red Star, feedback score 1,000-4,999
     * 					
     * 
     */
    @XmlEnumValue("Red")
    RED("Red"),

    /**
     * 
     * 						Green Star, feedback score 5,000-9,999.
     * 					
     * 
     */
    @XmlEnumValue("Green")
    GREEN("Green"),

    /**
     * 
     * 						Yellow Shooting Star, feedback score 10,000-24,999.
     * 					
     * 
     */
    @XmlEnumValue("YellowShooting")
    YELLOW_SHOOTING("YellowShooting"),

    /**
     * 
     * 						Turquoise Shooting Star, feedback score 25,000-49,999.
     * 					
     * 
     */
    @XmlEnumValue("TurquoiseShooting")
    TURQUOISE_SHOOTING("TurquoiseShooting"),

    /**
     * 
     * 						Purple Shooting Star, feedback score 50,000-99,999.
     * 					
     * 
     */
    @XmlEnumValue("PurpleShooting")
    PURPLE_SHOOTING("PurpleShooting"),

    /**
     * 
     * 						Red Shooting Star, feedback score 100,000-499,999.
     * 					
     * 
     */
    @XmlEnumValue("RedShooting")
    RED_SHOOTING("RedShooting"),

    /**
     * 
     * 						Green Shooting Star, feedback score 500,000-999,999.
     * 					
     * 
     */
    @XmlEnumValue("GreenShooting")
    GREEN_SHOOTING("GreenShooting"),

    /**
     * 
     * 						Silver Shooting Star, feedback score 1,000,000 and above.
     * 					
     * 
     */
    @XmlEnumValue("SilverShooting")
    SILVER_SHOOTING("SilverShooting"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FeedbackRatingStarCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedbackRatingStarCodeType fromValue(String v) {
        for (FeedbackRatingStarCodeType c: FeedbackRatingStarCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
