
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingSubtypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingSubtypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ClassifiedAd"/>
 *     &lt;enumeration value="LocalMarketBestOfferOnly"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ListingSubtypeCodeType")
@XmlEnum
public enum ListingSubtypeCodeType {


    /**
     * 
     * 					This value indicates that the lead generation listing is a classifed ad. Note that only some eBay categories support classified ad listings. Use the <strong>GetCategoryFeatures</strong> call (with <strong>FeatureID</strong> value set to <code>AdFormatEnabled</code>) to see which categories support classified ad listings.
     * 				
     * 
     */
    @XmlEnumValue("ClassifiedAd")
    CLASSIFIED_AD("ClassifiedAd"),

    /**
     * 
     * 					This value indicates that the lead generation listing is a US Motors Local Market listing. Note that only some eBay Motors categories support Motors Local Market listings. Use the <strong>GetCategoryFeatures</strong> call (with the <strong>SITEID</strong> header set to <code>100</code> and the <strong>FeatureID</strong> value set to <code>LocalMarketAdFormatEnabled</code>) to see which eBay Motors categories support Motors Local Market listings.
     * 				
     * 
     */
    @XmlEnumValue("LocalMarketBestOfferOnly")
    LOCAL_MARKET_BEST_OFFER_ONLY("LocalMarketBestOfferOnly"),

    /**
     * 
     * 					Reserved for internal or future use
     * 				
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingSubtypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingSubtypeCodeType fromValue(String v) {
        for (ListingSubtypeCodeType c: ListingSubtypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
