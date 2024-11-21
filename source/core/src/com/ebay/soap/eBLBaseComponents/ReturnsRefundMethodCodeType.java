
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnsRefundMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnsRefundMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MoneyBack"/>
 *     &lt;enumeration value="MoneyBackorReplacement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ReturnsRefundMethodCodeType")
@XmlEnum
public enum ReturnsRefundMethodCodeType {


    /**
     * 
     * 						<code>MoneyBack</code> indicates the seller will refund the cost of the item returned.
     * 					
     * 
     */
    @XmlEnumValue("MoneyBack")
    MONEY_BACK("MoneyBack"),

    /**
     * 
     * 						Available on the US marketplace only, <code>MoneyBackorReplacement</code> indicates the seller will refund the cost of the item returned or they will replace the returned item.
     * 					
     * 
     */
    @XmlEnumValue("MoneyBackorReplacement")
    MONEY_BACKOR_REPLACEMENT("MoneyBackorReplacement");
    private final String value;

    ReturnsRefundMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnsRefundMethodCodeType fromValue(String v) {
        for (ReturnsRefundMethodCodeType c: ReturnsRefundMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
