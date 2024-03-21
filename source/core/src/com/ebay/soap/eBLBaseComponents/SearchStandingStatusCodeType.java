
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchStandingStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchStandingStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Raised"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Lowered"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SearchStandingStatusCodeType")
@XmlEnum
public enum SearchStandingStatusCodeType {


    /**
     * 
     * 						Your listings may receive higher placement in search results
     * 						that are sorted by Best Match.
     * 						You earn this standing when you provide excellent customer service to eBay buyers
     * 						(such as good BuyerSatisfaction.Status and high detailed seller ratings).
     * 						If you already have a raised search standing, you can still boost your
     * 						ratings and increase the visibility of your items by maintaining or
     * 						improving your customer service.
     * 					
     * 
     */
    @XmlEnumValue("Raised")
    RAISED("Raised"),

    /**
     * 
     * 						Listings recieve standard placement in search results that are sorted by Best Match.
     * 					
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * 
     * 						Your listings may receive lower placement in search results that
     * 						are sorted by Best Match.
     * 						You earn this standing when you have not been successful in providing
     * 						eBay buyers with the customer service they expect.
     * 						You can still take positive steps to improve your customer service
     * 						and increase your ratings.
     * 					
     * 
     */
    @XmlEnumValue("Lowered")
    LOWERED("Lowered"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SearchStandingStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchStandingStatusCodeType fromValue(String v) {
        for (SearchStandingStatusCodeType c: SearchStandingStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
