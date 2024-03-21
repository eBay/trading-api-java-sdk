
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Contains the data for the seller favorite item preferences, i.e.  the manual or automatic selection criteria to display items for buyer's favourite seller opt in email marketing.
 * 			
 * 
 * <p>Java class for SellerFavoriteItemPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerFavoriteItemPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SearchSortOrder" type="{urn:ebay:apis:eBLBaseComponents}StoreItemListSortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="MinPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="MaxPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="FavoriteItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SellerFavoriteItemPreferencesType", propOrder = {
    "searchKeywords",
    "storeCategoryID",
    "listingType",
    "searchSortOrder",
    "minPrice",
    "maxPrice",
    "favoriteItemID",
    "any"
})
public class SellerFavoriteItemPreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SearchKeywords")
    protected String searchKeywords;
    @XmlElement(name = "StoreCategoryID")
    protected Long storeCategoryID;
    @XmlElement(name = "ListingType")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "SearchSortOrder")
    protected StoreItemListSortOrderCodeType searchSortOrder;
    @XmlElement(name = "MinPrice")
    protected AmountType minPrice;
    @XmlElement(name = "MaxPrice")
    protected AmountType maxPrice;
    @XmlElement(name = "FavoriteItemID")
    protected List<String> favoriteItemID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the searchKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchKeywords() {
        return searchKeywords;
    }

    /**
     * Sets the value of the searchKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchKeywords(String value) {
        this.searchKeywords = value;
    }

    /**
     * Gets the value of the storeCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStoreCategoryID() {
        return storeCategoryID;
    }

    /**
     * Sets the value of the storeCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStoreCategoryID(Long value) {
        this.storeCategoryID = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public ListingTypeCodeType getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public void setListingType(ListingTypeCodeType value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the searchSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link StoreItemListSortOrderCodeType }
     *     
     */
    public StoreItemListSortOrderCodeType getSearchSortOrder() {
        return searchSortOrder;
    }

    /**
     * Sets the value of the searchSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreItemListSortOrderCodeType }
     *     
     */
    public void setSearchSortOrder(StoreItemListSortOrderCodeType value) {
        this.searchSortOrder = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinPrice(AmountType value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaxPrice(AmountType value) {
        this.maxPrice = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getFavoriteItemID() {
        if (this.favoriteItemID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.favoriteItemID.toArray(new String[this.favoriteItemID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getFavoriteItemID(int idx) {
        if (this.favoriteItemID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.favoriteItemID.get(idx);
    }

    public int getFavoriteItemIDLength() {
        if (this.favoriteItemID == null) {
            return  0;
        }
        return this.favoriteItemID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setFavoriteItemID(String[] values) {
        this._getFavoriteItemID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.favoriteItemID.add(values[i]);
        }
    }

    protected List<String> _getFavoriteItemID() {
        if (favoriteItemID == null) {
            favoriteItemID = new ArrayList<String>();
        }
        return favoriteItemID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setFavoriteItemID(int idx, String value) {
        return this.favoriteItemID.set(idx, value);
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
