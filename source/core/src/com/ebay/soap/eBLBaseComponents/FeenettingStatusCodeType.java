
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeenettingStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeenettingStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Exempted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FeenettingStatusCodeType")
@XmlEnum
public enum FeenettingStatusCodeType {


    /**
     * 
     * 						This value indicates that the account is enabled for the fee netting mechanism. If a user sees this value, the <b>GetAccount</b> response will include the <b>AccountSummary.NettedTransactionSummary</b> container and the <b>AccountEntry.Netted</b> boolean field for each account entry.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						This value indicates that the account is not enabled for the fee netting mechanism. .
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						This value indicates that the account is exempted from the fee netting mechanism.
     * 					
     * 
     */
    @XmlEnumValue("Exempted")
    EXEMPTED("Exempted");
    private final String value;

    FeenettingStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeenettingStatusCodeType fromValue(String v) {
        for (FeenettingStatusCodeType c: FeenettingStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
