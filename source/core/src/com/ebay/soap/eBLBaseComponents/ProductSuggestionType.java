
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
 * 				Identifies an individual product suggestion. The product details include the EPID, Title, Stock photo url and if it is 
 * 				an exact match.
 * 			
 * 
 * <p>Java class for ProductSuggestionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSuggestionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StockPhoto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recommended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ProductSuggestionType", propOrder = {
    "title",
    "epid",
    "stockPhoto",
    "recommended",
    "any"
})
public class ProductSuggestionType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "EPID")
    protected String epid;
    @XmlElement(name = "StockPhoto")
    protected String stockPhoto;
    @XmlElement(name = "Recommended")
    protected Boolean recommended;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the epid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPID() {
        return epid;
    }

    /**
     * Sets the value of the epid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPID(String value) {
        this.epid = value;
    }

    /**
     * Gets the value of the stockPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockPhoto() {
        return stockPhoto;
    }

    /**
     * Sets the value of the stockPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockPhoto(String value) {
        this.stockPhoto = value;
    }

    /**
     * Gets the value of the recommended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecommended() {
        return recommended;
    }

    /**
     * Sets the value of the recommended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecommended(Boolean value) {
        this.recommended = value;
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
