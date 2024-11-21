
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationDeviceTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationDeviceTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Browser"/>
 *     &lt;enumeration value="Wireless"/>
 *     &lt;enumeration value="Desktop"/>
 *     &lt;enumeration value="SetTopTVBox"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ApplicationDeviceTypeCodeType")
@XmlEnum
public enum ApplicationDeviceTypeCodeType {


    /**
     * 
     * 						This enumeration value indicates that the user's application is running in a browser.
     * 					
     * 
     */
    @XmlEnumValue("Browser")
    BROWSER("Browser"),

    /**
     * 
     * 						This enumeration value indicates that the user's application is a wireless application.
     * 					
     * 
     */
    @XmlEnumValue("Wireless")
    WIRELESS("Wireless"),

    /**
     * 
     * 						This enumeration value indicates that the user's application is a desktop application.
     * 					
     * 
     */
    @XmlEnumValue("Desktop")
    DESKTOP("Desktop"),

    /**
     * 
     * 						This enumeration value indicates that the user's application is running through a television set-top box.
     * 					
     * 
     */
    @XmlEnumValue("SetTopTVBox")
    SET_TOP_TV_BOX("SetTopTVBox"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ApplicationDeviceTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationDeviceTypeCodeType fromValue(String v) {
        for (ApplicationDeviceTypeCodeType c: ApplicationDeviceTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
