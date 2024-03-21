
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelInitiatorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelInitiatorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Seller"/>
 *     &lt;enumeration value="Buyer"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "CancelInitiatorCodeType")
@XmlEnum
public enum CancelInitiatorCodeType {


    /**
     * 
     * 						This value indicates that the party whom initiated the cancellation of the order is not known.
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						This value indicates that the seller initiated the cancellation of the order.
     * 					
     * 
     */
    @XmlEnumValue("Seller")
    SELLER("Seller"),

    /**
     * 
     * 						This value indicates that the buyer initiated the cancellation of the order.
     * 					
     * 
     */
    @XmlEnumValue("Buyer")
    BUYER("Buyer"),

    /**
     * 
     * 						This value indicates that eBay customer support initiated the cancellation of the order.
     * 					
     * 
     */
    CS("CS"),

    /**
     * 
     * 						This value indicates that the cancellation of the order was initiated by the system.
     * 					
     * 
     */
    @XmlEnumValue("System")
    SYSTEM("System"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CancelInitiatorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancelInitiatorCodeType fromValue(String v) {
        for (CancelInitiatorCodeType c: CancelInitiatorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
