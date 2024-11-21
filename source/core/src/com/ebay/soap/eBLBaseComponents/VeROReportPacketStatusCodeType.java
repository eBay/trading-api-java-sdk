
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VeROReportPacketStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VeROReportPacketStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Received"/>
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="Processed"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "VeROReportPacketStatusCodeType")
@XmlEnum
public enum VeROReportPacketStatusCodeType {


    /**
     * 
     * 						This value indicates that the VeRO Report packet has been received by eBay.
     * 					
     * 
     */
    @XmlEnumValue("Received")
    RECEIVED("Received"),

    /**
     * 
     * 						This value indicates that eBay is in the process of reviewing the VeRO Report packet. For a VeRO Report packet consisting of multiple items, the call user can look at the <b>ReportedItemDetails</b> container in the <b>GetVeROReportStatus</b> response to get more details about individual items in the VeRO Report packet.
     * 					
     * 
     */
    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),

    /**
     * 
     * 						This value indicates that the VeRO Report packet has been processed by eBay.
     * 					
     * 
     */
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    VeROReportPacketStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VeROReportPacketStatusCodeType fromValue(String v) {
        for (VeROReportPacketStatusCodeType c: VeROReportPacketStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
