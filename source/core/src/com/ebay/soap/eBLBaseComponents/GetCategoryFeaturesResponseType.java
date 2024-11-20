
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GetCategoryFeaturesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategoryFeaturesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CategoryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Category" type="{urn:ebay:apis:eBLBaseComponents}CategoryFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SiteDefaults" type="{urn:ebay:apis:eBLBaseComponents}SiteDefaultsType" minOccurs="0"/>
 *         &lt;element name="FeatureDefinitions" type="{urn:ebay:apis:eBLBaseComponents}FeatureDefinitionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoryFeaturesResponseType", propOrder = {
    "categoryVersion",
    "updateTime",
    "category",
    "siteDefaults",
    "featureDefinitions"
})
public class GetCategoryFeaturesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryVersion")
    protected String categoryVersion;
    @XmlElement(name = "UpdateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar updateTime;
    @XmlElement(name = "Category")
    protected List<CategoryFeatureType> category;
    @XmlElement(name = "SiteDefaults")
    protected SiteDefaultsType siteDefaults;
    @XmlElement(name = "FeatureDefinitions")
    protected FeatureDefinitionsType featureDefinitions;

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

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(Calendar value) {
        this.updateTime = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link CategoryFeatureType }
     *     
     */
    public CategoryFeatureType[] getCategory() {
        if (this.category == null) {
            return new CategoryFeatureType[ 0 ] ;
        }
        return ((CategoryFeatureType[]) this.category.toArray(new CategoryFeatureType[this.category.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link CategoryFeatureType }
     *     
     */
    public CategoryFeatureType getCategory(int idx) {
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
     *     {@link CategoryFeatureType }
     *     
     */
    public void setCategory(CategoryFeatureType[] values) {
        this._getCategory().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.category.add(values[i]);
        }
    }

    protected List<CategoryFeatureType> _getCategory() {
        if (category == null) {
            category = new ArrayList<CategoryFeatureType>();
        }
        return category;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryFeatureType }
     *     
     */
    public CategoryFeatureType setCategory(int idx, CategoryFeatureType value) {
        return this.category.set(idx, value);
    }

    /**
     * Gets the value of the siteDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link SiteDefaultsType }
     *     
     */
    public SiteDefaultsType getSiteDefaults() {
        return siteDefaults;
    }

    /**
     * Sets the value of the siteDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteDefaultsType }
     *     
     */
    public void setSiteDefaults(SiteDefaultsType value) {
        this.siteDefaults = value;
    }

    /**
     * Gets the value of the featureDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureDefinitionsType }
     *     
     */
    public FeatureDefinitionsType getFeatureDefinitions() {
        return featureDefinitions;
    }

    /**
     * Sets the value of the featureDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureDefinitionsType }
     *     
     */
    public void setFeatureDefinitions(FeatureDefinitionsType value) {
        this.featureDefinitions = value;
    }

}
