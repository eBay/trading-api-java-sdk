
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
 * 				Retrieves the latest eBay category hierarchy for a given eBay site.
 * 				Information returned for each category includes the category name
 * 				and the unique ID for the category (unique within the eBay site for which
 * 				categories are retrieved). A category ID is a required input when you list most items.
 * 			
 * 
 * <p>Java class for GetCategoriesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategoriesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CategorySiteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryParent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LevelLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ViewAllNodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoriesRequestType", propOrder = {
    "categorySiteID",
    "categoryParent",
    "levelLimit",
    "viewAllNodes"
})
public class GetCategoriesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategorySiteID")
    protected String categorySiteID;
    @XmlElement(name = "CategoryParent")
    protected List<String> categoryParent;
    @XmlElement(name = "LevelLimit")
    protected Integer levelLimit;
    @XmlElement(name = "ViewAllNodes")
    protected Boolean viewAllNodes;

    /**
     * Gets the value of the categorySiteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorySiteID() {
        return categorySiteID;
    }

    /**
     * Sets the value of the categorySiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorySiteID(String value) {
        this.categorySiteID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getCategoryParent() {
        if (this.categoryParent == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.categoryParent.toArray(new String[this.categoryParent.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getCategoryParent(int idx) {
        if (this.categoryParent == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.categoryParent.get(idx);
    }

    public int getCategoryParentLength() {
        if (this.categoryParent == null) {
            return  0;
        }
        return this.categoryParent.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setCategoryParent(String[] values) {
        this._getCategoryParent().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.categoryParent.add(values[i]);
        }
    }

    protected List<String> _getCategoryParent() {
        if (categoryParent == null) {
            categoryParent = new ArrayList<String>();
        }
        return categoryParent;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setCategoryParent(int idx, String value) {
        return this.categoryParent.set(idx, value);
    }

    /**
     * Gets the value of the levelLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevelLimit() {
        return levelLimit;
    }

    /**
     * Sets the value of the levelLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevelLimit(Integer value) {
        this.levelLimit = value;
    }

    /**
     * Gets the value of the viewAllNodes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewAllNodes() {
        return viewAllNodes;
    }

    /**
     * Sets the value of the viewAllNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewAllNodes(Boolean value) {
        this.viewAllNodes = value;
    }

}
