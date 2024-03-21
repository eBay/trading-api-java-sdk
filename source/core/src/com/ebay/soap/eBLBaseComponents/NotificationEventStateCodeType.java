
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationEventStateCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationEventStateCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="MarkedDown"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="FailedPending"/>
 *     &lt;enumeration value="MarkedDownPending"/>
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="Undeliverable"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Canceled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "NotificationEventStateCodeType")
@XmlEnum
public enum NotificationEventStateCodeType {


    /**
     * 
     * 						Status indicating the notification is newly created
     * 					
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * 
     * 						Status indicating the notification was failed
     * 					
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * 
     * 						Status indicating the end user application is marked down
     * 					
     * 
     */
    @XmlEnumValue("MarkedDown")
    MARKED_DOWN("MarkedDown"),

    /**
     * 
     * 						Status indicating the notification is pending
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						Status indicating the notification is failed pending
     * 					
     * 
     */
    @XmlEnumValue("FailedPending")
    FAILED_PENDING("FailedPending"),

    /**
     * 
     * 						Status indicating the notification is marked down pending
     * 					
     * 
     */
    @XmlEnumValue("MarkedDownPending")
    MARKED_DOWN_PENDING("MarkedDownPending"),

    /**
     * 
     * 						Status indicating the notification was successfully delivered
     * 					
     * 
     */
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),

    /**
     * 
     * 						Status indicating the notification was unable to deliver
     * 					
     * 
     */
    @XmlEnumValue("Undeliverable")
    UNDELIVERABLE("Undeliverable"),

    /**
     * 
     * 						Status indicating the notification was rejected
     * 					
     * 
     */
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),

    /**
     * 
     * 						Status indicating the notification was cancelled
     * 					
     * 
     */
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),

    /**
     * 
     * 						Reserved for future internal or external use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    NotificationEventStateCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationEventStateCodeType fromValue(String v) {
        for (NotificationEventStateCodeType c: NotificationEventStateCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
