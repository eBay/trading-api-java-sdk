
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
 * 				Base request type for the <b>AddItems</b> call, which is used to create one to five fixed-price, auction, or classified ad listings. The <b>AddItems</b> call does not support multiple-variation listings, so multiple-variation listings cannot be created with this call.
 * 			
 * 
 * <p>Java class for AddItemsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddItemsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AddItemRequestContainer" type="{urn:ebay:apis:eBLBaseComponents}AddItemRequestContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddItemsRequestType", propOrder = {
    "addItemRequestContainer"
})
public class AddItemsRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AddItemRequestContainer")
    protected List<AddItemRequestContainerType> addItemRequestContainer;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AddItemRequestContainerType }
     *     
     */
    public AddItemRequestContainerType[] getAddItemRequestContainer() {
        if (this.addItemRequestContainer == null) {
            return new AddItemRequestContainerType[ 0 ] ;
        }
        return ((AddItemRequestContainerType[]) this.addItemRequestContainer.toArray(new AddItemRequestContainerType[this.addItemRequestContainer.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AddItemRequestContainerType }
     *     
     */
    public AddItemRequestContainerType getAddItemRequestContainer(int idx) {
        if (this.addItemRequestContainer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.addItemRequestContainer.get(idx);
    }

    public int getAddItemRequestContainerLength() {
        if (this.addItemRequestContainer == null) {
            return  0;
        }
        return this.addItemRequestContainer.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AddItemRequestContainerType }
     *     
     */
    public void setAddItemRequestContainer(AddItemRequestContainerType[] values) {
        this._getAddItemRequestContainer().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.addItemRequestContainer.add(values[i]);
        }
    }

    protected List<AddItemRequestContainerType> _getAddItemRequestContainer() {
        if (addItemRequestContainer == null) {
            addItemRequestContainer = new ArrayList<AddItemRequestContainerType>();
        }
        return addItemRequestContainer;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AddItemRequestContainerType }
     *     
     */
    public AddItemRequestContainerType setAddItemRequestContainer(int idx, AddItemRequestContainerType value) {
        return this.addItemRequestContainer.set(idx, value);
    }

}
