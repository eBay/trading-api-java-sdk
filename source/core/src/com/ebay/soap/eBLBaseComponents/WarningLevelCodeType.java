
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarningLevelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarningLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="High"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "WarningLevelCodeType")
@XmlEnum
public enum WarningLevelCodeType {


    /**
     * 
     * 					The <b>WarningLevel</b> value is set to <code>Low</code> if the user does not wish to receive warnings when the application passes
     * 					unrecognized or deprecated elements in an API call request.
     * 					This is the default value if <b>WarningLevel</b> is not specified in the call request.
     *  					
     * 
     */
    @XmlEnumValue("Low")
    LOW("Low"),

    /**
     * 
     * 						The <b>WarningLevel</b> value is set to <code>High</code> if the user wishes to receive warnings when the application passes unrecognized or deprecated elements in an API call request. Setting the <b>WarningLevel</b> value to <code>High</code>  is not recommended in a production environment. Instead, it should only be used during the development/debugging stage.
     * 					
     * 
     */
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    WarningLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarningLevelCodeType fromValue(String v) {
        for (WarningLevelCodeType c: WarningLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
