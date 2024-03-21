
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarrantyTypeOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarrantyTypeOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ReplacementWarranty"/>
 *     &lt;enumeration value="DealerWarranty"/>
 *     &lt;enumeration value="ManufacturerWarranty"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "WarrantyTypeOptionsCodeType")
@XmlEnum
public enum WarrantyTypeOptionsCodeType {


    /**
     * 
     * 						If this value is returned in the <b>ReturnPolicyDetails.WarrantyType</b> container of the <b>GeteBayDetails</b> response, the seller may offer a replacement warranty to the buyer. The seller can offer a replacement warranty through the <b>ReturnPolicy.WarrantyTypeOption</b> field in an add/revise/relist API call.
     * 					
     * 
     */
    @XmlEnumValue("ReplacementWarranty")
    REPLACEMENT_WARRANTY("ReplacementWarranty"),

    /**
     * 
     * 						If this value is returned in the <b>ReturnPolicyDetails.WarrantyType</b> container of the <b>GeteBayDetails</b> response, the seller may offer a dealer warranty to the buyer. The seller can offer a dealer warranty through the <b>ReturnPolicy.WarrantyTypeOption</b> field in an add/revise/relist API call.
     * 					
     * 
     */
    @XmlEnumValue("DealerWarranty")
    DEALER_WARRANTY("DealerWarranty"),

    /**
     * 
     * 						If this value is returned in the <b>ReturnPolicyDetails.WarrantyType</b> container of the <b>GeteBayDetails</b> response, the seller may offer a manufacturer warranty to the buyer. The seller can offer a manufacturer warranty through the <b>ReturnPolicy.WarrantyTypeOption</b> field in an add/revise/relist API call.
     * 					
     * 
     */
    @XmlEnumValue("ManufacturerWarranty")
    MANUFACTURER_WARRANTY("ManufacturerWarranty"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    WarrantyTypeOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarrantyTypeOptionsCodeType fromValue(String v) {
        for (WarrantyTypeOptionsCodeType c: WarrantyTypeOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
