
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoreCategoryUpdateActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StoreCategoryUpdateActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Move"/>
 *     &lt;enumeration value="Rename"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "StoreCategoryUpdateActionCodeType")
@XmlEnum
public enum StoreCategoryUpdateActionCodeType {


    /**
     * 
     * 						(in) Add the listed categories to the store.
     * 					
     * 
     */
    @XmlEnumValue("Add")
    ADD("Add"),

    /**
     * 
     * 						(in) Delete the listed categories from the store.
     * 					
     * 
     */
    @XmlEnumValue("Delete")
    DELETE("Delete"),

    /**
     * 
     * 						(in) Move the listed categories from one place in the store category
     * 						structure to another.
     * 					
     * 
     */
    @XmlEnumValue("Move")
    MOVE("Move"),

    /**
     * 
     * 						(in) Rename the listed store categories to the names provided.
     * 					
     * 
     */
    @XmlEnumValue("Rename")
    RENAME("Rename"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    StoreCategoryUpdateActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreCategoryUpdateActionCodeType fromValue(String v) {
        for (StoreCategoryUpdateActionCodeType c: StoreCategoryUpdateActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
