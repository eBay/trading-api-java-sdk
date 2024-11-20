
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
 * 				A list of favorite searches a user has saved on the My eBay page.
 * 			
 * 
 * <p>Java class for MyeBayFavoriteSearchListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyeBayFavoriteSearchListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FavoriteSearch" type="{urn:ebay:apis:eBLBaseComponents}MyeBayFavoriteSearchType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MyeBayFavoriteSearchListType", propOrder = {
    "totalAvailable",
    "favoriteSearch",
    "any"
})
public class MyeBayFavoriteSearchListType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TotalAvailable")
    protected Integer totalAvailable;
    @XmlElement(name = "FavoriteSearch")
    protected List<MyeBayFavoriteSearchType> favoriteSearch;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the totalAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAvailable() {
        return totalAvailable;
    }

    /**
     * Sets the value of the totalAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAvailable(Integer value) {
        this.totalAvailable = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link MyeBayFavoriteSearchType }
     *     
     */
    public MyeBayFavoriteSearchType[] getFavoriteSearch() {
        if (this.favoriteSearch == null) {
            return new MyeBayFavoriteSearchType[ 0 ] ;
        }
        return ((MyeBayFavoriteSearchType[]) this.favoriteSearch.toArray(new MyeBayFavoriteSearchType[this.favoriteSearch.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MyeBayFavoriteSearchType }
     *     
     */
    public MyeBayFavoriteSearchType getFavoriteSearch(int idx) {
        if (this.favoriteSearch == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.favoriteSearch.get(idx);
    }

    public int getFavoriteSearchLength() {
        if (this.favoriteSearch == null) {
            return  0;
        }
        return this.favoriteSearch.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MyeBayFavoriteSearchType }
     *     
     */
    public void setFavoriteSearch(MyeBayFavoriteSearchType[] values) {
        this._getFavoriteSearch().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.favoriteSearch.add(values[i]);
        }
    }

    protected List<MyeBayFavoriteSearchType> _getFavoriteSearch() {
        if (favoriteSearch == null) {
            favoriteSearch = new ArrayList<MyeBayFavoriteSearchType>();
        }
        return favoriteSearch;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBayFavoriteSearchType }
     *     
     */
    public MyeBayFavoriteSearchType setFavoriteSearch(int idx, MyeBayFavoriteSearchType value) {
        return this.favoriteSearch.set(idx, value);
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
