
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AuctionItemsOnly"/>
 *     &lt;enumeration value="FixedPricedItem"/>
 *     &lt;enumeration value="AllItems"/>
 *     &lt;enumeration value="StoreInventoryOnly"/>
 *     &lt;enumeration value="FixedPriceExcludeStoreInventory"/>
 *     &lt;enumeration value="ExcludeStoreInventory"/>
 *     &lt;enumeration value="AllItemTypes"/>
 *     &lt;enumeration value="AllFixedPriceItemTypes"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ClassifiedItemsOnly"/>
 *     &lt;enumeration value="AdFormat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemTypeCodeType")
@XmlEnum
public enum ItemTypeCodeType {


    /**
     * 
     * 						When setting up filtering for the Saved Search, the buyer was only looking for 
     * 						auction items (with or without the Buy It Now option), so only selected the <b>Auction</b> checkbox in the 
     * 						<b>Format</b> dialog box. When this filter is used in a Saved Search,
     * 						fixed-price items and classified ad listings are not retrieved for the buyer.
     * 					
     * 
     */
    @XmlEnumValue("AuctionItemsOnly")
    AUCTION_ITEMS_ONLY("AuctionItemsOnly"),

    /**
     * 
     * 						When setting up filtering for the Saved Search, the buyer was looking for all
     * 						fixed-price items and auction items with Buy It Now available, so only selected the
     * 						<b>Buy It Now</b> checkbox in the <b>Format</b> dialog box.
     * 						When this filter is used in a Saved Search, auction items (without the Buy It Now 
     * 						option) and classified ad listings are not retrieved for the buyer. 
     * 					
     * 
     */
    @XmlEnumValue("FixedPricedItem")
    FIXED_PRICED_ITEM("FixedPricedItem"),

    /**
     * 
     * 						When setting up filtering for the Saved Search, the buyer was looking for all
     * 						items closely associated with the search term, so selected all buying formats 
     * 						(Auction, Buy It Now, and Classified Ads). All items are retrieved for the buyer, 
     * 						including auction items (with or without the Buy It Now option), fixed-price 
     * 						items, and classified ad listings.
     * 					
     * 
     */
    @XmlEnumValue("AllItems")
    ALL_ITEMS("AllItems"),

    /**
     * 
     * 						When setting up filtering for the Saved Search, the buyer was only looking for 
     * 						items sold by sellers with eBay stores, so selected the 
     * 						<b>Sellers with eBay stores</b> checkbox in the 
     * 						<b>Seller</b> dialog box. When this filter is used in a Saved Search,
     * 						only items for sale in an eBay store are retrieved for the buyer.
     * 					
     * 
     */
    @XmlEnumValue("StoreInventoryOnly")
    STORE_INVENTORY_ONLY("StoreInventoryOnly"),

    /**
     * 
     * 						
     * 						Excludes listings that have listing type set to StoresFixedPrice.
     * 						Excludes listings that have listing type set to AdType.
     * 						Excludes auction listings in which BuyItNowEnabled is false.
     * 					
     * 
     */
    @XmlEnumValue("FixedPriceExcludeStoreInventory")
    FIXED_PRICE_EXCLUDE_STORE_INVENTORY("FixedPriceExcludeStoreInventory"),

    /**
     * 
     * 						
     * 						Excludes listings that have listing type set to StoresFixedPrice.
     * 					
     * 
     */
    @XmlEnumValue("ExcludeStoreInventory")
    EXCLUDE_STORE_INVENTORY("ExcludeStoreInventory"),

    /**
     * 
     * 						
     * 						Retrieves listings whether or not listing type is set to StoresFixedPrice;
     * 						include auction items. 
     * 					
     * 
     */
    @XmlEnumValue("AllItemTypes")
    ALL_ITEM_TYPES("AllItemTypes"),

    /**
     * 
     * 						
     * 						Retrieves fixed-price items.
     * 						Whether StoresFixedPrice items are retrieved does not depend on the site default.
     * 						The StoresFixedPrice items are retrieved after the basic fixed price items.
     * 						Items are retrieved whether or not listing type is set to StoresFixedPrice.
     * 						Does not retrieve items for which listing type is AdType.
     * 						Does not retrieve auction items for which BuyItNowEnabled is false.
     * 					
     * 
     */
    @XmlEnumValue("AllFixedPriceItemTypes")
    ALL_FIXED_PRICE_ITEM_TYPES("AllFixedPriceItemTypes"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						When setting up filtering for the Saved Search, the buyer was only looking for 
     * 						classified ad listings, so only selected the <b>Classified ads</b> checkbox in the 
     * 						<b>Format</b> dialog box. When this filter is used in a Saved Search,
     * 						auction (with or without the Buy It Now option) and fixed-price items 
     * 						are not retrieved for the buyer.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedItemsOnly")
    CLASSIFIED_ITEMS_ONLY("ClassifiedItemsOnly"),

    /**
     * 
     * 						
     * 						Restricts listings to return only items that have the Ad Format feature.
     * 					
     * 
     */
    @XmlEnumValue("AdFormat")
    AD_FORMAT("AdFormat");
    private final String value;

    ItemTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemTypeCodeType fromValue(String v) {
        for (ItemTypeCodeType c: ItemTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
