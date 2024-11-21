
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This call allows a seller to create and publish a fixed-price listing.
 * 				The main difference between <b>AddFixedPriceItem</b> and <b>AddItem</b> is that
 * 				<b>AddFixedPriceItem</b> supports the creation of fixed-price listings only,
 * 				whereas <b>AddItem</b> supports all listing formats.
 * 				<br>
 * 				<br>
 * 				Also, only <b>AddFixedPriceItem</b> supports multiple-variation listings
 * 				and tracking inventory by a seller-defined SKU value. <b>AddItem</b> does not support
 * 				Variations or the <b>InventoryTrackingMethod</b> field.
 * 			
 * 
 * <p>Java class for AddFixedPriceItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddFixedPriceItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddFixedPriceItemRequestType", propOrder = {
    "item"
})
public class AddFixedPriceItemRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Item")
    protected ItemType item;

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

}
