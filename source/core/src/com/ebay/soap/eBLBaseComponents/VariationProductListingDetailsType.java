
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
 * 				This type defines the <b>VariationProductListingDetails</b> container that is used to specify a Global Trade Item Number (GTIN), such as an EAN, an ISBN, or a UPC value, to identify a specific product variation in a multiple-variation listing. For a multiple-variation listing, the same GTIN type(s) must be used for all product variations within the same listing. For instance, if specify an ISBN value for one product variation within the listing, an ISBN value (and not an EAN or UPC value) must be specified for all product variations within the listing.
 * 			
 * 
 * <p>Java class for VariationProductListingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariationProductListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameValueList" type="{urn:ebay:apis:eBLBaseComponents}NameValueListType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "VariationProductListingDetailsType", propOrder = {
    "isbn",
    "upc",
    "ean",
    "productReferenceID",
    "nameValueList",
    "any"
})
public class VariationProductListingDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ISBN")
    protected String isbn;
    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "ProductReferenceID")
    protected String productReferenceID;
    @XmlElement(name = "NameValueList")
    protected List<NameValueListType> nameValueList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the productReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductReferenceID() {
        return productReferenceID;
    }

    /**
     * Sets the value of the productReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductReferenceID(String value) {
        this.productReferenceID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link NameValueListType }
     *     
     */
    public NameValueListType[] getNameValueList() {
        if (this.nameValueList == null) {
            return new NameValueListType[ 0 ] ;
        }
        return ((NameValueListType[]) this.nameValueList.toArray(new NameValueListType[this.nameValueList.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NameValueListType }
     *     
     */
    public NameValueListType getNameValueList(int idx) {
        if (this.nameValueList == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.nameValueList.get(idx);
    }

    public int getNameValueListLength() {
        if (this.nameValueList == null) {
            return  0;
        }
        return this.nameValueList.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NameValueListType }
     *     
     */
    public void setNameValueList(NameValueListType[] values) {
        this._getNameValueList().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.nameValueList.add(values[i]);
        }
    }

    protected List<NameValueListType> _getNameValueList() {
        if (nameValueList == null) {
            nameValueList = new ArrayList<NameValueListType>();
        }
        return nameValueList;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListType }
     *     
     */
    public NameValueListType setNameValueList(int idx, NameValueListType value) {
        return this.nameValueList.set(idx, value);
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
