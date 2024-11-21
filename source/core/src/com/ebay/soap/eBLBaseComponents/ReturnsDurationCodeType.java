
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnsDurationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnsDurationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Days_14"/>
 *     &lt;enumeration value="Days_30"/>
 *     &lt;enumeration value="Days_60"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ReturnsDurationCodeType")
@XmlEnum
public enum ReturnsDurationCodeType {


    /**
     * 
     * 						<code>Days_14</code> indicates the buyer has 14 days to initiate a return.
     * 					
     * 
     */
    @XmlEnumValue("Days_14")
    DAYS_14("Days_14"),

    /**
     * 
     * 						<code>Days_30</code> indicates the buyer has 30 days to initiate a return.
     * 					
     * 
     */
    @XmlEnumValue("Days_30")
    DAYS_30("Days_30"),

    /**
     * 
     * 						<code>Days_60</code> indicates the buyer has 60 days to initiate a return.
     * 				  
     * 
     */
    @XmlEnumValue("Days_60")
    DAYS_60("Days_60");
    private final String value;

    ReturnsDurationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnsDurationCodeType fromValue(String v) {
        for (ReturnsDurationCodeType c: ReturnsDurationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
