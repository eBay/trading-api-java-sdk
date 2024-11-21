
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxDescriptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxDescriptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SalesTax"/>
 *     &lt;enumeration value="ElectronicWasteRecyclingFee"/>
 *     &lt;enumeration value="TireRecyclingFee"/>
 *     &lt;enumeration value="GST"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TaxDescriptionCodeType")
@XmlEnum
public enum TaxDescriptionCodeType {


    /**
     * 
     *            This enumeration value indicates that standard sales tax was charged to the buyer against the order line item.
     *           
     * 
     */
    @XmlEnumValue("SalesTax")
    SALES_TAX("SalesTax"),

    /**
     * 
     *             This enumeration value indicates that an electronic waste recycling fee was charged to the buyer against the order line item.
     *           
     * 
     */
    @XmlEnumValue("ElectronicWasteRecyclingFee")
    ELECTRONIC_WASTE_RECYCLING_FEE("ElectronicWasteRecyclingFee"),

    /**
     * 
     *             This enumeration value indicates that a tire recycling fee was charged to the buyer against the order line item.
     *           
     * 
     */
    @XmlEnumValue("TireRecyclingFee")
    TIRE_RECYCLING_FEE("TireRecyclingFee"),

    /**
     * 
     * 						This enumeration value indicates that a Goods and Services import tax was charged to the buyer against the order line item.
     * 						<br/><br/>
     * 						<span class="tablenote"><b>Note: </b> At this time, this tax type is only applicable to the Australia site.
     * 						</span>
     * 					
     * 
     */
    GST("GST"),

    /**
     * 
     *             Reserved for internal or future use.
     *           
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TaxDescriptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxDescriptionCodeType fromValue(String v) {
        for (TaxDescriptionCodeType c: TaxDescriptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
