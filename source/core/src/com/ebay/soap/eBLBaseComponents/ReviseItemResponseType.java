
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				The base response type for the <b>ReviseItem</b> call. The response includes the Item ID for the revised item, the SKU value for the item (if any), listing recommendations (if applicable), the estimated fees for the revised item (except the transaction fees, which aren't calculated until the item has sold), the start and end times of the listing, and other details.
 * 			
 * 
 * <p>Java class for ReviseItemResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviseItemResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Fees" type="{urn:ebay:apis:eBLBaseComponents}FeesType" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category2ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerifyOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DiscountReason" type="{urn:ebay:apis:eBLBaseComponents}DiscountReasonCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductSuggestions" type="{urn:ebay:apis:eBLBaseComponents}ProductSuggestionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseItemResponseType", propOrder = {
    "itemID",
    "startTime",
    "endTime",
    "fees",
    "categoryID",
    "category2ID",
    "verifyOnly",
    "discountReason",
    "productSuggestions"
})
public class ReviseItemResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTime;
    @XmlElement(name = "Fees")
    protected FeesType fees;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "Category2ID")
    protected String category2ID;
    @XmlElement(name = "VerifyOnly")
    protected Boolean verifyOnly;
    @XmlElement(name = "DiscountReason")
    protected List<DiscountReasonCodeType> discountReason;
    @XmlElement(name = "ProductSuggestions")
    protected ProductSuggestionsType productSuggestions;

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
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(Calendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(Calendar value) {
        this.endTime = value;
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
     * Gets the value of the verifyOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifyOnly() {
        return verifyOnly;
    }

    /**
     * Sets the value of the verifyOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifyOnly(Boolean value) {
        this.verifyOnly = value;
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

    /**
     * Gets the value of the productSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSuggestionsType }
     *     
     */
    public ProductSuggestionsType getProductSuggestions() {
        return productSuggestions;
    }

    /**
     * Sets the value of the productSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSuggestionsType }
     *     
     */
    public void setProductSuggestions(ProductSuggestionsType value) {
        this.productSuggestions = value;
    }

}
