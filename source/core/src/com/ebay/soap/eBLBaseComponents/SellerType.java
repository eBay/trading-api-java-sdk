
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 			Information about a user returned in the context of an item's seller.
 * 		
 * 
 * <p>Java class for SellerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaisaPayStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AllowPaymentEdit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BillingCurrency" type="{urn:ebay:apis:eBLBaseComponents}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="CheckoutEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CIPBankAccountStored" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GoodStanding" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MerchandizingPref" type="{urn:ebay:apis:eBLBaseComponents}MerchandizingPrefCodeType" minOccurs="0"/>
 *         &lt;element name="QualifiesForB2BVAT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SellerGuaranteeLevel" type="{urn:ebay:apis:eBLBaseComponents}SellerGuaranteeLevelCodeType" minOccurs="0"/>
 *         &lt;element name="SellerLevel" type="{urn:ebay:apis:eBLBaseComponents}SellerLevelCodeType" minOccurs="0"/>
 *         &lt;element name="SellerPaymentAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="SchedulingInfo" type="{urn:ebay:apis:eBLBaseComponents}SchedulingInfoType" minOccurs="0"/>
 *         &lt;element name="StoreOwner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StoreURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="SellerBusinessType" type="{urn:ebay:apis:eBLBaseComponents}SellerBusinessCodeType" minOccurs="0"/>
 *         &lt;element name="RegisteredBusinessSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StoreSite" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{urn:ebay:apis:eBLBaseComponents}SellerPaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="ProStoresPreference" type="{urn:ebay:apis:eBLBaseComponents}ProStoresCheckoutPreferenceType" minOccurs="0"/>
 *         &lt;element name="CharityRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SafePaymentExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaisaPayEscrowEMIStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CharityAffiliationDetails" type="{urn:ebay:apis:eBLBaseComponents}CharityAffiliationDetailsType" minOccurs="0"/>
 *         &lt;element name="TransactionPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="IntegratedMerchantCreditCardInfo" type="{urn:ebay:apis:eBLBaseComponents}IntegratedMerchantCreditCardInfoType" minOccurs="0"/>
 *         &lt;element name="FeatureEligibility" type="{urn:ebay:apis:eBLBaseComponents}FeatureEligibilityType" minOccurs="0"/>
 *         &lt;element name="TopRatedSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TopRatedSellerDetails" type="{urn:ebay:apis:eBLBaseComponents}TopRatedSellerDetailsType" minOccurs="0"/>
 *         &lt;element name="RecoupmentPolicyConsent" type="{urn:ebay:apis:eBLBaseComponents}RecoupmentPolicyConsentType" minOccurs="0"/>
 *         &lt;element name="DomesticRateTable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InternationalRateTable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SellereBayPaymentProcessStatus" type="{urn:ebay:apis:eBLBaseComponents}SellereBayPaymentProcessStatusCodeType" minOccurs="0"/>
 *         &lt;element name="SellereBayPaymentProcessConsent" type="{urn:ebay:apis:eBLBaseComponents}SellereBayPaymentProcessConsentCodeType" minOccurs="0"/>
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
@XmlType(name = "SellerType", propOrder = {
    "paisaPayStatus",
    "allowPaymentEdit",
    "billingCurrency",
    "checkoutEnabled",
    "cipBankAccountStored",
    "goodStanding",
    "merchandizingPref",
    "qualifiesForB2BVAT",
    "sellerGuaranteeLevel",
    "sellerLevel",
    "sellerPaymentAddress",
    "schedulingInfo",
    "storeOwner",
    "storeURL",
    "sellerBusinessType",
    "registeredBusinessSeller",
    "storeSite",
    "paymentMethod",
    "proStoresPreference",
    "charityRegistered",
    "safePaymentExempt",
    "paisaPayEscrowEMIStatus",
    "charityAffiliationDetails",
    "transactionPercent",
    "integratedMerchantCreditCardInfo",
    "featureEligibility",
    "topRatedSeller",
    "topRatedSellerDetails",
    "recoupmentPolicyConsent",
    "domesticRateTable",
    "internationalRateTable",
    "sellereBayPaymentProcessStatus",
    "sellereBayPaymentProcessConsent",
    "any"
})
public class SellerType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PaisaPayStatus")
    protected Integer paisaPayStatus;
    @XmlElement(name = "AllowPaymentEdit")
    protected boolean allowPaymentEdit;
    @XmlElement(name = "BillingCurrency")
    protected CurrencyCodeType billingCurrency;
    @XmlElement(name = "CheckoutEnabled")
    protected boolean checkoutEnabled;
    @XmlElement(name = "CIPBankAccountStored")
    protected boolean cipBankAccountStored;
    @XmlElement(name = "GoodStanding")
    protected boolean goodStanding;
    @XmlElement(name = "MerchandizingPref")
    protected MerchandizingPrefCodeType merchandizingPref;
    @XmlElement(name = "QualifiesForB2BVAT")
    protected boolean qualifiesForB2BVAT;
    @XmlElement(name = "SellerGuaranteeLevel")
    protected SellerGuaranteeLevelCodeType sellerGuaranteeLevel;
    @XmlElement(name = "SellerLevel")
    protected SellerLevelCodeType sellerLevel;
    @XmlElement(name = "SellerPaymentAddress")
    protected AddressType sellerPaymentAddress;
    @XmlElement(name = "SchedulingInfo")
    protected SchedulingInfoType schedulingInfo;
    @XmlElement(name = "StoreOwner")
    protected boolean storeOwner;
    @XmlElement(name = "StoreURL")
    @XmlSchemaType(name = "anyURI")
    protected String storeURL;
    @XmlElement(name = "SellerBusinessType")
    protected SellerBusinessCodeType sellerBusinessType;
    @XmlElement(name = "RegisteredBusinessSeller")
    protected Boolean registeredBusinessSeller;
    @XmlElement(name = "StoreSite")
    protected SiteCodeType storeSite;
    @XmlElement(name = "PaymentMethod")
    protected SellerPaymentMethodCodeType paymentMethod;
    @XmlElement(name = "ProStoresPreference")
    protected ProStoresCheckoutPreferenceType proStoresPreference;
    @XmlElement(name = "CharityRegistered")
    protected Boolean charityRegistered;
    @XmlElement(name = "SafePaymentExempt")
    protected Boolean safePaymentExempt;
    @XmlElement(name = "PaisaPayEscrowEMIStatus")
    protected Integer paisaPayEscrowEMIStatus;
    @XmlElement(name = "CharityAffiliationDetails")
    protected CharityAffiliationDetailsType charityAffiliationDetails;
    @XmlElement(name = "TransactionPercent")
    protected Float transactionPercent;
    @XmlElement(name = "IntegratedMerchantCreditCardInfo")
    protected IntegratedMerchantCreditCardInfoType integratedMerchantCreditCardInfo;
    @XmlElement(name = "FeatureEligibility")
    protected FeatureEligibilityType featureEligibility;
    @XmlElement(name = "TopRatedSeller")
    protected Boolean topRatedSeller;
    @XmlElement(name = "TopRatedSellerDetails")
    protected TopRatedSellerDetailsType topRatedSellerDetails;
    @XmlElement(name = "RecoupmentPolicyConsent")
    protected RecoupmentPolicyConsentType recoupmentPolicyConsent;
    @XmlElement(name = "DomesticRateTable")
    protected Boolean domesticRateTable;
    @XmlElement(name = "InternationalRateTable")
    protected Boolean internationalRateTable;
    @XmlElement(name = "SellereBayPaymentProcessStatus")
    protected SellereBayPaymentProcessStatusCodeType sellereBayPaymentProcessStatus;
    @XmlElement(name = "SellereBayPaymentProcessConsent")
    protected SellereBayPaymentProcessConsentCodeType sellereBayPaymentProcessConsent;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the paisaPayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaisaPayStatus() {
        return paisaPayStatus;
    }

    /**
     * Sets the value of the paisaPayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaisaPayStatus(Integer value) {
        this.paisaPayStatus = value;
    }

    /**
     * Gets the value of the allowPaymentEdit property.
     * 
     */
    public boolean isAllowPaymentEdit() {
        return allowPaymentEdit;
    }

    /**
     * Sets the value of the allowPaymentEdit property.
     * 
     */
    public void setAllowPaymentEdit(boolean value) {
        this.allowPaymentEdit = value;
    }

    /**
     * Gets the value of the billingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getBillingCurrency() {
        return billingCurrency;
    }

    /**
     * Sets the value of the billingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setBillingCurrency(CurrencyCodeType value) {
        this.billingCurrency = value;
    }

    /**
     * Gets the value of the checkoutEnabled property.
     * 
     */
    public boolean isCheckoutEnabled() {
        return checkoutEnabled;
    }

    /**
     * Sets the value of the checkoutEnabled property.
     * 
     */
    public void setCheckoutEnabled(boolean value) {
        this.checkoutEnabled = value;
    }

    /**
     * Gets the value of the cipBankAccountStored property.
     * 
     */
    public boolean isCIPBankAccountStored() {
        return cipBankAccountStored;
    }

    /**
     * Sets the value of the cipBankAccountStored property.
     * 
     */
    public void setCIPBankAccountStored(boolean value) {
        this.cipBankAccountStored = value;
    }

    /**
     * Gets the value of the goodStanding property.
     * 
     */
    public boolean isGoodStanding() {
        return goodStanding;
    }

    /**
     * Sets the value of the goodStanding property.
     * 
     */
    public void setGoodStanding(boolean value) {
        this.goodStanding = value;
    }

    /**
     * Gets the value of the merchandizingPref property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandizingPrefCodeType }
     *     
     */
    public MerchandizingPrefCodeType getMerchandizingPref() {
        return merchandizingPref;
    }

    /**
     * Sets the value of the merchandizingPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandizingPrefCodeType }
     *     
     */
    public void setMerchandizingPref(MerchandizingPrefCodeType value) {
        this.merchandizingPref = value;
    }

    /**
     * Gets the value of the qualifiesForB2BVAT property.
     * 
     */
    public boolean isQualifiesForB2BVAT() {
        return qualifiesForB2BVAT;
    }

    /**
     * Sets the value of the qualifiesForB2BVAT property.
     * 
     */
    public void setQualifiesForB2BVAT(boolean value) {
        this.qualifiesForB2BVAT = value;
    }

    /**
     * Gets the value of the sellerGuaranteeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SellerGuaranteeLevelCodeType }
     *     
     */
    public SellerGuaranteeLevelCodeType getSellerGuaranteeLevel() {
        return sellerGuaranteeLevel;
    }

    /**
     * Sets the value of the sellerGuaranteeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerGuaranteeLevelCodeType }
     *     
     */
    public void setSellerGuaranteeLevel(SellerGuaranteeLevelCodeType value) {
        this.sellerGuaranteeLevel = value;
    }

    /**
     * Gets the value of the sellerLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SellerLevelCodeType }
     *     
     */
    public SellerLevelCodeType getSellerLevel() {
        return sellerLevel;
    }

    /**
     * Sets the value of the sellerLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerLevelCodeType }
     *     
     */
    public void setSellerLevel(SellerLevelCodeType value) {
        this.sellerLevel = value;
    }

    /**
     * Gets the value of the sellerPaymentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getSellerPaymentAddress() {
        return sellerPaymentAddress;
    }

    /**
     * Sets the value of the sellerPaymentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setSellerPaymentAddress(AddressType value) {
        this.sellerPaymentAddress = value;
    }

    /**
     * Gets the value of the schedulingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SchedulingInfoType }
     *     
     */
    public SchedulingInfoType getSchedulingInfo() {
        return schedulingInfo;
    }

    /**
     * Sets the value of the schedulingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchedulingInfoType }
     *     
     */
    public void setSchedulingInfo(SchedulingInfoType value) {
        this.schedulingInfo = value;
    }

    /**
     * Gets the value of the storeOwner property.
     * 
     */
    public boolean isStoreOwner() {
        return storeOwner;
    }

    /**
     * Sets the value of the storeOwner property.
     * 
     */
    public void setStoreOwner(boolean value) {
        this.storeOwner = value;
    }

    /**
     * Gets the value of the storeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreURL() {
        return storeURL;
    }

    /**
     * Sets the value of the storeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreURL(String value) {
        this.storeURL = value;
    }

    /**
     * Gets the value of the sellerBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link SellerBusinessCodeType }
     *     
     */
    public SellerBusinessCodeType getSellerBusinessType() {
        return sellerBusinessType;
    }

    /**
     * Sets the value of the sellerBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerBusinessCodeType }
     *     
     */
    public void setSellerBusinessType(SellerBusinessCodeType value) {
        this.sellerBusinessType = value;
    }

    /**
     * Gets the value of the registeredBusinessSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegisteredBusinessSeller() {
        return registeredBusinessSeller;
    }

    /**
     * Sets the value of the registeredBusinessSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegisteredBusinessSeller(Boolean value) {
        this.registeredBusinessSeller = value;
    }

    /**
     * Gets the value of the storeSite property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getStoreSite() {
        return storeSite;
    }

    /**
     * Sets the value of the storeSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setStoreSite(SiteCodeType value) {
        this.storeSite = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SellerPaymentMethodCodeType }
     *     
     */
    public SellerPaymentMethodCodeType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPaymentMethodCodeType }
     *     
     */
    public void setPaymentMethod(SellerPaymentMethodCodeType value) {
        this.paymentMethod = value;
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
     * Gets the value of the charityRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCharityRegistered() {
        return charityRegistered;
    }

    /**
     * Sets the value of the charityRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCharityRegistered(Boolean value) {
        this.charityRegistered = value;
    }

    /**
     * Gets the value of the safePaymentExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSafePaymentExempt() {
        return safePaymentExempt;
    }

    /**
     * Sets the value of the safePaymentExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSafePaymentExempt(Boolean value) {
        this.safePaymentExempt = value;
    }

    /**
     * Gets the value of the paisaPayEscrowEMIStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaisaPayEscrowEMIStatus() {
        return paisaPayEscrowEMIStatus;
    }

    /**
     * Sets the value of the paisaPayEscrowEMIStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaisaPayEscrowEMIStatus(Integer value) {
        this.paisaPayEscrowEMIStatus = value;
    }

    /**
     * Gets the value of the charityAffiliationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CharityAffiliationDetailsType }
     *     
     */
    public CharityAffiliationDetailsType getCharityAffiliationDetails() {
        return charityAffiliationDetails;
    }

    /**
     * Sets the value of the charityAffiliationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharityAffiliationDetailsType }
     *     
     */
    public void setCharityAffiliationDetails(CharityAffiliationDetailsType value) {
        this.charityAffiliationDetails = value;
    }

    /**
     * Gets the value of the transactionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransactionPercent() {
        return transactionPercent;
    }

    /**
     * Sets the value of the transactionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransactionPercent(Float value) {
        this.transactionPercent = value;
    }

    /**
     * Gets the value of the integratedMerchantCreditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IntegratedMerchantCreditCardInfoType }
     *     
     */
    public IntegratedMerchantCreditCardInfoType getIntegratedMerchantCreditCardInfo() {
        return integratedMerchantCreditCardInfo;
    }

    /**
     * Sets the value of the integratedMerchantCreditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegratedMerchantCreditCardInfoType }
     *     
     */
    public void setIntegratedMerchantCreditCardInfo(IntegratedMerchantCreditCardInfoType value) {
        this.integratedMerchantCreditCardInfo = value;
    }

    /**
     * Gets the value of the featureEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureEligibilityType }
     *     
     */
    public FeatureEligibilityType getFeatureEligibility() {
        return featureEligibility;
    }

    /**
     * Sets the value of the featureEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureEligibilityType }
     *     
     */
    public void setFeatureEligibility(FeatureEligibilityType value) {
        this.featureEligibility = value;
    }

    /**
     * Gets the value of the topRatedSeller property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopRatedSeller() {
        return topRatedSeller;
    }

    /**
     * Sets the value of the topRatedSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopRatedSeller(Boolean value) {
        this.topRatedSeller = value;
    }

    /**
     * Gets the value of the topRatedSellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TopRatedSellerDetailsType }
     *     
     */
    public TopRatedSellerDetailsType getTopRatedSellerDetails() {
        return topRatedSellerDetails;
    }

    /**
     * Sets the value of the topRatedSellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopRatedSellerDetailsType }
     *     
     */
    public void setTopRatedSellerDetails(TopRatedSellerDetailsType value) {
        this.topRatedSellerDetails = value;
    }

    /**
     * Gets the value of the recoupmentPolicyConsent property.
     * 
     * @return
     *     possible object is
     *     {@link RecoupmentPolicyConsentType }
     *     
     */
    public RecoupmentPolicyConsentType getRecoupmentPolicyConsent() {
        return recoupmentPolicyConsent;
    }

    /**
     * Sets the value of the recoupmentPolicyConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoupmentPolicyConsentType }
     *     
     */
    public void setRecoupmentPolicyConsent(RecoupmentPolicyConsentType value) {
        this.recoupmentPolicyConsent = value;
    }

    /**
     * Gets the value of the domesticRateTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDomesticRateTable() {
        return domesticRateTable;
    }

    /**
     * Sets the value of the domesticRateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDomesticRateTable(Boolean value) {
        this.domesticRateTable = value;
    }

    /**
     * Gets the value of the internationalRateTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternationalRateTable() {
        return internationalRateTable;
    }

    /**
     * Sets the value of the internationalRateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternationalRateTable(Boolean value) {
        this.internationalRateTable = value;
    }

    /**
     * Gets the value of the sellereBayPaymentProcessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellereBayPaymentProcessStatusCodeType }
     *     
     */
    public SellereBayPaymentProcessStatusCodeType getSellereBayPaymentProcessStatus() {
        return sellereBayPaymentProcessStatus;
    }

    /**
     * Sets the value of the sellereBayPaymentProcessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellereBayPaymentProcessStatusCodeType }
     *     
     */
    public void setSellereBayPaymentProcessStatus(SellereBayPaymentProcessStatusCodeType value) {
        this.sellereBayPaymentProcessStatus = value;
    }

    /**
     * Gets the value of the sellereBayPaymentProcessConsent property.
     * 
     * @return
     *     possible object is
     *     {@link SellereBayPaymentProcessConsentCodeType }
     *     
     */
    public SellereBayPaymentProcessConsentCodeType getSellereBayPaymentProcessConsent() {
        return sellereBayPaymentProcessConsent;
    }

    /**
     * Sets the value of the sellereBayPaymentProcessConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellereBayPaymentProcessConsentCodeType }
     *     
     */
    public void setSellereBayPaymentProcessConsent(SellereBayPaymentProcessConsentCodeType value) {
        this.sellereBayPaymentProcessConsent = value;
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
