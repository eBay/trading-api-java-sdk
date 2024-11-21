
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingPackageCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingPackageCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Letter"/>
 *     &lt;enumeration value="LargeEnvelope"/>
 *     &lt;enumeration value="USPSLargePack"/>
 *     &lt;enumeration value="VeryLargePack"/>
 *     &lt;enumeration value="ExtraLargePack"/>
 *     &lt;enumeration value="UPSLetter"/>
 *     &lt;enumeration value="USPSFlatRateEnvelope"/>
 *     &lt;enumeration value="PackageThickEnvelope"/>
 *     &lt;enumeration value="Roll"/>
 *     &lt;enumeration value="Europallet"/>
 *     &lt;enumeration value="OneWayPallet"/>
 *     &lt;enumeration value="BulkyGoods"/>
 *     &lt;enumeration value="Furniture"/>
 *     &lt;enumeration value="Cars"/>
 *     &lt;enumeration value="Motorbikes"/>
 *     &lt;enumeration value="Caravan"/>
 *     &lt;enumeration value="IndustryVehicles"/>
 *     &lt;enumeration value="ParcelOrPaddedEnvelope"/>
 *     &lt;enumeration value="SmallCanadaPostBox"/>
 *     &lt;enumeration value="MediumCanadaPostBox"/>
 *     &lt;enumeration value="LargeCanadaPostBox"/>
 *     &lt;enumeration value="SmallCanadaPostBubbleMailer"/>
 *     &lt;enumeration value="MediumCanadaPostBubbleMailer"/>
 *     &lt;enumeration value="LargeCanadaPostBubbleMailer"/>
 *     &lt;enumeration value="PaddedBags"/>
 *     &lt;enumeration value="ToughBags"/>
 *     &lt;enumeration value="ExpandableToughBags"/>
 *     &lt;enumeration value="MailingBoxes"/>
 *     &lt;enumeration value="Winepak"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShippingPackageCodeType")
@XmlEnum
public enum ShippingPackageCodeType {


    /**
     * 
     * 						None
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Letter
     * 					
     * 
     */
    @XmlEnumValue("Letter")
    LETTER("Letter"),

    /**
     * 
     * 						LargeEnvelope
     * 					
     * 
     */
    @XmlEnumValue("LargeEnvelope")
    LARGE_ENVELOPE("LargeEnvelope"),

    /**
     * 
     * 						USPS Large Package/Oversize 1
     * 					
     * 
     */
    @XmlEnumValue("USPSLargePack")
    USPS_LARGE_PACK("USPSLargePack"),

    /**
     * 
     * 						Very Large Package/Oversize 2
     * 					
     * 
     */
    @XmlEnumValue("VeryLargePack")
    VERY_LARGE_PACK("VeryLargePack"),

    /**
     * 
     * 						Extra Large Package/Oversize 3
     * 					
     * 
     */
    @XmlEnumValue("ExtraLargePack")
    EXTRA_LARGE_PACK("ExtraLargePack"),

    /**
     * 
     * 						UPS Letter
     * 					
     * 
     */
    @XmlEnumValue("UPSLetter")
    UPS_LETTER("UPSLetter"),

    /**
     * 
     * 						USPS Flat Rate Envelope
     * 					
     * 
     */
    @XmlEnumValue("USPSFlatRateEnvelope")
    USPS_FLAT_RATE_ENVELOPE("USPSFlatRateEnvelope"),

    /**
     * 
     * 						Package/thick envelope
     * 					
     * 
     */
    @XmlEnumValue("PackageThickEnvelope")
    PACKAGE_THICK_ENVELOPE("PackageThickEnvelope"),

    /**
     * 
     * 						Roll
     * 					
     * 
     */
    @XmlEnumValue("Roll")
    ROLL("Roll"),

    /**
     * 
     * 						Europallet
     * 					
     * 
     */
    @XmlEnumValue("Europallet")
    EUROPALLET("Europallet"),

    /**
     * 
     * 						Onewaypallet
     * 					
     * 
     */
    @XmlEnumValue("OneWayPallet")
    ONE_WAY_PALLET("OneWayPallet"),

    /**
     * 
     * 						Bulky goods
     * 					
     * 
     */
    @XmlEnumValue("BulkyGoods")
    BULKY_GOODS("BulkyGoods"),

    /**
     * 
     * 						Furniture
     * 					
     * 
     */
    @XmlEnumValue("Furniture")
    FURNITURE("Furniture"),

    /**
     * 
     * 						Cars
     * 					
     * 
     */
    @XmlEnumValue("Cars")
    CARS("Cars"),

    /**
     * 
     * 						Motorbikes
     * 					
     * 
     */
    @XmlEnumValue("Motorbikes")
    MOTORBIKES("Motorbikes"),

    /**
     * 
     * 						Caravan
     * 					
     * 
     */
    @XmlEnumValue("Caravan")
    CARAVAN("Caravan"),

    /**
     * 
     * 						Industry vehicles
     * 					
     * 
     */
    @XmlEnumValue("IndustryVehicles")
    INDUSTRY_VEHICLES("IndustryVehicles"),

    /**
     * 
     * 						Parcel or padded Envelope
     * 					
     * 
     */
    @XmlEnumValue("ParcelOrPaddedEnvelope")
    PARCEL_OR_PADDED_ENVELOPE("ParcelOrPaddedEnvelope"),

    /**
     * 
     * 						Small Canada Post Box
     * 					
     * 
     */
    @XmlEnumValue("SmallCanadaPostBox")
    SMALL_CANADA_POST_BOX("SmallCanadaPostBox"),

    /**
     * 
     * 						Medium Canada Post Box
     * 					
     * 
     */
    @XmlEnumValue("MediumCanadaPostBox")
    MEDIUM_CANADA_POST_BOX("MediumCanadaPostBox"),

    /**
     * 
     * 						Large Canada Post Box
     * 					
     * 
     */
    @XmlEnumValue("LargeCanadaPostBox")
    LARGE_CANADA_POST_BOX("LargeCanadaPostBox"),

    /**
     * 
     * 						Small Canada Post Bubble Mailer
     * 					
     * 
     */
    @XmlEnumValue("SmallCanadaPostBubbleMailer")
    SMALL_CANADA_POST_BUBBLE_MAILER("SmallCanadaPostBubbleMailer"),

    /**
     * 
     * 						Medium Canada Post Bubble Mailer
     * 					
     * 
     */
    @XmlEnumValue("MediumCanadaPostBubbleMailer")
    MEDIUM_CANADA_POST_BUBBLE_MAILER("MediumCanadaPostBubbleMailer"),

    /**
     * 
     * 						Large Canada Post Bubble Mailer
     * 					
     * 
     */
    @XmlEnumValue("LargeCanadaPostBubbleMailer")
    LARGE_CANADA_POST_BUBBLE_MAILER("LargeCanadaPostBubbleMailer"),

    /**
     * 
     * 						Padded Bags
     * 					
     * 
     */
    @XmlEnumValue("PaddedBags")
    PADDED_BAGS("PaddedBags"),

    /**
     * 
     * 						Tough Bags
     * 					
     * 
     */
    @XmlEnumValue("ToughBags")
    TOUGH_BAGS("ToughBags"),

    /**
     * 
     * 						Expandable Tough Bags
     * 					
     * 
     */
    @XmlEnumValue("ExpandableToughBags")
    EXPANDABLE_TOUGH_BAGS("ExpandableToughBags"),

    /**
     * 
     * 						Mailing Boxes
     * 					
     * 
     */
    @XmlEnumValue("MailingBoxes")
    MAILING_BOXES("MailingBoxes"),

    /**
     * 
     * 						Winepak
     * 					
     * 
     */
    @XmlEnumValue("Winepak")
    WINEPAK("Winepak"),

    /**
     * 
     *  						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingPackageCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingPackageCodeType fromValue(String v) {
        for (ShippingPackageCodeType c: ShippingPackageCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
