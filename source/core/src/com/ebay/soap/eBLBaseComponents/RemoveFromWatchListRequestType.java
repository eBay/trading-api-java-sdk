
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
 * 				The call enables a user to remove one or more items from their Watch List. A user can view the items that they are currently watching by calling <b>GetMyeBayBuying</b>.
 * 				<br/><br/>
 * 				The user has the option of removing one or more single-variation listings, one or more product variations within a multiple-variation listing, or removing all items from the Watch List.
 * 			
 * 
 * <p>Java class for RemoveFromWatchListRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveFromWatchListRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemoveAllItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VariationKey" type="{urn:ebay:apis:eBLBaseComponents}VariationKeyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveFromWatchListRequestType", propOrder = {
    "itemID",
    "removeAllItems",
    "variationKey"
})
public class RemoveFromWatchListRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected List<String> itemID;
    @XmlElement(name = "RemoveAllItems")
    protected Boolean removeAllItems;
    @XmlElement(name = "VariationKey")
    protected List<VariationKeyType> variationKey;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getItemID() {
        if (this.itemID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.itemID.toArray(new String[this.itemID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getItemID(int idx) {
        if (this.itemID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.itemID.get(idx);
    }

    public int getItemIDLength() {
        if (this.itemID == null) {
            return  0;
        }
        return this.itemID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setItemID(String[] values) {
        this._getItemID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.itemID.add(values[i]);
        }
    }

    protected List<String> _getItemID() {
        if (itemID == null) {
            itemID = new ArrayList<String>();
        }
        return itemID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setItemID(int idx, String value) {
        return this.itemID.set(idx, value);
    }

    /**
     * Gets the value of the removeAllItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveAllItems() {
        return removeAllItems;
    }

    /**
     * Sets the value of the removeAllItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveAllItems(Boolean value) {
        this.removeAllItems = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link VariationKeyType }
     *     
     */
    public VariationKeyType[] getVariationKey() {
        if (this.variationKey == null) {
            return new VariationKeyType[ 0 ] ;
        }
        return ((VariationKeyType[]) this.variationKey.toArray(new VariationKeyType[this.variationKey.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link VariationKeyType }
     *     
     */
    public VariationKeyType getVariationKey(int idx) {
        if (this.variationKey == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.variationKey.get(idx);
    }

    public int getVariationKeyLength() {
        if (this.variationKey == null) {
            return  0;
        }
        return this.variationKey.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link VariationKeyType }
     *     
     */
    public void setVariationKey(VariationKeyType[] values) {
        this._getVariationKey().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.variationKey.add(values[i]);
        }
    }

    protected List<VariationKeyType> _getVariationKey() {
        if (variationKey == null) {
            variationKey = new ArrayList<VariationKeyType>();
        }
        return variationKey;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link VariationKeyType }
     *     
     */
    public VariationKeyType setVariationKey(int idx, VariationKeyType value) {
        return this.variationKey.set(idx, value);
    }

}
