
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
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for CrossPromotionPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossPromotionPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrossPromotionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CrossSellItemFormatSortFilter" type="{urn:ebay:apis:eBLBaseComponents}ItemFormatSortFilterCodeType" minOccurs="0"/>
 *         &lt;element name="CrossSellGallerySortFilter" type="{urn:ebay:apis:eBLBaseComponents}GallerySortFilterCodeType" minOccurs="0"/>
 *         &lt;element name="CrossSellItemSortFilter" type="{urn:ebay:apis:eBLBaseComponents}ItemSortFilterCodeType" minOccurs="0"/>
 *         &lt;element name="UpSellItemFormatSortFilter" type="{urn:ebay:apis:eBLBaseComponents}ItemFormatSortFilterCodeType" minOccurs="0"/>
 *         &lt;element name="UpSellGallerySortFilter" type="{urn:ebay:apis:eBLBaseComponents}GallerySortFilterCodeType" minOccurs="0"/>
 *         &lt;element name="UpSellItemSortFilter" type="{urn:ebay:apis:eBLBaseComponents}ItemSortFilterCodeType" minOccurs="0"/>
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
@XmlType(name = "CrossPromotionPreferencesType", propOrder = {
    "crossPromotionEnabled",
    "crossSellItemFormatSortFilter",
    "crossSellGallerySortFilter",
    "crossSellItemSortFilter",
    "upSellItemFormatSortFilter",
    "upSellGallerySortFilter",
    "upSellItemSortFilter",
    "any"
})
public class CrossPromotionPreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CrossPromotionEnabled")
    protected Boolean crossPromotionEnabled;
    @XmlElement(name = "CrossSellItemFormatSortFilter")
    protected ItemFormatSortFilterCodeType crossSellItemFormatSortFilter;
    @XmlElement(name = "CrossSellGallerySortFilter")
    protected GallerySortFilterCodeType crossSellGallerySortFilter;
    @XmlElement(name = "CrossSellItemSortFilter")
    protected ItemSortFilterCodeType crossSellItemSortFilter;
    @XmlElement(name = "UpSellItemFormatSortFilter")
    protected ItemFormatSortFilterCodeType upSellItemFormatSortFilter;
    @XmlElement(name = "UpSellGallerySortFilter")
    protected GallerySortFilterCodeType upSellGallerySortFilter;
    @XmlElement(name = "UpSellItemSortFilter")
    protected ItemSortFilterCodeType upSellItemSortFilter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crossPromotionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossPromotionEnabled() {
        return crossPromotionEnabled;
    }

    /**
     * Sets the value of the crossPromotionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossPromotionEnabled(Boolean value) {
        this.crossPromotionEnabled = value;
    }

    /**
     * Gets the value of the crossSellItemFormatSortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFormatSortFilterCodeType }
     *     
     */
    public ItemFormatSortFilterCodeType getCrossSellItemFormatSortFilter() {
        return crossSellItemFormatSortFilter;
    }

    /**
     * Sets the value of the crossSellItemFormatSortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFormatSortFilterCodeType }
     *     
     */
    public void setCrossSellItemFormatSortFilter(ItemFormatSortFilterCodeType value) {
        this.crossSellItemFormatSortFilter = value;
    }

    /**
     * Gets the value of the crossSellGallerySortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link GallerySortFilterCodeType }
     *     
     */
    public GallerySortFilterCodeType getCrossSellGallerySortFilter() {
        return crossSellGallerySortFilter;
    }

    /**
     * Sets the value of the crossSellGallerySortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GallerySortFilterCodeType }
     *     
     */
    public void setCrossSellGallerySortFilter(GallerySortFilterCodeType value) {
        this.crossSellGallerySortFilter = value;
    }

    /**
     * Gets the value of the crossSellItemSortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSortFilterCodeType }
     *     
     */
    public ItemSortFilterCodeType getCrossSellItemSortFilter() {
        return crossSellItemSortFilter;
    }

    /**
     * Sets the value of the crossSellItemSortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSortFilterCodeType }
     *     
     */
    public void setCrossSellItemSortFilter(ItemSortFilterCodeType value) {
        this.crossSellItemSortFilter = value;
    }

    /**
     * Gets the value of the upSellItemFormatSortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFormatSortFilterCodeType }
     *     
     */
    public ItemFormatSortFilterCodeType getUpSellItemFormatSortFilter() {
        return upSellItemFormatSortFilter;
    }

    /**
     * Sets the value of the upSellItemFormatSortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFormatSortFilterCodeType }
     *     
     */
    public void setUpSellItemFormatSortFilter(ItemFormatSortFilterCodeType value) {
        this.upSellItemFormatSortFilter = value;
    }

    /**
     * Gets the value of the upSellGallerySortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link GallerySortFilterCodeType }
     *     
     */
    public GallerySortFilterCodeType getUpSellGallerySortFilter() {
        return upSellGallerySortFilter;
    }

    /**
     * Sets the value of the upSellGallerySortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GallerySortFilterCodeType }
     *     
     */
    public void setUpSellGallerySortFilter(GallerySortFilterCodeType value) {
        this.upSellGallerySortFilter = value;
    }

    /**
     * Gets the value of the upSellItemSortFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSortFilterCodeType }
     *     
     */
    public ItemSortFilterCodeType getUpSellItemSortFilter() {
        return upSellItemSortFilter;
    }

    /**
     * Sets the value of the upSellItemSortFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSortFilterCodeType }
     *     
     */
    public void setUpSellItemSortFilter(ItemSortFilterCodeType value) {
        this.upSellItemSortFilter = value;
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
