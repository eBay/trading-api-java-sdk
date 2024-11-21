
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INEscrowWorkflowTimelineCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="INEscrowWorkflowTimelineCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="WorkflowA"/>
 *     &lt;enumeration value="WorkflowB"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "INEscrowWorkflowTimelineCodeType")
@XmlEnum
public enum INEscrowWorkflowTimelineCodeType {


    /**
     * 
     * 						Default Escrow timelines apply.
     * 					
     * 
     */
    @XmlEnumValue("Default")
    DEFAULT("Default"),

    /**
     * 
     * 						Special Escrow timelines for Workflow A applies.
     * 					
     * 
     */
    @XmlEnumValue("WorkflowA")
    WORKFLOW_A("WorkflowA"),

    /**
     * 
     * 						Special Escrow timelines for Workflow B applies.
     * 					
     * 
     */
    @XmlEnumValue("WorkflowB")
    WORKFLOW_B("WorkflowB"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    INEscrowWorkflowTimelineCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static INEscrowWorkflowTimelineCodeType fromValue(String v) {
        for (INEscrowWorkflowTimelineCodeType c: INEscrowWorkflowTimelineCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
