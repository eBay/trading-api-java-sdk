
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				All Best Offers for the item according to the filter or Best Offer ID (or both) used in the input. For the notification client usage, this response includes a single Best Offer.
 * 			
 * 
 * <p>Java class for GetBestOffersResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBestOffersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="BestOfferArray" type="{urn:ebay:apis:eBLBaseComponents}BestOfferArrayType" minOccurs="0"/>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *         &lt;element name="ItemBestOffersArray" type="{urn:ebay:apis:eBLBaseComponents}ItemBestOffersArrayType" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBestOffersResponseType", propOrder = {
    "bestOfferArray",
    "item",
    "itemBestOffersArray",
    "pageNumber",
    "paginationResult"
})
public class GetBestOffersResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BestOfferArray")
    protected BestOfferArrayType bestOfferArray;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "ItemBestOffersArray")
    protected ItemBestOffersArrayType itemBestOffersArray;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;

    /**
     * Gets the value of the bestOfferArray property.
     * 
     * @return
     *     possible object is
     *     {@link BestOfferArrayType }
     *     
     */
    public BestOfferArrayType getBestOfferArray() {
        return bestOfferArray;
    }

    /**
     * Sets the value of the bestOfferArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestOfferArrayType }
     *     
     */
    public void setBestOfferArray(BestOfferArrayType value) {
        this.bestOfferArray = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the itemBestOffersArray property.
     * 
     * @return
     *     possible object is
     *     {@link ItemBestOffersArrayType }
     *     
     */
    public ItemBestOffersArrayType getItemBestOffersArray() {
        return itemBestOffersArray;
    }

    /**
     * Sets the value of the itemBestOffersArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemBestOffersArrayType }
     *     
     */
    public void setItemBestOffersArray(ItemBestOffersArrayType value) {
        this.itemBestOffersArray = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the paginationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationResultType }
     *     
     */
    public PaginationResultType getPaginationResult() {
        return paginationResult;
    }

    /**
     * Sets the value of the paginationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationResultType }
     *     
     */
    public void setPaginationResult(PaginationResultType value) {
        this.paginationResult = value;
    }

}
