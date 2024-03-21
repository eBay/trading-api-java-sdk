
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns the listing recommendations (if applicable), the estimated fees for the proposed new listing (except the Final Value Fee, which isn't calculated until the item has sold), and other details.
 * 			
 * 
 * <p>Java class for VerifyAddFixedPriceItemResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyAddFixedPriceItemResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="SKU" type="{urn:ebay:apis:eBLBaseComponents}SKUType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{urn:ebay:apis:eBLBaseComponents}FeesType" minOccurs="0"/>
 *         &lt;element name="ExpressListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExpressItemRequirements" type="{urn:ebay:apis:eBLBaseComponents}ExpressItemRequirementsType" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category2ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountReason" type="{urn:ebay:apis:eBLBaseComponents}DiscountReasonCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyAddFixedPriceItemResponseType", propOrder = {
    "itemID",
    "sku",
    "fees",
    "expressListing",
    "expressItemRequirements",
    "categoryID",
    "category2ID",
    "discountReason"
})
public class VerifyAddFixedPriceItemResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "Fees")
    protected FeesType fees;
    @XmlElement(name = "ExpressListing")
    protected Boolean expressListing;
    @XmlElement(name = "ExpressItemRequirements")
    protected ExpressItemRequirementsType expressItemRequirements;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "Category2ID")
    protected String category2ID;
    @XmlElement(name = "DiscountReason")
    protected List<DiscountReasonCodeType> discountReason;

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
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

    /**
     * Gets the value of the expressListing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpressListing() {
        return expressListing;
    }

    /**
     * Sets the value of the expressListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpressListing(Boolean value) {
        this.expressListing = value;
    }

    /**
     * Gets the value of the expressItemRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressItemRequirementsType }
     *     
     */
    public ExpressItemRequirementsType getExpressItemRequirements() {
        return expressItemRequirements;
    }

    /**
     * Sets the value of the expressItemRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressItemRequirementsType }
     *     
     */
    public void setExpressItemRequirements(ExpressItemRequirementsType value) {
        this.expressItemRequirements = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the category2ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory2ID() {
        return category2ID;
    }

    /**
     * Sets the value of the category2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory2ID(String value) {
        this.category2ID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DiscountReasonCodeType }
     *     
     */
    public DiscountReasonCodeType[] getDiscountReason() {
        if (this.discountReason == null) {
            return new DiscountReasonCodeType[ 0 ] ;
        }
        return ((DiscountReasonCodeType[]) this.discountReason.toArray(new DiscountReasonCodeType[this.discountReason.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DiscountReasonCodeType }
     *     
     */
    public DiscountReasonCodeType getDiscountReason(int idx) {
        if (this.discountReason == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.discountReason.get(idx);
    }

    public int getDiscountReasonLength() {
        if (this.discountReason == null) {
            return  0;
        }
        return this.discountReason.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DiscountReasonCodeType }
     *     
     */
    public void setDiscountReason(DiscountReasonCodeType[] values) {
        this._getDiscountReason().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.discountReason.add(values[i]);
        }
    }

    protected List<DiscountReasonCodeType> _getDiscountReason() {
        if (discountReason == null) {
            discountReason = new ArrayList<DiscountReasonCodeType>();
        }
        return discountReason;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountReasonCodeType }
     *     
     */
    public DiscountReasonCodeType setDiscountReason(int idx, DiscountReasonCodeType value) {
        return this.discountReason.set(idx, value);
    }

}
