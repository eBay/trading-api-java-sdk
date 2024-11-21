
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CombinedPaymentPeriodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CombinedPaymentPeriodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Days_3"/>
 *     &lt;enumeration value="Days_5"/>
 *     &lt;enumeration value="Days_7"/>
 *     &lt;enumeration value="Days_14"/>
 *     &lt;enumeration value="Days_30"/>
 *     &lt;enumeration value="Ineligible"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CombinedPaymentPeriodCodeType")
@XmlEnum
public enum CombinedPaymentPeriodCodeType {


    /**
     * 
     * 						This value indicates that an unpaid order can be combined into a Combined Invoice
     * 						order within three days after purchase (creation of order).
     * 					
     * 
     */
    @XmlEnumValue("Days_3")
    DAYS_3("Days_3"),

    /**
     * 
     * 						This value indicates that an unpaid order can be combined into a Combined Invoice
     * 						order within five days after purchase (creation of order).
     * 					
     * 
     */
    @XmlEnumValue("Days_5")
    DAYS_5("Days_5"),

    /**
     * 
     * 						This value indicates that an unpaid order can be combined into a Combined Invoice
     * 						order within seven days after purchase (creation of order).
     * 					
     * 
     */
    @XmlEnumValue("Days_7")
    DAYS_7("Days_7"),

    /**
     * 
     * 						This value indicates that an unpaid order can be combined into a Combined Invoice
     * 						order within 14 days after purchase (creation of order).
     * 					
     * 
     */
    @XmlEnumValue("Days_14")
    DAYS_14("Days_14"),

    /**
     * 
     * 						This value indicates that an unpaid order can be combined into a Combined Invoice
     * 						order within 30 days after purchase (creation of order).
     * 					
     * 
     */
    @XmlEnumValue("Days_30")
    DAYS_30("Days_30"),

    /**
     * 
     * 						This value indicates that an order is not eligible to be combined into a Combined
     * 						Payment order.
     * 					
     * 
     */
    @XmlEnumValue("Ineligible")
    INELIGIBLE("Ineligible"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CombinedPaymentPeriodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CombinedPaymentPeriodCodeType fromValue(String v) {
        for (CombinedPaymentPeriodCodeType c: CombinedPaymentPeriodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
