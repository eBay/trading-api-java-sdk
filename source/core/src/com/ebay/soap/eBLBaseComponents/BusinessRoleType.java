
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessRoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Shopper"/>
 *     &lt;enumeration value="FullMarketPlaceParticipant"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessRoleType")
@XmlEnum
public enum BusinessRoleType {


    /**
     * 
     * 						This value indicates that the eBay user's account is a Partially Provisioned Account
     * 						without buying and selling privileges on eBay.
     * 					
     * 
     */
    @XmlEnumValue("Shopper")
    SHOPPER("Shopper"),

    /**
     * 
     * 						This value indicates that the eBay user's account is a fully provisioned account with buying
     * 						and selling privileges on eBay.
     * 					
     * 
     */
    @XmlEnumValue("FullMarketPlaceParticipant")
    FULL_MARKET_PLACE_PARTICIPANT("FullMarketPlaceParticipant");
    private final String value;

    BusinessRoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessRoleType fromValue(String v) {
        for (BusinessRoleType c: BusinessRoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
