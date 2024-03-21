
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is used by the <b>Variation</b> container, which provides full details on each item variation in a multiple-variation listing.
 * 			
 * 
 * <p>Java class for VariationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SKU" type="{urn:ebay:apis:eBLBaseComponents}SKUType" minOccurs="0"/>
 *         &lt;element name="StartPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VariationSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="UnitsAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellingStatus" type="{urn:ebay:apis:eBLBaseComponents}SellingStatusType" minOccurs="0"/>
 *         &lt;element name="VariationTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariationViewItemURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WatchCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrivateNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountPriceInfo" type="{urn:ebay:apis:eBLBaseComponents}DiscountPriceInfoType" minOccurs="0"/>
 *         &lt;element name="VariationProductListingDetails" type="{urn:ebay:apis:eBLBaseComponents}VariationProductListingDetailsType" minOccurs="0"/>
 *         &lt;element name="VariationExtendedProducerResponsibility" type="{urn:ebay:apis:eBLBaseComponents}VariationExtendedProducerResponsibilityType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariationType", propOrder = {
    "sku",
    "startPrice",
    "quantity",
    "variationSpecifics",
    "unitsAvailable",
    "sellingStatus",
    "variationTitle",
    "variationViewItemURL",
    "delete",
    "watchCount",
    "privateNotes",
    "discountPriceInfo",
    "variationProductListingDetails",
    "variationExtendedProducerResponsibility",
    "any"
})
public class VariationType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "StartPrice")
    protected AmountType startPrice;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "VariationSpecifics")
    protected NameValueListArrayType variationSpecifics;
    @XmlElement(name = "UnitsAvailable")
    protected Integer unitsAvailable;
    @XmlElement(name = "SellingStatus")
    protected SellingStatusType sellingStatus;
    @XmlElement(name = "VariationTitle")
    protected String variationTitle;
    @XmlElement(name = "VariationViewItemURL")
    @XmlSchemaType(name = "anyURI")
    protected String variationViewItemURL;
    @XmlElement(name = "Delete", defaultValue = "false")
    protected Boolean delete;
    @XmlElement(name = "WatchCount")
    protected Long watchCount;
    @XmlElement(name = "PrivateNotes")
    protected String privateNotes;
    @XmlElement(name = "DiscountPriceInfo")
    protected DiscountPriceInfoType discountPriceInfo;
    @XmlElement(name = "VariationProductListingDetails")
    protected VariationProductListingDetailsType variationProductListingDetails;
    @XmlElement(name = "VariationExtendedProducerResponsibility")
    protected VariationExtendedProducerResponsibilityType variationExtendedProducerResponsibility;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the startPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStartPrice() {
        return startPrice;
    }

    /**
     * Sets the value of the startPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStartPrice(AmountType value) {
        this.startPrice = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
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
     * Gets the value of the unitsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitsAvailable() {
        return unitsAvailable;
    }

    /**
     * Sets the value of the unitsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitsAvailable(Integer value) {
        this.unitsAvailable = value;
    }

    /**
     * Gets the value of the sellingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SellingStatusType }
     *     
     */
    public SellingStatusType getSellingStatus() {
        return sellingStatus;
    }

    /**
     * Sets the value of the sellingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingStatusType }
     *     
     */
    public void setSellingStatus(SellingStatusType value) {
        this.sellingStatus = value;
    }

    /**
     * Gets the value of the variationTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationTitle() {
        return variationTitle;
    }

    /**
     * Sets the value of the variationTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationTitle(String value) {
        this.variationTitle = value;
    }

    /**
     * Gets the value of the variationViewItemURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationViewItemURL() {
        return variationViewItemURL;
    }

    /**
     * Sets the value of the variationViewItemURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationViewItemURL(String value) {
        this.variationViewItemURL = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

    /**
     * Gets the value of the watchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWatchCount() {
        return watchCount;
    }

    /**
     * Sets the value of the watchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWatchCount(Long value) {
        this.watchCount = value;
    }

    /**
     * Gets the value of the privateNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateNotes() {
        return privateNotes;
    }

    /**
     * Sets the value of the privateNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateNotes(String value) {
        this.privateNotes = value;
    }

    /**
     * Gets the value of the discountPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPriceInfoType }
     *     
     */
    public DiscountPriceInfoType getDiscountPriceInfo() {
        return discountPriceInfo;
    }

    /**
     * Sets the value of the discountPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPriceInfoType }
     *     
     */
    public void setDiscountPriceInfo(DiscountPriceInfoType value) {
        this.discountPriceInfo = value;
    }

    /**
     * Gets the value of the variationProductListingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VariationProductListingDetailsType }
     *     
     */
    public VariationProductListingDetailsType getVariationProductListingDetails() {
        return variationProductListingDetails;
    }

    /**
     * Sets the value of the variationProductListingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationProductListingDetailsType }
     *     
     */
    public void setVariationProductListingDetails(VariationProductListingDetailsType value) {
        this.variationProductListingDetails = value;
    }

    /**
     * Gets the value of the variationExtendedProducerResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link VariationExtendedProducerResponsibilityType }
     *     
     */
    public VariationExtendedProducerResponsibilityType getVariationExtendedProducerResponsibility() {
        return variationExtendedProducerResponsibility;
    }

    /**
     * Sets the value of the variationExtendedProducerResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationExtendedProducerResponsibilityType }
     *     
     */
    public void setVariationExtendedProducerResponsibility(VariationExtendedProducerResponsibilityType value) {
        this.variationExtendedProducerResponsibility = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
