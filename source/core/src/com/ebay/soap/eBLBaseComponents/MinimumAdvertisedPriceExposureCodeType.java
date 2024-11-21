
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinimumAdvertisedPriceExposureCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MinimumAdvertisedPriceExposureCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PreCheckout"/>
 *     &lt;enumeration value="DuringCheckout"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "MinimumAdvertisedPriceExposureCodeType")
@XmlEnum
public enum MinimumAdvertisedPriceExposureCodeType {


    /**
     * 
     * 						This enumeration value indicates that the buyer must add the item to his/her cart before the discounted price can be displayed. To enable this pricing treatment when adding/revising/relisting an item, include the <b>DiscountPriceInfo.MinimumAdvertisedPriceExposure</b> field in an Add/Revise/Relist calls and set its value to <code>PreCheckout</code>.
     * 					
     * 
     */
    @XmlEnumValue("PreCheckout")
    PRE_CHECKOUT("PreCheckout"),

    /**
     * 
     * 						This enumeration value indicates that the discounted price will only be shown to the buyer once the buyer reaches the eBay Checkout page. To enable this pricing treatment when adding/revising/relisting an item, include the <b>DiscountPriceInfo.MinimumAdvertisedPriceExposure</b> field in an Add/Revise/Relist calls and set its value to <code>DuringCheckout</code>.
     * 					
     * 
     */
    @XmlEnumValue("DuringCheckout")
    DURING_CHECKOUT("DuringCheckout"),

    /**
     * 
     * 						The value None is no longer valid. If provided in the request, it will be mapped to <code>PreCheckout</code>.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MinimumAdvertisedPriceExposureCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MinimumAdvertisedPriceExposureCodeType fromValue(String v) {
        for (MinimumAdvertisedPriceExposureCodeType c: MinimumAdvertisedPriceExposureCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
