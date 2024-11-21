
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemArrivedWithinEDDCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemArrivedWithinEDDCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EddQuestionWasNotAsked"/>
 *     &lt;enumeration value="BuyerDidntProvideAnswer"/>
 *     &lt;enumeration value="BuyerIndicatedItemArrivedWithinEDDRange"/>
 *     &lt;enumeration value="BuyerIndicatedItemNotArrivedWithinEDDRange"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemArrivedWithinEDDCodeType")
@XmlEnum
public enum ItemArrivedWithinEDDCodeType {


    /**
     * 
     * 						<b>This value is for internal use only.<b>
     * 						
     * 					
     * 
     */
    @XmlEnumValue("EddQuestionWasNotAsked")
    EDD_QUESTION_WAS_NOT_ASKED("EddQuestionWasNotAsked"),

    /**
     * 
     * 						<b>This value is for internal use only.<b>
     * 						
     * 					
     * 
     */
    @XmlEnumValue("BuyerDidntProvideAnswer")
    BUYER_DIDNT_PROVIDE_ANSWER("BuyerDidntProvideAnswer"),

    /**
     * 
     * 						This value indicates that the buyer indicated that the order line item did arrive within the estimated delivery date when they left feedback for the transaction.
     * 					
     * 
     */
    @XmlEnumValue("BuyerIndicatedItemArrivedWithinEDDRange")
    BUYER_INDICATED_ITEM_ARRIVED_WITHIN_EDD_RANGE("BuyerIndicatedItemArrivedWithinEDDRange"),

    /**
     * 
     * 						This value indicates that the buyer indicated that the order line item did not arrive within the estimated delivery date when they left feedback for the transaction.
     * 					
     * 
     */
    @XmlEnumValue("BuyerIndicatedItemNotArrivedWithinEDDRange")
    BUYER_INDICATED_ITEM_NOT_ARRIVED_WITHIN_EDD_RANGE("BuyerIndicatedItemNotArrivedWithinEDDRange"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemArrivedWithinEDDCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemArrivedWithinEDDCodeType fromValue(String v) {
        for (ItemArrivedWithinEDDCodeType c: ItemArrivedWithinEDDCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
