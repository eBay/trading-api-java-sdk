
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchasePurposeTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchasePurposeTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="BuyNowItem"/>
 *     &lt;enumeration value="ShoppingCart"/>
 *     &lt;enumeration value="AuctionItem"/>
 *     &lt;enumeration value="GiftCertificates"/>
 *     &lt;enumeration value="Subscription"/>
 *     &lt;enumeration value="Donation"/>
 *     &lt;enumeration value="eBayBilling"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PurchasePurposeTypeCodeType")
@XmlEnum
public enum PurchasePurposeTypeCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("BuyNowItem")
    BUY_NOW_ITEM("BuyNowItem"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ShoppingCart")
    SHOPPING_CART("ShoppingCart"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("AuctionItem")
    AUCTION_ITEM("AuctionItem"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("GiftCertificates")
    GIFT_CERTIFICATES("GiftCertificates"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Subscription")
    SUBSCRIPTION("Subscription"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Donation")
    DONATION("Donation"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("eBayBilling")
    E_BAY_BILLING("eBayBilling"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PurchasePurposeTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchasePurposeTypeCodeType fromValue(String v) {
        for (PurchasePurposeTypeCodeType c: PurchasePurposeTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
