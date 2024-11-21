
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InquiryStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InquiryStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="TrackInquiryPendingBuyerResponse"/>
 *     &lt;enumeration value="TrackInquiryPendingSellerResponse"/>
 *     &lt;enumeration value="TrackInquiryClosedWithRefund"/>
 *     &lt;enumeration value="TrackInquiryClosedNoRefund"/>
 *     &lt;enumeration value="TrackInquiryEscalatedPendingBuyer"/>
 *     &lt;enumeration value="TrackInquiryEscalatedPendingSeller"/>
 *     &lt;enumeration value="TrackInquiryEscalatedPendingCS"/>
 *     &lt;enumeration value="TrackInquiryEscalatedClosedWithRefund"/>
 *     &lt;enumeration value="TrackInquiryEscalatedClosedNoRefund"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "InquiryStatusCodeType")
@XmlEnum
public enum InquiryStatusCodeType {


    /**
     * 
     * 					This value indicates that the INR inquiry is invalid.
     * 				
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 					This value indicates that the INR inquiry is not applicable.
     * 				
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * 
     * 					This value indicates that the INR inquiry is pending a response from the buyer.
     * 				
     * 
     */
    @XmlEnumValue("TrackInquiryPendingBuyerResponse")
    TRACK_INQUIRY_PENDING_BUYER_RESPONSE("TrackInquiryPendingBuyerResponse"),

    /**
     * 
     * 					This value indicates that the INR inquiry is pending a response from the  seller.
     * 				
     * 
     */
    @XmlEnumValue("TrackInquiryPendingSellerResponse")
    TRACK_INQUIRY_PENDING_SELLER_RESPONSE("TrackInquiryPendingSellerResponse"),

    /**
     * 
     * 					This value indicates that the INR inquiry was closed with a refund issued to the buyer.
     * 				
     * 
     */
    @XmlEnumValue("TrackInquiryClosedWithRefund")
    TRACK_INQUIRY_CLOSED_WITH_REFUND("TrackInquiryClosedWithRefund"),

    /**
     * 
     * 					This value indicates that the INR inquiry was closed with no refund issued to the buyer.
     * 				
     * 
     */
    @XmlEnumValue("TrackInquiryClosedNoRefund")
    TRACK_INQUIRY_CLOSED_NO_REFUND("TrackInquiryClosedNoRefund"),

    /**
     * 
     * 					This value indicates that the INR inquiry was escalated to an eBay Money Back Guarantee case, and it is pending a response from the buyer.
     * 				
     * 
     */
    @XmlEnumValue("TrackInquiryEscalatedPendingBuyer")
    TRACK_INQUIRY_ESCALATED_PENDING_BUYER("TrackInquiryEscalatedPendingBuyer"),

    /**
     * 
     * 					This value indicates that the INR inquiry was escalated to an eBay Money Back Guarantee case, and it is pending a response from the seller.
     * 				
     * 
     */
    @XmlEnumValue("TrackInquiryEscalatedPendingSeller")
    TRACK_INQUIRY_ESCALATED_PENDING_SELLER("TrackInquiryEscalatedPendingSeller"),

    /**
     * 
     * 					This value indicates that the INR inquiry was escalated to an eBay Money Back Guarantee case, and it is pending a response from eBay Customer Support.
     * 				
     * 
     */
    @XmlEnumValue("TrackInquiryEscalatedPendingCS")
    TRACK_INQUIRY_ESCALATED_PENDING_CS("TrackInquiryEscalatedPendingCS"),

    /**
     * 
     * 					This value indicates that the INR inquiry was escalated to an eBay Money Back Guarantee case, but it was closed with a refund issued to the buyer.
     * 				
     * 
     */
    @XmlEnumValue("TrackInquiryEscalatedClosedWithRefund")
    TRACK_INQUIRY_ESCALATED_CLOSED_WITH_REFUND("TrackInquiryEscalatedClosedWithRefund"),

    /**
     * 
     * 					This value indicates that the INR inquiry was escalated to an eBay Money Back Guarantee case, but it was closed with no refund issued to the buyer.
     * 				
     * 
     */
    @XmlEnumValue("TrackInquiryEscalatedClosedNoRefund")
    TRACK_INQUIRY_ESCALATED_CLOSED_NO_REFUND("TrackInquiryEscalatedClosedNoRefund"),

    /**
     * 
     * 					Reserved for internal or future use.
     * 				
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    InquiryStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InquiryStatusCodeType fromValue(String v) {
        for (InquiryStatusCodeType c: InquiryStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
