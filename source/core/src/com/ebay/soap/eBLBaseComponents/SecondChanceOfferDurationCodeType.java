
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondChanceOfferDurationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecondChanceOfferDurationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Days_1"/>
 *     &lt;enumeration value="Days_3"/>
 *     &lt;enumeration value="Days_5"/>
 *     &lt;enumeration value="Days_7"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SecondChanceOfferDurationCodeType")
@XmlEnum
public enum SecondChanceOfferDurationCodeType {


    /**
     * 
     * 						The seller specifies this value to make the Second Chance offer available to the bidder for one day. This value will affect the <b>EndTime</b> value returned in the <b>AddSecondChanceItem</b> response.
     * 					
     * 
     */
    @XmlEnumValue("Days_1")
    DAYS_1("Days_1"),

    /**
     * 
     * 						The seller specifies this value to make the Second Chance offer available to the bidder for three days. This value will affect the <b>EndTime</b> value returned in the <b>AddSecondChanceItem</b> response.
     * 					
     * 
     */
    @XmlEnumValue("Days_3")
    DAYS_3("Days_3"),

    /**
     * 
     * 						The seller specifies this value to make the Second Chance offer available to the bidder for five days. This value will affect the <b>AddSecondChanceItem</b> response.
     * 					
     * 
     */
    @XmlEnumValue("Days_5")
    DAYS_5("Days_5"),

    /**
     * 
     * 						The seller specifies this value to make the Second Chance offer available to the bidder for seven days. This value will affect the <b>EndTime</b> value returned in the <b>AddSecondChanceItem</b> response.
     * 					
     * 
     */
    @XmlEnumValue("Days_7")
    DAYS_7("Days_7"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SecondChanceOfferDurationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecondChanceOfferDurationCodeType fromValue(String v) {
        for (SecondChanceOfferDurationCodeType c: SecondChanceOfferDurationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
