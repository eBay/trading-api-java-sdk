
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredSellerActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequiredSellerActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ResolveeBPCase"/>
 *     &lt;enumeration value="MarkAsShipped"/>
 *     &lt;enumeration value="ContacteBayCS"/>
 *     &lt;enumeration value="ResolvePPPIcase"/>
 *     &lt;enumeration value="SetupPayoutMethod"/>
 *     &lt;enumeration value="UpdatePayoutMethod"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="UploadTrackingInfo"/>
 *     &lt;enumeration value="ResolveBuyerMessageInr"/>
 *     &lt;enumeration value="ResolveBuyerMessageSnad"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ResolveReturn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RequiredSellerActionCodeType")
@XmlEnum
public enum RequiredSellerActionCodeType {


    /**
     * 
     * 						This value indicates that there is an open eBay Money Back Guarantee case
     * 						involving the seller and the order. The seller must address and get
     * 						the case resolved before the funds can be scheduled for release to the
     * 						seller's account. 
     * 					
     * 
     */
    @XmlEnumValue("ResolveeBPCase")
    RESOLVEE_BP_CASE("ResolveeBPCase"),

    /**
     * 
     * 						This value indicates that the seller must mark the order line item as shipped to expedite
     * 						the release of funds into their account. The seller can use the <b>CompleteSale</b>
     * 						call or My eBay to mark an item as shipped. 
     * 					
     * 
     */
    @XmlEnumValue("MarkAsShipped")
    MARK_AS_SHIPPED("MarkAsShipped"),

    /**
     * 
     * 						This value indicates that the seller should contact eBay Customer Support to discover
     * 						the next required action to expedite the release of funds into their account.
     * 					
     * 
     */
    @XmlEnumValue("ContacteBayCS")
    CONTACTE_BAY_CS("ContacteBayCS"),

    /**
     * 
     * 						This value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ResolvePPPIcase")
    RESOLVE_PPP_ICASE("ResolvePPPIcase"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("SetupPayoutMethod")
    SETUP_PAYOUT_METHOD("SetupPayoutMethod"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("UpdatePayoutMethod")
    UPDATE_PAYOUT_METHOD("UpdatePayoutMethod"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This value indicates that the seller must provide shipment tracking information for
     * 						the order line item to expedite the release of funds into their account. The seller can
     * 						use the <b>CompleteSale</b> call to provide tracking information for an
     * 						order line item. 
     * 					
     * 
     */
    @XmlEnumValue("UploadTrackingInfo")
    UPLOAD_TRACKING_INFO("UploadTrackingInfo"),

    /**
     * 
     * 						This value indicates that the buyer has not received the order, and the buyer has contacted
     * 						the seller through the eBay system in an effort to resolve the issue with the seller. The
     * 						seller must make it right with the buyer in order to expedite the release of funds into
     * 						their account.
     * 					
     * 
     */
    @XmlEnumValue("ResolveBuyerMessageInr")
    RESOLVE_BUYER_MESSAGE_INR("ResolveBuyerMessageInr"),

    /**
     * 
     * 						This value indicates that the buyer has received the order, but the item is not as
     * 						described in the listing; hence, the buyer has contacted the seller through the eBay
     * 						system in an effort to resolve the issue with the seller. The seller must make it right
     * 						with the buyer in order to expedite the release of funds into their account.
     * 					
     * 
     */
    @XmlEnumValue("ResolveBuyerMessageSnad")
    RESOLVE_BUYER_MESSAGE_SNAD("ResolveBuyerMessageSnad"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This value indicates that the buyer is returning the item through eBay's return process. Upon receiving the returned item from the buyer, the seller must issue a refund to the buyer within five business days, and shortly after this happens, eBay will credit the seller's account with the Final Value Fee that was originally assessed on the sale of the item.
     * 					
     * 
     */
    @XmlEnumValue("ResolveReturn")
    RESOLVE_RETURN("ResolveReturn");
    private final String value;

    RequiredSellerActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequiredSellerActionCodeType fromValue(String v) {
        for (RequiredSellerActionCodeType c: RequiredSellerActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
