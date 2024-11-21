
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EndReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LostOrBroken"/>
 *     &lt;enumeration value="NotAvailable"/>
 *     &lt;enumeration value="Incorrect"/>
 *     &lt;enumeration value="OtherListingError"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="SellToHighBidder"/>
 *     &lt;enumeration value="Sold"/>
 *     &lt;enumeration value="ProductDeleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "EndReasonCodeType")
@XmlEnum
public enum EndReasonCodeType {


    /**
     * 
     * 						Use this enumeration value in an End listing call if the seller is ending a listing because the item was lost or is broken.
     * 					
     * 
     */
    @XmlEnumValue("LostOrBroken")
    LOST_OR_BROKEN("LostOrBroken"),

    /**
     * 
     * 						Use this enumeration value in an End listing call if the seller is ending a listing because the item is no longer available for sale.
     * 					
     * 
     */
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),

    /**
     * 
     * 						Use this enumeration value in an End listing call if the seller is ending a listing because the start price or reserve price is incorrect.
     * 					
     * 
     */
    @XmlEnumValue("Incorrect")
    INCORRECT("Incorrect"),

    /**
     * 
     * 						Use this enumeration value in an End listing call if the seller is ending a listing because the listing contained an error (other than start price or reserve price).
     * 					
     * 
     */
    @XmlEnumValue("OtherListingError")
    OTHER_LISTING_ERROR("OtherListingError"),

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
     * 					  Use this enumeration value in an End listing call if the seller is ending a listing because they want to sell an auction item to the current high bidder. A seller can end a listing early in order to sell to the current high bidder when the listing has qualifying bids (i.e., there is a current high bid that,
     * 					  when applicable, meets the minimum reserve price) and there is more than 12 hours before the listing ends.
     * 					  <br>
     * 					  <b>Note</b>: In the last 12 hours of an item listing, you cannot end an item early if it has bids.
     * 					
     * 
     */
    @XmlEnumValue("SellToHighBidder")
    SELL_TO_HIGH_BIDDER("SellToHighBidder"),

    /**
     * 
     * 						The vehicle was sold. Applies to local classified listings for vehicles only.
     * 					
     * 
     */
    @XmlEnumValue("Sold")
    SOLD("Sold"),

    /**
     * 
     * 						For internal use only. This enumeration value cannot be used by the seller in an End listing call, but it will get returned in <b>GetItem</b> if a listing was administratively ended by eBay if the item in a listing becomes unpurchasable due to the eBay Catalog product associated with the listing being removed from the catalog.
     * 					
     * 
     */
    @XmlEnumValue("ProductDeleted")
    PRODUCT_DELETED("ProductDeleted");
    private final String value;

    EndReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndReasonCodeType fromValue(String v) {
        for (EndReasonCodeType c: EndReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
