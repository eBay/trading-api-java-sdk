
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerDashboardAlertSeverityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerDashboardAlertSeverityCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Informational"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="StrongWarning"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellerDashboardAlertSeverityCodeType")
@XmlEnum
public enum SellerDashboardAlertSeverityCodeType {


    /**
     * 
     * 						The alert message is informational in nature.
     * 						<br><br>
     * 						Some examples: you might get a PowerSeller status message if your PowerSeller
     * 						level has been increased, a policy-compliance message if you have no recent
     * 						policy violations, a buyer-satisfaction message if you are providing excellent
     * 						customer service, or a seller-account message if there is a new notice available
     * 						about your payment status.
     * 					
     * 
     */
    @XmlEnumValue("Informational")
    INFORMATIONAL("Informational"),

    /**
     * 
     * 						The alert message is a warning that identifies a problem.
     * 						<br><br>
     * 						For example, you might get a PowerSeller status warning if you missed the 
     * 						PowerSeller sales requirements in the past month. Or you might get a
     * 						policy-compliance warning if you recently listed an item with excessive
     * 						shipping costs, or a seller-account warning if a collections message 
     * 						asks you to pay now to make sure no restrictions are placed on your account.
     * 					
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     * 						The alert message is a strong warning that indicates a serious problem.
     * 						<br><br>
     * 						For example, you might get a PowerSeller status strong warning if you have lost
     * 						your PowerSeller status because of policy violations, or you might get a
     * 						policy-compliance strong warning if your account has been restricted.
     * 					
     * 
     */
    @XmlEnumValue("StrongWarning")
    STRONG_WARNING("StrongWarning"),

    /**
     * 
     * 						Reserved for internal (or future) use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerDashboardAlertSeverityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerDashboardAlertSeverityCodeType fromValue(String v) {
        for (SellerDashboardAlertSeverityCodeType c: SellerDashboardAlertSeverityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
