
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarrantyOfferedCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarrantyOfferedCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="WarrantyOffered"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "WarrantyOfferedCodeType")
@XmlEnum
public enum WarrantyOfferedCodeType {


    /**
     * 
     * 						If this value is returned in the <b>ReturnPolicyDetails.WarrantyOffered</b> container of the <b>GeteBayDetails</b> response, the seller may offer a warranty to the buyer. This value that should be passed into the <b>ReturnPolicy.WarrantyOfferedOption</b> field of an add/revise/relist API call if the seller wishes to offer a warranty to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("WarrantyOffered")
    WARRANTY_OFFERED("WarrantyOffered"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    WarrantyOfferedCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarrantyOfferedCodeType fromValue(String v) {
        for (WarrantyOfferedCodeType c: WarrantyOfferedCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
