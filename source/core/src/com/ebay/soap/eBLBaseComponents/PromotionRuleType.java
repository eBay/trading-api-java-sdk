
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
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for PromotionRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotedStoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PromotedeBayCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotedKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferringItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="ReferringStoreCategoryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReferringeBayCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferringKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionScheme" type="{urn:ebay:apis:eBLBaseComponents}PromotionSchemeCodeType" minOccurs="0"/>
 *         &lt;element name="PromotionMethod" type="{urn:ebay:apis:eBLBaseComponents}PromotionMethodCodeType" minOccurs="0"/>
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
@XmlType(name = "PromotionRuleType", propOrder = {
    "promotedStoreCategoryID",
    "promotedeBayCategoryID",
    "promotedKeywords",
    "referringItemID",
    "referringStoreCategoryID",
    "referringeBayCategoryID",
    "referringKeywords",
    "promotionScheme",
    "promotionMethod",
    "any"
})
public class PromotionRuleType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PromotedStoreCategoryID")
    protected Long promotedStoreCategoryID;
    @XmlElement(name = "PromotedeBayCategoryID")
    protected String promotedeBayCategoryID;
    @XmlElement(name = "PromotedKeywords")
    protected String promotedKeywords;
    @XmlElement(name = "ReferringItemID")
    protected String referringItemID;
    @XmlElement(name = "ReferringStoreCategoryID")
    protected Long referringStoreCategoryID;
    @XmlElement(name = "ReferringeBayCategoryID")
    protected String referringeBayCategoryID;
    @XmlElement(name = "ReferringKeywords")
    protected String referringKeywords;
    @XmlElement(name = "PromotionScheme")
    protected PromotionSchemeCodeType promotionScheme;
    @XmlElement(name = "PromotionMethod")
    protected PromotionMethodCodeType promotionMethod;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the promotedStoreCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotedStoreCategoryID() {
        return promotedStoreCategoryID;
    }

    /**
     * Sets the value of the promotedStoreCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotedStoreCategoryID(Long value) {
        this.promotedStoreCategoryID = value;
    }

    /**
     * Gets the value of the promotedeBayCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotedeBayCategoryID() {
        return promotedeBayCategoryID;
    }

    /**
     * Sets the value of the promotedeBayCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotedeBayCategoryID(String value) {
        this.promotedeBayCategoryID = value;
    }

    /**
     * Gets the value of the promotedKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotedKeywords() {
        return promotedKeywords;
    }

    /**
     * Sets the value of the promotedKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotedKeywords(String value) {
        this.promotedKeywords = value;
    }

    /**
     * Gets the value of the referringItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferringItemID() {
        return referringItemID;
    }

    /**
     * Sets the value of the referringItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferringItemID(String value) {
        this.referringItemID = value;
    }

    /**
     * Gets the value of the referringStoreCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferringStoreCategoryID() {
        return referringStoreCategoryID;
    }

    /**
     * Sets the value of the referringStoreCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferringStoreCategoryID(Long value) {
        this.referringStoreCategoryID = value;
    }

    /**
     * Gets the value of the referringeBayCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferringeBayCategoryID() {
        return referringeBayCategoryID;
    }

    /**
     * Sets the value of the referringeBayCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferringeBayCategoryID(String value) {
        this.referringeBayCategoryID = value;
    }

    /**
     * Gets the value of the referringKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferringKeywords() {
        return referringKeywords;
    }

    /**
     * Sets the value of the referringKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferringKeywords(String value) {
        this.referringKeywords = value;
    }

    /**
     * Gets the value of the promotionScheme property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionSchemeCodeType }
     *     
     */
    public PromotionSchemeCodeType getPromotionScheme() {
        return promotionScheme;
    }

    /**
     * Sets the value of the promotionScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionSchemeCodeType }
     *     
     */
    public void setPromotionScheme(PromotionSchemeCodeType value) {
        this.promotionScheme = value;
    }

    /**
     * Gets the value of the promotionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionMethodCodeType }
     *     
     */
    public PromotionMethodCodeType getPromotionMethod() {
        return promotionMethod;
    }

    /**
     * Sets the value of the promotionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionMethodCodeType }
     *     
     */
    public void setPromotionMethod(PromotionMethodCodeType value) {
        this.promotionMethod = value;
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
