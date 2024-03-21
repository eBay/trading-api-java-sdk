
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureManagerPictureDisplayTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureManagerPictureDisplayTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Thumbnail"/>
 *     &lt;enumeration value="BIBO"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Large"/>
 *     &lt;enumeration value="Supersize"/>
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PictureManagerPictureDisplayTypeCodeType")
@XmlEnum
public enum PictureManagerPictureDisplayTypeCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Thumbnail")
    THUMBNAIL("Thumbnail"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    BIBO("BIBO"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Large")
    LARGE("Large"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Supersize")
    SUPERSIZE("Supersize"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Original")
    ORIGINAL("Original"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PictureManagerPictureDisplayTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureManagerPictureDisplayTypeCodeType fromValue(String v) {
        for (PictureManagerPictureDisplayTypeCodeType c: PictureManagerPictureDisplayTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
