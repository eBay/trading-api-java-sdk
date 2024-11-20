
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
 * 				Specifies how to return the result list for My eBay features such as saved
 * 				searches, favorite sellers, and second chance offers.
 * 			
 * 
 * <p>Java class for MyeBaySelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyeBaySelectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Include" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeItemCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeFavoriteSearcheCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeFavoriteSellerCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sort" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="MaxResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserDefinedListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeListContents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "MyeBaySelectionType", propOrder = {
    "include",
    "includeItemCount",
    "includeFavoriteSearcheCount",
    "includeFavoriteSellerCount",
    "sort",
    "maxResults",
    "userDefinedListName",
    "includeListContents",
    "any"
})
public class MyeBaySelectionType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Include")
    protected Boolean include;
    @XmlElement(name = "IncludeItemCount")
    protected Boolean includeItemCount;
    @XmlElement(name = "IncludeFavoriteSearcheCount")
    protected Boolean includeFavoriteSearcheCount;
    @XmlElement(name = "IncludeFavoriteSellerCount")
    protected Boolean includeFavoriteSellerCount;
    @XmlElement(name = "Sort")
    protected SortOrderCodeType sort;
    @XmlElement(name = "MaxResults")
    protected Integer maxResults;
    @XmlElement(name = "UserDefinedListName")
    protected String userDefinedListName;
    @XmlElement(name = "IncludeListContents")
    protected Boolean includeListContents;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclude(Boolean value) {
        this.include = value;
    }

    /**
     * Gets the value of the includeItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeItemCount() {
        return includeItemCount;
    }

    /**
     * Sets the value of the includeItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeItemCount(Boolean value) {
        this.includeItemCount = value;
    }

    /**
     * Gets the value of the includeFavoriteSearcheCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFavoriteSearcheCount() {
        return includeFavoriteSearcheCount;
    }

    /**
     * Sets the value of the includeFavoriteSearcheCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFavoriteSearcheCount(Boolean value) {
        this.includeFavoriteSearcheCount = value;
    }

    /**
     * Gets the value of the includeFavoriteSellerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFavoriteSellerCount() {
        return includeFavoriteSellerCount;
    }

    /**
     * Sets the value of the includeFavoriteSellerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFavoriteSellerCount(Boolean value) {
        this.includeFavoriteSellerCount = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderCodeType }
     *     
     */
    public SortOrderCodeType getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderCodeType }
     *     
     */
    public void setSort(SortOrderCodeType value) {
        this.sort = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the userDefinedListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDefinedListName() {
        return userDefinedListName;
    }

    /**
     * Sets the value of the userDefinedListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDefinedListName(String value) {
        this.userDefinedListName = value;
    }

    /**
     * Gets the value of the includeListContents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeListContents() {
        return includeListContents;
    }

    /**
     * Sets the value of the includeListContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeListContents(Boolean value) {
        this.includeListContents = value;
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
