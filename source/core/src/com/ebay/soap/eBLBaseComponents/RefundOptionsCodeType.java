
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundOptionsCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundOptionsCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MoneyBack"/>
 *     &lt;enumeration value="Exchange"/>
 *     &lt;enumeration value="MerchandiseCredit"/>
 *     &lt;enumeration value="MoneyBackOrExchange"/>
 *     &lt;enumeration value="MoneyBackOrReplacement"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RefundOptionsCodeType")
@XmlEnum
public enum RefundOptionsCodeType {


    /**
     * 
     * 						This value indicates that the seller will refund the buyer the cost of the item, excluding shipping and handling costs.
     * 					
     * 
     */
    @XmlEnumValue("MoneyBack")
    MONEY_BACK("MoneyBack"),

    /**
     * 
     * 						This value is deprecated since receiving money back must always be one of the options in a return policy and not just exchanging the item. If a seller wants to make an exchange one of the options, the <code>MoneyBackOrExchange</code> option should be used.
     * 					
     * 
     */
    @XmlEnumValue("Exchange")
    EXCHANGE("Exchange"),

    /**
     * 
     * 						This value is deprecated since receiving money back must always be one of the options in a return policy and not just store credit.
     * 					
     * 
     */
    @XmlEnumValue("MerchandiseCredit")
    MERCHANDISE_CREDIT("MerchandiseCredit"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This value has been deprecated and US sellers that are willing to refund buyers or offer an identical replacement item should use the <code>MoneyBackOrReplacement</code> value instead.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("MoneyBackOrExchange")
    MONEY_BACK_OR_EXCHANGE("MoneyBackOrExchange"),

    /**
     * 
     * 						<span class="tablenote"><b>Note:</b>
     * 						This value is only available on the US site. US sellers should use this value if they are willing to refund buyers or offer an identical replacement item.
     * 						</span>
     * 						This value indicates that the seller will refund the buyer the cost of the item (excluding shipping and handling costs) through eBay returns, or the seller will replace the returned item with another identical item if the buyer prefers this.
     * 					
     * 
     */
    @XmlEnumValue("MoneyBackOrReplacement")
    MONEY_BACK_OR_REPLACEMENT("MoneyBackOrReplacement"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundOptionsCodeType fromValue(String v) {
        for (RefundOptionsCodeType c: RefundOptionsCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
