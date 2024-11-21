
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionPlatformCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionPlatformCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="eBay"/>
 *     &lt;enumeration value="Express"/>
 *     &lt;enumeration value="Half"/>
 *     &lt;enumeration value="Shopping"/>
 *     &lt;enumeration value="WorldOfGood"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TransactionPlatformCodeType")
@XmlEnum
public enum TransactionPlatformCodeType {


    /**
     * 
     * 						This value indicates the purchase occurred on an eBay marketplace site.
     * 					
     * 
     */
    @XmlEnumValue("eBay")
    E_BAY("eBay"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> eBay Express no longer exists.
     * 						</span>
     * 						The order line item was created on the eBay Express site.
     * 					
     * 
     */
    @XmlEnumValue("Express")
    EXPRESS("Express"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> Half.com listings will no longer be supported in APIs.
     * 						</span>
     * 						The order line item was created on Half.com site.
     * 					
     * 
     */
    @XmlEnumValue("Half")
    HALF("Half"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> Shopping.com listings are no longer supported in APIs.
     * 						</span>
     * 						The order line item was created on the Shopping.com site.
     * 					
     * 
     */
    @XmlEnumValue("Shopping")
    SHOPPING("Shopping"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> World Of Good is no longer associated with eBay.
     * 						</span>
     * 						The order line item was created on the WorldOfGood site.
     * 					
     * 
     */
    @XmlEnumValue("WorldOfGood")
    WORLD_OF_GOOD("WorldOfGood"),

    /**
     * 
     * 						 Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TransactionPlatformCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionPlatformCodeType fromValue(String v) {
        for (TransactionPlatformCodeType c: TransactionPlatformCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
