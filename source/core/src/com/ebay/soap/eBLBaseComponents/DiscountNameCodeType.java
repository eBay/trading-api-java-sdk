
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountNameCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscountNameCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EachAdditionalAmount"/>
 *     &lt;enumeration value="EachAdditionalAmountOff"/>
 *     &lt;enumeration value="EachAdditionalPercentOff"/>
 *     &lt;enumeration value="IndividualItemWeight"/>
 *     &lt;enumeration value="CombinedItemWeight"/>
 *     &lt;enumeration value="WeightOff"/>
 *     &lt;enumeration value="ShippingCostXForAmountY"/>
 *     &lt;enumeration value="ShippingCostXForItemCountN"/>
 *     &lt;enumeration value="MaximumShippingCostPerOrder"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DiscountNameCodeType")
@XmlEnum
public enum DiscountNameCodeType {


    /**
     * 
     * 						The cost to ship each item beyond the first item (where the item with the
     * 						highest shipping cost is selected by eBay as the first item).
     * 						Let's say the buyer purchases three items, each set to ship for $8, and
     * 						the seller set EachAdditionalAmount to $6.  The cost to ship three items would
     * 						normally be $24, but since the seller specified $6, the total shipping
     * 						cost would be $8 + $6 + $6, or $20.
     * 						For flat shipping discount profile only.
     * 					
     * 
     */
    @XmlEnumValue("EachAdditionalAmount")
    EACH_ADDITIONAL_AMOUNT("EachAdditionalAmount"),

    /**
     * 
     * 						The amount by which to reduce the cost to ship each item beyond the
     * 						first item (where the item with the highest shipping cost is selected by eBay
     * 						as the first item).
     * 						Let's say the buyer purchases three items, each set to ship for $8, and
     * 						the seller set EachAdditionalAmountOff to $2.  The cost to ship three items would
     * 						normally be $24, but since the seller specified $2, the total shipping
     * 						cost would be $24 - (two additional items x $2), or $20.
     * 						For flat shipping discount profile only.
     * 					
     * 
     */
    @XmlEnumValue("EachAdditionalAmountOff")
    EACH_ADDITIONAL_AMOUNT_OFF("EachAdditionalAmountOff"),

    /**
     * 
     * 						The percentage by which to reduce the cost to ship each item beyond
     * 						the first item (where the item with the highest shipping cost is selected by
     * 						eBay as the first item).
     * 						Let's say the buyer purchases three items, each set to ship for $8, and
     * 						the seller set EachAdditionalPercentOff to 0.25.  The cost to ship three items would
     * 						normally be $24, but since the seller specified 0.25 ($2 out of 8), the total shipping
     * 						cost would be $24 - (two additional items x $2), or $20.
     * 						For flat rate shipping discount profile only.
     * 					
     * 
     */
    @XmlEnumValue("EachAdditionalPercentOff")
    EACH_ADDITIONAL_PERCENT_OFF("EachAdditionalPercentOff"),

    /**
     * 
     * 						Shipping cost is the total of what it would cost to ship each item individually.
     * 						This is simply a way to define how shipping is to be calculated--there is no
     * 						discount for the buyer with this selection.
     * 						For calculated shipping discount profile only.
     * 					
     * 
     */
    @XmlEnumValue("IndividualItemWeight")
    INDIVIDUAL_ITEM_WEIGHT("IndividualItemWeight"),

    /**
     * 
     * 						Shipping cost is based on the total weight of all individual items.
     * 						This is simply a way to define how shipping is to be calculated--there is no
     * 						discount for the buyer with this selection.
     * 						For calculated shipping discount profile only.
     * 					
     * 
     */
    @XmlEnumValue("CombinedItemWeight")
    COMBINED_ITEM_WEIGHT("CombinedItemWeight"),

    /**
     * 
     * 						The amount of weight to subtract for each item beyond the first item
     * 						before shipping costs are calculated. For example, there may be less packing
     * 						material when the items are combined in one box than if they were shipped
     * 						individually. Let's say the buyer purchases three items, each 10 oz. in weight, and
     * 						the seller set WeightOff to 2 oz.  The combined weight would be 30 oz., but since
     * 						the seller specified 2 oz. off, the total weight for shipping cost calculation
     * 						would be 30 oz. - (two additional items x 2 oz.), or 26 oz.
     * 						For calculated shipping discount profile only.
     * 					
     * 
     */
    @XmlEnumValue("WeightOff")
    WEIGHT_OFF("WeightOff"),

    /**
     * 
     * 						Shipping cost X applies if the total cost of items purchased is Y.
     * 						For promotional discount only.
     * 					
     * 
     */
    @XmlEnumValue("ShippingCostXForAmountY")
    SHIPPING_COST_X_FOR_AMOUNT_Y("ShippingCostXForAmountY"),

    /**
     * 
     * 						Shipping cost X applies if the total number of items purchased is N.
     * 						For promotional discount only.
     * 					
     * 
     */
    @XmlEnumValue("ShippingCostXForItemCountN")
    SHIPPING_COST_X_FOR_ITEM_COUNT_N("ShippingCostXForItemCountN"),

    /**
     * 
     * 						The shipping cost will not exceed this.
     * 						For promotional discount only.
     * 					
     * 
     */
    @XmlEnumValue("MaximumShippingCostPerOrder")
    MAXIMUM_SHIPPING_COST_PER_ORDER("MaximumShippingCostPerOrder"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DiscountNameCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountNameCodeType fromValue(String v) {
        for (DiscountNameCodeType c: DiscountNameCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
