
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OutOfStock"/>
 *     &lt;enumeration value="BuyerNoShow"/>
 *     &lt;enumeration value="BuyerRefused"/>
 *     &lt;enumeration value="BuyerNotSchedule"/>
 *     &lt;enumeration value="BuyerCancelOrder"/>
 *     &lt;enumeration value="ValetDeliveryIssues"/>
 *     &lt;enumeration value="ValetUnavailable"/>
 *     &lt;enumeration value="OrderPlacedByMistake"/>
 *     &lt;enumeration value="PriceTooHigh"/>
 *     &lt;enumeration value="FoundCheaperPrice"/>
 *     &lt;enumeration value="WontArriveInTime"/>
 *     &lt;enumeration value="BuyerCancelOrAddressIssue"/>
 *     &lt;enumeration value="OutOfStockOrCannotFulfill"/>
 *     &lt;enumeration value="AddressIssues"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CancelReasonCodeType")
@XmlEnum
public enum CancelReasonCodeType {


    /**
     * 
     * 						This value indicates that the eBay order was cancelled by the seller due to the fact that one or more order line items were out-of-stock. This reason given by the seller will result in a seller defect.
     * 					
     * 
     */
    @XmlEnumValue("OutOfStock")
    OUT_OF_STOCK("OutOfStock"),

    /**
     * 
     * 						This value indicates that the eBay Scheduled Delivery order was cancelled due to the fact that the buyer was not at the expected delivery location to receive the order. This value is only applicable to eBay Scheduled Delivery orders, a service that is currently only available in the London area (UK).
     * 					
     * 
     */
    @XmlEnumValue("BuyerNoShow")
    BUYER_NO_SHOW("BuyerNoShow"),

    /**
     * 
     * 						This value indicates that the eBay Scheduled Delivery order was cancelled due to the fact that the buyer refused to accept the order. This value is only applicable to eBay Scheduled Delivery orders, a service that is currently only available in the London area (UK).
     * 					
     * 
     */
    @XmlEnumValue("BuyerRefused")
    BUYER_REFUSED("BuyerRefused"),

    /**
     * 
     * 						This value indicates that the eBay Scheduled Delivery order was cancelled due to the fact that the buyer did not successfully schedule the delivery of the order. This value is only applicable to eBay Scheduled Delivery orders, a service that is currently only available in the London area (UK).
     * 					
     * 
     */
    @XmlEnumValue("BuyerNotSchedule")
    BUYER_NOT_SCHEDULE("BuyerNotSchedule"),

    /**
     * 
     * 						This value indicates that the seller initiated the cancellation of the order but at the request of the buyer. This is a cancel reason that the seller gives to avoid a seller defect for the cancellation.
     * 					
     * 
     */
    @XmlEnumValue("BuyerCancelOrder")
    BUYER_CANCEL_ORDER("BuyerCancelOrder"),

    /**
     * 
     * 						This value indicates that the eBay Scheduled Delivery order was cancelled due to the fact that the delivery person had an issue delivering the order to the buyer. This value is only applicable to eBay Scheduled Delivery orders, a service that is currently only available in the London area (UK).
     * 					
     * 
     */
    @XmlEnumValue("ValetDeliveryIssues")
    VALET_DELIVERY_ISSUES("ValetDeliveryIssues"),

    /**
     * 
     * 						This value indicates that the eBay Scheduled Delivery order was cancelled due to the fact that no delivery person was available to deliver the order to the buyer. This value is only applicable to eBay Scheduled Delivery orders, a service that is currently only available in the London area (UK).
     * 					
     * 
     */
    @XmlEnumValue("ValetUnavailable")
    VALET_UNAVAILABLE("ValetUnavailable"),

    /**
     * 
     * 						This value indicates that the cancellation of the eBay order was initiated by the buyer because the order was placed by mistake.
     * 					
     * 
     */
    @XmlEnumValue("OrderPlacedByMistake")
    ORDER_PLACED_BY_MISTAKE("OrderPlacedByMistake"),

    /**
     * 
     * 							This value indicates that the cancellation of the eBay order was initiated by the buyer because the buyer decided that the price for the item was too high.
     * 						
     * 
     */
    @XmlEnumValue("PriceTooHigh")
    PRICE_TOO_HIGH("PriceTooHigh"),

    /**
     * 
     * 						This value indicates that the cancellation of the eBay order was initiated by the buyer because the buyer found the same item somewhere else at a cheaper price.
     * 					
     * 
     */
    @XmlEnumValue("FoundCheaperPrice")
    FOUND_CHEAPER_PRICE("FoundCheaperPrice"),

    /**
     * 
     * 						This value indicates that the cancellation of the eBay order was initiated by the buyer because the buyer realized that the order will not arrive soon enough.
     * 					
     * 
     */
    @XmlEnumValue("WontArriveInTime")
    WONT_ARRIVE_IN_TIME("WontArriveInTime"),

    /**
     * 
     * 						THIS ENUMERATION VALUE IS DEPRECATED. This value indicates that the seller initiated the cancellation of the order but at the request of the buyer, or if the buyer supplied a bad/incorrect address at purchase time. This is a cancel reason that the seller can give to avoid a seller defect for the cancellation. Replacement values are AddressIssues and BuyerCancelOrder.
     * 					
     * 
     */
    @XmlEnumValue("BuyerCancelOrAddressIssue")
    BUYER_CANCEL_OR_ADDRESS_ISSUE("BuyerCancelOrAddressIssue"),

    /**
     * 
     * 						This value indicates that the eBay order was cancelled by the seller due to the fact that one or more order line items were out-of-stock, or due to another reason why the seller was unable to fulfill the order. This reason given by the seller will result in a seller defect.
     * 					
     * 
     */
    @XmlEnumValue("OutOfStockOrCannotFulfill")
    OUT_OF_STOCK_OR_CANNOT_FULFILL("OutOfStockOrCannotFulfill"),

    /**
     * 
     * 						This enumeration value indicates that the seller initiated the order cancellation request because there are issues with the destination address supplied by the buyer.
     * 						<br/><br/>
     * 						This cancellation reason can only be given by the seller and not the buyer.
     * 					
     * 
     */
    @XmlEnumValue("AddressIssues")
    ADDRESS_ISSUES("AddressIssues"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CancelReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancelReasonCodeType fromValue(String v) {
        for (CancelReasonCodeType c: CancelReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
