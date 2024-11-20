
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
 * 				Provides a list of products recommended by eBay, which match the item information
 * 				provided by the seller.
 * 			
 * 
 * <p>Java class for ProductSuggestionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSuggestionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductSuggestion" type="{urn:ebay:apis:eBLBaseComponents}ProductSuggestionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ProductSuggestionsType", propOrder = {
    "productSuggestion",
    "any"
})
public class ProductSuggestionsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ProductSuggestion")
    protected List<ProductSuggestionType> productSuggestion;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ProductSuggestionType }
     *     
     */
    public ProductSuggestionType[] getProductSuggestion() {
        if (this.productSuggestion == null) {
            return new ProductSuggestionType[ 0 ] ;
        }
        return ((ProductSuggestionType[]) this.productSuggestion.toArray(new ProductSuggestionType[this.productSuggestion.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ProductSuggestionType }
     *     
     */
    public ProductSuggestionType getProductSuggestion(int idx) {
        if (this.productSuggestion == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.productSuggestion.get(idx);
    }

    public int getProductSuggestionLength() {
        if (this.productSuggestion == null) {
            return  0;
        }
        return this.productSuggestion.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ProductSuggestionType }
     *     
     */
    public void setProductSuggestion(ProductSuggestionType[] values) {
        this._getProductSuggestion().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.productSuggestion.add(values[i]);
        }
    }

    protected List<ProductSuggestionType> _getProductSuggestion() {
        if (productSuggestion == null) {
            productSuggestion = new ArrayList<ProductSuggestionType>();
        }
        return productSuggestion;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSuggestionType }
     *     
     */
    public ProductSuggestionType setProductSuggestion(int idx, ProductSuggestionType value) {
        return this.productSuggestion.set(idx, value);
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
