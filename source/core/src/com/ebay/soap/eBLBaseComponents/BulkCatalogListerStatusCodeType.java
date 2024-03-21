
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BulkCatalogListerStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BulkCatalogListerStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Preapproved"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="OnWatch"/>
 *     &lt;enumeration value="OnHold"/>
 *     &lt;enumeration value="Suspended"/>
 *     &lt;enumeration value="WatchWarn"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "BulkCatalogListerStatusCodeType")
@XmlEnum
public enum BulkCatalogListerStatusCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Preapproved")
    PREAPPROVED("Preapproved"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("OnWatch")
    ON_WATCH("OnWatch"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("WatchWarn")
    WATCH_WARN("WatchWarn"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BulkCatalogListerStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BulkCatalogListerStatusCodeType fromValue(String v) {
        for (BulkCatalogListerStatusCodeType c: BulkCatalogListerStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
