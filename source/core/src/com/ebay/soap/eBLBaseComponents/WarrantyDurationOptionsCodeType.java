
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarrantyDurationOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarrantyDurationOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Months_1"/>
 *     &lt;enumeration value="Months_3"/>
 *     &lt;enumeration value="Months_6"/>
 *     &lt;enumeration value="Years_1"/>
 *     &lt;enumeration value="Years_2"/>
 *     &lt;enumeration value="Years_3"/>
 *     &lt;enumeration value="Years_MoreThan3"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "WarrantyDurationOptionsCodeType")
@XmlEnum
public enum WarrantyDurationOptionsCodeType {


    /**
     * 
     * 						This value indicates that the duration of the warranty will be one month from time of purchase. If this value is returned in the <b>ReturnPolicyDetails.WarrantyDuration</b> container of the <b>GeteBayDetails</b> response, the seller may offer this warranty duration to the buyer. The warranty duration value is specified through the <b>ReturnPolicy.WarrantyDurationOption</b> field in an add/revise/relist API call.
     * 					
     * 
     */
    @XmlEnumValue("Months_1")
    MONTHS_1("Months_1"),

    /**
     * 
     * 						This value indicates that the duration of the warranty will be three months from time of purchase. If this value is returned in the <b>ReturnPolicyDetails.WarrantyDuration</b> container of the <b>GeteBayDetails</b> response, the seller may offer this warranty duration to the buyer. The warranty duration value is specified through the <b>ReturnPolicy.WarrantyDurationOption</b> field in an add/revise/relist API call.
     * 					
     * 
     */
    @XmlEnumValue("Months_3")
    MONTHS_3("Months_3"),

    /**
     * 
     * 						This value indicates that the duration of the warranty will be six months from time of purchase. If this value is returned in the <b>ReturnPolicyDetails.WarrantyDuration</b> container of the <b>GeteBayDetails</b> response, the seller may offer this warranty duration to the buyer. The warranty duration value is specified through the <b>ReturnPolicy.WarrantyDurationOption</b> field in an add/revise/relist API call.
     * 					
     * 
     */
    @XmlEnumValue("Months_6")
    MONTHS_6("Months_6"),

    /**
     * 
     * 						This value indicates that the duration of the warranty will be one year from time of purchase. If this value is returned in the <b>ReturnPolicyDetails.WarrantyDuration</b> container of the <b>GeteBayDetails</b> response, the seller may offer this warranty duration to the buyer. The warranty duration value is specified through the <b>ReturnPolicy.WarrantyDurationOption</b> field in an add/revise/relist API call.
     * 					
     * 
     */
    @XmlEnumValue("Years_1")
    YEARS_1("Years_1"),

    /**
     * 
     * 						This value indicates that the duration of the warranty will be two years from time of purchase. If this value is returned in the <b>ReturnPolicyDetails.WarrantyDuration</b> container of the <b>GeteBayDetails</b> response, the seller may offer this warranty duration to the buyer. The warranty duration value is specified through the <b>ReturnPolicy.WarrantyDurationOption</b> field in an add/revise/relist API call.
     * 					
     * 
     */
    @XmlEnumValue("Years_2")
    YEARS_2("Years_2"),

    /**
     * 
     * 						This value indicates that the duration of the warranty will be three years from time of purchase. If this value is returned in the <b>ReturnPolicyDetails.WarrantyDuration</b> container of the <b>GeteBayDetails</b> response, the seller may offer this warranty duration to the buyer. The warranty duration value is specified through the <b>ReturnPolicy.WarrantyDurationOption</b> field in an add/revise/relist API call.
     * 					
     * 
     */
    @XmlEnumValue("Years_3")
    YEARS_3("Years_3"),

    /**
     * 
     * 						This value indicates that the duration of the warranty is longer than three years from time of purchase. If this value is returned in the <b>ReturnPolicyDetails.WarrantyDuration</b> container of the <b>GeteBayDetails</b> response, the seller may offer this warranty duration to the buyer. The warranty duration value is specified through the <b>ReturnPolicy.WarrantyDurationOption</b> field in an add/revise/relist API call.
     * 					
     * 
     */
    @XmlEnumValue("Years_MoreThan3")
    YEARS_MORE_THAN_3("Years_MoreThan3"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    WarrantyDurationOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarrantyDurationOptionsCodeType fromValue(String v) {
        for (WarrantyDurationOptionsCodeType c: WarrantyDurationOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
