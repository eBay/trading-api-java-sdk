
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The <b>GetItem</b> call returns listing data such as title, description, price information, user information, and so on, for the specified <b>ItemID</b>.
 * 			
 * 
 * <p>Java class for GetItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="IncludeWatchCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeCrossPromotion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeItemSpecifics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeTaxTable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SKU" type="{urn:ebay:apis:eBLBaseComponents}SKUType" minOccurs="0"/>
 *         &lt;element name="VariationSKU" type="{urn:ebay:apis:eBLBaseComponents}SKUType" minOccurs="0"/>
 *         &lt;element name="VariationSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeItemCompatibilityList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemRequestType", propOrder = {
    "itemID",
    "includeWatchCount",
    "includeCrossPromotion",
    "includeItemSpecifics",
    "includeTaxTable",
    "sku",
    "variationSKU",
    "variationSpecifics",
    "transactionID",
    "includeItemCompatibilityList"
})
public class GetItemRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "IncludeWatchCount")
    protected Boolean includeWatchCount;
    @XmlElement(name = "IncludeCrossPromotion")
    protected Boolean includeCrossPromotion;
    @XmlElement(name = "IncludeItemSpecifics")
    protected Boolean includeItemSpecifics;
    @XmlElement(name = "IncludeTaxTable")
    protected Boolean includeTaxTable;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "VariationSKU")
    protected String variationSKU;
    @XmlElement(name = "VariationSpecifics")
    protected NameValueListArrayType variationSpecifics;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "IncludeItemCompatibilityList")
    protected Boolean includeItemCompatibilityList;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the includeWatchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeWatchCount() {
        return includeWatchCount;
    }

    /**
     * Sets the value of the includeWatchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeWatchCount(Boolean value) {
        this.includeWatchCount = value;
    }

    /**
     * Gets the value of the includeCrossPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCrossPromotion() {
        return includeCrossPromotion;
    }

    /**
     * Sets the value of the includeCrossPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCrossPromotion(Boolean value) {
        this.includeCrossPromotion = value;
    }

    /**
     * Gets the value of the includeItemSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeItemSpecifics() {
        return includeItemSpecifics;
    }

    /**
     * Sets the value of the includeItemSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeItemSpecifics(Boolean value) {
        this.includeItemSpecifics = value;
    }

    /**
     * Gets the value of the includeTaxTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTaxTable() {
        return includeTaxTable;
    }

    /**
     * Sets the value of the includeTaxTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTaxTable(Boolean value) {
        this.includeTaxTable = value;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * Gets the value of the variationSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationSKU() {
        return variationSKU;
    }

    /**
     * Sets the value of the variationSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationSKU(String value) {
        this.variationSKU = value;
    }

    /**
     * Gets the value of the variationSpecifics property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getVariationSpecifics() {
        return variationSpecifics;
    }

    /**
     * Sets the value of the variationSpecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setVariationSpecifics(NameValueListArrayType value) {
        this.variationSpecifics = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the includeItemCompatibilityList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeItemCompatibilityList() {
        return includeItemCompatibilityList;
    }

    /**
     * Sets the value of the includeItemCompatibilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeItemCompatibilityList(Boolean value) {
        this.includeItemCompatibilityList = value;
    }

}
