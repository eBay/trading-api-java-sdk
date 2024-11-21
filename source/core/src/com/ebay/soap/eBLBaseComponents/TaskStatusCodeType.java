
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TaskStatusCodeType")
@XmlEnum
public enum TaskStatusCodeType {


    /**
     * 
     * 						(out) The category changes have not started.
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						(out) The category changes are in progress.
     * 					
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * 
     * 						(out) The category changes completed successfully.
     * 					
     * 
     */
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),

    /**
     * 
     * 						(out) The category changes failed.
     * 					
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TaskStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskStatusCodeType fromValue(String v) {
        for (TaskStatusCodeType c: TaskStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
