
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains some or all of the authenticated user's preferences. The preferences are
 * 				grouped in sets and are returned according to the flag settings in the request.
 * 			
 * 
 * <p>Java class for GetUserPreferencesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserPreferencesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="BidderNoticePreferences" type="{urn:ebay:apis:eBLBaseComponents}BidderNoticePreferencesType" minOccurs="0"/>
 *         &lt;element name="CombinedPaymentPreferences" type="{urn:ebay:apis:eBLBaseComponents}CombinedPaymentPreferencesType" minOccurs="0"/>
 *         &lt;element name="CrossPromotionPreferences" type="{urn:ebay:apis:eBLBaseComponents}CrossPromotionPreferencesType" minOccurs="0"/>
 *         &lt;element name="SellerPaymentPreferences" type="{urn:ebay:apis:eBLBaseComponents}SellerPaymentPreferencesType" minOccurs="0"/>
 *         &lt;element name="SellerFavoriteItemPreferences" type="{urn:ebay:apis:eBLBaseComponents}SellerFavoriteItemPreferencesType" minOccurs="0"/>
 *         &lt;element name="EndOfAuctionEmailPreferences" type="{urn:ebay:apis:eBLBaseComponents}EndOfAuctionEmailPreferencesType" minOccurs="0"/>
 *         &lt;element name="EmailShipmentTrackingNumberPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RequiredShipPhoneNumberPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProStoresPreference" type="{urn:ebay:apis:eBLBaseComponents}ProStoresCheckoutPreferenceType" minOccurs="0"/>
 *         &lt;element name="UnpaidItemAssistancePreferences" type="{urn:ebay:apis:eBLBaseComponents}UnpaidItemAssistancePreferencesType" minOccurs="0"/>
 *         &lt;element name="SellerExcludeShipToLocationPreferences" type="{urn:ebay:apis:eBLBaseComponents}SellerExcludeShipToLocationPreferencesType" minOccurs="0"/>
 *         &lt;element name="PurchaseReminderEmailPreferences" type="{urn:ebay:apis:eBLBaseComponents}PurchaseReminderEmailPreferencesType" minOccurs="0"/>
 *         &lt;element name="SellerThirdPartyCheckoutDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellerProfilePreferences" type="{urn:ebay:apis:eBLBaseComponents}SellerProfilePreferencesType" minOccurs="0"/>
 *         &lt;element name="SellerReturnPreferences" type="{urn:ebay:apis:eBLBaseComponents}SellerReturnPreferencesType" minOccurs="0"/>
 *         &lt;element name="OfferGlobalShippingProgramPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DispatchCutoffTimePreference" type="{urn:ebay:apis:eBLBaseComponents}DispatchCutoffTimePreferencesType" minOccurs="0"/>
 *         &lt;element name="GlobalShippingProgramListingPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideGSPServiceWithIntlServicePreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PickupDropoffSellerPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OutOfStockControlPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayPLUSPreference" type="{urn:ebay:apis:eBLBaseComponents}EBayPLUSPreferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserPreferencesResponseType", propOrder = {
    "bidderNoticePreferences",
    "combinedPaymentPreferences",
    "crossPromotionPreferences",
    "sellerPaymentPreferences",
    "sellerFavoriteItemPreferences",
    "endOfAuctionEmailPreferences",
    "emailShipmentTrackingNumberPreference",
    "requiredShipPhoneNumberPreference",
    "proStoresPreference",
    "unpaidItemAssistancePreferences",
    "sellerExcludeShipToLocationPreferences",
    "purchaseReminderEmailPreferences",
    "sellerThirdPartyCheckoutDisabled",
    "sellerProfilePreferences",
    "sellerReturnPreferences",
    "offerGlobalShippingProgramPreference",
    "dispatchCutoffTimePreference",
    "globalShippingProgramListingPreference",
    "overrideGSPServiceWithIntlServicePreference",
    "pickupDropoffSellerPreference",
    "outOfStockControlPreference",
    "eBayPLUSPreference"
})
public class GetUserPreferencesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BidderNoticePreferences")
    protected BidderNoticePreferencesType bidderNoticePreferences;
    @XmlElement(name = "CombinedPaymentPreferences")
    protected CombinedPaymentPreferencesType combinedPaymentPreferences;
    @XmlElement(name = "CrossPromotionPreferences")
    protected CrossPromotionPreferencesType crossPromotionPreferences;
    @XmlElement(name = "SellerPaymentPreferences")
    protected SellerPaymentPreferencesType sellerPaymentPreferences;
    @XmlElement(name = "SellerFavoriteItemPreferences")
    protected SellerFavoriteItemPreferencesType sellerFavoriteItemPreferences;
    @XmlElement(name = "EndOfAuctionEmailPreferences")
    protected EndOfAuctionEmailPreferencesType endOfAuctionEmailPreferences;
    @XmlElement(name = "EmailShipmentTrackingNumberPreference")
    protected Boolean emailShipmentTrackingNumberPreference;
    @XmlElement(name = "RequiredShipPhoneNumberPreference")
    protected Boolean requiredShipPhoneNumberPreference;
    @XmlElement(name = "ProStoresPreference")
    protected ProStoresCheckoutPreferenceType proStoresPreference;
    @XmlElement(name = "UnpaidItemAssistancePreferences")
    protected UnpaidItemAssistancePreferencesType unpaidItemAssistancePreferences;
    @XmlElement(name = "SellerExcludeShipToLocationPreferences")
    protected SellerExcludeShipToLocationPreferencesType sellerExcludeShipToLocationPreferences;
    @XmlElement(name = "PurchaseReminderEmailPreferences")
    protected PurchaseReminderEmailPreferencesType purchaseReminderEmailPreferences;
    @XmlElement(name = "SellerThirdPartyCheckoutDisabled")
    protected Boolean sellerThirdPartyCheckoutDisabled;
    @XmlElement(name = "SellerProfilePreferences")
    protected SellerProfilePreferencesType sellerProfilePreferences;
    @XmlElement(name = "SellerReturnPreferences")
    protected SellerReturnPreferencesType sellerReturnPreferences;
    @XmlElement(name = "OfferGlobalShippingProgramPreference")
    protected Boolean offerGlobalShippingProgramPreference;
    @XmlElement(name = "DispatchCutoffTimePreference")
    protected DispatchCutoffTimePreferencesType dispatchCutoffTimePreference;
    @XmlElement(name = "GlobalShippingProgramListingPreference")
    protected Boolean globalShippingProgramListingPreference;
    @XmlElement(name = "OverrideGSPServiceWithIntlServicePreference")
    protected Boolean overrideGSPServiceWithIntlServicePreference;
    @XmlElement(name = "PickupDropoffSellerPreference")
    protected Boolean pickupDropoffSellerPreference;
    @XmlElement(name = "OutOfStockControlPreference")
    protected Boolean outOfStockControlPreference;
    protected List<EBayPLUSPreferenceType> eBayPLUSPreference;

    /**
     * Gets the value of the bidderNoticePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link BidderNoticePreferencesType }
     *     
     */
    public BidderNoticePreferencesType getBidderNoticePreferences() {
        return bidderNoticePreferences;
    }

    /**
     * Sets the value of the bidderNoticePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidderNoticePreferencesType }
     *     
     */
    public void setBidderNoticePreferences(BidderNoticePreferencesType value) {
        this.bidderNoticePreferences = value;
    }

    /**
     * Gets the value of the combinedPaymentPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link CombinedPaymentPreferencesType }
     *     
     */
    public CombinedPaymentPreferencesType getCombinedPaymentPreferences() {
        return combinedPaymentPreferences;
    }

    /**
     * Sets the value of the combinedPaymentPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinedPaymentPreferencesType }
     *     
     */
    public void setCombinedPaymentPreferences(CombinedPaymentPreferencesType value) {
        this.combinedPaymentPreferences = value;
    }

    /**
     * Gets the value of the crossPromotionPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link CrossPromotionPreferencesType }
     *     
     */
    public CrossPromotionPreferencesType getCrossPromotionPreferences() {
        return crossPromotionPreferences;
    }

    /**
     * Sets the value of the crossPromotionPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossPromotionPreferencesType }
     *     
     */
    public void setCrossPromotionPreferences(CrossPromotionPreferencesType value) {
        this.crossPromotionPreferences = value;
    }

    /**
     * Gets the value of the sellerPaymentPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link SellerPaymentPreferencesType }
     *     
     */
    public SellerPaymentPreferencesType getSellerPaymentPreferences() {
        return sellerPaymentPreferences;
    }

    /**
     * Sets the value of the sellerPaymentPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPaymentPreferencesType }
     *     
     */
    public void setSellerPaymentPreferences(SellerPaymentPreferencesType value) {
        this.sellerPaymentPreferences = value;
    }

    /**
     * Gets the value of the sellerFavoriteItemPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link SellerFavoriteItemPreferencesType }
     *     
     */
    public SellerFavoriteItemPreferencesType getSellerFavoriteItemPreferences() {
        return sellerFavoriteItemPreferences;
    }

    /**
     * Sets the value of the sellerFavoriteItemPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerFavoriteItemPreferencesType }
     *     
     */
    public void setSellerFavoriteItemPreferences(SellerFavoriteItemPreferencesType value) {
        this.sellerFavoriteItemPreferences = value;
    }

    /**
     * Gets the value of the endOfAuctionEmailPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link EndOfAuctionEmailPreferencesType }
     *     
     */
    public EndOfAuctionEmailPreferencesType getEndOfAuctionEmailPreferences() {
        return endOfAuctionEmailPreferences;
    }

    /**
     * Sets the value of the endOfAuctionEmailPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndOfAuctionEmailPreferencesType }
     *     
     */
    public void setEndOfAuctionEmailPreferences(EndOfAuctionEmailPreferencesType value) {
        this.endOfAuctionEmailPreferences = value;
    }

    /**
     * Gets the value of the emailShipmentTrackingNumberPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailShipmentTrackingNumberPreference() {
        return emailShipmentTrackingNumberPreference;
    }

    /**
     * Sets the value of the emailShipmentTrackingNumberPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailShipmentTrackingNumberPreference(Boolean value) {
        this.emailShipmentTrackingNumberPreference = value;
    }

    /**
     * Gets the value of the requiredShipPhoneNumberPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredShipPhoneNumberPreference() {
        return requiredShipPhoneNumberPreference;
    }

    /**
     * Sets the value of the requiredShipPhoneNumberPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredShipPhoneNumberPreference(Boolean value) {
        this.requiredShipPhoneNumberPreference = value;
    }

    /**
     * Gets the value of the proStoresPreference property.
     * 
     * @return
     *     possible object is
     *     {@link ProStoresCheckoutPreferenceType }
     *     
     */
    public ProStoresCheckoutPreferenceType getProStoresPreference() {
        return proStoresPreference;
    }

    /**
     * Sets the value of the proStoresPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProStoresCheckoutPreferenceType }
     *     
     */
    public void setProStoresPreference(ProStoresCheckoutPreferenceType value) {
        this.proStoresPreference = value;
    }

    /**
     * Gets the value of the unpaidItemAssistancePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link UnpaidItemAssistancePreferencesType }
     *     
     */
    public UnpaidItemAssistancePreferencesType getUnpaidItemAssistancePreferences() {
        return unpaidItemAssistancePreferences;
    }

    /**
     * Sets the value of the unpaidItemAssistancePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpaidItemAssistancePreferencesType }
     *     
     */
    public void setUnpaidItemAssistancePreferences(UnpaidItemAssistancePreferencesType value) {
        this.unpaidItemAssistancePreferences = value;
    }

    /**
     * Gets the value of the sellerExcludeShipToLocationPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link SellerExcludeShipToLocationPreferencesType }
     *     
     */
    public SellerExcludeShipToLocationPreferencesType getSellerExcludeShipToLocationPreferences() {
        return sellerExcludeShipToLocationPreferences;
    }

    /**
     * Sets the value of the sellerExcludeShipToLocationPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerExcludeShipToLocationPreferencesType }
     *     
     */
    public void setSellerExcludeShipToLocationPreferences(SellerExcludeShipToLocationPreferencesType value) {
        this.sellerExcludeShipToLocationPreferences = value;
    }

    /**
     * Gets the value of the purchaseReminderEmailPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseReminderEmailPreferencesType }
     *     
     */
    public PurchaseReminderEmailPreferencesType getPurchaseReminderEmailPreferences() {
        return purchaseReminderEmailPreferences;
    }

    /**
     * Sets the value of the purchaseReminderEmailPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseReminderEmailPreferencesType }
     *     
     */
    public void setPurchaseReminderEmailPreferences(PurchaseReminderEmailPreferencesType value) {
        this.purchaseReminderEmailPreferences = value;
    }

    /**
     * Gets the value of the sellerThirdPartyCheckoutDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerThirdPartyCheckoutDisabled() {
        return sellerThirdPartyCheckoutDisabled;
    }

    /**
     * Sets the value of the sellerThirdPartyCheckoutDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerThirdPartyCheckoutDisabled(Boolean value) {
        this.sellerThirdPartyCheckoutDisabled = value;
    }

    /**
     * Gets the value of the sellerProfilePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link SellerProfilePreferencesType }
     *     
     */
    public SellerProfilePreferencesType getSellerProfilePreferences() {
        return sellerProfilePreferences;
    }

    /**
     * Sets the value of the sellerProfilePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerProfilePreferencesType }
     *     
     */
    public void setSellerProfilePreferences(SellerProfilePreferencesType value) {
        this.sellerProfilePreferences = value;
    }

    /**
     * Gets the value of the sellerReturnPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link SellerReturnPreferencesType }
     *     
     */
    public SellerReturnPreferencesType getSellerReturnPreferences() {
        return sellerReturnPreferences;
    }

    /**
     * Sets the value of the sellerReturnPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerReturnPreferencesType }
     *     
     */
    public void setSellerReturnPreferences(SellerReturnPreferencesType value) {
        this.sellerReturnPreferences = value;
    }

    /**
     * Gets the value of the offerGlobalShippingProgramPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferGlobalShippingProgramPreference() {
        return offerGlobalShippingProgramPreference;
    }

    /**
     * Sets the value of the offerGlobalShippingProgramPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferGlobalShippingProgramPreference(Boolean value) {
        this.offerGlobalShippingProgramPreference = value;
    }

    /**
     * Gets the value of the dispatchCutoffTimePreference property.
     * 
     * @return
     *     possible object is
     *     {@link DispatchCutoffTimePreferencesType }
     *     
     */
    public DispatchCutoffTimePreferencesType getDispatchCutoffTimePreference() {
        return dispatchCutoffTimePreference;
    }

    /**
     * Sets the value of the dispatchCutoffTimePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispatchCutoffTimePreferencesType }
     *     
     */
    public void setDispatchCutoffTimePreference(DispatchCutoffTimePreferencesType value) {
        this.dispatchCutoffTimePreference = value;
    }

    /**
     * Gets the value of the globalShippingProgramListingPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalShippingProgramListingPreference() {
        return globalShippingProgramListingPreference;
    }

    /**
     * Sets the value of the globalShippingProgramListingPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalShippingProgramListingPreference(Boolean value) {
        this.globalShippingProgramListingPreference = value;
    }

    /**
     * Gets the value of the overrideGSPServiceWithIntlServicePreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideGSPServiceWithIntlServicePreference() {
        return overrideGSPServiceWithIntlServicePreference;
    }

    /**
     * Sets the value of the overrideGSPServiceWithIntlServicePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideGSPServiceWithIntlServicePreference(Boolean value) {
        this.overrideGSPServiceWithIntlServicePreference = value;
    }

    /**
     * Gets the value of the pickupDropoffSellerPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPickupDropoffSellerPreference() {
        return pickupDropoffSellerPreference;
    }

    /**
     * Sets the value of the pickupDropoffSellerPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupDropoffSellerPreference(Boolean value) {
        this.pickupDropoffSellerPreference = value;
    }

    /**
     * Gets the value of the outOfStockControlPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutOfStockControlPreference() {
        return outOfStockControlPreference;
    }

    /**
     * Sets the value of the outOfStockControlPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutOfStockControlPreference(Boolean value) {
        this.outOfStockControlPreference = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link EBayPLUSPreferenceType }
     *     
     */
    public EBayPLUSPreferenceType[] getEBayPLUSPreference() {
        if (this.eBayPLUSPreference == null) {
            return new EBayPLUSPreferenceType[ 0 ] ;
        }
        return ((EBayPLUSPreferenceType[]) this.eBayPLUSPreference.toArray(new EBayPLUSPreferenceType[this.eBayPLUSPreference.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link EBayPLUSPreferenceType }
     *     
     */
    public EBayPLUSPreferenceType getEBayPLUSPreference(int idx) {
        if (this.eBayPLUSPreference == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.eBayPLUSPreference.get(idx);
    }

    public int getEBayPLUSPreferenceLength() {
        if (this.eBayPLUSPreference == null) {
            return  0;
        }
        return this.eBayPLUSPreference.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link EBayPLUSPreferenceType }
     *     
     */
    public void setEBayPLUSPreference(EBayPLUSPreferenceType[] values) {
        this._getEBayPLUSPreference().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.eBayPLUSPreference.add(values[i]);
        }
    }

    protected List<EBayPLUSPreferenceType> _getEBayPLUSPreference() {
        if (eBayPLUSPreference == null) {
            eBayPLUSPreference = new ArrayList<EBayPLUSPreferenceType>();
        }
        return eBayPLUSPreference;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link EBayPLUSPreferenceType }
     *     
     */
    public EBayPLUSPreferenceType setEBayPLUSPreference(int idx, EBayPLUSPreferenceType value) {
        return this.eBayPLUSPreference.set(idx, value);
    }

}
