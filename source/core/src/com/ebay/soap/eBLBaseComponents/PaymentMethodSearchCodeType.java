
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodSearchCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodSearchCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="PaisaPay"/>
 *     &lt;enumeration value="PayPalOrPaisaPay"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="PaisaPayEscrowEMI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaymentMethodSearchCodeType")
@XmlEnum
public enum PaymentMethodSearchCodeType {


    /**
     * 
     * 					 	This enumeration value is deprecated.
     * 				  
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     * 					  This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPay")
    PAISA_PAY("PaisaPay"),

    /**
     * 
     * 					  This enumeration value is deprecated.
     * 					 
     * 
     */
    @XmlEnumValue("PayPalOrPaisaPay")
    PAY_PAL_OR_PAISA_PAY("PayPalOrPaisaPay"),

    /**
     * 
     * 						This enumeration value is reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 					  This enumeration value is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayEscrowEMI")
    PAISA_PAY_ESCROW_EMI("PaisaPayEscrowEMI");
    private final String value;

    PaymentMethodSearchCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodSearchCodeType fromValue(String v) {
        for (PaymentMethodSearchCodeType c: PaymentMethodSearchCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
