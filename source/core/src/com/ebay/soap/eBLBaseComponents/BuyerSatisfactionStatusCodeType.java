
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerSatisfactionStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerSatisfactionStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Excellent"/>
 *     &lt;enumeration value="Good"/>
 *     &lt;enumeration value="NeedsWork"/>
 *     &lt;enumeration value="Poor"/>
 *     &lt;enumeration value="VeryPoor"/>
 *     &lt;enumeration value="Unacceptable"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BuyerSatisfactionStatusCodeType")
@XmlEnum
public enum BuyerSatisfactionStatusCodeType {


    /**
     * 
     * 						You are doing an excellent job as an eBay seller.
     * 						Be sure to continue providing members with a positive buying experience.
     * 						A buyer satisfaction rating of Excellent ensures that you are eligible
     * 						for eBay incentives.
     * 					
     * 
     */
    @XmlEnumValue("Excellent")
    EXCELLENT("Excellent"),

    /**
     * 
     * 						You are doing a good job as an eBay seller.
     * 						Buyers have been satisfied with your customer service. Be sure to continue
     * 						providing members with a positive buying experience. A buyer satisfaction
     * 						rating of Good ensures that you are eligible for eBay incentives.
     * 					
     * 
     */
    @XmlEnumValue("Good")
    GOOD("Good"),

    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("NeedsWork")
    NEEDS_WORK("NeedsWork"),

    /**
     * 
     * 						You are not doing a good job as an eBay seller.
     * 						Some of your buyers have not been satisfied with your service.
     * 						Improve your customer service to earn a higher buyer satisfaction rating.
     * 						If your customer service continues to receive poor responses from customers,
     * 						your buyer satisfaction rating can drop and could put your eBay seller's
     * 						account at risk.
     * 					
     * 
     */
    @XmlEnumValue("Poor")
    POOR("Poor"),

    /**
     * 
     * 						You are doing a very poor job as an eBay seller.
     * 						You need to improve your selling practices immediately. Too many of your
     * 						customers have not been satisfied with your customer service and you are
     * 						at risk of losing your eBay account.
     * 					
     * 
     */
    @XmlEnumValue("VeryPoor")
    VERY_POOR("VeryPoor"),

    /**
     * 
     * 						You are doing an unacceptable job as an eBay seller.
     * 						Improve your selling practices immediately. Your account may be suspended
     * 						because of your unacceptable customer service.
     * 					
     * 
     */
    @XmlEnumValue("Unacceptable")
    UNACCEPTABLE("Unacceptable"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BuyerSatisfactionStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuyerSatisfactionStatusCodeType fromValue(String v) {
        for (BuyerSatisfactionStatusCodeType c: BuyerSatisfactionStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
