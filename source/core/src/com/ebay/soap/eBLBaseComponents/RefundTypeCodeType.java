
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="FullPlusShipping"/>
 *     &lt;enumeration value="CustomOrPartial"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RefundTypeCodeType")
@XmlEnum
public enum RefundTypeCodeType {


    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>RefundTypeCodeType</b> and all of its values are no longer applicable since the Half.com site has been shut down.
     * 						</span>
     * 						The seller has issued a refund for the transaction price that
     * 						was originally paid to the seller.
     * 						(The seller's shipping reimbursement is not included
     * 						if Half.com calculates the refund amount).
     * 					
     * 
     */
    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>RefundTypeCodeType</b> and all of its values are no longer applicable since the Half.com site has been shut down.
     * 						</span>
     * 						The seller has issued a refund for the transaction price and
     * 						shipping reimbursement that was originally paid to the seller.
     * 						(The buyer's return shipping costs
     * 						might not be included if Half.com calculates the refund amount.)
     * 					
     * 
     */
    @XmlEnumValue("FullPlusShipping")
    FULL_PLUS_SHIPPING("FullPlusShipping"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>RefundTypeCodeType</b> and all of its values are no longer applicable since the Half.com site has been shut down.
     * 						</span>
     * 						The seller has issued a refund amount that is different from
     * 						the full refund (with or without shipping). If specified,
     * 						it may be helpful to explain the amount in your note to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("CustomOrPartial")
    CUSTOM_OR_PARTIAL("CustomOrPartial"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>RefundTypeCodeType</b> and all of its values are no longer applicable since the Half.com site has been shut down.
     * 						</span>
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundTypeCodeType fromValue(String v) {
        for (RefundTypeCodeType c: RefundTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
