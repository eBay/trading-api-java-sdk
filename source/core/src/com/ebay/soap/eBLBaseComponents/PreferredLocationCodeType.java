
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferredLocationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreferredLocationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ListedInCurrencyImplied"/>
 *     &lt;enumeration value="LocatedInCountryImplied"/>
 *     &lt;enumeration value="AvailableInCountryImplied"/>
 *     &lt;enumeration value="SiteImplied"/>
 *     &lt;enumeration value="BelgiumListing"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PreferredLocationCodeType")
@XmlEnum
public enum PreferredLocationCodeType {


    /**
     * 
     * 						(in) Items listed in the currency implied by the site specified in the
     * 						request.
     * 					
     * 
     */
    @XmlEnumValue("ListedInCurrencyImplied")
    LISTED_IN_CURRENCY_IMPLIED("ListedInCurrencyImplied"),

    /**
     * 
     * 						(in) Items located in the country implied by the site specified in the
     * 						request.
     * 					
     * 
     */
    @XmlEnumValue("LocatedInCountryImplied")
    LOCATED_IN_COUNTRY_IMPLIED("LocatedInCountryImplied"),

    /**
     * 
     * 						(in) Items available to the country implied by the site specified in the
     * 						request. For the US site, this implies listings from ALL English-language
     * 						countries that are available to the US.
     * 					
     * 
     */
    @XmlEnumValue("AvailableInCountryImplied")
    AVAILABLE_IN_COUNTRY_IMPLIED("AvailableInCountryImplied"),

    /**
     * 
     * 						(in) Items listed on the site specified in the request, regardless of listing
     * 						currency.
     * 					
     * 
     */
    @XmlEnumValue("SiteImplied")
    SITE_IMPLIED("SiteImplied"),

    /**
     * 
     * 						(in) Items located in Belgium or listed on one of the two Belgian sites.
     * 					
     * 
     */
    @XmlEnumValue("BelgiumListing")
    BELGIUM_LISTING("BelgiumListing"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PreferredLocationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreferredLocationCodeType fromValue(String v) {
        for (PreferredLocationCodeType c: PreferredLocationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
