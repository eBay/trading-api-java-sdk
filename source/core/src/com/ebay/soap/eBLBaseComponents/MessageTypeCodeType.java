
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AskSellerQuestion"/>
 *     &lt;enumeration value="ResponseToASQQuestion"/>
 *     &lt;enumeration value="ContactEbayMember"/>
 *     &lt;enumeration value="ContactTransactionPartner"/>
 *     &lt;enumeration value="ResponseToContacteBayMember"/>
 *     &lt;enumeration value="ContacteBayMemberViaCommunityLink"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="ContactMyBidder"/>
 *     &lt;enumeration value="ContacteBayMemberViaAnonymousEmail"/>
 *     &lt;enumeration value="ClassifiedsContactSeller"/>
 *     &lt;enumeration value="ClassifiedsBestOffer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "MessageTypeCodeType")
@XmlEnum
public enum MessageTypeCodeType {


    /**
     * 
     *             Member to Member message initiated by bidder/potential bidder
     *             to a seller of a particular item.
     *           
     * 
     */
    @XmlEnumValue("AskSellerQuestion")
    ASK_SELLER_QUESTION("AskSellerQuestion"),

    /**
     * 
     *             Member to Member message initiated as a response
     *             to an Ask A Question message.
     * 			<span class="tablenote"><b>Note:</b> 
     * 				This value is not supported in the <b>MailMessageType</b> field of a <b>GetMemberMessages</b> request.
     * 			</span>
     *           
     * 
     */
    @XmlEnumValue("ResponseToASQQuestion")
    RESPONSE_TO_ASQ_QUESTION("ResponseToASQQuestion"),

    /**
     * 
     *             Member to Member message initiated by any eBay member
     *             to another eBay member.
     * 			<span class="tablenote"><b>Note:</b> 
     * 				This value is not supported in the <b>MailMessageType</b> field of a <b>GetMemberMessages</b> request.
     * 			</span>			
     *           
     * 
     */
    @XmlEnumValue("ContactEbayMember")
    CONTACT_EBAY_MEMBER("ContactEbayMember"),

    /**
     * 
     *             Member message between order partners within 90 days
     *             after creation of the order.
     * 			<span class="tablenote"><b>Note:</b> 
     * 				This value is not supported in the <b>MailMessageType</b> field of a <b>GetMemberMessages</b> request.
     * 			</span>			
     *           
     * 
     */
    @XmlEnumValue("ContactTransactionPartner")
    CONTACT_TRANSACTION_PARTNER("ContactTransactionPartner"),

    /**
     * 
     *             Member to Member message initiated as a response
     *             to a Contact eBay Member message.
     * 			<span class="tablenote"><b>Note:</b> 
     * 				This value is not supported in the <b>MailMessageType</b> field of a <b>GetMemberMessages</b> request.
     * 			</span>			
     *           
     * 
     */
    @XmlEnumValue("ResponseToContacteBayMember")
    RESPONSE_TO_CONTACTE_BAY_MEMBER("ResponseToContacteBayMember"),

    /**
     * 
     *             Member to Member message initiated by any eBay member
     *             to another eBay member who has posted on a community forum
     *             within the past 7 days.
     * 			<span class="tablenote"><b>Note:</b> 
     * 				This value is not supported in the <b>MailMessageType</b> field of a <b>GetMemberMessages</b> request.
     * 			</span>			
     *           
     * 
     */
    @XmlEnumValue("ContacteBayMemberViaCommunityLink")
    CONTACTE_BAY_MEMBER_VIA_COMMUNITY_LINK("ContacteBayMemberViaCommunityLink"),

    /**
     * 
     *             Reserved for future or internal use.
     * 			<span class="tablenote"><b>Note:</b> 
     * 				This value is not supported in the <b>MailMessageType</b> field of a <b>GetMemberMessages</b> request.
     * 			</span>			
     *           
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     *             All message types.
     *           
     * 
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     * 
     *             Member to Member message initiated by sellers to their
     *             bidders during an active listing.
     * 			<span class="tablenote"><b>Note:</b> 
     * 				This value is not supported in the <b>MailMessageType</b> field of a <b>GetMemberMessages</b> request.
     * 			</span>			
     *           
     * 
     */
    @XmlEnumValue("ContactMyBidder")
    CONTACT_MY_BIDDER("ContactMyBidder"),

    /**
     * 
     *             Member message initiated after eBay receives an email sent by an
     *             eBay member's email client to another eBay member.
     * 			<span class="tablenote"><b>Note:</b> 
     * 				This value is not supported in the <b>MailMessageType</b> field of a <b>GetMemberMessages</b> request.
     * 			</span>			
     *           
     * 
     */
    @XmlEnumValue("ContacteBayMemberViaAnonymousEmail")
    CONTACTE_BAY_MEMBER_VIA_ANONYMOUS_EMAIL("ContacteBayMemberViaAnonymousEmail"),

    /**
     * 
     *             Indicates that an inquiry has been sent to the seller regarding the
     * 			corresponding classified ad listing.
     * 			<span class="tablenote"><b>Note:</b> 
     * 				This value is not supported in the <b>MailMessageType</b> field of a <b>GetMemberMessages</b> request.
     * 			</span>			
     * 			
     * 
     */
    @XmlEnumValue("ClassifiedsContactSeller")
    CLASSIFIEDS_CONTACT_SELLER("ClassifiedsContactSeller"),

    /**
     * 
     * 			Indicates that a Best Offer has been made on the seller's corresponding
     * 			classified ad listing. This message type is only applicable to Classified
     * 			categories that allow the Best Offer feature, such as motor vehicles.
     * 			<span class="tablenote"><b>Note:</b> 
     * 				This value is not supported in the <b>MailMessageType</b> field of a <b>GetMemberMessages</b> request.
     * 			</span>			
     *            
     * 
     */
    @XmlEnumValue("ClassifiedsBestOffer")
    CLASSIFIEDS_BEST_OFFER("ClassifiedsBestOffer");
    private final String value;

    MessageTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageTypeCodeType fromValue(String v) {
        for (MessageTypeCodeType c: MessageTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
