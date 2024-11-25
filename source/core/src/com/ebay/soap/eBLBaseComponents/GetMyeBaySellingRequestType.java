
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Retrieves information regarding the user's selling activity, such as items that the user is currently selling (the Active list), auction listings that have bids, sold items, and unsold items.
 * 			
 * 
 * <p>Java class for GetMyeBaySellingRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMyeBaySellingRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ScheduledList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="ActiveList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="SoldList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="UnsoldList" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="SellingSummary" type="{urn:ebay:apis:eBLBaseComponents}ItemListCustomizationType" minOccurs="0"/>
 *         &lt;element name="HideVariations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyeBaySellingRequestType", propOrder = {
    "scheduledList",
    "activeList",
    "soldList",
    "unsoldList",
    "sellingSummary",
    "hideVariations"
})
public class GetMyeBaySellingRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ScheduledList")
    protected ItemListCustomizationType scheduledList;
    @XmlElement(name = "ActiveList")
    protected ItemListCustomizationType activeList;
    @XmlElement(name = "SoldList")
    protected ItemListCustomizationType soldList;
    @XmlElement(name = "UnsoldList")
    protected ItemListCustomizationType unsoldList;
    @XmlElement(name = "SellingSummary")
    protected ItemListCustomizationType sellingSummary;
    @XmlElement(name = "HideVariations")
    protected Boolean hideVariations;

    /**
     * Gets the value of the scheduledList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getScheduledList() {
        return scheduledList;
    }

    /**
     * Sets the value of the scheduledList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setScheduledList(ItemListCustomizationType value) {
        this.scheduledList = value;
    }

    /**
     * Gets the value of the activeList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getActiveList() {
        return activeList;
    }

    /**
     * Sets the value of the activeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setActiveList(ItemListCustomizationType value) {
        this.activeList = value;
    }

    /**
     * Gets the value of the soldList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getSoldList() {
        return soldList;
    }

    /**
     * Sets the value of the soldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setSoldList(ItemListCustomizationType value) {
        this.soldList = value;
    }

    /**
     * Gets the value of the unsoldList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getUnsoldList() {
        return unsoldList;
    }

    /**
     * Sets the value of the unsoldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setUnsoldList(ItemListCustomizationType value) {
        this.unsoldList = value;
    }

    /**
     * Gets the value of the sellingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public ItemListCustomizationType getSellingSummary() {
        return sellingSummary;
    }

    /**
     * Sets the value of the sellingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListCustomizationType }
     *     
     */
    public void setSellingSummary(ItemListCustomizationType value) {
        this.sellingSummary = value;
    }

    /**
     * Gets the value of the hideVariations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideVariations() {
        return hideVariations;
    }

    /**
     * Sets the value of the hideVariations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideVariations(Boolean value) {
        this.hideVariations = value;
    }

}
