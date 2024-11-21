
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricingTreatmentCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PricingTreatmentCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="STP"/>
 *     &lt;enumeration value="MAP"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MFO"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PricingTreatmentCodeType")
@XmlEnum
public enum PricingTreatmentCodeType {


    /**
     * 
     * 						This enumeration value indicates that Strikethrough Pricing is enabled for the order line item. If this value is returned, the price in the <b>OriginalRetailPrice</b> field will be crossed out in the View Item page.
     * 					
     * 
     */
    STP("STP"),

    /**
     * 
     * 						This enumeration value indicates that Minimum Advertised Pricing is enabled for the order line item. If this value is returned, the minimum advertised price is found in the <b>MinimumAdvertisedPrice</b> field.
     * 					
     * 
     */
    MAP("MAP"),

    /**
     * 
     * 						This enumeration value indicates that neither Strikethrough Pricing or Minimum Advertised Pricing is enabled for the order line item.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This enumeration value indicates that Made For Outlet Comparison Pricing is enabled for the order line item. If this value is returned, the Made For Outlet Comparison price is found in the <b>MadeForOutletComparisonPrice</b> field.
     * 					
     * 
     */
    MFO("MFO"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PricingTreatmentCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingTreatmentCodeType fromValue(String v) {
        for (PricingTreatmentCodeType c: PricingTreatmentCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
