
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdFormatEnabledCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdFormatEnabledCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Only"/>
 *     &lt;enumeration value="ClassifiedAdEnabled"/>
 *     &lt;enumeration value="ClassifiedAdOnly"/>
 *     &lt;enumeration value="LocalMarketBestOfferOnly"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AdFormatEnabledCodeType")
@XmlEnum
public enum AdFormatEnabledCodeType {


    /**
     * 
     * 						This value indicates that the Classified Ad format feature is disabled for the site or category.
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						This value indicates that the Classified Ad format feature is enabled for the site or category.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						This value indicates that the Classified Ad format is the only listing type supported by the eBay category. This value is not applicable at the eBay site level.
     * 					
     * 
     */
    @XmlEnumValue("Only")
    ONLY("Only"),

    /**
     * 
     * 						This value indicates that the lead-generation Classified Ad format feature is enabled for the site or category.
     * 				  
     * 
     */
    @XmlEnumValue("ClassifiedAdEnabled")
    CLASSIFIED_AD_ENABLED("ClassifiedAdEnabled"),

    /**
     * 
     * 						This value indicates that the lead-generation Classified Ad format is the only listing type supported by the eBay category. This value is not applicable at the eBay site level.
     * 				  
     * 
     */
    @XmlEnumValue("ClassifiedAdOnly")
    CLASSIFIED_AD_ONLY("ClassifiedAdOnly"),

    /**
     * 
     * 						This value indicates that eBay Motors Local Market listings are enabled for the site or category.
     * 				  
     * 
     */
    @XmlEnumValue("LocalMarketBestOfferOnly")
    LOCAL_MARKET_BEST_OFFER_ONLY("LocalMarketBestOfferOnly"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 				  
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AdFormatEnabledCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdFormatEnabledCodeType fromValue(String v) {
        for (AdFormatEnabledCodeType c: AdFormatEnabledCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
