
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenReturnMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TokenReturnMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Redirect"/>
 *     &lt;enumeration value="FetchToken"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TokenReturnMethodCodeType")
@XmlEnum
public enum TokenReturnMethodCodeType {


    /**
     * 
     * 						Return the token in the HTTP redirect to the application-specified
     * 						accept URL.
     * 					
     * 
     */
    @XmlEnumValue("Redirect")
    REDIRECT("Redirect"),

    /**
     * 
     * 						Leave the token at eBay so that the application can get
     * 						the token through the FetchToken API call (SecretId required).
     * 					
     * 
     */
    @XmlEnumValue("FetchToken")
    FETCH_TOKEN("FetchToken"),

    /**
     * 
     * 						Reserved for future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TokenReturnMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TokenReturnMethodCodeType fromValue(String v) {
        for (TokenReturnMethodCodeType c: TokenReturnMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
