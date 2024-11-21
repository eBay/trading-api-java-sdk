
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnsWithinOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnsWithinOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Days_3"/>
 *     &lt;enumeration value="Days_7"/>
 *     &lt;enumeration value="Days_10"/>
 *     &lt;enumeration value="Days_14"/>
 *     &lt;enumeration value="Days_30"/>
 *     &lt;enumeration value="Days_60"/>
 *     &lt;enumeration value="Months_1"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ReturnsWithinOptionsCodeType")
@XmlEnum
public enum ReturnsWithinOptionsCodeType {


    /**
     * 
     * 						This value is deprecated. Listings created or revised with this value will be
     * 						blocked.
     * 					
     * 
     */
    @XmlEnumValue("Days_3")
    DAYS_3("Days_3"),

    /**
     * 
     * 						This value is deprecated. Listings created or revised with this value will be
     * 						blocked.
     * 					
     * 
     */
    @XmlEnumValue("Days_7")
    DAYS_7("Days_7"),

    /**
     * 
     * 						This value is deprecated. Listings created or revised with this value will be
     * 						blocked.
     * 					
     * 
     */
    @XmlEnumValue("Days_10")
    DAYS_10("Days_10"),

    /**
     * 
     * 						The seller specifies this value to enable a 14-day return policy. A buyer must
     * 						return an item within 14 days after purchase in order to receive a refund or
     * 						an exchange/replacement item.
     * 					
     * 
     */
    @XmlEnumValue("Days_14")
    DAYS_14("Days_14"),

    /**
     * 
     * 						The seller specifies this value to enable a 30-day return policy. A buyer must
     * 						return an item within 30 days after purchase in order to receive a refund or
     * 						an exchange/replacement item.
     * 						<br/><br/>
     * 						<span class="tablenote"><b>Note: </b> To qualify as a Top-Rated Plus listing, a 30-day (or longer) return period must be set.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Days_30")
    DAYS_30("Days_30"),

    /**
     * 
     * 						The seller specifies this value to enable a 60-day return policy. A buyer must
     * 						return an item within 60 days after purchase in order to receive a refund or
     * 						an exchange/replacement item.
     * 					
     * 
     */
    @XmlEnumValue("Days_60")
    DAYS_60("Days_60"),

    /**
     * 
     * 					 The seller specifies this value to enable a one-month return policy. A buyer must return an item within one month after purchase in order to receive a refund or an exchange.
     * 					 <br/>
     * 					<span class="tablenote"><b>Note: </b> This value, historically only supported on the DE and AT sites, is scheduled to be deprecated, and DE and AT sellers may be blocked if they do use this value. Use <code>Days_30</code> instead.
     * 					</span>
     * 					
     * 
     */
    @XmlEnumValue("Months_1")
    MONTHS_1("Months_1"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ReturnsWithinOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnsWithinOptionsCodeType fromValue(String v) {
        for (ReturnsWithinOptionsCodeType c: ReturnsWithinOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
