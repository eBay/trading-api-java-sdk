
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
 * 				Returns information about the features that are applicable to different categories,
 * 				such as listing durations, shipping term requirements, and Best Offer support.
 * 			
 * 
 * <p>Java class for GetCategoryFeaturesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCategoryFeaturesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LevelLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ViewAllNodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeatureID" type="{urn:ebay:apis:eBLBaseComponents}FeatureIDCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllFeaturesForCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoryFeaturesRequestType", propOrder = {
    "categoryID",
    "levelLimit",
    "viewAllNodes",
    "featureID",
    "allFeaturesForCategory"
})
public class GetCategoryFeaturesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "LevelLimit")
    protected Integer levelLimit;
    @XmlElement(name = "ViewAllNodes")
    protected Boolean viewAllNodes;
    @XmlElement(name = "FeatureID")
    protected List<FeatureIDCodeType> featureID;
    @XmlElement(name = "AllFeaturesForCategory")
    protected Boolean allFeaturesForCategory;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
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

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link FeatureIDCodeType }
     *     
     */
    public FeatureIDCodeType[] getFeatureID() {
        if (this.featureID == null) {
            return new FeatureIDCodeType[ 0 ] ;
        }
        return ((FeatureIDCodeType[]) this.featureID.toArray(new FeatureIDCodeType[this.featureID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link FeatureIDCodeType }
     *     
     */
    public FeatureIDCodeType getFeatureID(int idx) {
        if (this.featureID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.featureID.get(idx);
    }

    public int getFeatureIDLength() {
        if (this.featureID == null) {
            return  0;
        }
        return this.featureID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link FeatureIDCodeType }
     *     
     */
    public void setFeatureID(FeatureIDCodeType[] values) {
        this._getFeatureID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.featureID.add(values[i]);
        }
    }

    protected List<FeatureIDCodeType> _getFeatureID() {
        if (featureID == null) {
            featureID = new ArrayList<FeatureIDCodeType>();
        }
        return featureID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureIDCodeType }
     *     
     */
    public FeatureIDCodeType setFeatureID(int idx, FeatureIDCodeType value) {
        return this.featureID.set(idx, value);
    }

    /**
     * Gets the value of the allFeaturesForCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllFeaturesForCategory() {
        return allFeaturesForCategory;
    }

    /**
     * Sets the value of the allFeaturesForCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllFeaturesForCategory(Boolean value) {
        this.allFeaturesForCategory = value;
    }

}
