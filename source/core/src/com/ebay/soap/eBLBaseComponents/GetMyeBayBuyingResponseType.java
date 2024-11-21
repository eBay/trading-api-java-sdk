
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns information regarding a user's buying activity, such as items they are watching, bidding on, have won, did not win, and have made Best Offers on.
 * 			
 * 
 * <p>Java class for GetMyeBayBuyingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMyeBayBuyingResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="BuyingSummary" type="{urn:ebay:apis:eBLBaseComponents}BuyingSummaryType" minOccurs="0"/>
 *         &lt;element name="WatchList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="BidList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="BestOfferList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="WonList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedOrderTransactionArrayType" minOccurs="0"/>
 *         &lt;element name="LostList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="FavoriteSearches" type="{urn:ebay:apis:eBLBaseComponents}MyeBayFavoriteSearchListType" minOccurs="0"/>
 *         &lt;element name="FavoriteSellers" type="{urn:ebay:apis:eBLBaseComponents}MyeBayFavoriteSellerListType" minOccurs="0"/>
 *         &lt;element name="SecondChanceOffer" type="{urn:ebay:apis:eBLBaseComponents}ItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeletedFromWonList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedOrderTransactionArrayType" minOccurs="0"/>
 *         &lt;element name="DeletedFromLostList" type="{urn:ebay:apis:eBLBaseComponents}PaginatedItemArrayType" minOccurs="0"/>
 *         &lt;element name="UserDefinedList" type="{urn:ebay:apis:eBLBaseComponents}UserDefinedListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyeBayBuyingResponseType", propOrder = {
    "buyingSummary",
    "watchList",
    "bidList",
    "bestOfferList",
    "wonList",
    "lostList",
    "favoriteSearches",
    "favoriteSellers",
    "secondChanceOffer",
    "deletedFromWonList",
    "deletedFromLostList",
    "userDefinedList"
})
public class GetMyeBayBuyingResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BuyingSummary")
    protected BuyingSummaryType buyingSummary;
    @XmlElement(name = "WatchList")
    protected PaginatedItemArrayType watchList;
    @XmlElement(name = "BidList")
    protected PaginatedItemArrayType bidList;
    @XmlElement(name = "BestOfferList")
    protected PaginatedItemArrayType bestOfferList;
    @XmlElement(name = "WonList")
    protected PaginatedOrderTransactionArrayType wonList;
    @XmlElement(name = "LostList")
    protected PaginatedItemArrayType lostList;
    @XmlElement(name = "FavoriteSearches")
    protected MyeBayFavoriteSearchListType favoriteSearches;
    @XmlElement(name = "FavoriteSellers")
    protected MyeBayFavoriteSellerListType favoriteSellers;
    @XmlElement(name = "SecondChanceOffer")
    protected List<ItemType> secondChanceOffer;
    @XmlElement(name = "DeletedFromWonList")
    protected PaginatedOrderTransactionArrayType deletedFromWonList;
    @XmlElement(name = "DeletedFromLostList")
    protected PaginatedItemArrayType deletedFromLostList;
    @XmlElement(name = "UserDefinedList")
    protected List<UserDefinedListType> userDefinedList;

    /**
     * Gets the value of the buyingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BuyingSummaryType }
     *     
     */
    public BuyingSummaryType getBuyingSummary() {
        return buyingSummary;
    }

    /**
     * Sets the value of the buyingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyingSummaryType }
     *     
     */
    public void setBuyingSummary(BuyingSummaryType value) {
        this.buyingSummary = value;
    }

    /**
     * Gets the value of the watchList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getWatchList() {
        return watchList;
    }

    /**
     * Sets the value of the watchList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setWatchList(PaginatedItemArrayType value) {
        this.watchList = value;
    }

    /**
     * Gets the value of the bidList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getBidList() {
        return bidList;
    }

    /**
     * Sets the value of the bidList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setBidList(PaginatedItemArrayType value) {
        this.bidList = value;
    }

    /**
     * Gets the value of the bestOfferList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getBestOfferList() {
        return bestOfferList;
    }

    /**
     * Sets the value of the bestOfferList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setBestOfferList(PaginatedItemArrayType value) {
        this.bestOfferList = value;
    }

    /**
     * Gets the value of the wonList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public PaginatedOrderTransactionArrayType getWonList() {
        return wonList;
    }

    /**
     * Sets the value of the wonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public void setWonList(PaginatedOrderTransactionArrayType value) {
        this.wonList = value;
    }

    /**
     * Gets the value of the lostList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getLostList() {
        return lostList;
    }

    /**
     * Sets the value of the lostList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setLostList(PaginatedItemArrayType value) {
        this.lostList = value;
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
     *     {@link ItemType }
     *     
     */
    public ItemType[] getSecondChanceOffer() {
        if (this.secondChanceOffer == null) {
            return new ItemType[ 0 ] ;
        }
        return ((ItemType[]) this.secondChanceOffer.toArray(new ItemType[this.secondChanceOffer.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ItemType }
     *     
     */
    public ItemType getSecondChanceOffer(int idx) {
        if (this.secondChanceOffer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.secondChanceOffer.get(idx);
    }

    public int getSecondChanceOfferLength() {
        if (this.secondChanceOffer == null) {
            return  0;
        }
        return this.secondChanceOffer.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ItemType }
     *     
     */
    public void setSecondChanceOffer(ItemType[] values) {
        this._getSecondChanceOffer().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.secondChanceOffer.add(values[i]);
        }
    }

    protected List<ItemType> _getSecondChanceOffer() {
        if (secondChanceOffer == null) {
            secondChanceOffer = new ArrayList<ItemType>();
        }
        return secondChanceOffer;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public ItemType setSecondChanceOffer(int idx, ItemType value) {
        return this.secondChanceOffer.set(idx, value);
    }

    /**
     * Gets the value of the deletedFromWonList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public PaginatedOrderTransactionArrayType getDeletedFromWonList() {
        return deletedFromWonList;
    }

    /**
     * Sets the value of the deletedFromWonList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedOrderTransactionArrayType }
     *     
     */
    public void setDeletedFromWonList(PaginatedOrderTransactionArrayType value) {
        this.deletedFromWonList = value;
    }

    /**
     * Gets the value of the deletedFromLostList property.
     * 
     * @return
     *     possible object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public PaginatedItemArrayType getDeletedFromLostList() {
        return deletedFromLostList;
    }

    /**
     * Sets the value of the deletedFromLostList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginatedItemArrayType }
     *     
     */
    public void setDeletedFromLostList(PaginatedItemArrayType value) {
        this.deletedFromLostList = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link UserDefinedListType }
     *     
     */
    public UserDefinedListType[] getUserDefinedList() {
        if (this.userDefinedList == null) {
            return new UserDefinedListType[ 0 ] ;
        }
        return ((UserDefinedListType[]) this.userDefinedList.toArray(new UserDefinedListType[this.userDefinedList.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link UserDefinedListType }
     *     
     */
    public UserDefinedListType getUserDefinedList(int idx) {
        if (this.userDefinedList == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.userDefinedList.get(idx);
    }

    public int getUserDefinedListLength() {
        if (this.userDefinedList == null) {
            return  0;
        }
        return this.userDefinedList.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link UserDefinedListType }
     *     
     */
    public void setUserDefinedList(UserDefinedListType[] values) {
        this._getUserDefinedList().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.userDefinedList.add(values[i]);
        }
    }

    protected List<UserDefinedListType> _getUserDefinedList() {
        if (userDefinedList == null) {
            userDefinedList = new ArrayList<UserDefinedListType>();
        }
        return userDefinedList;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedListType }
     *     
     */
    public UserDefinedListType setUserDefinedList(int idx, UserDefinedListType value) {
        return this.userDefinedList.set(idx, value);
    }

}
