
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
 * 				The response of the <b>AddItems</b> call. The response includes the Item IDs of the newly created listings, the eBay category each item is listed under, the seller-defined SKUs of the items (if any), the listing recommendations for each item (if applicable), the start and end time of each listing, and the estimated fees that each listing will incur.
 * 			
 * 
 * <p>Java class for AddItemsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddItemsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AddItemResponseContainer" type="{urn:ebay:apis:eBLBaseComponents}AddItemResponseContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddItemsResponseType", propOrder = {
    "addItemResponseContainer"
})
public class AddItemsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AddItemResponseContainer")
    protected List<AddItemResponseContainerType> addItemResponseContainer;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AddItemResponseContainerType }
     *     
     */
    public AddItemResponseContainerType[] getAddItemResponseContainer() {
        if (this.addItemResponseContainer == null) {
            return new AddItemResponseContainerType[ 0 ] ;
        }
        return ((AddItemResponseContainerType[]) this.addItemResponseContainer.toArray(new AddItemResponseContainerType[this.addItemResponseContainer.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AddItemResponseContainerType }
     *     
     */
    public AddItemResponseContainerType getAddItemResponseContainer(int idx) {
        if (this.addItemResponseContainer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.addItemResponseContainer.get(idx);
    }

    public int getAddItemResponseContainerLength() {
        if (this.addItemResponseContainer == null) {
            return  0;
        }
        return this.addItemResponseContainer.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AddItemResponseContainerType }
     *     
     */
    public void setAddItemResponseContainer(AddItemResponseContainerType[] values) {
        this._getAddItemResponseContainer().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.addItemResponseContainer.add(values[i]);
        }
    }

    protected List<AddItemResponseContainerType> _getAddItemResponseContainer() {
        if (addItemResponseContainer == null) {
            addItemResponseContainer = new ArrayList<AddItemResponseContainerType>();
        }
        return addItemResponseContainer;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AddItemResponseContainerType }
     *     
     */
    public AddItemResponseContainerType setAddItemResponseContainer(int idx, AddItemResponseContainerType value) {
        return this.addItemResponseContainer.set(idx, value);
    }

}
