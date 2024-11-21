
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuestionTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuestionTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Shipping"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="MultipleItemShipping"/>
 *     &lt;enumeration value="CustomizedSubject"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "QuestionTypeCodeType")
@XmlEnum
public enum QuestionTypeCodeType {


    /**
     * 
     * 			  		This enumeration value indicates that a general question was asked about the order line item.
     * 			  	
     * 
     */
    @XmlEnumValue("General")
    GENERAL("General"),

    /**
     * 
     * 						This enumeration value indicates that a question about shipping the order line item was asked.
     * 					
     * 
     */
    @XmlEnumValue("Shipping")
    SHIPPING("Shipping"),

    /**
     * 
     * 						This enumeration value indicates that a payment question was asked about the order line item.
     * 					
     * 
     */
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),

    /**
     * 
     * 						This enumeration value indicates that a question was asked about a shipment that involves multiple packages.
     * 					
     * 
     */
    @XmlEnumValue("MultipleItemShipping")
    MULTIPLE_ITEM_SHIPPING("MultipleItemShipping"),

    /**
     * 
     * 						This enumeration value indicates that question was asked about a customized subject.
     * 					
     * 
     */
    @XmlEnumValue("CustomizedSubject")
    CUSTOMIZED_SUBJECT("CustomizedSubject"),

    /**
     * 
     * 						This enumeration value indicates that question does not have a subject.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    QuestionTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuestionTypeCodeType fromValue(String v) {
        for (QuestionTypeCodeType c: QuestionTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
