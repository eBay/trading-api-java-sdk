
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReferenceCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionReferenceCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ExternalTransactionID"/>
 *     &lt;enumeration value="MandateReferenceNumber"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TransactionReferenceCodeType")
@XmlEnum
public enum TransactionReferenceCodeType {


    /**
     * 
     * 						This value is the unique identifier of an external payment transaction.
     * 					
     * 
     */
    @XmlEnumValue("ExternalTransactionID")
    EXTERNAL_TRANSACTION_ID("ExternalTransactionID"),

    /**
     * 
     * 						No longer applicable as the eBay Now service is no longer available to buyers and sellers.
     * 					
     * 
     */
    @XmlEnumValue("MandateReferenceNumber")
    MANDATE_REFERENCE_NUMBER("MandateReferenceNumber"),

    /**
     * 
     * 						This value is reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TransactionReferenceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionReferenceCodeType fromValue(String v) {
        for (TransactionReferenceCodeType c: TransactionReferenceCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
