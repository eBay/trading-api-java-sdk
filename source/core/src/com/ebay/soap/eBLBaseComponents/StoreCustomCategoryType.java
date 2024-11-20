
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is used to express details about a customized eBay Store category.
 * 			
 * 
 * <p>Java class for StoreCustomCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreCustomCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChildCategory" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomCategoryType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "StoreCustomCategoryType", propOrder = {
    "categoryID",
    "name",
    "order",
    "childCategory",
    "any"
})
public class StoreCustomCategoryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryID")
    protected long categoryID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Order")
    protected Integer order;
    @XmlElement(name = "ChildCategory")
    protected List<StoreCustomCategoryType> childCategory;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the categoryID property.
     * 
     */
    public long getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     */
    public void setCategoryID(long value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link StoreCustomCategoryType }
     *     
     */
    public StoreCustomCategoryType[] getChildCategory() {
        if (this.childCategory == null) {
            return new StoreCustomCategoryType[ 0 ] ;
        }
        return ((StoreCustomCategoryType[]) this.childCategory.toArray(new StoreCustomCategoryType[this.childCategory.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link StoreCustomCategoryType }
     *     
     */
    public StoreCustomCategoryType getChildCategory(int idx) {
        if (this.childCategory == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.childCategory.get(idx);
    }

    public int getChildCategoryLength() {
        if (this.childCategory == null) {
            return  0;
        }
        return this.childCategory.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link StoreCustomCategoryType }
     *     
     */
    public void setChildCategory(StoreCustomCategoryType[] values) {
        this._getChildCategory().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.childCategory.add(values[i]);
        }
    }

    protected List<StoreCustomCategoryType> _getChildCategory() {
        if (childCategory == null) {
            childCategory = new ArrayList<StoreCustomCategoryType>();
        }
        return childCategory;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link StoreCustomCategoryType }
     *     
     */
    public StoreCustomCategoryType setChildCategory(int idx, StoreCustomCategoryType value) {
        return this.childCategory.set(idx, value);
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
