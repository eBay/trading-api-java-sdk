
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestockingFeeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestockingFeeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NoRestockingFee"/>
 *     &lt;enumeration value="Percent_10"/>
 *     &lt;enumeration value="Percent_15"/>
 *     &lt;enumeration value="Percent_20"/>
 *     &lt;enumeration value="Percent_25"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RestockingFeeCodeType")
@XmlEnum
public enum RestockingFeeCodeType {


    /**
     * 
     * 						This value indicates that the seller will not charge a restocking fee to the
     * 						buyer if the item is returned.
     * 					
     * 
     */
    @XmlEnumValue("NoRestockingFee")
    NO_RESTOCKING_FEE("NoRestockingFee"),

    /**
     * 
     * 						This value indicates that the seller charges the buyer a restocking fee of 10
     * 						percent of the item's purchase price if the item is returned.
     * 					
     * 
     */
    @XmlEnumValue("Percent_10")
    PERCENT_10("Percent_10"),

    /**
     * 
     * 						This value indicates that the seller charges the buyer a restocking fee of 15
     * 						percent of the item's purchase price if the item is returned.
     * 					
     * 
     */
    @XmlEnumValue("Percent_15")
    PERCENT_15("Percent_15"),

    /**
     * 
     * 						This value indicates that the seller charges the buyer a restocking fee of up to 20
     * 						percent of the item's purchase price if the item is returned.
     * 					
     * 
     */
    @XmlEnumValue("Percent_20")
    PERCENT_20("Percent_20"),

    /**
     * 
     * 						This is no longer a valid value.
     * 					
     * 
     */
    @XmlEnumValue("Percent_25")
    PERCENT_25("Percent_25"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RestockingFeeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestockingFeeCodeType fromValue(String v) {
        for (RestockingFeeCodeType c: RestockingFeeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
