
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureUploadPolicyCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureUploadPolicyCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="ClearAndAdd"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PictureUploadPolicyCodeType")
@XmlEnum
public enum PictureUploadPolicyCodeType {


    /**
     * 
     * 						Specifies that an uploaded picture is added to the pictures available to a
     * 						seller on the eBay site.
     * 					
     * 
     */
    @XmlEnumValue("Add")
    ADD("Add"),

    /**
     * 
     * 						Specifies, first, that all pictures available to a seller on the eBay site are
     * 						removed, and then second, that the currently uploaded picture is made
     * 						available to the seller.
     * 					 
     * 
     */
    @XmlEnumValue("ClearAndAdd")
    CLEAR_AND_ADD("ClearAndAdd"),

    /**
     * 
     * 						 Reserved for internal use ONLY.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PictureUploadPolicyCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureUploadPolicyCodeType fromValue(String v) {
        for (PictureUploadPolicyCodeType c: PictureUploadPolicyCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
