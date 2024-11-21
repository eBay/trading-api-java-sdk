
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Bid"/>
 *     &lt;enumeration value="NotUsed"/>
 *     &lt;enumeration value="Retraction"/>
 *     &lt;enumeration value="AutoRetraction"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="AutoCancel"/>
 *     &lt;enumeration value="Absentee"/>
 *     &lt;enumeration value="BuyItNow"/>
 *     &lt;enumeration value="Purchase"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="Offer"/>
 *     &lt;enumeration value="Counter"/>
 *     &lt;enumeration value="Accept"/>
 *     &lt;enumeration value="Decline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BidActionCodeType")
@XmlEnum
public enum BidActionCodeType {


    /**
     * 
     * 						This value indicates that the action or state is unknown.
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						This value is used in a <b>PlaceOffer</b> call if the buyer wants to bid on an auction listing. If this value is used, the prospective buyer must also include the <b>Offer.MaxBid</b> field in the <b>PlaceOffer</b> call and specify the maximum amount that they are willing to bid in an attempt to win the auction. eBay will automatically rebid on behalf of the buyer each time the buyer is outbid up until the time when their <b>Offer.MaxBid</b> value threshold is met. The <b>GetAllBidders</b> call will return this value as well if the buyer has set up automatic bidding using a maximum bid threshold.
     * 					
     * 
     */
    @XmlEnumValue("Bid")
    BID("Bid"),

    /**
     * 
     * 						This value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("NotUsed")
    NOT_USED("NotUsed"),

    /**
     * 
     * 						This value indicates that a buyer's Best Offer or a seller's or buyer's counter offer was retracted. This value cannot be used with the <b>PlaceOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Retraction")
    RETRACTION("Retraction"),

    /**
     * 
     * 						This value indicates that a buyer's Best Offer or a seller's or buyer's counter offer was automatically retracted. This value cannot be used with the <b>PlaceOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("AutoRetraction")
    AUTO_RETRACTION("AutoRetraction"),

    /**
     * 
     * 						This value indicates that a buyer's Best Offer or a seller's or buyer's counter offer was cancelled. This value cannot be used with the <b>PlaceOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),

    /**
     * 
     * 						This value indicates that a buyer's Best Offer or a seller's or buyer's counter offer was automatically cancelled. This value cannot be used with the <b>PlaceOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("AutoCancel")
    AUTO_CANCEL("AutoCancel"),

    /**
     * 
     * 						This value is returned in the <b>GetAllBidders</b> call if an absentee bid was made, which means that eBay made a bid on the auction listing on behalf of the buyer, who has set a maximum bid threshold. This value is not applicable for the <b>PlaceOffer</b> call, as the buyer would use the <code>Bid</code> value instead, as well as setting a <b>Offer.MaxBid</b> value that would specify the maxium amount that the buyer is willing to bid in an attempt to win the auction.
     * 					
     * 
     */
    @XmlEnumValue("Absentee")
    ABSENTEE("Absentee"),

    /**
     * 
     * 						This value is returned in the <b>GetAllBidders</b> call if the buyer purchased an item in an auction listing using the Buy It Now feature. This value is not applicable for the <b>PlaceOffer</b> call, as the buyer would use the <code>Purchase</code> value instead.
     * 					
     * 
     */
    @XmlEnumValue("BuyItNow")
    BUY_IT_NOW("BuyItNow"),

    /**
     * 
     * 						This value is used in a <b>PlaceOffer</b> call if the buyer wants to purchase a fixed-price item or purchase an auction item enabled with the Buy It Now feature. Note that this call cannot be used to purchase items that require immediate payment.  The <b>GetAllBidders</b> call will return this value as well if the buyer purchased the item. For items requiring immediate payment, the <b>PlaceOffer</b> call cannot be used for purchase.
     * 					
     * 
     */
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),

    /**
     * 
     * 						Reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This value is used in a <b>PlaceOffer</b> call if the buyer is proposing a Best Offer to the seller. The <b>GetAllBidders</b> call will return this value as well if the buyer proposed a Best Offer to the seller.
     * 					
     * 
     */
    @XmlEnumValue("Offer")
    OFFER("Offer"),

    /**
     * 
     * 						This value is used in a <b>PlaceOffer</b> call if the buyer is proposing a counter offer to the seller's proposed counter offer. The <b>GetAllBidders</b> call will return this value as well if the buyer proposed a counter offer to the seller's counter offer.
     * 					
     * 
     */
    @XmlEnumValue("Counter")
    COUNTER("Counter"),

    /**
     * 
     * 						This value is used in a <b>PlaceOffer</b> call if the buyer is accepting a counter offer proposed by the seller. The <b>GetAllBidders</b> call will return this value as well if the buyer accepted a counter offer.
     * 					
     * 
     */
    @XmlEnumValue("Accept")
    ACCEPT("Accept"),

    /**
     * 
     * 						This value is used in a <b>PlaceOffer</b> call if the buyer is declining a counter offer proposed by the seller. The <b>GetAllBidders</b> call will return this value as well if the buyer declined a counter offer.
     * 					
     * 
     */
    @XmlEnumValue("Decline")
    DECLINE("Decline");
    private final String value;

    BidActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidActionCodeType fromValue(String v) {
        for (BidActionCodeType c: BidActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
