
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnpaidItemCaseStatusTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnpaidItemCaseStatusTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="ClosedWithPayment"/>
 *     &lt;enumeration value="ClosedWithoutPayment"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "UnpaidItemCaseStatusTypeCodeType")
@XmlEnum
public enum UnpaidItemCaseStatusTypeCodeType {


    /**
     * 
     *                       This value indicates that the Unpaid Item case is open.
     *                     
     * 
     */
    @XmlEnumValue("Open")
    OPEN("Open"),

    /**
     * 
     *                      This value indicates that the Unpaid Item case is closed with payment
     * 										 received from the buyer.
     *                     
     * 
     */
    @XmlEnumValue("ClosedWithPayment")
    CLOSED_WITH_PAYMENT("ClosedWithPayment"),

    /**
     * 
     *                       This value indicates that the Unpaid Item case is closed with no payment
     * 										 	received from the buyer.
     *                     
     * 
     */
    @XmlEnumValue("ClosedWithoutPayment")
    CLOSED_WITHOUT_PAYMENT("ClosedWithoutPayment"),

    /**
     * 
     *                       This value is reserved for future or internal use.
     *                     
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    UnpaidItemCaseStatusTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnpaidItemCaseStatusTypeCodeType fromValue(String v) {
        for (UnpaidItemCaseStatusTypeCodeType c: UnpaidItemCaseStatusTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
