
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeverityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SeverityCodeType")
@XmlEnum
public enum SeverityCodeType {


    /**
     * 
     * 					   The request was processed successfully, but something occurred that may affect your application or the user. For example, eBay may have changed a value the user sent in. In this case, eBay returns a normal, successful response and also returns the warning.
     * 							<br/><br/>
     * 						 When a warning occurs, the error is returned in addition to the business data. In this case, you do not need to retry the request (as the original request was successful). However, depending on the cause or nature of the warning, you might need to contact either the end user or eBay to effect a long term solution to the problem to prevent it from reoccurring in the future.
     * 				   
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     * 					   The request that triggered the error was not processed successfully. When a serious application-level error occurs, the error is returned instead of the business data.
     * 						 <br/><br/>
     * 						 If the source of the problem is within the application (such as a missing required element), change the application before you retry the request.
     * 						 <ul>
     * 						 <li>If the problem is due to end-user input data, please alert the end-user to the problem and provide the means for them to correct the data. Once the problem in the application or data is resolved, you can attempt to re-send the request to eBay.
     * 						 </li>
     * 						 <li>If the source of the problem is on eBay's side, An application can retry the request as-is a reasonable number of times (eBay recommends twice). If the error persists, contact Developer Technical Support. Once the problem has been resolved, the request may be resent in its original form.
     * 						 </li>
     * 						 </ul>
     * 						 <br/><br/>
     * 						 See the <a href="https://developer.ebay.com/api-docs/user-guides/static/make-a-call/error-handling.html">Error handling</a> section of the
     * 						 Making a Trading API call guide for more information.
     * 					
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SeverityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityCodeType fromValue(String v) {
        for (SeverityCodeType c: SeverityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
