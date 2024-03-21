
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Domestic"/>
 *     &lt;enumeration value="International"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingServiceType")
@XmlEnum
public enum ShippingServiceType {


    /**
     * 
     * 						This value should be used if the seller is overriding shipping costs for all domestic shipping services defined in the Business Policies shipping profile. 
     * 					
     * 
     */
    @XmlEnumValue("Domestic")
    DOMESTIC("Domestic"),

    /**
     * 
     * 						This value should be used if the seller is overriding shipping costs for all international shipping services defined in the Business Policies shipping profile. 
     * 					
     * 
     */
    @XmlEnumValue("International")
    INTERNATIONAL("International");
    private final String value;

    ShippingServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingServiceType fromValue(String v) {
        for (ShippingServiceType c: ShippingServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
