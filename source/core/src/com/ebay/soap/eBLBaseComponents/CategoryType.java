
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
 *         Container for data on one listing category. Many of the <b>CategoryType</b> fields are only returned in the <b>GetCategories</b> response. Add/Revise/Relist calls only use the <b>CategoryID</b> field to specify which eBay category in which to list the item.
 * 			
 * 
 * <p>Java class for CategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BestOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoPayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="B2BVATEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CatalogEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryParentID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategoryParentName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductSearchPageAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProductFinderIDs" type="{urn:ebay:apis:eBLBaseComponents}ExtendedProductFinderIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Expired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntlAutosFixedCat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LeafCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Virtual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumOfItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellerGuaranteeEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ORPA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ORRA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LSD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CategoryType", propOrder = {
    "bestOfferEnabled",
    "autoPayEnabled",
    "b2BVATEnabled",
    "catalogEnabled",
    "categoryID",
    "categoryLevel",
    "categoryName",
    "categoryParentID",
    "categoryParentName",
    "productSearchPageAvailable",
    "productFinderIDs",
    "expired",
    "intlAutosFixedCat",
    "leafCategory",
    "virtual",
    "numOfItems",
    "sellerGuaranteeEligible",
    "orpa",
    "orra",
    "lsd",
    "keywords",
    "any"
})
public class CategoryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BestOfferEnabled")
    protected Boolean bestOfferEnabled;
    @XmlElement(name = "AutoPayEnabled")
    protected Boolean autoPayEnabled;
    @XmlElement(name = "B2BVATEnabled")
    protected Boolean b2BVATEnabled;
    @XmlElement(name = "CatalogEnabled")
    protected Boolean catalogEnabled;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "CategoryLevel")
    protected Integer categoryLevel;
    @XmlElement(name = "CategoryName")
    protected String categoryName;
    @XmlElement(name = "CategoryParentID")
    protected List<String> categoryParentID;
    @XmlElement(name = "CategoryParentName")
    protected List<String> categoryParentName;
    @XmlElement(name = "ProductSearchPageAvailable")
    protected Boolean productSearchPageAvailable;
    @XmlElement(name = "ProductFinderIDs")
    protected List<ExtendedProductFinderIDType> productFinderIDs;
    @XmlElement(name = "Expired")
    protected Boolean expired;
    @XmlElement(name = "IntlAutosFixedCat")
    protected Boolean intlAutosFixedCat;
    @XmlElement(name = "LeafCategory")
    protected Boolean leafCategory;
    @XmlElement(name = "Virtual")
    protected Boolean virtual;
    @XmlElement(name = "NumOfItems")
    protected Integer numOfItems;
    @XmlElement(name = "SellerGuaranteeEligible")
    protected Boolean sellerGuaranteeEligible;
    @XmlElement(name = "ORPA")
    protected Boolean orpa;
    @XmlElement(name = "ORRA")
    protected Boolean orra;
    @XmlElement(name = "LSD")
    protected Boolean lsd;
    @XmlElement(name = "Keywords")
    protected String keywords;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the bestOfferEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferEnabled() {
        return bestOfferEnabled;
    }

    /**
     * Sets the value of the bestOfferEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferEnabled(Boolean value) {
        this.bestOfferEnabled = value;
    }

    /**
     * Gets the value of the autoPayEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPayEnabled() {
        return autoPayEnabled;
    }

    /**
     * Sets the value of the autoPayEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPayEnabled(Boolean value) {
        this.autoPayEnabled = value;
    }

    /**
     * Gets the value of the b2BVATEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isB2BVATEnabled() {
        return b2BVATEnabled;
    }

    /**
     * Sets the value of the b2BVATEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setB2BVATEnabled(Boolean value) {
        this.b2BVATEnabled = value;
    }

    /**
     * Gets the value of the catalogEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCatalogEnabled() {
        return catalogEnabled;
    }

    /**
     * Sets the value of the catalogEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCatalogEnabled(Boolean value) {
        this.catalogEnabled = value;
    }

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
     * Gets the value of the categoryLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * Sets the value of the categoryLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryLevel(Integer value) {
        this.categoryLevel = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getCategoryParentID() {
        if (this.categoryParentID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.categoryParentID.toArray(new String[this.categoryParentID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getCategoryParentID(int idx) {
        if (this.categoryParentID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.categoryParentID.get(idx);
    }

    public int getCategoryParentIDLength() {
        if (this.categoryParentID == null) {
            return  0;
        }
        return this.categoryParentID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setCategoryParentID(String[] values) {
        this._getCategoryParentID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.categoryParentID.add(values[i]);
        }
    }

    protected List<String> _getCategoryParentID() {
        if (categoryParentID == null) {
            categoryParentID = new ArrayList<String>();
        }
        return categoryParentID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setCategoryParentID(int idx, String value) {
        return this.categoryParentID.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getCategoryParentName() {
        if (this.categoryParentName == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.categoryParentName.toArray(new String[this.categoryParentName.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getCategoryParentName(int idx) {
        if (this.categoryParentName == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.categoryParentName.get(idx);
    }

    public int getCategoryParentNameLength() {
        if (this.categoryParentName == null) {
            return  0;
        }
        return this.categoryParentName.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setCategoryParentName(String[] values) {
        this._getCategoryParentName().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.categoryParentName.add(values[i]);
        }
    }

    protected List<String> _getCategoryParentName() {
        if (categoryParentName == null) {
            categoryParentName = new ArrayList<String>();
        }
        return categoryParentName;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setCategoryParentName(int idx, String value) {
        return this.categoryParentName.set(idx, value);
    }

    /**
     * Gets the value of the productSearchPageAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductSearchPageAvailable() {
        return productSearchPageAvailable;
    }

    /**
     * Sets the value of the productSearchPageAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductSearchPageAvailable(Boolean value) {
        this.productSearchPageAvailable = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ExtendedProductFinderIDType }
     *     
     */
    public ExtendedProductFinderIDType[] getProductFinderIDs() {
        if (this.productFinderIDs == null) {
            return new ExtendedProductFinderIDType[ 0 ] ;
        }
        return ((ExtendedProductFinderIDType[]) this.productFinderIDs.toArray(new ExtendedProductFinderIDType[this.productFinderIDs.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ExtendedProductFinderIDType }
     *     
     */
    public ExtendedProductFinderIDType getProductFinderIDs(int idx) {
        if (this.productFinderIDs == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productFinderIDs.get(idx);
    }

    public int getProductFinderIDsLength() {
        if (this.productFinderIDs == null) {
            return  0;
        }
        return this.productFinderIDs.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ExtendedProductFinderIDType }
     *     
     */
    public void setProductFinderIDs(ExtendedProductFinderIDType[] values) {
        this._getProductFinderIDs().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.productFinderIDs.add(values[i]);
        }
    }

    protected List<ExtendedProductFinderIDType> _getProductFinderIDs() {
        if (productFinderIDs == null) {
            productFinderIDs = new ArrayList<ExtendedProductFinderIDType>();
        }
        return productFinderIDs;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedProductFinderIDType }
     *     
     */
    public ExtendedProductFinderIDType setProductFinderIDs(int idx, ExtendedProductFinderIDType value) {
        return this.productFinderIDs.set(idx, value);
    }

    /**
     * Gets the value of the expired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpired() {
        return expired;
    }

    /**
     * Sets the value of the expired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpired(Boolean value) {
        this.expired = value;
    }

    /**
     * Gets the value of the intlAutosFixedCat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntlAutosFixedCat() {
        return intlAutosFixedCat;
    }

    /**
     * Sets the value of the intlAutosFixedCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntlAutosFixedCat(Boolean value) {
        this.intlAutosFixedCat = value;
    }

    /**
     * Gets the value of the leafCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeafCategory() {
        return leafCategory;
    }

    /**
     * Sets the value of the leafCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeafCategory(Boolean value) {
        this.leafCategory = value;
    }

    /**
     * Gets the value of the virtual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVirtual() {
        return virtual;
    }

    /**
     * Sets the value of the virtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVirtual(Boolean value) {
        this.virtual = value;
    }

    /**
     * Gets the value of the numOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOfItems() {
        return numOfItems;
    }

    /**
     * Sets the value of the numOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOfItems(Integer value) {
        this.numOfItems = value;
    }

    /**
     * Gets the value of the sellerGuaranteeEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerGuaranteeEligible() {
        return sellerGuaranteeEligible;
    }

    /**
     * Sets the value of the sellerGuaranteeEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellerGuaranteeEligible(Boolean value) {
        this.sellerGuaranteeEligible = value;
    }

    /**
     * Gets the value of the orpa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isORPA() {
        return orpa;
    }

    /**
     * Sets the value of the orpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setORPA(Boolean value) {
        this.orpa = value;
    }

    /**
     * Gets the value of the orra property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isORRA() {
        return orra;
    }

    /**
     * Sets the value of the orra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setORRA(Boolean value) {
        this.orra = value;
    }

    /**
     * Gets the value of the lsd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLSD() {
        return lsd;
    }

    /**
     * Sets the value of the lsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLSD(Boolean value) {
        this.lsd = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
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
