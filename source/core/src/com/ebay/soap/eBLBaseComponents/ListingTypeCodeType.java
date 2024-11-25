
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Chinese"/>
 *     &lt;enumeration value="Dutch"/>
 *     &lt;enumeration value="Live"/>
 *     &lt;enumeration value="Auction"/>
 *     &lt;enumeration value="AdType"/>
 *     &lt;enumeration value="StoresFixedPrice"/>
 *     &lt;enumeration value="PersonalOffer"/>
 *     &lt;enumeration value="FixedPriceItem"/>
 *     &lt;enumeration value="Half"/>
 *     &lt;enumeration value="LeadGeneration"/>
 *     &lt;enumeration value="Express"/>
 *     &lt;enumeration value="Shopping"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ListingTypeCodeType")
@XmlEnum
public enum ListingTypeCodeType {


    /**
     * 
     * 						Unknown or undefined auction type. Applicable to
     * 						user preferences and other informational use cases.
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						This value indicates an auction listing. In an auction listing, prospective buyers engage in a competitive bidding process, although Buy It Now may be offered as long as no bids have been placed. Auctions occur on the eBay marketplace site, and the auction listings will also appear in the seller's eBay Store (if the seller has an eBay Store).
     * 						<br><br>
     * 						Although listing durations may vary by eBay marketplace and category, typical listing durations for auctions are 3, 5, 7, and 10 days. It is recommended that the seller uses the <b>GetCategoryFeatures</b> call to retrieve the actual listing durations that are supported for auctions on a particular marketplace and category.
     * 					
     * 
     */
    @XmlEnumValue("Chinese")
    CHINESE("Chinese"),

    /**
     * 
     * 					 This value is no longer applicable.
     * 					
     * 					
     * 
     */
    @XmlEnumValue("Dutch")
    DUTCH("Dutch"),

    /**
     * 
     * 					 This value is no longer applicable.
     * 				
     * 					
     * 
     */
    @XmlEnumValue("Live")
    LIVE("Live"),

    /**
     * 
     * 						This enumeration value is only applicable to the <b>GetMyeBaySelling</b> call. This value is used in the <b>ActiveList.ListingType</b> field if the seller only wants to retrieve active listings that are in the auction format.
     * 					
     * 
     */
    @XmlEnumValue("Auction")
    AUCTION("Auction"),

    /**
     * 
     * 						This enumeration value represents a classified ad in a Real Estate category. This listing type is only used to solicit inquiries from interested parties. To express interest, a buyer fills in a contact form that eBay forwards to the seller as a lead. This format does not enable buyers and sellers to transact online through eBay, and eBay Feedback is not available for ad format listings.
     * 						<br><br>
     * 						Although listing durations may vary by eBay marketplace and category, typical listing durations for real estate ads are 30 and 90 days. It is recommended that the seller uses the <b>GetCategoryFeatures</b> call to retrieve the actual listing durations that are supported for real estate ads on a particular marketplace and category.
     * 					
     * 
     */
    @XmlEnumValue("AdType")
    AD_TYPE("AdType"),

    /**
     * 
     * 					 This value is no longer applicable.
     *            
     *           
     * 
     */
    @XmlEnumValue("StoresFixedPrice")
    STORES_FIXED_PRICE("StoresFixedPrice"),

    /**
     * 
     * 						Second chance offer made to a non-winning bidder on an ended listing.
     * 						A seller can make an offer to a non-winning bidder when either the winning bidder
     * 						has failed to pay for an item or the seller has a duplicate of the item.
     * 						A seller can create a Second Chance Offer immediately after a listing ends and up to
     * 						60 days after the end of the listing.
     * 						<br/><br/>
     * 						eBay does not charge an Insertion Fee,
     * 						but if the bidder accepts the offer, the regular Final Value Fee is charged.
     * 						In the case of an Unpaid Item, the seller should ensure that everything has
     * 						been done to resolve the issue with the winning bidder before sending a
     * 						Second Chance Offer to another bidder.
     * 						<br/><br/>
     * 						See the Unpaid Items Process for details.
     * 						Make sure you're aware of other rules and restrictions surrounding Second Chance Offers.
     * 						Use <b>AddSecondChanceItem</b> to submit Second Chance Offers.
     * 						Listed on eBay, but does not appear when browsing or searching listings.
     * 					
     * 
     */
    @XmlEnumValue("PersonalOffer")
    PERSONAL_OFFER("PersonalOffer"),

    /**
     * 
     *             With this listing format, the selling is offering the item at a fixed price, although it is still possible for the seller to negotiate the price with prospective buyers using the Best Offer feature. A fixed-price listing can offer a single item, or if the seller has multiple quantity of the same item, multiple quantity of that same item can be made available for sale through the same listing. Additionally, the seller can set up a multiple-variation, fixed-price listing, where similar items can be sold through the same listing. An example of a multiple-variation, fixed-price listing might be a t-shirt (or another article of clothing) that is available in multiple color and size combinations.
     *             <br><br>
     *             Traditionally, listing durations for fixed-prices listings have varied by eBay marketplace and category. Typical listing durations for fixed-price listings ranged from three to 30 days, or GTC (Good 'Til Cancelled). As of April 1, 2019, 'GTC' is the only supported listing duration for all eBay marketplaces with the following exceptions:
     *             <ul>
     *             	<li>The following eBay Motors US categories are exempt from this change: <em>Cars & Trucks</em> (6001), <em>Motorcycles</em> (6024), <em>Other Vehicles & Trailers</em> (6038), <em>Boats</em> (26429), <em>Powersports</em> (66466).</li>
     *             	<li>All child categories under <em>Cars, Motorcycles & Vehicles</em> (9800) categories on the eBay UK and eBay Italy sites are also exempt from this change. </li>
     *             </ul>
     *             <br>
     *             With the 'GTC' listing duration, the listing will remain active as long as the listing shows that inventory is available for purchase (available quantity is '1' or more). For sellers listing motor vehicles on the eBay US Motors, eBay UK, or eBay Italy sites, it is recommended that the seller uses the <b>GetCategoryFeatures</b> call to retrieve the supported listing durations for their particular marketplace and category.
     *             <br>
     * 						<br>
     * 						<span class="tablenote"><b>Note: </b>
     * 							As long as a fixed-price listing has inventory available, or if the out-of-stock control feature is being used, GTC listings are automatically renewed each month according to the calendar day.
     * 						</span>
     *           
     * 
     */
    @XmlEnumValue("FixedPriceItem")
    FIXED_PRICE_ITEM("FixedPriceItem"),

    /**
     * 
     * 					<span class="tablenote"><b>Note: </b> This listing type is no longer applicable as the Half.com site has been shut down.
     * 					</span>
     * 					
     * 
     */
    @XmlEnumValue("Half")
    HALF("Half"),

    /**
     * 
     * 						This enumeration value represents a (non-Real Estate) classified ad listing. The <code>AdType</code> enumeration value represents Real Estate classified ads. This listing type is only used to solicit inquiries from interested parties. To express interest, a buyer fills in a contact form that eBay forwards to the seller as a lead. This format does not enable buyers and sellers to transact online through eBay, and eBay Feedback is not available for ad format listings. Non-Real Estate classified ads are only available in a limited number of eBay categories, including Business and Industrial categories, Travel, ans Specialty Services.
     * 						<br><br>
     * 						Although listing durations may vary by eBay marketplace and category, typical listing durations for (non-Real Estate) classified ads are 30, 60, and 90 days. It is recommended that the seller uses the <b>GetCategoryFeatures</b> call to retrieve the actual listing durations that are supported for real estate ads on a particular marketplace and category.
     * 					
     * 
     */
    @XmlEnumValue("LeadGeneration")
    LEAD_GENERATION("LeadGeneration"),

    /**
     * 
     * 					 This value is no longer applicable.
     * 					
     * 					
     * 
     */
    @XmlEnumValue("Express")
    EXPRESS("Express"),

    /**
     * 
     * 						This value is no longer applicable, as Shopping.com is no longer a property of eBay, Inc.
     * 					
     * 
     */
    @XmlEnumValue("Shopping")
    SHOPPING("Shopping"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingTypeCodeType fromValue(String v) {
        for (ListingTypeCodeType c: ListingTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
