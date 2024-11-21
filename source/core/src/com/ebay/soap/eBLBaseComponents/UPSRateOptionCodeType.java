
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UPSRateOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UPSRateOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UPSDailyRates"/>
 *     &lt;enumeration value="UPSOnDemandRates"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "UPSRateOptionCodeType")
@XmlEnum
public enum UPSRateOptionCodeType {


    /**
     * 
     * 						This enumeration value indicates that the seller is currently receiving the UPS Daily Rate for shipping items.
     * 					
     * 
     */
    @XmlEnumValue("UPSDailyRates")
    UPS_DAILY_RATES("UPSDailyRates"),

    /**
     * 
     * 						This enumeration value indicates that the seller is currently receiving the UPS On-Demand Rate for shipping items.
     * 					
     * 
     */
    @XmlEnumValue("UPSOnDemandRates")
    UPS_ON_DEMAND_RATES("UPSOnDemandRates"),

    /**
     * 
     * 						 Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    UPSRateOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UPSRateOptionCodeType fromValue(String v) {
        for (UPSRateOptionCodeType c: UPSRateOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
