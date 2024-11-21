
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VeROItemStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VeROItemStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Received"/>
 *     &lt;enumeration value="Submitted"/>
 *     &lt;enumeration value="Removed"/>
 *     &lt;enumeration value="SubmissionFailed"/>
 *     &lt;enumeration value="ClarificationRequired"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "VeROItemStatusCodeType")
@XmlEnum
public enum VeROItemStatusCodeType {


    /**
     * 
     * 						(out) The VeRO report request for the item has been received by eBay.
     * 					
     * 
     */
    @XmlEnumValue("Received")
    RECEIVED("Received"),

    /**
     * 
     * 						(out) The VeRO report request for the item has been submitted to eBay.
     * 					
     * 
     */
    @XmlEnumValue("Submitted")
    SUBMITTED("Submitted"),

    /**
     * 
     * 						(out) The reported item has been ended by eBay.
     * 					
     * 
     */
    @XmlEnumValue("Removed")
    REMOVED("Removed"),

    /**
     * 
     * 						(out) The VeRO report request for the item failed.
     * 					
     * 
     */
    @XmlEnumValue("SubmissionFailed")
    SUBMISSION_FAILED("SubmissionFailed"),

    /**
     * 
     * 						(out) The VeRO report request for the item has been received by eBay, but 
     * 						additional clarification is needed before eBay can end the item. 
     * 					
     * 
     */
    @XmlEnumValue("ClarificationRequired")
    CLARIFICATION_REQUIRED("ClarificationRequired"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    VeROItemStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VeROItemStatusCodeType fromValue(String v) {
        for (VeROItemStatusCodeType c: VeROItemStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
