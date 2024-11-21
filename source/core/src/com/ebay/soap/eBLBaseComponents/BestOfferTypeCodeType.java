
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestOfferTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BestOfferTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BuyerBestOffer"/>
 *     &lt;enumeration value="BuyerCounterOffer"/>
 *     &lt;enumeration value="SellerCounterOffer"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BestOfferTypeCodeType")
@XmlEnum
public enum BestOfferTypeCodeType {


    /**
     * 
     * 						This value indicates that the offer is an original Best Offer made by a prospective buyer to the seller.
     * 					
     * 
     */
    @XmlEnumValue("BuyerBestOffer")
    BUYER_BEST_OFFER("BuyerBestOffer"),

    /**
     * 
     * 						This value indicates that the offer is a prospective buyer's counter offer against the seller's counter offer.
     * 					
     * 
     */
    @XmlEnumValue("BuyerCounterOffer")
    BUYER_COUNTER_OFFER("BuyerCounterOffer"),

    /**
     * 
     * 						This value indicates that the offer is a seller's counter offer against the seller's original Best Offer.
     * 					
     * 
     */
    @XmlEnumValue("SellerCounterOffer")
    SELLER_COUNTER_OFFER("SellerCounterOffer"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BestOfferTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BestOfferTypeCodeType fromValue(String v) {
        for (BestOfferTypeCodeType c: BestOfferTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
