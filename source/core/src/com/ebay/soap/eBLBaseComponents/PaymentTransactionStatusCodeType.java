
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTransactionStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTransactionStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Succeeded"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaymentTransactionStatusCodeType")
@XmlEnum
public enum PaymentTransactionStatusCodeType {


    /**
     * 
     * 						This value indicates that the payment transaction failed.
     * 					
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * 
     * 						This value indicates that the payment transaction succeeded. If the payment transaction is a buyer's payment for an order, once this <code>Succeeded</code> value is returned in an order management call, it is safe for the seller to ship the order to the buyer.
     * 						<br><br>
     * 							<span class="tablenote"><b>Note: </b> Previously, the <code>Succeeded</code> value would automatically get returned for order payment transactions that were occurring off of eBay's platform. As of March 2020, the <code>Pending</code> value will get returned instead for order payment transactions occurring off of eBay's platform, and the seller can use the <b>CompleteSale</b> call to mark the order as paid. Once the seller does this, the payment status will change from <code>Pending</code> to <code>Succeeded</code>.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Succeeded")
    SUCCEEDED("Succeeded"),

    /**
     * 
     * 						This value indicates that the payment transaction is pending.
     * 						<br><br>
     * 							<span class="tablenote"><b>Note: </b> Previously, the <code>Succeeded</code> value would automatically get returned for order payment transactions that were occurring off of eBay's platform. As of March 2020, the <code>Pending</code> value will get returned instead for order payment transactions occurring off of eBay's platform, and the seller can use the <b>CompleteSale</b> call to mark the order as paid. Once the seller does this, the payment status will change from <code>Pending</code> to <code>Succeeded</code>.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PaymentTransactionStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTransactionStatusCodeType fromValue(String v) {
        for (PaymentTransactionStatusCodeType c: PaymentTransactionStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
