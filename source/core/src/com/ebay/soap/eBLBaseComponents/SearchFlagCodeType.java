
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchFlagCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchFlagCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Charity"/>
 *     &lt;enumeration value="Gift"/>
 *     &lt;enumeration value="NowAndNew"/>
 *     &lt;enumeration value="LocalSearch"/>
 *     &lt;enumeration value="FreeShipping"/>
 *     &lt;enumeration value="Gallery"/>
 *     &lt;enumeration value="Picture"/>
 *     &lt;enumeration value="GetItFast"/>
 *     &lt;enumeration value="Lot"/>
 *     &lt;enumeration value="GermanMotorsSearchable"/>
 *     &lt;enumeration value="WorldOfGood"/>
 *     &lt;enumeration value="DigitalDelivery"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SearchFlagCodeType")
@XmlEnum
public enum SearchFlagCodeType {


    /**
     * 
     * 						This value being returned in the <b>FavoriteSearch.SearchFlag</b>
     * 						field indicates that the buyer selected the <b>eBay for Charity</b>
     * 						option in the Saved Search.
     * 					
     * 
     */
    @XmlEnumValue("Charity")
    CHARITY("Charity"),

    /**
     * 
     * 						This value is no longer applicable as Gift Icon and Gift Services are deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Gift")
    GIFT("Gift"),

    /**
     * 
     * 					  This value is no longer applicable as the Now and New feature is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("NowAndNew")
    NOW_AND_NEW("NowAndNew"),

    /**
     * 
     * 						This value being returned in the <b>FavoriteSearch.SearchFlag</b>
     * 						field indicates that the buyer selected the <b>Local pickup</b>
     * 						option in the Saved Search. A buyer would select the <b>Local Pickup</b>
     * 						filter in a Saved Search to restrict retrieved listings to those that offer 'local pickup'
     * 						as an option to buyers.
     * 					
     * 
     */
    @XmlEnumValue("LocalSearch")
    LOCAL_SEARCH("LocalSearch"),

    /**
     * 
     * 						This value being returned in the <b>FavoriteSearch.SearchFlag</b>
     * 						field indicates that the buyer selected the <b>Free shipping</b>
     * 						option in the Saved Search. A buyer would select the <b>Free shipping</b>
     * 						filter in a Saved Search to restrict retrieved listings to those that offer a free
     * 						shipping option to that specific buyer (the availability of free shipping may
     * 						be dependent on the buyer's location).
     * 					
     * 
     */
    @XmlEnumValue("FreeShipping")
    FREE_SHIPPING("FreeShipping"),

    /**
     * 
     * 						This value is no longer applicable as there is always a gallery picture by
     * 						default since all listings must have at least one picture.
     * 					
     * 
     */
    @XmlEnumValue("Gallery")
    GALLERY("Gallery"),

    /**
     * 
     * 						This value is no longer applicable as there is now a requirement that all
     * 						listings have at least one picture.
     * 					
     * 
     */
    @XmlEnumValue("Picture")
    PICTURE("Picture"),

    /**
     * 
     * 						This value is no longer applicable as the Get It Fast feature is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("GetItFast")
    GET_IT_FAST("GetItFast"),

    /**
     * 
     * 						This value being returned in the <b>FavoriteSearch.SearchFlag</b>
     * 						field indicates that the buyer selected the <b>Items listed as lots</b>
     * 						option in the Saved Search. A buyer would select the <b>Items listed as lots</b>
     * 						filter in a Saved Search to restrict retrieved listings to those that are offering
     * 						a "lot" of items in one listing. Specifically, a "lot" is defined as, "a group of
     * 						similar or identical items that are sold together to one buyer."
     * 					
     * 
     */
    @XmlEnumValue("Lot")
    LOT("Lot"),

    /**
     * 
     * 						This value is only applicable to the German site and if the user is searching for
     * 						motor vehicle listings. This value being returned in the
     * 						<b>FavoriteSearch.SearchFlag</b> field indicates that the buyer
     * 						selected a filter in a Saved Search to restrict retrieved eBay Germany motor
     * 						vehicle listings that are also being displayed on the mobile.de vehicle
     * 						marketplace.
     * 					
     * 
     */
    @XmlEnumValue("GermanMotorsSearchable")
    GERMAN_MOTORS_SEARCHABLE("GermanMotorsSearchable"),

    /**
     * 
     * 						This value is no longer applicable as the World of Good site no longer exists.
     * 					
     * 
     */
    @XmlEnumValue("WorldOfGood")
    WORLD_OF_GOOD("WorldOfGood"),

    /**
     * 
     * 					This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("DigitalDelivery")
    DIGITAL_DELIVERY("DigitalDelivery"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SearchFlagCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchFlagCodeType fromValue(String v) {
        for (SearchFlagCodeType c: SearchFlagCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
