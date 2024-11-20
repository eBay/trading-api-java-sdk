
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
 * 				Returns a map of old category IDs and corresponding active category IDs defined
 * 				for the site to which the request was sent. Typically used to update an older item
 * 				definition with a new category ID prior to listing the item.
 * 			
 * 
 * <p>Java class for GetCategoryMappingsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategoryMappingsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CategoryMapping" type="{urn:ebay:apis:eBLBaseComponents}CategoryMappingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategoryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoryMappingsResponseType", propOrder = {
    "categoryMapping",
    "categoryVersion"
})
public class GetCategoryMappingsResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryMapping")
    protected List<CategoryMappingType> categoryMapping;
    @XmlElement(name = "CategoryVersion")
    protected String categoryVersion;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CategoryMappingType }
     *     
     */
    public CategoryMappingType[] getCategoryMapping() {
        if (this.categoryMapping == null) {
            return new CategoryMappingType[ 0 ] ;
        }
        return ((CategoryMappingType[]) this.categoryMapping.toArray(new CategoryMappingType[this.categoryMapping.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CategoryMappingType }
     *     
     */
    public CategoryMappingType getCategoryMapping(int idx) {
        if (this.categoryMapping == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.categoryMapping.get(idx);
    }

    public int getCategoryMappingLength() {
        if (this.categoryMapping == null) {
            return  0;
        }
        return this.categoryMapping.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link CategoryMappingType }
     *     
     */
    public void setCategoryMapping(CategoryMappingType[] values) {
        this._getCategoryMapping().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.categoryMapping.add(values[i]);
        }
    }

    protected List<CategoryMappingType> _getCategoryMapping() {
        if (categoryMapping == null) {
            categoryMapping = new ArrayList<CategoryMappingType>();
        }
        return categoryMapping;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryMappingType }
     *     
     */
    public CategoryMappingType setCategoryMapping(int idx, CategoryMappingType value) {
        return this.categoryMapping.set(idx, value);
    }

    /**
     * Gets the value of the categoryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryVersion() {
        return categoryVersion;
    }

    /**
     * Sets the value of the categoryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryVersion(String value) {
        this.categoryVersion = value;
    }

}
