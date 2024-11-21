
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PictureSetCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PictureSetCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Supersize"/>
 *     &lt;enumeration value="Large"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PictureSetCodeType")
@XmlEnum
public enum PictureSetCodeType {


    /**
     * 
     *             Indicates to generate the "Standard" set of images, which is a set of 7 images of various sizes, for each <b>ExternalPictureURL</b> submitted in the request.
     *             This is the default. <b>Note:</b> This field is used only for images that will be used in a listing.
     *           
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * 
     *             Indicates to generate the "Standard" set <i>plus</i> a super-sized image for each <b>ExternalPictureURL</b> submitted in the request.
     *             In order to include the super-sized image in the Add Item calls, you must also specify <b>Item.PictureDetails.PhotoDisplay.Supersize</b> or <b>Item.PictureDetails.PhotoDisplay.PicturePack</b>.
     *              <b>Note:</b> This field is used only for images that will be used in a listing.
     *           
     * 
     */
    @XmlEnumValue("Supersize")
    SUPERSIZE("Supersize"),

    /**
     * 
     *             This field is no longer returned.
     *           
     * 
     */
    @XmlEnumValue("Large")
    LARGE("Large"),

    /**
     * 
     *             Reserved for internal use <b>only</b>.
     *           
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PictureSetCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureSetCodeType fromValue(String v) {
        for (PictureSetCodeType c: PictureSetCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
