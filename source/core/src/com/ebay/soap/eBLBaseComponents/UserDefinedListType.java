
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
 * 				Contains the items, searches and sellers that the user has saved to this
 * 				list using the "Add to list" feature.  The name of the list is given by the
 * 				"Name" element.
 * 			
 * 
 * <p>Java class for UserDefinedListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefinedListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FavoriteSearcheCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FavoriteSellerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}ItemArrayType" minOccurs="0"/>
 *         &lt;element name="FavoriteSearches" type="{urn:ebay:apis:eBLBaseComponents}MyeBayFavoriteSearchListType" minOccurs="0"/>
 *         &lt;element name="FavoriteSellers" type="{urn:ebay:apis:eBLBaseComponents}MyeBayFavoriteSellerListType" minOccurs="0"/>
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
@XmlType(name = "UserDefinedListType", propOrder = {
    "name",
    "itemCount",
    "favoriteSearcheCount",
    "favoriteSellerCount",
    "itemArray",
    "favoriteSearches",
    "favoriteSellers",
    "any"
})
public class UserDefinedListType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ItemCount")
    protected Integer itemCount;
    @XmlElement(name = "FavoriteSearcheCount")
    protected Integer favoriteSearcheCount;
    @XmlElement(name = "FavoriteSellerCount")
    protected Integer favoriteSellerCount;
    @XmlElement(name = "ItemArray")
    protected ItemArrayType itemArray;
    @XmlElement(name = "FavoriteSearches")
    protected MyeBayFavoriteSearchListType favoriteSearches;
    @XmlElement(name = "FavoriteSellers")
    protected MyeBayFavoriteSellerListType favoriteSellers;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCount(Integer value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the favoriteSearcheCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFavoriteSearcheCount() {
        return favoriteSearcheCount;
    }

    /**
     * Sets the value of the favoriteSearcheCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFavoriteSearcheCount(Integer value) {
        this.favoriteSearcheCount = value;
    }

    /**
     * Gets the value of the favoriteSellerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFavoriteSellerCount() {
        return favoriteSellerCount;
    }

    /**
     * Sets the value of the favoriteSellerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFavoriteSellerCount(Integer value) {
        this.favoriteSellerCount = value;
    }

    /**
     * Gets the value of the itemArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemArrayType }
     *     
     */
    public ItemArrayType getItemArray() {
        return itemArray;
    }

    /**
     * Sets the value of the itemArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemArrayType }
     *     
     */
    public void setItemArray(ItemArrayType value) {
        this.itemArray = value;
    }

    /**
     * Gets the value of the favoriteSearches property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBayFavoriteSearchListType }
     *     
     */
    public MyeBayFavoriteSearchListType getFavoriteSearches() {
        return favoriteSearches;
    }

    /**
     * Sets the value of the favoriteSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBayFavoriteSearchListType }
     *     
     */
    public void setFavoriteSearches(MyeBayFavoriteSearchListType value) {
        this.favoriteSearches = value;
    }

    /**
     * Gets the value of the favoriteSellers property.
     * 
     * @return
     *     possible object is
     *     {@link MyeBayFavoriteSellerListType }
     *     
     */
    public MyeBayFavoriteSellerListType getFavoriteSellers() {
        return favoriteSellers;
    }

    /**
     * Sets the value of the favoriteSellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBayFavoriteSellerListType }
     *     
     */
    public void setFavoriteSellers(MyeBayFavoriteSellerListType value) {
        this.favoriteSellers = value;
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
