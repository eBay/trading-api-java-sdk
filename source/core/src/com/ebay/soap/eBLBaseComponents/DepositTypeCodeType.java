
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepositTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OtherMethod"/>
 *     &lt;enumeration value="FastDeposit"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "DepositTypeCodeType")
@XmlEnum
public enum DepositTypeCodeType {


    /**
     * 
     * 					  This value indicates that no deposit is required.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 					  This value indicates that a deposit is required from the buyer when purchasing a motor vehicle. Deposits for a motor vehicle are either due in 24, 48, or 72 hours after commitment to purchase. Or, in the case of a motor vehicle listing that is requiring immediate payment, the deposit it due immediately after commitment to purchase.
     * 					  <br><br>
     * 					  This value should be used in an Add/Revise call if the seller is requiring a deposit for a motor vehicle listing.
     * 					
     * 
     */
    @XmlEnumValue("OtherMethod")
    OTHER_METHOD("OtherMethod"),

    /**
     * 
     * 					   (out) No longer used.
     * 					
     * 
     */
    @XmlEnumValue("FastDeposit")
    FAST_DEPOSIT("FastDeposit"),

    /**
     * 
     * 					  (out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DepositTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepositTypeCodeType fromValue(String v) {
        for (DepositTypeCodeType c: DepositTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
