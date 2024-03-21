
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Retrieves the specified user preferences for the authenticated caller.
 * 			
 * 
 * <p>Java class for GetUserPreferencesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserPreferencesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ShowBidderNoticePreferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowCombinedPaymentPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowCrossPromotionPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowSellerPaymentPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowEndOfAuctionEmailPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowSellerFavoriteItemPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowProStoresPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowEmailShipmentTrackingNumberPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowRequiredShipPhoneNumberPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowSellerExcludeShipToLocationPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowUnpaidItemAssistancePreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowPurchaseReminderEmailPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowUnpaidItemAssistanceExclusionList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowSellerProfilePreferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowSellerReturnPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowGlobalShippingProgramPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowDispatchCutoffTimePreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowGlobalShippingProgramListingPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowOverrideGSPServiceWithIntlServicePreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowPickupDropoffPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShowOutOfStockControlPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShoweBayPLUSPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserPreferencesRequestType", propOrder = {
    "showBidderNoticePreferences",
    "showCombinedPaymentPreferences",
    "showCrossPromotionPreferences",
    "showSellerPaymentPreferences",
    "showEndOfAuctionEmailPreferences",
    "showSellerFavoriteItemPreferences",
    "showProStoresPreferences",
    "showEmailShipmentTrackingNumberPreference",
    "showRequiredShipPhoneNumberPreference",
    "showSellerExcludeShipToLocationPreference",
    "showUnpaidItemAssistancePreference",
    "showPurchaseReminderEmailPreferences",
    "showUnpaidItemAssistanceExclusionList",
    "showSellerProfilePreferences",
    "showSellerReturnPreferences",
    "showGlobalShippingProgramPreference",
    "showDispatchCutoffTimePreferences",
    "showGlobalShippingProgramListingPreference",
    "showOverrideGSPServiceWithIntlServicePreference",
    "showPickupDropoffPreferences",
    "showOutOfStockControlPreference",
    "showeBayPLUSPreference"
})
public class GetUserPreferencesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShowBidderNoticePreferences")
    protected boolean showBidderNoticePreferences;
    @XmlElement(name = "ShowCombinedPaymentPreferences")
    protected boolean showCombinedPaymentPreferences;
    @XmlElement(name = "ShowCrossPromotionPreferences")
    protected boolean showCrossPromotionPreferences;
    @XmlElement(name = "ShowSellerPaymentPreferences")
    protected boolean showSellerPaymentPreferences;
    @XmlElement(name = "ShowEndOfAuctionEmailPreferences")
    protected Boolean showEndOfAuctionEmailPreferences;
    @XmlElement(name = "ShowSellerFavoriteItemPreferences")
    protected Boolean showSellerFavoriteItemPreferences;
    @XmlElement(name = "ShowProStoresPreferences")
    protected Boolean showProStoresPreferences;
    @XmlElement(name = "ShowEmailShipmentTrackingNumberPreference")
    protected Boolean showEmailShipmentTrackingNumberPreference;
    @XmlElement(name = "ShowRequiredShipPhoneNumberPreference")
    protected Boolean showRequiredShipPhoneNumberPreference;
    @XmlElement(name = "ShowSellerExcludeShipToLocationPreference")
    protected Boolean showSellerExcludeShipToLocationPreference;
    @XmlElement(name = "ShowUnpaidItemAssistancePreference")
    protected Boolean showUnpaidItemAssistancePreference;
    @XmlElement(name = "ShowPurchaseReminderEmailPreferences")
    protected Boolean showPurchaseReminderEmailPreferences;
    @XmlElement(name = "ShowUnpaidItemAssistanceExclusionList")
    protected Boolean showUnpaidItemAssistanceExclusionList;
    @XmlElement(name = "ShowSellerProfilePreferences")
    protected boolean showSellerProfilePreferences;
    @XmlElement(name = "ShowSellerReturnPreferences")
    protected Boolean showSellerReturnPreferences;
    @XmlElement(name = "ShowGlobalShippingProgramPreference")
    protected Boolean showGlobalShippingProgramPreference;
    @XmlElement(name = "ShowDispatchCutoffTimePreferences")
    protected Boolean showDispatchCutoffTimePreferences;
    @XmlElement(name = "ShowGlobalShippingProgramListingPreference")
    protected Boolean showGlobalShippingProgramListingPreference;
    @XmlElement(name = "ShowOverrideGSPServiceWithIntlServicePreference")
    protected Boolean showOverrideGSPServiceWithIntlServicePreference;
    @XmlElement(name = "ShowPickupDropoffPreferences")
    protected Boolean showPickupDropoffPreferences;
    @XmlElement(name = "ShowOutOfStockControlPreference")
    protected Boolean showOutOfStockControlPreference;
    @XmlElement(name = "ShoweBayPLUSPreference")
    protected Boolean showeBayPLUSPreference;

    /**
     * Gets the value of the showBidderNoticePreferences property.
     * 
     */
    public boolean isShowBidderNoticePreferences() {
        return showBidderNoticePreferences;
    }

    /**
     * Sets the value of the showBidderNoticePreferences property.
     * 
     */
    public void setShowBidderNoticePreferences(boolean value) {
        this.showBidderNoticePreferences = value;
    }

    /**
     * Gets the value of the showCombinedPaymentPreferences property.
     * 
     */
    public boolean isShowCombinedPaymentPreferences() {
        return showCombinedPaymentPreferences;
    }

    /**
     * Sets the value of the showCombinedPaymentPreferences property.
     * 
     */
    public void setShowCombinedPaymentPreferences(boolean value) {
        this.showCombinedPaymentPreferences = value;
    }

    /**
     * Gets the value of the showCrossPromotionPreferences property.
     * 
     */
    public boolean isShowCrossPromotionPreferences() {
        return showCrossPromotionPreferences;
    }

    /**
     * Sets the value of the showCrossPromotionPreferences property.
     * 
     */
    public void setShowCrossPromotionPreferences(boolean value) {
        this.showCrossPromotionPreferences = value;
    }

    /**
     * Gets the value of the showSellerPaymentPreferences property.
     * 
     */
    public boolean isShowSellerPaymentPreferences() {
        return showSellerPaymentPreferences;
    }

    /**
     * Sets the value of the showSellerPaymentPreferences property.
     * 
     */
    public void setShowSellerPaymentPreferences(boolean value) {
        this.showSellerPaymentPreferences = value;
    }

    /**
     * Gets the value of the showEndOfAuctionEmailPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowEndOfAuctionEmailPreferences() {
        return showEndOfAuctionEmailPreferences;
    }

    /**
     * Sets the value of the showEndOfAuctionEmailPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEndOfAuctionEmailPreferences(Boolean value) {
        this.showEndOfAuctionEmailPreferences = value;
    }

    /**
     * Gets the value of the showSellerFavoriteItemPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSellerFavoriteItemPreferences() {
        return showSellerFavoriteItemPreferences;
    }

    /**
     * Sets the value of the showSellerFavoriteItemPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSellerFavoriteItemPreferences(Boolean value) {
        this.showSellerFavoriteItemPreferences = value;
    }

    /**
     * Gets the value of the showProStoresPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowProStoresPreferences() {
        return showProStoresPreferences;
    }

    /**
     * Sets the value of the showProStoresPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowProStoresPreferences(Boolean value) {
        this.showProStoresPreferences = value;
    }

    /**
     * Gets the value of the showEmailShipmentTrackingNumberPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowEmailShipmentTrackingNumberPreference() {
        return showEmailShipmentTrackingNumberPreference;
    }

    /**
     * Sets the value of the showEmailShipmentTrackingNumberPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEmailShipmentTrackingNumberPreference(Boolean value) {
        this.showEmailShipmentTrackingNumberPreference = value;
    }

    /**
     * Gets the value of the showRequiredShipPhoneNumberPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowRequiredShipPhoneNumberPreference() {
        return showRequiredShipPhoneNumberPreference;
    }

    /**
     * Sets the value of the showRequiredShipPhoneNumberPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowRequiredShipPhoneNumberPreference(Boolean value) {
        this.showRequiredShipPhoneNumberPreference = value;
    }

    /**
     * Gets the value of the showSellerExcludeShipToLocationPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSellerExcludeShipToLocationPreference() {
        return showSellerExcludeShipToLocationPreference;
    }

    /**
     * Sets the value of the showSellerExcludeShipToLocationPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSellerExcludeShipToLocationPreference(Boolean value) {
        this.showSellerExcludeShipToLocationPreference = value;
    }

    /**
     * Gets the value of the showUnpaidItemAssistancePreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowUnpaidItemAssistancePreference() {
        return showUnpaidItemAssistancePreference;
    }

    /**
     * Sets the value of the showUnpaidItemAssistancePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowUnpaidItemAssistancePreference(Boolean value) {
        this.showUnpaidItemAssistancePreference = value;
    }

    /**
     * Gets the value of the showPurchaseReminderEmailPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPurchaseReminderEmailPreferences() {
        return showPurchaseReminderEmailPreferences;
    }

    /**
     * Sets the value of the showPurchaseReminderEmailPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPurchaseReminderEmailPreferences(Boolean value) {
        this.showPurchaseReminderEmailPreferences = value;
    }

    /**
     * Gets the value of the showUnpaidItemAssistanceExclusionList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowUnpaidItemAssistanceExclusionList() {
        return showUnpaidItemAssistanceExclusionList;
    }

    /**
     * Sets the value of the showUnpaidItemAssistanceExclusionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowUnpaidItemAssistanceExclusionList(Boolean value) {
        this.showUnpaidItemAssistanceExclusionList = value;
    }

    /**
     * Gets the value of the showSellerProfilePreferences property.
     * 
     */
    public boolean isShowSellerProfilePreferences() {
        return showSellerProfilePreferences;
    }

    /**
     * Sets the value of the showSellerProfilePreferences property.
     * 
     */
    public void setShowSellerProfilePreferences(boolean value) {
        this.showSellerProfilePreferences = value;
    }

    /**
     * Gets the value of the showSellerReturnPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSellerReturnPreferences() {
        return showSellerReturnPreferences;
    }

    /**
     * Sets the value of the showSellerReturnPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSellerReturnPreferences(Boolean value) {
        this.showSellerReturnPreferences = value;
    }

    /**
     * Gets the value of the showGlobalShippingProgramPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowGlobalShippingProgramPreference() {
        return showGlobalShippingProgramPreference;
    }

    /**
     * Sets the value of the showGlobalShippingProgramPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowGlobalShippingProgramPreference(Boolean value) {
        this.showGlobalShippingProgramPreference = value;
    }

    /**
     * Gets the value of the showDispatchCutoffTimePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowDispatchCutoffTimePreferences() {
        return showDispatchCutoffTimePreferences;
    }

    /**
     * Sets the value of the showDispatchCutoffTimePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDispatchCutoffTimePreferences(Boolean value) {
        this.showDispatchCutoffTimePreferences = value;
    }

    /**
     * Gets the value of the showGlobalShippingProgramListingPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowGlobalShippingProgramListingPreference() {
        return showGlobalShippingProgramListingPreference;
    }

    /**
     * Sets the value of the showGlobalShippingProgramListingPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowGlobalShippingProgramListingPreference(Boolean value) {
        this.showGlobalShippingProgramListingPreference = value;
    }

    /**
     * Gets the value of the showOverrideGSPServiceWithIntlServicePreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOverrideGSPServiceWithIntlServicePreference() {
        return showOverrideGSPServiceWithIntlServicePreference;
    }

    /**
     * Sets the value of the showOverrideGSPServiceWithIntlServicePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOverrideGSPServiceWithIntlServicePreference(Boolean value) {
        this.showOverrideGSPServiceWithIntlServicePreference = value;
    }

    /**
     * Gets the value of the showPickupDropoffPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowPickupDropoffPreferences() {
        return showPickupDropoffPreferences;
    }

    /**
     * Sets the value of the showPickupDropoffPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowPickupDropoffPreferences(Boolean value) {
        this.showPickupDropoffPreferences = value;
    }

    /**
     * Gets the value of the showOutOfStockControlPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowOutOfStockControlPreference() {
        return showOutOfStockControlPreference;
    }

    /**
     * Sets the value of the showOutOfStockControlPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowOutOfStockControlPreference(Boolean value) {
        this.showOutOfStockControlPreference = value;
    }

    /**
     * Gets the value of the showeBayPLUSPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShoweBayPLUSPreference() {
        return showeBayPLUSPreference;
    }

    /**
     * Sets the value of the showeBayPLUSPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShoweBayPLUSPreference(Boolean value) {
        this.showeBayPLUSPreference = value;
    }

}
