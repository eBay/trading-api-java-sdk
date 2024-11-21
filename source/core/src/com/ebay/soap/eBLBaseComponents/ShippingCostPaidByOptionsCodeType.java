
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingCostPaidByOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingCostPaidByOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Buyer"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="EUSeller_ReturnRights"/>
 *     &lt;enumeration value="EUSeller_CancelRights"/>
 *     &lt;enumeration value="EUBuyer_CancelRightsUnder40"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShippingCostPaidByOptionsCodeType")
@XmlEnum
public enum ShippingCostPaidByOptionsCodeType {


    /**
     * 
     * 						This value indicates that the buyer is responsible for paying the return shipping cost. Note that the buyer will not be responsible for return shipping cost if the the buyer's reason for the return is related to the received item not being as described in the listing, or if the item has arrived damaged or with missing parts.
     * 					
     * 
     */
    @XmlEnumValue("Buyer")
    BUYER("Buyer"),

    /**
     * 
     * 						This value indicates that the seller is responsible for paying the return shipping cost.
     * 					
     * 
     */
    @XmlEnumValue("Seller")
    SELLER("Seller"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("EUSeller_ReturnRights")
    EU_SELLER_RETURN_RIGHTS("EUSeller_ReturnRights"),

    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("EUSeller_CancelRights")
    EU_SELLER_CANCEL_RIGHTS("EUSeller_CancelRights"),

    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("EUBuyer_CancelRightsUnder40")
    EU_BUYER_CANCEL_RIGHTS_UNDER_40("EUBuyer_CancelRightsUnder40");
    private final String value;

    ShippingCostPaidByOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingCostPaidByOptionsCodeType fromValue(String v) {
        for (ShippingCostPaidByOptionsCodeType c: ShippingCostPaidByOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
