
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReasonHideFromSearchCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReasonHideFromSearchCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DuplicateListing"/>
 *     &lt;enumeration value="OutOfStock"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ReasonHideFromSearchCodeType")
@XmlEnum
public enum ReasonHideFromSearchCodeType {


    /**
     * 
     * 						This value indicates that the listing is being hidden from search on the eBay site because the listing has been determined by eBay to be a duplicate listing.
     * 						<br/><br/>
     * 						This enumeration value is associated with eBay Duplicate Listings Policy, which is applicable on the US, CA, CA-FR, and eBay Motors (Parts and Accessories only) sites. Event Tickets, Real Estate, and Motor Vehicle categories are excluded from this policy. For more information, read <a href="http://pages.ebay.com/help/policies/listing-multi.html">eBay's Duplicate Listings Policy</a> help page.
     * 					
     * 
     */
    @XmlEnumValue("DuplicateListing")
    DUPLICATE_LISTING("DuplicateListing"),

    /**
     * 
     * 						This value indicates that the listing is currently hidden from search because the quantity in the listing is zero. However, the listing is still alive and will reappear in the search results when the quantity is set to something greater than zero. The 'Out-of-stock' option is set by the seller at the account level. This option can be enabled in My eBay Site Preferences, or the seller can use the <a href="https://developer.ebay.com/DevZone/XML/docs/Reference/ebay/SetUserPreferences.html#Request.OutOfStockControlPreference">OutOfStockControlPreference</a> field in the <b>SetUserPreferences</b> call.
     * 					
     * 
     */
    @XmlEnumValue("OutOfStock")
    OUT_OF_STOCK("OutOfStock");
    private final String value;

    ReasonHideFromSearchCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReasonHideFromSearchCodeType fromValue(String v) {
        for (ReasonHideFromSearchCodeType c: ReasonHideFromSearchCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
