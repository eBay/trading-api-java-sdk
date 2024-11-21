
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingEnhancementDurationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingEnhancementDurationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Days_1"/>
 *     &lt;enumeration value="Days_2"/>
 *     &lt;enumeration value="Days_3"/>
 *     &lt;enumeration value="Days_4"/>
 *     &lt;enumeration value="Days_5"/>
 *     &lt;enumeration value="Days_6"/>
 *     &lt;enumeration value="Days_7"/>
 *     &lt;enumeration value="Days_8"/>
 *     &lt;enumeration value="Days_9"/>
 *     &lt;enumeration value="Days_10"/>
 *     &lt;enumeration value="Days_11"/>
 *     &lt;enumeration value="Days_12"/>
 *     &lt;enumeration value="Days_13"/>
 *     &lt;enumeration value="Days_14"/>
 *     &lt;enumeration value="Days_15"/>
 *     &lt;enumeration value="Days_16"/>
 *     &lt;enumeration value="Days_17"/>
 *     &lt;enumeration value="Days_18"/>
 *     &lt;enumeration value="Days_19"/>
 *     &lt;enumeration value="Days_20"/>
 *     &lt;enumeration value="Days_21"/>
 *     &lt;enumeration value="Days_22"/>
 *     &lt;enumeration value="Days_23"/>
 *     &lt;enumeration value="Days_24"/>
 *     &lt;enumeration value="Days_25"/>
 *     &lt;enumeration value="Days_26"/>
 *     &lt;enumeration value="Days_27"/>
 *     &lt;enumeration value="Days_28"/>
 *     &lt;enumeration value="Days_29"/>
 *     &lt;enumeration value="Days_30"/>
 *     &lt;enumeration value="Days_31"/>
 *     &lt;enumeration value="Days_32"/>
 *     &lt;enumeration value="Days_33"/>
 *     &lt;enumeration value="Days_34"/>
 *     &lt;enumeration value="Days_35"/>
 *     &lt;enumeration value="Days_36"/>
 *     &lt;enumeration value="Days_37"/>
 *     &lt;enumeration value="Days_38"/>
 *     &lt;enumeration value="Days_39"/>
 *     &lt;enumeration value="Days_40"/>
 *     &lt;enumeration value="Days_41"/>
 *     &lt;enumeration value="Days_42"/>
 *     &lt;enumeration value="Days_43"/>
 *     &lt;enumeration value="Days_44"/>
 *     &lt;enumeration value="Days_45"/>
 *     &lt;enumeration value="Days_46"/>
 *     &lt;enumeration value="Days_47"/>
 *     &lt;enumeration value="Days_48"/>
 *     &lt;enumeration value="Days_49"/>
 *     &lt;enumeration value="Days_50"/>
 *     &lt;enumeration value="Lifetime"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ListingEnhancementDurationCodeType")
@XmlEnum
public enum ListingEnhancementDurationCodeType {


    /**
     * This value sets the Featured Gallery duration to one day. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_1")
    DAYS_1("Days_1"),

    /**
     * This value sets the Featured Gallery duration to two days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_2")
    DAYS_2("Days_2"),

    /**
     * This value sets the Featured Gallery duration to three days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_3")
    DAYS_3("Days_3"),

    /**
     * This value sets the Featured Gallery duration to four days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_4")
    DAYS_4("Days_4"),

    /**
     * This value sets the Featured Gallery duration to five days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_5")
    DAYS_5("Days_5"),

    /**
     * This value sets the Featured Gallery duration to six days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_6")
    DAYS_6("Days_6"),

    /**
     * This value sets the Featured Gallery duration to seven days. If a
     * 					listing has a Featured Gallery duration of seven days, it is possible to revise that
     * 					item and set the Featured Gallery duration to 'Lifetime' (throughout
     * 					life of listing) (
     * 
     */
    @XmlEnumValue("Days_7")
    DAYS_7("Days_7"),

    /**
     * This value sets the Featured Gallery duration to eight days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_8")
    DAYS_8("Days_8"),

    /**
     * This value sets the Featured Gallery duration to nine days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_9")
    DAYS_9("Days_9"),

    /**
     * This value sets the Featured Gallery duration to 10 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_10")
    DAYS_10("Days_10"),

    /**
     * This value sets the Featured Gallery duration to 11 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_11")
    DAYS_11("Days_11"),

    /**
     * This value sets the Featured Gallery duration to 12 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_12")
    DAYS_12("Days_12"),

    /**
     * This value sets the Featured Gallery duration to 13 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_13")
    DAYS_13("Days_13"),

    /**
     * This value sets the Featured Gallery duration to 14 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_14")
    DAYS_14("Days_14"),

    /**
     * This value sets the Featured Gallery duration to 15 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_15")
    DAYS_15("Days_15"),

    /**
     * This value sets the Featured Gallery duration to 16 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_16")
    DAYS_16("Days_16"),

    /**
     * This value sets the Featured Gallery duration to 17 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_17")
    DAYS_17("Days_17"),

    /**
     * This value sets the Featured Gallery duration to 18 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_18")
    DAYS_18("Days_18"),

    /**
     * This value sets the Featured Gallery duration to 19 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_19")
    DAYS_19("Days_19"),

    /**
     * This value sets the Featured Gallery duration to 20 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_20")
    DAYS_20("Days_20"),

    /**
     * This value sets the Featured Gallery duration to 21 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_21")
    DAYS_21("Days_21"),

    /**
     * This value sets the Featured Gallery duration to 22 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_22")
    DAYS_22("Days_22"),

    /**
     * This value sets the Featured Gallery duration to 23 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_23")
    DAYS_23("Days_23"),

    /**
     * This value sets the Featured Gallery duration to 24 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_24")
    DAYS_24("Days_24"),

    /**
     * This value sets the Featured Gallery duration to 25 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_25")
    DAYS_25("Days_25"),

    /**
     * This value sets the Featured Gallery duration to 26 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_26")
    DAYS_26("Days_26"),

    /**
     * This value sets the Featured Gallery duration to 27 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_27")
    DAYS_27("Days_27"),

    /**
     * This value sets the Featured Gallery duration to 28 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_28")
    DAYS_28("Days_28"),

    /**
     * This value sets the Featured Gallery duration to 29 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_29")
    DAYS_29("Days_29"),

    /**
     * This value sets the Featured Gallery duration to 30 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_30")
    DAYS_30("Days_30"),

    /**
     * This value sets the Featured Gallery duration to 31 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_31")
    DAYS_31("Days_31"),

    /**
     * This value sets the Featured Gallery duration to 32 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_32")
    DAYS_32("Days_32"),

    /**
     * This value sets the Featured Gallery duration to 33 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_33")
    DAYS_33("Days_33"),

    /**
     * This value sets the Featured Gallery duration to 34 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_34")
    DAYS_34("Days_34"),

    /**
     * This value sets the Featured Gallery duration to 35 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_35")
    DAYS_35("Days_35"),

    /**
     * This value sets the Featured Gallery duration to 36 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_36")
    DAYS_36("Days_36"),

    /**
     * This value sets the Featured Gallery duration to 37 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_37")
    DAYS_37("Days_37"),

    /**
     * This value sets the Featured Gallery duration to 38 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_38")
    DAYS_38("Days_38"),

    /**
     * This value sets the Featured Gallery duration to 39 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_39")
    DAYS_39("Days_39"),

    /**
     * This value sets the Featured Gallery duration to 40 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_40")
    DAYS_40("Days_40"),

    /**
     * This value sets the Featured Gallery duration to 41 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_41")
    DAYS_41("Days_41"),

    /**
     * This value sets the Featured Gallery duration to 42 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_42")
    DAYS_42("Days_42"),

    /**
     * This value sets the Featured Gallery duration to 43 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_43")
    DAYS_43("Days_43"),

    /**
     * This value sets the Featured Gallery duration to 44 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_44")
    DAYS_44("Days_44"),

    /**
     * This value sets the Featured Gallery duration to 45 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_45")
    DAYS_45("Days_45"),

    /**
     * This value sets the Featured Gallery duration to 46 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_46")
    DAYS_46("Days_46"),

    /**
     * This value sets the Featured Gallery duration to 47 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_47")
    DAYS_47("Days_47"),

    /**
     * This value sets the Featured Gallery duration to 48 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_48")
    DAYS_48("Days_48"),

    /**
     * This value sets the Featured Gallery duration to 49 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_49")
    DAYS_49("Days_49"),

    /**
     * This value sets the Featured Gallery duration to 50 days. This
     * 					value is deprecated.
     * 
     */
    @XmlEnumValue("Days_50")
    DAYS_50("Days_50"),

    /**
     * 
     * 						This duration enables the Featured Gallery feature for the life of the listing. Once the
     * 						Featured Gallery duration is set to 'Lifetime' for a listing, it cannot be changed.
     * 					
     * 
     */
    @XmlEnumValue("Lifetime")
    LIFETIME("Lifetime"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingEnhancementDurationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingEnhancementDurationCodeType fromValue(String v) {
        for (ListingEnhancementDurationCodeType c: ListingEnhancementDurationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
