
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductIdentiferEnabledCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductIdentiferEnabledCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="Enabled"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ProductIdentiferEnabledCodeType")
@XmlEnum
public enum ProductIdentiferEnabledCodeType {


    /**
     * 
     * 						This enumeration value indicates that a product identifier (EAN, ISBN, UPC) may not be used to help create a listing. If returned at the site level (<b>SiteDefaults</b> container), most categories on the site (specified in the X-EBAY-API-SITEID) do not support the use of product identifiers. If returned at the category level (<b>Category</b> nodes), that specific category does not support the use of product identifiers.
     * 					
     * 
     */
    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),

    /**
     * 
     * 						This enumeration value indicates that a product identifier (EAN, ISBN, UPC) may be used to help create a listing. If returned at the site level (<b>SiteDefaults</b> container), most categories on the site (specified in the X-EBAY-API-SITEID) support the use of product identifiers. If returned at the category level (<b>Category</b> nodes), that specific category supports the use of product identifiers.
     * 					
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),

    /**
     * 
     * 						This enumeration value indicates that a product identifier (EAN, ISBN, UPC) is required when creating a listing. If returned at the site level (<b>SiteDefaults</b> container), most categories on the site (specified in the X-EBAY-API-SITEID) require the use of product identifiers. If returned at the category level (<b>Category</b> nodes), that specific category requires the use of product identifiers when creating a listing.
     * 					
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * 
     * 						This value is for future use.
     * 				  
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductIdentiferEnabledCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductIdentiferEnabledCodeType fromValue(String v) {
        for (ProductIdentiferEnabledCodeType c: ProductIdentiferEnabledCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
