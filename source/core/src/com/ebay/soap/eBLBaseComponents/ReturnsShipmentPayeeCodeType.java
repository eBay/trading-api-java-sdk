
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnsShipmentPayeeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnsShipmentPayeeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Buyer"/>
 *     &lt;enumeration value="Seller"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ReturnsShipmentPayeeCodeType")
@XmlEnum
public enum ReturnsShipmentPayeeCodeType {


    /**
     * 
     * 						<code>Buyer</code> indicates the buyer is responsible for paying for the return shipping.
     * 					
     * 
     */
    @XmlEnumValue("Buyer")
    BUYER("Buyer"),

    /**
     * 
     * 						<code>Seller</code> indicates the seller is responsible for paying for the return shipping.
     * 					
     * 
     */
    @XmlEnumValue("Seller")
    SELLER("Seller");
    private final String value;

    ReturnsShipmentPayeeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnsShipmentPayeeCodeType fromValue(String v) {
        for (ReturnsShipmentPayeeCodeType c: ReturnsShipmentPayeeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
