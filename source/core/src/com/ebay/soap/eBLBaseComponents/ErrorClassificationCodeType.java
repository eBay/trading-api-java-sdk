
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorClassificationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorClassificationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="RequestError"/>
 *     &lt;enumeration value="SystemError"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ErrorClassificationCodeType")
@XmlEnum
public enum ErrorClassificationCodeType {


    /**
     * 
     * 						An error has occurred either as a result of a problem in the sending
     * 						application or because the application's end-user has attempted to submit
     * 						invalid data (or missing data). In these cases, do not retry the request. The
     * 						problem must be corrected before the request can be made again. If the problem
     * 						is due to something in the application (such as a missing required field), the
     * 						application must be changed. If the problem is a result of end-user data, the
     * 						application must alert the end-user to the problem and provide the means for
     * 						the end-user to correct the data. Once the problem in the application or data
     * 						is resolved, resend the request to eBay with the corrected data.
     * 					
     * 
     */
    @XmlEnumValue("RequestError")
    REQUEST_ERROR("RequestError"),

    /**
     * 
     * 						Indicates that an error has occurred on the eBay system side, such as a
     * 						database or server down. An application can retry the request as-is a
     * 						reasonable number of times (eBay recommends twice). If the error persists,
     * 						contact Developer Technical Support. Once the problem has been resolved, the
     * 						request may be resent in its original form.
     * 					
     * 
     */
    @XmlEnumValue("SystemError")
    SYSTEM_ERROR("SystemError"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ErrorClassificationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorClassificationCodeType fromValue(String v) {
        for (ErrorClassificationCodeType c: ErrorClassificationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
