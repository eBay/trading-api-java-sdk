
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingServiceCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingServiceCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UPSGround"/>
 *     &lt;enumeration value="UPS3rdDay"/>
 *     &lt;enumeration value="UPS2ndDay"/>
 *     &lt;enumeration value="UPSNextDay"/>
 *     &lt;enumeration value="USPSPriority"/>
 *     &lt;enumeration value="USPSParcel"/>
 *     &lt;enumeration value="USPSStandardPost"/>
 *     &lt;enumeration value="USPSMedia"/>
 *     &lt;enumeration value="USPSFirstClass"/>
 *     &lt;enumeration value="ShippingMethodStandard"/>
 *     &lt;enumeration value="ShippingMethodExpress"/>
 *     &lt;enumeration value="USPSExpressMail"/>
 *     &lt;enumeration value="UPSNextDayAir"/>
 *     &lt;enumeration value="UPS2DayAirAM"/>
 *     &lt;enumeration value="USPSExpressMailFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSExpressMailPaddedFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSPriorityMailFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSPriorityMailSmallFlatRateBox"/>
 *     &lt;enumeration value="USPSPriorityMailFlatRateBox"/>
 *     &lt;enumeration value="USPSPriorityMailLargeFlatRateBox"/>
 *     &lt;enumeration value="USPSPriorityMailPaddedFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSPriorityMailLegalFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSExpressMailLegalFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSPriorityMailRegionalBoxA"/>
 *     &lt;enumeration value="USPSPriorityMailRegionalBoxB"/>
 *     &lt;enumeration value="USPSPriorityMailRegionalBoxC"/>
 *     &lt;enumeration value="USPSExpressMailFlatRateBox"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="LocalDelivery"/>
 *     &lt;enumeration value="NotSelected"/>
 *     &lt;enumeration value="InternationalNotSelected"/>
 *     &lt;enumeration value="StandardInternational"/>
 *     &lt;enumeration value="ExpeditedInternational"/>
 *     &lt;enumeration value="USPSGlobalExpress"/>
 *     &lt;enumeration value="USPSGlobalPriority"/>
 *     &lt;enumeration value="USPSEconomyParcel"/>
 *     &lt;enumeration value="USPSEconomyLetter"/>
 *     &lt;enumeration value="USPSAirmailLetter"/>
 *     &lt;enumeration value="USPSAirmailParcel"/>
 *     &lt;enumeration value="UPSWorldWideExpressPlus"/>
 *     &lt;enumeration value="UPSWorldWideExpress"/>
 *     &lt;enumeration value="UPSWorldWideExpedited"/>
 *     &lt;enumeration value="UPSWorldwideSaver"/>
 *     &lt;enumeration value="UPSStandardToCanada"/>
 *     &lt;enumeration value="USPSExpressMailInternationalFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSExpressMailInternationalPaddedFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSPriorityMailInternationalFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSPriorityMailInternationalSmallFlatRateBox"/>
 *     &lt;enumeration value="USPSPriorityMailInternationalFlatRateBox"/>
 *     &lt;enumeration value="USPSPriorityMailInternationalLargeFlatRateBox"/>
 *     &lt;enumeration value="USPSPriorityMailInternationalPaddedFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSPriorityMailInternationalLegalFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSExpressMailInternationalLegalFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSExpressMailInternationalFlatRateBox"/>
 *     &lt;enumeration value="OtherInternational"/>
 *     &lt;enumeration value="AT_StandardDispatch"/>
 *     &lt;enumeration value="AT_InsuredDispatch"/>
 *     &lt;enumeration value="AT_Writing"/>
 *     &lt;enumeration value="AT_COD"/>
 *     &lt;enumeration value="AT_ExpressOrCourier"/>
 *     &lt;enumeration value="AT_InsuredExpressOrCourier"/>
 *     &lt;enumeration value="AT_SpecialDispatch"/>
 *     &lt;enumeration value="AT_InsuredSpecialDispatch"/>
 *     &lt;enumeration value="AT_Sonstige"/>
 *     &lt;enumeration value="AT_UnversicherterVersandInternational"/>
 *     &lt;enumeration value="AT_VersicherterVersandInternational"/>
 *     &lt;enumeration value="AT_SonstigerVersandInternational"/>
 *     &lt;enumeration value="AT_UnversicherterExpressVersandInternational"/>
 *     &lt;enumeration value="AT_VersicherterExpressVersandInternational"/>
 *     &lt;enumeration value="AT_EconomyDeliveryFromAbroad"/>
 *     &lt;enumeration value="AT_StandardDeliveryFromAbroad"/>
 *     &lt;enumeration value="AT_ExpressDeliveryFromAbroad"/>
 *     &lt;enumeration value="AT_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="AU_Regular"/>
 *     &lt;enumeration value="AU_Express"/>
 *     &lt;enumeration value="AU_Registered"/>
 *     &lt;enumeration value="AU_Courier"/>
 *     &lt;enumeration value="AU_Other"/>
 *     &lt;enumeration value="AU_EMSInternationalCourierParcels"/>
 *     &lt;enumeration value="AU_EMSInternationalCourierDocuments"/>
 *     &lt;enumeration value="AU_ExpressPostInternationalDocuments"/>
 *     &lt;enumeration value="AU_AirMailInternational"/>
 *     &lt;enumeration value="AU_EconomyAirInternational"/>
 *     &lt;enumeration value="AU_SeaMailInternational"/>
 *     &lt;enumeration value="AU_StandardInternational"/>
 *     &lt;enumeration value="AU_ExpeditedInternational"/>
 *     &lt;enumeration value="AU_OtherInternational"/>
 *     &lt;enumeration value="AU_AusPostRegisteredPostInternationalPaddedBag1kg"/>
 *     &lt;enumeration value="AU_AusPostRegisteredPostInternationalPaddedBag500g"/>
 *     &lt;enumeration value="AU_AusPostRegisteredPostInternationalParcel"/>
 *     &lt;enumeration value="AU_ExpeditedDeliveryFromOutsideAU"/>
 *     &lt;enumeration value="AU_EconomyDeliveryFromOutsideAU"/>
 *     &lt;enumeration value="AU_StandardDeliveryFromOutsideAU"/>
 *     &lt;enumeration value="AU_AustralianAirExpressMetro15kg"/>
 *     &lt;enumeration value="AU_AustralianAirExpressFlatRate5kg"/>
 *     &lt;enumeration value="AU_AustralianAirExpressFlatRate3kg"/>
 *     &lt;enumeration value="AU_AustralianAirExpressFlatRate1kg"/>
 *     &lt;enumeration value="AU_ExpressDelivery"/>
 *     &lt;enumeration value="AU_StandardDelivery"/>
 *     &lt;enumeration value="AU_eBayAusPost3kgFlatRateSatchel"/>
 *     &lt;enumeration value="AU_eBayAusPost500gFlatRateSatchel"/>
 *     &lt;enumeration value="AU_Freight"/>
 *     &lt;enumeration value="BEFR_StandardDelivery"/>
 *     &lt;enumeration value="BEFR_PriorityDelivery"/>
 *     &lt;enumeration value="BEFR_ParcelPost"/>
 *     &lt;enumeration value="BEFR_RegisteredMail"/>
 *     &lt;enumeration value="BEFR_Other"/>
 *     &lt;enumeration value="BEFR_DePostInternational"/>
 *     &lt;enumeration value="BEFR_UPSInternational"/>
 *     &lt;enumeration value="BEFR_FedExInternational"/>
 *     &lt;enumeration value="BEFR_DHLInternational"/>
 *     &lt;enumeration value="BEFR_TPGPostTNTInternational"/>
 *     &lt;enumeration value="BEFR_StandardInternational"/>
 *     &lt;enumeration value="BEFR_ExpeditedInternational"/>
 *     &lt;enumeration value="BEFR_OtherInternational"/>
 *     &lt;enumeration value="BEFR_LaPosteInternational"/>
 *     &lt;enumeration value="BEFR_LaPosteStandardShipping"/>
 *     &lt;enumeration value="BEFR_LaPosteCertifiedShipping"/>
 *     &lt;enumeration value="BEFR_LaPosteTaxipostLLS"/>
 *     &lt;enumeration value="BEFR_LaPosteTaxipost24h"/>
 *     &lt;enumeration value="BEFR_LaPosteTaxipostSecur"/>
 *     &lt;enumeration value="BEFR_PostInternationalStandard"/>
 *     &lt;enumeration value="BEFR_PostInternationalRegistered"/>
 *     &lt;enumeration value="BEFR_TNTInternational"/>
 *     &lt;enumeration value="BEFR_EconomyDeliveryFromAbroad"/>
 *     &lt;enumeration value="BEFR_StandardDeliveryFromAbroad"/>
 *     &lt;enumeration value="BEFR_ExpressDeliveryFromAbroad"/>
 *     &lt;enumeration value="BEFR_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="BENL_StandardDelivery"/>
 *     &lt;enumeration value="BENL_PriorityDelivery"/>
 *     &lt;enumeration value="BENL_ParcelPost"/>
 *     &lt;enumeration value="BENL_RegisteredMail"/>
 *     &lt;enumeration value="BENL_Other"/>
 *     &lt;enumeration value="BENL_DePostInternational"/>
 *     &lt;enumeration value="BENL_UPSInternational"/>
 *     &lt;enumeration value="BENL_FedExInternational"/>
 *     &lt;enumeration value="BENL_DHLInternational"/>
 *     &lt;enumeration value="BENL_TPGPostTNTInternational"/>
 *     &lt;enumeration value="BENL_StandardInternational"/>
 *     &lt;enumeration value="BENL_ExpeditedInternational"/>
 *     &lt;enumeration value="BENL_OtherInternational"/>
 *     &lt;enumeration value="BENL_LaPosteInternational"/>
 *     &lt;enumeration value="BENL_DePostStandardShipping"/>
 *     &lt;enumeration value="BENL_DePostCertifiedShipping"/>
 *     &lt;enumeration value="BENL_DePostTaxipostLLS"/>
 *     &lt;enumeration value="BENL_DePostTaxipost24h"/>
 *     &lt;enumeration value="BENL_DePostTaxipostSecur"/>
 *     &lt;enumeration value="BENL_OtherShippingMethods"/>
 *     &lt;enumeration value="BENL_PostInternationalStandard"/>
 *     &lt;enumeration value="BENL_PostInternationalRegistered"/>
 *     &lt;enumeration value="BENL_TNTInternational"/>
 *     &lt;enumeration value="BENL_EconomyDeliveryFromAbroad"/>
 *     &lt;enumeration value="BENL_StandardDeliveryFromAbroad"/>
 *     &lt;enumeration value="BENL_ExpressDeliveryFromAbroad"/>
 *     &lt;enumeration value="BENL_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="CA_StandardDelivery"/>
 *     &lt;enumeration value="CA_ExpeditedDelivery"/>
 *     &lt;enumeration value="CA_PostLettermail"/>
 *     &lt;enumeration value="CA_PostRegularParcel"/>
 *     &lt;enumeration value="CA_PostExpeditedParcel"/>
 *     &lt;enumeration value="CA_PostXpresspost"/>
 *     &lt;enumeration value="CA_PostPriorityCourier"/>
 *     &lt;enumeration value="CanadaPostExpeditedFlatRateBox"/>
 *     &lt;enumeration value="CA_PostExpeditedFlatRateBox"/>
 *     &lt;enumeration value="CA_StandardInternational"/>
 *     &lt;enumeration value="CA_ExpeditedInternational"/>
 *     &lt;enumeration value="CA_OtherInternational"/>
 *     &lt;enumeration value="CA_PostExpeditedParcelUSA"/>
 *     &lt;enumeration value="CA_PostSmallPacketsUSA"/>
 *     &lt;enumeration value="CA_PostXpresspostUSA"/>
 *     &lt;enumeration value="CA_PostXpresspostInternational"/>
 *     &lt;enumeration value="CA_PostInternationalParcelSurface"/>
 *     &lt;enumeration value="CA_PostInternationalParcelAir"/>
 *     &lt;enumeration value="CA_SmallPacketsInternational"/>
 *     &lt;enumeration value="CA_PurolatorInternational"/>
 *     &lt;enumeration value="CA_PostSmallPacketsUSAGround"/>
 *     &lt;enumeration value="CA_PostSmallPacketsUSAAir"/>
 *     &lt;enumeration value="CA_SmallPacketsInternationalGround"/>
 *     &lt;enumeration value="CA_SmallPacketsInternationalAir"/>
 *     &lt;enumeration value="CA_PostUSALetterPost"/>
 *     &lt;enumeration value="CA_PostInternationalLetterPost"/>
 *     &lt;enumeration value="CA_PostExpeditedFlatRateBoxUSA"/>
 *     &lt;enumeration value="CA_UPSExpressCanada"/>
 *     &lt;enumeration value="CA_UPSExpressSaverCanada"/>
 *     &lt;enumeration value="CA_UPSExpeditedCanada"/>
 *     &lt;enumeration value="CA_UPSStandardCanada"/>
 *     &lt;enumeration value="CA_UPSExpressUnitedStates"/>
 *     &lt;enumeration value="CA_UPSExpeditedUnitedStates"/>
 *     &lt;enumeration value="CA_UPS3DaySelectUnitedStates"/>
 *     &lt;enumeration value="CA_UPSStandardUnitedStates"/>
 *     &lt;enumeration value="CA_UPSWorldWideExpress"/>
 *     &lt;enumeration value="CA_UPSWorldWideExpedited"/>
 *     &lt;enumeration value="CA_PriorityWorldwide"/>
 *     &lt;enumeration value="CanadaPostExpeditedFlatRateBoxUSA"/>
 *     &lt;enumeration value="CA_PostTrackedPacketsUSA"/>
 *     &lt;enumeration value="CA_PostTrackedPacketsInternational"/>
 *     &lt;enumeration value="CA_Freight"/>
 *     &lt;enumeration value="CH_StandardDispatchAPost"/>
 *     &lt;enumeration value="CH_StandardDispatchBPost"/>
 *     &lt;enumeration value="CH_InsuredDispatch"/>
 *     &lt;enumeration value="CH_Writing"/>
 *     &lt;enumeration value="CH_COD"/>
 *     &lt;enumeration value="CH_ExpressOrCourier"/>
 *     &lt;enumeration value="CH_InsuredExpressOrCourier"/>
 *     &lt;enumeration value="CH_SpecialDispatch"/>
 *     &lt;enumeration value="CH_InsuredSpecialDispatch"/>
 *     &lt;enumeration value="CH_Sonstige"/>
 *     &lt;enumeration value="CH_SonstigerVersandInternational"/>
 *     &lt;enumeration value="CH_EconomySendungenInternational"/>
 *     &lt;enumeration value="CH_PrioritySendungenInternational"/>
 *     &lt;enumeration value="CH_UrgentSendungenInternational"/>
 *     &lt;enumeration value="CH_EconomyDeliveryFromAbroad"/>
 *     &lt;enumeration value="CH_StandardDeliveryFromAbroad"/>
 *     &lt;enumeration value="CH_ExpressDeliveryFromAbroad"/>
 *     &lt;enumeration value="CH_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="CN_PersonalDelivery"/>
 *     &lt;enumeration value="CN_RegularPackage"/>
 *     &lt;enumeration value="CN_DeliveryCompanyExpress"/>
 *     &lt;enumeration value="CN_PostOfficeExpress"/>
 *     &lt;enumeration value="CN_Others"/>
 *     &lt;enumeration value="CN_FastPostOffice"/>
 *     &lt;enumeration value="CN_ExpressDeliverySameCity"/>
 *     &lt;enumeration value="CN_ExpressDeliveryOtherCities"/>
 *     &lt;enumeration value="CN_StandardInternational"/>
 *     &lt;enumeration value="CN_ExpeditedInternational"/>
 *     &lt;enumeration value="CN_OtherInternational"/>
 *     &lt;enumeration value="CN_CODInternational"/>
 *     &lt;enumeration value="CN_StandardMailingInternational"/>
 *     &lt;enumeration value="CN_RegularLogisticsInternational"/>
 *     &lt;enumeration value="CN_EMSInternational"/>
 *     &lt;enumeration value="CN_OthersInternational"/>
 *     &lt;enumeration value="DE_StandardDispatch"/>
 *     &lt;enumeration value="DE_InsuredDispatch"/>
 *     &lt;enumeration value="DE_Writing"/>
 *     &lt;enumeration value="DE_COD"/>
 *     &lt;enumeration value="DE_ExpressOrCourier"/>
 *     &lt;enumeration value="DE_InsuredExpressOrCourier"/>
 *     &lt;enumeration value="DE_SpecialDispatch"/>
 *     &lt;enumeration value="DE_InsuredSpecialDispatch"/>
 *     &lt;enumeration value="DE_UnversicherterVersand"/>
 *     &lt;enumeration value="DE_DeutschePostBrief"/>
 *     &lt;enumeration value="DE_eBayDHLPaket24x7"/>
 *     &lt;enumeration value="DE_DHLPostpaket"/>
 *     &lt;enumeration value="DE_DHLPackchen"/>
 *     &lt;enumeration value="DE_DeutschePostWarensendung"/>
 *     &lt;enumeration value="DE_DeutschePostBuchersendung"/>
 *     &lt;enumeration value="DE_HermesPaketUnversichert"/>
 *     &lt;enumeration value="DE_HermesPaketVersichert"/>
 *     &lt;enumeration value="DE_IloxxTransportXXL"/>
 *     &lt;enumeration value="DE_IloxxUbernachtExpress"/>
 *     &lt;enumeration value="DE_IloxxStandard"/>
 *     &lt;enumeration value="DE_Sonstige"/>
 *     &lt;enumeration value="DE_UnversicherterVersandInternational"/>
 *     &lt;enumeration value="DE_VersicherterVersandInternational"/>
 *     &lt;enumeration value="DE_DHLPostpaketInternational"/>
 *     &lt;enumeration value="DE_DHLPackchenInternational"/>
 *     &lt;enumeration value="DE_SonstigerVersandInternational"/>
 *     &lt;enumeration value="DE_UnversicherterExpressVersandInternational"/>
 *     &lt;enumeration value="DE_VersicherterExpressVersandInternational"/>
 *     &lt;enumeration value="DE_DeutschePostBriefLandInternational"/>
 *     &lt;enumeration value="DE_DeutschePostBriefLuftInternational"/>
 *     &lt;enumeration value="DE_IloxxEuropaInternational"/>
 *     &lt;enumeration value="DE_IloxxWorldWideInternational"/>
 *     &lt;enumeration value="DE_Paket"/>
 *     &lt;enumeration value="DE_Express"/>
 *     &lt;enumeration value="DE_DHLPaket"/>
 *     &lt;enumeration value="DE_DPBuecherWarensendung"/>
 *     &lt;enumeration value="DE_HermesPaket"/>
 *     &lt;enumeration value="DE_IloxxTransport"/>
 *     &lt;enumeration value="DE_SonstigeDomestic"/>
 *     &lt;enumeration value="DE_Einschreiben"/>
 *     &lt;enumeration value="DE_Nachname"/>
 *     &lt;enumeration value="DE_SpecialDelivery"/>
 *     &lt;enumeration value="DE_UPS"/>
 *     &lt;enumeration value="DE_DPD"/>
 *     &lt;enumeration value="DE_GLS"/>
 *     &lt;enumeration value="DE_PaketInternational"/>
 *     &lt;enumeration value="DE_DHLPaketInternational"/>
 *     &lt;enumeration value="DE_DHLPaketIntlExpress"/>
 *     &lt;enumeration value="DE_SonstigeInternational"/>
 *     &lt;enumeration value="DE_ExpressInternational"/>
 *     &lt;enumeration value="DE_DPBriefInternational"/>
 *     &lt;enumeration value="DE_IloxxTransportInternational"/>
 *     &lt;enumeration value="DE_HermesPaketInternational"/>
 *     &lt;enumeration value="DE_UPSInternational"/>
 *     &lt;enumeration value="DE_DPDInternational"/>
 *     &lt;enumeration value="DE_GLSInternational"/>
 *     &lt;enumeration value="DE_eBayHermesPaketShop2ShopKaeufer"/>
 *     &lt;enumeration value="DE_HermesPaketShop2ShopKaeufer"/>
 *     &lt;enumeration value="DE_eBayHermesPaketShop2Shop"/>
 *     &lt;enumeration value="DE_HermesPaketShop2Shop"/>
 *     &lt;enumeration value="DE_HermesPaketSperrgut"/>
 *     &lt;enumeration value="DE_eBayHermesPaketSperrgutShop2Shop"/>
 *     &lt;enumeration value="DE_DHLPaeckchenPackstation"/>
 *     &lt;enumeration value="DE_DHLPaketPackstation"/>
 *     &lt;enumeration value="DE_eBayDHLPaeckchen"/>
 *     &lt;enumeration value="DE_DHLStarPaeckchen"/>
 *     &lt;enumeration value="DE_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="ES_CartasNacionalesHasta20"/>
 *     &lt;enumeration value="ES_CartasNacionalesDeMas20"/>
 *     &lt;enumeration value="ES_CartasInternacionalesHasta20"/>
 *     &lt;enumeration value="ES_CartasInternacionalesDeMas20"/>
 *     &lt;enumeration value="ES_PaqueteAzulHasta2kg"/>
 *     &lt;enumeration value="ES_PaqueteAzulDeMas2kg"/>
 *     &lt;enumeration value="ES_PaqueteInternacionalEconomico"/>
 *     &lt;enumeration value="ES_Urgente"/>
 *     &lt;enumeration value="ES_Otros"/>
 *     &lt;enumeration value="ES_StandardInternational"/>
 *     &lt;enumeration value="ES_ExpeditedInternational"/>
 *     &lt;enumeration value="ES_OtherInternational"/>
 *     &lt;enumeration value="ES_CartasPostalInternational"/>
 *     &lt;enumeration value="ES_EmsPostalExpressInternational"/>
 *     &lt;enumeration value="ES_EconomyPacketInternational"/>
 *     &lt;enumeration value="ES_EconomyDeliveryFromAbroad"/>
 *     &lt;enumeration value="ES_StandardDeliveryFromAbroad"/>
 *     &lt;enumeration value="ES_ExpressDeliveryFromAbroad"/>
 *     &lt;enumeration value="ES_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="ES_ENTREGA_KIALA_8KG"/>
 *     &lt;enumeration value="FR_ChronoposteInternationalClassic"/>
 *     &lt;enumeration value="FR_ColiposteColissimoDirect"/>
 *     &lt;enumeration value="FR_DHLExpressEuropack"/>
 *     &lt;enumeration value="FR_UPSStandard"/>
 *     &lt;enumeration value="FR_PostOfficeLetter"/>
 *     &lt;enumeration value="FR_PostOfficeLetterFollowed"/>
 *     &lt;enumeration value="FR_PostOfficeLetterRecommended"/>
 *     &lt;enumeration value="FR_ColiposteColissimo"/>
 *     &lt;enumeration value="FR_ColiposteColissimoRecommended"/>
 *     &lt;enumeration value="FR_UPSStandardAgainstRefund"/>
 *     &lt;enumeration value="FR_Autre"/>
 *     &lt;enumeration value="FR_Ecopli"/>
 *     &lt;enumeration value="FR_Colieco"/>
 *     &lt;enumeration value="FR_AuteModeDenvoiDeColis"/>
 *     &lt;enumeration value="FR_RemiseEnMainPropre"/>
 *     &lt;enumeration value="FR_StandardInternational"/>
 *     &lt;enumeration value="FR_ExpeditedInternational"/>
 *     &lt;enumeration value="FR_OtherInternational"/>
 *     &lt;enumeration value="FR_LaPosteInternationalPriorityCourier"/>
 *     &lt;enumeration value="FR_LaPosteInternationalEconomyCourier"/>
 *     &lt;enumeration value="FR_LaPosteColissimoInternational"/>
 *     &lt;enumeration value="FR_LaPosteColisEconomiqueInternational"/>
 *     &lt;enumeration value="FR_LaPosteColissimoEmballageInternational"/>
 *     &lt;enumeration value="FR_ChronopostClassicInternational"/>
 *     &lt;enumeration value="FR_ChronopostPremiumInternational"/>
 *     &lt;enumeration value="FR_UPSStandardInternational"/>
 *     &lt;enumeration value="FR_UPSExpressInternational"/>
 *     &lt;enumeration value="FR_DHLInternational"/>
 *     &lt;enumeration value="FR_LaPosteLetterMax"/>
 *     &lt;enumeration value="FR_KIALA_DELIVERY"/>
 *     &lt;enumeration value="FR_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="IN_Regular"/>
 *     &lt;enumeration value="IN_Express"/>
 *     &lt;enumeration value="IN_NationalCOD"/>
 *     &lt;enumeration value="IN_Courier"/>
 *     &lt;enumeration value="IN_LocalCOD"/>
 *     &lt;enumeration value="IN_StandardInternational"/>
 *     &lt;enumeration value="IN_ExpeditedInternational"/>
 *     &lt;enumeration value="IN_OtherInternational"/>
 *     &lt;enumeration value="IN_FlatRateCOD"/>
 *     &lt;enumeration value="IN_BuyerPicksUpAndPays"/>
 *     &lt;enumeration value="IT_RegularMail"/>
 *     &lt;enumeration value="IT_PriorityMail"/>
 *     &lt;enumeration value="IT_MailRegisteredLetter"/>
 *     &lt;enumeration value="IT_MailRegisteredLetterWithMark"/>
 *     &lt;enumeration value="IT_InsuredMail"/>
 *     &lt;enumeration value="IT_QuickMail"/>
 *     &lt;enumeration value="IT_RegularPackage"/>
 *     &lt;enumeration value="IT_QuickPackage1"/>
 *     &lt;enumeration value="IT_QuickPackage3"/>
 *     &lt;enumeration value="IT_ExpressCourier"/>
 *     &lt;enumeration value="IT_ExpressPackageMaxi"/>
 *     &lt;enumeration value="IT_StandardInternational"/>
 *     &lt;enumeration value="IT_ExpeditedInternational"/>
 *     &lt;enumeration value="IT_OtherInternational"/>
 *     &lt;enumeration value="IT_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="NL_StandardDelivery"/>
 *     &lt;enumeration value="NL_ParcelPost"/>
 *     &lt;enumeration value="NL_RegisteredMail"/>
 *     &lt;enumeration value="NL_Other"/>
 *     &lt;enumeration value="NL_TPGPostTNTInternational"/>
 *     &lt;enumeration value="NL_UPSInternational"/>
 *     &lt;enumeration value="NL_FedExInternational"/>
 *     &lt;enumeration value="NL_DHLInternational"/>
 *     &lt;enumeration value="NL_DPDGBRInternational"/>
 *     &lt;enumeration value="NL_GLSBusinessInternational"/>
 *     &lt;enumeration value="NL_StandardInternational"/>
 *     &lt;enumeration value="NL_ExpeditedInternational"/>
 *     &lt;enumeration value="NL_OtherInternational"/>
 *     &lt;enumeration value="NL_EconomyDeliveryFromAbroad"/>
 *     &lt;enumeration value="NL_StandardDeliveryFromAbroad"/>
 *     &lt;enumeration value="NL_ExpressDeliveryFromAbroad"/>
 *     &lt;enumeration value="NL_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="TW_RegisteredMail"/>
 *     &lt;enumeration value="TW_UnregisteredMail"/>
 *     &lt;enumeration value="TW_COD"/>
 *     &lt;enumeration value="TW_DwellingMatchPost"/>
 *     &lt;enumeration value="TW_DwellingMatchCOD"/>
 *     &lt;enumeration value="TW_SelfPickup"/>
 *     &lt;enumeration value="TW_ParcelPost"/>
 *     &lt;enumeration value="TW_ExpressMail"/>
 *     &lt;enumeration value="TW_Other"/>
 *     &lt;enumeration value="TW_CPInternationalLetterPost"/>
 *     &lt;enumeration value="TW_CPInternationalParcelPost"/>
 *     &lt;enumeration value="TW_CPInternationalRegisteredLetterPost"/>
 *     &lt;enumeration value="TW_CPInternationalRegisteredParcelPost"/>
 *     &lt;enumeration value="TW_CPInternationalEMS"/>
 *     &lt;enumeration value="TW_CPInternationalOceanShippingParcel"/>
 *     &lt;enumeration value="TW_FedExInternationalPriority"/>
 *     &lt;enumeration value="TW_FedExInternationalEconomy"/>
 *     &lt;enumeration value="TW_UPSWorldwideExpedited"/>
 *     &lt;enumeration value="TW_UPSWorldwideExpress"/>
 *     &lt;enumeration value="TW_UPSWorldwideExpressPlus"/>
 *     &lt;enumeration value="TW_OtherInternational"/>
 *     &lt;enumeration value="UK_RoyalMailFirstClassStandard"/>
 *     &lt;enumeration value="UK_RoyalMailSecondClassStandard"/>
 *     &lt;enumeration value="UK_RoyalMailFirstClassRecorded"/>
 *     &lt;enumeration value="UK_RoyalMailSecondClassRecorded"/>
 *     &lt;enumeration value="UK_RoyalMailSpecialDelivery"/>
 *     &lt;enumeration value="UK_RoyalMailStandardParcel"/>
 *     &lt;enumeration value="UK_Parcelforce24"/>
 *     &lt;enumeration value="UK_Parcelforce48"/>
 *     &lt;enumeration value="UK_OtherCourier"/>
 *     &lt;enumeration value="UK_myHermesDoorToDoorService"/>
 *     &lt;enumeration value="UK_CollectDropAtStoreDeliveryToDoor"/>
 *     &lt;enumeration value="UK_SellersStandardRate"/>
 *     &lt;enumeration value="UK_CollectInPerson"/>
 *     &lt;enumeration value="UK_SellersStandardInternationalRate"/>
 *     &lt;enumeration value="UK_RoyalMailAirmailInternational"/>
 *     &lt;enumeration value="UK_RoyalMailAirsureInternational"/>
 *     &lt;enumeration value="UK_RoyalMailSurfaceMailInternational"/>
 *     &lt;enumeration value="UK_RoyalMailInternationalSignedFor"/>
 *     &lt;enumeration value="UK_RoyalMailHMForcesMailInternational"/>
 *     &lt;enumeration value="UK_ParcelForceInternationalDatapost"/>
 *     &lt;enumeration value="UK_ParcelForceIreland24International"/>
 *     &lt;enumeration value="UK_ParcelForceEuro48International"/>
 *     &lt;enumeration value="UK_ParcelForceInternationalScheduled"/>
 *     &lt;enumeration value="UK_OtherCourierOrDeliveryInternational"/>
 *     &lt;enumeration value="UK_CollectInPersonInternational"/>
 *     &lt;enumeration value="UK_ParcelForceIntlExpress"/>
 *     &lt;enumeration value="UK_ParcelForceIntlValue"/>
 *     &lt;enumeration value="UK_ParcelForceIntlEconomy"/>
 *     &lt;enumeration value="UK_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="UK_IntlTrackedPostage"/>
 *     &lt;enumeration value="IE_SellersStandardRate"/>
 *     &lt;enumeration value="IE_FirstClassLetterService"/>
 *     &lt;enumeration value="IE_SwiftPostNational"/>
 *     &lt;enumeration value="IE_RegisteredPost"/>
 *     &lt;enumeration value="IE_EMSSDSCourier"/>
 *     &lt;enumeration value="IE_EconomySDSCourier"/>
 *     &lt;enumeration value="IE_OtherCourier"/>
 *     &lt;enumeration value="IE_CollectionInPerson"/>
 *     &lt;enumeration value="IE_SellersStandardRateInternational"/>
 *     &lt;enumeration value="IE_InternationalEconomyService"/>
 *     &lt;enumeration value="IE_InternationalPriorityService"/>
 *     &lt;enumeration value="IE_SwiftPostExpressInternational"/>
 *     &lt;enumeration value="IE_SwiftPostInternational"/>
 *     &lt;enumeration value="IE_EMSSDSCourierInternational"/>
 *     &lt;enumeration value="IE_EconomySDSCourierInternational"/>
 *     &lt;enumeration value="IE_OtherCourierInternational"/>
 *     &lt;enumeration value="IE_CollectionInPersonInternational"/>
 *     &lt;enumeration value="IE_EconomyDeliveryFromAbroad"/>
 *     &lt;enumeration value="IE_StandardDeliveryFromAbroad"/>
 *     &lt;enumeration value="IE_ExpressDeliveryFromAbroad"/>
 *     &lt;enumeration value="IE_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="PL_DomesticRegular"/>
 *     &lt;enumeration value="PL_DomesticSpecial"/>
 *     &lt;enumeration value="PL_EconomyDeliveryFromAbroad"/>
 *     &lt;enumeration value="PL_StandardDeliveryFromAbroad"/>
 *     &lt;enumeration value="PL_ExpressDeliveryFromAbroad"/>
 *     &lt;enumeration value="PL_TrackedDeliveryFromAbroad"/>
 *     &lt;enumeration value="FreightShipping"/>
 *     &lt;enumeration value="FreightOtherShipping"/>
 *     &lt;enumeration value="Freight"/>
 *     &lt;enumeration value="FreightShippingInternational"/>
 *     &lt;enumeration value="USPSGround"/>
 *     &lt;enumeration value="ShippingMethodOvernight"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="USPSPriorityFlatRateEnvelope"/>
 *     &lt;enumeration value="USPSPriorityFlatRateBox"/>
 *     &lt;enumeration value="USPSGlobalPrioritySmallEnvelope"/>
 *     &lt;enumeration value="USPSGlobalPriorityLargeEnvelope"/>
 *     &lt;enumeration value="USPSExpressFlatRateEnvelope"/>
 *     &lt;enumeration value="UPSWorldWideExpressBox10kg"/>
 *     &lt;enumeration value="UPSWorldWideExpressBox25kg"/>
 *     &lt;enumeration value="UPSWorldWideExpressPlusBox10kg"/>
 *     &lt;enumeration value="UPSWorldWideExpressPlusBox25kg"/>
 *     &lt;enumeration value="HK_LocalPickUpOnly"/>
 *     &lt;enumeration value="HK_LocalCourier"/>
 *     &lt;enumeration value="HK_DomesticRegularShipping"/>
 *     &lt;enumeration value="HK_DomesticSpecialShipping"/>
 *     &lt;enumeration value="HK_InternationalRegularShipping"/>
 *     &lt;enumeration value="HK_InternationalSpecialShipping"/>
 *     &lt;enumeration value="SG_LocalPickUpOnly"/>
 *     &lt;enumeration value="SG_LocalCourier"/>
 *     &lt;enumeration value="SG_DomesticStandardMail"/>
 *     &lt;enumeration value="SG_DomesticNonStandardMail"/>
 *     &lt;enumeration value="SG_DomesticSpeedpostIslandwide"/>
 *     &lt;enumeration value="SG_InternationalStandardMail"/>
 *     &lt;enumeration value="SG_InternationalExpressMailService"/>
 *     &lt;enumeration value="SG_InternationalCourier"/>
 *     &lt;enumeration value="BENL_DePostZendingNONPRIOR"/>
 *     &lt;enumeration value="BENL_DePostZendingPRIOR"/>
 *     &lt;enumeration value="BENL_DePostZendingAangetekend"/>
 *     &lt;enumeration value="BENL_KilopostPakje"/>
 *     &lt;enumeration value="BENL_Taxipost"/>
 *     &lt;enumeration value="BENL_KialaAfhaalpunt"/>
 *     &lt;enumeration value="BENL_VasteKostenStandaardVerzending"/>
 *     &lt;enumeration value="BENL_VasteKostenVersneldeVerzending"/>
 *     &lt;enumeration value="BENL_VerzekerdeVerzending"/>
 *     &lt;enumeration value="BEFR_LaPosteEnvoiNONPRIOR"/>
 *     &lt;enumeration value="BEFR_LaPosteEnvoiPRIOR"/>
 *     &lt;enumeration value="BEFR_LaPosteEnvoiRecommande"/>
 *     &lt;enumeration value="BEFR_PaquetKilopost"/>
 *     &lt;enumeration value="BEFR_Taxipost"/>
 *     &lt;enumeration value="BEFR_PointRetraitKiala"/>
 *     &lt;enumeration value="BEFR_LivraisonStandardPrixforFaitaire"/>
 *     &lt;enumeration value="BEFR_LivraisonExpressPrixforFaitaire"/>
 *     &lt;enumeration value="BEFR_LivraisonSecurise"/>
 *     &lt;enumeration value="BENL_DePostZendingPRIORInternational"/>
 *     &lt;enumeration value="BENL_DePostZendingNONPRIORInternational"/>
 *     &lt;enumeration value="BENL_DePostZendingAangetekendInternational"/>
 *     &lt;enumeration value="BENL_KilopostPakjeInternational"/>
 *     &lt;enumeration value="BENL_TaxipostExpressverzending"/>
 *     &lt;enumeration value="BENL_VerzekerdeVerzendingInternational"/>
 *     &lt;enumeration value="BEFR_LaPosteenvoiePRIOR"/>
 *     &lt;enumeration value="BEFR_LaPosteenvoieNONPRIOR"/>
 *     &lt;enumeration value="BEFR_LaPosteenvoieRecommande"/>
 *     &lt;enumeration value="BEFR_PaquetKilopostInternationale"/>
 *     &lt;enumeration value="BEFR_ExpressTaxipost"/>
 *     &lt;enumeration value="BEFR_LivraisonStandardInternationalePrixforFaitaire"/>
 *     &lt;enumeration value="BEFR_LivraisonExpressInternationalePrixforFaitaire"/>
 *     &lt;enumeration value="BEFR_LivraisonSecuriseInternational"/>
 *     &lt;enumeration value="FR_Chronopost"/>
 *     &lt;enumeration value="UK_RoyalMailSpecialDeliveryNextDay"/>
 *     &lt;enumeration value="CA_PostLightPacketInternational"/>
 *     &lt;enumeration value="CA_PostLightPacketUSA"/>
 *     &lt;enumeration value="PL_DHLInternational"/>
 *     &lt;enumeration value="PL_InternationalRegular"/>
 *     &lt;enumeration value="PL_InternationalSpecial"/>
 *     &lt;enumeration value="PL_UPSInternational"/>
 *     &lt;enumeration value="CAFR_StandardDelivery"/>
 *     &lt;enumeration value="CAFR_ExpeditedDelivery"/>
 *     &lt;enumeration value="CAFR_PostLettermail"/>
 *     &lt;enumeration value="CAFR_PostRegularParcel"/>
 *     &lt;enumeration value="CAFR_PostExpeditedParcel"/>
 *     &lt;enumeration value="CAFR_PostXpresspost"/>
 *     &lt;enumeration value="CAFR_PostPriorityCourier"/>
 *     &lt;enumeration value="CAFR_StandardInternational"/>
 *     &lt;enumeration value="CAFR_ExpeditedInternational"/>
 *     &lt;enumeration value="CAFR_OtherInternational"/>
 *     &lt;enumeration value="CAFR_PostExpeditedParcelUSA"/>
 *     &lt;enumeration value="CAFR_PostSmallPacketsUSA"/>
 *     &lt;enumeration value="CAFR_PostXpresspostUSA"/>
 *     &lt;enumeration value="CAFR_PostXpresspostInternational"/>
 *     &lt;enumeration value="CAFR_PostInternationalParcelSurface"/>
 *     &lt;enumeration value="CAFR_PostInternationalParcelAir"/>
 *     &lt;enumeration value="CAFR_SmallPacketsInternational"/>
 *     &lt;enumeration value="CAFR_PurolatorInternational"/>
 *     &lt;enumeration value="CAFR_PostSmallPacketsUSAGround"/>
 *     &lt;enumeration value="CAFR_PostSmallPacketsUSAAir"/>
 *     &lt;enumeration value="CAFR_SmallPacketsInternationalGround"/>
 *     &lt;enumeration value="CAFR_SmallPacketsInternationalAir"/>
 *     &lt;enumeration value="CAFR_PostUSALetterPost"/>
 *     &lt;enumeration value="CAFR_PostInternationalLetterPost"/>
 *     &lt;enumeration value="CAFR_UPSExpressCanada"/>
 *     &lt;enumeration value="CAFR_UPSExpressSaverCanada"/>
 *     &lt;enumeration value="CAFR_UPSExpeditedCanada"/>
 *     &lt;enumeration value="CAFR_UPSStandardCanada"/>
 *     &lt;enumeration value="CAFR_UPSExpressUnitedStates"/>
 *     &lt;enumeration value="CAFR_UPSExpeditedUnitedStates"/>
 *     &lt;enumeration value="CAFR_UPS3DaySelectUnitedStates"/>
 *     &lt;enumeration value="CAFR_UPSStandardUnitedStates"/>
 *     &lt;enumeration value="CAFR_UPSWorldWideExpress"/>
 *     &lt;enumeration value="CAFR_UPSWorldWideExpedited"/>
 *     &lt;enumeration value="UK_RoyalMailSpecialDelivery9am"/>
 *     &lt;enumeration value="USPSFirstClassMailInternational"/>
 *     &lt;enumeration value="USPSPriorityMailInternational"/>
 *     &lt;enumeration value="USPSExpressMailInternational"/>
 *     &lt;enumeration value="CH_StandardInternational"/>
 *     &lt;enumeration value="CH_ExpeditedInternational"/>
 *     &lt;enumeration value="CH_SonstigerVersandSieheArtikelbeschreibung"/>
 *     &lt;enumeration value="TW_StandardInternationalFixedRate"/>
 *     &lt;enumeration value="TW_ExpeditedInternationalFixedRate"/>
 *     &lt;enumeration value="USPSGlobalExpressGuaranteed"/>
 *     &lt;enumeration value="AU_RegularWithInsurance"/>
 *     &lt;enumeration value="AU_ExpressWithInsurance"/>
 *     &lt;enumeration value="DE_DeutschePostWarensendungInternational"/>
 *     &lt;enumeration value="DE_DeutschePostByendung"/>
 *     &lt;enumeration value="DE_HermesPaketUnversichertInternational"/>
 *     &lt;enumeration value="DE_HermesPaketVersichertInternational"/>
 *     &lt;enumeration value="DE_iLoxxTransportXXLInternational"/>
 *     &lt;enumeration value="DE_iLoxxUbernachtExpressInternational"/>
 *     &lt;enumeration value="DE_iLoxxStandardInternational"/>
 *     &lt;enumeration value="DE_StandardInternational"/>
 *     &lt;enumeration value="DE_ExpeditedInternational"/>
 *     &lt;enumeration value="DE_DeutschePostBriefIntlEcon"/>
 *     &lt;enumeration value="DE_DeutschePostBriefIntlPri"/>
 *     &lt;enumeration value="AT_BitteTreffenSieEineAuswahl"/>
 *     &lt;enumeration value="AT_EinschreibenVersandInklEinschreibengebuhr"/>
 *     &lt;enumeration value="AT_NachnahmeVersandInklNachnahmegebuhr"/>
 *     &lt;enumeration value="AT_ExpressOrCourierInternational"/>
 *     &lt;enumeration value="AT_InsuredExpressOrCourierInternational"/>
 *     &lt;enumeration value="AT_SpecialDispatchInternational"/>
 *     &lt;enumeration value="AT_InsuredSpecialDispatchInternational"/>
 *     &lt;enumeration value="AT_StandardInternational"/>
 *     &lt;enumeration value="AT_ExpeditedInternational"/>
 *     &lt;enumeration value="AT_OtherInternationalShipping"/>
 *     &lt;enumeration value="CH_BitteTreffenSieEineAuswahl"/>
 *     &lt;enumeration value="CH_UnversicherterVersand"/>
 *     &lt;enumeration value="CH_VersicherterVersand"/>
 *     &lt;enumeration value="CH_EinschreibenVersandInklEinschreibengebuhr"/>
 *     &lt;enumeration value="CH_NachnahmeVersandInklNachnahmegebuhr"/>
 *     &lt;enumeration value="CH_ExpressOrCourierInternational"/>
 *     &lt;enumeration value="CH_InsuredExpressOrCourierInternational"/>
 *     &lt;enumeration value="CH_SonderversandZBSperrgutKFZ"/>
 *     &lt;enumeration value="CH_VersicherterSonderversandZBSperrgutKFZ"/>
 *     &lt;enumeration value="CH_StandardversandAPostPriority"/>
 *     &lt;enumeration value="CH_StandardversandBPostEconomy"/>
 *     &lt;enumeration value="DE_BitteTreffenSieEineAuswahl"/>
 *     &lt;enumeration value="DE_EinschreibenVersandInklEinschreibengebuhr"/>
 *     &lt;enumeration value="DE_NachnahmeVersandInklNachnahmegebuhr"/>
 *     &lt;enumeration value="DE_ExpressOrCourierInternational"/>
 *     &lt;enumeration value="DE_InsuredExpressOrCourierInternational"/>
 *     &lt;enumeration value="DE_SonderversandZBMobelKFZ"/>
 *     &lt;enumeration value="DE_VersicherterSonderversandZBMobelKFZ"/>
 *     &lt;enumeration value="DE_DeutschePostBriefInternational"/>
 *     &lt;enumeration value="IE_StandardInternationalFlatRatePostage"/>
 *     &lt;enumeration value="IE_ExpeditedInternationalFlatRatePostage"/>
 *     &lt;enumeration value="IE_OtherInternationalPostage"/>
 *     &lt;enumeration value="UK_StandardInternationalFlatRatePostage"/>
 *     &lt;enumeration value="UK_ExpeditedInternationalFlatRatePostage"/>
 *     &lt;enumeration value="UK_OtherInternationalPostage"/>
 *     &lt;enumeration value="FR_ChronopostChronoRelais"/>
 *     &lt;enumeration value="FR_Chrono10"/>
 *     &lt;enumeration value="FR_Chrono13"/>
 *     &lt;enumeration value="FR_Chrono18"/>
 *     &lt;enumeration value="FR_ChronopostExpressInternational"/>
 *     &lt;enumeration value="Pickup"/>
 *     &lt;enumeration value="Delivery"/>
 *     &lt;enumeration value="CA_Pickup"/>
 *     &lt;enumeration value="DE_Pickup"/>
 *     &lt;enumeration value="AU_Pickup"/>
 *     &lt;enumeration value="AU_SmallParcels"/>
 *     &lt;enumeration value="AU_SmallParcelWithTracking"/>
 *     &lt;enumeration value="AU_SmallParcelWithTrackingAndSignature"/>
 *     &lt;enumeration value="AU_RegularParcelWithTracking"/>
 *     &lt;enumeration value="AU_RegularParcelWithTrackingAndSignature"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostSatchel5kg"/>
 *     &lt;enumeration value="AU_PrePaidParcelPostSatchels500g"/>
 *     &lt;enumeration value="AU_PrePaidParcelPostSatchels3kg"/>
 *     &lt;enumeration value="AU_PrePaidParcelPostSatchels5kg"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostSatchel500g"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostSatchel3kg"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostPlatinum500g"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostPlatinum3kg"/>
 *     &lt;enumeration value="AU_ExpressCourierInternational"/>
 *     &lt;enumeration value="AU_ExpressPostInternational"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostInternationalEnvelopeC5"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostInternationalEnvelopeB4"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostInternationalSatchels2kg"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostInternationalSatchels3kg"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostInternationalBox5kg"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostInternationalBox10kg"/>
 *     &lt;enumeration value="AU_PrePaidExpressPostInternationalBox20kg"/>
 *     &lt;enumeration value="AU_RegisteredParcelPost"/>
 *     &lt;enumeration value="AU_RegisteredSmallParcel"/>
 *     &lt;enumeration value="AU_RegisteredParcelPostPrepaidSatchel500g"/>
 *     &lt;enumeration value="AU_RegisteredParcelPostPrepaidSatchel3kg"/>
 *     &lt;enumeration value="AU_RegisteredParcelPostPrepaidSatchel5kg"/>
 *     &lt;enumeration value="AU_ExpressPostSatchel500g"/>
 *     &lt;enumeration value="AU_ExpressPostSatchel3kg"/>
 *     &lt;enumeration value="FR_Pickup"/>
 *     &lt;enumeration value="AT_Pickup"/>
 *     &lt;enumeration value="BENL_Pickup"/>
 *     &lt;enumeration value="BEFR_Pickup"/>
 *     &lt;enumeration value="CH_Pickup"/>
 *     &lt;enumeration value="IT_Pickup"/>
 *     &lt;enumeration value="NL_Pickup"/>
 *     &lt;enumeration value="PL_Pickup"/>
 *     &lt;enumeration value="ES_Pickup"/>
 *     &lt;enumeration value="SG_Delivery"/>
 *     &lt;enumeration value="UK_OtherCourier24"/>
 *     &lt;enumeration value="UK_OtherCourier48"/>
 *     &lt;enumeration value="UK_OtherCourier3Days"/>
 *     &lt;enumeration value="UK_OtherCourier5Days"/>
 *     &lt;enumeration value="Courier"/>
 *     &lt;enumeration value="FedExPriorityOvernight"/>
 *     &lt;enumeration value="FedExStandardOvernight"/>
 *     &lt;enumeration value="FedEx2Day"/>
 *     &lt;enumeration value="FedExGround"/>
 *     &lt;enumeration value="FedExHomeDelivery"/>
 *     &lt;enumeration value="FedExExpressSaver"/>
 *     &lt;enumeration value="FedExGroundDisabled"/>
 *     &lt;enumeration value="FedExHomeDeliveryDisabled"/>
 *     &lt;enumeration value="FedExInternationalFirst"/>
 *     &lt;enumeration value="FedExInternationalPriority"/>
 *     &lt;enumeration value="FedExInternationalEconomy"/>
 *     &lt;enumeration value="FedExInternationalGround"/>
 *     &lt;enumeration value="EconomyShippingFromOutsideUS"/>
 *     &lt;enumeration value="ExpeditedShippingFromOutsideUS"/>
 *     &lt;enumeration value="StandardShippingFromOutsideUS"/>
 *     &lt;enumeration value="UK_EconomyShippingFromOutside"/>
 *     &lt;enumeration value="UK_ExpeditedShippingFromOutside"/>
 *     &lt;enumeration value="UK_StandardShippingFromOutside"/>
 *     &lt;enumeration value="DE_SparversandAusDemAusland"/>
 *     &lt;enumeration value="DE_StandardversandAusDemAusland"/>
 *     &lt;enumeration value="DE_ExpressversandAusDemAusland"/>
 *     &lt;enumeration value="DE_DHL2KGPaket"/>
 *     &lt;enumeration value="InternationalPriorityShipping"/>
 *     &lt;enumeration value="SameDayShipping"/>
 *     &lt;enumeration value="UK_RoyalMailNextDay"/>
 *     &lt;enumeration value="UK_RoyalMailTracked"/>
 *     &lt;enumeration value="eBayNowImmediateDelivery"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShippingServiceCodeType")
@XmlEnum
public enum ShippingServiceCodeType {


    /**
     * 
     * 						UPS Ground
     * 					
     * 
     */
    @XmlEnumValue("UPSGround")
    UPS_GROUND("UPSGround"),

    /**
     * 
     * 						UPS 3rd Day
     * 					
     * 
     */
    @XmlEnumValue("UPS3rdDay")
    UPS_3_RD_DAY("UPS3rdDay"),

    /**
     * 
     * 						UPS 2nd Day
     * 					
     * 
     */
    @XmlEnumValue("UPS2ndDay")
    UPS_2_ND_DAY("UPS2ndDay"),

    /**
     * 
     * 						UPS Next Day
     * 					
     * 
     */
    @XmlEnumValue("UPSNextDay")
    UPS_NEXT_DAY("UPSNextDay"),

    /**
     * 
     * 						USPS Priority
     * 					
     * 
     */
    @XmlEnumValue("USPSPriority")
    USPS_PRIORITY("USPSPriority"),

    /**
     * 
     * 						USPS Parcel Select Non-Presort
     * 					
     * 
     */
    @XmlEnumValue("USPSParcel")
    USPS_PARCEL("USPSParcel"),

    /**
     * 
     * 						USPS Standard Post
     * 					
     * 
     */
    @XmlEnumValue("USPSStandardPost")
    USPS_STANDARD_POST("USPSStandardPost"),

    /**
     * 
     * 						USPS Media
     * 					
     * 
     */
    @XmlEnumValue("USPSMedia")
    USPS_MEDIA("USPSMedia"),

    /**
     * 
     * 						USPS First Class
     * 					
     * 
     */
    @XmlEnumValue("USPSFirstClass")
    USPS_FIRST_CLASS("USPSFirstClass"),

    /**
     * 
     * 						Standard shipping method
     * 					
     * 
     */
    @XmlEnumValue("ShippingMethodStandard")
    SHIPPING_METHOD_STANDARD("ShippingMethodStandard"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("ShippingMethodExpress")
    SHIPPING_METHOD_EXPRESS("ShippingMethodExpress"),

    /**
     * 
     * 						USPS Priority Mail Express
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressMail")
    USPS_EXPRESS_MAIL("USPSExpressMail"),

    /**
     * 
     * 						UPS Next Day Air
     * 					
     * 
     */
    @XmlEnumValue("UPSNextDayAir")
    UPS_NEXT_DAY_AIR("UPSNextDayAir"),

    /**
     * 
     * 						UPS Next Day Air
     * 					
     * 
     */
    @XmlEnumValue("UPS2DayAirAM")
    UPS_2_DAY_AIR_AM("UPS2DayAirAM"),

    /**
     * 
     * 						USPS Priority Mail Express Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 						The seller must also specify a package size of Package/Thick Envelope when
     * 						using a calculated shipping service.
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressMailFlatRateEnvelope")
    USPS_EXPRESS_MAIL_FLAT_RATE_ENVELOPE("USPSExpressMailFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail Express Padded Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 						The seller must also specify a package size of Package/Thick Envelope when
     * 						using a calculated shipping service.
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressMailPaddedFlatRateEnvelope")
    USPS_EXPRESS_MAIL_PADDED_FLAT_RATE_ENVELOPE("USPSExpressMailPaddedFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 						The seller must also specify a package size of Package/Thick Envelope when
     * 						using a calculated shipping service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailFlatRateEnvelope")
    USPS_PRIORITY_MAIL_FLAT_RATE_ENVELOPE("USPSPriorityMailFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail Small Flat Rate Box
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 						The seller must also specify a package size of Package/Thick Envelope when
     * 						using a calculated shipping service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailSmallFlatRateBox")
    USPS_PRIORITY_MAIL_SMALL_FLAT_RATE_BOX("USPSPriorityMailSmallFlatRateBox"),

    /**
     * 
     * 						USPS Priority Mail Flat Rate Box
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 						The seller must also specify a package size of Package/Thick Envelope when
     * 						using a calculated shipping service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailFlatRateBox")
    USPS_PRIORITY_MAIL_FLAT_RATE_BOX("USPSPriorityMailFlatRateBox"),

    /**
     * 
     * 						USPS Priority Mail Large Flat Rate Box
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailLargeFlatRateBox")
    USPS_PRIORITY_MAIL_LARGE_FLAT_RATE_BOX("USPSPriorityMailLargeFlatRateBox"),

    /**
     * 
     * 						USPS Priority Mail Padded Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailPaddedFlatRateEnvelope")
    USPS_PRIORITY_MAIL_PADDED_FLAT_RATE_ENVELOPE("USPSPriorityMailPaddedFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail Legal Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailLegalFlatRateEnvelope")
    USPS_PRIORITY_MAIL_LEGAL_FLAT_RATE_ENVELOPE("USPSPriorityMailLegalFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail Express Legal Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressMailLegalFlatRateEnvelope")
    USPS_EXPRESS_MAIL_LEGAL_FLAT_RATE_ENVELOPE("USPSExpressMailLegalFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail Regional Box A
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailRegionalBoxA")
    USPS_PRIORITY_MAIL_REGIONAL_BOX_A("USPSPriorityMailRegionalBoxA"),

    /**
     * 
     * 						USPS Priority Mail Regional Box B
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailRegionalBoxB")
    USPS_PRIORITY_MAIL_REGIONAL_BOX_B("USPSPriorityMailRegionalBoxB"),

    /**
     * 
     * 						USPS Priority Mail Regional Box C
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailRegionalBoxC")
    USPS_PRIORITY_MAIL_REGIONAL_BOX_C("USPSPriorityMailRegionalBoxC"),

    /**
     * 
     * 						USPS Priority Mail Express Flat Rate Box
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressMailFlatRateBox")
    USPS_EXPRESS_MAIL_FLAT_RATE_BOX("USPSExpressMailFlatRateBox"),

    /**
     * 
     * 						Other (see description)
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						Local Delivery/Pickup
     * 					
     * 
     */
    @XmlEnumValue("LocalDelivery")
    LOCAL_DELIVERY("LocalDelivery"),

    /**
     * 
     * 						Not Selected
     * 					
     * 
     */
    @XmlEnumValue("NotSelected")
    NOT_SELECTED("NotSelected"),

    /**
     * 
     * 						International Not Selected
     * 					
     * 
     */
    @XmlEnumValue("InternationalNotSelected")
    INTERNATIONAL_NOT_SELECTED("InternationalNotSelected"),

    /**
     * 
     * 						Standard International Flat Rate Shipping
     * 					
     * 
     */
    @XmlEnumValue("StandardInternational")
    STANDARD_INTERNATIONAL("StandardInternational"),

    /**
     * 
     * 						Expedited International Flat Rate Shipping
     * 					
     * 
     */
    @XmlEnumValue("ExpeditedInternational")
    EXPEDITED_INTERNATIONAL("ExpeditedInternational"),

    /**
     * 
     * 						USPS Global Express Mail
     * 					
     * 
     */
    @XmlEnumValue("USPSGlobalExpress")
    USPS_GLOBAL_EXPRESS("USPSGlobalExpress"),

    /**
     * 
     * 						USPS Global Priority Mail
     * 					
     * 
     */
    @XmlEnumValue("USPSGlobalPriority")
    USPS_GLOBAL_PRIORITY("USPSGlobalPriority"),

    /**
     * 
     * 						USPS Economy Parcel Post
     * 					
     * 
     */
    @XmlEnumValue("USPSEconomyParcel")
    USPS_ECONOMY_PARCEL("USPSEconomyParcel"),

    /**
     * 
     * 						USPS Economy Letter Post
     * 					
     * 
     */
    @XmlEnumValue("USPSEconomyLetter")
    USPS_ECONOMY_LETTER("USPSEconomyLetter"),

    /**
     * 
     * 						USPS Airmail Letter Post
     * 					
     * 
     */
    @XmlEnumValue("USPSAirmailLetter")
    USPS_AIRMAIL_LETTER("USPSAirmailLetter"),

    /**
     * 
     * 						USPS Airmail Parcel Post
     * 					
     * 
     */
    @XmlEnumValue("USPSAirmailParcel")
    USPS_AIRMAIL_PARCEL("USPSAirmailParcel"),

    /**
     * 
     * 						UPS Worldwide Express Plus
     * 					
     * 
     */
    @XmlEnumValue("UPSWorldWideExpressPlus")
    UPS_WORLD_WIDE_EXPRESS_PLUS("UPSWorldWideExpressPlus"),

    /**
     * 
     * 						UPS Worldwide Express
     * 					
     * 
     */
    @XmlEnumValue("UPSWorldWideExpress")
    UPS_WORLD_WIDE_EXPRESS("UPSWorldWideExpress"),

    /**
     * 
     * 						UPS Worldwide Expedited
     * 					
     * 
     */
    @XmlEnumValue("UPSWorldWideExpedited")
    UPS_WORLD_WIDE_EXPEDITED("UPSWorldWideExpedited"),

    /**
     * 
     * 						UPS Worldwide Saver
     * 					
     * 
     */
    @XmlEnumValue("UPSWorldwideSaver")
    UPS_WORLDWIDE_SAVER("UPSWorldwideSaver"),

    /**
     * 
     * 						UPS Standard To Canada
     * 					
     * 
     */
    @XmlEnumValue("UPSStandardToCanada")
    UPS_STANDARD_TO_CANADA("UPSStandardToCanada"),

    /**
     * 
     * 						USPS Priority Mail Express International Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 						The seller must also specify a package size of Package/Thick Envelope when
     * 						using a calculated shipping service.
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressMailInternationalFlatRateEnvelope")
    USPS_EXPRESS_MAIL_INTERNATIONAL_FLAT_RATE_ENVELOPE("USPSExpressMailInternationalFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail Express International Padded Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 						The seller must also specify a package size of Package/Thick Envelope when
     * 						using a calculated shipping service.
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressMailInternationalPaddedFlatRateEnvelope")
    USPS_EXPRESS_MAIL_INTERNATIONAL_PADDED_FLAT_RATE_ENVELOPE("USPSExpressMailInternationalPaddedFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail International Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 						The seller must also specify a package size of Package/Thick Envelope when
     * 						using a calculated shipping service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailInternationalFlatRateEnvelope")
    USPS_PRIORITY_MAIL_INTERNATIONAL_FLAT_RATE_ENVELOPE("USPSPriorityMailInternationalFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail International Small Flat Rate Box
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 						The seller must also specify a package size of Package/Thick Envelope when
     * 						using a calculated shipping service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailInternationalSmallFlatRateBox")
    USPS_PRIORITY_MAIL_INTERNATIONAL_SMALL_FLAT_RATE_BOX("USPSPriorityMailInternationalSmallFlatRateBox"),

    /**
     * 
     * 						USPS Priority Mail International Flat Rate Box
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 						The seller must also specify a package size of Package/Thick Envelope when
     * 						using a calculated shipping service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailInternationalFlatRateBox")
    USPS_PRIORITY_MAIL_INTERNATIONAL_FLAT_RATE_BOX("USPSPriorityMailInternationalFlatRateBox"),

    /**
     * 
     * 						USPS Priority Mail International Large Flat Rate Box
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailInternationalLargeFlatRateBox")
    USPS_PRIORITY_MAIL_INTERNATIONAL_LARGE_FLAT_RATE_BOX("USPSPriorityMailInternationalLargeFlatRateBox"),

    /**
     * 
     * 						USPS Priority Mail International Padded Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailInternationalPaddedFlatRateEnvelope")
    USPS_PRIORITY_MAIL_INTERNATIONAL_PADDED_FLAT_RATE_ENVELOPE("USPSPriorityMailInternationalPaddedFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail International Legal Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailInternationalLegalFlatRateEnvelope")
    USPS_PRIORITY_MAIL_INTERNATIONAL_LEGAL_FLAT_RATE_ENVELOPE("USPSPriorityMailInternationalLegalFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail Express International Legal Flat Rate Envelope
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressMailInternationalLegalFlatRateEnvelope")
    USPS_EXPRESS_MAIL_INTERNATIONAL_LEGAL_FLAT_RATE_ENVELOPE("USPSExpressMailInternationalLegalFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Mail Express International Flat Rate Box
     * 						To use this service, a seller must specify the package weight so that eBay
     * 						can validate the weight against the maximum weight limit for the service.
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressMailInternationalFlatRateBox")
    USPS_EXPRESS_MAIL_INTERNATIONAL_FLAT_RATE_BOX("USPSExpressMailInternationalFlatRateBox"),

    /**
     * 
     * 						Other International Shipping (see description)
     * 					
     * 
     */
    @XmlEnumValue("OtherInternational")
    OTHER_INTERNATIONAL("OtherInternational"),

    /**
     * 
     * 						Standardversand (unversichert)
     * 					
     * 
     */
    @XmlEnumValue("AT_StandardDispatch")
    AT_STANDARD_DISPATCH("AT_StandardDispatch"),

    /**
     * 
     * 						Versicherter Versand
     * 					
     * 
     */
    @XmlEnumValue("AT_InsuredDispatch")
    AT_INSURED_DISPATCH("AT_InsuredDispatch"),

    /**
     * 
     * 						Einschreiben (Versand inkl. Einschreibengebuhr)
     * 					
     * 
     */
    @XmlEnumValue("AT_Writing")
    AT_WRITING("AT_Writing"),

    /**
     * 
     * 						Nachnahme (Versand inkl. Nachnahmegebuhr)
     * 					
     * 
     */
    AT_COD("AT_COD"),

    /**
     * 
     * 						Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("AT_ExpressOrCourier")
    AT_EXPRESS_OR_COURIER("AT_ExpressOrCourier"),

    /**
     * 
     * 						Versicherter Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("AT_InsuredExpressOrCourier")
    AT_INSURED_EXPRESS_OR_COURIER("AT_InsuredExpressOrCourier"),

    /**
     * 
     * 						Sonder-/Speditionsversand (z.B. Mobel, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("AT_SpecialDispatch")
    AT_SPECIAL_DISPATCH("AT_SpecialDispatch"),

    /**
     * 
     * 						Versicherter Sonder-/Speditionsversand (z.B. Mobel, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("AT_InsuredSpecialDispatch")
    AT_INSURED_SPECIAL_DISPATCH("AT_InsuredSpecialDispatch"),

    /**
     * 
     * 						Sonstige (Siehe Artikelbeschreibung)
     * 					
     * 
     */
    @XmlEnumValue("AT_Sonstige")
    AT_SONSTIGE("AT_Sonstige"),

    /**
     * 
     * 						Unversicherter Versand International
     * 					
     * 
     */
    @XmlEnumValue("AT_UnversicherterVersandInternational")
    AT_UNVERSICHERTER_VERSAND_INTERNATIONAL("AT_UnversicherterVersandInternational"),

    /**
     * 
     * 						Versicherter Versand International
     * 					
     * 
     */
    @XmlEnumValue("AT_VersicherterVersandInternational")
    AT_VERSICHERTER_VERSAND_INTERNATIONAL("AT_VersicherterVersandInternational"),

    /**
     * 
     * 						Sonstiger Versand International
     * 					
     * 
     */
    @XmlEnumValue("AT_SonstigerVersandInternational")
    AT_SONSTIGER_VERSAND_INTERNATIONAL("AT_SonstigerVersandInternational"),

    /**
     * 
     * 						Unversicherter Express Versand International
     * 					
     * 
     */
    @XmlEnumValue("AT_UnversicherterExpressVersandInternational")
    AT_UNVERSICHERTER_EXPRESS_VERSAND_INTERNATIONAL("AT_UnversicherterExpressVersandInternational"),

    /**
     * 
     * 						Versicherter Express Versand International
     * 					
     * 
     */
    @XmlEnumValue("AT_VersicherterExpressVersandInternational")
    AT_VERSICHERTER_EXPRESS_VERSAND_INTERNATIONAL("AT_VersicherterExpressVersandInternational"),

    /**
     * 
     * 						Sparversand aus dem Ausland
     * 					
     * 
     */
    @XmlEnumValue("AT_EconomyDeliveryFromAbroad")
    AT_ECONOMY_DELIVERY_FROM_ABROAD("AT_EconomyDeliveryFromAbroad"),

    /**
     * 
     * 						Standardversand aus dem Ausland
     * 					
     * 
     */
    @XmlEnumValue("AT_StandardDeliveryFromAbroad")
    AT_STANDARD_DELIVERY_FROM_ABROAD("AT_StandardDeliveryFromAbroad"),

    /**
     * 
     * 						Expressversand aus dem Ausland
     * 					
     * 
     */
    @XmlEnumValue("AT_ExpressDeliveryFromAbroad")
    AT_EXPRESS_DELIVERY_FROM_ABROAD("AT_ExpressDeliveryFromAbroad"),

    /**
     * 
     * 						Versand mit Nachverfolgung aus dem Ausland
     * 					
     * 
     */
    @XmlEnumValue("AT_TrackedDeliveryFromAbroad")
    AT_TRACKED_DELIVERY_FROM_ABROAD("AT_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						Regular
     * 					
     * 
     */
    @XmlEnumValue("AU_Regular")
    AU_REGULAR("AU_Regular"),

    /**
     * 
     * 						Express
     * 					
     * 
     */
    @XmlEnumValue("AU_Express")
    AU_EXPRESS("AU_Express"),

    /**
     * 
     * 						Registered
     * 					
     * 
     */
    @XmlEnumValue("AU_Registered")
    AU_REGISTERED("AU_Registered"),

    /**
     * 
     * 						Courier
     * 					
     * 
     */
    @XmlEnumValue("AU_Courier")
    AU_COURIER("AU_Courier"),

    /**
     * 
     * 						Other
     * 					
     * 
     */
    @XmlEnumValue("AU_Other")
    AU_OTHER("AU_Other"),

    /**
     * 
     * 						EMS International Courier - Parcels
     * 					
     * 
     */
    @XmlEnumValue("AU_EMSInternationalCourierParcels")
    AU_EMS_INTERNATIONAL_COURIER_PARCELS("AU_EMSInternationalCourierParcels"),

    /**
     * 
     * 						EMS International Courier - Documents
     * 					
     * 
     */
    @XmlEnumValue("AU_EMSInternationalCourierDocuments")
    AU_EMS_INTERNATIONAL_COURIER_DOCUMENTS("AU_EMSInternationalCourierDocuments"),

    /**
     * 
     * 						Express Post International - Documents
     * 					
     * 
     */
    @XmlEnumValue("AU_ExpressPostInternationalDocuments")
    AU_EXPRESS_POST_INTERNATIONAL_DOCUMENTS("AU_ExpressPostInternationalDocuments"),

    /**
     * 
     * 						Air Mail
     * 					
     * 
     */
    @XmlEnumValue("AU_AirMailInternational")
    AU_AIR_MAIL_INTERNATIONAL("AU_AirMailInternational"),

    /**
     * 
     * 						Economy Air
     * 					
     * 
     */
    @XmlEnumValue("AU_EconomyAirInternational")
    AU_ECONOMY_AIR_INTERNATIONAL("AU_EconomyAirInternational"),

    /**
     * 
     * 						Sea Mail
     * 					
     * 
     */
    @XmlEnumValue("AU_SeaMailInternational")
    AU_SEA_MAIL_INTERNATIONAL("AU_SeaMailInternational"),

    /**
     * 
     * 						Standard International Flat Rate Postage
     * 					
     * 
     */
    @XmlEnumValue("AU_StandardInternational")
    AU_STANDARD_INTERNATIONAL("AU_StandardInternational"),

    /**
     * 
     * 						Expedited international flat rate postage
     * 					
     * 
     */
    @XmlEnumValue("AU_ExpeditedInternational")
    AU_EXPEDITED_INTERNATIONAL("AU_ExpeditedInternational"),

    /**
     * 
     * 						Other international postage
     * 					
     * 
     */
    @XmlEnumValue("AU_OtherInternational")
    AU_OTHER_INTERNATIONAL("AU_OtherInternational"),

    /**
     * 
     * 						Australia Post Registered Post International Padded Bag 1 kg
     * 					
     * 
     */
    @XmlEnumValue("AU_AusPostRegisteredPostInternationalPaddedBag1kg")
    AU_AUS_POST_REGISTERED_POST_INTERNATIONAL_PADDED_BAG_1_KG("AU_AusPostRegisteredPostInternationalPaddedBag1kg"),

    /**
     * 
     * 						Australia Post Registered Post International Padded Bag 500 g
     * 					
     * 
     */
    @XmlEnumValue("AU_AusPostRegisteredPostInternationalPaddedBag500g")
    AU_AUS_POST_REGISTERED_POST_INTERNATIONAL_PADDED_BAG_500_G("AU_AusPostRegisteredPostInternationalPaddedBag500g"),

    /**
     * 
     * 						Australia Post Registered Post International Parcel
     * 					
     * 
     */
    @XmlEnumValue("AU_AusPostRegisteredPostInternationalParcel")
    AU_AUS_POST_REGISTERED_POST_INTERNATIONAL_PARCEL("AU_AusPostRegisteredPostInternationalParcel"),

    /**
     * 
     * 						Expedited delivery from outside Australia
     * 					
     * 
     */
    @XmlEnumValue("AU_ExpeditedDeliveryFromOutsideAU")
    AU_EXPEDITED_DELIVERY_FROM_OUTSIDE_AU("AU_ExpeditedDeliveryFromOutsideAU"),

    /**
     * 
     * 						Economy delivery from outside Australia
     * 					
     * 
     */
    @XmlEnumValue("AU_EconomyDeliveryFromOutsideAU")
    AU_ECONOMY_DELIVERY_FROM_OUTSIDE_AU("AU_EconomyDeliveryFromOutsideAU"),

    /**
     * 
     * 						Standard Delivery From Outside AU
     * 					
     * 
     */
    @XmlEnumValue("AU_StandardDeliveryFromOutsideAU")
    AU_STANDARD_DELIVERY_FROM_OUTSIDE_AU("AU_StandardDeliveryFromOutsideAU"),

    /**
     * 
     * 						Australian Air Express Metro 15 kg
     * 					
     * 
     */
    @XmlEnumValue("AU_AustralianAirExpressMetro15kg")
    AU_AUSTRALIAN_AIR_EXPRESS_METRO_15_KG("AU_AustralianAirExpressMetro15kg"),

    /**
     * 
     * 						Australian Air Express Flat Rate 5 kg
     * 					
     * 
     */
    @XmlEnumValue("AU_AustralianAirExpressFlatRate5kg")
    AU_AUSTRALIAN_AIR_EXPRESS_FLAT_RATE_5_KG("AU_AustralianAirExpressFlatRate5kg"),

    /**
     * 
     * 						Australian Air Express Flat Rate 3 kg
     * 					
     * 
     */
    @XmlEnumValue("AU_AustralianAirExpressFlatRate3kg")
    AU_AUSTRALIAN_AIR_EXPRESS_FLAT_RATE_3_KG("AU_AustralianAirExpressFlatRate3kg"),

    /**
     * 
     * 						Australian Air Express Flat Rate 1 kg
     * 					
     * 
     */
    @XmlEnumValue("AU_AustralianAirExpressFlatRate1kg")
    AU_AUSTRALIAN_AIR_EXPRESS_FLAT_RATE_1_KG("AU_AustralianAirExpressFlatRate1kg"),

    /**
     * 
     * 						Express delivery (1-3 business days) in Australia
     * 					
     * 
     */
    @XmlEnumValue("AU_ExpressDelivery")
    AU_EXPRESS_DELIVERY("AU_ExpressDelivery"),

    /**
     * 
     * 						Standard delivery (1-6 business days) in Australia
     * 					
     * 
     */
    @XmlEnumValue("AU_StandardDelivery")
    AU_STANDARD_DELIVERY("AU_StandardDelivery"),

    /**
     * 
     * 						eBay/Australian Post 3 kg Flat Rate Satchel
     * 					
     * 
     */
    @XmlEnumValue("AU_eBayAusPost3kgFlatRateSatchel")
    AU_E_BAY_AUS_POST_3_KG_FLAT_RATE_SATCHEL("AU_eBayAusPost3kgFlatRateSatchel"),

    /**
     * 
     * 						eBay/Australian Post 500 g Flat Rate Satchel
     * 					
     * 
     */
    @XmlEnumValue("AU_eBayAusPost500gFlatRateSatchel")
    AU_E_BAY_AUS_POST_500_G_FLAT_RATE_SATCHEL("AU_eBayAusPost500gFlatRateSatchel"),

    /**
     * 
     * 						Freight delivery in Australia. Used for heavy and bulky items.
     * 					
     * 
     */
    @XmlEnumValue("AU_Freight")
    AU_FREIGHT("AU_Freight"),

    /**
     * 
     * 						Livraison standard a partir de l'etranger
     * 					
     * 
     */
    @XmlEnumValue("BEFR_StandardDelivery")
    BEFR_STANDARD_DELIVERY("BEFR_StandardDelivery"),

    /**
     * 
     * 						Livraison express
     * 					
     * 
     */
    @XmlEnumValue("BEFR_PriorityDelivery")
    BEFR_PRIORITY_DELIVERY("BEFR_PriorityDelivery"),

    /**
     * 
     * 						Colis
     * 					
     * 
     */
    @XmlEnumValue("BEFR_ParcelPost")
    BEFR_PARCEL_POST("BEFR_ParcelPost"),

    /**
     * 
     * 						Courrier en recommande
     * 					
     * 
     */
    @XmlEnumValue("BEFR_RegisteredMail")
    BEFR_REGISTERED_MAIL("BEFR_RegisteredMail"),

    /**
     * 
     * 						Autre service de livraison
     * 					
     * 
     */
    @XmlEnumValue("BEFR_Other")
    BEFR_OTHER("BEFR_Other"),

    /**
     * 
     * 						De Post
     * 					
     * 
     */
    @XmlEnumValue("BEFR_DePostInternational")
    BEFR_DE_POST_INTERNATIONAL("BEFR_DePostInternational"),

    /**
     * 
     * 						UPS
     * 					
     * 
     */
    @XmlEnumValue("BEFR_UPSInternational")
    BEFR_UPS_INTERNATIONAL("BEFR_UPSInternational"),

    /**
     * 
     * 						FedEx
     * 					
     * 
     */
    @XmlEnumValue("BEFR_FedExInternational")
    BEFR_FED_EX_INTERNATIONAL("BEFR_FedExInternational"),

    /**
     * 
     * 						DHL
     * 					
     * 
     */
    @XmlEnumValue("BEFR_DHLInternational")
    BEFR_DHL_INTERNATIONAL("BEFR_DHLInternational"),

    /**
     * 
     * 						TPG Post/TNT (Netherlands)
     * 					
     * 
     */
    @XmlEnumValue("BEFR_TPGPostTNTInternational")
    BEFR_TPG_POST_TNT_INTERNATIONAL("BEFR_TPGPostTNTInternational"),

    /**
     * 
     * 						Frais de livraison internationale fixes
     * 					
     * 
     */
    @XmlEnumValue("BEFR_StandardInternational")
    BEFR_STANDARD_INTERNATIONAL("BEFR_StandardInternational"),

    /**
     * 
     * 						Frais fixes pour livraison internationale express
     * 					
     * 
     */
    @XmlEnumValue("BEFR_ExpeditedInternational")
    BEFR_EXPEDITED_INTERNATIONAL("BEFR_ExpeditedInternational"),

    /**
     * 
     * 						Autres livraisons internationales (voir description)
     * 					
     * 
     */
    @XmlEnumValue("BEFR_OtherInternational")
    BEFR_OTHER_INTERNATIONAL("BEFR_OtherInternational"),

    /**
     * 
     * 						La Poste (France)
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LaPosteInternational")
    BEFR_LA_POSTE_INTERNATIONAL("BEFR_LaPosteInternational"),

    /**
     * La Poste - livraison standard (1 a 2 jours ouvrables)
     * 
     */
    @XmlEnumValue("BEFR_LaPosteStandardShipping")
    BEFR_LA_POSTE_STANDARD_SHIPPING("BEFR_LaPosteStandardShipping"),

    /**
     * La Poste - envoi recommande (1 jour ouvrable)
     * 
     */
    @XmlEnumValue("BEFR_LaPosteCertifiedShipping")
    BEFR_LA_POSTE_CERTIFIED_SHIPPING("BEFR_LaPosteCertifiedShipping"),

    /**
     * La Poste - Taxipost LLS (2 jours ouvrables)
     * 
     */
    @XmlEnumValue("BEFR_LaPosteTaxipostLLS")
    BEFR_LA_POSTE_TAXIPOST_LLS("BEFR_LaPosteTaxipostLLS"),

    /**
     * La Poste - Taxipost 24h (1 jour ouvrable)
     * 
     */
    @XmlEnumValue("BEFR_LaPosteTaxipost24h")
    BEFR_LA_POSTE_TAXIPOST_24_H("BEFR_LaPosteTaxipost24h"),

    /**
     * Autres livraisons
     * 
     */
    @XmlEnumValue("BEFR_LaPosteTaxipostSecur")
    BEFR_LA_POSTE_TAXIPOST_SECUR("BEFR_LaPosteTaxipostSecur"),

    /**
     * La Poste - livraison standard
     * 
     */
    @XmlEnumValue("BEFR_PostInternationalStandard")
    BEFR_POST_INTERNATIONAL_STANDARD("BEFR_PostInternationalStandard"),

    /**
     * La Poste - envoi recommande
     * 
     */
    @XmlEnumValue("BEFR_PostInternationalRegistered")
    BEFR_POST_INTERNATIONAL_REGISTERED("BEFR_PostInternationalRegistered"),

    /**
     * TNT
     * 
     */
    @XmlEnumValue("BEFR_TNTInternational")
    BEFR_TNT_INTERNATIONAL("BEFR_TNTInternational"),

    /**
     * 
     * 						Livraison economique a partir de l'etranger
     * 					
     * 
     */
    @XmlEnumValue("BEFR_EconomyDeliveryFromAbroad")
    BEFR_ECONOMY_DELIVERY_FROM_ABROAD("BEFR_EconomyDeliveryFromAbroad"),

    /**
     * 
     * 						Livraison standard a partir de l'etranger
     * 					
     * 
     */
    @XmlEnumValue("BEFR_StandardDeliveryFromAbroad")
    BEFR_STANDARD_DELIVERY_FROM_ABROAD("BEFR_StandardDeliveryFromAbroad"),

    /**
     * 
     * 						Livraison express a partir de l'etranger
     * 					
     * 
     */
    @XmlEnumValue("BEFR_ExpressDeliveryFromAbroad")
    BEFR_EXPRESS_DELIVERY_FROM_ABROAD("BEFR_ExpressDeliveryFromAbroad"),

    /**
     * 
     * 						Livraison a partir de l'etranger avec suivi de commande
     * 					
     * 
     */
    @XmlEnumValue("BEFR_TrackedDeliveryFromAbroad")
    BEFR_TRACKED_DELIVERY_FROM_ABROAD("BEFR_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						Standard Delivery
     * 					
     * 
     */
    @XmlEnumValue("BENL_StandardDelivery")
    BENL_STANDARD_DELIVERY("BENL_StandardDelivery"),

    /**
     * 
     * 						Priority Delivery
     * 					
     * 
     */
    @XmlEnumValue("BENL_PriorityDelivery")
    BENL_PRIORITY_DELIVERY("BENL_PriorityDelivery"),

    /**
     * 
     * 						Parcel Post
     * 					
     * 
     */
    @XmlEnumValue("BENL_ParcelPost")
    BENL_PARCEL_POST("BENL_ParcelPost"),

    /**
     * 
     * 						Registered Mail
     * 					
     * 
     */
    @XmlEnumValue("BENL_RegisteredMail")
    BENL_REGISTERED_MAIL("BENL_RegisteredMail"),

    /**
     * 
     * 						Other Shipping Service
     * 					
     * 
     */
    @XmlEnumValue("BENL_Other")
    BENL_OTHER("BENL_Other"),

    /**
     * 
     * 						De Post
     * 					
     * 
     */
    @XmlEnumValue("BENL_DePostInternational")
    BENL_DE_POST_INTERNATIONAL("BENL_DePostInternational"),

    /**
     * 
     * 						UPS
     * 					
     * 
     */
    @XmlEnumValue("BENL_UPSInternational")
    BENL_UPS_INTERNATIONAL("BENL_UPSInternational"),

    /**
     * 
     * 						FedEx
     * 					
     * 
     */
    @XmlEnumValue("BENL_FedExInternational")
    BENL_FED_EX_INTERNATIONAL("BENL_FedExInternational"),

    /**
     * 
     * 						DHL
     * 					
     * 
     */
    @XmlEnumValue("BENL_DHLInternational")
    BENL_DHL_INTERNATIONAL("BENL_DHLInternational"),

    /**
     * 
     * 						TPG Post/TNT (Netherlands)
     * 					
     * 
     */
    @XmlEnumValue("BENL_TPGPostTNTInternational")
    BENL_TPG_POST_TNT_INTERNATIONAL("BENL_TPGPostTNTInternational"),

    /**
     * 
     * 						Standard International
     * 					
     * 
     */
    @XmlEnumValue("BENL_StandardInternational")
    BENL_STANDARD_INTERNATIONAL("BENL_StandardInternational"),

    /**
     * 
     * 						Expedited International
     * 					
     * 
     */
    @XmlEnumValue("BENL_ExpeditedInternational")
    BENL_EXPEDITED_INTERNATIONAL("BENL_ExpeditedInternational"),

    /**
     * 
     * 						Other International Shipping Services
     * 					
     * 
     */
    @XmlEnumValue("BENL_OtherInternational")
    BENL_OTHER_INTERNATIONAL("BENL_OtherInternational"),

    /**
     * 
     * 						La Poste (France)
     * 					
     * 
     */
    @XmlEnumValue("BENL_LaPosteInternational")
    BENL_LA_POSTE_INTERNATIONAL("BENL_LaPosteInternational"),

    /**
     * De Post - standaardverzending (1 tot 2 werkdagen)
     * 
     */
    @XmlEnumValue("BENL_DePostStandardShipping")
    BENL_DE_POST_STANDARD_SHIPPING("BENL_DePostStandardShipping"),

    /**
     * De Post - aangetekende zending (1 werkdag)
     * 
     */
    @XmlEnumValue("BENL_DePostCertifiedShipping")
    BENL_DE_POST_CERTIFIED_SHIPPING("BENL_DePostCertifiedShipping"),

    /**
     * De Post - Taxipost LLS (2 werkdagen)
     * 
     */
    @XmlEnumValue("BENL_DePostTaxipostLLS")
    BENL_DE_POST_TAXIPOST_LLS("BENL_DePostTaxipostLLS"),

    /**
     * De Post - Taxipost 24u (1 werkdag)
     * 
     */
    @XmlEnumValue("BENL_DePostTaxipost24h")
    BENL_DE_POST_TAXIPOST_24_H("BENL_DePostTaxipost24h"),

    /**
     * De Post - Taxipost Secur (1 werkdag)
     * 
     */
    @XmlEnumValue("BENL_DePostTaxipostSecur")
    BENL_DE_POST_TAXIPOST_SECUR("BENL_DePostTaxipostSecur"),

    /**
     * Andere verzending
     * 
     */
    @XmlEnumValue("BENL_OtherShippingMethods")
    BENL_OTHER_SHIPPING_METHODS("BENL_OtherShippingMethods"),

    /**
     * De Post - standaardverzending
     * 
     */
    @XmlEnumValue("BENL_PostInternationalStandard")
    BENL_POST_INTERNATIONAL_STANDARD("BENL_PostInternationalStandard"),

    /**
     * De Post - aangetekende zending
     * 
     */
    @XmlEnumValue("BENL_PostInternationalRegistered")
    BENL_POST_INTERNATIONAL_REGISTERED("BENL_PostInternationalRegistered"),

    /**
     * TNT
     * 
     */
    @XmlEnumValue("BENL_TNTInternational")
    BENL_TNT_INTERNATIONAL("BENL_TNTInternational"),

    /**
     * Voordelige verzending uit het buitenland
     * 
     */
    @XmlEnumValue("BENL_EconomyDeliveryFromAbroad")
    BENL_ECONOMY_DELIVERY_FROM_ABROAD("BENL_EconomyDeliveryFromAbroad"),

    /**
     * Standaardverzending uit het buitenland
     * 
     */
    @XmlEnumValue("BENL_StandardDeliveryFromAbroad")
    BENL_STANDARD_DELIVERY_FROM_ABROAD("BENL_StandardDeliveryFromAbroad"),

    /**
     * Express verzending uit het buitenland
     * 
     */
    @XmlEnumValue("BENL_ExpressDeliveryFromAbroad")
    BENL_EXPRESS_DELIVERY_FROM_ABROAD("BENL_ExpressDeliveryFromAbroad"),

    /**
     * Verzending uit het buitenland met internationale tracking
     * 
     */
    @XmlEnumValue("BENL_TrackedDeliveryFromAbroad")
    BENL_TRACKED_DELIVERY_FROM_ABROAD("BENL_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						Standard Delivery
     * 					
     * 
     */
    @XmlEnumValue("CA_StandardDelivery")
    CA_STANDARD_DELIVERY("CA_StandardDelivery"),

    /**
     * 
     * 						Expedited delivery
     * 					
     * 
     */
    @XmlEnumValue("CA_ExpeditedDelivery")
    CA_EXPEDITED_DELIVERY("CA_ExpeditedDelivery"),

    /**
     * 
     * 						Canada Post Lettermail
     * 					
     * 
     */
    @XmlEnumValue("CA_PostLettermail")
    CA_POST_LETTERMAIL("CA_PostLettermail"),

    /**
     * 
     * 						Canada Post Regular Parcel
     * 					
     * 
     */
    @XmlEnumValue("CA_PostRegularParcel")
    CA_POST_REGULAR_PARCEL("CA_PostRegularParcel"),

    /**
     * 
     * 						Canada Post Expedited Parcel
     * 					
     * 
     */
    @XmlEnumValue("CA_PostExpeditedParcel")
    CA_POST_EXPEDITED_PARCEL("CA_PostExpeditedParcel"),

    /**
     * 
     * 						Canada Post Xpresspost - International
     * 					
     * 
     */
    @XmlEnumValue("CA_PostXpresspost")
    CA_POST_XPRESSPOST("CA_PostXpresspost"),

    /**
     * 
     * 						Canada Post Priority Courier
     * 					
     * 
     */
    @XmlEnumValue("CA_PostPriorityCourier")
    CA_POST_PRIORITY_COURIER("CA_PostPriorityCourier"),

    /**
     * 
     * 						Canada Post Expedited Flat Rate Box
     * 					
     * 
     */
    @XmlEnumValue("CanadaPostExpeditedFlatRateBox")
    CANADA_POST_EXPEDITED_FLAT_RATE_BOX("CanadaPostExpeditedFlatRateBox"),

    /**
     * 
     * 						
     * 						(This value is no longer used.)
     * 					
     * 
     */
    @XmlEnumValue("CA_PostExpeditedFlatRateBox")
    CA_POST_EXPEDITED_FLAT_RATE_BOX("CA_PostExpeditedFlatRateBox"),

    /**
     * 
     * 						Standard International Flat Rate Shipping
     * 					
     * 
     */
    @XmlEnumValue("CA_StandardInternational")
    CA_STANDARD_INTERNATIONAL("CA_StandardInternational"),

    /**
     * 
     * 						Expedited International Flat Rate Shipping
     * 					
     * 
     */
    @XmlEnumValue("CA_ExpeditedInternational")
    CA_EXPEDITED_INTERNATIONAL("CA_ExpeditedInternational"),

    /**
     * 
     * 						Other International Shipping (see description)
     * 					
     * 
     */
    @XmlEnumValue("CA_OtherInternational")
    CA_OTHER_INTERNATIONAL("CA_OtherInternational"),

    /**
     * 
     * 						Canada Post Expedited Parcel - USA
     * 					
     * 
     */
    @XmlEnumValue("CA_PostExpeditedParcelUSA")
    CA_POST_EXPEDITED_PARCEL_USA("CA_PostExpeditedParcelUSA"),

    /**
     * 
     * 						Canada Post Small Packets - USA
     * 					
     * 
     */
    @XmlEnumValue("CA_PostSmallPacketsUSA")
    CA_POST_SMALL_PACKETS_USA("CA_PostSmallPacketsUSA"),

    /**
     * 
     * 						Canada Post Xpresspost - USA
     * 					
     * 
     */
    @XmlEnumValue("CA_PostXpresspostUSA")
    CA_POST_XPRESSPOST_USA("CA_PostXpresspostUSA"),

    /**
     * 
     * 						Canada Post Xpresspost - International
     * 					
     * 
     */
    @XmlEnumValue("CA_PostXpresspostInternational")
    CA_POST_XPRESSPOST_INTERNATIONAL("CA_PostXpresspostInternational"),

    /**
     * 
     * 						Canada Post International Parcel - Surface
     * 					
     * 
     */
    @XmlEnumValue("CA_PostInternationalParcelSurface")
    CA_POST_INTERNATIONAL_PARCEL_SURFACE("CA_PostInternationalParcelSurface"),

    /**
     * 
     * 						Canada Post International Parcel - Air
     * 					
     * 
     */
    @XmlEnumValue("CA_PostInternationalParcelAir")
    CA_POST_INTERNATIONAL_PARCEL_AIR("CA_PostInternationalParcelAir"),

    /**
     * 
     * 						Small Packets - International
     * 					
     * 
     */
    @XmlEnumValue("CA_SmallPacketsInternational")
    CA_SMALL_PACKETS_INTERNATIONAL("CA_SmallPacketsInternational"),

    /**
     * 
     * 						Purolator International
     * 					
     * 
     */
    @XmlEnumValue("CA_PurolatorInternational")
    CA_PUROLATOR_INTERNATIONAL("CA_PurolatorInternational"),

    /**
     * 
     * 						Canada Post Small Packets - USA - Ground
     * 					
     * 
     */
    @XmlEnumValue("CA_PostSmallPacketsUSAGround")
    CA_POST_SMALL_PACKETS_USA_GROUND("CA_PostSmallPacketsUSAGround"),

    /**
     * 
     * 						Canada Post Small Packets - USA - Air
     * 					
     * 
     */
    @XmlEnumValue("CA_PostSmallPacketsUSAAir")
    CA_POST_SMALL_PACKETS_USA_AIR("CA_PostSmallPacketsUSAAir"),

    /**
     * 
     * 						Small Packets - International - Ground
     * 					
     * 
     */
    @XmlEnumValue("CA_SmallPacketsInternationalGround")
    CA_SMALL_PACKETS_INTERNATIONAL_GROUND("CA_SmallPacketsInternationalGround"),

    /**
     * 
     * 						Small Packets - International - Air
     * 					
     * 
     */
    @XmlEnumValue("CA_SmallPacketsInternationalAir")
    CA_SMALL_PACKETS_INTERNATIONAL_AIR("CA_SmallPacketsInternationalAir"),

    /**
     * 
     * 						Canada Post USA Letter-post
     * 					
     * 
     */
    @XmlEnumValue("CA_PostUSALetterPost")
    CA_POST_USA_LETTER_POST("CA_PostUSALetterPost"),

    /**
     * 
     * 						Canada Post International Letter-post
     * 					
     * 
     */
    @XmlEnumValue("CA_PostInternationalLetterPost")
    CA_POST_INTERNATIONAL_LETTER_POST("CA_PostInternationalLetterPost"),

    /**
     * 
     * 						
     * 						(This value is no longer used.)
     * 					
     * 
     */
    @XmlEnumValue("CA_PostExpeditedFlatRateBoxUSA")
    CA_POST_EXPEDITED_FLAT_RATE_BOX_USA("CA_PostExpeditedFlatRateBoxUSA"),

    /**
     * 
     * 						UPS Express Canada
     * 					
     * 
     */
    @XmlEnumValue("CA_UPSExpressCanada")
    CA_UPS_EXPRESS_CANADA("CA_UPSExpressCanada"),

    /**
     * 
     * 						UPS Express Saver Canada
     * 					
     * 
     */
    @XmlEnumValue("CA_UPSExpressSaverCanada")
    CA_UPS_EXPRESS_SAVER_CANADA("CA_UPSExpressSaverCanada"),

    /**
     * 
     * 						UPS Expedited Canada
     * 					
     * 
     */
    @XmlEnumValue("CA_UPSExpeditedCanada")
    CA_UPS_EXPEDITED_CANADA("CA_UPSExpeditedCanada"),

    /**
     * 
     * 						UPS Standard Canada
     * 					
     * 
     */
    @XmlEnumValue("CA_UPSStandardCanada")
    CA_UPS_STANDARD_CANADA("CA_UPSStandardCanada"),

    /**
     * 
     * 						UPS Express United States
     * 					
     * 
     */
    @XmlEnumValue("CA_UPSExpressUnitedStates")
    CA_UPS_EXPRESS_UNITED_STATES("CA_UPSExpressUnitedStates"),

    /**
     * 
     * 						UPS Expedited United States
     * 					
     * 
     */
    @XmlEnumValue("CA_UPSExpeditedUnitedStates")
    CA_UPS_EXPEDITED_UNITED_STATES("CA_UPSExpeditedUnitedStates"),

    /**
     * 
     * 						UPS 3 Day Select United States
     * 					
     * 
     */
    @XmlEnumValue("CA_UPS3DaySelectUnitedStates")
    CA_UPS_3_DAY_SELECT_UNITED_STATES("CA_UPS3DaySelectUnitedStates"),

    /**
     * 
     * 						UPS Standard United States
     * 					
     * 
     */
    @XmlEnumValue("CA_UPSStandardUnitedStates")
    CA_UPS_STANDARD_UNITED_STATES("CA_UPSStandardUnitedStates"),

    /**
     * 
     * 						UPS Worldwide Express
     * 					
     * 
     */
    @XmlEnumValue("CA_UPSWorldWideExpress")
    CA_UPS_WORLD_WIDE_EXPRESS("CA_UPSWorldWideExpress"),

    /**
     * 
     * 						UPS Worldwide Expedited
     * 					
     * 
     */
    @XmlEnumValue("CA_UPSWorldWideExpedited")
    CA_UPS_WORLD_WIDE_EXPEDITED("CA_UPSWorldWideExpedited"),

    /**
     * 
     * 						Canada Post Priority Worldwide
     * 					
     * 
     */
    @XmlEnumValue("CA_PriorityWorldwide")
    CA_PRIORITY_WORLDWIDE("CA_PriorityWorldwide"),

    /**
     * 
     * 						Canada Post Expedited Flat Rate Box USA
     * 					
     * 
     */
    @XmlEnumValue("CanadaPostExpeditedFlatRateBoxUSA")
    CANADA_POST_EXPEDITED_FLAT_RATE_BOX_USA("CanadaPostExpeditedFlatRateBoxUSA"),

    /**
     * 
     * 						Canada Post Tracked Packet - USA
     * 					
     * 
     */
    @XmlEnumValue("CA_PostTrackedPacketsUSA")
    CA_POST_TRACKED_PACKETS_USA("CA_PostTrackedPacketsUSA"),

    /**
     * 
     * 						Canada Post Tracked Packet - International
     * 					
     * 
     */
    @XmlEnumValue("CA_PostTrackedPacketsInternational")
    CA_POST_TRACKED_PACKETS_INTERNATIONAL("CA_PostTrackedPacketsInternational"),

    /**
     * 
     * 						Freight
     * 					
     * 
     */
    @XmlEnumValue("CA_Freight")
    CA_FREIGHT("CA_Freight"),

    /**
     * 
     * 						Standardversand (A-Post/Priority)
     * 					
     * 
     */
    @XmlEnumValue("CH_StandardDispatchAPost")
    CH_STANDARD_DISPATCH_A_POST("CH_StandardDispatchAPost"),

    /**
     * 
     * 						Standardversand (B-Post/Economy)
     * 					
     * 
     */
    @XmlEnumValue("CH_StandardDispatchBPost")
    CH_STANDARD_DISPATCH_B_POST("CH_StandardDispatchBPost"),

    /**
     * 
     * 						Versicherter Versand (z.B. Assurance/Fragile)
     * 					
     * 
     */
    @XmlEnumValue("CH_InsuredDispatch")
    CH_INSURED_DISPATCH("CH_InsuredDispatch"),

    /**
     * 
     * 						Einschreiben (Versand inkl. Einschreibengebuhr)
     * 					
     * 
     */
    @XmlEnumValue("CH_Writing")
    CH_WRITING("CH_Writing"),

    /**
     * 
     * 						Nachnahme (Versand inkl. Nachnahmegebuhr)
     * 					
     * 
     */
    CH_COD("CH_COD"),

    /**
     * 
     * 						Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("CH_ExpressOrCourier")
    CH_EXPRESS_OR_COURIER("CH_ExpressOrCourier"),

    /**
     * 
     * 						Versicherter Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("CH_InsuredExpressOrCourier")
    CH_INSURED_EXPRESS_OR_COURIER("CH_InsuredExpressOrCourier"),

    /**
     * 
     * 						Sonder-/Speditionsversand (z.B. Mobel, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("CH_SpecialDispatch")
    CH_SPECIAL_DISPATCH("CH_SpecialDispatch"),

    /**
     * 
     * 						Versicherter Sonder-/Speditionsversand (z.B. Mobel, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("CH_InsuredSpecialDispatch")
    CH_INSURED_SPECIAL_DISPATCH("CH_InsuredSpecialDispatch"),

    /**
     * 
     * 						Sonstige (Siehe Artikelbeschreibung)
     * 					
     * 
     */
    @XmlEnumValue("CH_Sonstige")
    CH_SONSTIGE("CH_Sonstige"),

    /**
     * 
     * 						Sonstiger Versand (Siehe Artikelbeschreibung)
     * 					
     * 
     */
    @XmlEnumValue("CH_SonstigerVersandInternational")
    CH_SONSTIGER_VERSAND_INTERNATIONAL("CH_SonstigerVersandInternational"),

    /**
     * 
     * 						ECONOMY Sendungen
     * 					
     * 
     */
    @XmlEnumValue("CH_EconomySendungenInternational")
    CH_ECONOMY_SENDUNGEN_INTERNATIONAL("CH_EconomySendungenInternational"),

    /**
     * 
     * 						PRIORITY Sendungen
     * 					
     * 
     */
    @XmlEnumValue("CH_PrioritySendungenInternational")
    CH_PRIORITY_SENDUNGEN_INTERNATIONAL("CH_PrioritySendungenInternational"),

    /**
     * 
     * 						URGENT Sendungen
     * 					
     * 
     */
    @XmlEnumValue("CH_UrgentSendungenInternational")
    CH_URGENT_SENDUNGEN_INTERNATIONAL("CH_UrgentSendungenInternational"),

    /**
     * 
     * 						Sparversand aus dem Ausland
     * 					
     * 
     */
    @XmlEnumValue("CH_EconomyDeliveryFromAbroad")
    CH_ECONOMY_DELIVERY_FROM_ABROAD("CH_EconomyDeliveryFromAbroad"),

    /**
     * 
     * 						Standardversand aus dem Ausland
     * 					
     * 
     */
    @XmlEnumValue("CH_StandardDeliveryFromAbroad")
    CH_STANDARD_DELIVERY_FROM_ABROAD("CH_StandardDeliveryFromAbroad"),

    /**
     * 
     * 						Expressversand aus dem Ausland
     * 					
     * 
     */
    @XmlEnumValue("CH_ExpressDeliveryFromAbroad")
    CH_EXPRESS_DELIVERY_FROM_ABROAD("CH_ExpressDeliveryFromAbroad"),

    /**
     * 
     * 						Versand mit Nachverfolgung aus dem Ausland
     * 					
     * 
     */
    @XmlEnumValue("CH_TrackedDeliveryFromAbroad")
    CH_TRACKED_DELIVERY_FROM_ABROAD("CH_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						Seller door delivery (limited to the city)
     * 					
     * 
     */
    @XmlEnumValue("CN_PersonalDelivery")
    CN_PERSONAL_DELIVERY("CN_PersonalDelivery"),

    /**
     * 
     * 						China Post Post Office
     * 					
     * 
     */
    @XmlEnumValue("CN_RegularPackage")
    CN_REGULAR_PACKAGE("CN_RegularPackage"),

    /**
     * 
     * 						Logistics company express
     * 					
     * 
     */
    @XmlEnumValue("CN_DeliveryCompanyExpress")
    CN_DELIVERY_COMPANY_EXPRESS("CN_DeliveryCompanyExpress"),

    /**
     * 
     * 						EMS Express
     * 					
     * 
     */
    @XmlEnumValue("CN_PostOfficeExpress")
    CN_POST_OFFICE_EXPRESS("CN_PostOfficeExpress"),

    /**
     * 
     * 						Other (see item description)
     * 					
     * 
     */
    @XmlEnumValue("CN_Others")
    CN_OTHERS("CN_Others"),

    /**
     * 
     * 						China Post Express Mail
     * 					
     * 
     */
    @XmlEnumValue("CN_FastPostOffice")
    CN_FAST_POST_OFFICE("CN_FastPostOffice"),

    /**
     * 
     * 						City Express
     * 					
     * 
     */
    @XmlEnumValue("CN_ExpressDeliverySameCity")
    CN_EXPRESS_DELIVERY_SAME_CITY("CN_ExpressDeliverySameCity"),

    /**
     * 
     * 						Off-site delivery
     * 					
     * 
     */
    @XmlEnumValue("CN_ExpressDeliveryOtherCities")
    CN_EXPRESS_DELIVERY_OTHER_CITIES("CN_ExpressDeliveryOtherCities"),

    /**
     * 
     * 						International Standard Fixed Freight
     * 					
     * 
     */
    @XmlEnumValue("CN_StandardInternational")
    CN_STANDARD_INTERNATIONAL("CN_StandardInternational"),

    /**
     * 
     * 						International courier fixed freight
     * 					
     * 
     */
    @XmlEnumValue("CN_ExpeditedInternational")
    CN_EXPEDITED_INTERNATIONAL("CN_ExpeditedInternational"),

    /**
     * 
     * 						Other international shipping charges (see note)
     * 					
     * 
     */
    @XmlEnumValue("CN_OtherInternational")
    CN_OTHER_INTERNATIONAL("CN_OtherInternational"),

    /**
     * 
     * 						COD (same city only)
     * 					
     * 
     */
    @XmlEnumValue("CN_CODInternational")
    CN_COD_INTERNATIONAL("CN_CODInternational"),

    /**
     * 
     * 						Standard Mailing
     * 					
     * 
     */
    @XmlEnumValue("CN_StandardMailingInternational")
    CN_STANDARD_MAILING_INTERNATIONAL("CN_StandardMailingInternational"),

    /**
     * 
     * 						Regular logistics
     * 					
     * 
     */
    @XmlEnumValue("CN_RegularLogisticsInternational")
    CN_REGULAR_LOGISTICS_INTERNATIONAL("CN_RegularLogisticsInternational"),

    /**
     * 
     * 						EMS
     * 					
     * 
     */
    @XmlEnumValue("CN_EMSInternational")
    CN_EMS_INTERNATIONAL("CN_EMSInternational"),

    /**
     * 
     * 						Others (see description)
     * 					
     * 
     */
    @XmlEnumValue("CN_OthersInternational")
    CN_OTHERS_INTERNATIONAL("CN_OthersInternational"),

    /**
     * 
     * 						Unversicherter Versand
     * 					
     * 
     */
    @XmlEnumValue("DE_StandardDispatch")
    DE_STANDARD_DISPATCH("DE_StandardDispatch"),

    /**
     * 
     * 						Versicherter Versand
     * 					
     * 
     */
    @XmlEnumValue("DE_InsuredDispatch")
    DE_INSURED_DISPATCH("DE_InsuredDispatch"),

    /**
     * 
     * 						Einschreiben (Versand inkl. Einschreibengebuhr)
     * 					
     * 
     */
    @XmlEnumValue("DE_Writing")
    DE_WRITING("DE_Writing"),

    /**
     * 
     * 						Nachnahme (Versand inkl. Nachnahmegebuhr)
     * 					
     * 
     */
    DE_COD("DE_COD"),

    /**
     * 
     * 						Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("DE_ExpressOrCourier")
    DE_EXPRESS_OR_COURIER("DE_ExpressOrCourier"),

    /**
     * 
     * 						Versicherter Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("DE_InsuredExpressOrCourier")
    DE_INSURED_EXPRESS_OR_COURIER("DE_InsuredExpressOrCourier"),

    /**
     * 
     * 						Sonderversand (z.B. Mobel, KFZ)DE_DHLPackchen
     * 					
     * 
     */
    @XmlEnumValue("DE_SpecialDispatch")
    DE_SPECIAL_DISPATCH("DE_SpecialDispatch"),

    /**
     * 
     * 						Versicherter Sonderversand (z.B. Mobel, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("DE_InsuredSpecialDispatch")
    DE_INSURED_SPECIAL_DISPATCH("DE_InsuredSpecialDispatch"),

    /**
     * 
     * 						Unversicherter Versand
     * 					
     * 
     */
    @XmlEnumValue("DE_UnversicherterVersand")
    DE_UNVERSICHERTER_VERSAND("DE_UnversicherterVersand"),

    /**
     * 
     * 						Deutsche Post Brief
     * 					
     * 
     */
    @XmlEnumValue("DE_DeutschePostBrief")
    DE_DEUTSCHE_POST_BRIEF("DE_DeutschePostBrief"),

    /**
     * 
     * 						eBay DHL Paket 24/7 (Abgabe und Lieferung an Packstation)
     * 					
     * 
     */
    @XmlEnumValue("DE_eBayDHLPaket24x7")
    DE_E_BAY_DHL_PAKET_24_X_7("DE_eBayDHLPaket24x7"),

    /**
     * 
     * 						DHL Postpaket
     * 					
     * 
     */
    @XmlEnumValue("DE_DHLPostpaket")
    DE_DHL_POSTPAKET("DE_DHLPostpaket"),

    /**
     * 
     * 						DHL Packchen International
     * 					
     * 
     */
    @XmlEnumValue("DE_DHLPackchen")
    DE_DHL_PACKCHEN("DE_DHLPackchen"),

    /**
     * 
     * 						Deutsche Post Warensendung
     * 					
     * 
     */
    @XmlEnumValue("DE_DeutschePostWarensendung")
    DE_DEUTSCHE_POST_WARENSENDUNG("DE_DeutschePostWarensendung"),

    /**
     * 
     * 						Deutsche Post Buchersendung
     * 					
     * 
     */
    @XmlEnumValue("DE_DeutschePostBuchersendung")
    DE_DEUTSCHE_POST_BUCHERSENDUNG("DE_DeutschePostBuchersendung"),

    /**
     * 
     * 						Hermes Paket (unversichert)
     * 					
     * 
     */
    @XmlEnumValue("DE_HermesPaketUnversichert")
    DE_HERMES_PAKET_UNVERSICHERT("DE_HermesPaketUnversichert"),

    /**
     * 
     * 						Hermes Paket (versichert)
     * 					
     * 
     */
    @XmlEnumValue("DE_HermesPaketVersichert")
    DE_HERMES_PAKET_VERSICHERT("DE_HermesPaketVersichert"),

    /**
     * 
     * 						iloxx Transport XXL
     * 					
     * 
     */
    @XmlEnumValue("DE_IloxxTransportXXL")
    DE_ILOXX_TRANSPORT_XXL("DE_IloxxTransportXXL"),

    /**
     * 
     * 						iloxx Express
     * 					
     * 
     */
    @XmlEnumValue("DE_IloxxUbernachtExpress")
    DE_ILOXX_UBERNACHT_EXPRESS("DE_IloxxUbernachtExpress"),

    /**
     * 
     * 						iloxx Standard
     * 					
     * 
     */
    @XmlEnumValue("DE_IloxxStandard")
    DE_ILOXX_STANDARD("DE_IloxxStandard"),

    /**
     * 
     * 						Sonstige (Siehe Artikelbeschreibung)
     * 					
     * 
     */
    @XmlEnumValue("DE_Sonstige")
    DE_SONSTIGE("DE_Sonstige"),

    /**
     * 
     * 						Unversicherter Versand
     * 					
     * 
     */
    @XmlEnumValue("DE_UnversicherterVersandInternational")
    DE_UNVERSICHERTER_VERSAND_INTERNATIONAL("DE_UnversicherterVersandInternational"),

    /**
     * 
     * 						Versicherter Versand
     * 					
     * 
     */
    @XmlEnumValue("DE_VersicherterVersandInternational")
    DE_VERSICHERTER_VERSAND_INTERNATIONAL("DE_VersicherterVersandInternational"),

    /**
     * 
     * 						DHL Postpaket International
     * 					
     * 
     */
    @XmlEnumValue("DE_DHLPostpaketInternational")
    DE_DHL_POSTPAKET_INTERNATIONAL("DE_DHLPostpaketInternational"),

    /**
     * 
     * 						DHL Packchen International
     * 					
     * 
     */
    @XmlEnumValue("DE_DHLPackchenInternational")
    DE_DHL_PACKCHEN_INTERNATIONAL("DE_DHLPackchenInternational"),

    /**
     * 
     * 						Sonstiger Versand (Siehe Artikelbeschreibung)
     * 					
     * 
     */
    @XmlEnumValue("DE_SonstigerVersandInternational")
    DE_SONSTIGER_VERSAND_INTERNATIONAL("DE_SonstigerVersandInternational"),

    /**
     * 
     * 						Unversicherter Express - Versand
     * 					
     * 
     */
    @XmlEnumValue("DE_UnversicherterExpressVersandInternational")
    DE_UNVERSICHERTER_EXPRESS_VERSAND_INTERNATIONAL("DE_UnversicherterExpressVersandInternational"),

    /**
     * 
     * 						Versicherter Express - Versand
     * 					
     * 
     */
    @XmlEnumValue("DE_VersicherterExpressVersandInternational")
    DE_VERSICHERTER_EXPRESS_VERSAND_INTERNATIONAL("DE_VersicherterExpressVersandInternational"),

    /**
     * 
     * 						Deutsche Post Brief (Land)
     * 					
     * 
     */
    @XmlEnumValue("DE_DeutschePostBriefLandInternational")
    DE_DEUTSCHE_POST_BRIEF_LAND_INTERNATIONAL("DE_DeutschePostBriefLandInternational"),

    /**
     * 
     * 						Deutsche Post Brief (Luft)
     * 					
     * 
     */
    @XmlEnumValue("DE_DeutschePostBriefLuftInternational")
    DE_DEUTSCHE_POST_BRIEF_LUFT_INTERNATIONAL("DE_DeutschePostBriefLuftInternational"),

    /**
     * 
     * 						iloxx Europa
     * 					
     * 
     */
    @XmlEnumValue("DE_IloxxEuropaInternational")
    DE_ILOXX_EUROPA_INTERNATIONAL("DE_IloxxEuropaInternational"),

    /**
     * 
     * 						iloxx World Wide
     * 					
     * 
     */
    @XmlEnumValue("DE_IloxxWorldWideInternational")
    DE_ILOXX_WORLD_WIDE_INTERNATIONAL("DE_IloxxWorldWideInternational"),

    /**
     * Paketversand
     * 
     */
    @XmlEnumValue("DE_Paket")
    DE_PAKET("DE_Paket"),

    /**
     * Expressversand
     * 
     */
    @XmlEnumValue("DE_Express")
    DE_EXPRESS("DE_Express"),

    /**
     * DHL Paket
     * 
     */
    @XmlEnumValue("DE_DHLPaket")
    DE_DHL_PAKET("DE_DHLPaket"),

    /**
     * Deutsche Post Buecher-/Warensendung
     * 
     */
    @XmlEnumValue("DE_DPBuecherWarensendung")
    DE_DP_BUECHER_WARENSENDUNG("DE_DPBuecherWarensendung"),

    /**
     * Hermes Paket
     * 
     */
    @XmlEnumValue("DE_HermesPaket")
    DE_HERMES_PAKET("DE_HermesPaket"),

    /**
     * iloxx Transport
     * 
     */
    @XmlEnumValue("DE_IloxxTransport")
    DE_ILOXX_TRANSPORT("DE_IloxxTransport"),

    /**
     * Sonstige
     * 
     */
    @XmlEnumValue("DE_SonstigeDomestic")
    DE_SONSTIGE_DOMESTIC("DE_SonstigeDomestic"),

    /**
     * Einschreiben (inkl. aller Gebuehren)
     * 
     */
    @XmlEnumValue("DE_Einschreiben")
    DE_EINSCHREIBEN("DE_Einschreiben"),

    /**
     * Nachnahme (inkl. aller Gebuehren)
     * 
     */
    @XmlEnumValue("DE_Nachname")
    DE_NACHNAME("DE_Nachname"),

    /**
     * Sonderversand
     * 
     */
    @XmlEnumValue("DE_SpecialDelivery")
    DE_SPECIAL_DELIVERY("DE_SpecialDelivery"),

    /**
     * UPS
     * 
     */
    DE_UPS("DE_UPS"),

    /**
     * DPD
     * 
     */
    DE_DPD("DE_DPD"),

    /**
     * GLS
     * 
     */
    DE_GLS("DE_GLS"),

    /**
     * Paketversand
     * 
     */
    @XmlEnumValue("DE_PaketInternational")
    DE_PAKET_INTERNATIONAL("DE_PaketInternational"),

    /**
     * DHL Paket International
     * 
     */
    @XmlEnumValue("DE_DHLPaketInternational")
    DE_DHL_PAKET_INTERNATIONAL("DE_DHLPaketInternational"),

    /**
     * DHL Paket International Express
     * 
     */
    @XmlEnumValue("DE_DHLPaketIntlExpress")
    DE_DHL_PAKET_INTL_EXPRESS("DE_DHLPaketIntlExpress"),

    /**
     * Sonstige
     * 
     */
    @XmlEnumValue("DE_SonstigeInternational")
    DE_SONSTIGE_INTERNATIONAL("DE_SonstigeInternational"),

    /**
     * Expressversand
     * 
     */
    @XmlEnumValue("DE_ExpressInternational")
    DE_EXPRESS_INTERNATIONAL("DE_ExpressInternational"),

    /**
     * Deutsche Post Brief
     * 
     */
    @XmlEnumValue("DE_DPBriefInternational")
    DE_DP_BRIEF_INTERNATIONAL("DE_DPBriefInternational"),

    /**
     * iloxx Transport International
     * 
     */
    @XmlEnumValue("DE_IloxxTransportInternational")
    DE_ILOXX_TRANSPORT_INTERNATIONAL("DE_IloxxTransportInternational"),

    /**
     * Hermes Paket International
     * 
     */
    @XmlEnumValue("DE_HermesPaketInternational")
    DE_HERMES_PAKET_INTERNATIONAL("DE_HermesPaketInternational"),

    /**
     * UPS International
     * 
     */
    @XmlEnumValue("DE_UPSInternational")
    DE_UPS_INTERNATIONAL("DE_UPSInternational"),

    /**
     * DPD International
     * 
     */
    @XmlEnumValue("DE_DPDInternational")
    DE_DPD_INTERNATIONAL("DE_DPDInternational"),

    /**
     * GLS International
     * 
     */
    @XmlEnumValue("DE_GLSInternational")
    DE_GLS_INTERNATIONAL("DE_GLSInternational"),

    /**
     * 
     * 						eBay Hermes Paket Shop2Shop (Kaeufer erhaelt E-Mail von Hermes bei Zustellung)
     * 					
     * 
     */
    @XmlEnumValue("DE_eBayHermesPaketShop2ShopKaeufer")
    DE_E_BAY_HERMES_PAKET_SHOP_2_SHOP_KAEUFER("DE_eBayHermesPaketShop2ShopKaeufer"),

    /**
     * 
     * 						Hermes Paket Shop2Shop (Kaeufer erhaelt E-Mail von Hermes bei Zustellung)
     * 					
     * 
     */
    @XmlEnumValue("DE_HermesPaketShop2ShopKaeufer")
    DE_HERMES_PAKET_SHOP_2_SHOP_KAEUFER("DE_HermesPaketShop2ShopKaeufer"),

    /**
     * 
     * 						eBay Hermes Paket Shop2Shop
     * 					
     * 
     */
    @XmlEnumValue("DE_eBayHermesPaketShop2Shop")
    DE_E_BAY_HERMES_PAKET_SHOP_2_SHOP("DE_eBayHermesPaketShop2Shop"),

    /**
     * 
     * 						Hermes Paket Shop2Shop
     * 					
     * 
     */
    @XmlEnumValue("DE_HermesPaketShop2Shop")
    DE_HERMES_PAKET_SHOP_2_SHOP("DE_HermesPaketShop2Shop"),

    /**
     * 
     * 						Hermes Paket Sperrgut
     * 					
     * 
     */
    @XmlEnumValue("DE_HermesPaketSperrgut")
    DE_HERMES_PAKET_SPERRGUT("DE_HermesPaketSperrgut"),

    /**
     * 
     * 						eBay Hermes Paket Sperrgut Shop2Shop (Abgabe und Zustellung im Paketshop)
     * 					
     * 
     */
    @XmlEnumValue("DE_eBayHermesPaketSperrgutShop2Shop")
    DE_E_BAY_HERMES_PAKET_SPERRGUT_SHOP_2_SHOP("DE_eBayHermesPaketSperrgutShop2Shop"),

    /**
     * 
     * 						DHL Paeckchen Packstation
     * 					
     * 
     */
    @XmlEnumValue("DE_DHLPaeckchenPackstation")
    DE_DHL_PAECKCHEN_PACKSTATION("DE_DHLPaeckchenPackstation"),

    /**
     * 
     * 						DHL Paket Packstation
     * 					
     * 
     */
    @XmlEnumValue("DE_DHLPaketPackstation")
    DE_DHL_PAKET_PACKSTATION("DE_DHLPaketPackstation"),

    /**
     * 
     * 						eBay DHL Paeckchen
     * 					
     * 
     */
    @XmlEnumValue("DE_eBayDHLPaeckchen")
    DE_E_BAY_DHL_PAECKCHEN("DE_eBayDHLPaeckchen"),

    /**
     * 
     * 						DHL Star-Paeckchen
     * 					
     * 
     */
    @XmlEnumValue("DE_DHLStarPaeckchen")
    DE_DHL_STAR_PAECKCHEN("DE_DHLStarPaeckchen"),

    /**
     * 
     * 						Versand mit Nachverfolgung aus dem Ausland
     * 					
     * 
     */
    @XmlEnumValue("DE_TrackedDeliveryFromAbroad")
    DE_TRACKED_DELIVERY_FROM_ABROAD("DE_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						Cartas nacionales hasta 20 gr
     * 					
     * 
     */
    @XmlEnumValue("ES_CartasNacionalesHasta20")
    ES_CARTAS_NACIONALES_HASTA_20("ES_CartasNacionalesHasta20"),

    /**
     * 
     * 						Correos: cartas ordinarias
     * 					
     * 
     */
    @XmlEnumValue("ES_CartasNacionalesDeMas20")
    ES_CARTAS_NACIONALES_DE_MAS_20("ES_CartasNacionalesDeMas20"),

    /**
     * 
     * 						Cartas internacionales hasta 20 gr
     * 					
     * 
     */
    @XmlEnumValue("ES_CartasInternacionalesHasta20")
    ES_CARTAS_INTERNACIONALES_HASTA_20("ES_CartasInternacionalesHasta20"),

    /**
     * 
     * 						Cartas internacionales de mas de 20 gr
     * 					
     * 
     */
    @XmlEnumValue("ES_CartasInternacionalesDeMas20")
    ES_CARTAS_INTERNACIONALES_DE_MAS_20("ES_CartasInternacionalesDeMas20"),

    /**
     * 
     * 						Paquete Azul (nacional) hasta 2 kg
     * 					
     * 
     */
    @XmlEnumValue("ES_PaqueteAzulHasta2kg")
    ES_PAQUETE_AZUL_HASTA_2_KG("ES_PaqueteAzulHasta2kg"),

    /**
     * 
     * 						Correos: Postal Expres
     * 					
     * 
     */
    @XmlEnumValue("ES_PaqueteAzulDeMas2kg")
    ES_PAQUETE_AZUL_DE_MAS_2_KG("ES_PaqueteAzulDeMas2kg"),

    /**
     * 
     * 						Paquete Internacional Economico
     * 					
     * 
     */
    @XmlEnumValue("ES_PaqueteInternacionalEconomico")
    ES_PAQUETE_INTERNACIONAL_ECONOMICO("ES_PaqueteInternacionalEconomico"),

    /**
     * 
     * 						Otro courier 24 horas
     * 					
     * 
     */
    @XmlEnumValue("ES_Urgente")
    ES_URGENTE("ES_Urgente"),

    /**
     * 
     * 						Otros (ver descripcion)
     * 					
     * 
     */
    @XmlEnumValue("ES_Otros")
    ES_OTROS("ES_Otros"),

    /**
     * 
     * 						Envio internacional estandar
     * 					
     * 
     */
    @XmlEnumValue("ES_StandardInternational")
    ES_STANDARD_INTERNATIONAL("ES_StandardInternational"),

    /**
     * 
     * 						Envio internacional urgente
     * 					
     * 
     */
    @XmlEnumValue("ES_ExpeditedInternational")
    ES_EXPEDITED_INTERNATIONAL("ES_ExpeditedInternational"),

    /**
     * 
     * 						Envio internacional economico
     * 					
     * 
     */
    @XmlEnumValue("ES_OtherInternational")
    ES_OTHER_INTERNATIONAL("ES_OtherInternational"),

    /**
     * 
     * 						Cartas y tarjetas postales internacionales
     * 					
     * 
     */
    @XmlEnumValue("ES_CartasPostalInternational")
    ES_CARTAS_POSTAL_INTERNATIONAL("ES_CartasPostalInternational"),

    /**
     * 
     * 						Ems postal expres internacional
     * 					
     * 
     */
    @XmlEnumValue("ES_EmsPostalExpressInternational")
    ES_EMS_POSTAL_EXPRESS_INTERNATIONAL("ES_EmsPostalExpressInternational"),

    /**
     * 
     * 						Paquete internacional economico
     * 					
     * 
     */
    @XmlEnumValue("ES_EconomyPacketInternational")
    ES_ECONOMY_PACKET_INTERNATIONAL("ES_EconomyPacketInternational"),

    /**
     * 
     * 						Envio economico desde el extranjero
     * 					
     * 
     */
    @XmlEnumValue("ES_EconomyDeliveryFromAbroad")
    ES_ECONOMY_DELIVERY_FROM_ABROAD("ES_EconomyDeliveryFromAbroad"),

    /**
     * 
     * 						Envio estandar desde el extranjero
     * 					
     * 
     */
    @XmlEnumValue("ES_StandardDeliveryFromAbroad")
    ES_STANDARD_DELIVERY_FROM_ABROAD("ES_StandardDeliveryFromAbroad"),

    /**
     * 
     * 						Envio urgente desde el extranjero
     * 					
     * 
     */
    @XmlEnumValue("ES_ExpressDeliveryFromAbroad")
    ES_EXPRESS_DELIVERY_FROM_ABROAD("ES_ExpressDeliveryFromAbroad"),

    /**
     * 
     * 						Envio desde el extranjero con seguimiento
     * 					
     * 
     */
    @XmlEnumValue("ES_TrackedDeliveryFromAbroad")
    ES_TRACKED_DELIVERY_FROM_ABROAD("ES_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						Entrega a un Kiala point hasta 8 kg
     * 					
     * 
     */
    @XmlEnumValue("ES_ENTREGA_KIALA_8KG")
    ES_ENTREGA_KIALA_8_KG("ES_ENTREGA_KIALA_8KG"),

    /**
     * 
     * 						Chronoposte International Classic
     * 					
     * 
     */
    @XmlEnumValue("FR_ChronoposteInternationalClassic")
    FR_CHRONOPOSTE_INTERNATIONAL_CLASSIC("FR_ChronoposteInternationalClassic"),

    /**
     * 
     * 						Coliposte Colissimo Direct
     * 					
     * 
     */
    @XmlEnumValue("FR_ColiposteColissimoDirect")
    FR_COLIPOSTE_COLISSIMO_DIRECT("FR_ColiposteColissimoDirect"),

    /**
     * 
     * 						DHL Express Europack
     * 					
     * 
     */
    @XmlEnumValue("FR_DHLExpressEuropack")
    FR_DHL_EXPRESS_EUROPACK("FR_DHLExpressEuropack"),

    /**
     * 
     * 						UPS Standard
     * 					
     * 
     */
    @XmlEnumValue("FR_UPSStandard")
    FR_UPS_STANDARD("FR_UPSStandard"),

    /**
     * 
     * 						Lettre
     * 					
     * 
     */
    @XmlEnumValue("FR_PostOfficeLetter")
    FR_POST_OFFICE_LETTER("FR_PostOfficeLetter"),

    /**
     * 
     * 						Lettre avec suivi
     * 					
     * 
     */
    @XmlEnumValue("FR_PostOfficeLetterFollowed")
    FR_POST_OFFICE_LETTER_FOLLOWED("FR_PostOfficeLetterFollowed"),

    /**
     * 
     * 						Lettre recommandee
     * 					
     * 
     */
    @XmlEnumValue("FR_PostOfficeLetterRecommended")
    FR_POST_OFFICE_LETTER_RECOMMENDED("FR_PostOfficeLetterRecommended"),

    /**
     * 
     * 						Colissimo
     * 					
     * 
     */
    @XmlEnumValue("FR_ColiposteColissimo")
    FR_COLIPOSTE_COLISSIMO("FR_ColiposteColissimo"),

    /**
     * 
     * 						Colissimo Recommande
     * 					
     * 
     */
    @XmlEnumValue("FR_ColiposteColissimoRecommended")
    FR_COLIPOSTE_COLISSIMO_RECOMMENDED("FR_ColiposteColissimoRecommended"),

    /**
     * 
     * 						Contre remboursement
     * 					
     * 
     */
    @XmlEnumValue("FR_UPSStandardAgainstRefund")
    FR_UPS_STANDARD_AGAINST_REFUND("FR_UPSStandardAgainstRefund"),

    /**
     * 
     * 						Autre mode d'envoi de courrier
     * 					
     * 
     */
    @XmlEnumValue("FR_Autre")
    FR_AUTRE("FR_Autre"),

    /**
     * 
     * 						Ecopli
     * 					
     * 
     */
    @XmlEnumValue("FR_Ecopli")
    FR_ECOPLI("FR_Ecopli"),

    /**
     * 
     * 						Colieco
     * 					
     * 
     */
    @XmlEnumValue("FR_Colieco")
    FR_COLIECO("FR_Colieco"),

    /**
     * 
     * 						Autre mode d'envoi de colis
     * 					
     * 
     */
    @XmlEnumValue("FR_AuteModeDenvoiDeColis")
    FR_AUTE_MODE_DENVOI_DE_COLIS("FR_AuteModeDenvoiDeColis"),

    /**
     * 
     * 						Remise en main propre
     * 					
     * 
     */
    @XmlEnumValue("FR_RemiseEnMainPropre")
    FR_REMISE_EN_MAIN_PROPRE("FR_RemiseEnMainPropre"),

    /**
     * 
     * 						Autre livraison internationale standard
     * 					
     * 
     */
    @XmlEnumValue("FR_StandardInternational")
    FR_STANDARD_INTERNATIONAL("FR_StandardInternational"),

    /**
     * 
     * 						Autre livraison internationale express
     * 					
     * 
     */
    @XmlEnumValue("FR_ExpeditedInternational")
    FR_EXPEDITED_INTERNATIONAL("FR_ExpeditedInternational"),

    /**
     * 
     * 						Autre livraison internationale economique
     * 					
     * 
     */
    @XmlEnumValue("FR_OtherInternational")
    FR_OTHER_INTERNATIONAL("FR_OtherInternational"),

    /**
     * 
     * 						La Poste - Courrier International Prioritaire
     * 					
     * 
     */
    @XmlEnumValue("FR_LaPosteInternationalPriorityCourier")
    FR_LA_POSTE_INTERNATIONAL_PRIORITY_COURIER("FR_LaPosteInternationalPriorityCourier"),

    /**
     * 
     * 						La Poste - Courrier International Economique
     * 					
     * 
     */
    @XmlEnumValue("FR_LaPosteInternationalEconomyCourier")
    FR_LA_POSTE_INTERNATIONAL_ECONOMY_COURIER("FR_LaPosteInternationalEconomyCourier"),

    /**
     * 
     * 						La Poste - Colissimo International
     * 					
     * 
     */
    @XmlEnumValue("FR_LaPosteColissimoInternational")
    FR_LA_POSTE_COLISSIMO_INTERNATIONAL("FR_LaPosteColissimoInternational"),

    /**
     * 
     * 						La Poste - Colis Economique International
     * 					
     * 
     */
    @XmlEnumValue("FR_LaPosteColisEconomiqueInternational")
    FR_LA_POSTE_COLIS_ECONOMIQUE_INTERNATIONAL("FR_LaPosteColisEconomiqueInternational"),

    /**
     * 
     * 						La Poste - Colissimo Emballage International
     * 					
     * 
     */
    @XmlEnumValue("FR_LaPosteColissimoEmballageInternational")
    FR_LA_POSTE_COLISSIMO_EMBALLAGE_INTERNATIONAL("FR_LaPosteColissimoEmballageInternational"),

    /**
     * 
     * 						Chronopost Classic International
     * 					
     * 
     */
    @XmlEnumValue("FR_ChronopostClassicInternational")
    FR_CHRONOPOST_CLASSIC_INTERNATIONAL("FR_ChronopostClassicInternational"),

    /**
     * 
     * 						Chronopost Premium International
     * 					
     * 
     */
    @XmlEnumValue("FR_ChronopostPremiumInternational")
    FR_CHRONOPOST_PREMIUM_INTERNATIONAL("FR_ChronopostPremiumInternational"),

    /**
     * 
     * 						UPS Standard
     * 					
     * 
     */
    @XmlEnumValue("FR_UPSStandardInternational")
    FR_UPS_STANDARD_INTERNATIONAL("FR_UPSStandardInternational"),

    /**
     * 
     * 						UPS Express
     * 					
     * 
     */
    @XmlEnumValue("FR_UPSExpressInternational")
    FR_UPS_EXPRESS_INTERNATIONAL("FR_UPSExpressInternational"),

    /**
     * 
     * 						DHL
     * 					
     * 
     */
    @XmlEnumValue("FR_DHLInternational")
    FR_DHL_INTERNATIONAL("FR_DHLInternational"),

    /**
     * 
     * 						La Poste Lettre Max
     * 					
     * 
     */
    @XmlEnumValue("FR_LaPosteLetterMax")
    FR_LA_POSTE_LETTER_MAX("FR_LaPosteLetterMax"),

    /**
     * 
     * 						Livraison en Relais Kiala
     * 					
     * 
     */
    FR_KIALA_DELIVERY("FR_KIALA_DELIVERY"),

    /**
     * 
     * 						Livraison a partir de l'etranger avec suivi de commande
     * 					
     * 
     */
    @XmlEnumValue("FR_TrackedDeliveryFromAbroad")
    FR_TRACKED_DELIVERY_FROM_ABROAD("FR_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						National - Regular
     * 					
     * 
     */
    @XmlEnumValue("IN_Regular")
    IN_REGULAR("IN_Regular"),

    /**
     * 
     * 						National - Express
     * 					
     * 
     */
    @XmlEnumValue("IN_Express")
    IN_EXPRESS("IN_Express"),

    /**
     * 
     * 						National - COD
     * 					
     * 
     */
    @XmlEnumValue("IN_NationalCOD")
    IN_NATIONAL_COD("IN_NationalCOD"),

    /**
     * 
     * 						Local - Courier
     * 					
     * 
     */
    @XmlEnumValue("IN_Courier")
    IN_COURIER("IN_Courier"),

    /**
     * 
     * 						Local - COD
     * 					
     * 
     */
    @XmlEnumValue("IN_LocalCOD")
    IN_LOCAL_COD("IN_LocalCOD"),

    /**
     * 
     * 						International - Standard
     * 					
     * 
     */
    @XmlEnumValue("IN_StandardInternational")
    IN_STANDARD_INTERNATIONAL("IN_StandardInternational"),

    /**
     * 
     * 						International - Expedited
     * 					
     * 
     */
    @XmlEnumValue("IN_ExpeditedInternational")
    IN_EXPEDITED_INTERNATIONAL("IN_ExpeditedInternational"),

    /**
     * 
     * 						International - other
     * 					
     * 
     */
    @XmlEnumValue("IN_OtherInternational")
    IN_OTHER_INTERNATIONAL("IN_OtherInternational"),

    /**
     * 
     * 						Flat Rate COD
     * 					
     * 
     */
    @XmlEnumValue("IN_FlatRateCOD")
    IN_FLAT_RATE_COD("IN_FlatRateCOD"),

    /**
     * 
     * 						Buyer picks up and pays
     * 					
     * 
     */
    @XmlEnumValue("IN_BuyerPicksUpAndPays")
    IN_BUYER_PICKS_UP_AND_PAYS("IN_BuyerPicksUpAndPays"),

    /**
     * 
     * 						Posta ordinaria
     * 					
     * 
     */
    @XmlEnumValue("IT_RegularMail")
    IT_REGULAR_MAIL("IT_RegularMail"),

    /**
     * 
     * 						Posta prioritaria
     * 					
     * 
     */
    @XmlEnumValue("IT_PriorityMail")
    IT_PRIORITY_MAIL("IT_PriorityMail"),

    /**
     * 
     * 						Posta raccomandata
     * 					
     * 
     */
    @XmlEnumValue("IT_MailRegisteredLetter")
    IT_MAIL_REGISTERED_LETTER("IT_MailRegisteredLetter"),

    /**
     * 
     * 						Posta raccomandata con contrassegno
     * 					
     * 
     */
    @XmlEnumValue("IT_MailRegisteredLetterWithMark")
    IT_MAIL_REGISTERED_LETTER_WITH_MARK("IT_MailRegisteredLetterWithMark"),

    /**
     * 
     * 						Posta assicurata
     * 					
     * 
     */
    @XmlEnumValue("IT_InsuredMail")
    IT_INSURED_MAIL("IT_InsuredMail"),

    /**
     * 
     * 						Posta celere
     * 					
     * 
     */
    @XmlEnumValue("IT_QuickMail")
    IT_QUICK_MAIL("IT_QuickMail"),

    /**
     * 
     * 						Pacco ordinario
     * 					
     * 
     */
    @XmlEnumValue("IT_RegularPackage")
    IT_REGULAR_PACKAGE("IT_RegularPackage"),

    /**
     * 
     * 						Pacco celere 1
     * 					
     * 
     */
    @XmlEnumValue("IT_QuickPackage1")
    IT_QUICK_PACKAGE_1("IT_QuickPackage1"),

    /**
     * 
     * 						Pacco celere 3
     * 					
     * 
     */
    @XmlEnumValue("IT_QuickPackage3")
    IT_QUICK_PACKAGE_3("IT_QuickPackage3"),

    /**
     * 
     * 						Corriere espresso
     * 					
     * 
     */
    @XmlEnumValue("IT_ExpressCourier")
    IT_EXPRESS_COURIER("IT_ExpressCourier"),

    /**
     * 
     * 						Paccocelere Maxi
     * 					
     * 
     */
    @XmlEnumValue("IT_ExpressPackageMaxi")
    IT_EXPRESS_PACKAGE_MAXI("IT_ExpressPackageMaxi"),

    /**
     * 
     * 						Spedizione internazionale standard a prezzo fisso
     * 					
     * 
     */
    @XmlEnumValue("IT_StandardInternational")
    IT_STANDARD_INTERNATIONAL("IT_StandardInternational"),

    /**
     * 
     * 						Spedizione internazionale celere a prezzo fisso
     * 					
     * 
     */
    @XmlEnumValue("IT_ExpeditedInternational")
    IT_EXPEDITED_INTERNATIONAL("IT_ExpeditedInternational"),

    /**
     * 
     * 						Altre spedizioni internazionali (vedi descrizione)
     * 					
     * 
     */
    @XmlEnumValue("IT_OtherInternational")
    IT_OTHER_INTERNATIONAL("IT_OtherInternational"),

    /**
     * 
     * 						Spedizione tracciata dall estero
     * 					
     * 
     */
    @XmlEnumValue("IT_TrackedDeliveryFromAbroad")
    IT_TRACKED_DELIVERY_FROM_ABROAD("IT_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						Standaardverzending
     * 					
     * 
     */
    @XmlEnumValue("NL_StandardDelivery")
    NL_STANDARD_DELIVERY("NL_StandardDelivery"),

    /**
     * 
     * 						Pakketpost
     * 					
     * 
     */
    @XmlEnumValue("NL_ParcelPost")
    NL_PARCEL_POST("NL_ParcelPost"),

    /**
     * 
     * 						Verzending met ontvangstbevestiging
     * 					
     * 
     */
    @XmlEnumValue("NL_RegisteredMail")
    NL_REGISTERED_MAIL("NL_RegisteredMail"),

    /**
     * 
     * 						Andere verzendservice
     * 					
     * 
     */
    @XmlEnumValue("NL_Other")
    NL_OTHER("NL_Other"),

    /**
     * 
     * 						TPG Post/TNT
     * 					
     * 
     */
    @XmlEnumValue("NL_TPGPostTNTInternational")
    NL_TPG_POST_TNT_INTERNATIONAL("NL_TPGPostTNTInternational"),

    /**
     * 
     * 						UPS
     * 					
     * 
     */
    @XmlEnumValue("NL_UPSInternational")
    NL_UPS_INTERNATIONAL("NL_UPSInternational"),

    /**
     * 
     * 						FedEx
     * 					
     * 
     */
    @XmlEnumValue("NL_FedExInternational")
    NL_FED_EX_INTERNATIONAL("NL_FedExInternational"),

    /**
     * 
     * 						DHL
     * 					
     * 
     */
    @XmlEnumValue("NL_DHLInternational")
    NL_DHL_INTERNATIONAL("NL_DHLInternational"),

    /**
     * 
     * 						DPD (Germany)
     * 					
     * 
     */
    @XmlEnumValue("NL_DPDGBRInternational")
    NL_DPDGBR_INTERNATIONAL("NL_DPDGBRInternational"),

    /**
     * 
     * 						GLS (Business only)
     * 					
     * 
     */
    @XmlEnumValue("NL_GLSBusinessInternational")
    NL_GLS_BUSINESS_INTERNATIONAL("NL_GLSBusinessInternational"),

    /**
     * 
     * 						Vaste kosten standaard internationale verzending
     * 					
     * 
     */
    @XmlEnumValue("NL_StandardInternational")
    NL_STANDARD_INTERNATIONAL("NL_StandardInternational"),

    /**
     * 
     * 						Vaste kosten versnelde internationale verzending
     * 					
     * 
     */
    @XmlEnumValue("NL_ExpeditedInternational")
    NL_EXPEDITED_INTERNATIONAL("NL_ExpeditedInternational"),

    /**
     * 
     * 						Andere internationale verzending (zie beschrijving)
     * 					
     * 
     */
    @XmlEnumValue("NL_OtherInternational")
    NL_OTHER_INTERNATIONAL("NL_OtherInternational"),

    /**
     * 
     * 						Voordelige verzending uit het buitenland
     * 					
     * 
     */
    @XmlEnumValue("NL_EconomyDeliveryFromAbroad")
    NL_ECONOMY_DELIVERY_FROM_ABROAD("NL_EconomyDeliveryFromAbroad"),

    /**
     * 
     * 						Standaardverzending uit het buitenland
     * 					
     * 
     */
    @XmlEnumValue("NL_StandardDeliveryFromAbroad")
    NL_STANDARD_DELIVERY_FROM_ABROAD("NL_StandardDeliveryFromAbroad"),

    /**
     * 
     * 						Verzending per expresse uit het buitenland
     * 					
     * 
     */
    @XmlEnumValue("NL_ExpressDeliveryFromAbroad")
    NL_EXPRESS_DELIVERY_FROM_ABROAD("NL_ExpressDeliveryFromAbroad"),

    /**
     * 
     * 						Verzending met internationale tracering uit het buitenland
     * 					
     * 
     */
    @XmlEnumValue("NL_TrackedDeliveryFromAbroad")
    NL_TRACKED_DELIVERY_FROM_ABROAD("NL_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						Post office plus registration
     * 					
     * 
     */
    @XmlEnumValue("TW_RegisteredMail")
    TW_REGISTERED_MAIL("TW_RegisteredMail"),

    /**
     * 
     * 						Post office without registration
     * 					
     * 
     */
    @XmlEnumValue("TW_UnregisteredMail")
    TW_UNREGISTERED_MAIL("TW_UnregisteredMail"),

    /**
     * 
     * 						Post office cash on delivery
     * 					
     * 
     */
    TW_COD("TW_COD"),

    /**
     * 
     * 						Home delivery
     * 					
     * 
     */
    @XmlEnumValue("TW_DwellingMatchPost")
    TW_DWELLING_MATCH_POST("TW_DwellingMatchPost"),

    /**
     * 
     * 						Home delivery cash on delivery
     * 					
     * 
     */
    @XmlEnumValue("TW_DwellingMatchCOD")
    TW_DWELLING_MATCH_COD("TW_DwellingMatchCOD"),

    /**
     * 
     * 						Face to face
     * 					
     * 
     */
    @XmlEnumValue("TW_SelfPickup")
    TW_SELF_PICKUP("TW_SelfPickup"),

    /**
     * 
     * 						Freight delivery
     * 					
     * 
     */
    @XmlEnumValue("TW_ParcelPost")
    TW_PARCEL_POST("TW_ParcelPost"),

    /**
     * 
     * 						Express delivery
     * 					
     * 
     */
    @XmlEnumValue("TW_ExpressMail")
    TW_EXPRESS_MAIL("TW_ExpressMail"),

    /**
     * 
     * 						Other
     * 					
     * 
     */
    @XmlEnumValue("TW_Other")
    TW_OTHER("TW_Other"),

    /**
     * 
     * 						Post Office Airbag
     * 					
     * 
     */
    @XmlEnumValue("TW_CPInternationalLetterPost")
    TW_CP_INTERNATIONAL_LETTER_POST("TW_CPInternationalLetterPost"),

    /**
     * 
     * 						Post office air parcel
     * 					
     * 
     */
    @XmlEnumValue("TW_CPInternationalParcelPost")
    TW_CP_INTERNATIONAL_PARCEL_POST("TW_CPInternationalParcelPost"),

    /**
     * 
     * 						Post office aviation registered packet
     * 					
     * 
     */
    @XmlEnumValue("TW_CPInternationalRegisteredLetterPost")
    TW_CP_INTERNATIONAL_REGISTERED_LETTER_POST("TW_CPInternationalRegisteredLetterPost"),

    /**
     * 
     * 						Post office aviation registration package
     * 					
     * 
     */
    @XmlEnumValue("TW_CPInternationalRegisteredParcelPost")
    TW_CP_INTERNATIONAL_REGISTERED_PARCEL_POST("TW_CPInternationalRegisteredParcelPost"),

    /**
     * 
     * 						Post Office International Express EMS
     * 					
     * 
     */
    @XmlEnumValue("TW_CPInternationalEMS")
    TW_CP_INTERNATIONAL_EMS("TW_CPInternationalEMS"),

    /**
     * 
     * 						Post office international land and water package
     * 					
     * 
     */
    @XmlEnumValue("TW_CPInternationalOceanShippingParcel")
    TW_CP_INTERNATIONAL_OCEAN_SHIPPING_PARCEL("TW_CPInternationalOceanShippingParcel"),

    /**
     * 
     * 						FedEx International Priority
     * 					
     * 
     */
    @XmlEnumValue("TW_FedExInternationalPriority")
    TW_FED_EX_INTERNATIONAL_PRIORITY("TW_FedExInternationalPriority"),

    /**
     * 
     * 						FedEx International Economy
     * 					
     * 
     */
    @XmlEnumValue("TW_FedExInternationalEconomy")
    TW_FED_EX_INTERNATIONAL_ECONOMY("TW_FedExInternationalEconomy"),

    /**
     * 
     * 						UPS Worldwide Expedited
     * 					
     * 
     */
    @XmlEnumValue("TW_UPSWorldwideExpedited")
    TW_UPS_WORLDWIDE_EXPEDITED("TW_UPSWorldwideExpedited"),

    /**
     * 
     * 						UPS Worldwide Express
     * 					
     * 
     */
    @XmlEnumValue("TW_UPSWorldwideExpress")
    TW_UPS_WORLDWIDE_EXPRESS("TW_UPSWorldwideExpress"),

    /**
     * 
     * 						UPS Worldwide Express Plus
     * 					
     * 
     */
    @XmlEnumValue("TW_UPSWorldwideExpressPlus")
    TW_UPS_WORLDWIDE_EXPRESS_PLUS("TW_UPSWorldwideExpressPlus"),

    /**
     * 
     * 						Other international shipping charges (see description)
     * 					
     * 
     */
    @XmlEnumValue("TW_OtherInternational")
    TW_OTHER_INTERNATIONAL("TW_OtherInternational"),

    /**
     * 
     * 						Royal Mail 1st Class
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailFirstClassStandard")
    UK_ROYAL_MAIL_FIRST_CLASS_STANDARD("UK_RoyalMailFirstClassStandard"),

    /**
     * 
     * 						Royal Mail 2nd Class
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailSecondClassStandard")
    UK_ROYAL_MAIL_SECOND_CLASS_STANDARD("UK_RoyalMailSecondClassStandard"),

    /**
     * 
     * 						Royal Mail 1st Class Signed For
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailFirstClassRecorded")
    UK_ROYAL_MAIL_FIRST_CLASS_RECORDED("UK_RoyalMailFirstClassRecorded"),

    /**
     * 
     * 						Royal Mail 2nd Class Signed For
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailSecondClassRecorded")
    UK_ROYAL_MAIL_SECOND_CLASS_RECORDED("UK_RoyalMailSecondClassRecorded"),

    /**
     * 
     * 						Royal Mail Special Delivery
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailSpecialDelivery")
    UK_ROYAL_MAIL_SPECIAL_DELIVERY("UK_RoyalMailSpecialDelivery"),

    /**
     * 
     * 						
     * 						(This value is no longer used.)
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailStandardParcel")
    UK_ROYAL_MAIL_STANDARD_PARCEL("UK_RoyalMailStandardParcel"),

    /**
     * 
     * 						Parcelforce 24
     * 					
     * 
     */
    @XmlEnumValue("UK_Parcelforce24")
    UK_PARCELFORCE_24("UK_Parcelforce24"),

    /**
     * 
     * 						Parcelforce 48
     * 					
     * 
     */
    @XmlEnumValue("UK_Parcelforce48")
    UK_PARCELFORCE_48("UK_Parcelforce48"),

    /**
     * 
     * 						Other Courier
     * 					
     * 
     */
    @XmlEnumValue("UK_OtherCourier")
    UK_OTHER_COURIER("UK_OtherCourier"),

    /**
     * 
     * 						Hermes Tracked
     * 					
     * 
     */
    @XmlEnumValue("UK_myHermesDoorToDoorService")
    UK_MY_HERMES_DOOR_TO_DOOR_SERVICE("UK_myHermesDoorToDoorService"),

    /**
     * 
     * 						Collect+ : drop at store-delivery to door
     * 					
     * 
     */
    @XmlEnumValue("UK_CollectDropAtStoreDeliveryToDoor")
    UK_COLLECT_DROP_AT_STORE_DELIVERY_TO_DOOR("UK_CollectDropAtStoreDeliveryToDoor"),

    /**
     * 
     * 						Seller's Standard Rate
     * 					
     * 
     */
    @XmlEnumValue("UK_SellersStandardRate")
    UK_SELLERS_STANDARD_RATE("UK_SellersStandardRate"),

    /**
     * 
     * 						Collection in Person
     * 					
     * 
     */
    @XmlEnumValue("UK_CollectInPerson")
    UK_COLLECT_IN_PERSON("UK_CollectInPerson"),

    /**
     * 
     * 						Sellers Standard International Rate
     * 					
     * 
     */
    @XmlEnumValue("UK_SellersStandardInternationalRate")
    UK_SELLERS_STANDARD_INTERNATIONAL_RATE("UK_SellersStandardInternationalRate"),

    /**
     * 
     * 						Royal Mail Airmail
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailAirmailInternational")
    UK_ROYAL_MAIL_AIRMAIL_INTERNATIONAL("UK_RoyalMailAirmailInternational"),

    /**
     * 
     * 						Royal Mail Airsure
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailAirsureInternational")
    UK_ROYAL_MAIL_AIRSURE_INTERNATIONAL("UK_RoyalMailAirsureInternational"),

    /**
     * 
     * 						Royal Mail Surface Mail
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailSurfaceMailInternational")
    UK_ROYAL_MAIL_SURFACE_MAIL_INTERNATIONAL("UK_RoyalMailSurfaceMailInternational"),

    /**
     * 
     * 						Royal Mail International Signed-for
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailInternationalSignedFor")
    UK_ROYAL_MAIL_INTERNATIONAL_SIGNED_FOR("UK_RoyalMailInternationalSignedFor"),

    /**
     * 
     * 						Royal Mail HM Forces Mail
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailHMForcesMailInternational")
    UK_ROYAL_MAIL_HM_FORCES_MAIL_INTERNATIONAL("UK_RoyalMailHMForcesMailInternational"),

    /**
     * 
     * 						Parcelforce International Datapost
     * 					
     * 
     */
    @XmlEnumValue("UK_ParcelForceInternationalDatapost")
    UK_PARCEL_FORCE_INTERNATIONAL_DATAPOST("UK_ParcelForceInternationalDatapost"),

    /**
     * 
     * 						Parcelforce Ireland 24
     * 					
     * 
     */
    @XmlEnumValue("UK_ParcelForceIreland24International")
    UK_PARCEL_FORCE_IRELAND_24_INTERNATIONAL("UK_ParcelForceIreland24International"),

    /**
     * 
     * 						Parcelforce Euro 48
     * 					
     * 
     */
    @XmlEnumValue("UK_ParcelForceEuro48International")
    UK_PARCEL_FORCE_EURO_48_INTERNATIONAL("UK_ParcelForceEuro48International"),

    /**
     * 
     * 						Parcelforce International Scheduled
     * 					
     * 
     */
    @XmlEnumValue("UK_ParcelForceInternationalScheduled")
    UK_PARCEL_FORCE_INTERNATIONAL_SCHEDULED("UK_ParcelForceInternationalScheduled"),

    /**
     * 
     * 						Other courier or delivery service
     * 					
     * 
     */
    @XmlEnumValue("UK_OtherCourierOrDeliveryInternational")
    UK_OTHER_COURIER_OR_DELIVERY_INTERNATIONAL("UK_OtherCourierOrDeliveryInternational"),

    /**
     * 
     * 						Collect in person
     * 					
     * 
     */
    @XmlEnumValue("UK_CollectInPersonInternational")
    UK_COLLECT_IN_PERSON_INTERNATIONAL("UK_CollectInPersonInternational"),

    /**
     * 
     * 						Parcelforce Global Express
     * 					
     * 
     */
    @XmlEnumValue("UK_ParcelForceIntlExpress")
    UK_PARCEL_FORCE_INTL_EXPRESS("UK_ParcelForceIntlExpress"),

    /**
     * 
     * 						Parcelforce Global Value
     * 					
     * 
     */
    @XmlEnumValue("UK_ParcelForceIntlValue")
    UK_PARCEL_FORCE_INTL_VALUE("UK_ParcelForceIntlValue"),

    /**
     * 
     * 						Parcelforce Global Economy (Not available for destinations in Europe)
     * 					
     * 
     */
    @XmlEnumValue("UK_ParcelForceIntlEconomy")
    UK_PARCEL_FORCE_INTL_ECONOMY("UK_ParcelForceIntlEconomy"),

    /**
     * 
     * 						Tracked delivery from outside abroad
     * 					
     * 
     */
    @XmlEnumValue("UK_TrackedDeliveryFromAbroad")
    UK_TRACKED_DELIVERY_FROM_ABROAD("UK_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						International tracked postage
     * 					
     * 
     */
    @XmlEnumValue("UK_IntlTrackedPostage")
    UK_INTL_TRACKED_POSTAGE("UK_IntlTrackedPostage"),

    /**
     * 
     * 						Seller's standard rate
     * 					
     * 
     */
    @XmlEnumValue("IE_SellersStandardRate")
    IE_SELLERS_STANDARD_RATE("IE_SellersStandardRate"),

    /**
     * 
     * 						First Class Letter Service
     * 					
     * 
     */
    @XmlEnumValue("IE_FirstClassLetterService")
    IE_FIRST_CLASS_LETTER_SERVICE("IE_FirstClassLetterService"),

    /**
     * 
     * 						SwiftPost National
     * 					
     * 
     */
    @XmlEnumValue("IE_SwiftPostNational")
    IE_SWIFT_POST_NATIONAL("IE_SwiftPostNational"),

    /**
     * 
     * 						Registered Post
     * 					
     * 
     */
    @XmlEnumValue("IE_RegisteredPost")
    IE_REGISTERED_POST("IE_RegisteredPost"),

    /**
     * 
     * 						EMS SDS Courier
     * 					
     * 
     */
    @XmlEnumValue("IE_EMSSDSCourier")
    IE_EMSSDS_COURIER("IE_EMSSDSCourier"),

    /**
     * 
     * 						Economy SDS Courier
     * 					
     * 
     */
    @XmlEnumValue("IE_EconomySDSCourier")
    IE_ECONOMY_SDS_COURIER("IE_EconomySDSCourier"),

    /**
     * 
     * 						Other courier
     * 					
     * 
     */
    @XmlEnumValue("IE_OtherCourier")
    IE_OTHER_COURIER("IE_OtherCourier"),

    /**
     * 
     * 						Collection in person
     * 					
     * 
     */
    @XmlEnumValue("IE_CollectionInPerson")
    IE_COLLECTION_IN_PERSON("IE_CollectionInPerson"),

    /**
     * 
     * 						Seller's Standard International Rate
     * 					
     * 
     */
    @XmlEnumValue("IE_SellersStandardRateInternational")
    IE_SELLERS_STANDARD_RATE_INTERNATIONAL("IE_SellersStandardRateInternational"),

    /**
     * 
     * 						International Economy Service
     * 					
     * 
     */
    @XmlEnumValue("IE_InternationalEconomyService")
    IE_INTERNATIONAL_ECONOMY_SERVICE("IE_InternationalEconomyService"),

    /**
     * 
     * 						International Priority Service
     * 					
     * 
     */
    @XmlEnumValue("IE_InternationalPriorityService")
    IE_INTERNATIONAL_PRIORITY_SERVICE("IE_InternationalPriorityService"),

    /**
     * 
     * 						SwiftPost Express
     * 					
     * 
     */
    @XmlEnumValue("IE_SwiftPostExpressInternational")
    IE_SWIFT_POST_EXPRESS_INTERNATIONAL("IE_SwiftPostExpressInternational"),

    /**
     * 
     * 						SwiftPost International
     * 					
     * 
     */
    @XmlEnumValue("IE_SwiftPostInternational")
    IE_SWIFT_POST_INTERNATIONAL("IE_SwiftPostInternational"),

    /**
     * 
     * 						EMS SDS Courier
     * 					
     * 
     */
    @XmlEnumValue("IE_EMSSDSCourierInternational")
    IE_EMSSDS_COURIER_INTERNATIONAL("IE_EMSSDSCourierInternational"),

    /**
     * 
     * 						Economy SDS Courier
     * 					
     * 
     */
    @XmlEnumValue("IE_EconomySDSCourierInternational")
    IE_ECONOMY_SDS_COURIER_INTERNATIONAL("IE_EconomySDSCourierInternational"),

    /**
     * 
     * 						Other courier or delivery service
     * 					
     * 
     */
    @XmlEnumValue("IE_OtherCourierInternational")
    IE_OTHER_COURIER_INTERNATIONAL("IE_OtherCourierInternational"),

    /**
     * 
     * 						International collection in person
     * 					
     * 
     */
    @XmlEnumValue("IE_CollectionInPersonInternational")
    IE_COLLECTION_IN_PERSON_INTERNATIONAL("IE_CollectionInPersonInternational"),

    /**
     * 
     * 						Economy delivery from abroad
     * 					
     * 
     */
    @XmlEnumValue("IE_EconomyDeliveryFromAbroad")
    IE_ECONOMY_DELIVERY_FROM_ABROAD("IE_EconomyDeliveryFromAbroad"),

    /**
     * 
     * 						Standard delivery from abroad
     * 					
     * 
     */
    @XmlEnumValue("IE_StandardDeliveryFromAbroad")
    IE_STANDARD_DELIVERY_FROM_ABROAD("IE_StandardDeliveryFromAbroad"),

    /**
     * 
     * 						Express delivery from abroad
     * 					
     * 
     */
    @XmlEnumValue("IE_ExpressDeliveryFromAbroad")
    IE_EXPRESS_DELIVERY_FROM_ABROAD("IE_ExpressDeliveryFromAbroad"),

    /**
     * 
     * 						Tracked delivery from abroad
     * 					
     * 
     */
    @XmlEnumValue("IE_TrackedDeliveryFromAbroad")
    IE_TRACKED_DELIVERY_FROM_ABROAD("IE_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						Domestic Regular shipping
     * 					
     * 
     */
    @XmlEnumValue("PL_DomesticRegular")
    PL_DOMESTIC_REGULAR("PL_DomesticRegular"),

    /**
     * 
     * 						Domestic Special shipping
     * 					
     * 
     */
    @XmlEnumValue("PL_DomesticSpecial")
    PL_DOMESTIC_SPECIAL("PL_DomesticSpecial"),

    /**
     * 
     * 						Przesylka z zagranicy - ekonomiczna
     * 					
     * 
     */
    @XmlEnumValue("PL_EconomyDeliveryFromAbroad")
    PL_ECONOMY_DELIVERY_FROM_ABROAD("PL_EconomyDeliveryFromAbroad"),

    /**
     * 
     * 						Przesylka z zagranicy - standardowa
     * 					
     * 
     */
    @XmlEnumValue("PL_StandardDeliveryFromAbroad")
    PL_STANDARD_DELIVERY_FROM_ABROAD("PL_StandardDeliveryFromAbroad"),

    /**
     * 
     * 						Przesylka z zagranicy - ekspresowa
     * 					
     * 
     */
    @XmlEnumValue("PL_ExpressDeliveryFromAbroad")
    PL_EXPRESS_DELIVERY_FROM_ABROAD("PL_ExpressDeliveryFromAbroad"),

    /**
     * 
     * 						Przesylka z zagranicy - ze sledzeniem
     * 					
     * 
     */
    @XmlEnumValue("PL_TrackedDeliveryFromAbroad")
    PL_TRACKED_DELIVERY_FROM_ABROAD("PL_TrackedDeliveryFromAbroad"),

    /**
     * 
     * 						Service associated with FreightQuote.com
     * 					
     * 
     */
    @XmlEnumValue("FreightShipping")
    FREIGHT_SHIPPING("FreightShipping"),

    /**
     * 
     * 						
     * 						(This value is no longer used.)
     * 					
     * 
     */
    @XmlEnumValue("FreightOtherShipping")
    FREIGHT_OTHER_SHIPPING("FreightOtherShipping"),

    /**
     * 
     * 						Service associated with any freight service other than FreightQuote.com
     * 						<br/>
     * 						<span class="tablenote">
     * 						<strong>Note:</strong> Sellers offering freight shipping on the following marketplaces should use the <b>Shipping service code value</b> listed below and not use the <code>Freight</code> value that is used for freight shipping on other marketplaces. For example, sellers offering freight shipping on the Australia (AU) marketplace should use the <code>AU_Freight</code> value for <b>ShippingServiceCodeType</b> and not use the <code>Freight</code> value.
     * 						<br/><br/>
     * 							<table>
     * 								<tr>
     * 								<th>SiteID</th>
     * 								<th>Site name</th>
     * 								<th>Shipping service code value</th>
     * 								</tr>
     * 								<tr><td><code>0</code></td>
     * 									<td>US</td>
     * 									<td><code>Freight</code></code></td>
     * 								</tr>
     * 								<tr><td><code>3</code></td>
     * 									<td>UK</td>
     * 									<td><code>Courier</code></code></td>
     * 								</tr>
     * 								<tr><td><code>2</code></td>
     * 									<td>CA</td>
     * 									<td><code>CA_Freight</code></code></td>
     * 								</tr>
     * 								<tr><td><code>15</code></td>
     * 									<td>AU</td>
     * 									<td><code>AU_Freight</code></code></td>
     * 								</tr>
     * 								<tr><td><code>210</code></td>
     * 									<td>CA_FR</td>
     * 									<td><code>CA_Freight</code></code></td>
     * 								</tr>		
     * 							</table>
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Freight")
    FREIGHT("Freight"),

    /**
     * 
     * 						Freight Shipping International
     * 					
     * 
     */
    @XmlEnumValue("FreightShippingInternational")
    FREIGHT_SHIPPING_INTERNATIONAL("FreightShippingInternational"),

    /**
     * 
     * 						US Postal Service Ground
     * 					
     * 
     */
    @XmlEnumValue("USPSGround")
    USPS_GROUND("USPSGround"),

    /**
     * 
     * 						Overnight flat rate shipping service (domestic only)
     * 					
     * 
     */
    @XmlEnumValue("ShippingMethodOvernight")
    SHIPPING_METHOD_OVERNIGHT("ShippingMethodOvernight"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						USPS Priority Flat Rate Envelope
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityFlatRateEnvelope")
    USPS_PRIORITY_FLAT_RATE_ENVELOPE("USPSPriorityFlatRateEnvelope"),

    /**
     * 
     * 						USPS Priority Flat Rate Box
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityFlatRateBox")
    USPS_PRIORITY_FLAT_RATE_BOX("USPSPriorityFlatRateBox"),

    /**
     * 
     * 						USPS Global Priority Mail Small Envelope
     * 					
     * 
     */
    @XmlEnumValue("USPSGlobalPrioritySmallEnvelope")
    USPS_GLOBAL_PRIORITY_SMALL_ENVELOPE("USPSGlobalPrioritySmallEnvelope"),

    /**
     * 
     * 						USPS Global Priority Mail Large Envelope
     * 					
     * 
     */
    @XmlEnumValue("USPSGlobalPriorityLargeEnvelope")
    USPS_GLOBAL_PRIORITY_LARGE_ENVELOPE("USPSGlobalPriorityLargeEnvelope"),

    /**
     * 
     * 						USPS Priority Mail Express Flat Rate Envelope
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressFlatRateEnvelope")
    USPS_EXPRESS_FLAT_RATE_ENVELOPE("USPSExpressFlatRateEnvelope"),

    /**
     * 
     * 						UPS Worldwide Express Box 10 Kg
     * 					
     * 
     */
    @XmlEnumValue("UPSWorldWideExpressBox10kg")
    UPS_WORLD_WIDE_EXPRESS_BOX_10_KG("UPSWorldWideExpressBox10kg"),

    /**
     * 
     * 						UPS Worldwide Express Box 25 Kg
     * 					
     * 
     */
    @XmlEnumValue("UPSWorldWideExpressBox25kg")
    UPS_WORLD_WIDE_EXPRESS_BOX_25_KG("UPSWorldWideExpressBox25kg"),

    /**
     * 
     * 						UPS Worldwide Express Plus Box 10 Kg
     * 					
     * 
     */
    @XmlEnumValue("UPSWorldWideExpressPlusBox10kg")
    UPS_WORLD_WIDE_EXPRESS_PLUS_BOX_10_KG("UPSWorldWideExpressPlusBox10kg"),

    /**
     * 
     * 						UPS Worldwide Express Plus box 25 Kg
     * 					
     * 
     */
    @XmlEnumValue("UPSWorldWideExpressPlusBox25kg")
    UPS_WORLD_WIDE_EXPRESS_PLUS_BOX_25_KG("UPSWorldWideExpressPlusBox25kg"),

    /**
     * 
     * 						Local pick up only
     * 					
     * 
     */
    @XmlEnumValue("HK_LocalPickUpOnly")
    HK_LOCAL_PICK_UP_ONLY("HK_LocalPickUpOnly"),

    /**
     * 
     * 						Local courier
     * 					
     * 
     */
    @XmlEnumValue("HK_LocalCourier")
    HK_LOCAL_COURIER("HK_LocalCourier"),

    /**
     * 
     * 						Domestic regular shipping
     * 					
     * 
     */
    @XmlEnumValue("HK_DomesticRegularShipping")
    HK_DOMESTIC_REGULAR_SHIPPING("HK_DomesticRegularShipping"),

    /**
     * 
     * 						Domestic special shipping
     * 					
     * 
     */
    @XmlEnumValue("HK_DomesticSpecialShipping")
    HK_DOMESTIC_SPECIAL_SHIPPING("HK_DomesticSpecialShipping"),

    /**
     * 
     * 						International regular shipping
     * 					
     * 
     */
    @XmlEnumValue("HK_InternationalRegularShipping")
    HK_INTERNATIONAL_REGULAR_SHIPPING("HK_InternationalRegularShipping"),

    /**
     * 
     * 						International special shipping
     * 					
     * 
     */
    @XmlEnumValue("HK_InternationalSpecialShipping")
    HK_INTERNATIONAL_SPECIAL_SHIPPING("HK_InternationalSpecialShipping"),

    /**
     * 
     * 						Local pick up only
     * 					
     * 
     */
    @XmlEnumValue("SG_LocalPickUpOnly")
    SG_LOCAL_PICK_UP_ONLY("SG_LocalPickUpOnly"),

    /**
     * 
     * 						Local courier
     * 					
     * 
     */
    @XmlEnumValue("SG_LocalCourier")
    SG_LOCAL_COURIER("SG_LocalCourier"),

    /**
     * 
     * 						Domestic standard mail
     * 					
     * 
     */
    @XmlEnumValue("SG_DomesticStandardMail")
    SG_DOMESTIC_STANDARD_MAIL("SG_DomesticStandardMail"),

    /**
     * 
     * 						Domestic non standard mail
     * 					
     * 
     */
    @XmlEnumValue("SG_DomesticNonStandardMail")
    SG_DOMESTIC_NON_STANDARD_MAIL("SG_DomesticNonStandardMail"),

    /**
     * 
     * 						Domestic Speedpost Islandwide
     * 					
     * 
     */
    @XmlEnumValue("SG_DomesticSpeedpostIslandwide")
    SG_DOMESTIC_SPEEDPOST_ISLANDWIDE("SG_DomesticSpeedpostIslandwide"),

    /**
     * 
     * 						International standard mail
     * 					
     * 
     */
    @XmlEnumValue("SG_InternationalStandardMail")
    SG_INTERNATIONAL_STANDARD_MAIL("SG_InternationalStandardMail"),

    /**
     * 
     * 						International Express Mail Service (EMS)
     * 					
     * 
     */
    @XmlEnumValue("SG_InternationalExpressMailService")
    SG_INTERNATIONAL_EXPRESS_MAIL_SERVICE("SG_InternationalExpressMailService"),

    /**
     * 
     * 						International courier (DHL, FedEx, UPS)
     * 					
     * 
     */
    @XmlEnumValue("SG_InternationalCourier")
    SG_INTERNATIONAL_COURIER("SG_InternationalCourier"),

    /**
     * 
     * 						De Post zending - NON PRIOR (2 werkdagen)
     * 					
     * 
     */
    @XmlEnumValue("BENL_DePostZendingNONPRIOR")
    BENL_DE_POST_ZENDING_NONPRIOR("BENL_DePostZendingNONPRIOR"),

    /**
     * 
     * 						De Post zending - PRIOR (1 werkdag)
     * 					
     * 
     */
    @XmlEnumValue("BENL_DePostZendingPRIOR")
    BENL_DE_POST_ZENDING_PRIOR("BENL_DePostZendingPRIOR"),

    /**
     * 
     * 						De Post zending - aangetekend (1 werkdag)
     * 					
     * 
     */
    @XmlEnumValue("BENL_DePostZendingAangetekend")
    BENL_DE_POST_ZENDING_AANGETEKEND("BENL_DePostZendingAangetekend"),

    /**
     * 
     * 						Kilopost pakje (2 werkdagen)
     * 					
     * 
     */
    @XmlEnumValue("BENL_KilopostPakje")
    BENL_KILOPOST_PAKJE("BENL_KilopostPakje"),

    /**
     * 
     * 						Taxipost (express)
     * 					
     * 
     */
    @XmlEnumValue("BENL_Taxipost")
    BENL_TAXIPOST("BENL_Taxipost"),

    /**
     * 
     * 						Kiala afhaalpunt (1 tot 4 werkdagen)
     * 					
     * 
     */
    @XmlEnumValue("BENL_KialaAfhaalpunt")
    BENL_KIALA_AFHAALPUNT("BENL_KialaAfhaalpunt"),

    /**
     * 
     * 						Vaste kosten standaard verzending
     * 					
     * 
     */
    @XmlEnumValue("BENL_VasteKostenStandaardVerzending")
    BENL_VASTE_KOSTEN_STANDAARD_VERZENDING("BENL_VasteKostenStandaardVerzending"),

    /**
     * 
     * 						Vaste kosten versnelde verzending
     * 					
     * 
     */
    @XmlEnumValue("BENL_VasteKostenVersneldeVerzending")
    BENL_VASTE_KOSTEN_VERSNELDE_VERZENDING("BENL_VasteKostenVersneldeVerzending"),

    /**
     * 
     * 						Verzekerde verzending
     * 					
     * 
     */
    @XmlEnumValue("BENL_VerzekerdeVerzending")
    BENL_VERZEKERDE_VERZENDING("BENL_VerzekerdeVerzending"),

    /**
     * 
     * 						La Poste envoi NON PRIOR (2 jours ouvrables)
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LaPosteEnvoiNONPRIOR")
    BEFR_LA_POSTE_ENVOI_NONPRIOR("BEFR_LaPosteEnvoiNONPRIOR"),

    /**
     * 
     * 						La Poste envoi PRIOR (1 jour ouvrable)
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LaPosteEnvoiPRIOR")
    BEFR_LA_POSTE_ENVOI_PRIOR("BEFR_LaPosteEnvoiPRIOR"),

    /**
     * 
     * 						La Poste envoi recommande (1 jour ouvrable)
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LaPosteEnvoiRecommande")
    BEFR_LA_POSTE_ENVOI_RECOMMANDE("BEFR_LaPosteEnvoiRecommande"),

    /**
     * 
     * 						Paquet Kilopost (2 jours ouvrables)
     * 					
     * 
     */
    @XmlEnumValue("BEFR_PaquetKilopost")
    BEFR_PAQUET_KILOPOST("BEFR_PaquetKilopost"),

    /**
     * 
     * 						Taxipost (express)
     * 					
     * 
     */
    @XmlEnumValue("BEFR_Taxipost")
    BEFR_TAXIPOST("BEFR_Taxipost"),

    /**
     * 
     * 						Point retrait Kiala (1 a 4 jours ouvrables)
     * 					
     * 
     */
    @XmlEnumValue("BEFR_PointRetraitKiala")
    BEFR_POINT_RETRAIT_KIALA("BEFR_PointRetraitKiala"),

    /**
     * 
     * 						Livraison standard - prix forfaitaire
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LivraisonStandardPrixforFaitaire")
    BEFR_LIVRAISON_STANDARD_PRIXFOR_FAITAIRE("BEFR_LivraisonStandardPrixforFaitaire"),

    /**
     * 
     * 						Livraison express - prix forfaitaire
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LivraisonExpressPrixforFaitaire")
    BEFR_LIVRAISON_EXPRESS_PRIXFOR_FAITAIRE("BEFR_LivraisonExpressPrixforFaitaire"),

    /**
     * 
     * 						Livraison securisee
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LivraisonSecurise")
    BEFR_LIVRAISON_SECURISE("BEFR_LivraisonSecurise"),

    /**
     * 
     * 						De Post zending - PRIOR
     * 					
     * 
     */
    @XmlEnumValue("BENL_DePostZendingPRIORInternational")
    BENL_DE_POST_ZENDING_PRIOR_INTERNATIONAL("BENL_DePostZendingPRIORInternational"),

    /**
     * 
     * 						De Post zending - NON PRIOR
     * 					
     * 
     */
    @XmlEnumValue("BENL_DePostZendingNONPRIORInternational")
    BENL_DE_POST_ZENDING_NONPRIOR_INTERNATIONAL("BENL_DePostZendingNONPRIORInternational"),

    /**
     * 
     * 						De Post zending - aangetekend
     * 					
     * 
     */
    @XmlEnumValue("BENL_DePostZendingAangetekendInternational")
    BENL_DE_POST_ZENDING_AANGETEKEND_INTERNATIONAL("BENL_DePostZendingAangetekendInternational"),

    /**
     * 
     * 						Kilopost pakje Internationaal
     * 					
     * 
     */
    @XmlEnumValue("BENL_KilopostPakjeInternational")
    BENL_KILOPOST_PAKJE_INTERNATIONAL("BENL_KilopostPakjeInternational"),

    /**
     * 
     * 						Taxipost expressverzending
     * 					
     * 
     */
    @XmlEnumValue("BENL_TaxipostExpressverzending")
    BENL_TAXIPOST_EXPRESSVERZENDING("BENL_TaxipostExpressverzending"),

    /**
     * 
     * 						Verzekerde verzending
     * 					
     * 
     */
    @XmlEnumValue("BENL_VerzekerdeVerzendingInternational")
    BENL_VERZEKERDE_VERZENDING_INTERNATIONAL("BENL_VerzekerdeVerzendingInternational"),

    /**
     * 
     * 						La Poste envoie PRIOR
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LaPosteenvoiePRIOR")
    BEFR_LA_POSTEENVOIE_PRIOR("BEFR_LaPosteenvoiePRIOR"),

    /**
     * 
     * 						La Poste envoie NON PRIOR
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LaPosteenvoieNONPRIOR")
    BEFR_LA_POSTEENVOIE_NONPRIOR("BEFR_LaPosteenvoieNONPRIOR"),

    /**
     * 
     * 						La Poste envoie recommande
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LaPosteenvoieRecommande")
    BEFR_LA_POSTEENVOIE_RECOMMANDE("BEFR_LaPosteenvoieRecommande"),

    /**
     * 
     * 						Paquet  Kilopost Internationale
     * 					
     * 
     */
    @XmlEnumValue("BEFR_PaquetKilopostInternationale")
    BEFR_PAQUET_KILOPOST_INTERNATIONALE("BEFR_PaquetKilopostInternationale"),

    /**
     * 
     * 						BEFR_Express Taxipost
     * 					
     * 
     */
    @XmlEnumValue("BEFR_ExpressTaxipost")
    BEFR_EXPRESS_TAXIPOST("BEFR_ExpressTaxipost"),

    /**
     * 
     * 						Livraison standard internationale - prix forfaitaire
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LivraisonStandardInternationalePrixforFaitaire")
    BEFR_LIVRAISON_STANDARD_INTERNATIONALE_PRIXFOR_FAITAIRE("BEFR_LivraisonStandardInternationalePrixforFaitaire"),

    /**
     * 
     * 						Livraison express internationale - prix forfaitaire
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LivraisonExpressInternationalePrixforFaitaire")
    BEFR_LIVRAISON_EXPRESS_INTERNATIONALE_PRIXFOR_FAITAIRE("BEFR_LivraisonExpressInternationalePrixforFaitaire"),

    /**
     * 
     * 						Livraison securisee
     * 					
     * 
     */
    @XmlEnumValue("BEFR_LivraisonSecuriseInternational")
    BEFR_LIVRAISON_SECURISE_INTERNATIONAL("BEFR_LivraisonSecuriseInternational"),

    /**
     * 
     * 						Chronopost
     * 					
     * 
     */
    @XmlEnumValue("FR_Chronopost")
    FR_CHRONOPOST("FR_Chronopost"),

    /**
     * 
     * 						Royal Mail Special Delivery; 1:00 pm
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailSpecialDeliveryNextDay")
    UK_ROYAL_MAIL_SPECIAL_DELIVERY_NEXT_DAY("UK_RoyalMailSpecialDeliveryNextDay"),

    /**
     * 
     * 						Canada Post Light Packet International
     * 					
     * 
     */
    @XmlEnumValue("CA_PostLightPacketInternational")
    CA_POST_LIGHT_PACKET_INTERNATIONAL("CA_PostLightPacketInternational"),

    /**
     * 
     * 						Canada Post Light Packet USA
     * 					
     * 
     */
    @XmlEnumValue("CA_PostLightPacketUSA")
    CA_POST_LIGHT_PACKET_USA("CA_PostLightPacketUSA"),

    /**
     * 
     * 						DHL
     * 					
     * 
     */
    @XmlEnumValue("PL_DHLInternational")
    PL_DHL_INTERNATIONAL("PL_DHLInternational"),

    /**
     * 
     * 						Przesylka zagraniczna - zwykla
     * 					
     * 
     */
    @XmlEnumValue("PL_InternationalRegular")
    PL_INTERNATIONAL_REGULAR("PL_InternationalRegular"),

    /**
     * 
     * 						Przesylka zagraniczna - priorytetowa
     * 					
     * 
     */
    @XmlEnumValue("PL_InternationalSpecial")
    PL_INTERNATIONAL_SPECIAL("PL_InternationalSpecial"),

    /**
     * 
     * 						UPS
     * 					
     * 
     */
    @XmlEnumValue("PL_UPSInternational")
    PL_UPS_INTERNATIONAL("PL_UPSInternational"),

    /**
     * 
     * 						Normes de livraison postale
     * 					
     * 
     */
    @XmlEnumValue("CAFR_StandardDelivery")
    CAFR_STANDARD_DELIVERY("CAFR_StandardDelivery"),

    /**
     * 
     * 						Expedition acceleree
     * 					
     * 
     */
    @XmlEnumValue("CAFR_ExpeditedDelivery")
    CAFR_EXPEDITED_DELIVERY("CAFR_ExpeditedDelivery"),

    /**
     * 
     * 						Postes Canada, Poste-lettres
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostLettermail")
    CAFR_POST_LETTERMAIL("CAFR_PostLettermail"),

    /**
     * 
     * 						Postes Canada, Colis standard
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostRegularParcel")
    CAFR_POST_REGULAR_PARCEL("CAFR_PostRegularParcel"),

    /**
     * 
     * 						Postes Canada, Colis acceleres
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostExpeditedParcel")
    CAFR_POST_EXPEDITED_PARCEL("CAFR_PostExpeditedParcel"),

    /**
     * 
     * 						Postes Canada, Xpresspost
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostXpresspost")
    CAFR_POST_XPRESSPOST("CAFR_PostXpresspost"),

    /**
     * 
     * 						Postes Canada, Messageries prioritaires
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostPriorityCourier")
    CAFR_POST_PRIORITY_COURIER("CAFR_PostPriorityCourier"),

    /**
     * 
     * 						Expedition standard - International, tarif fixe
     * 					
     * 
     */
    @XmlEnumValue("CAFR_StandardInternational")
    CAFR_STANDARD_INTERNATIONAL("CAFR_StandardInternational"),

    /**
     * 
     * 						Expedition acceleree - International, tarif fixe
     * 					
     * 
     */
    @XmlEnumValue("CAFR_ExpeditedInternational")
    CAFR_EXPEDITED_INTERNATIONAL("CAFR_ExpeditedInternational"),

    /**
     * 
     * 						Autres services d'expedition internationale (voir description)
     * 					
     * 
     */
    @XmlEnumValue("CAFR_OtherInternational")
    CAFR_OTHER_INTERNATIONAL("CAFR_OtherInternational"),

    /**
     * 
     * 						Postes Canada, Colis acceleres - E.U.
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostExpeditedParcelUSA")
    CAFR_POST_EXPEDITED_PARCEL_USA("CAFR_PostExpeditedParcelUSA"),

    /**
     * 
     * 						Postes Canada, Petits paquets - E.U.
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostSmallPacketsUSA")
    CAFR_POST_SMALL_PACKETS_USA("CAFR_PostSmallPacketsUSA"),

    /**
     * 
     * 						Postes Canada, Xpresspost - E.U.
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostXpresspostUSA")
    CAFR_POST_XPRESSPOST_USA("CAFR_PostXpresspostUSA"),

    /**
     * 
     * 						Postes Canada, Xpresspost - International
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostXpresspostInternational")
    CAFR_POST_XPRESSPOST_INTERNATIONAL("CAFR_PostXpresspostInternational"),

    /**
     * 
     * 						Postes Canada, Colis international de surface
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostInternationalParcelSurface")
    CAFR_POST_INTERNATIONAL_PARCEL_SURFACE("CAFR_PostInternationalParcelSurface"),

    /**
     * 
     * 						Postes Canada, Colis-avion - International
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostInternationalParcelAir")
    CAFR_POST_INTERNATIONAL_PARCEL_AIR("CAFR_PostInternationalParcelAir"),

    /**
     * 
     * 						Petits paquets - International
     * 					
     * 
     */
    @XmlEnumValue("CAFR_SmallPacketsInternational")
    CAFR_SMALL_PACKETS_INTERNATIONAL("CAFR_SmallPacketsInternational"),

    /**
     * 
     * 						Purolator International
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PurolatorInternational")
    CAFR_PUROLATOR_INTERNATIONAL("CAFR_PurolatorInternational"),

    /**
     * 
     * 						Postes Canada, Petits paquets - E.U. service de surface
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostSmallPacketsUSAGround")
    CAFR_POST_SMALL_PACKETS_USA_GROUND("CAFR_PostSmallPacketsUSAGround"),

    /**
     * 
     * 						Postes Canada, Petits paquets - E.U. par avion
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostSmallPacketsUSAAir")
    CAFR_POST_SMALL_PACKETS_USA_AIR("CAFR_PostSmallPacketsUSAAir"),

    /**
     * 
     * 						Petits paquets - International, courrier-surface
     * 					
     * 
     */
    @XmlEnumValue("CAFR_SmallPacketsInternationalGround")
    CAFR_SMALL_PACKETS_INTERNATIONAL_GROUND("CAFR_SmallPacketsInternationalGround"),

    /**
     * 
     * 						Petits paquets - International, courrier-avion
     * 					
     * 
     */
    @XmlEnumValue("CAFR_SmallPacketsInternationalAir")
    CAFR_SMALL_PACKETS_INTERNATIONAL_AIR("CAFR_SmallPacketsInternationalAir"),

    /**
     * 
     * 						Postes Canada, Poste aux lettres - E.U.
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostUSALetterPost")
    CAFR_POST_USA_LETTER_POST("CAFR_PostUSALetterPost"),

    /**
     * 
     * 						Postes Canada, Poste aux lettres - International
     * 					
     * 
     */
    @XmlEnumValue("CAFR_PostInternationalLetterPost")
    CAFR_POST_INTERNATIONAL_LETTER_POST("CAFR_PostInternationalLetterPost"),

    /**
     * 
     * 						UPS Express Saver
     * 					
     * 
     */
    @XmlEnumValue("CAFR_UPSExpressCanada")
    CAFR_UPS_EXPRESS_CANADA("CAFR_UPSExpressCanada"),

    /**
     * 
     * 						UPS Express Saver Canada
     * 					
     * 
     */
    @XmlEnumValue("CAFR_UPSExpressSaverCanada")
    CAFR_UPS_EXPRESS_SAVER_CANADA("CAFR_UPSExpressSaverCanada"),

    /**
     * 
     * 						UPS Expedited Canada
     * 					
     * 
     */
    @XmlEnumValue("CAFR_UPSExpeditedCanada")
    CAFR_UPS_EXPEDITED_CANADA("CAFR_UPSExpeditedCanada"),

    /**
     * 
     * 						UPS Standard au Canada
     * 					
     * 
     */
    @XmlEnumValue("CAFR_UPSStandardCanada")
    CAFR_UPS_STANDARD_CANADA("CAFR_UPSStandardCanada"),

    /**
     * 
     * 						UPS Express Etats-Unis
     * 					
     * 
     */
    @XmlEnumValue("CAFR_UPSExpressUnitedStates")
    CAFR_UPS_EXPRESS_UNITED_STATES("CAFR_UPSExpressUnitedStates"),

    /**
     * 
     * 						UPS Expedited Etats-Unis
     * 					
     * 
     */
    @XmlEnumValue("CAFR_UPSExpeditedUnitedStates")
    CAFR_UPS_EXPEDITED_UNITED_STATES("CAFR_UPSExpeditedUnitedStates"),

    /**
     * 
     * 						3Day Select aux Etats-Unis
     * 					
     * 
     */
    @XmlEnumValue("CAFR_UPS3DaySelectUnitedStates")
    CAFR_UPS_3_DAY_SELECT_UNITED_STATES("CAFR_UPS3DaySelectUnitedStates"),

    /**
     * 
     * 						UPS Standard aux Etats-Unis
     * 					
     * 
     */
    @XmlEnumValue("CAFR_UPSStandardUnitedStates")
    CAFR_UPS_STANDARD_UNITED_STATES("CAFR_UPSStandardUnitedStates"),

    /**
     * 
     * 						UPS Worlwide Express
     * 					
     * 
     */
    @XmlEnumValue("CAFR_UPSWorldWideExpress")
    CAFR_UPS_WORLD_WIDE_EXPRESS("CAFR_UPSWorldWideExpress"),

    /**
     * 
     * 						UPS Worlwide Expedited
     * 					
     * 
     */
    @XmlEnumValue("CAFR_UPSWorldWideExpedited")
    CAFR_UPS_WORLD_WIDE_EXPEDITED("CAFR_UPSWorldWideExpedited"),

    /**
     * 
     * 						Royal Mail Special Delivery 9:00 am
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailSpecialDelivery9am")
    UK_ROYAL_MAIL_SPECIAL_DELIVERY_9_AM("UK_RoyalMailSpecialDelivery9am"),

    /**
     * 
     * 						USPS First Class Mail Intl / First Class Package Intl Service
     * 					
     * 
     */
    @XmlEnumValue("USPSFirstClassMailInternational")
    USPS_FIRST_CLASS_MAIL_INTERNATIONAL("USPSFirstClassMailInternational"),

    /**
     * 
     * 						USPS Priority Mail International
     * 					
     * 
     */
    @XmlEnumValue("USPSPriorityMailInternational")
    USPS_PRIORITY_MAIL_INTERNATIONAL("USPSPriorityMailInternational"),

    /**
     * 
     * 						USPS Priority Mail Express International
     * 					
     * 
     */
    @XmlEnumValue("USPSExpressMailInternational")
    USPS_EXPRESS_MAIL_INTERNATIONAL("USPSExpressMailInternational"),

    /**
     * 
     * 						Standardpauschale fur internationalen Versand
     * 					
     * 
     */
    @XmlEnumValue("CH_StandardInternational")
    CH_STANDARD_INTERNATIONAL("CH_StandardInternational"),

    /**
     * 
     * 						Expresspauschale fur internationalen Versand
     * 					
     * 
     */
    @XmlEnumValue("CH_ExpeditedInternational")
    CH_EXPEDITED_INTERNATIONAL("CH_ExpeditedInternational"),

    /**
     * 
     * 						Sonstiger Versand (Siehe Artikelbeschreibung)
     * 					
     * 
     */
    @XmlEnumValue("CH_SonstigerVersandSieheArtikelbeschreibung")
    CH_SONSTIGER_VERSAND_SIEHE_ARTIKELBESCHREIBUNG("CH_SonstigerVersandSieheArtikelbeschreibung"),

    /**
     * 
     * 						 International Standard Fixed Rate for Taiwan
     * 					
     * 
     */
    @XmlEnumValue("TW_StandardInternationalFixedRate")
    TW_STANDARD_INTERNATIONAL_FIXED_RATE("TW_StandardInternationalFixedRate"),

    /**
     * 
     * 						 International Express Fixed Rate for Taiwan
     * 					
     * 
     */
    @XmlEnumValue("TW_ExpeditedInternationalFixedRate")
    TW_EXPEDITED_INTERNATIONAL_FIXED_RATE("TW_ExpeditedInternationalFixedRate"),

    /**
     * 
     * 						USPS Global Express Guaranteed
     * 					
     * 
     */
    @XmlEnumValue("USPSGlobalExpressGuaranteed")
    USPS_GLOBAL_EXPRESS_GUARANTEED("USPSGlobalExpressGuaranteed"),

    /**
     * 
     * 						Regular with Insurance
     * 					
     * 
     */
    @XmlEnumValue("AU_RegularWithInsurance")
    AU_REGULAR_WITH_INSURANCE("AU_RegularWithInsurance"),

    /**
     * 
     * 						Express with Insurance
     * 					
     * 
     */
    @XmlEnumValue("AU_ExpressWithInsurance")
    AU_EXPRESS_WITH_INSURANCE("AU_ExpressWithInsurance"),

    /**
     * 
     * 						Deutsche Post Warensendung
     * 					
     * 
     */
    @XmlEnumValue("DE_DeutschePostWarensendungInternational")
    DE_DEUTSCHE_POST_WARENSENDUNG_INTERNATIONAL("DE_DeutschePostWarensendungInternational"),

    /**
     * 
     * 						Deutsche Post Byendung
     * 					
     * 
     */
    @XmlEnumValue("DE_DeutschePostByendung")
    DE_DEUTSCHE_POST_BYENDUNG("DE_DeutschePostByendung"),

    /**
     * 
     * 						Hermes Paket (unversichert)
     * 					
     * 
     */
    @XmlEnumValue("DE_HermesPaketUnversichertInternational")
    DE_HERMES_PAKET_UNVERSICHERT_INTERNATIONAL("DE_HermesPaketUnversichertInternational"),

    /**
     * 
     * 						Hermes Paket (versichert)
     * 					
     * 
     */
    @XmlEnumValue("DE_HermesPaketVersichertInternational")
    DE_HERMES_PAKET_VERSICHERT_INTERNATIONAL("DE_HermesPaketVersichertInternational"),

    /**
     * 
     * 						iloxx Transport XXL
     * 					
     * 
     */
    @XmlEnumValue("DE_iLoxxTransportXXLInternational")
    DE_I_LOXX_TRANSPORT_XXL_INTERNATIONAL("DE_iLoxxTransportXXLInternational"),

    /**
     * 
     * 						iloxx Ubernacht Express
     * 					
     * 
     */
    @XmlEnumValue("DE_iLoxxUbernachtExpressInternational")
    DE_I_LOXX_UBERNACHT_EXPRESS_INTERNATIONAL("DE_iLoxxUbernachtExpressInternational"),

    /**
     * 
     * 						iloxx Standard
     * 					
     * 
     */
    @XmlEnumValue("DE_iLoxxStandardInternational")
    DE_I_LOXX_STANDARD_INTERNATIONAL("DE_iLoxxStandardInternational"),

    /**
     * 
     * 						Standardpauschale fur internationalen Versand
     * 					
     * 
     */
    @XmlEnumValue("DE_StandardInternational")
    DE_STANDARD_INTERNATIONAL("DE_StandardInternational"),

    /**
     * 
     * 						Expresspauschale fur internationalen Versand
     * 					
     * 
     */
    @XmlEnumValue("DE_ExpeditedInternational")
    DE_EXPEDITED_INTERNATIONAL("DE_ExpeditedInternational"),

    /**
     * 
     * 						Deutsche Post Presse & Bucher Economy
     * 					
     * 
     */
    @XmlEnumValue("DE_DeutschePostBriefIntlEcon")
    DE_DEUTSCHE_POST_BRIEF_INTL_ECON("DE_DeutschePostBriefIntlEcon"),

    /**
     * 
     * 						Deutsche Post Presse & Bucher Priority
     * 					
     * 
     */
    @XmlEnumValue("DE_DeutschePostBriefIntlPri")
    DE_DEUTSCHE_POST_BRIEF_INTL_PRI("DE_DeutschePostBriefIntlPri"),

    /**
     * 
     * 						AT_BITTE_TREFFEN_SIE_EINE_AUSWAHL
     * 					
     * 
     */
    @XmlEnumValue("AT_BitteTreffenSieEineAuswahl")
    AT_BITTE_TREFFEN_SIE_EINE_AUSWAHL("AT_BitteTreffenSieEineAuswahl"),

    /**
     * 
     * 						Einschreiben (Versand inkl. Einschreibengebuhr)
     * 					
     * 
     */
    @XmlEnumValue("AT_EinschreibenVersandInklEinschreibengebuhr")
    AT_EINSCHREIBEN_VERSAND_INKL_EINSCHREIBENGEBUHR("AT_EinschreibenVersandInklEinschreibengebuhr"),

    /**
     * 
     * 						Nachnahme (Versand inkl. Nachnahmegebuhr)
     * 					
     * 
     */
    @XmlEnumValue("AT_NachnahmeVersandInklNachnahmegebuhr")
    AT_NACHNAHME_VERSAND_INKL_NACHNAHMEGEBUHR("AT_NachnahmeVersandInklNachnahmegebuhr"),

    /**
     * 
     * 						Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("AT_ExpressOrCourierInternational")
    AT_EXPRESS_OR_COURIER_INTERNATIONAL("AT_ExpressOrCourierInternational"),

    /**
     * 
     * 						Versicherter Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("AT_InsuredExpressOrCourierInternational")
    AT_INSURED_EXPRESS_OR_COURIER_INTERNATIONAL("AT_InsuredExpressOrCourierInternational"),

    /**
     * 
     * 						Sonderversand (z.B. Sperrgut, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("AT_SpecialDispatchInternational")
    AT_SPECIAL_DISPATCH_INTERNATIONAL("AT_SpecialDispatchInternational"),

    /**
     * 
     * 						Versicherter Sonderversand (z.B. Sperrgut, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("AT_InsuredSpecialDispatchInternational")
    AT_INSURED_SPECIAL_DISPATCH_INTERNATIONAL("AT_InsuredSpecialDispatchInternational"),

    /**
     * 
     * 						Standardpauschale fur internationalen Versand
     * 					
     * 
     */
    @XmlEnumValue("AT_StandardInternational")
    AT_STANDARD_INTERNATIONAL("AT_StandardInternational"),

    /**
     * 
     * 						 Expresspauschale fur internationalen Versand
     * 					
     * 
     */
    @XmlEnumValue("AT_ExpeditedInternational")
    AT_EXPEDITED_INTERNATIONAL("AT_ExpeditedInternational"),

    /**
     * 
     * 						Sonstiger Versand (Siehe Artikelbeschreibung)
     * 					
     * 
     */
    @XmlEnumValue("AT_OtherInternationalShipping")
    AT_OTHER_INTERNATIONAL_SHIPPING("AT_OtherInternationalShipping"),

    /**
     * 
     * 						CH_BITTE_TREFFEN_SIE_EINE_AUSWAHL
     * 					
     * 
     */
    @XmlEnumValue("CH_BitteTreffenSieEineAuswahl")
    CH_BITTE_TREFFEN_SIE_EINE_AUSWAHL("CH_BitteTreffenSieEineAuswahl"),

    /**
     * 
     * 						Unversicherter Versand
     * 					
     * 
     */
    @XmlEnumValue("CH_UnversicherterVersand")
    CH_UNVERSICHERTER_VERSAND("CH_UnversicherterVersand"),

    /**
     * 
     * 						Versicherter Versand
     * 					
     * 
     */
    @XmlEnumValue("CH_VersicherterVersand")
    CH_VERSICHERTER_VERSAND("CH_VersicherterVersand"),

    /**
     * 
     * 						 Einschreiben (Versand inkl. Einschreibengebuhr)
     * 					
     * 
     */
    @XmlEnumValue("CH_EinschreibenVersandInklEinschreibengebuhr")
    CH_EINSCHREIBEN_VERSAND_INKL_EINSCHREIBENGEBUHR("CH_EinschreibenVersandInklEinschreibengebuhr"),

    /**
     * 
     * 						Nachnahme (Versand inkl. Nachnahmegebuhr)
     * 					
     * 
     */
    @XmlEnumValue("CH_NachnahmeVersandInklNachnahmegebuhr")
    CH_NACHNAHME_VERSAND_INKL_NACHNAHMEGEBUHR("CH_NachnahmeVersandInklNachnahmegebuhr"),

    /**
     * 
     * 						Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("CH_ExpressOrCourierInternational")
    CH_EXPRESS_OR_COURIER_INTERNATIONAL("CH_ExpressOrCourierInternational"),

    /**
     * 
     * 						Versicherter Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("CH_InsuredExpressOrCourierInternational")
    CH_INSURED_EXPRESS_OR_COURIER_INTERNATIONAL("CH_InsuredExpressOrCourierInternational"),

    /**
     * 
     * 						Sonderversand (z.B. Sperrgut, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("CH_SonderversandZBSperrgutKFZ")
    CH_SONDERVERSAND_ZB_SPERRGUT_KFZ("CH_SonderversandZBSperrgutKFZ"),

    /**
     * 
     * 						Versicherter Sonderversand (z.B. Sperrgut, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("CH_VersicherterSonderversandZBSperrgutKFZ")
    CH_VERSICHERTER_SONDERVERSAND_ZB_SPERRGUT_KFZ("CH_VersicherterSonderversandZBSperrgutKFZ"),

    /**
     * 
     * 						Standardversand (A-Post/Priority)
     * 					
     * 
     */
    @XmlEnumValue("CH_StandardversandAPostPriority")
    CH_STANDARDVERSAND_A_POST_PRIORITY("CH_StandardversandAPostPriority"),

    /**
     * 
     * 						Standardversand (B-Post/Economy)
     * 					
     * 
     */
    @XmlEnumValue("CH_StandardversandBPostEconomy")
    CH_STANDARDVERSAND_B_POST_ECONOMY("CH_StandardversandBPostEconomy"),

    /**
     * 
     * 						DE_BITTE_TREFFEN_SIE_EINE_AUSWAHL
     * 					
     * 
     */
    @XmlEnumValue("DE_BitteTreffenSieEineAuswahl")
    DE_BITTE_TREFFEN_SIE_EINE_AUSWAHL("DE_BitteTreffenSieEineAuswahl"),

    /**
     * 
     * 						Einschreiben (Versand inkl. Einschreibengebuhr)
     * 					
     * 
     */
    @XmlEnumValue("DE_EinschreibenVersandInklEinschreibengebuhr")
    DE_EINSCHREIBEN_VERSAND_INKL_EINSCHREIBENGEBUHR("DE_EinschreibenVersandInklEinschreibengebuhr"),

    /**
     * 
     * 						Nachnahme (Versand inkl. Nachnahmegebuhr)
     * 					
     * 
     */
    @XmlEnumValue("DE_NachnahmeVersandInklNachnahmegebuhr")
    DE_NACHNAHME_VERSAND_INKL_NACHNAHMEGEBUHR("DE_NachnahmeVersandInklNachnahmegebuhr"),

    /**
     * 
     * 						Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("DE_ExpressOrCourierInternational")
    DE_EXPRESS_OR_COURIER_INTERNATIONAL("DE_ExpressOrCourierInternational"),

    /**
     * 
     * 						Versicherter Express- oder Kurierversand
     * 					
     * 
     */
    @XmlEnumValue("DE_InsuredExpressOrCourierInternational")
    DE_INSURED_EXPRESS_OR_COURIER_INTERNATIONAL("DE_InsuredExpressOrCourierInternational"),

    /**
     * 
     * 						Sonderversand (z.B. Mobel, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("DE_SonderversandZBMobelKFZ")
    DE_SONDERVERSAND_ZB_MOBEL_KFZ("DE_SonderversandZBMobelKFZ"),

    /**
     * 
     * 						Versicherter Sonderversand (z.B. Mobel, KFZ)
     * 					
     * 
     */
    @XmlEnumValue("DE_VersicherterSonderversandZBMobelKFZ")
    DE_VERSICHERTER_SONDERVERSAND_ZB_MOBEL_KFZ("DE_VersicherterSonderversandZBMobelKFZ"),

    /**
     * 
     * 						Deutsche Post Brief
     * 					
     * 
     */
    @XmlEnumValue("DE_DeutschePostBriefInternational")
    DE_DEUTSCHE_POST_BRIEF_INTERNATIONAL("DE_DeutschePostBriefInternational"),

    /**
     * 
     * 						Standard Int'l Flat Rate Postage
     * 					
     * 
     */
    @XmlEnumValue("IE_StandardInternationalFlatRatePostage")
    IE_STANDARD_INTERNATIONAL_FLAT_RATE_POSTAGE("IE_StandardInternationalFlatRatePostage"),

    /**
     * 
     * 						Expedited Int'l Flat Rate Postage
     * 					
     * 
     */
    @XmlEnumValue("IE_ExpeditedInternationalFlatRatePostage")
    IE_EXPEDITED_INTERNATIONAL_FLAT_RATE_POSTAGE("IE_ExpeditedInternationalFlatRatePostage"),

    /**
     * 
     * 						Other Int'l Postage (see description)
     * 					
     * 
     */
    @XmlEnumValue("IE_OtherInternationalPostage")
    IE_OTHER_INTERNATIONAL_POSTAGE("IE_OtherInternationalPostage"),

    /**
     * 
     * 						Standard Int'l Flat Rate Postage
     * 					
     * 
     */
    @XmlEnumValue("UK_StandardInternationalFlatRatePostage")
    UK_STANDARD_INTERNATIONAL_FLAT_RATE_POSTAGE("UK_StandardInternationalFlatRatePostage"),

    /**
     * 
     * 						Expedited Int'l Flat Rate Postage
     * 					
     * 
     */
    @XmlEnumValue("UK_ExpeditedInternationalFlatRatePostage")
    UK_EXPEDITED_INTERNATIONAL_FLAT_RATE_POSTAGE("UK_ExpeditedInternationalFlatRatePostage"),

    /**
     * 
     * 						Other Int'l Postage (see description)
     * 					
     * 
     */
    @XmlEnumValue("UK_OtherInternationalPostage")
    UK_OTHER_INTERNATIONAL_POSTAGE("UK_OtherInternationalPostage"),

    /**
     * 
     * 						Chronopost - Chrono Relais
     * 					
     * 
     */
    @XmlEnumValue("FR_ChronopostChronoRelais")
    FR_CHRONOPOST_CHRONO_RELAIS("FR_ChronopostChronoRelais"),

    /**
     * 
     * 						Chrono 10
     * 					
     * 
     */
    @XmlEnumValue("FR_Chrono10")
    FR_CHRONO_10("FR_Chrono10"),

    /**
     * 
     * 						Chrono 13
     * 					
     * 
     */
    @XmlEnumValue("FR_Chrono13")
    FR_CHRONO_13("FR_Chrono13"),

    /**
     * 
     * 						Chrono 18
     * 					
     * 
     */
    @XmlEnumValue("FR_Chrono18")
    FR_CHRONO_18("FR_Chrono18"),

    /**
     * 
     * 						Chronopost Express International
     * 					
     * 
     */
    @XmlEnumValue("FR_ChronopostExpressInternational")
    FR_CHRONOPOST_EXPRESS_INTERNATIONAL("FR_ChronopostExpressInternational"),

    /**
     * 
     * 						PickUp Only Service
     * 					
     * 
     */
    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),

    /**
     * 
     * 						Delivery
     * 					
     * 
     */
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery"),

    /**
     * 
     * 						Pickup Only Service
     * 					
     * 
     */
    @XmlEnumValue("CA_Pickup")
    CA_PICKUP("CA_Pickup"),

    /**
     * 
     * 						Abholung
     * 					
     * 
     */
    @XmlEnumValue("DE_Pickup")
    DE_PICKUP("DE_Pickup"),

    /**
     * 
     * 						Pickup
     * 					
     * 
     */
    @XmlEnumValue("AU_Pickup")
    AU_PICKUP("AU_Pickup"),

    /**
     * 
     * 						Small Parcels
     * 					
     * 
     */
    @XmlEnumValue("AU_SmallParcels")
    AU_SMALL_PARCELS("AU_SmallParcels"),

    /**
     * Small Parcel With Tracking
     * 
     */
    @XmlEnumValue("AU_SmallParcelWithTracking")
    AU_SMALL_PARCEL_WITH_TRACKING("AU_SmallParcelWithTracking"),

    /**
     * Small Parcel With Tracking And Signature
     * 
     */
    @XmlEnumValue("AU_SmallParcelWithTrackingAndSignature")
    AU_SMALL_PARCEL_WITH_TRACKING_AND_SIGNATURE("AU_SmallParcelWithTrackingAndSignature"),

    /**
     * Regular Parcel With Tracking
     * 
     */
    @XmlEnumValue("AU_RegularParcelWithTracking")
    AU_REGULAR_PARCEL_WITH_TRACKING("AU_RegularParcelWithTracking"),

    /**
     * Regular Parcel With Tracking And Signature
     * 
     */
    @XmlEnumValue("AU_RegularParcelWithTrackingAndSignature")
    AU_REGULAR_PARCEL_WITH_TRACKING_AND_SIGNATURE("AU_RegularParcelWithTrackingAndSignature"),

    /**
     * PrePaid Express Post Satchel 5kg
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostSatchel5kg")
    AU_PRE_PAID_EXPRESS_POST_SATCHEL_5_KG("AU_PrePaidExpressPostSatchel5kg"),

    /**
     * 
     * 						PrePaid Parcel Post Satchels 500g
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidParcelPostSatchels500g")
    AU_PRE_PAID_PARCEL_POST_SATCHELS_500_G("AU_PrePaidParcelPostSatchels500g"),

    /**
     * 
     * 						PrePaid Parcel Post Satchels 3kg
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidParcelPostSatchels3kg")
    AU_PRE_PAID_PARCEL_POST_SATCHELS_3_KG("AU_PrePaidParcelPostSatchels3kg"),

    /**
     * 
     * 						PrePaid Parcel Post Satchels 5kg
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidParcelPostSatchels5kg")
    AU_PRE_PAID_PARCEL_POST_SATCHELS_5_KG("AU_PrePaidParcelPostSatchels5kg"),

    /**
     * 
     * 						PrePaid Express Post Satchel 500g
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostSatchel500g")
    AU_PRE_PAID_EXPRESS_POST_SATCHEL_500_G("AU_PrePaidExpressPostSatchel500g"),

    /**
     * 
     * 						PrePaid Express Post Satchel 3kg
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostSatchel3kg")
    AU_PRE_PAID_EXPRESS_POST_SATCHEL_3_KG("AU_PrePaidExpressPostSatchel3kg"),

    /**
     * 
     * 						PrePaid Express Post Platinum 500g
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostPlatinum500g")
    AU_PRE_PAID_EXPRESS_POST_PLATINUM_500_G("AU_PrePaidExpressPostPlatinum500g"),

    /**
     * 
     * 						PrePaid Express Post Platinum 3kg
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostPlatinum3kg")
    AU_PRE_PAID_EXPRESS_POST_PLATINUM_3_KG("AU_PrePaidExpressPostPlatinum3kg"),

    /**
     * 
     * 						Express Courier International
     * 					
     * 
     */
    @XmlEnumValue("AU_ExpressCourierInternational")
    AU_EXPRESS_COURIER_INTERNATIONAL("AU_ExpressCourierInternational"),

    /**
     * 
     * 						Express Post International
     * 					
     * 
     */
    @XmlEnumValue("AU_ExpressPostInternational")
    AU_EXPRESS_POST_INTERNATIONAL("AU_ExpressPostInternational"),

    /**
     * 
     * 						PrePaid Express Post International Envelope C5
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostInternationalEnvelopeC5")
    AU_PRE_PAID_EXPRESS_POST_INTERNATIONAL_ENVELOPE_C_5("AU_PrePaidExpressPostInternationalEnvelopeC5"),

    /**
     * 
     * 						PrePaid Express Post International Envelope B4
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostInternationalEnvelopeB4")
    AU_PRE_PAID_EXPRESS_POST_INTERNATIONAL_ENVELOPE_B_4("AU_PrePaidExpressPostInternationalEnvelopeB4"),

    /**
     * 
     * 						PrePaid Express Post International Satchels 2kg
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostInternationalSatchels2kg")
    AU_PRE_PAID_EXPRESS_POST_INTERNATIONAL_SATCHELS_2_KG("AU_PrePaidExpressPostInternationalSatchels2kg"),

    /**
     * 
     * 						PrePaid Express Post International Satchels 3kg
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostInternationalSatchels3kg")
    AU_PRE_PAID_EXPRESS_POST_INTERNATIONAL_SATCHELS_3_KG("AU_PrePaidExpressPostInternationalSatchels3kg"),

    /**
     * 
     * 						PrePaid Express Post International Box 5kg
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostInternationalBox5kg")
    AU_PRE_PAID_EXPRESS_POST_INTERNATIONAL_BOX_5_KG("AU_PrePaidExpressPostInternationalBox5kg"),

    /**
     * 
     * 						PrePaid Express Post International Box 10kg
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostInternationalBox10kg")
    AU_PRE_PAID_EXPRESS_POST_INTERNATIONAL_BOX_10_KG("AU_PrePaidExpressPostInternationalBox10kg"),

    /**
     * 
     * 						PrePaid Express Post International Box 20kg
     * 					
     * 
     */
    @XmlEnumValue("AU_PrePaidExpressPostInternationalBox20kg")
    AU_PRE_PAID_EXPRESS_POST_INTERNATIONAL_BOX_20_KG("AU_PrePaidExpressPostInternationalBox20kg"),

    /**
     * 
     * 						Registered Parcel Post
     * 					
     * 
     */
    @XmlEnumValue("AU_RegisteredParcelPost")
    AU_REGISTERED_PARCEL_POST("AU_RegisteredParcelPost"),

    /**
     * 
     * 						Registered Small Parcel
     * 					
     * 
     */
    @XmlEnumValue("AU_RegisteredSmallParcel")
    AU_REGISTERED_SMALL_PARCEL("AU_RegisteredSmallParcel"),

    /**
     * 
     * 						Registered Parcel Post Prepaid Satchel 500g
     * 					
     * 
     */
    @XmlEnumValue("AU_RegisteredParcelPostPrepaidSatchel500g")
    AU_REGISTERED_PARCEL_POST_PREPAID_SATCHEL_500_G("AU_RegisteredParcelPostPrepaidSatchel500g"),

    /**
     * 
     * 						Registered Parcel Post Prepaid Satchel 3kg
     * 					
     * 
     */
    @XmlEnumValue("AU_RegisteredParcelPostPrepaidSatchel3kg")
    AU_REGISTERED_PARCEL_POST_PREPAID_SATCHEL_3_KG("AU_RegisteredParcelPostPrepaidSatchel3kg"),

    /**
     * 
     * 						Registered Parcel Post Prepaid Satchel 5kg
     * 					
     * 
     */
    @XmlEnumValue("AU_RegisteredParcelPostPrepaidSatchel5kg")
    AU_REGISTERED_PARCEL_POST_PREPAID_SATCHEL_5_KG("AU_RegisteredParcelPostPrepaidSatchel5kg"),

    /**
     * 
     * 						eBay Australia Post Express Post 500g Satchel
     * 					
     * 
     */
    @XmlEnumValue("AU_ExpressPostSatchel500g")
    AU_EXPRESS_POST_SATCHEL_500_G("AU_ExpressPostSatchel500g"),

    /**
     * 
     * 						eBay Australia Post Express Post 3kg Satchel
     * 					
     * 
     */
    @XmlEnumValue("AU_ExpressPostSatchel3kg")
    AU_EXPRESS_POST_SATCHEL_3_KG("AU_ExpressPostSatchel3kg"),

    /**
     * 
     * 						Enlevement
     * 					
     * 
     */
    @XmlEnumValue("FR_Pickup")
    FR_PICKUP("FR_Pickup"),

    /**
     * 
     * 						Pickup
     * 					
     * 
     */
    @XmlEnumValue("AT_Pickup")
    AT_PICKUP("AT_Pickup"),

    /**
     * 
     * 						Afhalen
     * 					
     * 
     */
    @XmlEnumValue("BENL_Pickup")
    BENL_PICKUP("BENL_Pickup"),

    /**
     * 
     * 						Pickup
     * 					
     * 
     */
    @XmlEnumValue("BEFR_Pickup")
    BEFR_PICKUP("BEFR_Pickup"),

    /**
     * 
     * 						Pickup
     * 					
     * 
     */
    @XmlEnumValue("CH_Pickup")
    CH_PICKUP("CH_Pickup"),

    /**
     * 
     * 						Pickup
     * 					
     * 
     */
    @XmlEnumValue("IT_Pickup")
    IT_PICKUP("IT_Pickup"),

    /**
     * 
     * 						Pickup
     * 					
     * 
     */
    @XmlEnumValue("NL_Pickup")
    NL_PICKUP("NL_Pickup"),

    /**
     * 
     * 						Pickup
     * 					
     * 
     */
    @XmlEnumValue("PL_Pickup")
    PL_PICKUP("PL_Pickup"),

    /**
     * 
     * 						Pickup
     * 					
     * 
     */
    @XmlEnumValue("ES_Pickup")
    ES_PICKUP("ES_Pickup"),

    /**
     * 
     * 						Pickup
     * 					
     * 
     */
    @XmlEnumValue("SG_Delivery")
    SG_DELIVERY("SG_Delivery"),

    /**
     * 
     * 						Other 24 Hour Courier
     * 					
     * 
     */
    @XmlEnumValue("UK_OtherCourier24")
    UK_OTHER_COURIER_24("UK_OtherCourier24"),

    /**
     * 
     * 						Other 48 Hour Courier
     * 					
     * 
     */
    @XmlEnumValue("UK_OtherCourier48")
    UK_OTHER_COURIER_48("UK_OtherCourier48"),

    /**
     * 
     * 						Other Courier 3 days
     * 					
     * 
     */
    @XmlEnumValue("UK_OtherCourier3Days")
    UK_OTHER_COURIER_3_DAYS("UK_OtherCourier3Days"),

    /**
     * 
     * 						Other Courier 5 days
     * 					
     * 
     */
    @XmlEnumValue("UK_OtherCourier5Days")
    UK_OTHER_COURIER_5_DAYS("UK_OtherCourier5Days"),

    /**
     * 
     * 						Courier Shipping
     * 					
     * 
     */
    @XmlEnumValue("Courier")
    COURIER("Courier"),

    /**
     * 
     * 						FedEx Priority Overnight
     * 					
     * 
     */
    @XmlEnumValue("FedExPriorityOvernight")
    FED_EX_PRIORITY_OVERNIGHT("FedExPriorityOvernight"),

    /**
     * 
     * 						FedEx Standard Overnight
     * 					
     * 
     */
    @XmlEnumValue("FedExStandardOvernight")
    FED_EX_STANDARD_OVERNIGHT("FedExStandardOvernight"),

    /**
     * 
     * 						FedEx 2Day
     * 					
     * 
     */
    @XmlEnumValue("FedEx2Day")
    FED_EX_2_DAY("FedEx2Day"),

    /**
     * 
     * 						FedEx Ground
     * 					
     * 
     */
    @XmlEnumValue("FedExGround")
    FED_EX_GROUND("FedExGround"),

    /**
     * 
     * 						FedEx Home Delivery
     * 					
     * 
     */
    @XmlEnumValue("FedExHomeDelivery")
    FED_EX_HOME_DELIVERY("FedExHomeDelivery"),

    /**
     * 
     * 						FedEx Express Saver
     * 					
     * 
     */
    @XmlEnumValue("FedExExpressSaver")
    FED_EX_EXPRESS_SAVER("FedExExpressSaver"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("FedExGroundDisabled")
    FED_EX_GROUND_DISABLED("FedExGroundDisabled"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("FedExHomeDeliveryDisabled")
    FED_EX_HOME_DELIVERY_DISABLED("FedExHomeDeliveryDisabled"),

    /**
     * 
     * 						FedEx International First
     * 					
     * 
     */
    @XmlEnumValue("FedExInternationalFirst")
    FED_EX_INTERNATIONAL_FIRST("FedExInternationalFirst"),

    /**
     * 
     * 						FedEx International Priority
     * 					
     * 
     */
    @XmlEnumValue("FedExInternationalPriority")
    FED_EX_INTERNATIONAL_PRIORITY("FedExInternationalPriority"),

    /**
     * 
     * 						FedEx International Economy
     * 					
     * 
     */
    @XmlEnumValue("FedExInternationalEconomy")
    FED_EX_INTERNATIONAL_ECONOMY("FedExInternationalEconomy"),

    /**
     * 
     * 						FedEx International Ground
     * 					
     * 
     */
    @XmlEnumValue("FedExInternationalGround")
    FED_EX_INTERNATIONAL_GROUND("FedExInternationalGround"),

    /**
     * 
     * 						Economy shipping from outside US
     * 					
     * 
     */
    @XmlEnumValue("EconomyShippingFromOutsideUS")
    ECONOMY_SHIPPING_FROM_OUTSIDE_US("EconomyShippingFromOutsideUS"),

    /**
     * 
     * 						Expedited shipping from outside US
     * 					
     * 
     */
    @XmlEnumValue("ExpeditedShippingFromOutsideUS")
    EXPEDITED_SHIPPING_FROM_OUTSIDE_US("ExpeditedShippingFromOutsideUS"),

    /**
     * 
     * 						Standard shipping from outside US
     * 					
     * 
     */
    @XmlEnumValue("StandardShippingFromOutsideUS")
    STANDARD_SHIPPING_FROM_OUTSIDE_US("StandardShippingFromOutsideUS"),

    /**
     * 
     * 						Economy postage from outside UK
     * 					
     * 
     */
    @XmlEnumValue("UK_EconomyShippingFromOutside")
    UK_ECONOMY_SHIPPING_FROM_OUTSIDE("UK_EconomyShippingFromOutside"),

    /**
     * 
     * 						Express postage from outside UK
     * 					
     * 
     */
    @XmlEnumValue("UK_ExpeditedShippingFromOutside")
    UK_EXPEDITED_SHIPPING_FROM_OUTSIDE("UK_ExpeditedShippingFromOutside"),

    /**
     * 
     * 						Standard postage from outside UK
     * 					
     * 
     */
    @XmlEnumValue("UK_StandardShippingFromOutside")
    UK_STANDARD_SHIPPING_FROM_OUTSIDE("UK_StandardShippingFromOutside"),

    /**
     * 
     * 						Economy postage from outside DE
     * 					
     * 
     */
    @XmlEnumValue("DE_SparversandAusDemAusland")
    DE_SPARVERSAND_AUS_DEM_AUSLAND("DE_SparversandAusDemAusland"),

    /**
     * 
     * 						Standard postage from outside DE
     * 					
     * 
     */
    @XmlEnumValue("DE_StandardversandAusDemAusland")
    DE_STANDARDVERSAND_AUS_DEM_AUSLAND("DE_StandardversandAusDemAusland"),

    /**
     * 
     * 						Express postage from outside DE
     * 					
     * 
     */
    @XmlEnumValue("DE_ExpressversandAusDemAusland")
    DE_EXPRESSVERSAND_AUS_DEM_AUSLAND("DE_ExpressversandAusDemAusland"),

    /**
     * 
     * 						DHL 2kg Paket (nur fuer kurze Zeit)
     * 					
     * 
     */
    @XmlEnumValue("DE_DHL2KGPaket")
    DE_DHL_2_KG_PAKET("DE_DHL2KGPaket"),

    /**
     * 
     * 						Global Shipping Program
     * 						<br/>
     * 						This shipping service must be selected for the international leg of the shipment.
     * 					
     * 
     */
    @XmlEnumValue("InternationalPriorityShipping")
    INTERNATIONAL_PRIORITY_SHIPPING("InternationalPriorityShipping"),

    /**
     * 
     * 						
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("SameDayShipping")
    SAME_DAY_SHIPPING("SameDayShipping"),

    /**
     * 
     * 						Royal Mail Tracked 24
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailNextDay")
    UK_ROYAL_MAIL_NEXT_DAY("UK_RoyalMailNextDay"),

    /**
     * 
     * 						Royal Mail Tracked 48
     * 					
     * 
     */
    @XmlEnumValue("UK_RoyalMailTracked")
    UK_ROYAL_MAIL_TRACKED("UK_RoyalMailTracked"),

    /**
     * 
     * 					 This value indicates that the order will be delivered by an eBay On Demand valet through the eBay On Demand Delivery program.
     * 					
     * 
     */
    @XmlEnumValue("eBayNowImmediateDelivery")
    E_BAY_NOW_IMMEDIATE_DELIVERY("eBayNowImmediateDelivery");
    private final String value;

    ShippingServiceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingServiceCodeType fromValue(String v) {
        for (ShippingServiceCodeType c: ShippingServiceCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
