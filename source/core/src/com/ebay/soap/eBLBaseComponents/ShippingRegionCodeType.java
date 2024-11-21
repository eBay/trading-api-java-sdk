
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingRegionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingRegionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Africa"/>
 *     &lt;enumeration value="Asia"/>
 *     &lt;enumeration value="Caribbean"/>
 *     &lt;enumeration value="Europe"/>
 *     &lt;enumeration value="LatinAmerica"/>
 *     &lt;enumeration value="MiddleEast"/>
 *     &lt;enumeration value="NorthAmerica"/>
 *     &lt;enumeration value="Oceania"/>
 *     &lt;enumeration value="SouthAmerica"/>
 *     &lt;enumeration value="EuropeanUnion"/>
 *     &lt;enumeration value="WillNotShip"/>
 *     &lt;enumeration value="Worldwide"/>
 *     &lt;enumeration value="Americas"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShippingRegionCodeType")
@XmlEnum
public enum ShippingRegionCodeType {


    /**
     * 
     * 						Africa
     * 					
     * 
     */
    @XmlEnumValue("Africa")
    AFRICA("Africa"),

    /**
     * 
     * 						Asia
     * 					
     * 
     */
    @XmlEnumValue("Asia")
    ASIA("Asia"),

    /**
     * 
     * 						Caribbean
     * 					
     * 
     */
    @XmlEnumValue("Caribbean")
    CARIBBEAN("Caribbean"),

    /**
     * 
     * 						Europe
     * 					
     * 
     */
    @XmlEnumValue("Europe")
    EUROPE("Europe"),

    /**
     * 
     * 						Latin America
     * 					
     * 
     */
    @XmlEnumValue("LatinAmerica")
    LATIN_AMERICA("LatinAmerica"),

    /**
     * 
     * 						Middle East
     * 					
     * 
     */
    @XmlEnumValue("MiddleEast")
    MIDDLE_EAST("MiddleEast"),

    /**
     * 
     * 						North America
     * 					
     * 
     */
    @XmlEnumValue("NorthAmerica")
    NORTH_AMERICA("NorthAmerica"),

    /**
     * 
     * 						Oceania (Pacific region other than Asia)
     * 					
     * 
     */
    @XmlEnumValue("Oceania")
    OCEANIA("Oceania"),

    /**
     * 
     * 						South America
     * 					
     * 
     */
    @XmlEnumValue("SouthAmerica")
    SOUTH_AMERICA("SouthAmerica"),

    /**
     * 
     * 						European Union
     * 					
     * 
     */
    @XmlEnumValue("EuropeanUnion")
    EUROPEAN_UNION("EuropeanUnion"),

    /**
     * 
     * 						Seller will not ship the item.
     * 					
     * 
     */
    @XmlEnumValue("WillNotShip")
    WILL_NOT_SHIP("WillNotShip"),

    /**
     * 
     * 						Seller has specified Worldwide or eBay has
     * 						determined that the specified regions add up to Worldwide.
     * 					
     * 
     */
    @XmlEnumValue("Worldwide")
    WORLDWIDE("Worldwide"),

    /**
     * 
     * 						Americas
     * 					
     * 
     */
    @XmlEnumValue("Americas")
    AMERICAS("Americas"),
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 					  Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingRegionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingRegionCodeType fromValue(String v) {
        for (ShippingRegionCodeType c: ShippingRegionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
