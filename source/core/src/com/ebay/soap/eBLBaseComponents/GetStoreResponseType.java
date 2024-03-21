
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response type of the <b>GetStore</b> call. This response consists of the data describing a seller's eBay store, and includes the eBay Store name, the description of the store, the URL to the eBay Store, and eBay Store Category hierarchy.
 * 			
 * 
 * <p>Java class for GetStoreResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStoreResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Store" type="{urn:ebay:apis:eBLBaseComponents}StoreType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreResponseType", propOrder = {
    "store"
})
public class GetStoreResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Store")
    protected StoreType store;

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link StoreType }
     *     
     */
    public StoreType getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoreType }
     *     
     */
    public void setStore(StoreType value) {
        this.store = value;
    }

}
