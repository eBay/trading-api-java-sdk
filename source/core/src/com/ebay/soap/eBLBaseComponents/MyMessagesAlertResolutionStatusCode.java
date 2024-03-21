
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyMessagesAlertResolutionStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MyMessagesAlertResolutionStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unresolved"/>
 *     &lt;enumeration value="ResolvedByAutoResolution"/>
 *     &lt;enumeration value="ResolvedByUser"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MyMessagesAlertResolutionStatusCode")
@XmlEnum
public enum MyMessagesAlertResolutionStatusCode {


    /**
     * 
     * 					   This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Unresolved")
    UNRESOLVED("Unresolved"),

    /**
     * 
     * 					   This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ResolvedByAutoResolution")
    RESOLVED_BY_AUTO_RESOLUTION("ResolvedByAutoResolution"),

    /**
     * 
     * 					   This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ResolvedByUser")
    RESOLVED_BY_USER("ResolvedByUser"),

    /**
     * 
     * 					   This field is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MyMessagesAlertResolutionStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MyMessagesAlertResolutionStatusCode fromValue(String v) {
        for (MyMessagesAlertResolutionStatusCode c: MyMessagesAlertResolutionStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
