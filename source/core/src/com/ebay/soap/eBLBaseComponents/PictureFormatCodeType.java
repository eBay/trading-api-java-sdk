
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureFormatCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureFormatCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="JPG"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PictureFormatCodeType")
@XmlEnum
public enum PictureFormatCodeType {


    /**
     * 
     * 						Indicates the picture was returned in JPG format. Uploaded pictures in JPG, TIF, or BMP will be returned as JPG.
     * 					
     * 
     */
    JPG("JPG"),

    /**
     * 
     * 						Indicates the picture was returned in GIF format.
     * 					
     * 
     */
    GIF("GIF"),

    /**
     * 
     * 						Indicates the picture was returned in PNG format.
     * 					
     * 
     */
    PNG("PNG"),

    /**
     * 
     * 						Reserved for internal use <b>only</b>.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PictureFormatCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureFormatCodeType fromValue(String v) {
        for (PictureFormatCodeType c: PictureFormatCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
