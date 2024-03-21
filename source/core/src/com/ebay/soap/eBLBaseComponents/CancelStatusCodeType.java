
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="CancelRequested"/>
 *     &lt;enumeration value="CancelPending"/>
 *     &lt;enumeration value="CancelRejected"/>
 *     &lt;enumeration value="CancelClosedNoRefund"/>
 *     &lt;enumeration value="CancelClosedWithRefund"/>
 *     &lt;enumeration value="CancelClosedUnknownRefund"/>
 *     &lt;enumeration value="CancelClosedForCommitment"/>
 *     &lt;enumeration value="CancelComplete"/>
 *     &lt;enumeration value="CancelFailed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CancelStatusCodeType")
@XmlEnum
public enum CancelStatusCodeType {


    /**
     * 
     * 						This value indicates that the order cancellation request is invalid.
     * 					
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 						This value indicates that the order cancellation request is not applicable.
     * 					
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * 
     * 						This value indicates that the buyer has initiated the cancellation of the eBay order. It will be up to the seller to decide to approve or reject the cancellation request.
     * 					
     * 
     */
    @XmlEnumValue("CancelRequested")
    CANCEL_REQUESTED("CancelRequested"),

    /**
     * 
     * 						This value indicates that the cancellation of the eBay order has been initiated by the buyer and approved by the seller, but the cancellation request has yet to be completed.
     * 					
     * 
     */
    @XmlEnumValue("CancelPending")
    CANCEL_PENDING("CancelPending"),

    /**
     * 
     * 						This value indicates that the cancellation of the eBay order initiated by the buyer has been rejected by the seller.
     * 					
     * 
     */
    @XmlEnumValue("CancelRejected")
    CANCEL_REJECTED("CancelRejected"),

    /**
     * 
     * 						This value indicates that the order cancellation request has been closed, with no refund issued to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("CancelClosedNoRefund")
    CANCEL_CLOSED_NO_REFUND("CancelClosedNoRefund"),

    /**
     * 
     * 						This value indicates that the order cancellation request has been closed, with a refund issued to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("CancelClosedWithRefund")
    CANCEL_CLOSED_WITH_REFUND("CancelClosedWithRefund"),

    /**
     * 
     * 						This value indicates that the order cancellation request has been closed, and it is unknown whether or not a refund was issued to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("CancelClosedUnknownRefund")
    CANCEL_CLOSED_UNKNOWN_REFUND("CancelClosedUnknownRefund"),

    /**
     * 
     * 						This value indicates that since the buyer committed to buying the item but did not pay for it, the cancellation succeeded and no refund is needed.
     * 					
     * 
     */
    @XmlEnumValue("CancelClosedForCommitment")
    CANCEL_CLOSED_FOR_COMMITMENT("CancelClosedForCommitment"),

    /**
     * 
     * 						This value indicates that the cancellation of the eBay order has been completed.
     * 					
     * 
     */
    @XmlEnumValue("CancelComplete")
    CANCEL_COMPLETE("CancelComplete"),

    /**
     * 
     * 						This value indicates that the cancellation of the eBay order has failed.
     * 					
     * 
     */
    @XmlEnumValue("CancelFailed")
    CANCEL_FAILED("CancelFailed"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CancelStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancelStatusCodeType fromValue(String v) {
        for (CancelStatusCodeType c: CancelStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
