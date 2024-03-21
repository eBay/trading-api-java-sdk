
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionItemPriceTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionItemPriceTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AuctionPrice"/>
 *     &lt;enumeration value="BuyItNowPrice"/>
 *     &lt;enumeration value="BestOfferOnlyPrice"/>
 *     &lt;enumeration value="ClassifiedAdPrice"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PromotionItemPriceTypeCodeType")
@XmlEnum
public enum PromotionItemPriceTypeCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("AuctionPrice")
    AUCTION_PRICE("AuctionPrice"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("BuyItNowPrice")
    BUY_IT_NOW_PRICE("BuyItNowPrice"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferOnlyPrice")
    BEST_OFFER_ONLY_PRICE("BestOfferOnlyPrice"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdPrice")
    CLASSIFIED_AD_PRICE("ClassifiedAdPrice"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PromotionItemPriceTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionItemPriceTypeCodeType fromValue(String v) {
        for (PromotionItemPriceTypeCodeType c: PromotionItemPriceTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
