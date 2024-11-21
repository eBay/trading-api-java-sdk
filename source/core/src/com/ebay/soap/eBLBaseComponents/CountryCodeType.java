
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="DZ"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="AQ"/>
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AW"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="BS"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BD"/>
 *     &lt;enumeration value="BB"/>
 *     &lt;enumeration value="BY"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BZ"/>
 *     &lt;enumeration value="BJ"/>
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="BW"/>
 *     &lt;enumeration value="BV"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="IO"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="BF"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="KH"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="KY"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="TD"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="CX"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="CK"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="CZ"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="DJ"/>
 *     &lt;enumeration value="DM"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="TP"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="EG"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="GQ"/>
 *     &lt;enumeration value="ER"/>
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="FK"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="FJ"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="GF"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="TF"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="GH"/>
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="GD"/>
 *     &lt;enumeration value="GP"/>
 *     &lt;enumeration value="GU"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GW"/>
 *     &lt;enumeration value="GY"/>
 *     &lt;enumeration value="HT"/>
 *     &lt;enumeration value="HM"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="HN"/>
 *     &lt;enumeration value="HK"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="IQ"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="JM"/>
 *     &lt;enumeration value="JP"/>
 *     &lt;enumeration value="JO"/>
 *     &lt;enumeration value="KZ"/>
 *     &lt;enumeration value="KE"/>
 *     &lt;enumeration value="KI"/>
 *     &lt;enumeration value="KP"/>
 *     &lt;enumeration value="KR"/>
 *     &lt;enumeration value="KW"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="LR"/>
 *     &lt;enumeration value="LY"/>
 *     &lt;enumeration value="LI"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LU"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MW"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="MV"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MQ"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MU"/>
 *     &lt;enumeration value="YT"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MZ"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NR"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="NZ"/>
 *     &lt;enumeration value="NI"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NG"/>
 *     &lt;enumeration value="NU"/>
 *     &lt;enumeration value="NF"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="OM"/>
 *     &lt;enumeration value="PK"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PG"/>
 *     &lt;enumeration value="PY"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="QA"/>
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SH"/>
 *     &lt;enumeration value="KN"/>
 *     &lt;enumeration value="LC"/>
 *     &lt;enumeration value="PM"/>
 *     &lt;enumeration value="VC"/>
 *     &lt;enumeration value="WS"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SG"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="ZA"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="LK"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SJ"/>
 *     &lt;enumeration value="SZ"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="SY"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="TJ"/>
 *     &lt;enumeration value="TZ"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="TG"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="TT"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="TV"/>
 *     &lt;enumeration value="UG"/>
 *     &lt;enumeration value="UA"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="GB"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UM"/>
 *     &lt;enumeration value="UY"/>
 *     &lt;enumeration value="UZ"/>
 *     &lt;enumeration value="VU"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="VN"/>
 *     &lt;enumeration value="VG"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="WF"/>
 *     &lt;enumeration value="EH"/>
 *     &lt;enumeration value="YE"/>
 *     &lt;enumeration value="YU"/>
 *     &lt;enumeration value="ZM"/>
 *     &lt;enumeration value="ZW"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="QM"/>
 *     &lt;enumeration value="QN"/>
 *     &lt;enumeration value="QO"/>
 *     &lt;enumeration value="QP"/>
 *     &lt;enumeration value="JE"/>
 *     &lt;enumeration value="GG"/>
 *     &lt;enumeration value="ZZ"/>
 *     &lt;enumeration value="RS"/>
 *     &lt;enumeration value="ME"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CountryCodeType")
@XmlEnum
public enum CountryCodeType {


    /**
     * 
     * 						Afghanistan.
     * 					
     * 
     */
    AF("AF"),

    /**
     * 
     * 						Albania.
     * 					
     * 
     */
    AL("AL"),

    /**
     * 
     * 						Algeria.
     * 					
     * 
     */
    DZ("DZ"),

    /**
     * 
     * 						American Samoa.
     * 					
     * 
     */
    AS("AS"),

    /**
     * 
     * 						Andorra.
     * 					
     * 
     */
    AD("AD"),

    /**
     * 
     * 						Angola.
     * 					
     * 
     */
    AO("AO"),

    /**
     * 
     * 						Anguilla.
     * 					
     * 
     */
    AI("AI"),

    /**
     * 
     * 						Antarctica.
     * 					
     * 
     */
    AQ("AQ"),

    /**
     * 
     * 						Antigua and Barbuda.
     * 					
     * 
     */
    AG("AG"),

    /**
     * 
     * 						Argentina.
     * 					
     * 
     */
    AR("AR"),

    /**
     * 
     * 						Armenia.
     * 					
     * 
     */
    AM("AM"),

    /**
     * 
     * 						Aruba.
     * 					
     * 
     */
    AW("AW"),

    /**
     * 
     * 						Australia.
     * 					
     * 
     */
    AU("AU"),

    /**
     * 
     * 						Austria.
     * 					
     * 
     */
    AT("AT"),

    /**
     * 
     * 						Azerbaijan.
     * 					
     * 
     */
    AZ("AZ"),

    /**
     * 
     * 						Bahamas.
     * 					
     * 
     */
    BS("BS"),

    /**
     * 
     * 						Bahrain.
     * 					
     * 
     */
    BH("BH"),

    /**
     * 
     * 						Bangladesh.
     * 					
     * 
     */
    BD("BD"),

    /**
     * 
     * 						Barbados.
     * 					
     * 
     */
    BB("BB"),

    /**
     * 
     * 						Belarus.
     * 					
     * 
     */
    BY("BY"),

    /**
     * 
     * 						Belgium.
     * 					
     * 
     */
    BE("BE"),

    /**
     * 
     * 						Belize.
     * 					
     * 
     */
    BZ("BZ"),

    /**
     * 
     * 						Benin.
     * 					
     * 
     */
    BJ("BJ"),

    /**
     * 
     * 						Bermuda.
     * 					
     * 
     */
    BM("BM"),

    /**
     * 
     * 						Bhutan.
     * 					
     * 
     */
    BT("BT"),

    /**
     * 
     * 						Bolivia.
     * 					
     * 
     */
    BO("BO"),

    /**
     * 
     * 						Bosnia and Herzegovina.
     * 					
     * 
     */
    BA("BA"),

    /**
     * 
     * 						Botswana.
     * 					
     * 
     */
    BW("BW"),

    /**
     * 
     * 						Bouvet Island.
     * 					
     * 
     */
    BV("BV"),

    /**
     * 
     * 						Brazil.
     * 					
     * 
     */
    BR("BR"),

    /**
     * 
     * 						British Indian Ocean Territory.
     * 					
     * 
     */
    IO("IO"),

    /**
     * 
     * 						Brunei Darussalam.
     * 					
     * 
     */
    BN("BN"),

    /**
     * 
     * 						Bulgaria.
     * 					
     * 
     */
    BG("BG"),

    /**
     * 
     * 						Burkina Faso.
     * 					
     * 
     */
    BF("BF"),

    /**
     * 
     * 						Burundi.
     * 					
     * 
     */
    BI("BI"),

    /**
     * 
     * 						Cambodia.
     * 					
     * 
     */
    KH("KH"),

    /**
     * 
     * 						Cameroon.
     * 					
     * 
     */
    CM("CM"),

    /**
     * 
     * 						Canada.
     * 					
     * 
     */
    CA("CA"),

    /**
     * 
     * 						Cape Verde.
     * 					
     * 
     */
    CV("CV"),

    /**
     * 
     * 						Cayman Islands.
     * 					
     * 
     */
    KY("KY"),

    /**
     * 
     * 						Central African Republic.
     * 					
     * 
     */
    CF("CF"),

    /**
     * 
     * 						Chad.
     * 					
     * 
     */
    TD("TD"),

    /**
     * 
     * 						Chile.
     * 					
     * 
     */
    CL("CL"),

    /**
     * 
     * 						China.
     * 					
     * 
     */
    CN("CN"),

    /**
     * 
     * 						Christmas Island.
     * 					
     * 
     */
    CX("CX"),

    /**
     * 
     * 						Cocos (Keeling) Islands.
     * 					
     * 
     */
    CC("CC"),

    /**
     * 
     * 						Colombia.
     * 					
     * 
     */
    CO("CO"),

    /**
     * 
     * 						Comoros.
     * 					
     * 
     */
    KM("KM"),

    /**
     * 
     * 						Congo.
     * 					
     * 
     */
    CG("CG"),

    /**
     * 
     * 						Congo, The Democratic Republic of the.
     * 					
     * 
     */
    CD("CD"),

    /**
     * 
     * 						Cook Islands.
     * 					
     * 
     */
    CK("CK"),

    /**
     * 
     * 						Costa Rica.
     * 					
     * 
     */
    CR("CR"),

    /**
     * 
     * 						Cote d'Ivoire.
     * 					
     * 
     */
    CI("CI"),

    /**
     * 
     * 						Croatia.
     * 					
     * 
     */
    HR("HR"),

    /**
     * 
     * 						Cuba.
     * 					
     * 
     */
    CU("CU"),

    /**
     * 
     * 						Cyprus.
     * 					
     * 
     */
    CY("CY"),

    /**
     * 
     * 						Czech Republic.
     * 					
     * 
     */
    CZ("CZ"),

    /**
     * 
     * 						Denmark.
     * 					
     * 
     */
    DK("DK"),

    /**
     * 
     * 						Djibouti.
     * 					
     * 
     */
    DJ("DJ"),

    /**
     * 
     * 						Dominica.
     * 					
     * 
     */
    DM("DM"),

    /**
     * 
     * 						Dominican Republic.
     * 					
     * 
     */
    DO("DO"),

    /**
     * 
     * 						No longer in use.
     * 					
     * 
     */
    TP("TP"),

    /**
     * 
     * 						Ecuador.
     * 					
     * 
     */
    EC("EC"),

    /**
     * 
     * 						Egypt.
     * 					
     * 
     */
    EG("EG"),

    /**
     * 
     * 						El Salvador.
     * 					
     * 
     */
    SV("SV"),

    /**
     * 
     * 						Equatorial Guinea.
     * 					
     * 
     */
    GQ("GQ"),

    /**
     * 
     * 						Eritrea.
     * 					
     * 
     */
    ER("ER"),

    /**
     * 
     * 						Estonia.
     * 					
     * 
     */
    EE("EE"),

    /**
     * 
     * 						Ethiopia.
     * 					
     * 
     */
    ET("ET"),

    /**
     * 
     * 						Falkland Islands (Malvinas).
     * 					
     * 
     */
    FK("FK"),

    /**
     * 
     * 						Faroe Islands.
     * 					
     * 
     */
    FO("FO"),

    /**
     * 
     * 						Fiji.
     * 					
     * 
     */
    FJ("FJ"),

    /**
     * 
     * 						Finland.
     * 					
     * 
     */
    FI("FI"),

    /**
     * 
     * 						France.
     * 					
     * 
     */
    FR("FR"),

    /**
     * 
     * 						French Guiana.
     * 					
     * 
     */
    GF("GF"),

    /**
     * 
     * 						French Polynesia. Includes Tahiti.
     * 					
     * 
     */
    PF("PF"),

    /**
     * 
     * 						French Southern Territories.
     * 					
     * 
     */
    TF("TF"),

    /**
     * 
     * 						Gabon.
     * 					
     * 
     */
    GA("GA"),

    /**
     * 
     * 						Gambia.
     * 					
     * 
     */
    GM("GM"),

    /**
     * 
     * 						Georgia.
     * 					
     * 
     */
    GE("GE"),

    /**
     * 
     * 						Germany.
     * 					
     * 
     */
    DE("DE"),

    /**
     * 
     * 						Ghana.
     * 					
     * 
     */
    GH("GH"),

    /**
     * 
     * 						Gibraltar.
     * 					
     * 
     */
    GI("GI"),

    /**
     * 
     * 						Greece.
     * 					
     * 
     */
    GR("GR"),

    /**
     * 
     * 						Greenland.
     * 					
     * 
     */
    GL("GL"),

    /**
     * 
     * 						Grenada.
     * 					
     * 
     */
    GD("GD"),

    /**
     * 
     * 						Guadeloupe.
     * 					
     * 
     */
    GP("GP"),

    /**
     * 
     * 						Guam.
     * 					
     * 
     */
    GU("GU"),

    /**
     * 
     * 						Guatemala.
     * 					
     * 
     */
    GT("GT"),

    /**
     * 
     * 						Guinea.
     * 					
     * 
     */
    GN("GN"),

    /**
     * 
     * 						Guinea-Bissau.
     * 					
     * 
     */
    GW("GW"),

    /**
     * 
     * 						Guyana.
     * 					
     * 
     */
    GY("GY"),

    /**
     * 
     * 						Haiti.
     * 					
     * 
     */
    HT("HT"),

    /**
     * 
     * 						Heard Island and McDonald Islands.
     * 					
     * 
     */
    HM("HM"),

    /**
     * 
     * 						Holy See (Vatican City state).
     * 					
     * 
     */
    VA("VA"),

    /**
     * 
     * 						Honduras.
     * 					
     * 
     */
    HN("HN"),

    /**
     * 
     * 						Hong Kong.
     * 					
     * 
     */
    HK("HK"),

    /**
     * 
     * 						Hungary.
     * 					
     * 
     */
    HU("HU"),

    /**
     * 
     * 						Iceland.
     * 					
     * 
     */
    IS("IS"),

    /**
     * 
     * 						India.
     * 					
     * 
     */
    IN("IN"),

    /**
     * 
     * 						Indonesia.
     * 					
     * 
     */
    ID("ID"),

    /**
     * 
     * 						Islamic Republic of Iran.
     * 					
     * 
     */
    IR("IR"),

    /**
     * 
     * 						Iraq.
     * 					
     * 
     */
    IQ("IQ"),

    /**
     * 
     * 						Ireland.
     * 					
     * 
     */
    IE("IE"),

    /**
     * 
     * 						Israel.
     * 					
     * 
     */
    IL("IL"),

    /**
     * 
     * 						Italy.
     * 					
     * 
     */
    IT("IT"),

    /**
     * 
     * 						Jamaica.
     * 					
     * 
     */
    JM("JM"),

    /**
     * 
     * 						Japan.
     * 					
     * 
     */
    JP("JP"),

    /**
     * 
     * 						Jordan.
     * 					
     * 
     */
    JO("JO"),

    /**
     * 
     * 						Kazakhstan.
     * 					
     * 
     */
    KZ("KZ"),

    /**
     * 
     * 						Kenya.
     * 					
     * 
     */
    KE("KE"),

    /**
     * 
     * 						Kiribati.
     * 					
     * 
     */
    KI("KI"),

    /**
     * 
     * 						Democratic People's Republic of Korea.
     * 					
     * 
     */
    KP("KP"),

    /**
     * 
     * 						Republic of Korea.
     * 					
     * 
     */
    KR("KR"),

    /**
     * 
     * 						Kuwait.
     * 					
     * 
     */
    KW("KW"),

    /**
     * 
     * 						Kyrgyzstan.
     * 					
     * 
     */
    KG("KG"),

    /**
     * 
     * 						Lao People's Democratic Republic.
     * 					
     * 
     */
    LA("LA"),

    /**
     * 
     * 						Latvia.
     * 					
     * 
     */
    LV("LV"),

    /**
     * 
     * 						Lebanon.
     * 					
     * 
     */
    LB("LB"),

    /**
     * 
     * 						Lesotho.
     * 					
     * 
     */
    LS("LS"),

    /**
     * 
     * 						Liberia.
     * 					
     * 
     */
    LR("LR"),

    /**
     * 
     * 						Libyan Arab Jamahiriya.
     * 					
     * 
     */
    LY("LY"),

    /**
     * 
     * 						Liechtenstein.
     * 					
     * 
     */
    LI("LI"),

    /**
     * 
     * 						Lithuania.
     * 					
     * 
     */
    LT("LT"),

    /**
     * 
     * 						Luxembourg.
     * 					
     * 
     */
    LU("LU"),

    /**
     * 
     * 						Macao.
     * 					
     * 
     */
    MO("MO"),

    /**
     * 
     * 						The Former Yugoslav Republic of Macedonia.
     * 					
     * 
     */
    MK("MK"),

    /**
     * 
     * 						Madagascar.
     * 					
     * 
     */
    MG("MG"),

    /**
     * 
     * 						Malawi.
     * 					
     * 
     */
    MW("MW"),

    /**
     * 
     * 						Malaysia.
     * 					
     * 
     */
    MY("MY"),

    /**
     * 
     * 						Maldives.
     * 					
     * 
     */
    MV("MV"),

    /**
     * 
     * 						Mali.
     * 					
     * 
     */
    ML("ML"),

    /**
     * 
     * 						Malta.
     * 					
     * 
     */
    MT("MT"),

    /**
     * 
     * 						Marshall Islands.
     * 					
     * 
     */
    MH("MH"),

    /**
     * 
     * 						Martinique.
     * 					
     * 
     */
    MQ("MQ"),

    /**
     * 
     * 						Mauritania.
     * 					
     * 
     */
    MR("MR"),

    /**
     * 
     * 						Mauritius.
     * 					
     * 
     */
    MU("MU"),

    /**
     * 
     * 						Mayotte.
     * 					
     * 
     */
    YT("YT"),

    /**
     * 
     * 						Mexico.
     * 					
     * 
     */
    MX("MX"),

    /**
     * 
     * 						Federated States of Micronesia.
     * 					
     * 
     */
    FM("FM"),

    /**
     * 
     * 						Republic of Moldova.
     * 					
     * 
     */
    MD("MD"),

    /**
     * 
     * 						Monaco.
     * 					
     * 
     */
    MC("MC"),

    /**
     * 
     * 						Mongolia.
     * 					
     * 
     */
    MN("MN"),

    /**
     * 
     * 						Montserrat.
     * 					
     * 
     */
    MS("MS"),

    /**
     * 
     * 						Morocco.
     * 					
     * 
     */
    MA("MA"),

    /**
     * 
     * 						Mozambique.
     * 					
     * 
     */
    MZ("MZ"),

    /**
     * 
     * 						Myanmar.
     * 					
     * 
     */
    MM("MM"),

    /**
     * 
     * 						Namibia.
     * 					
     * 
     */
    NA("NA"),

    /**
     * 
     * 						Nauru.
     * 					
     * 
     */
    NR("NR"),

    /**
     * 
     * 						Nepal.
     * 					
     * 
     */
    NP("NP"),

    /**
     * 
     * 						Netherlands.
     * 					
     * 
     */
    NL("NL"),

    /**
     * 
     * 						Netherlands Antilles.
     * 					
     * 
     */
    AN("AN"),

    /**
     * 
     * 						New Caledonia.
     * 					
     * 
     */
    NC("NC"),

    /**
     * 
     * 						New Zealand.
     * 					
     * 
     */
    NZ("NZ"),

    /**
     * 
     * 						Nicaragua.
     * 					
     * 
     */
    NI("NI"),

    /**
     * 
     * 						Niger.
     * 					
     * 
     */
    NE("NE"),

    /**
     * 
     * 						Nigeria.
     * 					
     * 
     */
    NG("NG"),

    /**
     * 
     * 						Niue.
     * 					
     * 
     */
    NU("NU"),

    /**
     * 
     * 						Norfolk Island.
     * 					
     * 
     */
    NF("NF"),

    /**
     * 
     * 						Northern Mariana Islands.
     * 					
     * 
     */
    MP("MP"),

    /**
     * 
     * 						Norway.
     * 					
     * 
     */
    NO("NO"),

    /**
     * 
     * 						Oman.
     * 					
     * 
     */
    OM("OM"),

    /**
     * 
     * 						Pakistan.
     * 					
     * 
     */
    PK("PK"),

    /**
     * 
     * 						Palau.
     * 					
     * 
     */
    PW("PW"),

    /**
     * 
     * 						Palestinian territory, Occupied.
     * 					
     * 
     */
    PS("PS"),

    /**
     * 
     * 						Panama.
     * 					
     * 
     */
    PA("PA"),

    /**
     * 
     * 						Papua New Guinea.
     * 					
     * 
     */
    PG("PG"),

    /**
     * 
     * 						Paraguay.
     * 					
     * 
     */
    PY("PY"),

    /**
     * 
     * 						Peru.
     * 					
     * 
     */
    PE("PE"),

    /**
     * 
     * 						Philippines.
     * 					
     * 
     */
    PH("PH"),

    /**
     * 
     * 						Pitcairn.
     * 					
     * 
     */
    PN("PN"),

    /**
     * 
     * 						Poland.
     * 					
     * 
     */
    PL("PL"),

    /**
     * 
     * 						Portugal.
     * 					
     * 
     */
    PT("PT"),

    /**
     * 
     * 						Puerto Rico.
     * 					
     * 
     */
    PR("PR"),

    /**
     * 
     * 						Qatar.
     * 					
     * 
     */
    QA("QA"),

    /**
     * 
     * 						Reunion.
     * 					
     * 
     */
    RE("RE"),

    /**
     * 
     * 						Romania.
     * 					
     * 
     */
    RO("RO"),

    /**
     * 
     * 						Russian Federation.
     * 					
     * 
     */
    RU("RU"),

    /**
     * 
     * 						Rwanda.
     * 					
     * 
     */
    RW("RW"),

    /**
     * 
     * 						Saint Helena.
     * 					
     * 
     */
    SH("SH"),

    /**
     * 
     * 						Saint Kitts and Nevis.
     * 					
     * 
     */
    KN("KN"),

    /**
     * 
     * 						Saint Lucia.
     * 					
     * 
     */
    LC("LC"),

    /**
     * 
     * 						Saint Pierre and Miquelon.
     * 					
     * 
     */
    PM("PM"),

    /**
     * 
     * 						Saint Vincent and the Grenadines.
     * 					
     * 
     */
    VC("VC"),

    /**
     * 
     * 						Samoa.
     * 					
     * 
     */
    WS("WS"),

    /**
     * 
     * 						San Marino.
     * 					
     * 
     */
    SM("SM"),

    /**
     * 
     * 						Sao Tome and Principe.
     * 					
     * 
     */
    ST("ST"),

    /**
     * 
     * 						Saudi Arabia.
     * 					
     * 
     */
    SA("SA"),

    /**
     * 
     * 						Senegal.
     * 					
     * 
     */
    SN("SN"),

    /**
     * 
     * 						Seychelles.
     * 					
     * 
     */
    SC("SC"),

    /**
     * 
     * 						Sierra Leone.
     * 					
     * 
     */
    SL("SL"),

    /**
     * 
     * 						Singapore.
     * 					
     * 
     */
    SG("SG"),

    /**
     * 
     * 						Slovakia.
     * 					
     * 
     */
    SK("SK"),

    /**
     * 
     * 						Slovenia.
     * 					
     * 
     */
    SI("SI"),

    /**
     * 
     * 						Solomon Islands.
     * 					
     * 
     */
    SB("SB"),

    /**
     * 
     * 						Somalia.
     * 					
     * 
     */
    SO("SO"),

    /**
     * 
     * 						South Africa.
     * 					
     * 
     */
    ZA("ZA"),

    /**
     * 
     * 						South Georgia and the South Sandwich Islands.
     * 					
     * 
     */
    GS("GS"),

    /**
     * 
     * 						Spain.
     * 					
     * 
     */
    ES("ES"),

    /**
     * 
     * 						Sri Lanka.
     * 					
     * 
     */
    LK("LK"),

    /**
     * 
     * 						Sudan.
     * 					
     * 
     */
    SD("SD"),

    /**
     * 
     * 						Suriname.
     * 					
     * 
     */
    SR("SR"),

    /**
     * 
     * 						Svalbard and Jan Mayen.
     * 					
     * 
     */
    SJ("SJ"),

    /**
     * 
     * 						Swaziland.
     * 					
     * 
     */
    SZ("SZ"),

    /**
     * 
     * 						Sweden.
     * 					
     * 
     */
    SE("SE"),

    /**
     * 
     * 						Switzerland.
     * 					
     * 
     */
    CH("CH"),

    /**
     * 
     * 						Syrian Arab Republic.
     * 					
     * 
     */
    SY("SY"),

    /**
     * 
     * 						Taiwan, Province of China.
     * 					
     * 
     */
    TW("TW"),

    /**
     * 
     * 						Tajikistan.
     * 					
     * 
     */
    TJ("TJ"),

    /**
     * 
     * 						Tanzania, United Republic of.
     * 					
     * 
     */
    TZ("TZ"),

    /**
     * 
     * 						Thailand.
     * 					
     * 
     */
    TH("TH"),

    /**
     * 
     * 						Togo.
     * 					
     * 
     */
    TG("TG"),

    /**
     * 
     * 						Tokelau.
     * 					
     * 
     */
    TK("TK"),

    /**
     * 
     * 						Tonga.
     * 					
     * 
     */
    TO("TO"),

    /**
     * 
     * 						Trinidad and Tobago.
     * 					
     * 
     */
    TT("TT"),

    /**
     * 
     * 						Tunisia.
     * 					
     * 
     */
    TN("TN"),

    /**
     * 
     * 						Turkey.
     * 					
     * 
     */
    TR("TR"),

    /**
     * 
     * 						Turkmenistan.
     * 					
     * 
     */
    TM("TM"),

    /**
     * 
     * 						Turks and Caicos Islands.
     * 					
     * 
     */
    TC("TC"),

    /**
     * 
     * 						Tuvalu.
     * 					
     * 
     */
    TV("TV"),

    /**
     * 
     * 						Uganda.
     * 					
     * 
     */
    UG("UG"),

    /**
     * 
     * 						Ukraine.
     * 					
     * 
     */
    UA("UA"),

    /**
     * 
     * 						United Arab Emirates.
     * 					
     * 
     */
    AE("AE"),

    /**
     * 
     * 						United Kingdom.
     * 					
     * 
     */
    GB("GB"),

    /**
     * 
     * 						United States.
     * 					
     * 
     */
    US("US"),

    /**
     * 
     * 						NOTE: United States Minor Outlying Islands was
     * 						defined in the eBay list previously
     * 						but is no longer a viable option. This country
     * 						will remain on eBay country list for backward
     * 						compatibility. Use 'US' instead.
     * 					
     * 
     */
    UM("UM"),

    /**
     * 
     * 						Uruguay.
     * 					
     * 
     */
    UY("UY"),

    /**
     * 
     * 						Uzbekistan.
     * 					
     * 
     */
    UZ("UZ"),

    /**
     * 
     * 						Vanuatu.
     * 					
     * 
     */
    VU("VU"),

    /**
     * 
     * 						Venezuela.
     * 					
     * 
     */
    VE("VE"),

    /**
     * 
     * 						Vietnam.
     * 					
     * 
     */
    VN("VN"),

    /**
     * 
     * 						Virgin Islands, British.
     * 					
     * 
     */
    VG("VG"),

    /**
     * 
     * 						Virgin Islands, U.S.
     * 					
     * 
     */
    VI("VI"),

    /**
     * 
     * 						Wallis and Futuna.
     * 					
     * 
     */
    WF("WF"),

    /**
     * 
     * 						Western Sahara.
     * 					
     * 
     */
    EH("EH"),

    /**
     * 
     * 						Yemen.
     * 					
     * 
     */
    YE("YE"),

    /**
     * 
     * 						No longer in use. See RS for Serbia and ME for Montenegro.
     * 					
     * 
     */
    YU("YU"),

    /**
     * 
     * 						Zambia.
     * 					
     * 
     */
    ZM("ZM"),

    /**
     * 
     * 						Zimbabwe.
     * 					
     * 
     */
    ZW("ZW"),

    /**
     * 
     * 						NOTE: APO/FPO was defined in eBay list previously
     * 						but they are not defined in ISO 3166. This country
     * 						will remain on eBay country code list for backward
     * 						compatibility.
     * 					
     * 
     */
    AA("AA"),

    /**
     * 
     * 						NOTE	: Guernsey was defined in eBay list previously
     * 						but they are not defined in ISO 3166. This country
     * 						will remain on eBay country list for backward
     * 						compatibility.
     * 					
     * 
     */
    QM("QM"),

    /**
     * 
     * 						NOTE: Jan Mayen was defined in eBay list previously
     * 						but they are not defined in ISO 3166. This country
     * 						will remain on eBay country list for backward
     * 						compatibility.
     * 					
     * 
     */
    QN("QN"),

    /**
     * 
     * 						NOTE: Jersey was defined in eBay list previously
     * 						but they are not defined in ISO 3166. This country
     * 						will remain on eBay country list for backward
     * 						compatibility.
     * 					
     * 
     */
    QO("QO"),
    QP("QP"),

    /**
     * 
     * 						Jersey
     * 					
     * 
     */
    JE("JE"),

    /**
     * 
     * 						Guernsey
     * 					
     * 
     */
    GG("GG"),

    /**
     * 
     * 						Unknown country
     * 					
     * 
     */
    ZZ("ZZ"),

    /**
     * 
     * 						Serbia
     * 					
     * 
     */
    RS("RS"),

    /**
     * 
     * 						Montenegro.
     * 					
     * 
     */
    ME("ME"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CountryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CountryCodeType fromValue(String v) {
        for (CountryCodeType c: CountryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
