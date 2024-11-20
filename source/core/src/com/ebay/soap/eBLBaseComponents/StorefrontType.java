
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				This type defines the <b>Storefront</b> container, which can be used by eBay Stores sellers to list an item under two primary custom categories either by category ID or category name. A custom category is a category that was created by a seller in their eBay store. This container is used by Add/Revise/Relist calls.
 * 				<br/><br/>
 * 				The <b>Storefront</b> container is also returned in <b>GetItem</b> and other Trading calls that retrieve Item data.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note: </b>
 * 				This type is applicable only for eBay Store sellers.
 * 				</span>
 *  			
 * 
 * <p>Java class for StorefrontType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorefrontType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StoreCategory2ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StoreCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreCategory2Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "StorefrontType", propOrder = {
    "storeCategoryID",
    "storeCategory2ID",
    "storeCategoryName",
    "storeCategory2Name",
    "storeURL",
    "storeName",
    "any"
})
public class StorefrontType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "StoreCategoryID")
    protected long storeCategoryID;
    @XmlElement(name = "StoreCategory2ID")
    protected long storeCategory2ID;
    @XmlElement(name = "StoreCategoryName")
    protected String storeCategoryName;
    @XmlElement(name = "StoreCategory2Name")
    protected String storeCategory2Name;
    @XmlElement(name = "StoreURL")
    @XmlSchemaType(name = "anyURI")
    protected String storeURL;
    @XmlElement(name = "StoreName")
    protected String storeName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the storeCategoryID property.
     * 
     */
    public long getStoreCategoryID() {
        return storeCategoryID;
    }

    /**
     * Sets the value of the storeCategoryID property.
     * 
     */
    public void setStoreCategoryID(long value) {
        this.storeCategoryID = value;
    }

    /**
     * Gets the value of the storeCategory2ID property.
     * 
     */
    public long getStoreCategory2ID() {
        return storeCategory2ID;
    }

    /**
     * Sets the value of the storeCategory2ID property.
     * 
     */
    public void setStoreCategory2ID(long value) {
        this.storeCategory2ID = value;
    }

    /**
     * Gets the value of the storeCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCategoryName() {
        return storeCategoryName;
    }

    /**
     * Sets the value of the storeCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCategoryName(String value) {
        this.storeCategoryName = value;
    }

    /**
     * Gets the value of the storeCategory2Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreCategory2Name() {
        return storeCategory2Name;
    }

    /**
     * Sets the value of the storeCategory2Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreCategory2Name(String value) {
        this.storeCategory2Name = value;
    }

    /**
     * Gets the value of the storeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreURL() {
        return storeURL;
    }

    /**
     * Sets the value of the storeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreURL(String value) {
        this.storeURL = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
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
