
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingRateTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingRateTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OnDemand"/>
 *     &lt;enumeration value="DailyPickup"/>
 *     &lt;enumeration value="StandardList"/>
 *     &lt;enumeration value="Counter"/>
 *     &lt;enumeration value="Discounted"/>
 *     &lt;enumeration value="CommercialPlus"/>
 *     &lt;enumeration value="GoldSilver"/>
 *     &lt;enumeration value="PlatTitanium"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShippingRateTypeCodeType")
@XmlEnum
public enum ShippingRateTypeCodeType {


    /**
     * 
     * 						"On-demand" shipping rate scale.
     * 					
     * 
     */
    @XmlEnumValue("OnDemand")
    ON_DEMAND("OnDemand"),

    /**
     * 
     * 						"Daily pickup" shipping rate scale.
     * 					
     * 
     */
    @XmlEnumValue("DailyPickup")
    DAILY_PICKUP("DailyPickup"),

    /**
     * 
     * 						"Standard List" shipping rate scale.
     * 					
     * 
     */
    @XmlEnumValue("StandardList")
    STANDARD_LIST("StandardList"),

    /**
     * 
     * 						"Counter" shipping rate scale.
     * 					
     * 
     */
    @XmlEnumValue("Counter")
    COUNTER("Counter"),

    /**
     * 
     * 						"Discounted" shipping rate scale.
     * 					
     * 
     */
    @XmlEnumValue("Discounted")
    DISCOUNTED("Discounted"),

    /**
     * 
     * 						"Commercial Plus" shipping rate scale.
     * 					
     * 
     */
    @XmlEnumValue("CommercialPlus")
    COMMERCIAL_PLUS("CommercialPlus"),

    /**
     * 
     * 						"Commercial Plus Discounted Rate1" shipping rate scale.
     * 					
     * 
     */
    @XmlEnumValue("GoldSilver")
    GOLD_SILVER("GoldSilver"),

    /**
     * 
     * 						"Commercial Plus Discounted Rate2" shipping rate scale.
     * 					
     * 
     */
    @XmlEnumValue("PlatTitanium")
    PLAT_TITANIUM("PlatTitanium"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingRateTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingRateTypeCodeType fromValue(String v) {
        for (ShippingRateTypeCodeType c: ShippingRateTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
