
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorHandlingCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorHandlingCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Legacy"/>
 *     &lt;enumeration value="BestEffort"/>
 *     &lt;enumeration value="AllOrNothing"/>
 *     &lt;enumeration value="FailOnError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ErrorHandlingCodeType")
@XmlEnum
public enum ErrorHandlingCodeType {


    /**
     * 
     * 						Apply validation rules that were in effect prior to the time
     * 						the call started supporting <b>ErrorHandling</b>.
     * 					
     * 
     */
    @XmlEnumValue("Legacy")
    LEGACY("Legacy"),

    /**
     * 
     * 						Drop the invalid data, continue processing the request with the
     * 						valid data. If dropping the invalid data leaves the request in a
     * 						state where required data is missing, reject the request.<br>
     * 						<br>
     * 						If <b>BestEffort</b> is specified for <b>CompleteSale</b>, the Ack field in the
     * 						response could return PartialFailure if one change fails but
     * 						another succeeds. For example, if the seller attempts to
     * 						leave feedback twice for the same order line item, the feedback changes
     * 						would fail but any paid or shipped status changes would succeed.
     * 					
     * 
     */
    @XmlEnumValue("BestEffort")
    BEST_EFFORT("BestEffort"),

    /**
     * 
     * 						If any of the item specifics data is invalid, drop all the data and
     * 						proceed with listing the item. If the category has required item specifics
     * 						and the data was dropped, reject the listing.
     * 					
     * 
     */
    @XmlEnumValue("AllOrNothing")
    ALL_OR_NOTHING("AllOrNothing"),

    /**
     * 
     * 						If any data is invalid, reject the request.
     * 					
     * 
     */
    @XmlEnumValue("FailOnError")
    FAIL_ON_ERROR("FailOnError");
    private final String value;

    ErrorHandlingCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorHandlingCodeType fromValue(String v) {
        for (ErrorHandlingCodeType c: ErrorHandlingCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
