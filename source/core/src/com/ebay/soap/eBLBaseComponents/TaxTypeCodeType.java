
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SalesTax"/>
 *     &lt;enumeration value="WasteRecyclingFee"/>
 *     &lt;enumeration value="GST"/>
 *     &lt;enumeration value="ImportVAT"/>
 *     &lt;enumeration value="VAT"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "TaxTypeCodeType")
@XmlEnum
public enum TaxTypeCodeType {


    /**
     * 
     *             This enumeration value indicates that standard sales tax was charged to the buyer against the order line item.
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
    @XmlEnumValue("WasteRecyclingFee")
    WASTE_RECYCLING_FEE("WasteRecyclingFee"),

    /**
     * 
     * 						This enumeration value indicates that a Goods and Services import tax was charged to the buyer against the order line item.
     * 						<br/><br/>
     * 						This tax type is only applicable for items being sold by Australian or New Zealand sellers.
     * 					
     * 
     */
    GST("GST"),

    /**
     * 
     * 						This enumeration value indicates that French VAT tax was charged to the buyer against the order line item.
     * 						<br/><br/>
     * 						This tax type is only applicable for items sold on the eBay France marketplaces.
     * 					
     * 
     */
    @XmlEnumValue("ImportVAT")
    IMPORT_VAT("ImportVAT"),

    /**
     * 
     * 						This enumeration value indicates that European VAT tax was charged to the buyer against the order line item.
     * 						<br/><br/>
     * 						This enumeration applies to VAT tax on the UK marketplace, the Norway marketplace, and other EU marketplaces (except for France). 
     * 					
     * 
     */
    VAT("VAT"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TaxTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxTypeCodeType fromValue(String v) {
        for (TaxTypeCodeType c: TaxTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
