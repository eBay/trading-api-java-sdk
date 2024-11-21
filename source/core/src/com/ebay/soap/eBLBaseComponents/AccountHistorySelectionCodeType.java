
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountHistorySelectionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountHistorySelectionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LastInvoice"/>
 *     &lt;enumeration value="SpecifiedInvoice"/>
 *     &lt;enumeration value="BetweenSpecifiedDates"/>
 *     &lt;enumeration value="OrderId"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "AccountHistorySelectionCodeType")
@XmlEnum
public enum AccountHistorySelectionCodeType {


    /**
     * 
     * 						This value should be used if the eBay user wants to see the account entries posted to the last invoice that was sent to the user by eBay. If this value is used, the <b>InvoiceDate</b>, <b>BeginDate</b>, and <b>EndDate</b> fields of the <b>GetAccount</b> request are no longer applicable and will be ignored if they are included in the call request.
     * 					
     * 
     */
    @XmlEnumValue("LastInvoice")
    LAST_INVOICE("LastInvoice"),

    /**
     * 
     * 						This value is no longer applicable or supported, and an error occurs if it is used. As an alternative, users can use <code>BetweenSpecifiedDates</code> instead.
     * 					
     * 
     */
    @XmlEnumValue("SpecifiedInvoice")
    SPECIFIED_INVOICE("SpecifiedInvoice"),

    /**
     * 
     * 						This value should be used if the eBay user wants to see account entries for a customized date range that can overlap multiple formal eBay invoices. If this value is used, then you also must specify <b>BeginDate</b> and <b>EndDate</b> to set the date range for which to retrieve account entries. If this value is used, then <b>InvoiceDate</b> is no longer applicable and will be ignored if it is included in the call request.
     * 					
     * 
     */
    @XmlEnumValue("BetweenSpecifiedDates")
    BETWEEN_SPECIFIED_DATES("BetweenSpecifiedDates"),

    /**
     * 
     * 						This value should be used if the eBay user wants to see the account entries related to a specific eBay order. If this value is used, the user must also include the <b>OrderID</b> field and sets its value to the identifier of the order for which they wish to retrieve account entries.
     * 					
     * 
     */
    @XmlEnumValue("OrderId")
    ORDER_ID("OrderId"),

    /**
     * 
     * 						 (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AccountHistorySelectionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountHistorySelectionCodeType fromValue(String v) {
        for (AccountHistorySelectionCodeType c: AccountHistorySelectionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
