
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckoutStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckoutStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CheckoutComplete"/>
 *     &lt;enumeration value="CheckoutIncomplete"/>
 *     &lt;enumeration value="BuyerRequestsTotal"/>
 *     &lt;enumeration value="SellerResponded"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CheckoutStatusCodeType")
@XmlEnum
public enum CheckoutStatusCodeType {


    /**
     * 
     * 						This value indicates that the buyer has paid and checkout is complete.
     * 					
     * 
     */
    @XmlEnumValue("CheckoutComplete")
    CHECKOUT_COMPLETE("CheckoutComplete"),

    /**
     * 
     * 						This value indicates that checkout is incomplete, generally because the buyer has not paid yet.
     * 					
     * 
     */
    @XmlEnumValue("CheckoutIncomplete")
    CHECKOUT_INCOMPLETE("CheckoutIncomplete"),

    /**
     * 
     * 						This value indicates that the buyer wants to confirm the total price of the order line item before making a payment.
     * 					
     * 
     */
    @XmlEnumValue("BuyerRequestsTotal")
    BUYER_REQUESTS_TOTAL("BuyerRequestsTotal"),

    /**
     * 
     * 						This value indicates that the seller has just responded to the buyer concerning the total price of the order line item.
     * 					
     * 
     */
    @XmlEnumValue("SellerResponded")
    SELLER_RESPONDED("SellerResponded"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CheckoutStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckoutStatusCodeType fromValue(String v) {
        for (CheckoutStatusCodeType c: CheckoutStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
