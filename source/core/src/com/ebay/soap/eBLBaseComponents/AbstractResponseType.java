
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Base type definition of a response payload that can carry any
 * 				type of payload content with following optional elements:
 * 				<ul>
 * 					<li>timestamp of response message</li>
 * 					<li>application-level acknowledgement</li>
 * 					<li>application-level (business-level) errors and warnings</li>
 * 				</ul>
 * 			
 * 
 * <p>Java class for AbstractResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Ack" type="{urn:ebay:apis:eBLBaseComponents}AckCodeType" minOccurs="0"/>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Errors" type="{urn:ebay:apis:eBLBaseComponents}ErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Build" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationEventName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DuplicateInvocationDetails" type="{urn:ebay:apis:eBLBaseComponents}DuplicateInvocationDetailsType" minOccurs="0"/>
 *         &lt;element name="RecipientUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EIASToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardExpirationWarning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BotBlock" type="{urn:ebay:apis:eBLBaseComponents}BotBlockResponseType" minOccurs="0"/>
 *         &lt;element name="ExternalUserData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResponseType", propOrder = {
    "timestamp",
    "ack",
    "correlationID",
    "errors",
    "message",
    "version",
    "build",
    "notificationEventName",
    "duplicateInvocationDetails",
    "recipientUserID",
    "eiasToken",
    "notificationSignature",
    "hardExpirationWarning",
    "botBlock",
    "externalUserData",
    "any"
})
@XmlSeeAlso({
    GeteBayDetailsResponseType.class,
    EndFixedPriceItemResponseType.class,
    AddToItemDescriptionResponseType.class,
    GetAdFormatLeadsResponseType.class,
    GetMyeBayBuyingResponseType.class,
    VerifyAddFixedPriceItemResponseType.class,
    GetShippingDiscountProfilesResponseType.class,
    GetAccountResponseType.class,
    GetUserPreferencesResponseType.class,
    SendInvoiceResponseType.class,
    ReviseMyMessagesFoldersResponseType.class,
    ReviseInventoryStatusResponseType.class,
    GetFeedbackResponseType.class,
    SetUserNotesResponseType.class,
    AddMemberMessageRTQResponseType.class,
    RevokeTokenResponseType.class,
    AddItemsResponseType.class,
    PlaceOfferResponseType.class,
    GetSellerListResponseType.class,
    ConfirmIdentityResponseType.class,
    ValidateChallengeInputResponseType.class,
    GetMyeBaySellingResponseType.class,
    ValidateTestUserRegistrationResponseType.class,
    GetSellerEventsResponseType.class,
    GetSessionIDResponseType.class,
    AddFixedPriceItemResponseType.class,
    GetStoreResponseType.class,
    GetAllBiddersResponseType.class,
    AddSecondChanceItemResponseType.class,
    SetMessagePreferencesResponseType.class,
    ExtendSiteHostedPicturesResponseType.class,
    GetTokenStatusResponseType.class,
    EndItemResponseType.class,
    RemoveFromWatchListResponseType.class,
    GetVeROReasonCodeDetailsResponseType.class,
    GetMyMessagesResponseType.class,
    CompleteSaleResponseType.class,
    FetchTokenResponseType.class,
    GetItemTransactionsResponseType.class,
    SetStoreCategoriesResponseType.class,
    GetBestOffersResponseType.class,
    RelistFixedPriceItemResponseType.class,
    GetStoreCategoryUpdateStatusResponseType.class,
    AddToWatchListResponseType.class,
    GetItemShippingResponseType.class,
    GetNotificationsUsageResponseType.class,
    GetVeROReportStatusResponseType.class,
    SetUserPreferencesResponseType.class,
    AddMemberMessagesAAQToBidderResponseType.class,
    VerifyRelistItemResponseType.class,
    GetItemResponseType.class,
    GetUserContactDetailsResponseType.class,
    SetTaxTableResponseType.class,
    ReviseFixedPriceItemResponseType.class,
    VeROReportItemsResponseType.class,
    GetBidderListResponseType.class,
    GetNotificationPreferencesResponseType.class,
    VerifyAddSecondChanceItemResponseType.class,
    AddMemberMessageAAQToPartnerResponseType.class,
    GetOrdersResponseType.class,
    SetNotificationPreferencesResponseType.class,
    ReviseMyMessagesResponseType.class,
    RespondToBestOfferResponseType.class,
    DeleteMyMessagesResponseType.class,
    UploadSiteHostedPicturesResponseType.class,
    GetItemsAwaitingFeedbackResponseType.class,
    RelistItemResponseType.class,
    GetCategoryFeaturesResponseType.class,
    GetCategoriesResponseType.class,
    GetTaxTableResponseType.class,
    EndItemsResponseType.class,
    GeteBayOfficialTimeResponseType.class,
    VerifyAddItemResponseType.class,
    GetMemberMessagesResponseType.class,
    SetShippingDiscountProfilesResponseType.class,
    NotificationMessageType.class,
    GetCategoryMappingsResponseType.class,
    AddOrderResponseType.class,
    GetMessagePreferencesResponseType.class,
    ReviseItemResponseType.class,
    GetChallengeTokenResponseType.class,
    AddItemResponseType.class,
    GetSellerTransactionsResponseType.class,
    GetDescriptionTemplatesResponseType.class,
    LeaveFeedbackResponseType.class,
    GetUserResponseType.class,
    RespondToFeedbackResponseType.class
})
public abstract class AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Timestamp", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar timestamp;
    @XmlElement(name = "Ack")
    protected AckCodeType ack;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "Errors")
    protected List<ErrorType> errors;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Build")
    protected String build;
    @XmlElement(name = "NotificationEventName")
    protected String notificationEventName;
    @XmlElement(name = "DuplicateInvocationDetails")
    protected DuplicateInvocationDetailsType duplicateInvocationDetails;
    @XmlElement(name = "RecipientUserID")
    protected String recipientUserID;
    @XmlElement(name = "EIASToken")
    protected String eiasToken;
    @XmlElement(name = "NotificationSignature")
    protected String notificationSignature;
    @XmlElement(name = "HardExpirationWarning")
    protected String hardExpirationWarning;
    @XmlElement(name = "BotBlock")
    protected BotBlockResponseType botBlock;
    @XmlElement(name = "ExternalUserData")
    protected String externalUserData;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(Calendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link AckCodeType }
     *     
     */
    public AckCodeType getAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link AckCodeType }
     *     
     */
    public void setAck(AckCodeType value) {
        this.ack = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ErrorType }
     *     
     */
    public ErrorType[] getErrors() {
        if (this.errors == null) {
            return new ErrorType[ 0 ] ;
        }
        return ((ErrorType[]) this.errors.toArray(new ErrorType[this.errors.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ErrorType }
     *     
     */
    public ErrorType getErrors(int idx) {
        if (this.errors == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.errors.get(idx);
    }

    public int getErrorsLength() {
        if (this.errors == null) {
            return  0;
        }
        return this.errors.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ErrorType }
     *     
     */
    public void setErrors(ErrorType[] values) {
        this._getErrors().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.errors.add(values[i]);
        }
    }

    protected List<ErrorType> _getErrors() {
        if (errors == null) {
            errors = new ArrayList<ErrorType>();
        }
        return errors;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType setErrors(int idx, ErrorType value) {
        return this.errors.set(idx, value);
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuild(String value) {
        this.build = value;
    }

    /**
     * Gets the value of the notificationEventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEventName() {
        return notificationEventName;
    }

    /**
     * Sets the value of the notificationEventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEventName(String value) {
        this.notificationEventName = value;
    }

    /**
     * Gets the value of the duplicateInvocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DuplicateInvocationDetailsType }
     *     
     */
    public DuplicateInvocationDetailsType getDuplicateInvocationDetails() {
        return duplicateInvocationDetails;
    }

    /**
     * Sets the value of the duplicateInvocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplicateInvocationDetailsType }
     *     
     */
    public void setDuplicateInvocationDetails(DuplicateInvocationDetailsType value) {
        this.duplicateInvocationDetails = value;
    }

    /**
     * Gets the value of the recipientUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientUserID() {
        return recipientUserID;
    }

    /**
     * Sets the value of the recipientUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientUserID(String value) {
        this.recipientUserID = value;
    }

    /**
     * Gets the value of the eiasToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIASToken() {
        return eiasToken;
    }

    /**
     * Sets the value of the eiasToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIASToken(String value) {
        this.eiasToken = value;
    }

    /**
     * Gets the value of the notificationSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationSignature() {
        return notificationSignature;
    }

    /**
     * Sets the value of the notificationSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationSignature(String value) {
        this.notificationSignature = value;
    }

    /**
     * Gets the value of the hardExpirationWarning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardExpirationWarning() {
        return hardExpirationWarning;
    }

    /**
     * Sets the value of the hardExpirationWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardExpirationWarning(String value) {
        this.hardExpirationWarning = value;
    }

    /**
     * Gets the value of the botBlock property.
     * 
     * @return
     *     possible object is
     *     {@link BotBlockResponseType }
     *     
     */
    public BotBlockResponseType getBotBlock() {
        return botBlock;
    }

    /**
     * Sets the value of the botBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BotBlockResponseType }
     *     
     */
    public void setBotBlock(BotBlockResponseType value) {
        this.botBlock = value;
    }

    /**
     * Gets the value of the externalUserData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUserData() {
        return externalUserData;
    }

    /**
     * Sets the value of the externalUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUserData(String value) {
        this.externalUserData = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
