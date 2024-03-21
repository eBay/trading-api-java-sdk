
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Ended"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ListingStatusCodeType")
@XmlEnum
public enum ListingStatusCodeType {


    /**
     * 
     * 						The listing is still active or the listing has ended with
     * 						a sale but eBay has not completed processing the sale details
     * 						(e.g., total price and high bidder). A multi-item listing is
     * 						considered active until all items have winning bids or
     * 						purchases or the listing ends with at least one winning bid or
     * 						purchase. If the listing has ended with a sale but this Active
     * 						status is returned, please allow several minutes for eBay to
     * 						finish processing the listing.
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						The listing has ended. If the listing ended with a sale,
     * 						eBay has completed processing of the sale. All sale information
     * 						returned from eBay (e.g., total price and high bidder) should be
     * 						considered accurate and complete. However, the final value fee is
     * 						not yet available.
     * 					
     * 
     */
    @XmlEnumValue("Ended")
    ENDED("Ended"),

    /**
     * 
     * 						The listing has closed and eBay has completed processing the sale. All
     * 						sale information returned from eBay (e.g., total price and high bidder) should
     * 						be considered accurate and complete. Although the Final Value Fee (FVF) for
     * 						FixedPriceItem and StoresFixedPrice items is returned by GetSellerTransactions
     * 						and GetItemTransactions, all other listing types (excluding Buy It Now
     * 						purchases) require the listing status to be Completed before the Final Value
     * 						Fee is returned.
     * 					
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

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
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    ListingStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingStatusCodeType fromValue(String v) {
        for (ListingStatusCodeType c: ListingStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
