
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
 * 				Contains an array of categories that contain listings with
 * 				specified keywords in their titles or descriptions. The array
 * 				can contain up to 10 categories.
 * 			
 * 
 * <p>Java class for SuggestedCategoryArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestedCategoryArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuggestedCategory" type="{urn:ebay:apis:eBLBaseComponents}SuggestedCategoryType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SuggestedCategoryArrayType", propOrder = {
    "suggestedCategory",
    "any"
})
public class SuggestedCategoryArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SuggestedCategory")
    protected List<SuggestedCategoryType> suggestedCategory;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SuggestedCategoryType }
     *     
     */
    public SuggestedCategoryType[] getSuggestedCategory() {
        if (this.suggestedCategory == null) {
            return new SuggestedCategoryType[ 0 ] ;
        }
        return ((SuggestedCategoryType[]) this.suggestedCategory.toArray(new SuggestedCategoryType[this.suggestedCategory.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SuggestedCategoryType }
     *     
     */
    public SuggestedCategoryType getSuggestedCategory(int idx) {
        if (this.suggestedCategory == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.suggestedCategory.get(idx);
    }

    public int getSuggestedCategoryLength() {
        if (this.suggestedCategory == null) {
            return  0;
        }
        return this.suggestedCategory.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SuggestedCategoryType }
     *     
     */
    public void setSuggestedCategory(SuggestedCategoryType[] values) {
        this._getSuggestedCategory().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.suggestedCategory.add(values[i]);
        }
    }

    protected List<SuggestedCategoryType> _getSuggestedCategory() {
        if (suggestedCategory == null) {
            suggestedCategory = new ArrayList<SuggestedCategoryType>();
        }
        return suggestedCategory;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestedCategoryType }
     *     
     */
    public SuggestedCategoryType setSuggestedCategory(int idx, SuggestedCategoryType value) {
        return this.suggestedCategory.set(idx, value);
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
