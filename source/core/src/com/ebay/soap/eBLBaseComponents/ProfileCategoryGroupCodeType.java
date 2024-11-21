
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileCategoryGroupCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProfileCategoryGroupCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Inherit"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="MOTORS_VEHICLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ProfileCategoryGroupCodeType")
@XmlEnum
public enum ProfileCategoryGroupCodeType {


    /**
     * 
     * 						Default value.
     * 					
     * 
     */
    @XmlEnumValue("Inherit")
    INHERIT("Inherit"),

    /**
     * 
     * 						None.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						For Business Policies, the 'ALL' enumeration value represents all eBay categories except for motor vehicles.
     * 					
     * 
     */
    ALL("ALL"),

    /**
     * 
     * 						For Business Policies, the 'MOTORS_VEHICLE' enumeration value represents all motor vehicle categories.
     * 				  
     * 
     */
    MOTORS_VEHICLE("MOTORS_VEHICLE");
    private final String value;

    ProfileCategoryGroupCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileCategoryGroupCodeType fromValue(String v) {
        for (ProfileCategoryGroupCodeType c: ProfileCategoryGroupCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
