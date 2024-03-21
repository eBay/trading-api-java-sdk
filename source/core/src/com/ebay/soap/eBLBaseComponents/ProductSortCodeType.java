
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSortCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductSortCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PopularityAsc"/>
 *     &lt;enumeration value="PopularityDesc"/>
 *     &lt;enumeration value="RatingAsc"/>
 *     &lt;enumeration value="RatingDesc"/>
 *     &lt;enumeration value="ReviewCountAsc"/>
 *     &lt;enumeration value="ReviewCountDesc"/>
 *     &lt;enumeration value="ItemCountAsc"/>
 *     &lt;enumeration value="ItemCountDesc"/>
 *     &lt;enumeration value="TitleAsc"/>
 *     &lt;enumeration value="TitleDesc"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ProductSortCodeType")
@XmlEnum
public enum ProductSortCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("PopularityAsc")
    POPULARITY_ASC("PopularityAsc"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("PopularityDesc")
    POPULARITY_DESC("PopularityDesc"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("RatingAsc")
    RATING_ASC("RatingAsc"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("RatingDesc")
    RATING_DESC("RatingDesc"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ReviewCountAsc")
    REVIEW_COUNT_ASC("ReviewCountAsc"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ReviewCountDesc")
    REVIEW_COUNT_DESC("ReviewCountDesc"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ItemCountAsc")
    ITEM_COUNT_ASC("ItemCountAsc"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ItemCountDesc")
    ITEM_COUNT_DESC("ItemCountDesc"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("TitleAsc")
    TITLE_ASC("TitleAsc"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("TitleDesc")
    TITLE_DESC("TitleDesc"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductSortCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSortCodeType fromValue(String v) {
        for (ProductSortCodeType c: ProductSortCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
