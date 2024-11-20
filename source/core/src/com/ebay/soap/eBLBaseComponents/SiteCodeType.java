
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="Canada"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="Australia"/>
 *     &lt;enumeration value="Austria"/>
 *     &lt;enumeration value="Belgium_French"/>
 *     &lt;enumeration value="France"/>
 *     &lt;enumeration value="Germany"/>
 *     &lt;enumeration value="Italy"/>
 *     &lt;enumeration value="Belgium_Dutch"/>
 *     &lt;enumeration value="Netherlands"/>
 *     &lt;enumeration value="Spain"/>
 *     &lt;enumeration value="Switzerland"/>
 *     &lt;enumeration value="Taiwan"/>
 *     &lt;enumeration value="eBayMotors"/>
 *     &lt;enumeration value="HongKong"/>
 *     &lt;enumeration value="Singapore"/>
 *     &lt;enumeration value="India"/>
 *     &lt;enumeration value="China"/>
 *     &lt;enumeration value="Ireland"/>
 *     &lt;enumeration value="Malaysia"/>
 *     &lt;enumeration value="Philippines"/>
 *     &lt;enumeration value="Poland"/>
 *     &lt;enumeration value="Sweden"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="CanadaFrench"/>
 *     &lt;enumeration value="Russia"/>
 *     &lt;enumeration value="Czechia"/>
 *     &lt;enumeration value="Cyprus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SiteCodeType")
@XmlEnum
public enum SiteCodeType {


    /**
     * 
     * 						USA, site ID 0, abbreviation US, currency USD.
     * 						<br/>(<a href="http://www.ebay.com" target="_blank">http://www.ebay.com</a>)
     * 					
     * 
     */
    US("US"),

    /**
     * 
     * 						Canada, site ID 2, abbreviation CA, currencies CAD and USD.
     * 						<br/>(<a href="http://www.ebay.ca" target="_blank">http://www.ebay.ca</a>)
     * 					
     * 
     */
    @XmlEnumValue("Canada")
    CANADA("Canada"),

    /**
     * 
     * 						United Kingdom, site ID 3, abbreviation UK, currency GBP.
     * 						<br/>(<a href="http://www.ebay.co.uk" target="_blank">http://www.ebay.co.uk</a>)
     * 					
     * 
     */
    UK("UK"),

    /**
     * 
     * 						Australia, site ID 15, abbreviation AU, currency AUD.
     * 						<br/>(<a href="http://www.ebay.com.au" target="_blank">http://www.ebay.com.au</a>)
     * 					
     * 
     */
    @XmlEnumValue("Australia")
    AUSTRALIA("Australia"),

    /**
     * 
     * 						Austria, site ID 16, abbreviation AT, currency EUR.
     * 						<br/>(<a href="http://www.ebay.at" target="_blank">http://www.ebay.at</a>)
     * 					
     * 
     */
    @XmlEnumValue("Austria")
    AUSTRIA("Austria"),

    /**
     * 
     * 						Belgium (French), site ID 23, abbreviation BEFR, currency EUR.
     * 						<br/>(<a href="http://www.ebay.be" target="_blank">http://www.ebay.be</a>)
     * 					
     * 
     */
    @XmlEnumValue("Belgium_French")
    BELGIUM_FRENCH("Belgium_French"),

    /**
     * 
     * 						France, site ID 71, abbreviation FR, currency EUR.
     * 						<br/>(<a href="http://www.ebay.fr" target="_blank">http://www.ebay.fr</a>)
     * 					
     * 
     */
    @XmlEnumValue("France")
    FRANCE("France"),

    /**
     * 
     * 						Germany, site ID 77, abbreviation DE, currency EUR.
     * 						<br/>(<a href="http://www.ebay.de" target="_blank">http://www.ebay.de</a>)
     * 					
     * 
     */
    @XmlEnumValue("Germany")
    GERMANY("Germany"),

    /**
     * 
     * 						Italy, site ID 101, abbreviation IT, currency EUR.
     * 						<br/>(<a href="http://www.ebay.it" target="_blank">http://www.ebay.it</a>)
     * 					
     * 
     */
    @XmlEnumValue("Italy")
    ITALY("Italy"),

    /**
     * 
     * 						Belgium (Dutch), site ID 123, abbreviation BENL, currency EUR.
     * 						<br/>(<a href="http://www.ebay.be" target="_blank">http://www.ebay.be</a>)
     * 					
     * 
     */
    @XmlEnumValue("Belgium_Dutch")
    BELGIUM_DUTCH("Belgium_Dutch"),

    /**
     * 
     * 						Netherlands, site ID 146, abbreviation NL, currency EUR.
     * 						<br/>(<a href="http://www.ebay.nl" target="_blank">http://www.ebay.nl</a>)
     * 					
     * 
     */
    @XmlEnumValue("Netherlands")
    NETHERLANDS("Netherlands"),

    /**
     * 
     * 						Spain, site ID 186, abbreviation ES, currency EUR.
     * 						<br/>(<a href="http://www.ebay.es" target="_blank">http://www.ebay.es</a>)
     * 					
     * 
     */
    @XmlEnumValue("Spain")
    SPAIN("Spain"),

    /**
     * 
     * 						Switzerland, site ID 193, abbreviation CH, currency CHF.
     * 						<br/>(<a href="http://www.ebay.ch" target="_blank">http://www.ebay.ch</a>)
     * 					
     * 
     */
    @XmlEnumValue("Switzerland")
    SWITZERLAND("Switzerland"),

    /**
     * 
     * 						Taiwan, currency TWD. Note that the old eBay Taiwan site is no longer in operation, and the new site does not use this API.
     * 					
     * 
     */
    @XmlEnumValue("Taiwan")
    TAIWAN("Taiwan"),

    /**
     * 
     * 						Although Site ID 100 is still valid in APIs, eBay Motors US is no longer its own site, but just a vertical within the eBay US site.
     * 					
     * 
     */
    @XmlEnumValue("eBayMotors")
    E_BAY_MOTORS("eBayMotors"),

    /**
     * 
     * 						Hong Kong, site ID 201, abbreviation HK, currency HKD.
     * 						<br/>(<a href="http://www.ebay.com.hk" target="_blank">http://www.ebay.com.hk</a>)
     * 					
     * 
     */
    @XmlEnumValue("HongKong")
    HONG_KONG("HongKong"),

    /**
     * 
     * 						Singapore, site ID 216, abbreviation SG, currency SGD.
     * 						<br/>(<a href="http://www.ebay.com.sg" target="_blank">http://www.ebay.com.sg</a>)
     * 					
     * 
     */
    @XmlEnumValue("Singapore")
    SINGAPORE("Singapore"),

    /**
     * 
     * 						India, site ID 203, abbreviation IN, currency INR.
     * 						<br/>(<a href="http://www.ebay.in" target="_blank">http://www.ebay.in</a>)
     * 					
     * 
     */
    @XmlEnumValue("India")
    INDIA("India"),
    @XmlEnumValue("China")
    CHINA("China"),

    /**
     * 
     * 						Ireland, site ID 205, abbreviation IE, currency EUR.
     * 						<br/>(<a href="http://www.ebay.ie" target="_blank">http://www.ebay.ie</a>)
     * 					
     * 
     */
    @XmlEnumValue("Ireland")
    IRELAND("Ireland"),

    /**
     * 
     * 						Malaysia, site ID 207, abbreviation MY, currency MYR.
     * 						<br/>(<a href="http://www.ebay.com.my" target="_blank">http://www.ebay.com.my</a>)
     * 					
     * 
     */
    @XmlEnumValue("Malaysia")
    MALAYSIA("Malaysia"),

    /**
     * 
     * 						Philippines, site ID 211, abbreviation PH, currency PHP.
     * 						<br/>(<a href="http://www.ebay.ph" target="_blank">http://www.ebay.ph</a>)
     * 					
     * 
     */
    @XmlEnumValue("Philippines")
    PHILIPPINES("Philippines"),

    /**
     * 
     * 						Poland, site ID 212, abbreviation PL, currency PLN.
     * 						<br/>(<a href="http://www.ebay.pl" target="_blank">http://www.ebay.pl</a>)
     * 					
     * 
     */
    @XmlEnumValue("Poland")
    POLAND("Poland"),
    @XmlEnumValue("Sweden")
    SWEDEN("Sweden"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						Canada French, site ID 210, abbreviation CAFR, currencies CAD and USD.
     * 					
     * 
     */
    @XmlEnumValue("CanadaFrench")
    CANADA_FRENCH("CanadaFrench"),

    /**
     * 
     * 						Russia, site ID 215, abbreviation RU, currency RUB. Sellers must use Merchant Integration Platform (MIP) to create and revise listings on the Russia site. Russian listings cannot be created or revised through the Trading API's add and revise calls, so 'Russia' would not be a valid value to pass in through <b>Item.Site</b> field of an Add or Revise Trading API call.
     * 					
     * 
     */
    @XmlEnumValue("Russia")
    RUSSIA("Russia"),

    /**
     * 
     * 						Czechia, site ID 197, abbreviation CZ, currency CZK. This site cannot be set in the <b>X-EBAY-API-SITEID header</b>, nor in the <b>Site</b> field of a request payload. This enumeration value will only be returned in output fields if applicable.
     * 					
     * 
     */
    @XmlEnumValue("Czechia")
    CZECHIA("Czechia"),

    /**
     * 
     * 						Cyprus, abbreviation CY, currency CYP. This site cannot be set in the <b>X-EBAY-API-SITEID header</b>, nor in the <b>Site</b> field of a request payload. This enumeration value will only be returned in output fields if applicable.
     * 					
     * 
     */
    @XmlEnumValue("Cyprus")
    CYPRUS("Cyprus");
    private final String value;

    SiteCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteCodeType fromValue(String v) {
        for (SiteCodeType c: SiteCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
