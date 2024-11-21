
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This call is used to retrieve information on a seller's eBay Store, including detailed information on all customized Store categories that the seller has set up.
 * 			
 * 
 * <p>Java class for GetStoreRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStoreRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CategoryStructureOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RootCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LevelLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreRequestType", propOrder = {
    "categoryStructureOnly",
    "rootCategoryID",
    "levelLimit",
    "userID"
})
public class GetStoreRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryStructureOnly")
    protected Boolean categoryStructureOnly;
    @XmlElement(name = "RootCategoryID")
    protected Long rootCategoryID;
    @XmlElement(name = "LevelLimit")
    protected Integer levelLimit;
    @XmlElement(name = "UserID")
    protected String userID;

    /**
     * Gets the value of the categoryStructureOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategoryStructureOnly() {
        return categoryStructureOnly;
    }

    /**
     * Sets the value of the categoryStructureOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoryStructureOnly(Boolean value) {
        this.categoryStructureOnly = value;
    }

    /**
     * Gets the value of the rootCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRootCategoryID() {
        return rootCategoryID;
    }

    /**
     * Sets the value of the rootCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRootCategoryID(Long value) {
        this.rootCategoryID = value;
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
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

}
