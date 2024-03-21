
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response of a <b>GetSuggestedCategories</b> call. This response includes an array of categories with the highest number
 * 				of listings whose listing titles or descriptions contain the keywords
 * 				specified in the <b>Query</b> field of the call request.
 * 	    
 * 
 * <p>Java class for GetSuggestedCategoriesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSuggestedCategoriesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SuggestedCategoryArray" type="{urn:ebay:apis:eBLBaseComponents}SuggestedCategoryArrayType" minOccurs="0"/>
 *         &lt;element name="CategoryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSuggestedCategoriesResponseType", propOrder = {
    "suggestedCategoryArray",
    "categoryCount"
})
public class GetSuggestedCategoriesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SuggestedCategoryArray")
    protected SuggestedCategoryArrayType suggestedCategoryArray;
    @XmlElement(name = "CategoryCount")
    protected Integer categoryCount;

    /**
     * Gets the value of the suggestedCategoryArray property.
     * 
     * @return
     *     possible object is
     *     {@link SuggestedCategoryArrayType }
     *     
     */
    public SuggestedCategoryArrayType getSuggestedCategoryArray() {
        return suggestedCategoryArray;
    }

    /**
     * Sets the value of the suggestedCategoryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestedCategoryArrayType }
     *     
     */
    public void setSuggestedCategoryArray(SuggestedCategoryArrayType value) {
        this.suggestedCategoryArray = value;
    }

    /**
     * Gets the value of the categoryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryCount() {
        return categoryCount;
    }

    /**
     * Sets the value of the categoryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryCount(Integer value) {
        this.categoryCount = value;
    }

}
