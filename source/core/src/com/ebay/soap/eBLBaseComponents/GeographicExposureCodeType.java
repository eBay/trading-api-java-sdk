
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicExposureCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeographicExposureCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="National"/>
 *     &lt;enumeration value="LocalOnly"/>
 *     &lt;enumeration value="LocalOptional"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "GeographicExposureCodeType")
@XmlEnum
public enum GeographicExposureCodeType {


    /**
     * 
     * 						If this enumeration value is returned, the eBay site or category only supports Motors National Listings for the corresponding Motors dealer subscription level/type.
     * 					
     * 
     */
    @XmlEnumValue("National")
    NATIONAL("National"),

    /**
     * 
     * 						If this enumeration value is returned, the eBay site or category only supports Motors Local Market Listings for the corresponding Motors dealer subscription level/type.
     * 					
     * 
     */
    @XmlEnumValue("LocalOnly")
    LOCAL_ONLY("LocalOnly"),

    /**
     * 
     * 						If this enumeration value is returned, the eBay site or category supports Motors National Listings and Motors Local Market listing for the corresponding Motors dealer subscription level/type.
     * 					
     * 
     */
    @XmlEnumValue("LocalOptional")
    LOCAL_OPTIONAL("LocalOptional"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    GeographicExposureCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeographicExposureCodeType fromValue(String v) {
        for (GeographicExposureCodeType c: GeographicExposureCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
