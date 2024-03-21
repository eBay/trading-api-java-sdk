
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingEnhancementsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingEnhancementsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Border"/>
 *     &lt;enumeration value="BoldTitle"/>
 *     &lt;enumeration value="Featured"/>
 *     &lt;enumeration value="Highlight"/>
 *     &lt;enumeration value="HomePageFeatured"/>
 *     &lt;enumeration value="ProPackBundle"/>
 *     &lt;enumeration value="BasicUpgradePackBundle"/>
 *     &lt;enumeration value="ValuePackBundle"/>
 *     &lt;enumeration value="ProPackPlusBundle"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ListingEnhancementsCodeType")
@XmlEnum
public enum ListingEnhancementsCodeType {


    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Border")
    BORDER("Border"),

    /**
     * 
     * 						This value is used if the seller wants the listing title to
     * 						be in boldface type. This feature will incur a listing fee.
     * 						Note that this enhancement will not put the listing subtitle in boldface type (if a subtitle is used).
     * 					
     * 
     */
    @XmlEnumValue("BoldTitle")
    BOLD_TITLE("BoldTitle"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Featured")
    FEATURED("Featured"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Highlight")
    HIGHLIGHT("Highlight"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("HomePageFeatured")
    HOME_PAGE_FEATURED("HomePageFeatured"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ProPackBundle")
    PRO_PACK_BUNDLE("ProPackBundle"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("BasicUpgradePackBundle")
    BASIC_UPGRADE_PACK_BUNDLE("BasicUpgradePackBundle"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ValuePackBundle")
    VALUE_PACK_BUNDLE("ValuePackBundle"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ProPackPlusBundle")
    PRO_PACK_PLUS_BUNDLE("ProPackPlusBundle"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingEnhancementsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingEnhancementsCodeType fromValue(String v) {
        for (ListingEnhancementsCodeType c: ListingEnhancementsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
