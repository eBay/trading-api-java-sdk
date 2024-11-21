
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestOfferActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BestOfferActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Accept"/>
 *     &lt;enumeration value="Decline"/>
 *     &lt;enumeration value="Counter"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BestOfferActionCodeType")
@XmlEnum
public enum BestOfferActionCodeType {


    /**
     * 
     * 						This value should be passed in to the <b>Action</b> field to accept the Best Offer identified in the <b>BestOfferID</b> field. Note that only one Best Offer may be accepted in a single <b>RespondToBestOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Accept")
    ACCEPT("Accept"),

    /**
     * 
     * 						This value should be passed in to the <b>Action</b> field to decline one or more Best Offers identified by one or more <b>BestOfferID</b> fields. Note that multiple Best Offers may be declined in a single <b>RespondToBestOffer</b> call.
     * 					
     * 
     */
    @XmlEnumValue("Decline")
    DECLINE("Decline"),

    /**
     * 
     * 						This value should be passed in to the <b>Action</b> field to counter a buyer's Best Offer or Counter Offer. Note that a seller may only counter one Best Offer in a single <b>RespondToBestOffer</b> call. If a seller is using the <b>RespondToBestOffer</b> call to counter a Best Offer, the counter offer price must be specified in the <b>CounterOfferPrice</b> field, and the quantity of items in the Best Offer must be specified in the <b>CounterOfferQuantity</b> field. 
     * 					
     * 
     */
    @XmlEnumValue("Counter")
    COUNTER("Counter"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BestOfferActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BestOfferActionCodeType fromValue(String v) {
        for (BestOfferActionCodeType c: BestOfferActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
