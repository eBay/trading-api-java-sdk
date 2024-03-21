
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerAccountStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerAccountStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="PastDue"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellerAccountStatusCodeType")
@XmlEnum
public enum SellerAccountStatusCodeType {


    /**
     * 
     * 						Your account is current.
     * 					
     * 
     */
    @XmlEnumValue("Current")
    CURRENT("Current"),

    /**
     * 
     * 						Your account is past due.
     * 					
     * 
     */
    @XmlEnumValue("PastDue")
    PAST_DUE("PastDue"),

    /**
     * 
     * 						Your account is on hold and risking suspension.
     * 					
     * 
     */
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerAccountStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerAccountStatusCodeType fromValue(String v) {
        for (SellerAccountStatusCodeType c: SellerAccountStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
