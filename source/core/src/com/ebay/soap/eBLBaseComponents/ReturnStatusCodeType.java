
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="ReturnRequestPendingApproval"/>
 *     &lt;enumeration value="ReturnRequestRejected"/>
 *     &lt;enumeration value="ReturnOpen"/>
 *     &lt;enumeration value="ReturnShipped"/>
 *     &lt;enumeration value="ReturnDelivered"/>
 *     &lt;enumeration value="ReturnClosedWithRefund"/>
 *     &lt;enumeration value="ReturnClosedEscalated"/>
 *     &lt;enumeration value="ReturnClosedNoRefund"/>
 *     &lt;enumeration value="ReturnEscalatedPendingBuyer"/>
 *     &lt;enumeration value="ReturnEscalatedPendingSeller"/>
 *     &lt;enumeration value="ReturnEscalatedPendingCS"/>
 *     &lt;enumeration value="ReturnEscalatedClosedWithRefund"/>
 *     &lt;enumeration value="ReturnEscalatedClosedNoRefund"/>
 *     &lt;enumeration value="ReturnEscalated"/>
 *     &lt;enumeration value="ReturnRequestPending"/>
 *     &lt;enumeration value="ReturnRequestClosedWithRefund"/>
 *     &lt;enumeration value="ReturnRequestClosedNoRefund"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ReturnStatusCodeType")
@XmlEnum
public enum ReturnStatusCodeType {


    /**
     * 
     * 					This value indicates that the return request is invalid.
     * 				
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * 						This value indicates that the return request is not applicable.
     * 					
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * 
     * 							This value indicates that the return request has been initiated by the buyer and is pending approval by the seller.
     * 						
     * 
     */
    @XmlEnumValue("ReturnRequestPendingApproval")
    RETURN_REQUEST_PENDING_APPROVAL("ReturnRequestPendingApproval"),

    /**
     * 
     * 						This value indicates that the buyer's return request was rejected by the seller.
     * 					
     * 
     */
    @XmlEnumValue("ReturnRequestRejected")
    RETURN_REQUEST_REJECTED("ReturnRequestRejected"),

    /**
     * 
     * 						This value indicates that a return request was successfully opened by the buyer.
     * 					
     * 
     */
    @XmlEnumValue("ReturnOpen")
    RETURN_OPEN("ReturnOpen"),

    /**
     * 
     * 						This value indicates that the buyer has return shipped the item(s) in the return request back to the seller.
     * 					
     * 
     */
    @XmlEnumValue("ReturnShipped")
    RETURN_SHIPPED("ReturnShipped"),

    /**
     * 
     * 						This value indicates that the seller has received the item(s) that the buyer return shipped.
     * 					
     * 
     */
    @XmlEnumValue("ReturnDelivered")
    RETURN_DELIVERED("ReturnDelivered"),

    /**
     * 
     * 						This value indicates that a return request was closed with a refund issued to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("ReturnClosedWithRefund")
    RETURN_CLOSED_WITH_REFUND("ReturnClosedWithRefund"),

    /**
     * 
     * 							This value indicates that a return request was closed after being escalated to an eBay return case.
     * 						
     * 
     */
    @XmlEnumValue("ReturnClosedEscalated")
    RETURN_CLOSED_ESCALATED("ReturnClosedEscalated"),

    /**
     * 
     * 						This value indicates that a return request was closed with no refund issued to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("ReturnClosedNoRefund")
    RETURN_CLOSED_NO_REFUND("ReturnClosedNoRefund"),

    /**
     * 
     * 						This value indicates that a return request was escalated to an eBay return case, and the case is awaiting a response from the buyer.
     * 					
     * 
     */
    @XmlEnumValue("ReturnEscalatedPendingBuyer")
    RETURN_ESCALATED_PENDING_BUYER("ReturnEscalatedPendingBuyer"),

    /**
     * 
     * 						This value indicates that a return request was escalated to an eBay return case, and the case is awaiting a response from the seller.
     * 					
     * 
     */
    @XmlEnumValue("ReturnEscalatedPendingSeller")
    RETURN_ESCALATED_PENDING_SELLER("ReturnEscalatedPendingSeller"),

    /**
     * 
     * 						This value indicates that a return request was escalated to an eBay return case, and the case is awaiting a response from eBay Customer Support.
     * 					
     * 
     */
    @XmlEnumValue("ReturnEscalatedPendingCS")
    RETURN_ESCALATED_PENDING_CS("ReturnEscalatedPendingCS"),

    /**
     * 
     * 						This value indicates that a return request was escalated to an eBay return case, but the case was closed with a refund issued to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("ReturnEscalatedClosedWithRefund")
    RETURN_ESCALATED_CLOSED_WITH_REFUND("ReturnEscalatedClosedWithRefund"),

    /**
     * 
     * 						This value indicates that a return request was escalated to an eBay return case, but the case was closed with no refund issued to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("ReturnEscalatedClosedNoRefund")
    RETURN_ESCALATED_CLOSED_NO_REFUND("ReturnEscalatedClosedNoRefund"),

    /**
     * 
     * 						This value indicates that a return request was escalated to an eBay return case.
     * 					
     * 
     */
    @XmlEnumValue("ReturnEscalated")
    RETURN_ESCALATED("ReturnEscalated"),

    /**
     * 
     * 						This value indicates that the return request is currently in the pending state.
     * 					
     * 
     */
    @XmlEnumValue("ReturnRequestPending")
    RETURN_REQUEST_PENDING("ReturnRequestPending"),

    /**
     * 
     * 						This value indicates that the return request was closed with a refund to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("ReturnRequestClosedWithRefund")
    RETURN_REQUEST_CLOSED_WITH_REFUND("ReturnRequestClosedWithRefund"),

    /**
     * 
     * 						This value indicates that the return request was closed with no refund to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("ReturnRequestClosedNoRefund")
    RETURN_REQUEST_CLOSED_NO_REFUND("ReturnRequestClosedNoRefund"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ReturnStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnStatusCodeType fromValue(String v) {
        for (ReturnStatusCodeType c: ReturnStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
