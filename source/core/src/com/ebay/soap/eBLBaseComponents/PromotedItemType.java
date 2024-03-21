
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for PromotedItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotedItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SelectionType" type="{urn:ebay:apis:eBLBaseComponents}PromotionItemSelectionCodeType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PromotionDetails" type="{urn:ebay:apis:eBLBaseComponents}PromotionDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimeLeft" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
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
@XmlType(name = "PromotedItemType", propOrder = {
    "itemID",
    "pictureURL",
    "position",
    "selectionType",
    "title",
    "listingType",
    "promotionDetails",
    "timeLeft",
    "any"
})
public class PromotedItemType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "PictureURL")
    protected String pictureURL;
    @XmlElement(name = "Position")
    protected Integer position;
    @XmlElement(name = "SelectionType")
    protected PromotionItemSelectionCodeType selectionType;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "ListingType")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "PromotionDetails")
    protected List<PromotionDetailsType> promotionDetails;
    @XmlElement(name = "TimeLeft")
    protected Duration timeLeft;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the pictureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureURL() {
        return pictureURL;
    }

    /**
     * Sets the value of the pictureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureURL(String value) {
        this.pictureURL = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Gets the value of the selectionType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionItemSelectionCodeType }
     *     
     */
    public PromotionItemSelectionCodeType getSelectionType() {
        return selectionType;
    }

    /**
     * Sets the value of the selectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionItemSelectionCodeType }
     *     
     */
    public void setSelectionType(PromotionItemSelectionCodeType value) {
        this.selectionType = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * 
     * 
     * @return
     *     array of
     *     {@link PromotionDetailsType }
     *     
     */
    public PromotionDetailsType[] getPromotionDetails() {
        if (this.promotionDetails == null) {
            return new PromotionDetailsType[ 0 ] ;
        }
        return ((PromotionDetailsType[]) this.promotionDetails.toArray(new PromotionDetailsType[this.promotionDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PromotionDetailsType }
     *     
     */
    public PromotionDetailsType getPromotionDetails(int idx) {
        if (this.promotionDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.promotionDetails.get(idx);
    }

    public int getPromotionDetailsLength() {
        if (this.promotionDetails == null) {
            return  0;
        }
        return this.promotionDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PromotionDetailsType }
     *     
     */
    public void setPromotionDetails(PromotionDetailsType[] values) {
        this._getPromotionDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.promotionDetails.add(values[i]);
        }
    }

    protected List<PromotionDetailsType> _getPromotionDetails() {
        if (promotionDetails == null) {
            promotionDetails = new ArrayList<PromotionDetailsType>();
        }
        return promotionDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionDetailsType }
     *     
     */
    public PromotionDetailsType setPromotionDetails(int idx, PromotionDetailsType value) {
        return this.promotionDetails.set(idx, value);
    }

    /**
     * Gets the value of the timeLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeLeft() {
        return timeLeft;
    }

    /**
     * Sets the value of the timeLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeLeft(Duration value) {
        this.timeLeft = value;
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
