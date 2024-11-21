
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetailEntryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountDetailEntryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="FeeInsertion"/>
 *     &lt;enumeration value="FeeBold"/>
 *     &lt;enumeration value="FeeFeatured"/>
 *     &lt;enumeration value="FeeCategoryFeatured"/>
 *     &lt;enumeration value="FeeFinalValue"/>
 *     &lt;enumeration value="PaymentCheck"/>
 *     &lt;enumeration value="PaymentCC"/>
 *     &lt;enumeration value="CreditCourtesy"/>
 *     &lt;enumeration value="CreditNoSale"/>
 *     &lt;enumeration value="CreditPartialSale"/>
 *     &lt;enumeration value="RefundCC"/>
 *     &lt;enumeration value="RefundCheck"/>
 *     &lt;enumeration value="FinanceCharge"/>
 *     &lt;enumeration value="AWDebit"/>
 *     &lt;enumeration value="AWCredit"/>
 *     &lt;enumeration value="AWMemo"/>
 *     &lt;enumeration value="CreditDuplicateListing"/>
 *     &lt;enumeration value="FeePartialSale"/>
 *     &lt;enumeration value="PaymentElectronicTransferReversal"/>
 *     &lt;enumeration value="PaymentCCOnce"/>
 *     &lt;enumeration value="FeeReturnedCheck"/>
 *     &lt;enumeration value="FeeRedepositCheck"/>
 *     &lt;enumeration value="PaymentCash"/>
 *     &lt;enumeration value="CreditInsertion"/>
 *     &lt;enumeration value="CreditBold"/>
 *     &lt;enumeration value="CreditFeatured"/>
 *     &lt;enumeration value="CreditCategoryFeatured"/>
 *     &lt;enumeration value="CreditFinalValue"/>
 *     &lt;enumeration value="FeeNSFCheck"/>
 *     &lt;enumeration value="FeeReturnCheckClose"/>
 *     &lt;enumeration value="Memo"/>
 *     &lt;enumeration value="PaymentMoneyOrder"/>
 *     &lt;enumeration value="CreditCardOnFile"/>
 *     &lt;enumeration value="CreditCardNotOnFile"/>
 *     &lt;enumeration value="Invoiced"/>
 *     &lt;enumeration value="InvoicedCreditCard"/>
 *     &lt;enumeration value="CreditTransferFrom"/>
 *     &lt;enumeration value="DebitTransferTo"/>
 *     &lt;enumeration value="InvoiceCreditBalance"/>
 *     &lt;enumeration value="eBayDebit"/>
 *     &lt;enumeration value="eBayCredit"/>
 *     &lt;enumeration value="PromotionalCredit"/>
 *     &lt;enumeration value="CCNotOnFilePerCustReq"/>
 *     &lt;enumeration value="CreditInsertionFee"/>
 *     &lt;enumeration value="CCPaymentRejected"/>
 *     &lt;enumeration value="FeeGiftIcon"/>
 *     &lt;enumeration value="CreditGiftIcon"/>
 *     &lt;enumeration value="FeeGallery"/>
 *     &lt;enumeration value="FeeFeaturedGallery"/>
 *     &lt;enumeration value="CreditGallery"/>
 *     &lt;enumeration value="CreditFeaturedGallery"/>
 *     &lt;enumeration value="ItemMoveFee"/>
 *     &lt;enumeration value="OutageCredit"/>
 *     &lt;enumeration value="CreditPSA"/>
 *     &lt;enumeration value="CreditPCGS"/>
 *     &lt;enumeration value="FeeReserve"/>
 *     &lt;enumeration value="CreditReserve"/>
 *     &lt;enumeration value="eBayVISACredit"/>
 *     &lt;enumeration value="BBAdminCredit"/>
 *     &lt;enumeration value="BBAdminDebit"/>
 *     &lt;enumeration value="ReferrerCredit"/>
 *     &lt;enumeration value="ReferrerDebit"/>
 *     &lt;enumeration value="SwitchCurrency"/>
 *     &lt;enumeration value="PaymentGiftCertificate"/>
 *     &lt;enumeration value="PaymentWireTransfer"/>
 *     &lt;enumeration value="PaymentHomeBanking"/>
 *     &lt;enumeration value="PaymentElectronicTransfer"/>
 *     &lt;enumeration value="PaymentAdjustmentCredit"/>
 *     &lt;enumeration value="PaymentAdjustmentDebit"/>
 *     &lt;enumeration value="Chargeoff"/>
 *     &lt;enumeration value="ChargeoffRecovery"/>
 *     &lt;enumeration value="ChargeoffBankruptcy"/>
 *     &lt;enumeration value="ChargeoffSuspended"/>
 *     &lt;enumeration value="ChargeoffDeceased"/>
 *     &lt;enumeration value="ChargeoffOther"/>
 *     &lt;enumeration value="ChargeoffWacko"/>
 *     &lt;enumeration value="FinanceChargeReversal"/>
 *     &lt;enumeration value="FVFCreditReversal"/>
 *     &lt;enumeration value="ForeignFundsConvert"/>
 *     &lt;enumeration value="ForeignFundsCheckReversal"/>
 *     &lt;enumeration value="EOMRestriction"/>
 *     &lt;enumeration value="AllFeesCredit"/>
 *     &lt;enumeration value="SetOnHold"/>
 *     &lt;enumeration value="RevertUserState"/>
 *     &lt;enumeration value="DirectDebitOnFile"/>
 *     &lt;enumeration value="DirectDebitNotOnFile"/>
 *     &lt;enumeration value="PaymentDirectDebit"/>
 *     &lt;enumeration value="DirectDebitReversal"/>
 *     &lt;enumeration value="DirectDebitReturnedItem"/>
 *     &lt;enumeration value="FeeHighlight"/>
 *     &lt;enumeration value="CreditHighlight"/>
 *     &lt;enumeration value="BulkUserSuspension"/>
 *     &lt;enumeration value="FeeRealEstate30DaysListing"/>
 *     &lt;enumeration value="CreditRealEstate30DaysListing"/>
 *     &lt;enumeration value="TradingLimitOverrideOn"/>
 *     &lt;enumeration value="TradingLimitOverrideOff"/>
 *     &lt;enumeration value="EquifaxRealtimeFee"/>
 *     &lt;enumeration value="CreditEquifaxRealtimeFee"/>
 *     &lt;enumeration value="PaymentEquifaxDebit"/>
 *     &lt;enumeration value="PaymentEquifaxCredit"/>
 *     &lt;enumeration value="Merged"/>
 *     &lt;enumeration value="AutoTraderOn"/>
 *     &lt;enumeration value="AutoTraderOff"/>
 *     &lt;enumeration value="PaperInvoiceOn"/>
 *     &lt;enumeration value="PaperInvoiceOff"/>
 *     &lt;enumeration value="AccountStateSwitch"/>
 *     &lt;enumeration value="FVFCreditReversalAutomatic"/>
 *     &lt;enumeration value="CreditSoftOutage"/>
 *     &lt;enumeration value="LACatalogFee"/>
 *     &lt;enumeration value="LAExtraItem"/>
 *     &lt;enumeration value="LACatalogItemFeeRefund"/>
 *     &lt;enumeration value="LACatalogInsertionRefund"/>
 *     &lt;enumeration value="LAFinalValueFee"/>
 *     &lt;enumeration value="LAFinalValueFeeRefund"/>
 *     &lt;enumeration value="LABuyerPremiumPercentageFee"/>
 *     &lt;enumeration value="LABuyerPremiumPercentageFeeRefund"/>
 *     &lt;enumeration value="LAAudioVideoFee"/>
 *     &lt;enumeration value="LAAudioVideoFeeRefund"/>
 *     &lt;enumeration value="FeeIPIXPhoto"/>
 *     &lt;enumeration value="FeeIPIXSlideShow"/>
 *     &lt;enumeration value="CreditIPIXPhoto"/>
 *     &lt;enumeration value="CreditIPIXSlideShow"/>
 *     &lt;enumeration value="FeeTenDayAuction"/>
 *     &lt;enumeration value="CreditTenDayAuction"/>
 *     &lt;enumeration value="TemporaryCredit"/>
 *     &lt;enumeration value="TemporaryCreditReversal"/>
 *     &lt;enumeration value="SubscriptionAABasic"/>
 *     &lt;enumeration value="SubscriptionAAPro"/>
 *     &lt;enumeration value="CreditAABasic"/>
 *     &lt;enumeration value="CreditAAPro"/>
 *     &lt;enumeration value="FeeLargePicture"/>
 *     &lt;enumeration value="CreditLargePicture"/>
 *     &lt;enumeration value="FeePicturePack"/>
 *     &lt;enumeration value="CreditPicturePackPartial"/>
 *     &lt;enumeration value="CreditPicturePackFull"/>
 *     &lt;enumeration value="SubscriptioneBayStores"/>
 *     &lt;enumeration value="CrediteBayStores"/>
 *     &lt;enumeration value="FeeInsertionFixedPrice"/>
 *     &lt;enumeration value="CreditInsertionFixedPrice"/>
 *     &lt;enumeration value="FeeFinalValueFixedPrice"/>
 *     &lt;enumeration value="CreditFinalValueFixedPrice"/>
 *     &lt;enumeration value="ElectronicInvoiceOn"/>
 *     &lt;enumeration value="ElectronicInvoiceOff"/>
 *     &lt;enumeration value="FlagDDDDPending"/>
 *     &lt;enumeration value="FlagDDPaymentConfirmed"/>
 *     &lt;enumeration value="FixedPriceDurationFee"/>
 *     &lt;enumeration value="FixedPriceDurationCredit"/>
 *     &lt;enumeration value="BuyItNowFee"/>
 *     &lt;enumeration value="BuyItNowCredit"/>
 *     &lt;enumeration value="FeeSchedule"/>
 *     &lt;enumeration value="CreditSchedule"/>
 *     &lt;enumeration value="SubscriptionSMBasic"/>
 *     &lt;enumeration value="SubscriptionSMBasicPro"/>
 *     &lt;enumeration value="CreditSMBasic"/>
 *     &lt;enumeration value="CreditSMBasicPro"/>
 *     &lt;enumeration value="StoresGTCFee"/>
 *     &lt;enumeration value="StoresGTCCredit"/>
 *     &lt;enumeration value="ListingDesignerFee"/>
 *     &lt;enumeration value="ListingDesignerCredit"/>
 *     &lt;enumeration value="ExtendedAuctionFee"/>
 *     &lt;enumeration value="ExtendedAcutionCredit"/>
 *     &lt;enumeration value="PayPalOTPSucc"/>
 *     &lt;enumeration value="PayPalOTPPend"/>
 *     &lt;enumeration value="PayPalFailed"/>
 *     &lt;enumeration value="PayPalChargeBack"/>
 *     &lt;enumeration value="ChargeBack"/>
 *     &lt;enumeration value="ChargeBackReversal"/>
 *     &lt;enumeration value="PayPalRefund"/>
 *     &lt;enumeration value="BonusPointsAddition"/>
 *     &lt;enumeration value="BonusPointsReduction"/>
 *     &lt;enumeration value="BonusPointsPaymentAutomatic"/>
 *     &lt;enumeration value="BonusPointsPaymentManual"/>
 *     &lt;enumeration value="BonusPointsPaymentReversal"/>
 *     &lt;enumeration value="BonusPointsCashPayout"/>
 *     &lt;enumeration value="VATCredit"/>
 *     &lt;enumeration value="VATDebit"/>
 *     &lt;enumeration value="VATStatusChangePending"/>
 *     &lt;enumeration value="VATStatusChangeApproved"/>
 *     &lt;enumeration value="VATStatusChange_Denied"/>
 *     &lt;enumeration value="VATStatusDeletedByCSR"/>
 *     &lt;enumeration value="VATStatusDeletedByUser"/>
 *     &lt;enumeration value="SMProListingDesignerFee"/>
 *     &lt;enumeration value="SMProListingDesignerCredit"/>
 *     &lt;enumeration value="StoresSuccessfulListingFee"/>
 *     &lt;enumeration value="StoresSuccessfulListingFeeCredit"/>
 *     &lt;enumeration value="StoresReferralFee"/>
 *     &lt;enumeration value="StoresReferralCredit"/>
 *     &lt;enumeration value="SubtitleFee"/>
 *     &lt;enumeration value="SubtitleFeeCredit"/>
 *     &lt;enumeration value="eBayStoreInventorySubscriptionCredit"/>
 *     &lt;enumeration value="AutoPmntReqExempt"/>
 *     &lt;enumeration value="AutoPmntReqRein"/>
 *     &lt;enumeration value="PictureManagerSubscriptionFee"/>
 *     &lt;enumeration value="PictureManagerSubscriptionFeeCredit"/>
 *     &lt;enumeration value="SellerReportsBasicFee"/>
 *     &lt;enumeration value="SellerReportsBasicCredit"/>
 *     &lt;enumeration value="SellerReportsPlusFee"/>
 *     &lt;enumeration value="SellerReportsPlusCredit"/>
 *     &lt;enumeration value="PaypalOnFile"/>
 *     &lt;enumeration value="PaypalOnFileByCSR"/>
 *     &lt;enumeration value="PaypalOffFile"/>
 *     &lt;enumeration value="BorderFee"/>
 *     &lt;enumeration value="BorderFeeCredit"/>
 *     &lt;enumeration value="FeeSearchableMobileDE"/>
 *     &lt;enumeration value="SalesReportsPlusFee"/>
 *     &lt;enumeration value="SalesReportsPlusCredit"/>
 *     &lt;enumeration value="CreditSearchableMobileDE"/>
 *     &lt;enumeration value="EmailMarketingFee"/>
 *     &lt;enumeration value="EmailMarketingCredit"/>
 *     &lt;enumeration value="FeePictureShow"/>
 *     &lt;enumeration value="CreditPictureShow"/>
 *     &lt;enumeration value="ProPackBundleFee"/>
 *     &lt;enumeration value="ProPackBundleFeeCredit"/>
 *     &lt;enumeration value="BasicUpgradePackBundleFee"/>
 *     &lt;enumeration value="BasicUpgradePackBundleFeeCredit"/>
 *     &lt;enumeration value="ValuePackBundleFee"/>
 *     &lt;enumeration value="ValuePackBundleFeeCredit"/>
 *     &lt;enumeration value="ProPackPlusBundleFee"/>
 *     &lt;enumeration value="ProPackPlusBundleFeeCredit"/>
 *     &lt;enumeration value="FinalEntry"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ExtendedDurationFee"/>
 *     &lt;enumeration value="ExtendedDurationFeeCredit"/>
 *     &lt;enumeration value="InternationalListingFee"/>
 *     &lt;enumeration value="InternationalListingCredit"/>
 *     &lt;enumeration value="MarketplaceResearchExpiredSubscriptionFee"/>
 *     &lt;enumeration value="MarketplaceResearchExpiredSubscriptionFeeCredit"/>
 *     &lt;enumeration value="MarketplaceResearchBasicSubscriptionFee"/>
 *     &lt;enumeration value="MarketplaceResearchBasicSubscriptionFeeCredit"/>
 *     &lt;enumeration value="MarketplaceResearchProSubscriptionFee"/>
 *     &lt;enumeration value="BasicBundleFee"/>
 *     &lt;enumeration value="BasicBundleFeeCredit"/>
 *     &lt;enumeration value="MarketplaceResearchProSubscriptionFeeCredit"/>
 *     &lt;enumeration value="VehicleLocalSubscriptionFee"/>
 *     &lt;enumeration value="VehicleLocalSubscriptionFeeCredit"/>
 *     &lt;enumeration value="VehicleLocalInsertionFee"/>
 *     &lt;enumeration value="VehicleLocalInsertionFeeCredit"/>
 *     &lt;enumeration value="VehicleLocalFinalValueFee"/>
 *     &lt;enumeration value="VehicleLocalFinalValueFeeCredit"/>
 *     &lt;enumeration value="VehicleLocalGTCFee"/>
 *     &lt;enumeration value="VehicleLocalGTCFeeCredit"/>
 *     &lt;enumeration value="eBayMotorsProFee"/>
 *     &lt;enumeration value="CrediteBayMotorsProFee"/>
 *     &lt;enumeration value="eBayMotorsProFeatureFee"/>
 *     &lt;enumeration value="CrediteBayMotorsProFeatureFee"/>
 *     &lt;enumeration value="FeeGalleryPlus"/>
 *     &lt;enumeration value="CreditGalleryPlus"/>
 *     &lt;enumeration value="PrivateListing"/>
 *     &lt;enumeration value="CreditPrivateListing"/>
 *     &lt;enumeration value="ImmoProFee"/>
 *     &lt;enumeration value="CreditImmoProFee"/>
 *     &lt;enumeration value="ImmoProFeatureFee"/>
 *     &lt;enumeration value="CreditImmoProFeatureFee"/>
 *     &lt;enumeration value="RealEstateProFee"/>
 *     &lt;enumeration value="CreditRealEstateProFee"/>
 *     &lt;enumeration value="RealEstateProFeatureFee"/>
 *     &lt;enumeration value="CreditRealEstateProFeatureFee"/>
 *     &lt;enumeration value="Discount"/>
 *     &lt;enumeration value="CreditFinalValueShipping"/>
 *     &lt;enumeration value="FeeFinalValueShipping"/>
 *     &lt;enumeration value="FeeReturnShipping"/>
 *     &lt;enumeration value="CreditReturnShipping"/>
 *     &lt;enumeration value="FeeGlobalShippingProgram"/>
 *     &lt;enumeration value="CreditGlobalShippingProgram"/>
 *     &lt;enumeration value="FeeAuctionEndEarly"/>
 *     &lt;enumeration value="CreditAuctionEndEarly"/>
 *     &lt;enumeration value="FeeFedExShippingLabel"/>
 *     &lt;enumeration value="CreditFedExShippingLabel"/>
 *     &lt;enumeration value="FeeReturnRefund"/>
 *     &lt;enumeration value="CreditReturnRefund"/>
 *     &lt;enumeration value="FeeStoresSubscriptionEarlyTermination"/>
 *     &lt;enumeration value="CreditStoresSubscriptionEarlyTermination"/>
 *     &lt;enumeration value="FeeVehicleSubscriptionEarlyTermination"/>
 *     &lt;enumeration value="CreditVehicleSubscriptionEarlyTermination"/>
 *     &lt;enumeration value="FeeVehicleSubscription"/>
 *     &lt;enumeration value="CreditVehicleSubscription"/>
 *     &lt;enumeration value="FeeAUPostShippingLabel"/>
 *     &lt;enumeration value="CreditAUPostShippingLabel"/>
 *     &lt;enumeration value="FeeAPACFedExShippingLabel"/>
 *     &lt;enumeration value="CreditAPACFedExShippingLabel"/>
 *     &lt;enumeration value="FeeAPACTNTShippingLabel"/>
 *     &lt;enumeration value="CreditAPACTNTShippingLabel"/>
 *     &lt;enumeration value="FeeEBPReimbursement"/>
 *     &lt;enumeration value="CreditEBPReimbursement"/>
 *     &lt;enumeration value="FeePromotedListingFeature"/>
 *     &lt;enumeration value="CreditPromotedListingFeature"/>
 *     &lt;enumeration value="FeeAd"/>
 *     &lt;enumeration value="CreditAd"/>
 *     &lt;enumeration value="FeeUBIShippingLabel"/>
 *     &lt;enumeration value="CreditUBIShippingLabel"/>
 *     &lt;enumeration value="FeeeBayPlusSubscription"/>
 *     &lt;enumeration value="CrediteBayPlusSubscription"/>
 *     &lt;enumeration value="PaymentIntermediationFee"/>
 *     &lt;enumeration value="PaymentIntermediationFeeCredit"/>
 *     &lt;enumeration value="FeePaymentIntermediationRVI"/>
 *     &lt;enumeration value="FeePaymentIntermediationChargeback"/>
 *     &lt;enumeration value="FeePaymentIntermediationChargebackRVI"/>
 *     &lt;enumeration value="SnadOutlierFinalValueFee"/>
 *     &lt;enumeration value="SnadOutlierFinalValueFeeOnShipping"/>
 *     &lt;enumeration value="HighlineSearchFee"/>
 *     &lt;enumeration value="HighlineSearchFeeCredit"/>
 *     &lt;enumeration value="SnadOutlierFinalValueFeeCredit"/>
 *     &lt;enumeration value="SnadOutlierFinalValueFeeOnShippingCredit"/>
 *     &lt;enumeration value="AdFeePremium"/>
 *     &lt;enumeration value="AdFeePremiumCredit"/>
 *     &lt;enumeration value="PerListingPaymentsFee"/>
 *     &lt;enumeration value="PerListingPaymentsFeeCredit"/>
 *     &lt;enumeration value="VehiclesListingBasicPackageFee"/>
 *     &lt;enumeration value="VehiclesListingBasicPackageCredit"/>
 *     &lt;enumeration value="VehiclesListingPlusPackageFee"/>
 *     &lt;enumeration value="VehiclesListingPlusPackageCredit"/>
 *     &lt;enumeration value="VehiclesListingPremiumPackageFee"/>
 *     &lt;enumeration value="VehiclesListingPremiumPackageCredit"/>
 *     &lt;enumeration value="SendLabelFee"/>
 *     &lt;enumeration value="SendLabelFeeCredit"/>
 *     &lt;enumeration value="UpsLabelFee"/>
 *     &lt;enumeration value="UpsLabelFeeCredit"/>
 *     &lt;enumeration value="CanadaPostLabelFee"/>
 *     &lt;enumeration value="CanadaPostLabelFeeCredit"/>
 *     &lt;enumeration value="EbaySendLabelFee"/>
 *     &lt;enumeration value="EbaySendLabelFeeCredit"/>
 *     &lt;enumeration value="USInternetSalesTax"/>
 *     &lt;enumeration value="USInternetSalesTaxCredit"/>
 *     &lt;enumeration value="NewZealandGST"/>
 *     &lt;enumeration value="NewZealandGSTCredit"/>
 *     &lt;enumeration value="AustraliaGST"/>
 *     &lt;enumeration value="AustraliaGSTCredit"/>
 *     &lt;enumeration value="UspsLabelFee"/>
 *     &lt;enumeration value="UspsLabelFeeCredit"/>
 *     &lt;enumeration value="ShippingInsuranceFee"/>
 *     &lt;enumeration value="ShippingInsuranceFeeCredit"/>
 *     &lt;enumeration value="UspsShortpaidFee"/>
 *     &lt;enumeration value="UspsShortpaidFeeCredit"/>
 *     &lt;enumeration value="CoFundingCharge"/>
 *     &lt;enumeration value="CoFundingChargeCredit"/>
 *     &lt;enumeration value="FinalValueFee"/>
 *     &lt;enumeration value="FinalValueFeeCredit"/>
 *     &lt;enumeration value="InternationalFee"/>
 *     &lt;enumeration value="InternationalFeeCredit"/>
 *     &lt;enumeration value="FinalValueFeeFixedFeePerOrder"/>
 *     &lt;enumeration value="FinalValueFeeFixedFeePerOrderCredit"/>
 *     &lt;enumeration value="FinalValueFeeBelowStandard"/>
 *     &lt;enumeration value="FinalValueFeeBelowStandardCredit"/>
 *     &lt;enumeration value="AdFeeExpress"/>
 *     &lt;enumeration value="AdFeeExpressCredit"/>
 *     &lt;enumeration value="DepositProcessingFee"/>
 *     &lt;enumeration value="DepositProcessingFeeCredit"/>
 *     &lt;enumeration value="DepositProcessingFixedFee"/>
 *     &lt;enumeration value="DepositProcessingFixedFeeCredit"/>
 *     &lt;enumeration value="FedExReturnLabelFee"/>
 *     &lt;enumeration value="FedExReturnLabelFeeCredit"/>
 *     &lt;enumeration value="AUPostReturnLabelFee"/>
 *     &lt;enumeration value="AUPostReturnLabelFeeCredit"/>
 *     &lt;enumeration value="UpsCaLabelFee"/>
 *     &lt;enumeration value="UpsCaLabelFeeCredit"/>
 *     &lt;enumeration value="FedExCaLabelFee"/>
 *     &lt;enumeration value="FedExCaLabelFeeCredit"/>
 *     &lt;enumeration value="HubbedReturnLabelFee"/>
 *     &lt;enumeration value="HubbedReturnLabelFeeCredit"/>
 *     &lt;enumeration value="RoyalMailReturnLabelFee"/>
 *     &lt;enumeration value="RoyalMailReturnLabelFeeCredit"/>
 *     &lt;enumeration value="ParcelForcePostReturnLabelFee"/>
 *     &lt;enumeration value="ParcelForcePostReturnLabelFeeCredit"/>
 *     &lt;enumeration value="OffsiteAdsFee"/>
 *     &lt;enumeration value="OffsiteAdsFeeCredit"/>
 *     &lt;enumeration value="PromotedDisplayFee"/>
 *     &lt;enumeration value="PromotedDisplayFeeCredit"/>
 *     &lt;enumeration value="USWHTFederal"/>
 *     &lt;enumeration value="USWHTFederalCredit"/>
 *     &lt;enumeration value="USWHTState"/>
 *     &lt;enumeration value="USWHTStateCredit"/>
 *     &lt;enumeration value="EPRFee"/>
 *     &lt;enumeration value="EPRFeeCredit"/>
 *     &lt;enumeration value="CAPostReturnLabelFee"/>
 *     &lt;enumeration value="CAPostReturnLabelFeeCredit"/>
 *     &lt;enumeration value="HermesReturnLabelFee"/>
 *     &lt;enumeration value="HermesReturnLabelFeeCredit"/>
 *     &lt;enumeration value="BankPayoutFee"/>
 *     &lt;enumeration value="BankPayoutFeeCredit"/>
 *     &lt;enumeration value="CharityDonation"/>
 *     &lt;enumeration value="CharityDonationCredit"/>
 *     &lt;enumeration value="ExpressPayoutFee"/>
 *     &lt;enumeration value="ExpressPayoutFeeCredit"/>
 *     &lt;enumeration value="HermesReturnLblSellerPaidShpFee"/>
 *     &lt;enumeration value="HermesReturnLblSellerPaidShpFeeCr"/>
 *     &lt;enumeration value="DHLReturnLblShippingFee"/>
 *     &lt;enumeration value="DHLReturnLblShippingFeeCredit"/>
 *     &lt;enumeration value="RegulatoryOperatingFee"/>
 *     &lt;enumeration value="RegulatoryOperatingFeeCredit"/>
 *     &lt;enumeration value="DHLPaymentProcessingFee"/>
 *     &lt;enumeration value="DHLPaymentProcessingFeeCredit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AccountDetailEntryCodeType")
@XmlEnum
public enum AccountDetailEntryCodeType {


    /**
     * 
     * 					 This enumeration value indicates that the account transaction type is unknown. Sometimes this value will get returned, but the corresponding <b>Description</b> field may provide more details, and the corresponding <b>GrossDetailAmount</b> field will indicate whether the transaction was a charge or a credit (indicated with a negative dollar value).
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is an insertion fee for a listing.
     * 					
     * 
     */
    @XmlEnumValue("FeeInsertion")
    FEE_INSERTION("FeeInsertion"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a listing upgrade fee for a listing title in boldface font.
     * 					
     * 
     */
    @XmlEnumValue("FeeBold")
    FEE_BOLD("FeeBold"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a listing upgrade fee for featuring the listing on an eBay marketplace's home page.
     * 					  <br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b>
     * 						This feature is no longer available to most marketplaces and sellers.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("FeeFeatured")
    FEE_FEATURED("FeeFeatured"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a listing upgrade fee for featuring the listing on an eBay category page relevant to the item.
     * 						<br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b>
     * 						This feature is no longer available to most marketplaces and sellers.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("FeeCategoryFeatured")
    FEE_CATEGORY_FEATURED("FeeCategoryFeatured"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a final value fee for a sale on the listing. This fee is charged when a listed item sells, and is a percentage of the final sale price. This fee does not take in account any shipping costs. The final value fee associated with shipping costs is returned in <b>FeeFinalValueShipping</b> entry.
     * 					
     * 
     */
    @XmlEnumValue("FeeFinalValue")
    FEE_FINAL_VALUE("FeeFinalValue"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a payment by check made by a user to eBay.
     * 					
     * 
     */
    @XmlEnumValue("PaymentCheck")
    PAYMENT_CHECK("PaymentCheck"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a payment by credit card made by a user to eBay.
     * 					
     * 
     */
    @XmlEnumValue("PaymentCC")
    PAYMENT_CC("PaymentCC"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a courtesy credit issued by eBay to the user.
     * 					
     * 
     */
    @XmlEnumValue("CreditCourtesy")
    CREDIT_COURTESY("CreditCourtesy"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to the user due to no sale.
     * 					
     * 
     */
    @XmlEnumValue("CreditNoSale")
    CREDIT_NO_SALE("CreditNoSale"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to the user due to a partial sale.
     * 					
     * 
     */
    @XmlEnumValue("CreditPartialSale")
    CREDIT_PARTIAL_SALE("CreditPartialSale"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a refund to a user's credit card issued by eBay.
     * 					
     * 
     */
    @XmlEnumValue("RefundCC")
    REFUND_CC("RefundCC"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a refund check to a user issued by eBay.
     * 					
     * 
     */
    @XmlEnumValue("RefundCheck")
    REFUND_CHECK("RefundCheck"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a finance charge to the user's account. A finance charge may be applicable if the user's monthly invoice balance is not paid in full by the due date.
     * 					
     * 
     */
    @XmlEnumValue("FinanceCharge")
    FINANCE_CHARGE("FinanceCharge"),

    /**
     * 
     * 						This value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("AWDebit")
    AW_DEBIT("AWDebit"),

    /**
     * 
     * 						This value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("AWCredit")
    AW_CREDIT("AWCredit"),

    /**
     * 
     * 						This value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("AWMemo")
    AW_MEMO("AWMemo"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued to the seller for any listing fees for a duplicate listing that was removed by eBay.
     * 					
     * 
     */
    @XmlEnumValue("CreditDuplicateListing")
    CREDIT_DUPLICATE_LISTING("CreditDuplicateListing"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay for a partial sale.
     * 					
     * 
     */
    @XmlEnumValue("FeePartialSale")
    FEE_PARTIAL_SALE("FeePartialSale"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a reversal of an electronic transfer payment.
     * 					
     * 
     */
    @XmlEnumValue("PaymentElectronicTransferReversal")
    PAYMENT_ELECTRONIC_TRANSFER_REVERSAL("PaymentElectronicTransferReversal"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a one-time payment made by a credit card.
     * 					
     * 
     */
    @XmlEnumValue("PaymentCCOnce")
    PAYMENT_CC_ONCE("PaymentCCOnce"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay for a returned check.
     * 					
     * 
     */
    @XmlEnumValue("FeeReturnedCheck")
    FEE_RETURNED_CHECK("FeeReturnedCheck"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay when a check must be redeposited to collect funds.
     * 					
     * 
     */
    @XmlEnumValue("FeeRedepositCheck")
    FEE_REDEPOSIT_CHECK("FeeRedepositCheck"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a cash payment made on the user's account.
     * 					
     * 
     */
    @XmlEnumValue("PaymentCash")
    PAYMENT_CASH("PaymentCash"),

    /**
     * 
     * 					This enumeration value indicates that the account entry is an insertion fee credit issued by eBay to the seller.
     * 					
     * 
     */
    @XmlEnumValue("CreditInsertion")
    CREDIT_INSERTION("CreditInsertion"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit for a Bold title listing upgrade.
     * 					
     * 
     */
    @XmlEnumValue("CreditBold")
    CREDIT_BOLD("CreditBold"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit for a  listing upgrade fee for featuring the listing on an eBay marketplace's home page.
     * 						<br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b>
     * 						This feature is no longer available to most marketplaces and sellers.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("CreditFeatured")
    CREDIT_FEATURED("CreditFeatured"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit for a  listing upgrade fee for featuring the listing on an eBay category page relevant to the item.
     * 						<br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b>
     * 						This feature is no longer available to most marketplaces and sellers.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("CreditCategoryFeatured")
    CREDIT_CATEGORY_FEATURED("CreditCategoryFeatured"),

    /**
     * 
     * 					This enumeration value indicates that the account entry is a credit for a final value fee for a sale on the listing. A final value fee may be credited back to a seller's account if the buyer never pays for the line item, or if the buyer cancels the order.
     * 					
     * 
     */
    @XmlEnumValue("CreditFinalValue")
    CREDIT_FINAL_VALUE("CreditFinalValue"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay when the seller's check does not clear due to insufficient funds.
     * 					
     * 
     */
    @XmlEnumValue("FeeNSFCheck")
    FEE_NSF_CHECK("FeeNSFCheck"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay when the seller's check does not clear because the account has been closed.
     * 					
     * 
     */
    @XmlEnumValue("FeeReturnCheckClose")
    FEE_RETURN_CHECK_CLOSE("FeeReturnCheckClose"),

    /**
     * 
     * 						This enumeration value may be returned if the account entry is just a memo/note, or if the account entry cannot be properly classified. The corresponding <b>Description</b> field may provide more details, and the corresponding <b>GrossDetailAmount</b> field will indicate whether the transaction was a charge or a credit (indicate with a negative dollar value).
     * 					
     * 
     */
    @XmlEnumValue("Memo")
    MEMO("Memo"),

    /**
     * 
     * 						This enumeration value may be returned if the account entry is a payment made to the account by money order.
     * 					
     * 
     */
    @XmlEnumValue("PaymentMoneyOrder")
    PAYMENT_MONEY_ORDER("PaymentMoneyOrder"),

    /**
     * 
     * 						This enumeration value may be returned if the account entry is an automatic monthly charge of the seller's invoice amount made by eBay to a credit card the seller has placed on file.
     * 					
     * 
     */
    @XmlEnumValue("CreditCardOnFile")
    CREDIT_CARD_ON_FILE("CreditCardOnFile"),

    /**
     * 
     * 						This enumeration value may be returned if the account entry is a one-time payment made with a user's credit card that is not on file with eBay for automatic monthly payments.
     * 					
     * 
     */
    @XmlEnumValue("CreditCardNotOnFile")
    CREDIT_CARD_NOT_ON_FILE("CreditCardNotOnFile"),

    /**
     * 
     * 						This enumeration value indicates that the user has been invoiced.
     * 					
     * 
     */
    @XmlEnumValue("Invoiced")
    INVOICED("Invoiced"),

    /**
     * 
     * 						This enumeration value indicates that the user has been invoiced and that the balance will be charged to the credit card on file on the due date.
     * 					
     * 
     */
    @XmlEnumValue("InvoicedCreditCard")
    INVOICED_CREDIT_CARD("InvoicedCreditCard"),

    /**
     * 
     * 						This enumeration value may be returned if the account entry is a credit transferred from another account to this account.
     * 					
     * 
     */
    @XmlEnumValue("CreditTransferFrom")
    CREDIT_TRANSFER_FROM("CreditTransferFrom"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a debit transferred from this account to another account.
     * 					
     * 
     */
    @XmlEnumValue("DebitTransferTo")
    DEBIT_TRANSFER_TO("DebitTransferTo"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit balance for an account's invoice period, meaning that the seller should not pay.
     * 					
     * 
     */
    @XmlEnumValue("InvoiceCreditBalance")
    INVOICE_CREDIT_BALANCE("InvoiceCreditBalance"),

    /**
     * 
     * 						This enumeration value may be returned for debits issued by eBay that are manually applied to the user's account, and not necessarily tied to a specific listing/line item.
     * 					
     * 
     */
    @XmlEnumValue("eBayDebit")
    E_BAY_DEBIT("eBayDebit"),

    /**
     * 
     * 						This enumeration value may be returned for credits issued by eBay that are manually applied to the user's account, and not necessarily tied to a specific listing/line item.
     * 					
     * 
     */
    @XmlEnumValue("eBayCredit")
    E_BAY_CREDIT("eBayCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a promotional credit issued by eBay.
     * 					
     * 
     */
    @XmlEnumValue("PromotionalCredit")
    PROMOTIONAL_CREDIT("PromotionalCredit"),

    /**
     * 
     * 						This enumeration value may be returned as a note that the user's credit card is not with eBay.
     * 					
     * 
     */
    @XmlEnumValue("CCNotOnFilePerCustReq")
    CC_NOT_ON_FILE_PER_CUST_REQ("CCNotOnFilePerCustReq"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an insertion
     * 						fee credit. If a listed item does not sell or results in an Unpaid Item case, the seller can relist the item with no additional charge.
     * 					
     * 
     */
    @XmlEnumValue("CreditInsertionFee")
    CREDIT_INSERTION_FEE("CreditInsertionFee"),

    /**
     * 
     * 						This enumeration value may be returned as a note if a user's credit card payment is rejected.
     * 					
     * 
     */
    @XmlEnumValue("CCPaymentRejected")
    CC_PAYMENT_REJECTED("CCPaymentRejected"),

    /**
     * 
     * 						This enumeration value is no longer applicable and should not be returned since gift services and the gift icon are no longer supported in any eBay marketplaces.
     * 					
     * 
     */
    @XmlEnumValue("FeeGiftIcon")
    FEE_GIFT_ICON("FeeGiftIcon"),

    /**
     * 
     * 						This enumeration value is no longer applicable and should not be returned since gift services and the gift icon are no longer supported in any eBay marketplaces.
     * 					
     * 
     */
    @XmlEnumValue("CreditGiftIcon")
    CREDIT_GIFT_ICON("CreditGiftIcon"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay for listing an item in the Picture Gallery. A buyer sees a picture of the item when browsing a category, before moving to the item's listing page.
     * 					
     * 
     */
    @XmlEnumValue("FeeGallery")
    FEE_GALLERY("FeeGallery"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay for listing an item in the Featured section at the top of the Picture Gallery page.
     * 					
     * 
     */
    @XmlEnumValue("FeeFeaturedGallery")
    FEE_FEATURED_GALLERY("FeeFeaturedGallery"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay for the Gallery fee charged when the item was listed.
     * 					
     * 
     */
    @XmlEnumValue("CreditGallery")
    CREDIT_GALLERY("CreditGallery"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay for the Featured Gallery fee charged when the item was listed.
     * 					
     * 
     */
    @XmlEnumValue("CreditFeaturedGallery")
    CREDIT_FEATURED_GALLERY("CreditFeaturedGallery"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee for moving the item.
     * 					
     * 
     */
    @XmlEnumValue("ItemMoveFee")
    ITEM_MOVE_FEE("ItemMoveFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit that may be issued by eBay when listings are not available due to system downtime. The downtime can be a title search outage or a hard outage.
     * 					
     * 
     */
    @XmlEnumValue("OutageCredit")
    OUTAGE_CREDIT("OutageCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit for a PSA payment.
     * 					
     * 
     */
    @XmlEnumValue("CreditPSA")
    CREDIT_PSA("CreditPSA"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit for a PCGS fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditPCGS")
    CREDIT_PCGS("CreditPCGS"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay when the seller sets a reserve price for an auction listing.
     * 					
     * 
     */
    @XmlEnumValue("FeeReserve")
    FEE_RESERVE("FeeReserve"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit refunded to the seller for a reserve price that was set for an auction listing.
     * 					
     * 
     */
    @XmlEnumValue("CreditReserve")
    CREDIT_RESERVE("CreditReserve"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to the user's Visa credit card.
     * 					
     * 
     */
    @XmlEnumValue("eBayVISACredit")
    E_BAY_VISA_CREDIT("eBayVISACredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued administratively.
     * 					
     * 
     */
    @XmlEnumValue("BBAdminCredit")
    BB_ADMIN_CREDIT("BBAdminCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a charge issued administratively.
     * 					
     * 
     */
    @XmlEnumValue("BBAdminDebit")
    BB_ADMIN_DEBIT("BBAdminDebit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to a Store owner who has promoted items outside of eBay.
     * 					
     * 
     */
    @XmlEnumValue("ReferrerCredit")
    REFERRER_CREDIT("ReferrerCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a charge issued by eBay to a Store owner who has promoted items outside of eBay.
     * 					
     * 
     */
    @XmlEnumValue("ReferrerDebit")
    REFERRER_DEBIT("ReferrerDebit"),

    /**
     * 
     * 						This enumeration value may be returned as a note about switching from one billing currency to another.
     * 					
     * 
     */
    @XmlEnumValue("SwitchCurrency")
    SWITCH_CURRENCY("SwitchCurrency"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a payment made to the account by a gift certificate.
     * 					
     * 
     */
    @XmlEnumValue("PaymentGiftCertificate")
    PAYMENT_GIFT_CERTIFICATE("PaymentGiftCertificate"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a payment made to the account by wire transfer.
     * 					
     * 
     */
    @XmlEnumValue("PaymentWireTransfer")
    PAYMENT_WIRE_TRANSFER("PaymentWireTransfer"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a payment made to the account through home bank.
     * 					
     * 
     */
    @XmlEnumValue("PaymentHomeBanking")
    PAYMENT_HOME_BANKING("PaymentHomeBanking"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a one-time payment made to the account by electronic transfer.
     * 					
     * 
     */
    @XmlEnumValue("PaymentElectronicTransfer")
    PAYMENT_ELECTRONIC_TRANSFER("PaymentElectronicTransfer"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit made by eBay to the seller's account when a payment needs to be adjusted.
     * 					
     * 
     */
    @XmlEnumValue("PaymentAdjustmentCredit")
    PAYMENT_ADJUSTMENT_CREDIT("PaymentAdjustmentCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a debit (deduction) made by eBay to the seller's account when a payment needs to be adjusted.
     * 					
     * 
     */
    @XmlEnumValue("PaymentAdjustmentDebit")
    PAYMENT_ADJUSTMENT_DEBIT("PaymentAdjustmentDebit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an eBay write-off of an account charge.
     * 					
     * 
     */
    @XmlEnumValue("Chargeoff")
    CHARGEOFF("Chargeoff"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is the recovery of an  eBay write-off of an acccount charge.
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffRecovery")
    CHARGEOFF_RECOVERY("ChargeoffRecovery"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an eBay write-off of the account charges by eBay due to the seller declaring bankruptcy.
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffBankruptcy")
    CHARGEOFF_BANKRUPTCY("ChargeoffBankruptcy"),

    /**
     * 
     * 						This enumeration value may be returned as a note that the eBay write-off of an account charge has been suspended.
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffSuspended")
    CHARGEOFF_SUSPENDED("ChargeoffSuspended"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an eBay write-off of the account charges by eBay due to the decease of the seller.
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffDeceased")
    CHARGEOFF_DECEASED("ChargeoffDeceased"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an eBay write-off of the account charges by eBay due to the decease of the seller.
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffOther")
    CHARGEOFF_OTHER("ChargeoffOther"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an eBay write-off of the account charges by eBay due to the wackiness of the seller.
     * 					
     * 
     */
    @XmlEnumValue("ChargeoffWacko")
    CHARGEOFF_WACKO("ChargeoffWacko"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a reversal of the finance charge to the user's account. A finance charge may be applicable if the user's monthly invoice balance is not paid in full by the due date.
     * 					
     * 
     */
    @XmlEnumValue("FinanceChargeReversal")
    FINANCE_CHARGE_REVERSAL("FinanceChargeReversal"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a reversal of a Final Value Fee credit, resulting in the fee again being charged to the seller.
     * 					
     * 
     */
    @XmlEnumValue("FVFCreditReversal")
    FVF_CREDIT_REVERSAL("FVFCreditReversal"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged for currency conversion.
     * 					
     * 
     */
    @XmlEnumValue("ForeignFundsConvert")
    FOREIGN_FUNDS_CONVERT("ForeignFundsConvert"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a reversal of a check payment made with foreign funds.
     * 					
     * 
     */
    @XmlEnumValue("ForeignFundsCheckReversal")
    FOREIGN_FUNDS_CHECK_REVERSAL("ForeignFundsCheckReversal"),

    /**
     * 
     * 						This enumeration value may be returned to act as a note that there is an 'End of the Month' restriction for account activity.
     * 					
     * 
     */
    @XmlEnumValue("EOMRestriction")
    EOM_RESTRICTION("EOMRestriction"),

    /**
     * 
     * 						This enumeration value may be returned if eBay is issuing a credit to the seller for multiple listing fees.
     * 					
     * 
     */
    @XmlEnumValue("AllFeesCredit")
    ALL_FEES_CREDIT("AllFeesCredit"),

    /**
     * 
     * 						This enumeration value may be returned to act as a note that the user's account is on hold.
     * 					
     * 
     */
    @XmlEnumValue("SetOnHold")
    SET_ON_HOLD("SetOnHold"),

    /**
     * 
     * 						This enumeration value may be returned to act as a note to indicate that the state of the user's account has been reverted.
     * 					
     * 
     */
    @XmlEnumValue("RevertUserState")
    REVERT_USER_STATE("RevertUserState"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a monthly payment made by automatic direct debit to the seller's checking account, when the account information is on file.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebitOnFile")
    DIRECT_DEBIT_ON_FILE("DirectDebitOnFile"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a one-time payment made by direct debit to the seller's checking account, when the account information is not on file, but is provided for this payment.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebitNotOnFile")
    DIRECT_DEBIT_NOT_ON_FILE("DirectDebitNotOnFile"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a payment made by direct debit from the seller's checking account when the seller has requested automatic monthly invoice payments.
     * 					
     * 
     */
    @XmlEnumValue("PaymentDirectDebit")
    PAYMENT_DIRECT_DEBIT("PaymentDirectDebit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a reversal of a payment made by direct debit from the seller's checking account.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebitReversal")
    DIRECT_DEBIT_REVERSAL("DirectDebitReversal"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a reversal of a payment made by direct debit from a seller's checking account when an item is returned by the buyer.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebitReturnedItem")
    DIRECT_DEBIT_RETURNED_ITEM("DirectDebitReturnedItem"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a fee charged by eBay for adding a colored band to emphasize a listing.
     * 					 <br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b>
     * 						This feature is no longer available to most marketplaces and sellers.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("FeeHighlight")
    FEE_HIGHLIGHT("FeeHighlight"),

    /**
     * 
     * 						 This enumeration value indicates that the account entry is a credit issued to the seller by eBay for adding a colored band to emphasize a listing.
     * 						 <br>
     * 							<br>
     * 							<span class="tablenote"><b>Note:</b>
     * 							This feature is no longer available to most marketplaces and sellers.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("CreditHighlight")
    CREDIT_HIGHLIGHT("CreditHighlight"),

    /**
     * 
     * 						This enumeration value may be returned to act as a note to indicate that the user's account has been suspended as part of a bulk suspension initiated by eBay.
     * 					
     * 
     */
    @XmlEnumValue("BulkUserSuspension")
    BULK_USER_SUSPENSION("BulkUserSuspension"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged for a 30-day classified ad listing in a Real Estate category.
     * 					
     * 
     */
    @XmlEnumValue("FeeRealEstate30DaysListing")
    FEE_REAL_ESTATE_30_DAYS_LISTING("FeeRealEstate30DaysListing"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issue to a seller for a 30-day classified ad listing in a Real Estate category.
     * 					
     * 
     */
    @XmlEnumValue("CreditRealEstate30DaysListing")
    CREDIT_REAL_ESTATE_30_DAYS_LISTING("CreditRealEstate30DaysListing"),

    /**
     * 
     * 						This enumeration value is only used internally.
     * 					
     * 
     */
    @XmlEnumValue("TradingLimitOverrideOn")
    TRADING_LIMIT_OVERRIDE_ON("TradingLimitOverrideOn"),

    /**
     * 
     * 						This enumeration value is only used internally.
     * 					
     * 
     */
    @XmlEnumValue("TradingLimitOverrideOff")
    TRADING_LIMIT_OVERRIDE_OFF("TradingLimitOverrideOff"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged to a seller who did not provide a credit card or checking account number to verify identify.
     * 					
     * 
     */
    @XmlEnumValue("EquifaxRealtimeFee")
    EQUIFAX_REALTIME_FEE("EquifaxRealtimeFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued to a seller who was charged an Equifax fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditEquifaxRealtimeFee")
    CREDIT_EQUIFAX_REALTIME_FEE("CreditEquifaxRealtimeFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a payment made by the seller for an Equifax fee.
     * 					
     * 
     */
    @XmlEnumValue("PaymentEquifaxDebit")
    PAYMENT_EQUIFAX_DEBIT("PaymentEquifaxDebit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to the seller for a payment made on an Equifax fee.
     * 					
     * 
     */
    @XmlEnumValue("PaymentEquifaxCredit")
    PAYMENT_EQUIFAX_CREDIT("PaymentEquifaxCredit"),

    /**
     * 
     * 						This enumeration value may be returned to act as a note to indicate that the user's two accounts (same owner, but different user IDs) have been merged into one account.
     * 					
     * 
     */
    @XmlEnumValue("Merged")
    MERGED("Merged"),

    /**
     * 
     * 						The Auto Trader feature is no longer available for motor vehicle listings.
     * 					
     * 
     */
    @XmlEnumValue("AutoTraderOn")
    AUTO_TRADER_ON("AutoTraderOn"),

    /**
     * 
     * 						The Auto Trader feature is no longer available for motor vehicle listings.
     * 					
     * 
     */
    @XmlEnumValue("AutoTraderOff")
    AUTO_TRADER_OFF("AutoTraderOff"),

    /**
     * 
     * 						This enumeration value is no longer applicable as paper invoices are no longer available. Users must download their invoices from My eBay.
     * 					
     * 
     */
    @XmlEnumValue("PaperInvoiceOn")
    PAPER_INVOICE_ON("PaperInvoiceOn"),

    /**
     * 
     * 						This enumeration value is no longer applicable as paper invoices are no longer available. Users must download their invoices from My eBay.
     * 					
     * 
     */
    @XmlEnumValue("PaperInvoiceOff")
    PAPER_INVOICE_OFF("PaperInvoiceOff"),

    /**
     * 
     * 						This enumeration value may be returned to act as a note to indicate that there has been a change in the status of the user's account.
     * 					
     * 
     */
    @XmlEnumValue("AccountStateSwitch")
    ACCOUNT_STATE_SWITCH("AccountStateSwitch"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an automatic reversal of a Final Value Fee credit.
     * 					
     * 
     */
    @XmlEnumValue("FVFCreditReversalAutomatic")
    FVF_CREDIT_REVERSAL_AUTOMATIC("FVFCreditReversalAutomatic"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to the seller if a title search outage of one hour or longer occurs on the site.
     * 					
     * 
     */
    @XmlEnumValue("CreditSoftOutage")
    CREDIT_SOFT_OUTAGE("CreditSoftOutage"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Live Auction listings are no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("LACatalogFee")
    LA_CATALOG_FEE("LACatalogFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Live Auction listings are no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("LAExtraItem")
    LA_EXTRA_ITEM("LAExtraItem"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Live Auction listings are no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("LACatalogItemFeeRefund")
    LA_CATALOG_ITEM_FEE_REFUND("LACatalogItemFeeRefund"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Live Auction listings are no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("LACatalogInsertionRefund")
    LA_CATALOG_INSERTION_REFUND("LACatalogInsertionRefund"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Live Auction listings are no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("LAFinalValueFee")
    LA_FINAL_VALUE_FEE("LAFinalValueFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Live Auction listings are no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("LAFinalValueFeeRefund")
    LA_FINAL_VALUE_FEE_REFUND("LAFinalValueFeeRefund"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Live Auction listings are no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("LABuyerPremiumPercentageFee")
    LA_BUYER_PREMIUM_PERCENTAGE_FEE("LABuyerPremiumPercentageFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Live Auction listings are no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("LABuyerPremiumPercentageFeeRefund")
    LA_BUYER_PREMIUM_PERCENTAGE_FEE_REFUND("LABuyerPremiumPercentageFeeRefund"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Live Auction listings are no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("LAAudioVideoFee")
    LA_AUDIO_VIDEO_FEE("LAAudioVideoFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as Live Auction listings are no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("LAAudioVideoFeeRefund")
    LA_AUDIO_VIDEO_FEE_REFUND("LAAudioVideoFeeRefund"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the iPix photo feature is  no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("FeeIPIXPhoto")
    FEE_IPIX_PHOTO("FeeIPIXPhoto"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the iPix photo feature is  no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("FeeIPIXSlideShow")
    FEE_IPIX_SLIDE_SHOW("FeeIPIXSlideShow"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the iPix photo feature is  no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("CreditIPIXPhoto")
    CREDIT_IPIX_PHOTO("CreditIPIXPhoto"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the iPix photo feature is  no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("CreditIPIXSlideShow")
    CREDIT_IPIX_SLIDE_SHOW("CreditIPIXSlideShow"),

    /**
     * 
     * 					A fee charged for listing an item for 10 days, rather than one, three, five, or seven days.
     * 					
     * 
     */
    @XmlEnumValue("FeeTenDayAuction")
    FEE_TEN_DAY_AUCTION("FeeTenDayAuction"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued to a seller for a 10-day auction listing.
     * 					
     * 
     */
    @XmlEnumValue("CreditTenDayAuction")
    CREDIT_TEN_DAY_AUCTION("CreditTenDayAuction"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a temporary credit from eBay to the user.
     * 					
     * 
     */
    @XmlEnumValue("TemporaryCredit")
    TEMPORARY_CREDIT("TemporaryCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is the reversal of a temporary credit from eBay to the user.
     * 					
     * 
     */
    @XmlEnumValue("TemporaryCreditReversal")
    TEMPORARY_CREDIT_REVERSAL("TemporaryCreditReversal"),

    /**
     * 
     * 				     This enumeration value is no longer applicable as the Auction Assistant feature is no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("SubscriptionAABasic")
    SUBSCRIPTION_AA_BASIC("SubscriptionAABasic"),

    /**
     * 
     * 				    This enumeration value is no longer applicable as the Auction Assistant feature is no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("SubscriptionAAPro")
    SUBSCRIPTION_AA_PRO("SubscriptionAAPro"),

    /**
     * 
     * 				     This enumeration value is no longer applicable as the Auction Assistant feature is no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("CreditAABasic")
    CREDIT_AA_BASIC("CreditAABasic"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the Auction Assistant feature is no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("CreditAAPro")
    CREDIT_AA_PRO("CreditAAPro"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay for a super-sized picture in a listing.
     * 					
     * 
     */
    @XmlEnumValue("FeeLargePicture")
    FEE_LARGE_PICTURE("FeeLargePicture"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to the seller for a super-sized picture in a listing.
     * 					
     * 
     */
    @XmlEnumValue("CreditLargePicture")
    CREDIT_LARGE_PICTURE("CreditLargePicture"),

    /**
     * 
     * 						This enumeration value is no longer applicable as eBay no longer charges a fee for adding photos to listings.
     * 					
     * 
     */
    @XmlEnumValue("FeePicturePack")
    FEE_PICTURE_PACK("FeePicturePack"),

    /**
     * 
     * 					 This enumeration value is no longer applicable as eBay no longer charges a fee for adding photos to listings.
     * 					
     * 
     */
    @XmlEnumValue("CreditPicturePackPartial")
    CREDIT_PICTURE_PACK_PARTIAL("CreditPicturePackPartial"),

    /**
     * 
     * 					 This enumeration value is no longer applicable as eBay no longer charges a fee for adding photos to listings.
     * 					
     * 
     */
    @XmlEnumValue("CreditPicturePackFull")
    CREDIT_PICTURE_PACK_FULL("CreditPicturePackFull"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a monthly subscription fee charged for the user's eBay Store.
     * 					
     * 
     */
    @XmlEnumValue("SubscriptioneBayStores")
    SUBSCRIPTIONE_BAY_STORES("SubscriptioneBayStores"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a credit toward the user's eBay Store subscription fee.
     * 					
     * 
     */
    @XmlEnumValue("CrediteBayStores")
    CREDITE_BAY_STORES("CrediteBayStores"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an insertion fee for a fixed-price listing.
     * 					
     * 
     */
    @XmlEnumValue("FeeInsertionFixedPrice")
    FEE_INSERTION_FIXED_PRICE("FeeInsertionFixedPrice"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an insertion
     * 						fee credit for a fixed-price listing. 
     * 					
     * 
     */
    @XmlEnumValue("CreditInsertionFixedPrice")
    CREDIT_INSERTION_FIXED_PRICE("CreditInsertionFixedPrice"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a final value fee for a sale on the fixed-price listing. This fee is charged when a listed item sells, and is a percentage of the final sale price.
     * 					
     * 
     */
    @XmlEnumValue("FeeFinalValueFixedPrice")
    FEE_FINAL_VALUE_FIXED_PRICE("FeeFinalValueFixedPrice"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit for a final value fee for a sale on the fixed-price listing. A final value fee may be credited back to a seller's account if the buyer never pays for the line item, or if the buyer cancels the order.
     * 					
     * 
     */
    @XmlEnumValue("CreditFinalValueFixedPrice")
    CREDIT_FINAL_VALUE_FIXED_PRICE("CreditFinalValueFixedPrice"),

    /**
     * 
     * 						This enumeration value is no longer applicable since paper invoices are no longer available, so electronic invoices are the only option. Users must download their invoices from My eBay.
     * 					
     * 
     */
    @XmlEnumValue("ElectronicInvoiceOn")
    ELECTRONIC_INVOICE_ON("ElectronicInvoiceOn"),

    /**
     * 
     * 						This enumeration value is no longer applicable since paper invoices are no longer available, so electronic invoices are the only option. Users must download their invoices from My eBay.
     * 					
     * 
     */
    @XmlEnumValue("ElectronicInvoiceOff")
    ELECTRONIC_INVOICE_OFF("ElectronicInvoiceOff"),

    /**
     * 
     * 						This enumeration value acts as a note to indicate that a direct debit payment is pending.
     * 					
     * 
     */
    @XmlEnumValue("FlagDDDDPending")
    FLAG_DDDD_PENDING("FlagDDDDPending"),

    /**
     * 
     * 						This enumeration value acts as a note to indicate that a direct debit payment is confirmed.
     * 					
     * 
     */
    @XmlEnumValue("FlagDDPaymentConfirmed")
    FLAG_DD_PAYMENT_CONFIRMED("FlagDDPaymentConfirmed"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay for creating a fixed-price listing with a 10-day duration.
     * 						 <br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b>
     * 							This charge may only be applicable to motor vehicle listings on eBay Motors, eBay Canada (English and French versions), eBay UK, and eBay Italy. For all non-motor vehicle categories, the only available listing duration is 'GTC', or 'Good 'til Cancelled'.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("FixedPriceDurationFee")
    FIXED_PRICE_DURATION_FEE("FixedPriceDurationFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to the seller for creating a fixed-price listing with a 10-day duration.
     * 						 <br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b>
     * 							The 10-day duration fee is only applicable to motor vehicle listings on eBay Motors, eBay Canada (English and French versions), eBay UK, and eBay Italy. For all non-motor vehicle categories, the only available listing duration is 'GTC', or 'Good 'til Cancelled'.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("FixedPriceDurationCredit")
    FIXED_PRICE_DURATION_CREDIT("FixedPriceDurationCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay if the seller uses the 'Buy It Now' feature on an auction listing.
     * 					
     * 
     */
    @XmlEnumValue("BuyItNowFee")
    BUY_IT_NOW_FEE("BuyItNowFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay if the seller uses the 'Buy It Now' feature on an auction listing.
     * 					
     * 
     */
    @XmlEnumValue("BuyItNowCredit")
    BUY_IT_NOW_CREDIT("BuyItNowCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay if the seller uses the scheduled listing feature for a listing. With scheduled listings, the seller schedules a listing to start at some later time (up to 3 weeks after) instead of immediately.
     * 					
     * 
     */
    @XmlEnumValue("FeeSchedule")
    FEE_SCHEDULE("FeeSchedule"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to the seller if the seller needs to be refunded for a scheduled listing. With scheduled listings, the seller schedules a listing to start at some later time (up to 3 weeks after) instead of immediately.
     * 					
     * 
     */
    @XmlEnumValue("CreditSchedule")
    CREDIT_SCHEDULE("CreditSchedule"),

    /**
     * 
     * 					 	This enumeration value indicates that the account entry is the monthly subscription fee charged for the basic version of Selling Manager. For most eBay marketplaces and sellers, there is no subscription charge to use the basic version of Selling Manager.
     * 					
     * 
     */
    @XmlEnumValue("SubscriptionSMBasic")
    SUBSCRIPTION_SM_BASIC("SubscriptionSMBasic"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is the monthly subscription fee charged for using the Selling Manager Pro product.
     * 					
     * 
     */
    @XmlEnumValue("SubscriptionSMBasicPro")
    SUBSCRIPTION_SM_BASIC_PRO("SubscriptionSMBasicPro"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit for the monthly subscription fee charged for the basic version of Selling Manager. For most eBay marketplaces and sellers, there is no subscription charge to use the basic version of Selling Manager.
     * 					
     * 
     */
    @XmlEnumValue("CreditSMBasic")
    CREDIT_SM_BASIC("CreditSMBasic"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit for the monthly subscription fee charged for using the Selling Manager Pro product.
     * 					
     * 
     */
    @XmlEnumValue("CreditSMBasicPro")
    CREDIT_SM_BASIC_PRO("CreditSMBasicPro"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged to the seller when a 'Good 'til Cancelled', fixed-price listing automatically renews after each month (as long as inventory is still available or 'out-of-stock' feature is on). This fee is similar to an insertion fee when a listing is first created. 'GTC' listings automatically renew each month, and these renewed listings may incur insertion fees unless the seller has 'zero insertion fee' credits. eBay sellers with stores get more 'zero insertion fee' credits than other sellers.
     * 					
     * 
     */
    @XmlEnumValue("StoresGTCFee")
    STORES_GTC_FEE("StoresGTCFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to refund the seller for a 'Good 'til Cancelled' listing renewal/insertion fee. 'GTC' listings automatically renew each, and these renewed listings may incur insertion fees unless the seller has 'zero insertion fee' credits. eBay sellers with stores get more 'zero insertion fee' credits than other sellers.
     * 					
     * 
     */
    @XmlEnumValue("StoresGTCCredit")
    STORES_GTC_CREDIT("StoresGTCCredit"),

    /**
     * 
     * 						This enumeration value is no longer appplicable as sellers are no longer able to use Listing Designer templates when they create or revise listings.
     * 					
     * 
     */
    @XmlEnumValue("ListingDesignerFee")
    LISTING_DESIGNER_FEE("ListingDesignerFee"),

    /**
     * 
     * 						This enumeration value is no longer appplicable as sellers are no longer able to use Listing Designer templates when they create or revise listings.
     * 					
     * 
     */
    @XmlEnumValue("ListingDesignerCredit")
    LISTING_DESIGNER_CREDIT("ListingDesignerCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable as there is no additional fee charged to the seller for creating a 10-day auction listing.
     * 					
     * 
     */
    @XmlEnumValue("ExtendedAuctionFee")
    EXTENDED_AUCTION_FEE("ExtendedAuctionFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as there is no additional fee charged to the seller for creating a 10-day auction listing.
     * 					
     * 
     */
    @XmlEnumValue("ExtendedAcutionCredit")
    EXTENDED_ACUTION_CREDIT("ExtendedAcutionCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("PayPalOTPSucc")
    PAY_PAL_OTP_SUCC("PayPalOTPSucc"),

    /**
     * 
     * 						This enumeration value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("PayPalOTPPend")
    PAY_PAL_OTP_PEND("PayPalOTPPend"),

    /**
     * 
     * 						This enumeration value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("PayPalFailed")
    PAY_PAL_FAILED("PayPalFailed"),

    /**
     * 
     * 						This enumeration value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("PayPalChargeBack")
    PAY_PAL_CHARGE_BACK("PayPalChargeBack"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a charge back.
     * 					
     * 
     */
    @XmlEnumValue("ChargeBack")
    CHARGE_BACK("ChargeBack"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is the reversal of a charge back.
     * 					
     * 
     */
    @XmlEnumValue("ChargeBackReversal")
    CHARGE_BACK_REVERSAL("ChargeBackReversal"),

    /**
     * 
     * 						This enumeration value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("PayPalRefund")
    PAY_PAL_REFUND("PayPalRefund"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the 'Anything Points' program is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsAddition")
    BONUS_POINTS_ADDITION("BonusPointsAddition"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the 'Anything Points' program is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsReduction")
    BONUS_POINTS_REDUCTION("BonusPointsReduction"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the 'Anything Points' program is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsPaymentAutomatic")
    BONUS_POINTS_PAYMENT_AUTOMATIC("BonusPointsPaymentAutomatic"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the 'Anything Points' program is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsPaymentManual")
    BONUS_POINTS_PAYMENT_MANUAL("BonusPointsPaymentManual"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the 'Anything Points' program is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsPaymentReversal")
    BONUS_POINTS_PAYMENT_REVERSAL("BonusPointsPaymentReversal"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the 'Anything Points' program is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("BonusPointsCashPayout")
    BONUS_POINTS_CASH_PAYOUT("BonusPointsCashPayout"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit to the seller's account for Value-Added Tax (VAT) previously paid by the seller.
     * 					
     * 
     */
    @XmlEnumValue("VATCredit")
    VAT_CREDIT("VATCredit"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a debit to the seller's account for a Value-Added Tax (VAT) charge.
     * 					
     * 
     */
    @XmlEnumValue("VATDebit")
    VAT_DEBIT("VATDebit"),

    /**
     * 
     * 						This enumeration value acts as a note to indicate that a VAT status change to the seller's account is pending.
     * 					
     * 
     */
    @XmlEnumValue("VATStatusChangePending")
    VAT_STATUS_CHANGE_PENDING("VATStatusChangePending"),

    /**
     * 
     * 						This enumeration value acts as a note to indicate that a VAT status change to the seller's account is approved.
     * 					
     * 
     */
    @XmlEnumValue("VATStatusChangeApproved")
    VAT_STATUS_CHANGE_APPROVED("VATStatusChangeApproved"),

    /**
     * 
     * 						This enumeration value acts as a note to indicate that a VAT status change to the seller's account was denied.
     * 					
     * 
     */
    @XmlEnumValue("VATStatusChange_Denied")
    VAT_STATUS_CHANGE_DENIED("VATStatusChange_Denied"),

    /**
     * 
     * 						This enumeration value acts as a note to indicate that a VAT status change to the seller's account was cancelled by an eBay customer support representative.
     * 					
     * 
     */
    @XmlEnumValue("VATStatusDeletedByCSR")
    VAT_STATUS_DELETED_BY_CSR("VATStatusDeletedByCSR"),

    /**
     * 
     * 						This enumeration value acts as a note to indicate that a VAT status change to the seller's account was cancelled by the user.
     * 					
     * 
     */
    @XmlEnumValue("VATStatusDeletedByUser")
    VAT_STATUS_DELETED_BY_USER("VATStatusDeletedByUser"),

    /**
     * 
     * 						This enumeration value is no longer appplicable as sellers are no longer able to use Listing Designer templates when they create or revise listings.
     * 					
     * 
     */
    @XmlEnumValue("SMProListingDesignerFee")
    SM_PRO_LISTING_DESIGNER_FEE("SMProListingDesignerFee"),

    /**
     * 
     * 						This enumeration value is no longer appplicable as sellers are no longer able to use Listing Designer templates when they create or revise listings.
     * 					
     * 
     */
    @XmlEnumValue("SMProListingDesignerCredit")
    SM_PRO_LISTING_DESIGNER_CREDIT("SMProListingDesignerCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable as <code>StoresFixedPrice</code> is no longer a valid listing type.
     * 					
     * 
     */
    @XmlEnumValue("StoresSuccessfulListingFee")
    STORES_SUCCESSFUL_LISTING_FEE("StoresSuccessfulListingFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as <code>StoresFixedPrice</code> is no longer a valid listing type.
     * 					
     * 
     */
    @XmlEnumValue("StoresSuccessfulListingFeeCredit")
    STORES_SUCCESSFUL_LISTING_FEE_CREDIT("StoresSuccessfulListingFeeCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable as there is no longer a referral fee charged to sellers when buyers are routed to their store through printed materials or emails.
     * 					
     * 
     */
    @XmlEnumValue("StoresReferralFee")
    STORES_REFERRAL_FEE("StoresReferralFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as there is no longer a referral fee charged to sellers when buyers are routed to their store through printed materials or emails.
     * 					
     * 
     */
    @XmlEnumValue("StoresReferralCredit")
    STORES_REFERRAL_CREDIT("StoresReferralCredit"),

    /**
     * 
     * 						This enumeration value indicates the account entry is a fee charged to the seller for adding a subtitle to a listing. Subtitles allow sellers to provide more keywords and/or descriptive information, and may increase buyers' interest.
     * 					
     * 
     */
    @XmlEnumValue("SubtitleFee")
    SUBTITLE_FEE("SubtitleFee"),

    /**
     * 
     * 						This enumeration value indicates the account entry is a credit issued from eBay to compensate the seller for a subtitle fee charged to their account.
     * 					
     * 
     */
    @XmlEnumValue("SubtitleFeeCredit")
    SUBTITLE_FEE_CREDIT("SubtitleFeeCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable as <code>StoresFixedPrice</code> is no longer a valid listing type.
     * 					
     * 
     */
    @XmlEnumValue("eBayStoreInventorySubscriptionCredit")
    E_BAY_STORE_INVENTORY_SUBSCRIPTION_CREDIT("eBayStoreInventorySubscriptionCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("AutoPmntReqExempt")
    AUTO_PMNT_REQ_EXEMPT("AutoPmntReqExempt"),

    /**
     * 
     * 						This enumeration value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("AutoPmntReqRein")
    AUTO_PMNT_REQ_REIN("AutoPmntReqRein"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the Picture Manager feature is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("PictureManagerSubscriptionFee")
    PICTURE_MANAGER_SUBSCRIPTION_FEE("PictureManagerSubscriptionFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the Picture Manager feature is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("PictureManagerSubscriptionFeeCredit")
    PICTURE_MANAGER_SUBSCRIPTION_FEE_CREDIT("PictureManagerSubscriptionFeeCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the Seller Reports feature is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("SellerReportsBasicFee")
    SELLER_REPORTS_BASIC_FEE("SellerReportsBasicFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the Seller Reports feature is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("SellerReportsBasicCredit")
    SELLER_REPORTS_BASIC_CREDIT("SellerReportsBasicCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the Seller Reports feature is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("SellerReportsPlusFee")
    SELLER_REPORTS_PLUS_FEE("SellerReportsPlusFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as the Seller Reports feature is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("SellerReportsPlusCredit")
    SELLER_REPORTS_PLUS_CREDIT("SellerReportsPlusCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("PaypalOnFile")
    PAYPAL_ON_FILE("PaypalOnFile"),

    /**
     * 
     * 						This enumeration value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("PaypalOnFileByCSR")
    PAYPAL_ON_FILE_BY_CSR("PaypalOnFileByCSR"),

    /**
     * 
     * 						This enumeration value is no longer applicable.
     * 					
     * 
     */
    @XmlEnumValue("PaypalOffFile")
    PAYPAL_OFF_FILE("PaypalOffFile"),

    /**
     * 
     * 					 This enumeration value is no longer applicable as borders around listing photos are no longer supported on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("BorderFee")
    BORDER_FEE("BorderFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable as borders around listing photos are no longer supported on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("BorderFeeCredit")
    BORDER_FEE_CREDIT("BorderFeeCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable since placing eBay Germany motor vehicle listings on the mobile.de site is no longer supported.
     * 					
     * 
     */
    @XmlEnumValue("FeeSearchableMobileDE")
    FEE_SEARCHABLE_MOBILE_DE("FeeSearchableMobileDE"),

    /**
     * 
     * 						This enumeration value indicates the account entry is a monthly subscription fee charged for Sales Reports Plus.
     * 					
     * 
     */
    @XmlEnumValue("SalesReportsPlusFee")
    SALES_REPORTS_PLUS_FEE("SalesReportsPlusFee"),

    /**
     * 
     * 						This enumeration value indicates the account entry is a credit to the seller applied towards the monthly subscription fee charged for Sales Reports Plus.
     * 					
     * 
     */
    @XmlEnumValue("SalesReportsPlusCredit")
    SALES_REPORTS_PLUS_CREDIT("SalesReportsPlusCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable since placing eBay Germany motor vehicle listings on the mobile.de site is no longer supported.
     * 					
     * 
     */
    @XmlEnumValue("CreditSearchableMobileDE")
    CREDIT_SEARCHABLE_MOBILE_DE("CreditSearchableMobileDE"),

    /**
     * 
     * 						This enumeration value is no longer applicable since this eBay Stores marketing feature is no longer supported.
     * 					
     * 
     */
    @XmlEnumValue("EmailMarketingFee")
    EMAIL_MARKETING_FEE("EmailMarketingFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable since this eBay Stores marketing feature is no longer supported.
     * 					
     * 
     */
    @XmlEnumValue("EmailMarketingCredit")
    EMAIL_MARKETING_CREDIT("EmailMarketingCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable since the picture slide show feature is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("FeePictureShow")
    FEE_PICTURE_SHOW("FeePictureShow"),

    /**
     * 
     * 						This enumeration value is no longer applicable since the picture slide show feature is no longer available.
     * 					
     * 
     */
    @XmlEnumValue("CreditPictureShow")
    CREDIT_PICTURE_SHOW("CreditPictureShow"),

    /**
     * 
     * 						This enumeration value indicates the account entry is a fee charged to the seller for using the Pro Pack Bundle feature pack (currently available to US and Canada eBay motor vehicle sellers).
     * 					
     * 
     */
    @XmlEnumValue("ProPackBundleFee")
    PRO_PACK_BUNDLE_FEE("ProPackBundleFee"),

    /**
     * 
     * 						This enumeration value indicates the account entry is a credit towards the fee charged to the seller for using the Pro Pack Bundle feature pack (currently available to US and Canada eBay motor vehicle sellers).
     * 					
     * 
     */
    @XmlEnumValue("ProPackBundleFeeCredit")
    PRO_PACK_BUNDLE_FEE_CREDIT("ProPackBundleFeeCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable since this bundle pack is no longer available on any eBay marketplaces.
     * 					
     * 
     */
    @XmlEnumValue("BasicUpgradePackBundleFee")
    BASIC_UPGRADE_PACK_BUNDLE_FEE("BasicUpgradePackBundleFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable since this bundle pack is no longer available on any eBay marketplaces.
     * 					
     * 
     */
    @XmlEnumValue("BasicUpgradePackBundleFeeCredit")
    BASIC_UPGRADE_PACK_BUNDLE_FEE_CREDIT("BasicUpgradePackBundleFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates the account entry is a fee charged by eBay to the seller for using the Value Pack Bundle feature pack.
     * 					
     * 
     */
    @XmlEnumValue("ValuePackBundleFee")
    VALUE_PACK_BUNDLE_FEE("ValuePackBundleFee"),

    /**
     * 
     * 						This enumeration value indicates the account entry is a credit towards the fee charged to the seller for using the Value Pack Bundle feature pack.
     * 					
     * 
     */
    @XmlEnumValue("ValuePackBundleFeeCredit")
    VALUE_PACK_BUNDLE_FEE_CREDIT("ValuePackBundleFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates the account entry is a fee charged by eBay to the seller for using the Pro Pack Plus Bundle feature pack.
     * 					
     * 
     */
    @XmlEnumValue("ProPackPlusBundleFee")
    PRO_PACK_PLUS_BUNDLE_FEE("ProPackPlusBundleFee"),

    /**
     * 
     * 						This enumeration value indicates the account entry is a credit towards the fee charged by eBay to the seller for using the Pro Pack Plus Bundle feature pack.
     * 					
     * 
     */
    @XmlEnumValue("ProPackPlusBundleFeeCredit")
    PRO_PACK_PLUS_BUNDLE_FEE_CREDIT("ProPackPlusBundleFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates the account entry is the final entry in a user's account before it is closed or merged with another account.
     * 					
     * 
     */
    @XmlEnumValue("FinalEntry")
    FINAL_ENTRY("FinalEntry"),

    /**
     * 
     * 						This enumeration value is Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged to the seller for using an extended listing duration.
     * 					
     * 
     */
    @XmlEnumValue("ExtendedDurationFee")
    EXTENDED_DURATION_FEE("ExtendedDurationFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit towards a fee charged to the seller for using an extended listing duration.
     * 					
     * 
     */
    @XmlEnumValue("ExtendedDurationFeeCredit")
    EXTENDED_DURATION_FEE_CREDIT("ExtendedDurationFeeCredit"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a 'cross-border trade' fee, where the seller pays an additional listing fee to have his/her listing surface in the search on another eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("InternationalListingFee")
    INTERNATIONAL_LISTING_FEE("InternationalListingFee"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a credit towards a 'cross-border trade' fee, where the seller pays an additional listing fee to have his/her listing surface in the search on another eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("InternationalListingCredit")
    INTERNATIONAL_LISTING_CREDIT("InternationalListingCredit"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a fee for an expired Terapeak Research subscription.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchExpiredSubscriptionFee")
    MARKETPLACE_RESEARCH_EXPIRED_SUBSCRIPTION_FEE("MarketplaceResearchExpiredSubscriptionFee"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a credit towards a fee for an expired Terapeak Research subscription.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchExpiredSubscriptionFeeCredit")
    MARKETPLACE_RESEARCH_EXPIRED_SUBSCRIPTION_FEE_CREDIT("MarketplaceResearchExpiredSubscriptionFeeCredit"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a fee for a Terapeak Research basic subscription.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchBasicSubscriptionFee")
    MARKETPLACE_RESEARCH_BASIC_SUBSCRIPTION_FEE("MarketplaceResearchBasicSubscriptionFee"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a credit towards a  fee for a Terapeak Research basic subscription.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchBasicSubscriptionFeeCredit")
    MARKETPLACE_RESEARCH_BASIC_SUBSCRIPTION_FEE_CREDIT("MarketplaceResearchBasicSubscriptionFeeCredit"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a fee for a Terapeak Research pro subscription.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchProSubscriptionFee")
    MARKETPLACE_RESEARCH_PRO_SUBSCRIPTION_FEE("MarketplaceResearchProSubscriptionFee"),

    /**
     * 
     * 					  This enumeration value is no longer applicable since a basic bundle pack is no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("BasicBundleFee")
    BASIC_BUNDLE_FEE("BasicBundleFee"),

    /**
     * 
     * 					  This enumeration value is no longer applicable since a basic bundle pack is no longer available on any eBay marketplace.
     * 					
     * 
     */
    @XmlEnumValue("BasicBundleFeeCredit")
    BASIC_BUNDLE_FEE_CREDIT("BasicBundleFeeCredit"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a credit towards a  fee for a Terapeak Research pro subscription.
     * 					
     * 
     */
    @XmlEnumValue("MarketplaceResearchProSubscriptionFeeCredit")
    MARKETPLACE_RESEARCH_PRO_SUBSCRIPTION_FEE_CREDIT("MarketplaceResearchProSubscriptionFeeCredit"),

    /**
     * 
     * 					  This enumeration value is no longer applicable as there are no longer any subscription fees to sell motor vehicles through Motors local listings.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalSubscriptionFee")
    VEHICLE_LOCAL_SUBSCRIPTION_FEE("VehicleLocalSubscriptionFee"),

    /**
     * 
     * 					  This enumeration value is no longer applicable as there are no longer any subscription fees to sell motor vehicles through Motors local listings.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalSubscriptionFeeCredit")
    VEHICLE_LOCAL_SUBSCRIPTION_FEE_CREDIT("VehicleLocalSubscriptionFeeCredit"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is an insertion fee for a Motors local listing.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalInsertionFee")
    VEHICLE_LOCAL_INSERTION_FEE("VehicleLocalInsertionFee"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a credit towards an insertion fee for a Motors local listing.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalInsertionFeeCredit")
    VEHICLE_LOCAL_INSERTION_FEE_CREDIT("VehicleLocalInsertionFeeCredit"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a final value fee for the sale of a motor vehicle through a Motors local listing.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalFinalValueFee")
    VEHICLE_LOCAL_FINAL_VALUE_FEE("VehicleLocalFinalValueFee"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is credit towards a final value fee for the sale of a motor vehicle through a Motors local listing.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalFinalValueFeeCredit")
    VEHICLE_LOCAL_FINAL_VALUE_FEE_CREDIT("VehicleLocalFinalValueFeeCredit"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a 'GTC' duration listing fee for a Motors local listing.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalGTCFee")
    VEHICLE_LOCAL_GTC_FEE("VehicleLocalGTCFee"),

    /**
     * 
     * 					   This enumeration value indicates that the account entry is a credit towards a 'GTC' duration listing fee for a Motors local listing.
     * 					
     * 
     */
    @XmlEnumValue("VehicleLocalGTCFeeCredit")
    VEHICLE_LOCAL_GTC_FEE_CREDIT("VehicleLocalGTCFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an eBay Motors Pro fee. Applies to eBay Motors Pro registered dealers only.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProFee")
    E_BAY_MOTORS_PRO_FEE("eBayMotorsProFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit towards an eBay Motors Pro fee. Applies to eBay Motors Pro registered dealers only.
     * 					
     * 
     */
    @XmlEnumValue("CrediteBayMotorsProFee")
    CREDITE_BAY_MOTORS_PRO_FEE("CrediteBayMotorsProFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an eBay Motors Pro fee for a Feature pack. Applies to eBay Motors Pro registered dealers only.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotorsProFeatureFee")
    E_BAY_MOTORS_PRO_FEATURE_FEE("eBayMotorsProFeatureFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit towards an eBay Motors Pro fee for a Feature pack. Applies to eBay Motors Pro registered dealers only.
     * 					
     * 
     */
    @XmlEnumValue("CrediteBayMotorsProFeatureFee")
    CREDITE_BAY_MOTORS_PRO_FEATURE_FEE("CrediteBayMotorsProFeatureFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay for listing an item with the Gallery Plus feature.
     * 					
     * 
     */
    @XmlEnumValue("FeeGalleryPlus")
    FEE_GALLERY_PLUS("FeeGalleryPlus"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit towards a fee charged by eBay for listing an item with the Gallery Plus feature.
     * 					
     * 
     */
    @XmlEnumValue("CreditGalleryPlus")
    CREDIT_GALLERY_PLUS("CreditGalleryPlus"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee for a private listing. With a private listing, bidders/buyers remain anonymous to other eBay users (besides the seller).
     * 					
     * 
     */
    @XmlEnumValue("PrivateListing")
    PRIVATE_LISTING("PrivateListing"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee for a private listing. With a private listing, bidders/buyers remain anonymous to other eBay users (besides the seller).
     * 					
     * 
     */
    @XmlEnumValue("CreditPrivateListing")
    CREDIT_PRIVATE_LISTING("CreditPrivateListing"),

    /**
     * 
     * 						This enumeration value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("ImmoProFee")
    IMMO_PRO_FEE("ImmoProFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("CreditImmoProFee")
    CREDIT_IMMO_PRO_FEE("CreditImmoProFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("ImmoProFeatureFee")
    IMMO_PRO_FEATURE_FEE("ImmoProFeatureFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("CreditImmoProFeatureFee")
    CREDIT_IMMO_PRO_FEATURE_FEE("CreditImmoProFeatureFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("RealEstateProFee")
    REAL_ESTATE_PRO_FEE("RealEstateProFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("CreditRealEstateProFee")
    CREDIT_REAL_ESTATE_PRO_FEE("CreditRealEstateProFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("RealEstateProFeatureFee")
    REAL_ESTATE_PRO_FEATURE_FEE("RealEstateProFeatureFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable, and should not be returned.
     * 					
     * 
     */
    @XmlEnumValue("CreditRealEstateProFeatureFee")
    CREDIT_REAL_ESTATE_PRO_FEATURE_FEE("CreditRealEstateProFeatureFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a seller discount against a final value fee, an insertion fee, a subscription fee, or other fee. See the corresponding <b>Description</b> and/or <b>Memo</b> fields for more information on the type of discount.
     * 					
     * 
     */
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),

    /**
     * 
     * 						 This enumeration value indicates that the account entry is a credit towards a  final value fee for the shipping cost of an order. This fee is charged when a listed item sells, and is a percentage of the shipping cost. The final value fee associated with the final sale price is returned in a <b>FeeFinalValue</b> entry.
     * 					
     * 
     */
    @XmlEnumValue("CreditFinalValueShipping")
    CREDIT_FINAL_VALUE_SHIPPING("CreditFinalValueShipping"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a final value fee for the shipping cost of an order. This fee is charged when a listed item sells, and is a percentage of the shipping cost. The final value fee associated with the final sale price is returned in a <b>FeeFinalValue</b> entry.
     * 					
     * 
     */
    @XmlEnumValue("FeeFinalValueShipping")
    FEE_FINAL_VALUE_SHIPPING("FeeFinalValueShipping"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a return shipping fee if an item is returned by the buyer.
     * 					
     * 
     */
    @XmlEnumValue("FeeReturnShipping")
    FEE_RETURN_SHIPPING("FeeReturnShipping"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit toward a return shipping fee if an item is returned by the buyer.
     * 					
     * 
     */
    @XmlEnumValue("CreditReturnShipping")
    CREDIT_RETURN_SHIPPING("CreditReturnShipping"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged by eBay if the seller is using the Global Shipping Program to ship an item internationally.
     * 					
     * 
     */
    @XmlEnumValue("FeeGlobalShippingProgram")
    FEE_GLOBAL_SHIPPING_PROGRAM("FeeGlobalShippingProgram"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit towards a fee charged by eBay if the seller is using the Global Shipping Program to ship an item internationally.
     * 					
     * 
     */
    @XmlEnumValue("CreditGlobalShippingProgram")
    CREDIT_GLOBAL_SHIPPING_PROGRAM("CreditGlobalShippingProgram"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged to the seller's account if the seller ends an auction (with bids) early.
     * 					
     * 
     */
    @XmlEnumValue("FeeAuctionEndEarly")
    FEE_AUCTION_END_EARLY("FeeAuctionEndEarly"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to the seller's account if a duplicate auction listing is ended administratively by eBay. A seller is only eligible for this credit if the auction listing had zero bids and was never surfaced in Search.
     * 					
     * 
     */
    @XmlEnumValue("CreditAuctionEndEarly")
    CREDIT_AUCTION_END_EARLY("CreditAuctionEndEarly"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged to the seller for printing out and using a FedEx shipping label from eBay.
     * 					
     * 
     */
    @XmlEnumValue("FeeFedExShippingLabel")
    FEE_FED_EX_SHIPPING_LABEL("FeeFedExShippingLabel"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued by eBay to reimburse the seller for a FedEx shipping label. In some cases, this credit may be issued to the seller as a result of an Unpaid Item case that the seller has won against a buyer.
     * 					
     * 
     */
    @XmlEnumValue("CreditFedExShippingLabel")
    CREDIT_FED_EX_SHIPPING_LABEL("CreditFedExShippingLabel"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged to the seller's account if eBay refunds the buyer in a case where the buyer has used the eBay returns process and return shipped the item to the seller, but the seller has not issued a refund to the buyer within seven business days after receiving the returned item. 
     * 					
     * 
     */
    @XmlEnumValue("FeeReturnRefund")
    FEE_RETURN_REFUND("FeeReturnRefund"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued to the buyer's account by eBay in a case where the buyer has used the eBay returns process and return shipped the item to the seller, but the seller has not issued a refund to the buyer within seven business days after receiving the returned item. The buyer credit amounts to the total purchase price plus any shipping costs if the item was 'not as described'. 
     * 					
     * 
     */
    @XmlEnumValue("CreditReturnRefund")
    CREDIT_RETURN_REFUND("CreditReturnRefund"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a fee charged for early termination of an eBay Stores subscription.
     * 					
     * 
     */
    @XmlEnumValue("FeeStoresSubscriptionEarlyTermination")
    FEE_STORES_SUBSCRIPTION_EARLY_TERMINATION("FeeStoresSubscriptionEarlyTermination"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a credit toward a fee charged for early termination of an eBay Stores subscription.
     * 					
     * 
     */
    @XmlEnumValue("CreditStoresSubscriptionEarlyTermination")
    CREDIT_STORES_SUBSCRIPTION_EARLY_TERMINATION("CreditStoresSubscriptionEarlyTermination"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a fee charged for early termination of a National Vehicle subscription.
     * 					
     * 
     */
    @XmlEnumValue("FeeVehicleSubscriptionEarlyTermination")
    FEE_VEHICLE_SUBSCRIPTION_EARLY_TERMINATION("FeeVehicleSubscriptionEarlyTermination"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a credit toward a fee charged for early termination of a National Vehicle subscription.
     * 					
     * 
     */
    @XmlEnumValue("CreditVehicleSubscriptionEarlyTermination")
    CREDIT_VEHICLE_SUBSCRIPTION_EARLY_TERMINATION("CreditVehicleSubscriptionEarlyTermination"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a monthly subscription fee charged for a National Vehicle subscription.
     * 					
     * 
     */
    @XmlEnumValue("FeeVehicleSubscription")
    FEE_VEHICLE_SUBSCRIPTION("FeeVehicleSubscription"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a credit toward a monthly subscription fee charged for a National Vehicle subscription.
     * 					
     * 
     */
    @XmlEnumValue("CreditVehicleSubscription")
    CREDIT_VEHICLE_SUBSCRIPTION("CreditVehicleSubscription"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a fee charged to the seller for printing out and using an Australia Post shipping label from eBay.
     * 					
     * 
     */
    @XmlEnumValue("FeeAUPostShippingLabel")
    FEE_AU_POST_SHIPPING_LABEL("FeeAUPostShippingLabel"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a credit toward a fee charged to the seller for printing out and using an Australia Post shipping label from eBay. In some cases, this credit may be issued to the seller as a result of an Unpaid Item case that the seller has won against a buyer.
     * 					
     * 
     */
    @XmlEnumValue("CreditAUPostShippingLabel")
    CREDIT_AU_POST_SHIPPING_LABEL("CreditAUPostShippingLabel"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a fee charged to the seller for printing out and using an FedEx shipping label from eBay in the Asia-Pacific geographical region.
     * 					
     * 
     */
    @XmlEnumValue("FeeAPACFedExShippingLabel")
    FEE_APAC_FED_EX_SHIPPING_LABEL("FeeAPACFedExShippingLabel"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a credit toward a fee charged to the seller for printing out and using an FedEx shipping label from eBay in the Asia-Pacific geographical region. In some cases, this credit may be issued to the seller as a result of an Unpaid Item case that the seller has won against a buyer.
     * 					
     * 
     */
    @XmlEnumValue("CreditAPACFedExShippingLabel")
    CREDIT_APAC_FED_EX_SHIPPING_LABEL("CreditAPACFedExShippingLabel"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a fee charged to the seller for printing out and using an Track & Trace (TNT) shipping label from eBay in the Asia-Pacific geographical region.
     * 					
     * 
     */
    @XmlEnumValue("FeeAPACTNTShippingLabel")
    FEE_APACTNT_SHIPPING_LABEL("FeeAPACTNTShippingLabel"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a credit toward a fee charged to the seller for printing out and using an Track & Trace (TNT) shipping label from eBay in the Asia-Pacific geographical region.In some cases, this credit may be issued to the seller as a result of an Unpaid Item case that the seller has won against a buyer.
     * 					
     * 
     */
    @XmlEnumValue("CreditAPACTNTShippingLabel")
    CREDIT_APACTNT_SHIPPING_LABEL("CreditAPACTNTShippingLabel"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a fee charged for eBay Money Back Guarantee reimbursement.
     * 					
     * 
     */
    @XmlEnumValue("FeeEBPReimbursement")
    FEE_EBP_REIMBURSEMENT("FeeEBPReimbursement"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a credit toward a fee charged for eBay Money Back Guarantee reimbursement.
     * 					
     * 
     */
    @XmlEnumValue("CreditEBPReimbursement")
    CREDIT_EBP_REIMBURSEMENT("CreditEBPReimbursement"),

    /**
     * 
     * 					 This value is deprecated. Instead, Promoted Listing fees are returned as <code>FeeAd</code> for a Standard Promoted Listing ad on eBay or <code>AdFeePremium</code> for an Advanced Promoted Listing ad on eBay.
     * 					
     * 
     */
    @XmlEnumValue("FeePromotedListingFeature")
    FEE_PROMOTED_LISTING_FEATURE("FeePromotedListingFeature"),

    /**
     * 
     * 						This value is deprecated. Instead, Promoted Listing credits are returned as <code>CreditAd</code> for a Standard Promoted Listing ad on eBay or <code>AdFeePremiumCredit</code> for an Advanced Promoted Listing ad on eBay.
     * 					
     * 
     */
    @XmlEnumValue("CreditPromotedListingFeature")
    CREDIT_PROMOTED_LISTING_FEATURE("CreditPromotedListingFeature"),

    /**
     * 
     * 					  This enumeration value indicates that the account entry is a fee charged for a Standard Promoted Listing ad on eBay. With Standard Promoted Listings, the seller is charged a fee when a buyer clicks on the ad and then goes on to purchase that same item within 30 days of that click. The seller chooses the bid percentage for the ad, and this rate is applied toward the total purchase price.
     * 					
     * 
     */
    @XmlEnumValue("FeeAd")
    FEE_AD("FeeAd"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit issued toward a Standard Promoted Listing ad fee.
     * 					
     * 
     */
    @XmlEnumValue("CreditAd")
    CREDIT_AD("CreditAd"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a fee charged to the seller for printing out and using a Universal Business Integration (UBI) shipping label from eBay.
     * 					
     * 
     */
    @XmlEnumValue("FeeUBIShippingLabel")
    FEE_UBI_SHIPPING_LABEL("FeeUBIShippingLabel"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a credit issued by eBay to reimburse the seller for a Universal Business Integration (UBI) shipping label. In some cases, this credit may be issued to the seller as a result of an Unpaid Item case that the seller has won against a buyer.
     * 					
     * 
     */
    @XmlEnumValue("CreditUBIShippingLabel")
    CREDIT_UBI_SHIPPING_LABEL("CreditUBIShippingLabel"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is an annual subscription fee charged for an eBay Plus subscription.
     * 					
     * 
     */
    @XmlEnumValue("FeeeBayPlusSubscription")
    FEEE_BAY_PLUS_SUBSCRIPTION("FeeeBayPlusSubscription"),

    /**
     * 
     * 					 This enumeration value indicates that the account entry is a credit toward an annual subscription fee charged for an eBay Plus subscription.
     * 					
     * 
     */
    @XmlEnumValue("CrediteBayPlusSubscription")
    CREDITE_BAY_PLUS_SUBSCRIPTION("CrediteBayPlusSubscription"),

    /**
     * 
     * 						This enumeration value indicates that the charge is a payment processing fee for the order. This fee is only applied at the order level, and the amount of the fee will be the same, regardless of how many line items are in the order or on the total cost of the order. Typically, this fee is $0.30. 
     * 					
     * 
     */
    @XmlEnumValue("PaymentIntermediationFee")
    PAYMENT_INTERMEDIATION_FEE("PaymentIntermediationFee"),

    /**
     * 
     * 						This enumeration value indicates that the credit is for a payment processing fee for the order. 
     * 					
     * 
     */
    @XmlEnumValue("PaymentIntermediationFeeCredit")
    PAYMENT_INTERMEDIATION_FEE_CREDIT("PaymentIntermediationFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the charge is a payment processing fee for the order. This fee is only applied at the order level, and the amount of the fee will be the same, regardless of how many line items are in the order or on the total cost of the order. Typically, this fee is $0.30. 
     * 					
     * 
     */
    @XmlEnumValue("FeePaymentIntermediationRVI")
    FEE_PAYMENT_INTERMEDIATION_RVI("FeePaymentIntermediationRVI"),

    /**
     * 
     * 						This enumeration value indicates the credit is a seller reimbursement for an eBay payment intermediation fee.
     * 					
     * 
     */
    @XmlEnumValue("FeePaymentIntermediationChargeback")
    FEE_PAYMENT_INTERMEDIATION_CHARGEBACK("FeePaymentIntermediationChargeback"),

    /**
     * 
     * 						This enumeration value indicates the invoice credit is a seller reimbursement for an eBay payment intermediation fee.
     * 					
     * 
     */
    @XmlEnumValue("FeePaymentIntermediationChargebackRVI")
    FEE_PAYMENT_INTERMEDIATION_CHARGEBACK_RVI("FeePaymentIntermediationChargebackRVI"),

    /**
     * 
     * 						This enumeration value indicates the invoice charge is a Final Value Fee (for item cost) charged to the seller's account after a buyer creates and wins a 'significantly not as described' (SNAD) case against the seller.
     * 					
     * 
     */
    @XmlEnumValue("SnadOutlierFinalValueFee")
    SNAD_OUTLIER_FINAL_VALUE_FEE("SnadOutlierFinalValueFee"),

    /**
     * 
     * 						This enumeration value indicates the invoice charge is a Final Value Fee (for shipping cost) charged to the seller's account after a buyer creates and wins a 'significantly not as described' (SNAD) case against the seller.
     * 					
     * 
     */
    @XmlEnumValue("SnadOutlierFinalValueFeeOnShipping")
    SNAD_OUTLIER_FINAL_VALUE_FEE_ON_SHIPPING("SnadOutlierFinalValueFeeOnShipping"),

    /**
     * 
     * 						This enumeration value indicates the invoice charge is for a 'Highline Search' fee, which is a capability that allows sellers to advertise multiple products at the same time, with ads appearing prominently on top of eBay's search results.
     * 					
     * 
     */
    @XmlEnumValue("HighlineSearchFee")
    HIGHLINE_SEARCH_FEE("HighlineSearchFee"),

    /**
     * 
     * 						This enumeration value indicates the invoice credit is for a 'Highline Search' fee that was charged to the seller's account. The 'Highline Search' capability allows sellers to advertise multiple products at the same time, with ads appearing prominently on top of eBay's search results.
     * 					
     * 
     */
    @XmlEnumValue("HighlineSearchFeeCredit")
    HIGHLINE_SEARCH_FEE_CREDIT("HighlineSearchFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates the invoice credit is for a Final Value Fee (for item cost) that was charged to the seller's account after a buyer created a 'significantly not as described' (SNAD) case against the seller, but the seller won the case.
     * 					
     * 
     */
    @XmlEnumValue("SnadOutlierFinalValueFeeCredit")
    SNAD_OUTLIER_FINAL_VALUE_FEE_CREDIT("SnadOutlierFinalValueFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates the invoice credit is for a Final Value Fee (for shipping cost) that was charged to the seller's account after a buyer created a 'significantly not as described' (SNAD) case against the seller, but the seller won the case.
     * 					
     * 
     */
    @XmlEnumValue("SnadOutlierFinalValueFeeOnShippingCredit")
    SNAD_OUTLIER_FINAL_VALUE_FEE_ON_SHIPPING_CREDIT("SnadOutlierFinalValueFeeOnShippingCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a fee charged for a Advanced Promoted Listing ad on eBay. With Advanced Promoted Listings, the seller uses keywords to promote the listing, and if buyers find the listing based on a keyword defined in the seller's Promoted Listings campaign, the seller is charged a fee each time the ad is clicked. The seller chooses the bid percentage rate for the ad, and this rate is charged for each click on the ad.
     * 					
     * 
     */
    @XmlEnumValue("AdFeePremium")
    AD_FEE_PREMIUM("AdFeePremium"),

    /**
     * 
     * 						This enumeration value indicates that a credit was issued toward an Advanced Promoted Listing ad fee.
     * 					
     * 
     */
    @XmlEnumValue("AdFeePremiumCredit")
    AD_FEE_PREMIUM_CREDIT("AdFeePremiumCredit"),

    /**
     * 
     * 						This enumeration value is no longer applicable, and should not be returned. Instead, the payment processing fee for all orders is represented with the <code>FinalValueFeeFixedFeePerOrder</code> value. 
     * 					
     * 
     */
    @XmlEnumValue("PerListingPaymentsFee")
    PER_LISTING_PAYMENTS_FEE("PerListingPaymentsFee"),

    /**
     * 
     * 						This enumeration value is no longer applicable, and should not be returned. Instead, any credit for a payment processing fee is represented with the <code>FinalValueFeeFixedFeePerOrderCredit</code> value. 
     * 					
     * 
     */
    @XmlEnumValue("PerListingPaymentsFeeCredit")
    PER_LISTING_PAYMENTS_FEE_CREDIT("PerListingPaymentsFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates the invoice charge is for a Vehicles Listing Basic Package fee.
     * 					
     * 
     */
    @XmlEnumValue("VehiclesListingBasicPackageFee")
    VEHICLES_LISTING_BASIC_PACKAGE_FEE("VehiclesListingBasicPackageFee"),

    /**
     * 
     * 						This enumeration value indicates that a credit was issued for a Vehicles Listing Basic Package fee charge.
     * 					
     * 
     */
    @XmlEnumValue("VehiclesListingBasicPackageCredit")
    VEHICLES_LISTING_BASIC_PACKAGE_CREDIT("VehiclesListingBasicPackageCredit"),

    /**
     * 
     * 						This enumeration value indicates the invoice charge is for a Vehicles Listing Plus Package fee.
     * 					
     * 
     */
    @XmlEnumValue("VehiclesListingPlusPackageFee")
    VEHICLES_LISTING_PLUS_PACKAGE_FEE("VehiclesListingPlusPackageFee"),

    /**
     * 
     * 						This enumeration value indicates that a credit was issued for a Vehicles Listing Plus Package fee charge.
     * 					
     * 
     */
    @XmlEnumValue("VehiclesListingPlusPackageCredit")
    VEHICLES_LISTING_PLUS_PACKAGE_CREDIT("VehiclesListingPlusPackageCredit"),

    /**
     * 
     * 						This enumeration value indicates the invoice charge is for a Vehicles Listing Premium Package fee.
     * 					
     * 
     */
    @XmlEnumValue("VehiclesListingPremiumPackageFee")
    VEHICLES_LISTING_PREMIUM_PACKAGE_FEE("VehiclesListingPremiumPackageFee"),

    /**
     * 
     * 						This enumeration value indicates that a credit was issued for a Vehicles Listing Premium Package fee charge.
     * 					
     * 
     */
    @XmlEnumValue("VehiclesListingPremiumPackageCredit")
    VEHICLES_LISTING_PREMIUM_PACKAGE_CREDIT("VehiclesListingPremiumPackageCredit"),

    /**
     * 
     * 						This enumeration value indicates the invoice charge is for a Send Label fee.
     * 					
     * 
     */
    @XmlEnumValue("SendLabelFee")
    SEND_LABEL_FEE("SendLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that a credit was issued for a Send Label fee charge.
     * 					
     * 
     */
    @XmlEnumValue("SendLabelFeeCredit")
    SEND_LABEL_FEE_CREDIT("SendLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates the invoice charge is for a UPS Label fee.
     * 					
     * 
     */
    @XmlEnumValue("UpsLabelFee")
    UPS_LABEL_FEE("UpsLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that a credit was issued for a UPS Label fee charge.
     * 					
     * 
     */
    @XmlEnumValue("UpsLabelFeeCredit")
    UPS_LABEL_FEE_CREDIT("UpsLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates the invoice charge is for a Canada Post Label fee.
     * 					
     * 
     */
    @XmlEnumValue("CanadaPostLabelFee")
    CANADA_POST_LABEL_FEE("CanadaPostLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that a credit was issued for a Canada Post Label fee charge.
     * 					
     * 
     */
    @XmlEnumValue("CanadaPostLabelFeeCredit")
    CANADA_POST_LABEL_FEE_CREDIT("CanadaPostLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates the invoice charge is for eBay having to resend/regenerate a shipping label for a seller. Sellers typically have 24 hours to reprint a shipping label 24 hours after the purchase of the shipping label. If a seller tries to reprint a purchased shipping label after this time, a small fee may apply.
     * 					
     * 
     */
    @XmlEnumValue("EbaySendLabelFee")
    EBAY_SEND_LABEL_FEE("EbaySendLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that a credit was issued for the fee charged by eBay to resend/regenerate a shipping label for the seller.
     * 					
     * 
     */
    @XmlEnumValue("EbaySendLabelFeeCredit")
    EBAY_SEND_LABEL_FEE_CREDIT("EbaySendLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("USInternetSalesTax")
    US_INTERNET_SALES_TAX("USInternetSalesTax"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("USInternetSalesTaxCredit")
    US_INTERNET_SALES_TAX_CREDIT("USInternetSalesTaxCredit"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("NewZealandGST")
    NEW_ZEALAND_GST("NewZealandGST"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("NewZealandGSTCredit")
    NEW_ZEALAND_GST_CREDIT("NewZealandGSTCredit"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("AustraliaGST")
    AUSTRALIA_GST("AustraliaGST"),

    /**
     * 
     * 						This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("AustraliaGSTCredit")
    AUSTRALIA_GST_CREDIT("AustraliaGSTCredit"),

    /**
     * 
     * 						This enumeration value indicates that eBay is billing the seller for a USPS shipping label that was purchased through the seller's eBay account.
     * 					
     * 
     */
    @XmlEnumValue("UspsLabelFee")
    USPS_LABEL_FEE("UspsLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that eBay is giving a credit to the seller for a USPS shipping label that was purchased through the seller's eBay account.
     * 					
     * 
     */
    @XmlEnumValue("UspsLabelFeeCredit")
    USPS_LABEL_FEE_CREDIT("UspsLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that eBay is billing the seller for shipping insurance (such as ShipCover through USPS) that was purchased through the seller's eBay account.
     * 					
     * 
     */
    @XmlEnumValue("ShippingInsuranceFee")
    SHIPPING_INSURANCE_FEE("ShippingInsuranceFee"),

    /**
     * 
     * 						This enumeration value indicates that eBay is giving a credit to the seller for shipping insurance (such as ShipCover through USPS) that was purchased through the seller's eBay account.
     * 					
     * 
     */
    @XmlEnumValue("ShippingInsuranceFeeCredit")
    SHIPPING_INSURANCE_FEE_CREDIT("ShippingInsuranceFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that eBay is billing the seller for underpayment for a USPS shipping label that was purchased through the seller's eBay account. Underpayment may occur if the seller paid for a shipping label based on specific package weight and dimensions, but either or both package weight and dimensions were not accurate, hence the seller owes more money to USPS for postage.
     * 					
     * 
     */
    @XmlEnumValue("UspsShortpaidFee")
    USPS_SHORTPAID_FEE("UspsShortpaidFee"),

    /**
     * 
     * 						This enumeration value indicates that eBay is giving credit to the seller for underpayment for a USPS shipping label that was purchased through the seller's eBay account. Underpayment may occur if the seller paid for a shipping label based on specific package weight and dimensions, but either or both package weight and dimensions were not accurate, hence the seller owes more money to USPS for postage.
     * 					
     * 
     */
    @XmlEnumValue("UspsShortpaidFeeCredit")
    USPS_SHORTPAID_FEE_CREDIT("UspsShortpaidFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that eBay is billing the seller for a co-funding charge.
     * 					
     * 
     */
    @XmlEnumValue("CoFundingCharge")
    CO_FUNDING_CHARGE("CoFundingCharge"),

    /**
     * 
     * 						This enumeration value indicates that eBay is giving credit to the seller for a co-funding charge.
     * 					
     * 
     */
    @XmlEnumValue("CoFundingChargeCredit")
    CO_FUNDING_CHARGE_CREDIT("CoFundingChargeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a final value fee, which is a fee that is calculated as a percentage of the total amount of the order, including the purchase price and any shipping and handling charges. This fee is always deducted directly from the seller payout associated with the order. 
     * 						<br><br>
     * 						For more information about how transaction fees are handled, see the <a href="https://www.ebay.com/help/selling/fees-credits-invoices/selling-fees?id=4822#section2" target="_blank">Selling fees</a> help page.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("FinalValueFee")
    FINAL_VALUE_FEE("FinalValueFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit towards a final value fee calculated for an order. The seller may get this credit for different reasons, including if the buyer cancels the order, or the buyer doesn't pay for the order and the seller files and wins an Unpaid Item case.
     * 					
     * 
     */
    @XmlEnumValue("FinalValueFeeCredit")
    FINAL_VALUE_FEE_CREDIT("FinalValueFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an international fee, which is a fee that is calculated as a percentage of the total amount of the order, and is applicable for international buyers. This fee is always deducted directly from the seller payout associated with the order.
     * 						<br><br>
     * 						<span class="tablenote"><b>Note: </b>
     * 						For more information about this international fee, see the <a href="https://www.ebay.com/help/selling/fees-credits-invoices/selling-fees?id=4822#section8" target="_blank">Selling fees</a> help page.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("InternationalFee")
    INTERNATIONAL_FEE("InternationalFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit towards an international fee calculated for an order. The seller may get this credit for different reasons, including if the buyer cancels the order, or the buyer doesn't pay for the order and the seller files and wins an Unpaid Item case.
     * 					
     * 
     */
    @XmlEnumValue("InternationalFeeCredit")
    INTERNATIONAL_FEE_CREDIT("InternationalFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a payment processing fee, which is a fixed fee that is charged for all orders. This fixed fee may vary by country, but it is currently $0.30 in the US. This fee is always deducted directly from the seller payout associated with the order. 
     * 						<br><br>
     * 						<span class="tablenote"><b>Note: </b>
     * 						For more information about how transaction fees are handled, see the <a href="https://www.ebay.com/help/selling/fees-credits-invoices/selling-fees?id=4822#section2" target="_blank">Selling fees</a> help page.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("FinalValueFeeFixedFeePerOrder")
    FINAL_VALUE_FEE_FIXED_FEE_PER_ORDER("FinalValueFeeFixedFeePerOrder"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit against a payment processing fee. Except for perhaps a very unlikely and unusual situation, the payment processing fee will generally not be refunded to the seller.
     * 					
     * 
     */
    @XmlEnumValue("FinalValueFeeFixedFeePerOrderCredit")
    FINAL_VALUE_FEE_FIXED_FEE_PER_ORDER_CREDIT("FinalValueFeeFixedFeePerOrderCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is an additional final value fee for a Below Standard seller. Typically, this fee will be an additional 5 percent (on top of standard final value fee) of the total amount of the order, including the purchase price and any shipping and handling charges. It is possible that this fee may also be charged to an Above Standard or Top-rated seller if that seller is having an issue with 'item not as described' return requests. This fee is always deducted directly from the seller payout associated with the order.
     * 						<br><br>
     * 						<span class="tablenote"><b>Note: </b>
     * 						For more information about this additional final value fee for sellers, see the <a href="https://www.ebay.com/help/selling/fees-credits-invoices/selling-fees?id=4822#section6" target="_blank">Selling fees</a> help page.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("FinalValueFeeBelowStandard")
    FINAL_VALUE_FEE_BELOW_STANDARD("FinalValueFeeBelowStandard"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit against an additional final value fee for a Below Standard seller.
     * 					
     * 
     */
    @XmlEnumValue("FinalValueFeeBelowStandardCredit")
    FINAL_VALUE_FEE_BELOW_STANDARD_CREDIT("FinalValueFeeBelowStandardCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a Promoted Listing Express fee.
     * 					
     * 
     */
    @XmlEnumValue("AdFeeExpress")
    AD_FEE_EXPRESS("AdFeeExpress"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit applied against a Promoted Listing Express fee.
     * 					
     * 
     */
    @XmlEnumValue("AdFeeExpressCredit")
    AD_FEE_EXPRESS_CREDIT("AdFeeExpressCredit"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a Motor Vehicles Deposit processing fee. eBay charges the seller a 2.8 percent processing fee (against the required deposit amount) when they sell their vehicle through a listing that required that the buyer make an initial deposit for the vehicle.
     * 					
     * 
     */
    @XmlEnumValue("DepositProcessingFee")
    DEPOSIT_PROCESSING_FEE("DepositProcessingFee"),

    /**
     * 
     * 						This enumeration value indicates that the account entry is a credit applied against a Motor Vehicles Deposit processing fee.
     * 					
     * 
     */
    @XmlEnumValue("DepositProcessingFeeCredit")
    DEPOSIT_PROCESSING_FEE_CREDIT("DepositProcessingFeeCredit"),

    /**
     * 
     * 						This enumeration value is deprecated. All Motor Vehicles Deposit processing fees are indicated with the <code>DepositProcessingFee</code> value.
     * 					
     * 
     */
    @XmlEnumValue("DepositProcessingFixedFee")
    DEPOSIT_PROCESSING_FIXED_FEE("DepositProcessingFixedFee"),

    /**
     * 
     * 						This enumeration value is deprecated. All credits against Motor Vehicles Deposit processing fees are indicated with the <code>DepositProcessingFeeCredit</code> value.
     * 					
     * 
     */
    @XmlEnumValue("DepositProcessingFixedFeeCredit")
    DEPOSIT_PROCESSING_FIXED_FEE_CREDIT("DepositProcessingFixedFeeCredit"),

    /**
     * 
     * 					This enumeration value indicates that the seller was charged a fee for a FedEx return shipping label.
     * 				 
     * 
     */
    @XmlEnumValue("FedExReturnLabelFee")
    FED_EX_RETURN_LABEL_FEE("FedExReturnLabelFee"),

    /**
     * 
     * 					This enumeration value indicates that the seller received a credit against a fee for a FedEx return shipping label.
     * 				 
     * 
     */
    @XmlEnumValue("FedExReturnLabelFeeCredit")
    FED_EX_RETURN_LABEL_FEE_CREDIT("FedExReturnLabelFeeCredit"),

    /**
     * 
     * 					This enumeration value indicates that the seller was charged a fee for an Australia Post return shipping label.
     * 				 
     * 
     */
    @XmlEnumValue("AUPostReturnLabelFee")
    AU_POST_RETURN_LABEL_FEE("AUPostReturnLabelFee"),

    /**
     * 
     * 					This enumeration value indicates that the seller received a credit against a fee for an Australia Post return shipping label.
     * 				 
     * 
     */
    @XmlEnumValue("AUPostReturnLabelFeeCredit")
    AU_POST_RETURN_LABEL_FEE_CREDIT("AUPostReturnLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for a UPS Canada shipping label.
     * 					
     * 
     */
    @XmlEnumValue("UpsCaLabelFee")
    UPS_CA_LABEL_FEE("UpsCaLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller received a credit against a fee for a UPS Canada shipping label.
     * 					
     * 
     */
    @XmlEnumValue("UpsCaLabelFeeCredit")
    UPS_CA_LABEL_FEE_CREDIT("UpsCaLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for a FedEx Canada shipping label.
     * 					
     * 
     */
    @XmlEnumValue("FedExCaLabelFee")
    FED_EX_CA_LABEL_FEE("FedExCaLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller received a credit against a fee for a FedEx Canada shipping label.
     * 					
     * 
     */
    @XmlEnumValue("FedExCaLabelFeeCredit")
    FED_EX_CA_LABEL_FEE_CREDIT("FedExCaLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for a Hubbed return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("HubbedReturnLabelFee")
    HUBBED_RETURN_LABEL_FEE("HubbedReturnLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller received a credit against a fee for a Hubbed return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("HubbedReturnLabelFeeCredit")
    HUBBED_RETURN_LABEL_FEE_CREDIT("HubbedReturnLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for a Royal Mail return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("RoyalMailReturnLabelFee")
    ROYAL_MAIL_RETURN_LABEL_FEE("RoyalMailReturnLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller received a credit against a fee for a Royal Mail return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("RoyalMailReturnLabelFeeCredit")
    ROYAL_MAIL_RETURN_LABEL_FEE_CREDIT("RoyalMailReturnLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for a Parcel Force Post return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("ParcelForcePostReturnLabelFee")
    PARCEL_FORCE_POST_RETURN_LABEL_FEE("ParcelForcePostReturnLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller received a credit against a fee for a Parcel Force Post return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("ParcelForcePostReturnLabelFeeCredit")
    PARCEL_FORCE_POST_RETURN_LABEL_FEE_CREDIT("ParcelForcePostReturnLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for offsite ad clicks for a Promoted Listing Advanced campaign.
     * 					
     * 
     */
    @XmlEnumValue("OffsiteAdsFee")
    OFFSITE_ADS_FEE("OffsiteAdsFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against a fee for offsite ad clicks for a Promoted Listing Advanced campaign.
     * 					
     * 
     */
    @XmlEnumValue("OffsiteAdsFeeCredit")
    OFFSITE_ADS_FEE_CREDIT("OffsiteAdsFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for Promoted Display.
     * 					
     * 
     */
    @XmlEnumValue("PromotedDisplayFee")
    PROMOTED_DISPLAY_FEE("PromotedDisplayFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against a fee for Promoted Display.
     * 					
     * 
     */
    @XmlEnumValue("PromotedDisplayFeeCredit")
    PROMOTED_DISPLAY_FEE_CREDIT("PromotedDisplayFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that US Federal tax was witheld and deducted from the seller's payout funds.
     * 					
     * 
     */
    @XmlEnumValue("USWHTFederal")
    USWHT_FEDERAL("USWHTFederal"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against US Federal tax that was witheld and deducted from the seller's payout funds.
     * 					
     * 
     */
    @XmlEnumValue("USWHTFederalCredit")
    USWHT_FEDERAL_CREDIT("USWHTFederalCredit"),

    /**
     * 
     * 						This enumeration value indicates that US State tax was witheld and deducted from the seller's payout funds.
     * 					
     * 
     */
    @XmlEnumValue("USWHTState")
    USWHT_STATE("USWHTState"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against US State tax that was witheld and deducted from the seller's payout funds.
     * 					
     * 
     */
    @XmlEnumValue("USWHTStateCredit")
    USWHT_STATE_CREDIT("USWHTStateCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged an Eco Participation fee.
     * 					
     * 
     */
    @XmlEnumValue("EPRFee")
    EPR_FEE("EPRFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against an Eco Participation fee.
     * 					
     * 
     */
    @XmlEnumValue("EPRFeeCredit")
    EPR_FEE_CREDIT("EPRFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for a Canadian Post return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("CAPostReturnLabelFee")
    CA_POST_RETURN_LABEL_FEE("CAPostReturnLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against a fee for a Canadian Post return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("CAPostReturnLabelFeeCredit")
    CA_POST_RETURN_LABEL_FEE_CREDIT("CAPostReturnLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for a Hermes return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("HermesReturnLabelFee")
    HERMES_RETURN_LABEL_FEE("HermesReturnLabelFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against a fee for a Hermes return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("HermesReturnLabelFeeCredit")
    HERMES_RETURN_LABEL_FEE_CREDIT("HermesReturnLabelFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for a payout to their bank account.
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b> This fee is for future use, and will initially only apply to sellers based in mainland China if they choose to receive payout funds through a bank account instead of through their Payoneer account. </span>
     * 					
     * 
     */
    @XmlEnumValue("BankPayoutFee")
    BANK_PAYOUT_FEE("BankPayoutFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against a fee for a payout to their bank account.
     * 					
     * 
     */
    @XmlEnumValue("BankPayoutFeeCredit")
    BANK_PAYOUT_FEE_CREDIT("BankPayoutFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller donated a portion of their sale proceeds to a charitable organization.
     * 					
     * 
     */
    @XmlEnumValue("CharityDonation")
    CHARITY_DONATION("CharityDonation"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against a donation to a charitable organization.
     * 					
     * 
     */
    @XmlEnumValue("CharityDonationCredit")
    CHARITY_DONATION_CREDIT("CharityDonationCredit"),

    /**
     * 
     * 						This enumeration value indicates the fee charged by eBay when a seller requests a payout through a debit card.
     * 					
     * 
     */
    @XmlEnumValue("ExpressPayoutFee")
    EXPRESS_PAYOUT_FEE("ExpressPayoutFee"),

    /**
     * 
     * 						This enumeration value indicates that the fee charged to the seller for a direct payout failed and the fee will be credited back to the seller's debit card.
     * 					
     * 
     */
    @XmlEnumValue("ExpressPayoutFeeCredit")
    EXPRESS_PAYOUT_FEE_CREDIT("ExpressPayoutFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates the seller was charged a fee for a Hermes return shipping label and any applicable tax. Return shipping labels are subject to tax, which is payable by the seller.
     * 					
     * 
     */
    @XmlEnumValue("HermesReturnLblSellerPaidShpFee")
    HERMES_RETURN_LBL_SELLER_PAID_SHP_FEE("HermesReturnLblSellerPaidShpFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against a fee for a Hermes return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("HermesReturnLblSellerPaidShpFeeCr")
    HERMES_RETURN_LBL_SELLER_PAID_SHP_FEE_CR("HermesReturnLblSellerPaidShpFeeCr"),

    /**
     * 
     * 						This enumeration value indicates the seller was charged a fee for a DHL return shipping label and any applicable tax. Return shipping labels are subject to tax, which is payable by the seller.
     * 					
     * 
     */
    @XmlEnumValue("DHLReturnLblShippingFee")
    DHL_RETURN_LBL_SHIPPING_FEE("DHLReturnLblShippingFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against a fee for a DHL return shipping label.
     * 					
     * 
     */
    @XmlEnumValue("DHLReturnLblShippingFeeCredit")
    DHL_RETURN_LBL_SHIPPING_FEE_CREDIT("DHLReturnLblShippingFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that a fee is charged by eBay to cover the costs associated with complying with regulatory requirements in specific marketplaces.
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b> Currently, this fee is only applicable in the following marketplaces: United Kingdom, Italy, France, Spain, Austria, Belgium (Dutch), Belgium (French), Poland, Ireland, and Switzerland. </span>
     * 					
     * 
     */
    @XmlEnumValue("RegulatoryOperatingFee")
    REGULATORY_OPERATING_FEE("RegulatoryOperatingFee"),

    /**
     * 
     * 						This enumeration value indicates that a credit against a fee to cover the costs associated with complying with regulatory requirements in specific marketplaces was issued.
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b> Currently, this fee is only applicable in the following marketplaces: United Kingdom, Italy, France, Spain, Austria, Belgium (Dutch), Belgium (French), Poland, Ireland, and Switzerland. </span>						
     * 					
     * 
     */
    @XmlEnumValue("RegulatoryOperatingFeeCredit")
    REGULATORY_OPERATING_FEE_CREDIT("RegulatoryOperatingFeeCredit"),

    /**
     * 
     * 						This enumeration value indicates that the seller was charged a fee for DHL processing.
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b> Currently, this fee is only applicable in the German marketplace. </span>
     * 					
     * 
     */
    @XmlEnumValue("DHLPaymentProcessingFee")
    DHL_PAYMENT_PROCESSING_FEE("DHLPaymentProcessingFee"),

    /**
     * 
     * 						This enumeration value indicates that the seller was issued a credit against a fee charged a fee for DHL processing.
     * 						<span class="tablenote"><b>Note:</b> Currently, this fee is only applicable in the German marketplace. </span>
     * 					
     * 
     */
    @XmlEnumValue("DHLPaymentProcessingFeeCredit")
    DHL_PAYMENT_PROCESSING_FEE_CREDIT("DHLPaymentProcessingFeeCredit");
    private final String value;

    AccountDetailEntryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountDetailEntryCodeType fromValue(String v) {
        for (AccountDetailEntryCodeType c: AccountDetailEntryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
