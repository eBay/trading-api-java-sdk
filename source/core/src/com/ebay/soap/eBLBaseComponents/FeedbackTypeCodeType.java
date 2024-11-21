
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedbackTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedbackTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FeedbackReceivedAsSeller"/>
 *     &lt;enumeration value="FeedbackReceivedAsBuyer"/>
 *     &lt;enumeration value="FeedbackReceived"/>
 *     &lt;enumeration value="FeedbackLeft"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "FeedbackTypeCodeType")
@XmlEnum
public enum FeedbackTypeCodeType {


    /**
     * 
     * 						This enumeration value will be used in the <b>FeedbackType</b> field of a <b>GetFeedback</b> call if the user only wants to retrieve the Feedback data that they have received acting as a seller.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceivedAsSeller")
    FEEDBACK_RECEIVED_AS_SELLER("FeedbackReceivedAsSeller"),

    /**
     * 
     * 						This enumeration value will be used in the <b>FeedbackType</b> field of a <b>GetFeedback</b> call if the user only wants to retrieve the Feedback data that they have received acting as a buyer.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceivedAsBuyer")
    FEEDBACK_RECEIVED_AS_BUYER("FeedbackReceivedAsBuyer"),

    /**
     * 
     * 						This enumeration value will be used in the <b>FeedbackType</b> field of a <b>GetFeedback</b> call if the user wants to retrieve the Feedback data that they have received acting as a seller and buyer.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackReceived")
    FEEDBACK_RECEIVED("FeedbackReceived"),

    /**
     * 
     * 						This enumeration value will be used in the <b>FeedbackType</b> field of a <b>GetFeedback</b> call if the user wants to retrieve the Feedback they have left for their order partners while acting as a seller or buyer.
     * 					
     * 
     */
    @XmlEnumValue("FeedbackLeft")
    FEEDBACK_LEFT("FeedbackLeft"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FeedbackTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedbackTypeCodeType fromValue(String v) {
        for (FeedbackTypeCodeType c: FeedbackTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
