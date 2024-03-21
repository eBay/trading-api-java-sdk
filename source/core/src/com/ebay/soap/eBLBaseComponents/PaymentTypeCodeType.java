
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="SellerDeniedPayment"/>
 *     &lt;enumeration value="AdminReversal"/>
 *     &lt;enumeration value="AllOther"/>
 *     &lt;enumeration value="RentalExtension"/>
 *     &lt;enumeration value="RentalBuyout"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "PaymentTypeCodeType")
@XmlEnum
public enum PaymentTypeCodeType {


    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>PaymentTypeCodeType</b> and all of its values will no longer be applicable since the Half.com site has been shut down.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Sale")
    SALE("Sale"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>PaymentTypeCodeType</b> and all of its values will no longer be applicable since the Half.com site has been shut down.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Refund")
    REFUND("Refund"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>PaymentTypeCodeType</b> and all of its values will no longer be applicable since the Half.com site has been shut down.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("SellerDeniedPayment")
    SELLER_DENIED_PAYMENT("SellerDeniedPayment"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>PaymentTypeCodeType</b> and all of its values will no longer be applicable since the Half.com site has been shut down.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("AdminReversal")
    ADMIN_REVERSAL("AdminReversal"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>PaymentTypeCodeType</b> and all of its values will no longer be applicable since the Half.com site has been shut down.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("AllOther")
    ALL_OTHER("AllOther"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>PaymentTypeCodeType</b> and all of its values will no longer be applicable since the Half.com site has been shut down
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("RentalExtension")
    RENTAL_EXTENSION("RentalExtension"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>PaymentTypeCodeType</b> and all of its values will no longer be applicable since the Half.com site has been shut down.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("RentalBuyout")
    RENTAL_BUYOUT("RentalBuyout"),

    /**
     * 
     * 						<span class="tablenote"><b>Note: </b> <b>PaymentTypeCodeType</b> and all of its values will no longer be applicable since the Half.com site has been shut down.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PaymentTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTypeCodeType fromValue(String v) {
        for (PaymentTypeCodeType c: PaymentTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
