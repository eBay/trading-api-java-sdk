
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestOfferStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BestOfferStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Retracted"/>
 *     &lt;enumeration value="AdminEnded"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Countered"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="PendingBuyerPayment"/>
 *     &lt;enumeration value="PendingBuyerConfirmation"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BestOfferStatusCodeType")
@XmlEnum
public enum BestOfferStatusCodeType {


    /**
     * 
     * 						This value indicates that the buyer's Best Offer on an item is awaiting the
     * 						seller's response (accept, decline, counter offer). A buyer's Best Offer expires
     * 						after 48 hours without a seller's response.
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						Depending on context, this value can indicate that the buyer's Best Offer was
     * 						accepted by the seller, or that the seller's or buyer's counter offer was accepted by the other party.
     * 					
     * 
     */
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),

    /**
     * 
     * 						Depending on context, this value can indicate that the buyer's Best Offer was
     * 						declined by the seller, or that the seller's or buyer's counter offer was declined by the other party.
     * 					
     * 
     */
    @XmlEnumValue("Declined")
    DECLINED("Declined"),

    /**
     * 
     * 						Depending on context, this value can indicate that the buyer's Best Offer expired due to the passing of 48 hours with no seller response (accept, decline, counter offer), or that the seller's or buyer's counter offer expired due to the passing of 48 hours with no response from other party.
     * 					
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * 
     * 						Depending on context, this value can indicate that the buyer has retracted the Best Offer, or that the seller's or buyer's counter offer has been retracted.
     * 					
     * 
     */
    @XmlEnumValue("Retracted")
    RETRACTED("Retracted"),

    /**
     * 
     * 						This value indicates that the Best Offer was ended by an eBay administrator.
     * 					
     * 
     */
    @XmlEnumValue("AdminEnded")
    ADMIN_ENDED("AdminEnded"),

    /**
     * 
     * 						Depending on context, this value can indicate that a buyer's Best Offer or that the seller's or buyer's counter offer is in the active state. The <code>Active</code> value can also be used in the <b>GetBestOffers</b> request to retrieve only active Best Offers.
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						Depending on context, this value can indicate that a buyer's Best Offer has been countered by the seller, or that the seller's or buyer's counter offer has been countered by the other party.
     * 					
     * 
     */
    @XmlEnumValue("Countered")
    COUNTERED("Countered"),

    /**
     * 
     * 						This value is used in the <b>GetBestOffers</b> request to retrieve all Best Offers in all states. This value is only applicable to the <b>GetBestOffers</b> call.
     * 					
     * 
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     * 
     * 						This value indicates that the buyer and seller have come to agreement on a Best Offer price, but the seller is still waiting for payment from the buyer. If the buyer does not pay within 48 hours, the Best Offer will expire.
     * 					
     * 
     */
    @XmlEnumValue("PendingBuyerPayment")
    PENDING_BUYER_PAYMENT("PendingBuyerPayment"),

    /**
     * 
     * 						This value indicates that the seller is waiting on the buyer to commit to buying the item at the counter offer price.
     * 					
     * 
     */
    @XmlEnumValue("PendingBuyerConfirmation")
    PENDING_BUYER_CONFIRMATION("PendingBuyerConfirmation"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BestOfferStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BestOfferStatusCodeType fromValue(String v) {
        for (BestOfferStatusCodeType c: BestOfferStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
