
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCompatibilityEnabledCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCompatibilityEnabledCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="ByApplication"/>
 *     &lt;enumeration value="BySpecification"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemCompatibilityEnabledCodeType")
@XmlEnum
public enum ItemCompatibilityEnabledCodeType {


    /**
     * 
     * 						Parts Compatibility is not supported for the given category.
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						Parts Compatibility may be entered by application only for the given category.
     * 						Entering parts compatibility by application specifies the assemblies (e.g., a
     * 						specific year, make, and model of car) to which the item applies. Parts
     * 						compatibility by application can be specified by listing with a catalog
     * 						product that supports parts compatibility or by specifying parts compatibility
     * 						by application manually (<b> Item.ItemCompatibilityList</b>).
     * 					
     * 
     */
    @XmlEnumValue("ByApplication")
    BY_APPLICATION("ByApplication"),

    /**
     * 
     * 						Parts Compatibility may be entered by specification only for the given
     * 						category. Entering parts compatibility by specification involves specifying
     * 						the part's relevant dimensions or characteristics (e.g., Section Width, Aspect
     * 						Ratio, Rim Diammeter, Load Index, and Speed Rating values for a tire) using
     * 						attributes.
     * 					
     * 
     */
    @XmlEnumValue("BySpecification")
    BY_SPECIFICATION("BySpecification"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 				  
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemCompatibilityEnabledCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCompatibilityEnabledCodeType fromValue(String v) {
        for (ItemCompatibilityEnabledCodeType c: ItemCompatibilityEnabledCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
