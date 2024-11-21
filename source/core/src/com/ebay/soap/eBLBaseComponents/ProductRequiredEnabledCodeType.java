
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductRequiredEnabledCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductRequiredEnabledCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ProductRequiredEnabledCodeType")
@XmlEnum
public enum ProductRequiredEnabledCodeType {


    /**
     * 
     * 						This value indicates that the category does not require product-based listings (associated with an eBay catalog product).
     * 						<br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b>
     * 						Due to the rollback of the Product-Based Shopping Experience mandate for all eBay categories, this value should get returned for <b>SiteDefaults</b> and all <b>Category</b> nodes.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						This value indicates that the category requires listings within the category to be associated with an eBay catalog product.
     * 						<br>
     * 						<br>
     * 						<span class="tablenote"><b>Note:</b>
     * 						Due to the rollback of the Product-Based Shopping Experience mandate for all eBay categories, this value should never get returned for <b>SiteDefaults</b> or for any <b>Category</b> nodes.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 				  
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductRequiredEnabledCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductRequiredEnabledCodeType fromValue(String v) {
        for (ProductRequiredEnabledCodeType c: ProductRequiredEnabledCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
