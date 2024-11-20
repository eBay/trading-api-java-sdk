
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
 * 					A list of favorite sellers the user has saved on the My eBay page.
 * 			
 * 
 * <p>Java class for MyeBayFavoriteSellerListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyeBayFavoriteSellerListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FavoriteSeller" type="{urn:ebay:apis:eBLBaseComponents}MyeBayFavoriteSellerType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MyeBayFavoriteSellerListType", propOrder = {
    "totalAvailable",
    "favoriteSeller",
    "any"
})
public class MyeBayFavoriteSellerListType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TotalAvailable")
    protected Integer totalAvailable;
    @XmlElement(name = "FavoriteSeller")
    protected List<MyeBayFavoriteSellerType> favoriteSeller;
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
     *     {@link MyeBayFavoriteSellerType }
     *     
     */
    public MyeBayFavoriteSellerType[] getFavoriteSeller() {
        if (this.favoriteSeller == null) {
            return new MyeBayFavoriteSellerType[ 0 ] ;
        }
        return ((MyeBayFavoriteSellerType[]) this.favoriteSeller.toArray(new MyeBayFavoriteSellerType[this.favoriteSeller.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link MyeBayFavoriteSellerType }
     *     
     */
    public MyeBayFavoriteSellerType getFavoriteSeller(int idx) {
        if (this.favoriteSeller == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.favoriteSeller.get(idx);
    }

    public int getFavoriteSellerLength() {
        if (this.favoriteSeller == null) {
            return  0;
        }
        return this.favoriteSeller.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link MyeBayFavoriteSellerType }
     *     
     */
    public void setFavoriteSeller(MyeBayFavoriteSellerType[] values) {
        this._getFavoriteSeller().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.favoriteSeller.add(values[i]);
        }
    }

    protected List<MyeBayFavoriteSellerType> _getFavoriteSeller() {
        if (favoriteSeller == null) {
            favoriteSeller = new ArrayList<MyeBayFavoriteSellerType>();
        }
        return favoriteSeller;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link MyeBayFavoriteSellerType }
     *     
     */
    public MyeBayFavoriteSellerType setFavoriteSeller(int idx, MyeBayFavoriteSellerType value) {
        return this.favoriteSeller.set(idx, value);
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
