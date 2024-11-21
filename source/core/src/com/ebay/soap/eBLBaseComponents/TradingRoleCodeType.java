
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingRoleCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradingRoleCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Buyer"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TradingRoleCodeType")
@XmlEnum
public enum TradingRoleCodeType {


    /**
     * 
     * 						The eBay user is acting as the buyer for the order(s). In <b>GetOrders</b>, 
     * 						this value should be passed into the <b>OrderRole</b> field in the 
     * 						request to retrieve orders in which the calling eBay user is the buyer in the order.
     * 					
     * 
     */
    @XmlEnumValue("Buyer")
    BUYER("Buyer"),

    /**
     * 
     * 						The eBay user is acting as the seller for the order(s). In <b>GetOrders</b>, 
     * 						this value should be passed into the <b>OrderRole</b> field in the 
     * 						request to retrieve orders in which the calling eBay user is the seller in the order.
     * 					
     * 
     */
    @XmlEnumValue("Seller")
    SELLER("Seller"),

    /**
     * 
     * 						This value is reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TradingRoleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TradingRoleCodeType fromValue(String v) {
        for (TradingRoleCodeType c: TradingRoleCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
