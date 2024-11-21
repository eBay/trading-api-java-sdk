
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAllBiddersModeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetAllBiddersModeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ViewAll"/>
 *     &lt;enumeration value="EndedListing"/>
 *     &lt;enumeration value="SecondChanceEligibleEndedListing"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "GetAllBiddersModeCodeType")
@XmlEnum
public enum GetAllBiddersModeCodeType {


    /**
     * 
     * 						This enumeration value is used if the user wants to retrieve all bidders on an active or recently-ended auction listing. This value can be used by any user, and it is the default value if the <b>CallMode</b> field is not included in the call request.
     * 					
     * 
     */
    @XmlEnumValue("ViewAll")
    VIEW_ALL("ViewAll"),

    /**
     * 
     * 						This enumeration value is used if the user wants to retrieve all non-winning bidders for a recently-ended auction listing. This value can be only be used by the seller of the item.
     * 					
     * 
     */
    @XmlEnumValue("EndedListing")
    ENDED_LISTING("EndedListing"),

    /**
     * 
     * 						This enumeration value is used if the user wants to retrieve all non-winning bidders, for a recently-ended auction listing, who are eligible for, and who accept Second Chance Offers. This value can be only be used by the seller of the item.  See <a href="http://pages.ebay.com/help/sell/second_chance_offer.html#when" target="_blank">When to use a Second Chance Offer</a> for more information on Second Chance Offers.
     * 					
     * 
     */
    @XmlEnumValue("SecondChanceEligibleEndedListing")
    SECOND_CHANCE_ELIGIBLE_ENDED_LISTING("SecondChanceEligibleEndedListing"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    GetAllBiddersModeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetAllBiddersModeCodeType fromValue(String v) {
        for (GetAllBiddersModeCodeType c: GetAllBiddersModeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
