
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WirelessCarrierIDCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WirelessCarrierIDCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Cingular"/>
 *     &lt;enumeration value="TMobile"/>
 *     &lt;enumeration value="Sprint"/>
 *     &lt;enumeration value="Nextel"/>
 *     &lt;enumeration value="Verizon"/>
 *     &lt;enumeration value="CincinnatiBell"/>
 *     &lt;enumeration value="Dobson"/>
 *     &lt;enumeration value="Alltel"/>
 *     &lt;enumeration value="Leap"/>
 *     &lt;enumeration value="USCellular"/>
 *     &lt;enumeration value="Movistar"/>
 *     &lt;enumeration value="Amena"/>
 *     &lt;enumeration value="Vodafone"/>
 *     &lt;enumeration value="ATT"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "WirelessCarrierIDCodeType")
@XmlEnum
public enum WirelessCarrierIDCodeType {


    /**
     * 
     * 						This value is no longer applicable, as Cingular is no longer in existence.
     * 					
     * 
     */
    @XmlEnumValue("Cingular")
    CINGULAR("Cingular"),

    /**
     * 
     * 						This value indicates that T-Mobile is providing SMS messages for the Platform Notifications subscriber.
     * 					
     * 
     */
    @XmlEnumValue("TMobile")
    T_MOBILE("TMobile"),

    /**
     * 
     * 						This value indicates that Sprint is providing SMS messages for the Platform Notifications subscriber.
     * 					
     * 
     */
    @XmlEnumValue("Sprint")
    SPRINT("Sprint"),

    /**
     * 
     * 						This value is no longer applicable, as Nextel was purchased by Sprint.
     * 					
     * 
     */
    @XmlEnumValue("Nextel")
    NEXTEL("Nextel"),

    /**
     * 
     * 						This value indicates that Verizon is providing SMS messages for the Platform Notifications subscriber.
     * 					
     * 
     */
    @XmlEnumValue("Verizon")
    VERIZON("Verizon"),

    /**
     * 
     * 						This value indicates that Cincinnati Bell is providing SMS messages for the Platform Notifications subscriber.
     * 					
     * 
     */
    @XmlEnumValue("CincinnatiBell")
    CINCINNATI_BELL("CincinnatiBell"),

    /**
     * 
     * 						This value is no longer applicable, as Dobson is no longer in existence.
     * 					
     * 
     */
    @XmlEnumValue("Dobson")
    DOBSON("Dobson"),

    /**
     * 
     * 						This value is no longer applicable, as Alltel is no longer in existence.
     * 					
     * 
     */
    @XmlEnumValue("Alltel")
    ALLTEL("Alltel"),

    /**
     * 
     * 						This value is no longer applicable, as Leap is no longer in existence.
     * 					
     * 
     */
    @XmlEnumValue("Leap")
    LEAP("Leap"),

    /**
     * 
     * 						This value indicates that US Cellular is providing SMS messages for the Platform Notifications subscriber.
     * 					
     * 
     */
    @XmlEnumValue("USCellular")
    US_CELLULAR("USCellular"),

    /**
     * 
     * 						This value indicates that Movistar is providing SMS messages for the Platform Notifications subscriber.
     * 					
     * 
     */
    @XmlEnumValue("Movistar")
    MOVISTAR("Movistar"),

    /**
     * 
     * 						This value is no longer applicable, as Amena is no longer in existence.
     * 					
     * 
     */
    @XmlEnumValue("Amena")
    AMENA("Amena"),

    /**
     * 
     * 						This value indicates that Vodafone is providing SMS messages for the Platform Notifications subscriber.
     * 					
     * 
     */
    @XmlEnumValue("Vodafone")
    VODAFONE("Vodafone"),

    /**
     * 
     * 						This value indicates that AT&T is providing SMS messages for the Platform Notifications subscriber.
     * 					
     * 
     */
    ATT("ATT"),

    /**
     * 
     * 						This value is reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    WirelessCarrierIDCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WirelessCarrierIDCodeType fromValue(String v) {
        for (WirelessCarrierIDCodeType c: WirelessCarrierIDCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
