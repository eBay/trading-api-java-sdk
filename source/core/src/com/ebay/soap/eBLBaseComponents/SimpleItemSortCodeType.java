
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleItemSortCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SimpleItemSortCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BestMatch"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="EndTime"/>
 *     &lt;enumeration value="BidCount"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="CurrentBid"/>
 *     &lt;enumeration value="Distance"/>
 *     &lt;enumeration value="StartDate"/>
 *     &lt;enumeration value="BestMatchCategoryGroup"/>
 *     &lt;enumeration value="PricePlusShipping"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SimpleItemSortCodeType")
@XmlEnum
public enum SimpleItemSortCodeType {


    /**
     * 
     * 						Sorts items by Best Match, and no sort order applies. If specified, 
     * 						then Best Match sort also applies to CategoryHistogram.
     * 					
     * 
     */
    @XmlEnumValue("BestMatch")
    BEST_MATCH("BestMatch"),

    /**
     * 
     * 						This value is reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						Sorts by the end time of the listing, in ascending or descending order according to the 
     * 						<b>SortOrder</b> value.
     * 					
     * 
     */
    @XmlEnumValue("EndTime")
    END_TIME("EndTime"),

    /**
     * 
     * 						Sorts by number of bids on the item, in ascending or descending order according to the 
     * 						<b>SortOrder</b> value.
     * 					
     * 
     */
    @XmlEnumValue("BidCount")
    BID_COUNT("BidCount"),

    /**
     * 
     * 						Sorts by country; no sort order can be specified.
     * 					
     * 
     */
    @XmlEnumValue("Country")
    COUNTRY("Country"),

    /**
     * 
     * 						Sorts by current bid; descending order only.
     * 					
     * 
     */
    @XmlEnumValue("CurrentBid")
    CURRENT_BID("CurrentBid"),

    /**
     * 
     * 						Sorts by distance; ascending order only.
     * 					
     * 
     */
    @XmlEnumValue("Distance")
    DISTANCE("Distance"),

    /**
     * 
     * 						Sorts by the start time of the listing; recently-listed first.
     * 					
     * 
     */
    @XmlEnumValue("StartDate")
    START_DATE("StartDate"),

    /**
     * 
     * 						Sorts by BestMatchCategoryGroup, so results are grouped by Best Match within a category.
     * 					
     * 
     */
    @XmlEnumValue("BestMatchCategoryGroup")
    BEST_MATCH_CATEGORY_GROUP("BestMatchCategoryGroup"),

    /**
     * 
     * 						Sorts by total cost, which is item cost plus shipping cost. If
     * 						<b>SortOrder</b> is included and set to 'Ascending', items are sorted 
     * 						in the following order: Lowest total cost (for items where shipping was
     * 						properly specified); then freight-shipping items (lowest to highest); and finally, 
     * 						items for which shipping was not specified (lowest to highest).
     * 					
     * 
     */
    @XmlEnumValue("PricePlusShipping")
    PRICE_PLUS_SHIPPING("PricePlusShipping");
    private final String value;

    SimpleItemSortCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimpleItemSortCodeType fromValue(String v) {
        for (SimpleItemSortCodeType c: SimpleItemSortCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
