
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetUserNotesActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetUserNotesActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AddOrUpdate"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SetUserNotesActionCodeType")
@XmlEnum
public enum SetUserNotesActionCodeType {


    /**
     * 
     * 						Creates or replaces an item's My eBay notes. Note that if
     * 						the specified item already has notes in My eBay, the new
     * 						notes will completely replace the existing notes. They will
     * 						not be appended.
     * 					
     * 
     */
    @XmlEnumValue("AddOrUpdate")
    ADD_OR_UPDATE("AddOrUpdate"),

    /**
     * 
     * 						Deletes any existing My eBay notes for the specified item.
     * 						Specifying Delete when no notes exist does nothing, but does
     * 						not return an error.
     * 					
     * 
     */
    @XmlEnumValue("Delete")
    DELETE("Delete"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SetUserNotesActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetUserNotesActionCodeType fromValue(String v) {
        for (SetUserNotesActionCodeType c: SetUserNotesActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
