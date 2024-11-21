
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingCarrierCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingCarrierCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UPS"/>
 *     &lt;enumeration value="USPS"/>
 *     &lt;enumeration value="FedEx"/>
 *     &lt;enumeration value="DeutschePost"/>
 *     &lt;enumeration value="DHL"/>
 *     &lt;enumeration value="Hermes"/>
 *     &lt;enumeration value="iLoxx"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="ColiposteDomestic"/>
 *     &lt;enumeration value="ColiposteInternational"/>
 *     &lt;enumeration value="Chronopost"/>
 *     &lt;enumeration value="Correos"/>
 *     &lt;enumeration value="Seur"/>
 *     &lt;enumeration value="Nacex"/>
 *     &lt;enumeration value="FourPX"/>
 *     &lt;enumeration value="FourPXCHINA"/>
 *     &lt;enumeration value="FourPXExpress"/>
 *     &lt;enumeration value="FourPXLTD"/>
 *     &lt;enumeration value="SevenLSP"/>
 *     &lt;enumeration value="A1CourierServices"/>
 *     &lt;enumeration value="ABF"/>
 *     &lt;enumeration value="AeroPost"/>
 *     &lt;enumeration value="ALLIEDEXPRESS"/>
 *     &lt;enumeration value="AMWST"/>
 *     &lt;enumeration value="AnPost"/>
 *     &lt;enumeration value="APC"/>
 *     &lt;enumeration value="ARAMEX"/>
 *     &lt;enumeration value="ARVATO"/>
 *     &lt;enumeration value="ASM"/>
 *     &lt;enumeration value="AustraliaPost"/>
 *     &lt;enumeration value="AustralianAirExpress"/>
 *     &lt;enumeration value="AVRT"/>
 *     &lt;enumeration value="BPost"/>
 *     &lt;enumeration value="Bartolini"/>
 *     &lt;enumeration value="BELGIANPOST"/>
 *     &lt;enumeration value="BKNS"/>
 *     &lt;enumeration value="BluePackage"/>
 *     &lt;enumeration value="BusinessPost"/>
 *     &lt;enumeration value="CanPar"/>
 *     &lt;enumeration value="CENF"/>
 *     &lt;enumeration value="CEVA"/>
 *     &lt;enumeration value="ChinaPost"/>
 *     &lt;enumeration value="Chronoexpres"/>
 *     &lt;enumeration value="CHUKOU1"/>
 *     &lt;enumeration value="ChunghwaPost"/>
 *     &lt;enumeration value="CitiPost"/>
 *     &lt;enumeration value="CityLink"/>
 *     &lt;enumeration value="ClickandQuick"/>
 *     &lt;enumeration value="CNWY"/>
 *     &lt;enumeration value="Colissimo"/>
 *     &lt;enumeration value="CollectPlus"/>
 *     &lt;enumeration value="CPC"/>
 *     &lt;enumeration value="DAIPost"/>
 *     &lt;enumeration value="DayandRoss"/>
 *     &lt;enumeration value="DBSchenker"/>
 *     &lt;enumeration value="DHLEXPRESS"/>
 *     &lt;enumeration value="DHLGlobalMail"/>
 *     &lt;enumeration value="DHLEKB"/>
 *     &lt;enumeration value="DHLG"/>
 *     &lt;enumeration value="DieSchweizerischePost"/>
 *     &lt;enumeration value="DPD"/>
 *     &lt;enumeration value="DPXThailand"/>
 *     &lt;enumeration value="Ducros"/>
 *     &lt;enumeration value="EGO"/>
 *     &lt;enumeration value="EMF"/>
 *     &lt;enumeration value="Exapaq"/>
 *     &lt;enumeration value="Fastway"/>
 *     &lt;enumeration value="FASTWAYCOURIERS"/>
 *     &lt;enumeration value="FedExSmartPost"/>
 *     &lt;enumeration value="FLYT"/>
 *     &lt;enumeration value="FLYTExpress"/>
 *     &lt;enumeration value="FlytExpressUSDirectline"/>
 *     &lt;enumeration value="FTFT"/>
 *     &lt;enumeration value="FulfilExpressAccStation"/>
 *     &lt;enumeration value="FulfilExpresseForCity"/>
 *     &lt;enumeration value="FulfilExpressEverydaySource"/>
 *     &lt;enumeration value="FulfilExpressiTrimming"/>
 *     &lt;enumeration value="GLS"/>
 *     &lt;enumeration value="HDUSA"/>
 *     &lt;enumeration value="HomeDeliveryNetwork"/>
 *     &lt;enumeration value="HongKongPost"/>
 *     &lt;enumeration value="HUNTEREXPRESS"/>
 *     &lt;enumeration value="IndiaPost"/>
 *     &lt;enumeration value="IndonesiaPost"/>
 *     &lt;enumeration value="Interlink"/>
 *     &lt;enumeration value="InterPost"/>
 *     &lt;enumeration value="IoInvio"/>
 *     &lt;enumeration value="Iparcel"/>
 *     &lt;enumeration value="IsraelPost"/>
 *     &lt;enumeration value="JapanPost"/>
 *     &lt;enumeration value="KIALA"/>
 *     &lt;enumeration value="KoreaPost"/>
 *     &lt;enumeration value="LAPOSTE"/>
 *     &lt;enumeration value="Landmark"/>
 *     &lt;enumeration value="LDSO"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="MALAYSIAPOST"/>
 *     &lt;enumeration value="MannaFreight"/>
 *     &lt;enumeration value="Metapack"/>
 *     &lt;enumeration value="MNGTurkey"/>
 *     &lt;enumeration value="MondialRelay"/>
 *     &lt;enumeration value="MRW"/>
 *     &lt;enumeration value="MSI"/>
 *     &lt;enumeration value="NEMF"/>
 *     &lt;enumeration value="ODFL"/>
 *     &lt;enumeration value="OFFD"/>
 *     &lt;enumeration value="ONTRACK"/>
 *     &lt;enumeration value="OsterreichischePostAG"/>
 *     &lt;enumeration value="OVNT"/>
 *     &lt;enumeration value="ParcelPool"/>
 *     &lt;enumeration value="Parcelforce"/>
 *     &lt;enumeration value="Philpost"/>
 *     &lt;enumeration value="Pilot"/>
 *     &lt;enumeration value="PITD"/>
 *     &lt;enumeration value="PocztaPolska"/>
 *     &lt;enumeration value="Pocztex"/>
 *     &lt;enumeration value="POSTITALIANO"/>
 *     &lt;enumeration value="PostNL"/>
 *     &lt;enumeration value="PostNordNorway"/>
 *     &lt;enumeration value="PosteItaliane"/>
 *     &lt;enumeration value="Prestige"/>
 *     &lt;enumeration value="Quantium"/>
 *     &lt;enumeration value="RETL"/>
 *     &lt;enumeration value="RoyalMail"/>
 *     &lt;enumeration value="RRUN"/>
 *     &lt;enumeration value="SAIA"/>
 *     &lt;enumeration value="SDA"/>
 *     &lt;enumeration value="SFC"/>
 *     &lt;enumeration value="SFCExpress"/>
 *     &lt;enumeration value="SINGAPOREPOST"/>
 *     &lt;enumeration value="Siodemka"/>
 *     &lt;enumeration value="SioliandFontana"/>
 *     &lt;enumeration value="SkynetMalaysia"/>
 *     &lt;enumeration value="SMARTSEND"/>
 *     &lt;enumeration value="Sogetras"/>
 *     &lt;enumeration value="Spediamo"/>
 *     &lt;enumeration value="SpeeDee"/>
 *     &lt;enumeration value="StarTrack"/>
 *     &lt;enumeration value="SuntekExpressLTD"/>
 *     &lt;enumeration value="SwissPost"/>
 *     &lt;enumeration value="TELE"/>
 *     &lt;enumeration value="TEMANDO"/>
 *     &lt;enumeration value="THAILANDPOST"/>
 *     &lt;enumeration value="TNT"/>
 *     &lt;enumeration value="TNTEXPRESS"/>
 *     &lt;enumeration value="TNTPost"/>
 *     &lt;enumeration value="Toll"/>
 *     &lt;enumeration value="TPG"/>
 *     &lt;enumeration value="TWW"/>
 *     &lt;enumeration value="UBI"/>
 *     &lt;enumeration value="UKMail"/>
 *     &lt;enumeration value="UPSMailInnovations"/>
 *     &lt;enumeration value="UPSC"/>
 *     &lt;enumeration value="USFG"/>
 *     &lt;enumeration value="USPSCeP"/>
 *     &lt;enumeration value="USPSPMI"/>
 *     &lt;enumeration value="VietnamPost"/>
 *     &lt;enumeration value="VITR"/>
 *     &lt;enumeration value="WATKINS"/>
 *     &lt;enumeration value="Winit"/>
 *     &lt;enumeration value="Wise"/>
 *     &lt;enumeration value="WNdirect"/>
 *     &lt;enumeration value="WPX"/>
 *     &lt;enumeration value="YANWEN"/>
 *     &lt;enumeration value="Yodel"/>
 *     &lt;enumeration value="YRC"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShippingCarrierCodeType")
@XmlEnum
public enum ShippingCarrierCodeType {


    /**
     * 
     *             United Parcel Service
     *             <br/>
     *             In CompleteSale call requests, the value <code>UPS</code> also represents UPS Mail Innovations. Available in US, IE, UK, FR, IT, DE, CH, ES, AT, CN, BE, PL, NL.
     *           
     * 
     */
    UPS("UPS"),

    /**
     * 
     *             U.S. Postal Service
     *             <br/>
     *             &nbsp;&nbsp;Available in US, CN, UK, DE.
     *           
     * 
     */
    USPS("USPS"),

    /**
     * 
     *             FedEx
     *             <br/>
     *             &nbsp;&nbsp;In CompleteSale call requests, the value <code>FedEx</code> also represents FedEx SmartPost. Available in US, IE, UK, FR, IT, DE, CH, AU, ES, AT, CN, BE, PL, NL.
     *           
     * 
     */
    @XmlEnumValue("FedEx")
    FED_EX("FedEx"),

    /**
     * 
     *             Deutsche Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("DeutschePost")
    DEUTSCHE_POST("DeutschePost"),

    /**
     * 
     *             DHL Express
     *             <br/>
     *             &nbsp;&nbsp;Available in IE, US, ID, MX, MY, CA, UK, FR, IT, HK, TW, DE, CH, KR, AU, ES, AT, CN, SG, BE, TH, NL.
     *           
     * 
     */
    DHL("DHL"),

    /**
     * 
     *             Hermes Group
     *             <br/>
     *             &nbsp;&nbsp;Available in US, AT, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("Hermes")
    HERMES("Hermes"),

    /**
     * 
     *             iloxx eService
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("iLoxx")
    I_LOXX("iLoxx"),

    /**
     * 
     *             Use this code for any carrier not listed here.
     *           
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     *             Coliposte Domestic
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("ColiposteDomestic")
    COLIPOSTE_DOMESTIC("ColiposteDomestic"),

    /**
     * 
     *             Coliposte International
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("ColiposteInternational")
    COLIPOSTE_INTERNATIONAL("ColiposteInternational"),

    /**
     * 
     *             Chronopost
     *             <br/>
     *             &nbsp;&nbsp;Available in US, FR, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("Chronopost")
    CHRONOPOST("Chronopost"),

    /**
     * 
     *             Correos
     *             <br/>
     *             &nbsp;&nbsp;Available in ES, US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("Correos")
    CORREOS("Correos"),

    /**
     * 
     *             Seur (reserved for future use).
     *           
     * 
     */
    @XmlEnumValue("Seur")
    SEUR("Seur"),

    /**
     * 
     *             Nacex
     *             <br/>
     *             &nbsp;&nbsp;Available in ES, US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("Nacex")
    NACEX("Nacex"),

    /**
     * 
     *             4PX
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    @XmlEnumValue("FourPX")
    FOUR_PX("FourPX"),

    /**
     * 
     *             4PX China
     *             <br/>
     *             &nbsp;&nbsp;Available in US, CN, UK.
     *           
     * 
     */
    @XmlEnumValue("FourPXCHINA")
    FOUR_PXCHINA("FourPXCHINA"),

    /**
     * 
     *             4PX Express
     *             <br/>
     *             &nbsp;&nbsp;Available in UK, DE.
     *           
     * 
     */
    @XmlEnumValue("FourPXExpress")
    FOUR_PX_EXPRESS("FourPXExpress"),

    /**
     * 
     *             4PX Express Co. Ltd
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("FourPXLTD")
    FOUR_PXLTD("FourPXLTD"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    @XmlEnumValue("SevenLSP")
    SEVEN_LSP("SevenLSP"),

    /**
     * 
     *             A-1 Courier
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    @XmlEnumValue("A1CourierServices")
    A_1_COURIER_SERVICES("A1CourierServices"),

    /**
     * 
     *             ABF Freight
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    ABF("ABF"),

    /**
     * 
     *             AeroPost
     *             <br/>
     *             &nbsp;&nbsp;Available in JM, GT, CR, PA, TT, SV, CO, HN, CL, DO.
     *           
     * 
     */
    @XmlEnumValue("AeroPost")
    AERO_POST("AeroPost"),

    /**
     * 
     *             Allied Express
     *             <br/>
     *             &nbsp;&nbsp;Available in AU.
     *           
     * 
     */
    ALLIEDEXPRESS("ALLIEDEXPRESS"),

    /**
     * 
     *             AMWST
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    AMWST("AMWST"),

    /**
     * 
     *             An Post
     *             <br/>
     *             &nbsp;&nbsp;Available in IE.
     *           
     * 
     */
    @XmlEnumValue("AnPost")
    AN_POST("AnPost"),

    /**
     * 
     *             APC Postal Logistics
     *             <br/>
     *             &nbsp;&nbsp;Available in UK.
     *           
     * 
     */
    APC("APC"),

    /**
     * 
     *             Aramex
     *             <br/>
     *             &nbsp;&nbsp;Available in US, BH, IL, AE, IN, UA, KW, SA, QA.
     *           
     * 
     */
    ARAMEX("ARAMEX"),

    /**
     * 
     *             Arvato
     *             <br/>
     *             &nbsp;&nbsp;Available in US, CA, UK, FR, IT, GR, DE, CH, AT, BE, NL, SI, LT, SK.
     *           
     * 
     */
    ARVATO("ARVATO"),

    /**
     * 
     *             ASM
     *             <br/>
     *             &nbsp;&nbsp;Available in ES.
     *           
     * 
     */
    ASM("ASM"),

    /**
     * 
     *             Australia Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE, AU.
     *           
     * 
     */
    @XmlEnumValue("AustraliaPost")
    AUSTRALIA_POST("AustraliaPost"),

    /**
     * 
     *             Australian Air Express
     *             <br/>
     *             &nbsp;&nbsp;Available in AU.
     *           
     * 
     */
    @XmlEnumValue("AustralianAirExpress")
    AUSTRALIAN_AIR_EXPRESS("AustralianAirExpress"),

    /**
     * 
     *             Averitt Express
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    AVRT("AVRT"),

    /**
     * 
     *             bpost
     *             <br/>
     *             &nbsp;&nbsp;Also coded as <code>BELGIANPOST</code>. Available in US, UK, DE, MO, BE.
     *           
     * 
     */
    @XmlEnumValue("BPost")
    B_POST("BPost"),

    /**
     * 
     *             BRT Bartolini
     *             <br/>
     *             &nbsp;&nbsp;Available in IT.
     *           
     * 
     */
    @XmlEnumValue("Bartolini")
    BARTOLINI("Bartolini"),

    /**
     * 
     *             Belgian Post Group
     *             <br/>
     *             &nbsp;&nbsp;Also coded as <code>BPost</code>. Available in US, UK, DE MO, BE.
     *           
     * 
     */
    BELGIANPOST("BELGIANPOST"),

    /**
     * 
     *             BKNS
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    BKNS("BKNS"),

    /**
     * 
     *             Blue Package Delivery
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    @XmlEnumValue("BluePackage")
    BLUE_PACKAGE("BluePackage"),

    /**
     * 
     *             BusinessPost
     *             <br/>
     *             &nbsp;&nbsp;Available in UK.
     *           
     * 
     */
    @XmlEnumValue("BusinessPost")
    BUSINESS_POST("BusinessPost"),

    /**
     * 
     *             Canpar Courier
     *             <br/>
     *             &nbsp;&nbsp;Available in US, CA, IT, UK, DE, AU
     *           
     * 
     */
    @XmlEnumValue("CanPar")
    CAN_PAR("CanPar"),

    /**
     * 
     *             Central Freight Lines
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    CENF("CENF"),

    /**
     * 
     *             CEVA Logistics
     *             <br/>
     *             &nbsp;&nbsp;Available in US, IT.
     *           
     * 
     */
    CEVA("CEVA"),

    /**
     * 
     *             China Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("ChinaPost")
    CHINA_POST("ChinaPost"),

    /**
     * 
     *             Chronoexpres
     *             <br/>
     *             &nbsp;&nbsp;Available in ES.
     *           
     * 
     */
    @XmlEnumValue("Chronoexpres")
    CHRONOEXPRES("Chronoexpres"),

    /**
     * 
     *             Chukou1
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    @XmlEnumValue("CHUKOU1")
    CHUKOU_1("CHUKOU1"),

    /**
     * 
     *             Chunghwa Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("ChunghwaPost")
    CHUNGHWA_POST("ChunghwaPost"),

    /**
     * 
     *             CitiPost
     *             <br/>
     *             &nbsp;&nbsp;Available in US, IE, CA, UK, FR, IT, HK, DE, AU, ES, CN, BE, UZ, PL, NL.
     *           
     * 
     */
    @XmlEnumValue("CitiPost")
    CITI_POST("CitiPost"),

    /**
     * 
     *             Citylink
     *             <br/>
     *             &nbsp;&nbsp;Available in IE.
     *           
     * 
     */
    @XmlEnumValue("CityLink")
    CITY_LINK("CityLink"),

    /**
     * 
     *             Click & Quick
     *             <br/>
     *             &nbsp;&nbsp;Available in IT.
     *           
     * 
     */
    @XmlEnumValue("ClickandQuick")
    CLICKAND_QUICK("ClickandQuick"),

    /**
     * 
     *             XPO Logistics (formerly Con-way Freight)
     *             <br/>
     *             &nbsp;&nbsp;Con-way Freight is now part of XPO Logistics. Available in US.
     *           
     * 
     */
    CNWY("CNWY"),

    /**
     * 
     *             Colissimo
     *             <br/>
     *             &nbsp;&nbsp;Available in FR.
     *           
     * 
     */
    @XmlEnumValue("Colissimo")
    COLISSIMO("Colissimo"),

    /**
     * 
     *             CollectPlus
     *             <br/>
     *             &nbsp;&nbsp;Available in UK.
     *           
     * 
     */
    @XmlEnumValue("CollectPlus")
    COLLECT_PLUS("CollectPlus"),

    /**
     * 
     *             CPC Logistics
     *             <br/>
     *             &nbsp;&nbsp;Available in US, CA, UK, DE.
     *           
     * 
     */
    CPC("CPC"),

    /**
     * 
     *             DAI Post
     *             <br/>
     *             &nbsp;&nbsp;Available in UK, AU.
     *           
     * 
     */
    @XmlEnumValue("DAIPost")
    DAI_POST("DAIPost"),

    /**
     * 
     *             Day & Ross
     *             <br/>
     *             &nbsp;&nbsp;Available in US, CA, UK, AU.
     *           
     * 
     */
    @XmlEnumValue("DayandRoss")
    DAYAND_ROSS("DayandRoss"),

    /**
     * 
     *             DB Schenker
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    @XmlEnumValue("DBSchenker")
    DB_SCHENKER("DBSchenker"),

    /**
     * 
     *             DHL Express
     *             <br/>
     *             &nbsp;&nbsp;Available in IT, DE.
     *           
     * 
     */
    DHLEXPRESS("DHLEXPRESS"),

    /**
     * 
     *             DHL Global Mail
     *             <br/>
     *             &nbsp;&nbsp;Formerly coded as <code>DHLG</code>. Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("DHLGlobalMail")
    DHL_GLOBAL_MAIL("DHLGlobalMail"),

    /**
     * 
     *             DHL EKB
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    DHLEKB("DHLEKB"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Use <code>DHLGlobalMail</code> instead.
     *           
     * 
     */
    DHLG("DHLG"),

    /**
     * 
     *             Die Schweizerische Post
     *             <br/>
     *             &nbsp;&nbsp;Available in CH.
     *           
     * 
     */
    @XmlEnumValue("DieSchweizerischePost")
    DIE_SCHWEIZERISCHE_POST("DieSchweizerischePost"),

    /**
     * 
     *             DPD (Dynamic Parcel Distribution)
     *             <br/>
     *             &nbsp;&nbsp;Available in IE, BG, AT, UK, HR, BE, HU, PL, CZ, DE, NL, CH.
     *           
     * 
     */
    DPD("DPD"),

    /**
     * 
     *             DPX Thailand
     *             <br/>
     *             &nbsp;&nbsp;Available in US, TH.
     *           
     * 
     */
    @XmlEnumValue("DPXThailand")
    DPX_THAILAND("DPXThailand"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    @XmlEnumValue("Ducros")
    DUCROS("Ducros"),

    /**
     * 
     *             E-go
     *             <br/>
     *             &nbsp;&nbsp;Available in AU.
     *           
     * 
     */
    EGO("EGO"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    EMF("EMF"),

    /**
     * 
     *             DPD France (formerly Exapaq)
     *             <br/>
     *             &nbsp;&nbsp;Exapaq is now part of DPD France. Available in FR.
     *           
     * 
     */
    @XmlEnumValue("Exapaq")
    EXAPAQ("Exapaq"),

    /**
     * 
     *             Fastway
     *             <br/>
     *             &nbsp;&nbsp;Available in IE.
     *           
     * 
     */
    @XmlEnumValue("Fastway")
    FASTWAY("Fastway"),

    /**
     * 
     *             Fastway Couriers
     *             <br/>
     *             &nbsp;&nbsp;Available in AU.
     *           
     * 
     */
    FASTWAYCOURIERS("FASTWAYCOURIERS"),

    /**
     * 
     *             FedEx SmartPost
     *             <br/>
     *             &nbsp;&nbsp;In CompleteSale call requests only, specify FedEx SmartPost with the value <code>FedEx</code>. Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("FedExSmartPost")
    FED_EX_SMART_POST("FedExSmartPost"),

    /**
     * 
     *             Flyt
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    FLYT("FLYT"),

    /**
     * 
     *             Flyt Express
     *             <br/>
     *             &nbsp;&nbsp;Available in UK, DE.
     *           
     * 
     */
    @XmlEnumValue("FLYTExpress")
    FLYT_EXPRESS("FLYTExpress"),

    /**
     * 
     *             Flyt Express US Direct line
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("FlytExpressUSDirectline")
    FLYT_EXPRESS_US_DIRECTLINE("FlytExpressUSDirectline"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    FTFT("FTFT"),

    /**
     * 
     *             FulfilExpress-AccStation
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("FulfilExpressAccStation")
    FULFIL_EXPRESS_ACC_STATION("FulfilExpressAccStation"),

    /**
     * 
     *             FulfilExpress-eForCity
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("FulfilExpresseForCity")
    FULFIL_EXPRESSE_FOR_CITY("FulfilExpresseForCity"),

    /**
     * 
     *             FulfilExpress-EverydaySource
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("FulfilExpressEverydaySource")
    FULFIL_EXPRESS_EVERYDAY_SOURCE("FulfilExpressEverydaySource"),

    /**
     * 
     *             FulfilExpress-iTrimming
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("FulfilExpressiTrimming")
    FULFIL_EXPRESSI_TRIMMING("FulfilExpressiTrimming"),

    /**
     * 
     *             GLS (General Logistics Systems)
     *             <br/>
     *             &nbsp;&nbsp;Available in IE, ES, AT, IT, FR, BE, DE, NL.
     *           
     * 
     */
    GLS("GLS"),

    /**
     * 
     *             MXD Group (formerly Home Direct USA)
     *             <br/>
     *             &nbsp;&nbsp;Home Direct USA is now part of MXD Group. Available in US.
     *           
     * 
     */
    HDUSA("HDUSA"),

    /**
     * 
     *             n/a
     *             <br/>
     *             Use <code>Yodel</code> instead.
     *           
     * 
     */
    @XmlEnumValue("HomeDeliveryNetwork")
    HOME_DELIVERY_NETWORK("HomeDeliveryNetwork"),

    /**
     * 
     *             Hong Kong Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE, AU.
     *           
     * 
     */
    @XmlEnumValue("HongKongPost")
    HONG_KONG_POST("HongKongPost"),

    /**
     * 
     *             Hunter Express
     *             <br/>
     *             &nbsp;&nbsp;Available in AU.
     *           
     * 
     */
    HUNTEREXPRESS("HUNTEREXPRESS"),

    /**
     * 
     *             India Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("IndiaPost")
    INDIA_POST("IndiaPost"),

    /**
     * 
     *             Indonesia Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("IndonesiaPost")
    INDONESIA_POST("IndonesiaPost"),

    /**
     * 
     *             Interlink Express
     *             <br/>
     *             &nbsp;&nbsp;Available in UK.
     *           
     * 
     */
    @XmlEnumValue("Interlink")
    INTERLINK("Interlink"),

    /**
     * 
     *             InterPost
     *             <br/>
     *             &nbsp;&nbsp;Available in IE, US, CA, UK, FR, IT, HK, DE, RO, AU, ES, AT, CN, CY, BE, PL, NL.
     *           
     * 
     */
    @XmlEnumValue("InterPost")
    INTER_POST("InterPost"),

    /**
     * 
     *             IoInvio
     *             <br/>
     *             &nbsp;&nbsp;Available in IT.
     *           
     * 
     */
    @XmlEnumValue("IoInvio")
    IO_INVIO("IoInvio"),

    /**
     * 
     *             UPS i-parcel
     *             <br/>
     *             &nbsp;&nbsp;Available in US, MX, MY, SG, HK, ZA, TR, CH, JP, BR.
     *           
     * 
     */
    @XmlEnumValue("Iparcel")
    IPARCEL("Iparcel"),

    /**
     * 
     *             Israel Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    @XmlEnumValue("IsraelPost")
    ISRAEL_POST("IsraelPost"),

    /**
     * 
     *             Japan Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("JapanPost")
    JAPAN_POST("JapanPost"),

    /**
     * 
     *             Kiala (UPS Access Point)
     *             <br/>
     *             &nbsp;&nbsp;Available in ES, US, FR, UK, BE, DE, NL.
     *           
     * 
     */
    KIALA("KIALA"),

    /**
     * 
     *             Korea Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("KoreaPost")
    KOREA_POST("KoreaPost"),

    /**
     * 
     *             La Poste
     *             <br/>
     *             &nbsp;&nbsp;Available in US, FR, UK, DE.
     *           
     * 
     */
    LAPOSTE("LAPOSTE"),

    /**
     * 
     *             Landmark Global
     *             <br/>
     *             &nbsp;&nbsp;Available in US, NZ, NO.
     *           
     * 
     */
    @XmlEnumValue("Landmark")
    LANDMARK("Landmark"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    LDSO("LDSO"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    LTL("LTL"),

    /**
     * 
     *             Malaysia Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    MALAYSIAPOST("MALAYSIAPOST"),

    /**
     * 
     *             Manna Distribution Services
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    @XmlEnumValue("MannaFreight")
    MANNA_FREIGHT("MannaFreight"),

    /**
     * 
     *             Metapack
     *             <br/>
     *             &nbsp;&nbsp;Available in UK.
     *           
     * 
     */
    @XmlEnumValue("Metapack")
    METAPACK("Metapack"),

    /**
     * 
     *             MNG Kargo
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, TR.
     *           
     * 
     */
    @XmlEnumValue("MNGTurkey")
    MNG_TURKEY("MNGTurkey"),

    /**
     * 
     *             Mondial Relay
     *             <br/>
     *             &nbsp;&nbsp;Available in FR.
     *           
     * 
     */
    @XmlEnumValue("MondialRelay")
    MONDIAL_RELAY("MondialRelay"),

    /**
     * 
     *             MRW
     *             <br/>
     *             &nbsp;&nbsp;Available in ES.
     *           
     * 
     */
    MRW("MRW"),

    /**
     * 
     *             MSI Transportation
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    MSI("MSI"),

    /**
     * 
     *             New England Motor Freight
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    NEMF("NEMF"),

    /**
     * 
     *             Old Dominion Freight Line
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    ODFL("ODFL"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    OFFD("OFFD"),

    /**
     * 
     *             OnTrac Shipping
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    ONTRACK("ONTRACK"),

    /**
     * 
     *             Osterreichische Post
     *             <br/>
     *             &nbsp;&nbsp;Available in AT.
     *           
     * 
     */
    @XmlEnumValue("OsterreichischePostAG")
    OSTERREICHISCHE_POST_AG("OsterreichischePostAG"),

    /**
     * 
     *             UPS Freight (formerly Overnite)
     *             <br/>
     *             &nbsp;&nbsp;Overnite is now part of UPS Freight. Available in US.
     *           
     * 
     */
    OVNT("OVNT"),

    /**
     * 
     *             International Bridge Domestic delivery
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    @XmlEnumValue("ParcelPool")
    PARCEL_POOL("ParcelPool"),

    /**
     * 
     *             Parcelforce
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("Parcelforce")
    PARCELFORCE("Parcelforce"),

    /**
     * 
     *             PHLPost (Philippine Postal Corporation)
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("Philpost")
    PHILPOST("Philpost"),

    /**
     * 
     *             Pilot Freight Services
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    @XmlEnumValue("Pilot")
    PILOT("Pilot"),

    /**
     * 
     *             PITT OHIO
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    PITD("PITD"),

    /**
     * 
     *             Poczta Polska
     *             <br/>
     *             &nbsp;&nbsp;Available in PL.
     *           
     * 
     */
    @XmlEnumValue("PocztaPolska")
    POCZTA_POLSKA("PocztaPolska"),

    /**
     * 
     *             Pocztex
     *             <br/>
     *             &nbsp;&nbsp;Available in PL.
     *           
     * 
     */
    @XmlEnumValue("Pocztex")
    POCZTEX("Pocztex"),

    /**
     * 
     *             Post Italiano
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    POSTITALIANO("POSTITALIANO"),

    /**
     * 
     *             PostNL
     *             <br/>
     *             &nbsp;&nbsp;Available in NL.
     *           
     * 
     */
    @XmlEnumValue("PostNL")
    POST_NL("PostNL"),

    /**
     * 
     *             PostNord
     *             <br/>
     *             &nbsp;&nbsp;Available in UK, NO.
     *           
     * 
     */
    @XmlEnumValue("PostNordNorway")
    POST_NORD_NORWAY("PostNordNorway"),

    /**
     * 
     *             Poste Italiane
     *             <br/>
     *             &nbsp;&nbsp;Available in IT.
     *           
     * 
     */
    @XmlEnumValue("PosteItaliane")
    POSTE_ITALIANE("PosteItaliane"),

    /**
     * 
     *             LaserShip (formerly Prestige Expedite)
     *             <br/>
     *             &nbsp;&nbsp;Prestige Expedite is now part of LaserShip. Available in US.
     *           
     * 
     */
    @XmlEnumValue("Prestige")
    PRESTIGE("Prestige"),

    /**
     * 
     *             Quantium Solutions
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE, AU.
     *           
     * 
     */
    @XmlEnumValue("Quantium")
    QUANTIUM("Quantium"),

    /**
     * 
     *             Reddaway
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    RETL("RETL"),

    /**
     * 
     *             Royal Mail
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("RoyalMail")
    ROYAL_MAIL("RoyalMail"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    RRUN("RRUN"),

    /**
     * 
     *             Saia LTL Freight
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    SAIA("SAIA"),

    /**
     * 
     *             SDA Express Courier
     *             <br/>
     *             &nbsp;&nbsp;Available in IT.
     *           
     * 
     */
    SDA("SDA"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    SFC("SFC"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    @XmlEnumValue("SFCExpress")
    SFC_EXPRESS("SFCExpress"),

    /**
     * 
     *             Singapore Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    SINGAPOREPOST("SINGAPOREPOST"),

    /**
     * 
     *             Siodemka (DPD Poland)
     *             <br/>
     *             &nbsp;&nbsp;Available in PL.
     *           
     * 
     */
    @XmlEnumValue("Siodemka")
    SIODEMKA("Siodemka"),

    /**
     * 
     *             Sioli & Fontana
     *             <br/>
     *             &nbsp;&nbsp;Available in US, CA, IT.
     *           
     * 
     */
    @XmlEnumValue("SioliandFontana")
    SIOLIAND_FONTANA("SioliandFontana"),

    /**
     * 
     *             Skynet (Malaysia)
     *             <br/>
     *             &nbsp;&nbsp;Available in US, MY.
     *           
     * 
     */
    @XmlEnumValue("SkynetMalaysia")
    SKYNET_MALAYSIA("SkynetMalaysia"),

    /**
     * 
     *             Smart Send Courier Service
     *             <br/>
     *             &nbsp;&nbsp;Available in AU.
     *           
     * 
     */
    SMARTSEND("SMARTSEND"),

    /**
     * 
     *             SGT Corriere Espresso
     *             <br/>
     *             &nbsp;&nbsp;Available in IT.
     *           
     * 
     */
    @XmlEnumValue("Sogetras")
    SOGETRAS("Sogetras"),

    /**
     * 
     *             Spediamo
     *             <br/>
     *             &nbsp;&nbsp;Available in IT.
     *           
     * 
     */
    @XmlEnumValue("Spediamo")
    SPEDIAMO("Spediamo"),

    /**
     * 
     *             Spee-Dee Delivery Service
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    @XmlEnumValue("SpeeDee")
    SPEE_DEE("SpeeDee"),

    /**
     * 
     *             StarTrack
     *             <br/>
     *             &nbsp;&nbsp;Available in AU.
     *           
     * 
     */
    @XmlEnumValue("StarTrack")
    STAR_TRACK("StarTrack"),

    /**
     * 
     *             Suntek Express LTD
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("SuntekExpressLTD")
    SUNTEK_EXPRESS_LTD("SuntekExpressLTD"),

    /**
     * 
     *             Swiss Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, CH.
     *           
     * 
     */
    @XmlEnumValue("SwissPost")
    SWISS_POST("SwissPost"),

    /**
     * 
     *             TELE
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    TELE("TELE"),

    /**
     * 
     *             Temando (shipping broker)
     *             <br/>
     *             &nbsp;&nbsp;Available in AU.
     *           
     * 
     */
    TEMANDO("TEMANDO"),

    /**
     * 
     *             Thailand Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    THAILANDPOST("THAILANDPOST"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    TNT("TNT"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    TNTEXPRESS("TNTEXPRESS"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    @XmlEnumValue("TNTPost")
    TNT_POST("TNTPost"),

    /**
     * 
     *             Toll (Japan Post)
     *             <br/>
     *             &nbsp;&nbsp;Available in AU.
     *           
     * 
     */
    @XmlEnumValue("Toll")
    TOLL("Toll"),

    /**
     * 
     *             TPG Logistics
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    TPG("TPG"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    TWW("TWW"),

    /**
     * 
     *             UBI Smart Parcel
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    UBI("UBI"),

    /**
     * 
     *             UK Mail
     *             <br/>
     *             &nbsp;&nbsp;Available in UK.
     *           
     * 
     */
    @XmlEnumValue("UKMail")
    UK_MAIL("UKMail"),

    /**
     * 
     *             UPS Mail Innovations
     *             <br/>
     *             &nbsp;&nbsp;In CompleteSale call requests only, specify UPS Mail Innovations with the value <code>UPS</code>. Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("UPSMailInnovations")
    UPS_MAIL_INNOVATIONS("UPSMailInnovations"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    UPSC("UPSC"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    USFG("USFG"),

    /**
     * 
     *             USPS Commercial ePacket
     *             <br/>
     *             &nbsp;&nbsp;Available in US, CA.
     *           
     * 
     */
    @XmlEnumValue("USPSCeP")
    USPS_CE_P("USPSCeP"),

    /**
     * 
     *             USPS Priority Mail International
     *             <br/>
     *             &nbsp;&nbsp;Available in US, CA.
     *           
     * 
     */
    USPSPMI("USPSPMI"),

    /**
     * 
     *             Vietnam Post
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    @XmlEnumValue("VietnamPost")
    VIETNAM_POST("VietnamPost"),

    /**
     * 
     *             Vitran Express
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    VITR("VITR"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    WATKINS("WATKINS"),

    /**
     * 
     *             WIN.IT America
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE, AU.
     *           
     * 
     */
    @XmlEnumValue("Winit")
    WINIT("Winit"),

    /**
     * 
     *             n/a
     *             <br/>
     *             &nbsp;&nbsp;Not currently supported.
     *           
     * 
     */
    @XmlEnumValue("Wise")
    WISE("Wise"),

    /**
     * 
     *             wnDirect
     *             <br/>
     *             &nbsp;&nbsp;Available in US, CA, IT, FR, UK, RU, AU.
     *           
     * 
     */
    @XmlEnumValue("WNdirect")
    W_NDIRECT("WNdirect"),

    /**
     * 
     *             WPX Delivery Solutions
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    WPX("WPX"),

    /**
     * 
     *             YANWEN Express
     *             <br/>
     *             &nbsp;&nbsp;Available in US, UK, DE.
     *           
     * 
     */
    YANWEN("YANWEN"),

    /**
     * 
     *             Yodel
     *             <br/>
     *             &nbsp;&nbsp;Available in UK.
     *           
     * 
     */
    @XmlEnumValue("Yodel")
    YODEL("Yodel"),

    /**
     * 
     *             YRC Freight
     *             <br/>
     *             &nbsp;&nbsp;Available in US.
     *           
     * 
     */
    YRC("YRC"),

    /**
     * 
     *             Reserved for internal or future use
     *           
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingCarrierCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingCarrierCodeType fromValue(String v) {
        for (ShippingCarrierCodeType c: ShippingCarrierCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
