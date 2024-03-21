
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
 * 				Type used by the <b>CategoryArray</b> container that is returned in <b>GetCategories</b>. All categories that match the input criteria of the <b>GetCategories</b> request payload are returned under the <b>CategoryArray</b> container
 * 			
 * 
 * <p>Java class for CategoryArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{urn:ebay:apis:eBLBaseComponents}CategoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryArrayType", propOrder = {
    "category"
})
public class CategoryArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Category")
    protected List<CategoryType> category;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CategoryType }
     *     
     */
    public CategoryType[] getCategory() {
        if (this.category == null) {
            return new CategoryType[ 0 ] ;
        }
        return ((CategoryType[]) this.category.toArray(new CategoryType[this.category.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CategoryType }
     *     
     */
    public CategoryType getCategory(int idx) {
        if (this.category == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.category.get(idx);
    }

    public int getCategoryLength() {
        if (this.category == null) {
            return  0;
        }
        return this.category.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CategoryType }
     *     
     */
    public void setCategory(CategoryType[] values) {
        this._getCategory().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.category.add(values[i]);
        }
    }

    protected List<CategoryType> _getCategory() {
        if (category == null) {
            category = new ArrayList<CategoryType>();
        }
        return category;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *     
     */
    public CategoryType setCategory(int idx, CategoryType value) {
        return this.category.set(idx, value);
    }

}
