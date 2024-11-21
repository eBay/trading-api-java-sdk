
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSortTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSortTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemID"/>
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="StartPrice"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="BidCount"/>
 *     &lt;enumeration value="Quantity"/>
 *     &lt;enumeration value="StartTime"/>
 *     &lt;enumeration value="EndTime"/>
 *     &lt;enumeration value="SellerUserID"/>
 *     &lt;enumeration value="TimeLeft"/>
 *     &lt;enumeration value="ListingDuration"/>
 *     &lt;enumeration value="ListingType"/>
 *     &lt;enumeration value="CurrentPrice"/>
 *     &lt;enumeration value="ReservePrice"/>
 *     &lt;enumeration value="MaxBid"/>
 *     &lt;enumeration value="BidderCount"/>
 *     &lt;enumeration value="HighBidderUserID"/>
 *     &lt;enumeration value="BuyerUserID"/>
 *     &lt;enumeration value="BuyerPostalCode"/>
 *     &lt;enumeration value="BuyerEmail"/>
 *     &lt;enumeration value="SellerEmail"/>
 *     &lt;enumeration value="TotalPrice"/>
 *     &lt;enumeration value="WatchCount"/>
 *     &lt;enumeration value="BestOfferCount"/>
 *     &lt;enumeration value="QuestionCount"/>
 *     &lt;enumeration value="ShippingServiceCost"/>
 *     &lt;enumeration value="FeedbackReceived"/>
 *     &lt;enumeration value="FeedbackLeft"/>
 *     &lt;enumeration value="UserID"/>
 *     &lt;enumeration value="QuantitySold"/>
 *     &lt;enumeration value="BestOffer"/>
 *     &lt;enumeration value="QuantityAvailable"/>
 *     &lt;enumeration value="QuantityPurchased"/>
 *     &lt;enumeration value="WonPlatform"/>
 *     &lt;enumeration value="SoldPlatform"/>
 *     &lt;enumeration value="ListingDurationDescending"/>
 *     &lt;enumeration value="ListingTypeDescending"/>
 *     &lt;enumeration value="CurrentPriceDescending"/>
 *     &lt;enumeration value="ReservePriceDescending"/>
 *     &lt;enumeration value="MaxBidDescending"/>
 *     &lt;enumeration value="BidderCountDescending"/>
 *     &lt;enumeration value="HighBidderUserIDDescending"/>
 *     &lt;enumeration value="BuyerUserIDDescending"/>
 *     &lt;enumeration value="BuyerPostalCodeDescending"/>
 *     &lt;enumeration value="BuyerEmailDescending"/>
 *     &lt;enumeration value="SellerEmailDescending"/>
 *     &lt;enumeration value="TotalPriceDescending"/>
 *     &lt;enumeration value="WatchCountDescending"/>
 *     &lt;enumeration value="QuestionCountDescending"/>
 *     &lt;enumeration value="ShippingServiceCostDescending"/>
 *     &lt;enumeration value="FeedbackReceivedDescending"/>
 *     &lt;enumeration value="FeedbackLeftDescending"/>
 *     &lt;enumeration value="UserIDDescending"/>
 *     &lt;enumeration value="QuantitySoldDescending"/>
 *     &lt;enumeration value="BestOfferCountDescending"/>
 *     &lt;enumeration value="QuantityAvailableDescending"/>
 *     &lt;enumeration value="QuantityPurchasedDescending"/>
 *     &lt;enumeration value="BestOfferDescending"/>
 *     &lt;enumeration value="ItemIDDescending"/>
 *     &lt;enumeration value="PriceDescending"/>
 *     &lt;enumeration value="StartPriceDescending"/>
 *     &lt;enumeration value="TitleDescending"/>
 *     &lt;enumeration value="BidCountDescending"/>
 *     &lt;enumeration value="QuantityDescending"/>
 *     &lt;enumeration value="StartTimeDescending"/>
 *     &lt;enumeration value="EndTimeDescending"/>
 *     &lt;enumeration value="SellerUserIDDescending"/>
 *     &lt;enumeration value="TimeLeftDescending"/>
 *     &lt;enumeration value="WonPlatformDescending"/>
 *     &lt;enumeration value="SoldPlatformDescending"/>
 *     &lt;enumeration value="LeadCount"/>
 *     &lt;enumeration value="NewLeadCount"/>
 *     &lt;enumeration value="LeadCountDescending"/>
 *     &lt;enumeration value="NewLeadCountDescending"/>
 *     &lt;enumeration value="ClassifiedAdPayPerLeadFee"/>
 *     &lt;enumeration value="ClassifiedAdPayPerLeadFeeDescending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemSortTypeCodeType")
@XmlEnum
public enum ItemSortTypeCodeType {


    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to Item ID value in ascending order.
     * 					
     * 
     */
    @XmlEnumValue("ItemID")
    ITEM_ID("ItemID"),

    /**
     * 
     * 						This enumeration value is used to sort listings according to item price value in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Price")
    PRICE("Price"),

    /**
     * 
     * 						This enumeration value is used to sort listings or orders according to the starting price value in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("StartPrice")
    START_PRICE("StartPrice"),

    /**
     * 
     * 						This enumeration value is used to sort listings or orders according to listing title in ascending (alphabetical) order.
     * 					
     * 
     */
    @XmlEnumValue("Title")
    TITLE("Title"),

    /**
     * 
     * 						This enumeration value is used to sort auction listings according to the number of bids received in ascending order. This enumeration value is only applicable to auction listings, and is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("BidCount")
    BID_COUNT("BidCount"),

    /**
     * 
     * 						This enumeration value is used to sort fixed-price listings and orders according to item quantity in ascending order. This enumeration value is only applicable to fixed-price listings, and is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to start time in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("StartTime")
    START_TIME("StartTime"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to end time in ascending order.
     * 					
     * 
     */
    @XmlEnumValue("EndTime")
    END_TIME("EndTime"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to the seller's user ID in ascending (alphabetical) order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBaySelling</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("SellerUserID")
    SELLER_USER_ID("SellerUserID"),

    /**
     * 
     * 						This enumeration value is used to sort active listings and orders according to the time left before listing ends (in ascending order).
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("TimeLeft")
    TIME_LEFT("TimeLeft"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings according to the listing duration in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("ListingDuration")
    LISTING_DURATION("ListingDuration"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to the listing type in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("ListingType")
    LISTING_TYPE("ListingType"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to the current/final price in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("CurrentPrice")
    CURRENT_PRICE("CurrentPrice"),

    /**
     * 
     * 						This enumeration value is used to sort auction listings and orders according to the reserve price in ascending order. This enumeration value is only applicable when a seller wants to retrieve information on their own auction listings that have reserve prices set on them. This enumeration is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("ReservePrice")
    RESERVE_PRICE("ReservePrice"),

    /**
     * 
     * 						This enumeration value is used by a buyer to sort auction listings and orders according to the maximum bid price that they placed on an auction listing in ascending order. This enumeration value is only applicable to auction listings, and is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBaySelling</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("MaxBid")
    MAX_BID("MaxBid"),

    /**
     * 
     * 						This enumeration value is used to sort auction listings according to the number of unique bidders in ascending order. This enumeration value is only applicable to auction listings, and is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BidderCount")
    BIDDER_COUNT("BidderCount"),

    /**
     * 
     * 						This enumeration value is used to sort auction listings according to the user ID of the highest bidder in ascending order. This enumeration value is only applicable to auction listings, and is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("HighBidderUserID")
    HIGH_BIDDER_USER_ID("HighBidderUserID"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings according to the buyer's user ID in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BuyerUserID")
    BUYER_USER_ID("BuyerUserID"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings according to the buyer's location in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BuyerPostalCode")
    BUYER_POSTAL_CODE("BuyerPostalCode"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings according to the buyer's email address in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls, and a buyer's email address will only be exposed to the seller within two weeks of order purchase.
     * 					
     * 
     */
    @XmlEnumValue("BuyerEmail")
    BUYER_EMAIL("BuyerEmail"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBayBuying</b> call to sort listings and orders according to the seller's email address in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBaySelling</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("SellerEmail")
    SELLER_EMAIL("SellerEmail"),

    /**
     * 
     * 						This enumeration value is used to sort orders according to item price value in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("TotalPrice")
    TOTAL_PRICE("TotalPrice"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings and orders according to the number of users watching the listing in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("WatchCount")
    WATCH_COUNT("WatchCount"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort active listings according to the number of Best Offers that the listing has received in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferCount")
    BEST_OFFER_COUNT("BestOfferCount"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings and orders according to the number of questions that the listing has received in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("QuestionCount")
    QUESTION_COUNT("QuestionCount"),

    /**
     * 
     * 						This enumeration value is used to sort orders according to the cost to ship one unit of the order line item in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("ShippingServiceCost")
    SHIPPING_SERVICE_COST("ShippingServiceCost"),

    /**
     * 
     * 						This enumeration value is used to sort orders according to the type of feedback that a user received in ascending order. The Feedback ratings are defined in <b>CommentTypeCodeType</b>.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceived")
    FEEDBACK_RECEIVED("FeedbackReceived"),

    /**
     * 
     * 						This enumeration value is used to sort orders according to the type of feedback that a user left for another user in ascending order. The Feedback ratings are defined in <b>CommentTypeCodeType</b>.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackLeft")
    FEEDBACK_LEFT("FeedbackLeft"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to the eBay user ID of the order partner/owner of listing in ascending order.
     * 					
     * 
     */
    @XmlEnumValue("UserID")
    USER_ID("UserID"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort order line items according to the quantity sold in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("QuantitySold")
    QUANTITY_SOLD("QuantitySold"),

    /**
     * 
     * 						This enumeration value is used by the buyer in a <b>GetMyeBayBuying</b> call to sort all Best Offers made in ascending order according to the dollar amount of the Best Offer. This sort  option is only applicable if the buyer has at least one pending Best Offer on an order line item.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBaySelling</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BestOffer")
    BEST_OFFER("BestOffer"),

    /**
     * 
     * 						This enumeration value is used to sort order line items according to quantity available for purchase in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call, and it is only relevant to the <b>WatchList</b> container of the <b>GetMyeBayBuying</b> call.
     * 					
     * 
     */
    @XmlEnumValue("QuantityAvailable")
    QUANTITY_AVAILABLE("QuantityAvailable"),

    /**
     * 
     * 						This enumeration value is used to sort purchased line items according to the quantity purchased by the buyer in ascending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("QuantityPurchased")
    QUANTITY_PURCHASED("QuantityPurchased"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Half.com has been shut down, and eBay marketplace is the only remaining platform.
     * 					
     * 
     */
    @XmlEnumValue("WonPlatform")
    WON_PLATFORM("WonPlatform"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Half.com has been shut down, and eBay marketplace is the only remaining platform.
     * 					
     * 
     */
    @XmlEnumValue("SoldPlatform")
    SOLD_PLATFORM("SoldPlatform"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings according to the listing duration in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("ListingDurationDescending")
    LISTING_DURATION_DESCENDING("ListingDurationDescending"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to the listing type in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("ListingTypeDescending")
    LISTING_TYPE_DESCENDING("ListingTypeDescending"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to the current/final price in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("CurrentPriceDescending")
    CURRENT_PRICE_DESCENDING("CurrentPriceDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort auction listings and orders according to the reserve price in descending order. This enumeration value is only applicable when a seller wants to retrieve information on their own auction listings that have reserve prices set on them.
     * 						<br/><br/>
     * 						This enumeration is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("ReservePriceDescending")
    RESERVE_PRICE_DESCENDING("ReservePriceDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBayBuying</b> call to sort auction listings and orders according to the maximum bid price that a buyer placed on an auction listing in descending order.
     * 						<br/><br/>
     * 						This enumeration value is only applicable to auction listings, and is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBaySelling</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("MaxBidDescending")
    MAX_BID_DESCENDING("MaxBidDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort auction listings according to the number of unique bidders in descending order.
     * 						<br/><br/>
     * 						This enumeration value is only applicable to auction listings, and is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BidderCountDescending")
    BIDDER_COUNT_DESCENDING("BidderCountDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort auction listings according to the user ID of the highest bidder in descending order.
     * 						<br/><br/>
     * 						This enumeration value is only applicable to auction listings, and is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("HighBidderUserIDDescending")
    HIGH_BIDDER_USER_ID_DESCENDING("HighBidderUserIDDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings according to the buyer's user ID in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BuyerUserIDDescending")
    BUYER_USER_ID_DESCENDING("BuyerUserIDDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings according to the buyer's location in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BuyerPostalCodeDescending")
    BUYER_POSTAL_CODE_DESCENDING("BuyerPostalCodeDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings according to the buyer's email address in descending order. A buyer's actual email address will only be exposed to the seller within two weeks of order purchase.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BuyerEmailDescending")
    BUYER_EMAIL_DESCENDING("BuyerEmailDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBayBuying</b> call to sort listings and orders according to the seller's email address in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBaySelling</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("SellerEmailDescending")
    SELLER_EMAIL_DESCENDING("SellerEmailDescending"),

    /**
     * 
     * 						This enumeration value is used to sort orders according to item price value in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("TotalPriceDescending")
    TOTAL_PRICE_DESCENDING("TotalPriceDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings and orders according to the number of users watching the listing in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("WatchCountDescending")
    WATCH_COUNT_DESCENDING("WatchCountDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort listings and orders according to the number of questions that the listing has received in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("QuestionCountDescending")
    QUESTION_COUNT_DESCENDING("QuestionCountDescending"),

    /**
     * 
     * 						This enumeration value is used to sort orders according to the cost to ship one unit of the order line item in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("ShippingServiceCostDescending")
    SHIPPING_SERVICE_COST_DESCENDING("ShippingServiceCostDescending"),

    /**
     * 
     * 						This enumeration value is used to sort orders according to the type of feedback that a user received in descending order. The Feedback ratings are defined in <b>CommentTypeCodeType</b>.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceivedDescending")
    FEEDBACK_RECEIVED_DESCENDING("FeedbackReceivedDescending"),

    /**
     * 
     * 						This enumeration value is used to sort orders according to the type of feedback that a user left for another user in descending order. The Feedback ratings are defined in <b>CommentTypeCodeType</b>.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackLeftDescending")
    FEEDBACK_LEFT_DESCENDING("FeedbackLeftDescending"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to the eBay user ID of the order partner/owner of listing in descending order.
     * 					
     * 
     */
    @XmlEnumValue("UserIDDescending")
    USER_ID_DESCENDING("UserIDDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort order line items according to the quantity sold in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("QuantitySoldDescending")
    QUANTITY_SOLD_DESCENDING("QuantitySoldDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBaySelling</b> call to sort active listings according to the number of Best Offers that the listing has received in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferCountDescending")
    BEST_OFFER_COUNT_DESCENDING("BestOfferCountDescending"),

    /**
     * 
     * 						This enumeration value is used to sort order line items according to quantity available for purchase in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call, and it is only relevant to the <b>WatchList</b> container of the <b>GetMyeBayBuying</b> call.
     * 					
     * 
     */
    @XmlEnumValue("QuantityAvailableDescending")
    QUANTITY_AVAILABLE_DESCENDING("QuantityAvailableDescending"),

    /**
     * 
     * 						This enumeration value is used to sort purchased line items according to the quantity purchased by the buyer in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("QuantityPurchasedDescending")
    QUANTITY_PURCHASED_DESCENDING("QuantityPurchasedDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBayBuying</b> call to sort all Best Offers made in descending order according to the dollar amount of the Best Offer. This sort option is only applicable if the buyer has at least one pending Best Offer on an order line item.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBaySelling</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferDescending")
    BEST_OFFER_DESCENDING("BestOfferDescending"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to Item ID value in descending order.
     * 					
     * 
     */
    @XmlEnumValue("ItemIDDescending")
    ITEM_ID_DESCENDING("ItemIDDescending"),

    /**
     * 
     * 						This enumeration value is used to sort listings according to item price value in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("PriceDescending")
    PRICE_DESCENDING("PriceDescending"),

    /**
     * 
     * 						This enumeration value is used to sort listings or orders according to the starting price value in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("StartPriceDescending")
    START_PRICE_DESCENDING("StartPriceDescending"),

    /**
     * 
     * 						This enumeration value is used to sort listings or orders according to listing title in descending (alphabetical) order.
     * 					
     * 
     */
    @XmlEnumValue("TitleDescending")
    TITLE_DESCENDING("TitleDescending"),

    /**
     * 
     * 						This enumeration value is used to sort auction listings according to the number of bids received in descending order.
     * 						<br/><br/>
     * 						This enumeration value is only applicable to auction listings, and is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("BidCountDescending")
    BID_COUNT_DESCENDING("BidCountDescending"),

    /**
     * 
     * 						This enumeration value is used to sort fixed-price listings and orders according to item quantity in descending order.
     * 						<br/><br/>
     * 						This enumeration value is only applicable to fixed-price listings, and is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("QuantityDescending")
    QUANTITY_DESCENDING("QuantityDescending"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to start time in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("StartTimeDescending")
    START_TIME_DESCENDING("StartTimeDescending"),

    /**
     * 
     * 						This enumeration value is used to sort listings and orders according to end time in descending order.
     * 					
     * 
     */
    @XmlEnumValue("EndTimeDescending")
    END_TIME_DESCENDING("EndTimeDescending"),

    /**
     * 
     * 						This enumeration value is used by the <b>GetMyeBayBuying</b> call to sort listings and orders according to the seller's user ID in descending order.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBaySelling</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("SellerUserIDDescending")
    SELLER_USER_ID_DESCENDING("SellerUserIDDescending"),

    /**
     * 
     * 						This enumeration value is used to sort active listings and orders according to the time left before listing ends (in descending order).
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> call.
     * 					
     * 
     */
    @XmlEnumValue("TimeLeftDescending")
    TIME_LEFT_DESCENDING("TimeLeftDescending"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Half.com has been shut down, and eBay marketplace is the only remaining platform.
     * 					
     * 
     */
    @XmlEnumValue("WonPlatformDescending")
    WON_PLATFORM_DESCENDING("WonPlatformDescending"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Half.com has been shut down, and eBay marketplace is the only remaining platform.
     * 					
     * 
     */
    @XmlEnumValue("SoldPlatformDescending")
    SOLD_PLATFORM_DESCENDING("SoldPlatformDescending"),

    /**
     * 
     * 						This enumeration value is used by the seller of a classified ad listing in a <b>GetMyeBaySelling</b> call to sort classified ad listings according to the total number of leads (prospective buyer inquiries) in ascending order. Each lead involves an email to the buyer, and the <b>LeadCount</b> value includes read and unread emails.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("LeadCount")
    LEAD_COUNT("LeadCount"),

    /**
     * 
     * 						This enumeration value is used by the seller of a classified ad listing in a <b>GetMyeBaySelling</b> call to sort classified ad listings according to the number of new leads (prospective buyer inquiries) in ascending order. Each lead involves an email to the buyer, and the <b>NewLeadCount</b> value only includes unread emails.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("NewLeadCount")
    NEW_LEAD_COUNT("NewLeadCount"),

    /**
     * 
     * 						This enumeration value is used by the seller of a classified ad listing in a <b>GetMyeBaySelling</b> call to sort classified ad listings according to the total number of leads (prospective buyer inquiries) in descending order. Each lead involves an email to the buyer, and the <b>LeadCount</b> value includes read and unread emails.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("LeadCountDescending")
    LEAD_COUNT_DESCENDING("LeadCountDescending"),

    /**
     * 
     * 						This enumeration value is used by the seller of a classified ad listing in a <b>GetMyeBaySelling</b> call to sort classified ad listings according to the number of new leads (prospective buyer inquiries) in descending order. Each lead involves an email to the buyer, and the <b>NewLeadCount</b> value only includes unread emails.
     * 						<br/><br/>
     * 						This enumeration value is not applicable to the <b>GetItemsAwaitingFeedback</b> or <b>GetMyeBayBuying</b> calls.
     * 					
     * 
     */
    @XmlEnumValue("NewLeadCountDescending")
    NEW_LEAD_COUNT_DESCENDING("NewLeadCountDescending"),

    /**
     * 
     * 						The pay-per-lead feature is no longer available, so this value is no longer
     * 						applicable.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdPayPerLeadFee")
    CLASSIFIED_AD_PAY_PER_LEAD_FEE("ClassifiedAdPayPerLeadFee"),

    /**
     * 
     * 						The pay-per-lead feature is no longer available, so this value is no longer
     * 						applicable.
     * 					
     * 
     */
    @XmlEnumValue("ClassifiedAdPayPerLeadFeeDescending")
    CLASSIFIED_AD_PAY_PER_LEAD_FEE_DESCENDING("ClassifiedAdPayPerLeadFeeDescending"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemSortTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSortTypeCodeType fromValue(String v) {
        for (ItemSortTypeCodeType c: ItemSortTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
