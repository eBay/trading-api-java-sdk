
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationEventTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationEventTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OutBid"/>
 *     &lt;enumeration value="EndOfAuction"/>
 *     &lt;enumeration value="AuctionCheckoutComplete"/>
 *     &lt;enumeration value="CheckoutBuyerRequestsTotal"/>
 *     &lt;enumeration value="Feedback"/>
 *     &lt;enumeration value="FeedbackForSeller"/>
 *     &lt;enumeration value="FixedPriceTransaction"/>
 *     &lt;enumeration value="SecondChanceOffer"/>
 *     &lt;enumeration value="AskSellerQuestion"/>
 *     &lt;enumeration value="ItemListed"/>
 *     &lt;enumeration value="ItemRevised"/>
 *     &lt;enumeration value="BuyerResponseDispute"/>
 *     &lt;enumeration value="SellerOpenedDispute"/>
 *     &lt;enumeration value="SellerRespondedToDispute"/>
 *     &lt;enumeration value="SellerClosedDispute"/>
 *     &lt;enumeration value="BestOffer"/>
 *     &lt;enumeration value="MyMessagesAlertHeader"/>
 *     &lt;enumeration value="MyMessagesAlert"/>
 *     &lt;enumeration value="MyMessageseBayMessageHeader"/>
 *     &lt;enumeration value="MyMessageseBayMessage"/>
 *     &lt;enumeration value="MyMessagesM2MMessageHeader"/>
 *     &lt;enumeration value="MyMessagesM2MMessage"/>
 *     &lt;enumeration value="INRBuyerOpenedDispute"/>
 *     &lt;enumeration value="INRBuyerRespondedToDispute"/>
 *     &lt;enumeration value="INRBuyerClosedDispute"/>
 *     &lt;enumeration value="INRSellerRespondedToDispute"/>
 *     &lt;enumeration value="Checkout"/>
 *     &lt;enumeration value="WatchedItemEndingSoon"/>
 *     &lt;enumeration value="ItemClosed"/>
 *     &lt;enumeration value="ItemSuspended"/>
 *     &lt;enumeration value="ItemSold"/>
 *     &lt;enumeration value="ItemExtended"/>
 *     &lt;enumeration value="UserIDChanged"/>
 *     &lt;enumeration value="EmailAddressChanged"/>
 *     &lt;enumeration value="PasswordChanged"/>
 *     &lt;enumeration value="PasswordHintChanged"/>
 *     &lt;enumeration value="PaymentDetailChanged"/>
 *     &lt;enumeration value="AccountSuspended"/>
 *     &lt;enumeration value="AccountSummary"/>
 *     &lt;enumeration value="ThirdPartyCartCheckout"/>
 *     &lt;enumeration value="ItemRevisedAddCharity"/>
 *     &lt;enumeration value="ItemAddedToWatchList"/>
 *     &lt;enumeration value="ItemRemovedFromWatchList"/>
 *     &lt;enumeration value="ItemAddedToBidGroup"/>
 *     &lt;enumeration value="ItemRemovedFromBidGroup"/>
 *     &lt;enumeration value="FeedbackLeft"/>
 *     &lt;enumeration value="FeedbackReceived"/>
 *     &lt;enumeration value="FeedbackStarChanged"/>
 *     &lt;enumeration value="BidPlaced"/>
 *     &lt;enumeration value="BidReceived"/>
 *     &lt;enumeration value="ItemWon"/>
 *     &lt;enumeration value="ItemLost"/>
 *     &lt;enumeration value="ItemUnsold"/>
 *     &lt;enumeration value="CounterOfferReceived"/>
 *     &lt;enumeration value="BestOfferDeclined"/>
 *     &lt;enumeration value="BestOfferPlaced"/>
 *     &lt;enumeration value="AddToWatchList"/>
 *     &lt;enumeration value="PlaceOffer"/>
 *     &lt;enumeration value="RemoveFromWatchList"/>
 *     &lt;enumeration value="AddToBidGroup"/>
 *     &lt;enumeration value="RemoveFromBidGroup"/>
 *     &lt;enumeration value="ItemsCanceled"/>
 *     &lt;enumeration value="TokenRevocation"/>
 *     &lt;enumeration value="BulkDataExchangeJobCompleted"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ItemMarkedShipped"/>
 *     &lt;enumeration value="ItemMarkedPaid"/>
 *     &lt;enumeration value="EBPMyResponseDue"/>
 *     &lt;enumeration value="EBPOtherPartyResponseDue"/>
 *     &lt;enumeration value="EBPEscalatedCase"/>
 *     &lt;enumeration value="EBPAppealedCase"/>
 *     &lt;enumeration value="EBPMyPaymentDue"/>
 *     &lt;enumeration value="EBPPaymentDone"/>
 *     &lt;enumeration value="EBPClosedAppeal"/>
 *     &lt;enumeration value="EBPClosedCase"/>
 *     &lt;enumeration value="MyMessagesHighPriorityMessage"/>
 *     &lt;enumeration value="MyMessagesHighPriorityMessageHeader"/>
 *     &lt;enumeration value="EBPOnHoldCase"/>
 *     &lt;enumeration value="ReadyToShip"/>
 *     &lt;enumeration value="ReadyForPayout"/>
 *     &lt;enumeration value="BidItemEndingSoon"/>
 *     &lt;enumeration value="ShoppingCartItemEndingSoon"/>
 *     &lt;enumeration value="ReturnCreated"/>
 *     &lt;enumeration value="ReturnWaitingForSellerInfo"/>
 *     &lt;enumeration value="ReturnSellerInfoOverdue"/>
 *     &lt;enumeration value="ReturnShipped"/>
 *     &lt;enumeration value="ReturnDelivered"/>
 *     &lt;enumeration value="ReturnRefundOverdue"/>
 *     &lt;enumeration value="ReturnClosed"/>
 *     &lt;enumeration value="ReturnEscalated"/>
 *     &lt;enumeration value="BuyerCancelRequested"/>
 *     &lt;enumeration value="UnmatchedPaymentReceived"/>
 *     &lt;enumeration value="RefundSuccess"/>
 *     &lt;enumeration value="RefundFailure"/>
 *     &lt;enumeration value="OrderInquiryOpened"/>
 *     &lt;enumeration value="OrderInquiryReminderForEscalation"/>
 *     &lt;enumeration value="OrderInquiryProvideShipmentInformation"/>
 *     &lt;enumeration value="OrderInquiryClosed"/>
 *     &lt;enumeration value="OrderInquiryEscalatedToCase"/>
 *     &lt;enumeration value="ItemReadyForPickup"/>
 *     &lt;enumeration value="ItemOutOfStock"/>
 *     &lt;enumeration value="BuyerNoShow"/>
 *     &lt;enumeration value="WebnextMobilePhotoSync"/>
 *     &lt;enumeration value="PaymentReminder"/>
 *     &lt;enumeration value="EBNOrderPickedUp"/>
 *     &lt;enumeration value="EBNOrderCanceled"/>
 *     &lt;enumeration value="M2MMessageStatusChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "NotificationEventTypeCodeType")
@XmlEnum
public enum NotificationEventTypeCodeType {


    /**
     * 
     * 					  This notification is for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when another buyer has outbid
     * 						(placed a higher bid) the subscribed buyer on an auction listing, and
     * 						the subscribed buyer is no longer the current high bidder.
     * 						<br><br>
     * 						This notification is only applicable for auction listings.
     * 					
     * 
     */
    @XmlEnumValue("OutBid")
    OUT_BID("OutBid"),

    /**
     * 
     * 						This notification is sent to all subscribed bidders of an auction item and to
     * 						the subscribed seller of the auction item as soon as the auction listing ends
     * 						with or without a winning bidder. This notification will also be sent to
     * 						subscribed bidders and the subscribed seller if the auction ends as a
     * 						result of a buyer using the auction listing's Buy It Now feature.
     * 						<br><br>
     * 						This notification is only applicable for auction listings.
     * 					
     * 
     */
    @XmlEnumValue("EndOfAuction")
    END_OF_AUCTION("EndOfAuction"),

    /**
     * 
     * 						This notification is sent to the subscribed seller when the winning bidder
     * 						or buyer has paid for the auction or fixed-price item and completed the checkout process.
     * 						<br><br>
     * 						For multiple line item orders, an <b>AuctionCheckoutComplete</b> notification is only generated for one of the line items in the order.
     * 					
     * 
     */
    @XmlEnumValue("AuctionCheckoutComplete")
    AUCTION_CHECKOUT_COMPLETE("AuctionCheckoutComplete"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when a buyer/winning bidder
     * 						is requesting a total price before paying for the item.
     * 						<br><br>
     * 						This notification is applicable for auction listings and for fixed-price listings that do not require immediate payment.
     * 					
     * 
     */
    @XmlEnumValue("CheckoutBuyerRequestsTotal")
    CHECKOUT_BUYER_REQUESTS_TOTAL("CheckoutBuyerRequestsTotal"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that buyer or seller has left Feedback for the other party in the order, or has received Feedback from the other party in the order. Feedback is given at the order line item level.
     * 					
     * 
     */
    @XmlEnumValue("Feedback")
    FEEDBACK("Feedback"),

    /**
     * 
     * 						This notification is deprecated. Use the <b>Feedback</b> notification instead.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackForSeller")
    FEEDBACK_FOR_SELLER("FeedbackForSeller"),

    /**
     * 
     * 						This notification is sent to a subscribed seller each time a buyer purchases an item in a single or multiple-quantity, fixed-price listing.
     * 						<br><br>
     * 						This notification is only applicable for fixed-price listings.
     * 					
     * 
     */
    @XmlEnumValue("FixedPriceTransaction")
    FIXED_PRICE_TRANSACTION("FixedPriceTransaction"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when that buyer is offered a Second Chance Offer from the seller, after that buyer failed to win the original auction of the item.
     * 						<br><br>
     * 						If subscribed to by a buyer and when applicable, this notification will appear in the <b>GetItem</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("SecondChanceOffer")
    SECOND_CHANCE_OFFER("SecondChanceOffer"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when an eBay user has used the Ask a Question feature on the seller's active listing. An eBay user does not have to be an active bidder on an auction listing to ask a seller a question.
     * 						<br><br>
     * 						If subscribed to by a seller and when applicable, this notification will appear in the <b>GetMemberMessages</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("AskSellerQuestion")
    ASK_SELLER_QUESTION("AskSellerQuestion"),

    /**
     * 
     * 						This notification is sent to a subscribed seller each time one of the subscribed seller's items is listed or relisted. This notification is also triggered when the Unpaid Item preferences relists an item for the seller.
     * 					
     * 
     */
    @XmlEnumValue("ItemListed")
    ITEM_LISTED("ItemListed"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when one of the subscribed seller's items is revised.
     * 						<br><br>
     * 						If subscribed to by a seller and when applicable, this notification will appear in the <b>GetItem</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("ItemRevised")
    ITEM_REVISED("ItemRevised"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> This notification is no longer supported since the Trading API no longer supports seller-initiated cancellation requests.
     * 						</span>
     * 						This notification is sent to a subscribed seller each time a buyer responds to a Cancel Transaction request.
     * 					
     * 
     */
    @XmlEnumValue("BuyerResponseDispute")
    BUYER_RESPONSE_DISPUTE("BuyerResponseDispute"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> This notification is no longer supported since the Trading API no longer supports seller-initiated cancellation requests.
     * 						</span>
     * 						This notification is sent to a subscribed buyer if a seller initiates a Cancel Transaction request.
     * 					
     * 
     */
    @XmlEnumValue("SellerOpenedDispute")
    SELLER_OPENED_DISPUTE("SellerOpenedDispute"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> This notification is no longer supported since dispute calls in the Trading API are deprecated.
     * 						</span>
     * 						This notification is sent to a subscribed buyer each time a seller responds to an Item Not Received or Return case that the subscribed buyer has opened up against the seller.
     * 					
     * 
     */
    @XmlEnumValue("SellerRespondedToDispute")
    SELLER_RESPONDED_TO_DISPUTE("SellerRespondedToDispute"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> This notification is no longer supported since dispute calls in the Trading API are deprecated.
     * 						</span>
     * 						This notification is sent to the subscribed buyer and seller if the seller closes a Cancel Transaction request.
     * 					
     * 
     */
    @XmlEnumValue("SellerClosedDispute")
    SELLER_CLOSED_DISPUTE("SellerClosedDispute"),

    /**
     * 
     * 						This notification is sent to a subscribed seller if a potential buyer has made a Best Offer on a Best Offer-enabled listing.
     * 						<br><br>
     * 						If subscribed to by a seller and when applicable, this notification will appear in the <b>GetBestOffers</b> call response.
     * 						<br/><br/>
     * 						<span class="tablenote"><b>Note: </b>
     * 						The Best Offer feature can be set for auction listings on the US, Canada, UK, Germany, Australia, France, Italy, and Spain marketplaces, but keep in mind that Best Offer and Buy It Now cannot be used simultaneously in a listing. Also, once a qualifying bid is made on an auction listing, the Best Offer feature is disabled, and any pending offer or counteroffers are no longer valid.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("BestOffer")
    BEST_OFFER("BestOffer"),

    /**
     * 
     * 					   This notification is deprecated and can no longer be used.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesAlertHeader")
    MY_MESSAGES_ALERT_HEADER("MyMessagesAlertHeader"),

    /**
     * 
     * 					   This notification is deprecated. Use <b>MyMessagesHighPriorityMessage</b> instead.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesAlert")
    MY_MESSAGES_ALERT("MyMessagesAlert"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when eBay sends a message to that user's InBox.
     * 						<br><br>
     * 						If subscribed to by a buyer or seller, and when applicable, this notification will appear in the <b>GetMyMessages</b> call response. For this notification to be returned in <b>GetMyMessages</b>, the <b>DetailLevel</b> value in the <b>GetMyMessages</b> request must be set to <code>ReturnHeaders</code>.
     * 						<br><br>
     * 						<b>MyMessageseBayMessageHeader</b> and <b>MyMessageseBayMessage</b> cannot be subscribed
     * 						to at the same time or specified in the same call.
     * 					
     * 
     */
    @XmlEnumValue("MyMessageseBayMessageHeader")
    MY_MESSAGESE_BAY_MESSAGE_HEADER("MyMessageseBayMessageHeader"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when eBay sends a message to that user's InBox.
     * 						<br><br>
     * 						If subscribed to by a buyer or seller, and when applicable, this notification will appear in the <b>GetMyMessages</b> call response. For this notification to be returned in <b>GetMyMessages</b>, the <b>DetailLevel</b> value in the <b>GetMyMessages</b> request must be set to <code>ReturnMessages</code>.
     * 						<br><br>
     * 						<b>MyMessageseBayMessageHeader</b> and <b>MyMessageseBayMessage</b> cannot be subscribed
     * 						to at the same time or specified in the same call.
     * 					
     * 
     */
    @XmlEnumValue("MyMessageseBayMessage")
    MY_MESSAGESE_BAY_MESSAGE("MyMessageseBayMessage"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when another eBay user sends a message to that user's InBox.
     * 						<br><br>
     * 						If subscribed to by a buyer or seller, and when applicable, this notification will appear in the <b>GetMyMessages</b> call response. For this notification to be returned in <b>GetMyMessages</b>, the <b>DetailLevel</b> value in the <b>GetMyMessages</b> request must be set to <code>ReturnHeaders</code>.
     * 						<br><br>
     * 						<b>MyMessagesM2MMessageHeader</b> and <b>MyMessagesM2MMessage</b> cannot
     * 						be subscribed to at the same time or specified in the same call.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesM2MMessageHeader")
    MY_MESSAGES_M_2_M_MESSAGE_HEADER("MyMessagesM2MMessageHeader"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when another eBay user sends a message to that user's InBox.
     * 						<br><br>
     * 						If subscribed to by a buyer or seller, and when applicable, this notification will appear in the <b>GetMyMessages</b> call response. For this notification to be returned in <b>GetMyMessages</b>, the <b>DetailLevel</b> value in the <b>GetMyMessages</b> request must be set to <code>ReturnMessages</code>.
     * 						<br><br>
     * 						<b>MyMessagesM2MMessageHeader</b> and <b>MyMessagesM2MMessage</b> cannot
     * 						be subscribed to at the same time or specified in the same call.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesM2MMessage")
    MY_MESSAGES_M_2_M_MESSAGE("MyMessagesM2MMessage"),

    /**
     * 
     * 					  This event type has been deprecated along with legacy user disputes. As an alternative, subscribe to <b>EBPMyResponseDue</b> event type.
     * 					
     * 
     */
    @XmlEnumValue("INRBuyerOpenedDispute")
    INR_BUYER_OPENED_DISPUTE("INRBuyerOpenedDispute"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when a buyer responds to an Item Not Received case opened by that buyer.
     * 					
     * 
     */
    @XmlEnumValue("INRBuyerRespondedToDispute")
    INR_BUYER_RESPONDED_TO_DISPUTE("INRBuyerRespondedToDispute"),

    /**
     * 
     * 						This event type has been deprecated along with legacy user disputes. As an alternative, subscribe to <b>EBPClosedCase</b> event type.
     * 					
     * 
     */
    @XmlEnumValue("INRBuyerClosedDispute")
    INR_BUYER_CLOSED_DISPUTE("INRBuyerClosedDispute"),

    /**
     * 
     * 						This event type has been deprecated along with legacy user disputes.
     * 					
     * 
     */
    @XmlEnumValue("INRSellerRespondedToDispute")
    INR_SELLER_RESPONDED_TO_DISPUTE("INRSellerRespondedToDispute"),

    /**
     * 
     * 					   This notification is deprecated. Use <b>AuctionCheckoutComplete</b> instead.
     * 					
     * 
     */
    @XmlEnumValue("Checkout")
    CHECKOUT("Checkout"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when a listing that the buyer is watching is ending soon. This event has a <b>TimeLeft</b> property that defines the 'ending soon' threshold value.
     * 					
     * 
     */
    @XmlEnumValue("WatchedItemEndingSoon")
    WATCHED_ITEM_ENDING_SOON("WatchedItemEndingSoon"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when a listing ends. This notification can be triggered by an
     * 						<b>ItemWon</b>, an <b>ItemSold</b>, or an <b>ItemUnsold</b> event.
     * 					
     * 
     */
    @XmlEnumValue("ItemClosed")
    ITEM_CLOSED("ItemClosed"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when a listing is administratively taken down by eBay.
     * 					
     * 
     */
    @XmlEnumValue("ItemSuspended")
    ITEM_SUSPENDED("ItemSuspended"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when an eBay listing ends in a sale.
     * 					
     * 
     */
    @XmlEnumValue("ItemSold")
    ITEM_SOLD("ItemSold"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when the duration of an eBay listing has been extended.
     * 					
     * 
     */
    @XmlEnumValue("ItemExtended")
    ITEM_EXTENDED("ItemExtended"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that user has modified their eBay user ID.
     * 					
     * 
     */
    @XmlEnumValue("UserIDChanged")
    USER_ID_CHANGED("UserIDChanged"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that user has changed the email address associated with the user account. This notification is available for Client Alerts and for SMS only. Not applicable to Platform Notifications.
     * 					
     * 
     */
    @XmlEnumValue("EmailAddressChanged")
    EMAIL_ADDRESS_CHANGED("EmailAddressChanged"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that user has changed the password used for login. This notification is available for Client Alerts and for SMS only. Not applicable to Platform Notifications.
     * 					
     * 
     */
    @XmlEnumValue("PasswordChanged")
    PASSWORD_CHANGED("PasswordChanged"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that user has changed the password hint. This notification is available for Client Alerts and for SMS only. Not applicable to Platform Notifications.
     * 					
     * 
     */
    @XmlEnumValue("PasswordHintChanged")
    PASSWORD_HINT_CHANGED("PasswordHintChanged"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when that seller has changed the payment methods used to pay seller fees for the account. This notification is available for Client Alerts and for SMS only. Not applicable to Platform Notifications.
     * 					
     * 
     */
    @XmlEnumValue("PaymentDetailChanged")
    PAYMENT_DETAIL_CHANGED("PaymentDetailChanged"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that eBay user's account is suspended. This notification is available for Client Alerts and for SMS only. Not applicable to Platform Notifications.
     * 					
     * 
     */
    @XmlEnumValue("AccountSuspended")
    ACCOUNT_SUSPENDED("AccountSuspended"),

    /**
     * 
     * 						An informational alert about account activity. A buyer or seller can subscribe to receive an account activity summary via SMS or Client Alerts. The user can specify the period (time range) for the account summary and can select how often the summary is to be sent. It is not triggered by an event but rather by an eBay daemon process that monitors a schedule database.
     * 					
     * 
     */
    @XmlEnumValue("AccountSummary")
    ACCOUNT_SUMMARY("AccountSummary"),

    /**
     * 
     * 					   This notification is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ThirdPartyCartCheckout")
    THIRD_PARTY_CART_CHECKOUT("ThirdPartyCartCheckout"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when the seller has
     * 						revised a listing and added a nonprofit organization to receive a percentage (10 percent up to 100 percent) of the proceeds.
     * 					
     * 
     */
    @XmlEnumValue("ItemRevisedAddCharity")
    ITEM_REVISED_ADD_CHARITY("ItemRevisedAddCharity"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when that buyer adds an item to the Watch List.
     * 						<br><br>
     * 						If subscribed to by a buyer and when applicable, this notification will appear in the <b>GetItem</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("ItemAddedToWatchList")
    ITEM_ADDED_TO_WATCH_LIST("ItemAddedToWatchList"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when that buyer removes an item from the Watch List.
     * 						<br><br>
     * 						If subscribed to by a buyer and when applicable, this notification will appear in the <b>GetItem</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("ItemRemovedFromWatchList")
    ITEM_REMOVED_FROM_WATCH_LIST("ItemRemovedFromWatchList"),

    /**
     * 
     * 					   This notification is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ItemAddedToBidGroup")
    ITEM_ADDED_TO_BID_GROUP("ItemAddedToBidGroup"),

    /**
     * 
     * 					   This notification is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ItemRemovedFromBidGroup")
    ITEM_REMOVED_FROM_BID_GROUP("ItemRemovedFromBidGroup"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that user leaves feedback for an order partner.
     * 						<br><br>
     * 						If subscribed to by a buyer or seller, and when applicable, this notification will appear in the <b>GetFeedback</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackLeft")
    FEEDBACK_LEFT("FeedbackLeft"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that user receives feedback from an order partner.
     * 						<br><br>
     * 						If subscribed to by a buyer or seller, and when applicable, this notification will appear in the <b>GetFeedback</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceived")
    FEEDBACK_RECEIVED("FeedbackReceived"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that user's Feedback star has changed.
     * 						Sent to a subscribing third party when a user's Feedback star level changes.
     * 						<br><br>
     * 						If subscribed to by a buyer or seller, and when applicable, this notification will appear in the <b>GetUser</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackStarChanged")
    FEEDBACK_STAR_CHANGED("FeedbackStarChanged"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when that buyer places a bid for an auction item.
     * 					  <br><br>
     * 						If subscribed to by a buyer and when applicable, this notification will appear in the <b>GetItem</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("BidPlaced")
    BID_PLACED("BidPlaced"),

    /**
     * 
     * 						This notification is sent to a subscribed seller each time a prospective buyer places a bid for the seller's auction item.
     * 						<br><br>
     * 						If subscribed to by a seller and when applicable, this notification will appear in the <b>GetItem</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("BidReceived")
    BID_RECEIVED("BidReceived"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer if that buyer is the winner of an auction item.
     * 						<br><br>
     * 						If subscribed to by a buyer and when applicable, this notification will appear in the <b>GetItem</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("ItemWon")
    ITEM_WON("ItemWon"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer if that buyer did not end up as the highest bidder for an auction item.
     * 						<br><br>
     * 						If subscribed to by a buyer and when applicable, this notification will appear in the <b>GetItem</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("ItemLost")
    ITEM_LOST("ItemLost"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when an auction listing ends with no winning bidder or when a fixed-price listing ends with no sale(s).
     * 						<br><br>
     * 						If subscribed to by a seller and when applicable, this notification will appear in the <b>GetItem</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("ItemUnsold")
    ITEM_UNSOLD("ItemUnsold"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when a seller makes a counter offer to the buyer's Best Offer on an item.
     * 						<br><br>
     * 						If subscribed to by a buyer and when applicable, this notification will appear in the <b>GetBestOffers</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("CounterOfferReceived")
    COUNTER_OFFER_RECEIVED("CounterOfferReceived"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when a seller declines the buyer's Best Offer on an item.
     * 						<br><br>
     * 						If subscribed to by a buyer and when applicable, this notification will appear in the <b>GetBestOffers</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferDeclined")
    BEST_OFFER_DECLINED("BestOfferDeclined"),

    /**
     * 
     * 						This notification is sent to a subscribed seller each time a prospective buyer places a Best Offer on an item.
     * 					
     * 
     */
    @XmlEnumValue("BestOfferPlaced")
    BEST_OFFER_PLACED("BestOfferPlaced"),

    /**
     * 
     * 						This notification is deprecated. Use <b>ItemAddedToWatchList</b> notification instead.
     * 					
     * 
     */
    @XmlEnumValue("AddToWatchList")
    ADD_TO_WATCH_LIST("AddToWatchList"),

    /**
     * 
     * 						This notification is deprecated. Use <b>BidPlaced</b>  notification instead.
     * 					
     * 
     */
    @XmlEnumValue("PlaceOffer")
    PLACE_OFFER("PlaceOffer"),

    /**
     * 
     * 						This notification is deprecated. Use <b>ItemRemovedFromWatchList</b> notification instead. ItemRemovedFromWatchList
     * 					
     * 
     */
    @XmlEnumValue("RemoveFromWatchList")
    REMOVE_FROM_WATCH_LIST("RemoveFromWatchList"),

    /**
     * 
     * 						This notification is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("AddToBidGroup")
    ADD_TO_BID_GROUP("AddToBidGroup"),

    /**
     * 
     * 						This notification is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("RemoveFromBidGroup")
    REMOVE_FROM_BID_GROUP("RemoveFromBidGroup"),

    /**
     * 
     * 						This notification is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ItemsCanceled")
    ITEMS_CANCELED("ItemsCanceled"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller if that user's authentication token is revoked.
     * 						<br><br>
     * 						If subscribed to by a buyer or seller, and when applicable, this notification will appear in the <b>GetTokenStatus</b> call response.
     * 					
     * 
     */
    @XmlEnumValue("TokenRevocation")
    TOKEN_REVOCATION("TokenRevocation"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when that seller's Bulk Data Exchange job completes.
     * 					
     * 
     */
    @XmlEnumValue("BulkDataExchangeJobCompleted")
    BULK_DATA_EXCHANGE_JOB_COMPLETED("BulkDataExchangeJobCompleted"),

    /**
     * 
     * 					  Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer and seller when that seller has marked an item as 'shipped'.
     * 					
     * 
     */
    @XmlEnumValue("ItemMarkedShipped")
    ITEM_MARKED_SHIPPED("ItemMarkedShipped"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer and seller when that seller has marked an order as 'paid'.
     * 					
     * 
     */
    @XmlEnumValue("ItemMarkedPaid")
    ITEM_MARKED_PAID("ItemMarkedPaid"),

    /**
     * 
     * 						This notification is sent to a subscribing buyer or seller when a response to the eBay Money Back Guarantee case is due from that user. When an eBay Money Back Guarantee case is opened, this notification is only sent to the seller involved in the case and not the buyer.<br><br>This notification is also sent to a subscribed seller when the buyer has opened up either of the following:<ul><li>an Item Not Received inquiry against an order line item</li><li>an Item Not Received case against that seller.</li></ul>
     * 		  		
     * 
     */
    @XmlEnumValue("EBPMyResponseDue")
    EBP_MY_RESPONSE_DUE("EBPMyResponseDue"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller when a response to the eBay Money Back Guarantee case is due from the other party in the case.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPOtherPartyResponseDue")
    EBP_OTHER_PARTY_RESPONSE_DUE("EBPOtherPartyResponseDue"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller when an eBay Money Back Guarantee case is escalated to eBay customer support.<br>This notification is also sent to a subscribed seller when an Item Not Received inquiry against an order line item has been escalated to an eBay Money Back Guarantee case.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPEscalatedCase")
    EBP_ESCALATED_CASE("EBPEscalatedCase"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller when the decision of an eBay Money Back Guarantee case is appealed.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPAppealedCase")
    EBP_APPEALED_CASE("EBPAppealedCase"),

    /**
     * 
     * 						This notification is sent to the subscribed seller when payment (to eBay or buyer) related to the outcome of an eBay Money Back Guarantee case is due.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPMyPaymentDue")
    EBP_MY_PAYMENT_DUE("EBPMyPaymentDue"),

    /**
     * 
     * 						This notification is sent to the subscribed seller when payment (to eBay or buyer) related to the outcome of an eBay Money Back Guarantee case is processed.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPPaymentDone")
    EBP_PAYMENT_DONE("EBPPaymentDone"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller when an appeal of an eBay Money Back Guarantee case decision has been closed.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPClosedAppeal")
    EBP_CLOSED_APPEAL("EBPClosedAppeal"),

    /**
     * 
     * 						This notification is sent to the subscribed buyer or seller when an eBay Money Back Guarantee case has been closed.<br><br>This notification can also be sent to the subscribed seller when the buyer has closed either of the following:<ul><li>an Item Not Received inquiry against an order line item</li><li>an Item Not Received case opened by that buyer</li></ul>
     * 		  		
     * 
     */
    @XmlEnumValue("EBPClosedCase")
    EBP_CLOSED_CASE("EBPClosedCase"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that user receives a high-priority message in InBox.
     * 						<br><br>
     * 						If subscribed to by a buyer or seller, and when applicable, this notification will appear in the <b>GetMyMessages</b> call response. For this notification to be returned in <b>GetMyMessages</b>, the <b>DetailLevel</b> value in the <b>GetMyMessages</b> request must be set to <code>ReturnMessages</code>.
     * 						<br><br>
     * 						<b>MyMessagesHighPriorityMessage</b>,  <b>MyMessagesM2MMessage</b>, and <b>MyMessagesHighPriorityMessageHeader</b> cannot
     * 						be subscribed to at the same time or specified in the same call.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesHighPriorityMessage")
    MY_MESSAGES_HIGH_PRIORITY_MESSAGE("MyMessagesHighPriorityMessage"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when that user receives a high-priority message in InBox.
     * 						<br><br>
     * 						If subscribed to by a buyer or seller, and when applicable, this notification will appear in the <b>GetMyMessages</b> call response. For this notification to be returned in <b>GetMyMessages</b>, the <b>DetailLevel</b> value in the <b>GetMyMessages</b> request must be set to <code>ReturnHeaders</code>.
     * 						<br><br>
     * 						<b>MyMessagesHighPriorityMessage</b>,  <b>MyMessagesM2MMessage</b>, and <b>MyMessagesHighPriorityMessageHeader</b> cannot
     * 						be subscribed to at the same time or specified in the same call.
     * 					
     * 
     */
    @XmlEnumValue("MyMessagesHighPriorityMessageHeader")
    MY_MESSAGES_HIGH_PRIORITY_MESSAGE_HEADER("MyMessagesHighPriorityMessageHeader"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when an eBay Money Back Guarantee case has been put on hold by eBay customer support.
     * 		  		
     * 
     */
    @XmlEnumValue("EBPOnHoldCase")
    EBP_ON_HOLD_CASE("EBPOnHoldCase"),

    /**
     * 
     * 						This notification is sent to a subscribed seller after the buyer's payment on an order has cleared.
     * 					
     * 
     */
    @XmlEnumValue("ReadyToShip")
    READY_TO_SHIP("ReadyToShip"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when eBay is prepared to send the seller's funds for an order that was previously placed on hold.
     * 					
     * 
     */
    @XmlEnumValue("ReadyForPayout")
    READY_FOR_PAYOUT("ReadyForPayout"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when the listing of the auction item where the buyer has an active bid is about
     * 						to end. This event has a <b>TimeLeft</b> property that defines the 'ending soon' threshold value.
     * 					
     * 
     */
    @XmlEnumValue("BidItemEndingSoon")
    BID_ITEM_ENDING_SOON("BidItemEndingSoon"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when an item in the buyer's shopping cart is about
     * 						to end. This event has a <b>TimeLeft</b> property that defines the 'ending soon' threshold value.
     * 					
     * 
     */
    @XmlEnumValue("ShoppingCartItemEndingSoon")
    SHOPPING_CART_ITEM_ENDING_SOON("ShoppingCartItemEndingSoon"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when a return request involving those users is created.
     * 					
     * 
     */
    @XmlEnumValue("ReturnCreated")
    RETURN_CREATED("ReturnCreated"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when a return request is waiting for information from the seller, like a Return Merchandise Authorization (RMA) number or a correct return address.
     * 					
     * 
     */
    @XmlEnumValue("ReturnWaitingForSellerInfo")
    RETURN_WAITING_FOR_SELLER_INFO("ReturnWaitingForSellerInfo"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when information from the seller (e.g. a Return Merchandise Authorization number) is overdue.
     * 					
     * 
     */
    @XmlEnumValue("ReturnSellerInfoOverdue")
    RETURN_SELLER_INFO_OVERDUE("ReturnSellerInfoOverdue"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when the buyer has shipped a return item back to the seller.
     * 					
     * 
     */
    @XmlEnumValue("ReturnShipped")
    RETURN_SHIPPED("ReturnShipped"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when a return item is received by the seller.
     * 					
     * 
     */
    @XmlEnumValue("ReturnDelivered")
    RETURN_DELIVERED("ReturnDelivered"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when a refund to the buyer is overdue on a return.
     * 					
     * 
     */
    @XmlEnumValue("ReturnRefundOverdue")
    RETURN_REFUND_OVERDUE("ReturnRefundOverdue"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when a return request is closed.
     * 					
     * 
     */
    @XmlEnumValue("ReturnClosed")
    RETURN_CLOSED("ReturnClosed"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer or seller when a return request is escalated into a eBay Money Back Guarantee case.
     * 					
     * 
     */
    @XmlEnumValue("ReturnEscalated")
    RETURN_ESCALATED("ReturnEscalated"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when a buyer has requested an order cancellation.
     * 					
     * 
     */
    @XmlEnumValue("BuyerCancelRequested")
    BUYER_CANCEL_REQUESTED("BuyerCancelRequested"),

    /**
     * 
     * 						This notification is no longer applicable. Do not use.
     * 					
     * 
     */
    @XmlEnumValue("UnmatchedPaymentReceived")
    UNMATCHED_PAYMENT_RECEIVED("UnmatchedPaymentReceived"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when a refund to the buyer has been successfully processed.
     * 					
     * 
     */
    @XmlEnumValue("RefundSuccess")
    REFUND_SUCCESS("RefundSuccess"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when a refund to the buyer has failed.
     * 					
     * 
     */
    @XmlEnumValue("RefundFailure")
    REFUND_FAILURE("RefundFailure"),

    /**
     * 
     * 						This event type has been deprecated along with legacy user disputes. As an alternative, subscribe to <b>EBPMyResponseDue</b> event type.
     * 					
     * 
     */
    @XmlEnumValue("OrderInquiryOpened")
    ORDER_INQUIRY_OPENED("OrderInquiryOpened"),

    /**
     * 
     * 						This notification is sent to a subscribed seller alerting the seller that the buyer will soon be eligible to escalate an Item Not Received inquiry into an eBay Money Back Guarantee case.
     * 					
     * 
     */
    @XmlEnumValue("OrderInquiryReminderForEscalation")
    ORDER_INQUIRY_REMINDER_FOR_ESCALATION("OrderInquiryReminderForEscalation"),

    /**
     * 
     * 						This event type has been deprecated along with legacy user disputes. 
     * 					
     * 
     */
    @XmlEnumValue("OrderInquiryProvideShipmentInformation")
    ORDER_INQUIRY_PROVIDE_SHIPMENT_INFORMATION("OrderInquiryProvideShipmentInformation"),

    /**
     * 
     * 						This event type has been deprecated along with legacy user disputes. As an alternative, subscribe to <b>EBPClosedCase</b> event type.
     * 					
     * 
     */
    @XmlEnumValue("OrderInquiryClosed")
    ORDER_INQUIRY_CLOSED("OrderInquiryClosed"),

    /**
     * 
     * 						This event type has been deprecated along with legacy user disputes. As an alternative, subscribe to <b>EBPEscalatedCase</b> event type.
     * 					
     * 
     */
    @XmlEnumValue("OrderInquiryEscalatedToCase")
    ORDER_INQUIRY_ESCALATED_TO_CASE("OrderInquiryEscalatedToCase"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer when an In-Store Pickup or Click and Collect order is ready to be picked up at the merchant's store.
     * 					
     * 
     */
    @XmlEnumValue("ItemReadyForPickup")
    ITEM_READY_FOR_PICKUP("ItemReadyForPickup"),

    /**
     * 
     * 						This notification is sent to a subscribed seller when the quantity of a multiple-quantity, Good 'Til Cancelled, fixed-price listing has reached '0'. This notification will only be sent if the seller has the out-of-stock feature turned on in My eBay Preferences.
     * 					
     * 
     */
    @XmlEnumValue("ItemOutOfStock")
    ITEM_OUT_OF_STOCK("ItemOutOfStock"),

    /**
     * 
     * 						This notification is sent to a subscribed seller if an eBay courier was unable to deliver an eBay Scheduled Delivery order to a buyer. This notification is only applicable for eBay Scheduled Delivery orders, which are only available in the London (UK) area.
     * 					
     * 
     */
    @XmlEnumValue("BuyerNoShow")
    BUYER_NO_SHOW("BuyerNoShow"),

    /**
     * 
     * 						This notification is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("WebnextMobilePhotoSync")
    WEBNEXT_MOBILE_PHOTO_SYNC("WebnextMobilePhotoSync"),

    /**
     * 
     * 						This notification is sent to a subscribed buyer if payment is still due for an order.
     * 					
     * 
     */
    @XmlEnumValue("PaymentReminder")
    PAYMENT_REMINDER("PaymentReminder"),

    /**
     * 
     *             This notification is sent to a subscribed seller if an eBay courier has picked up an eBay On Demand Delivery order from a store for delivery to a buyer. This notification is only applicable for eBay On Demand Delivery orders, which are only available in the London (UK) area.
     * 					
     * 
     */
    @XmlEnumValue("EBNOrderPickedUp")
    EBN_ORDER_PICKED_UP("EBNOrderPickedUp"),

    /**
     * 
     *             This notification is sent to a subscribed seller if an eBay On Demand Delivery order has been cancelled. This notification is only applicable for eBay On Demand Delivery orders, which are only available in the London (UK) area.
     * 					
     * 
     */
    @XmlEnumValue("EBNOrderCanceled")
    EBN_ORDER_CANCELED("EBNOrderCanceled"),

    /**
     * 
     *              This notification is sent to a subscribed buyer or seller if the status of a member-to-member message has changed.
     * 					
     * 
     */
    @XmlEnumValue("M2MMessageStatusChange")
    M_2_M_MESSAGE_STATUS_CHANGE("M2MMessageStatusChange");
    private final String value;

    NotificationEventTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationEventTypeCodeType fromValue(String v) {
        for (NotificationEventTypeCodeType c: NotificationEventTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
