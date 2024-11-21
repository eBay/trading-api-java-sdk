
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostGroupFlatCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostGroupFlatCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Group1MaxFlatShippingCost"/>
 *     &lt;enumeration value="Group2MaxFlatShippingCost"/>
 *     &lt;enumeration value="Group3MaxFlatShippingCost"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CostGroupFlatCodeType")
@XmlEnum
public enum CostGroupFlatCodeType {


    /**
     * 
     * 						This enumeration value indicates that the shipping service option belongs to flat-rate shipping cost group 1.
     * 					
     * 
     */
    @XmlEnumValue("Group1MaxFlatShippingCost")
    GROUP_1_MAX_FLAT_SHIPPING_COST("Group1MaxFlatShippingCost"),

    /**
     * 
     * 						This enumeration value indicates that the shipping service option belongs to flat-rate shipping cost group 2.
     * 					
     * 
     */
    @XmlEnumValue("Group2MaxFlatShippingCost")
    GROUP_2_MAX_FLAT_SHIPPING_COST("Group2MaxFlatShippingCost"),

    /**
     * 
     * 						This enumeration value indicates that the shipping service option belongs to flat-rate shipping cost group 3.
     * 					
     * 
     */
    @XmlEnumValue("Group3MaxFlatShippingCost")
    GROUP_3_MAX_FLAT_SHIPPING_COST("Group3MaxFlatShippingCost"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CostGroupFlatCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CostGroupFlatCodeType fromValue(String v) {
        for (CostGroupFlatCodeType c: CostGroupFlatCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
