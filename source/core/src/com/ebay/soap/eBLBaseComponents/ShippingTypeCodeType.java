
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Flat"/>
 *     &lt;enumeration value="Calculated"/>
 *     &lt;enumeration value="Freight"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="FlatDomesticCalculatedInternational"/>
 *     &lt;enumeration value="CalculatedDomesticFlatInternational"/>
 *     &lt;enumeration value="FreightFlat"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ShippingTypeCodeType")
@XmlEnum
public enum ShippingTypeCodeType {


    /**
     * 
     * 						Flat shipping model: the seller establishes the cost of shipping and cost of shipping insurance, regardless of what any buyer-selected shipping service might charge the seller.
     * 						<br/><br/>
     * 						<span class="tablenote">
     * 						<strong>Note:</strong> This shipping type includes an option for a <em>Flat Rate Freight</em> shipping service. For details about freight shipping, see <a href="https://developer.ebay.com/api-docs/user-guides/static/trading-user-guide/shipping-types-rates.html#SpecifyingFreightShipping">Specifying Freight Shipping</a> in the eBay Features Guide.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Flat")
    FLAT("Flat"),

    /**
     * 
     * 						Calculated shipping model: the cost of shipping is
     * 						determined in large part by the seller-offered and
     * 						buyer-selected shipping service. The seller might assess an
     * 						additional fee via PackagingHandlingCosts.
     * 					
     * 
     */
    @XmlEnumValue("Calculated")
    CALCULATED("Calculated"),

    /**
     * 
     * 						Freight shipping model. Available only for US domestic shipping. The cost of shipping is automatically determined by an affiliated third party, FreightQuote.com, based on the item location (postal code).
     * 						<br/><br/>
     * 						<span class="tablenote">
     * 						<strong>Note:</strong> This shipping type cannot be set via API, but it is automatically set by eBay when a buyer selects the FreightQuote.com option on the US eBay website.
     * 						<br/><br/>
     * 						For details about types of freight shipping that you can specify via API, see <a href="https://developer.ebay.com/api-docs/user-guides/static/trading-user-guide/shipping-freight.html" target="_blank"> Freight shipping</a> in the Trading API User Guide.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("Freight")
    FREIGHT("Freight"),

    /**
     * 
     * 						Free shipping.
     * 						This field is output-only so if you want to use AddItem to specify a free
     * 						Shipping Cost, specify 0 in
     * 						Item.ShippingDetails.ShippingServiceOptions.ShippingServiceCost.
     * 					
     * 
     */
    @XmlEnumValue("Free")
    FREE("Free"),

    /**
     * 
     * 						The seller did not specify the shipping type.
     * 					
     * 
     */
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),

    /**
     * 
     * 						The seller specified one or more flat domestic shipping services
     * 						and one or more calculated international shipping services.
     * 					
     * 
     */
    @XmlEnumValue("FlatDomesticCalculatedInternational")
    FLAT_DOMESTIC_CALCULATED_INTERNATIONAL("FlatDomesticCalculatedInternational"),

    /**
     * 
     * 						The seller specified one or more calculated domestic shipping services
     * 						and one or more flat international shipping services.
     * 					
     * 
     */
    @XmlEnumValue("CalculatedDomesticFlatInternational")
    CALCULATED_DOMESTIC_FLAT_INTERNATIONAL("CalculatedDomesticFlatInternational"),

    /**
     * 
     * 						Freight shipping model. Available only for the US, UK, AU, CA and CAFR sites, and only for domestic shipping. <code>FreightFlat</code> applies to shipping with carriers that are not affiliated with eBay. It is negotiated freight, not a flat rate. Sellers negotiate the shipping cost with their chosen carrier and the buyer before completing the sale. FreightFlat shipping may be used when calculated shipping cannot be used due to the greater weight of the item.
     * 						<br/><br/>
     * 						For details about freight shipping, see <a href="https://developer.ebay.com/api-docs/user-guides/static/trading-user-guide/shipping-freight.html" target="_blank">Freight shipping</a> in the Trading API User Guide.
     * 					
     * 
     */
    @XmlEnumValue("FreightFlat")
    FREIGHT_FLAT("FreightFlat"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingTypeCodeType fromValue(String v) {
        for (ShippingTypeCodeType c: ShippingTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
