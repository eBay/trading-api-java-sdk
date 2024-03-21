
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is used by the <b>ListingFeatureDetails</b> container in the <b>GeteBayDetails</b> response. This container indicates the listing features that are enabled or disabled for an eBay site.
 * 			
 * 
 * <p>Java class for ListingFeatureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingFeatureDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoldTitle" type="{urn:ebay:apis:eBLBaseComponents}BoldTitleCodeType" minOccurs="0"/>
 *         &lt;element name="Border" type="{urn:ebay:apis:eBLBaseComponents}BorderCodeType" minOccurs="0"/>
 *         &lt;element name="Highlight" type="{urn:ebay:apis:eBLBaseComponents}HighlightCodeType" minOccurs="0"/>
 *         &lt;element name="GiftIcon" type="{urn:ebay:apis:eBLBaseComponents}GiftIconCodeType" minOccurs="0"/>
 *         &lt;element name="HomePageFeatured" type="{urn:ebay:apis:eBLBaseComponents}HomePageFeaturedCodeType" minOccurs="0"/>
 *         &lt;element name="FeaturedFirst" type="{urn:ebay:apis:eBLBaseComponents}FeaturedFirstCodeType" minOccurs="0"/>
 *         &lt;element name="FeaturedPlus" type="{urn:ebay:apis:eBLBaseComponents}FeaturedPlusCodeType" minOccurs="0"/>
 *         &lt;element name="ProPack" type="{urn:ebay:apis:eBLBaseComponents}ProPackCodeType" minOccurs="0"/>
 *         &lt;element name="DetailVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "ListingFeatureDetailsType", propOrder = {
    "boldTitle",
    "border",
    "highlight",
    "giftIcon",
    "homePageFeatured",
    "featuredFirst",
    "featuredPlus",
    "proPack",
    "detailVersion",
    "updateTime",
    "any"
})
public class ListingFeatureDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BoldTitle")
    protected BoldTitleCodeType boldTitle;
    @XmlElement(name = "Border")
    protected BorderCodeType border;
    @XmlElement(name = "Highlight")
    protected HighlightCodeType highlight;
    @XmlElement(name = "GiftIcon")
    protected GiftIconCodeType giftIcon;
    @XmlElement(name = "HomePageFeatured")
    protected HomePageFeaturedCodeType homePageFeatured;
    @XmlElement(name = "FeaturedFirst")
    protected FeaturedFirstCodeType featuredFirst;
    @XmlElement(name = "FeaturedPlus")
    protected FeaturedPlusCodeType featuredPlus;
    @XmlElement(name = "ProPack")
    protected ProPackCodeType proPack;
    @XmlElement(name = "DetailVersion")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar updateTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the boldTitle property.
     * 
     * @return
     *     possible object is
     *     {@link BoldTitleCodeType }
     *     
     */
    public BoldTitleCodeType getBoldTitle() {
        return boldTitle;
    }

    /**
     * Sets the value of the boldTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoldTitleCodeType }
     *     
     */
    public void setBoldTitle(BoldTitleCodeType value) {
        this.boldTitle = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link BorderCodeType }
     *     
     */
    public BorderCodeType getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderCodeType }
     *     
     */
    public void setBorder(BorderCodeType value) {
        this.border = value;
    }

    /**
     * Gets the value of the highlight property.
     * 
     * @return
     *     possible object is
     *     {@link HighlightCodeType }
     *     
     */
    public HighlightCodeType getHighlight() {
        return highlight;
    }

    /**
     * Sets the value of the highlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighlightCodeType }
     *     
     */
    public void setHighlight(HighlightCodeType value) {
        this.highlight = value;
    }

    /**
     * Gets the value of the giftIcon property.
     * 
     * @return
     *     possible object is
     *     {@link GiftIconCodeType }
     *     
     */
    public GiftIconCodeType getGiftIcon() {
        return giftIcon;
    }

    /**
     * Sets the value of the giftIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link GiftIconCodeType }
     *     
     */
    public void setGiftIcon(GiftIconCodeType value) {
        this.giftIcon = value;
    }

    /**
     * Gets the value of the homePageFeatured property.
     * 
     * @return
     *     possible object is
     *     {@link HomePageFeaturedCodeType }
     *     
     */
    public HomePageFeaturedCodeType getHomePageFeatured() {
        return homePageFeatured;
    }

    /**
     * Sets the value of the homePageFeatured property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomePageFeaturedCodeType }
     *     
     */
    public void setHomePageFeatured(HomePageFeaturedCodeType value) {
        this.homePageFeatured = value;
    }

    /**
     * Gets the value of the featuredFirst property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturedFirstCodeType }
     *     
     */
    public FeaturedFirstCodeType getFeaturedFirst() {
        return featuredFirst;
    }

    /**
     * Sets the value of the featuredFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturedFirstCodeType }
     *     
     */
    public void setFeaturedFirst(FeaturedFirstCodeType value) {
        this.featuredFirst = value;
    }

    /**
     * Gets the value of the featuredPlus property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturedPlusCodeType }
     *     
     */
    public FeaturedPlusCodeType getFeaturedPlus() {
        return featuredPlus;
    }

    /**
     * Sets the value of the featuredPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturedPlusCodeType }
     *     
     */
    public void setFeaturedPlus(FeaturedPlusCodeType value) {
        this.featuredPlus = value;
    }

    /**
     * Gets the value of the proPack property.
     * 
     * @return
     *     possible object is
     *     {@link ProPackCodeType }
     *     
     */
    public ProPackCodeType getProPack() {
        return proPack;
    }

    /**
     * Sets the value of the proPack property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProPackCodeType }
     *     
     */
    public void setProPack(ProPackCodeType value) {
        this.proPack = value;
    }

    /**
     * Gets the value of the detailVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailVersion() {
        return detailVersion;
    }

    /**
     * Sets the value of the detailVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailVersion(String value) {
        this.detailVersion = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(Calendar value) {
        this.updateTime = value;
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
