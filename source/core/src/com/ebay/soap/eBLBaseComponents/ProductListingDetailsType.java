
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				Type used by the <b>ProductListingDetails</b> container, which is used by a seller in an add/revise/relist call to identify a product through a Global Trade Item Number (EAN, ISBN, or UPC) or an eBay Product ID (e.g. 'ePID'). If a specified product identifier is matched to a product in the eBay catalog, some of the details for the product listing, such as listing category, product title, product description, product aspects, and stock photo are prefilled for the listing.
 * 				<br>
 * 				<br>
 * 				<span class="tablenote"><b>Note:</b>
 * 				If a Brand/MPN pair is required for the product, these values must still be input through the <b>BrandMPN</b> container.
 * 				</span>
 * 			
 * 
 * <p>Java class for ProductListingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductListingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncludeStockPhotoURL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseStockPhotoURLAsGallery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StockPhotoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Copyright" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ProductDetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ReturnSearchResultOnDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandMPN" type="{urn:ebay:apis:eBLBaseComponents}BrandMPNType" minOccurs="0"/>
 *         &lt;element name="TicketListingDetails" type="{urn:ebay:apis:eBLBaseComponents}TicketListingDetailsType" minOccurs="0"/>
 *         &lt;element name="UseFirstProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludeeBayProductDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ProductListingDetailsType", propOrder = {
    "includeStockPhotoURL",
    "useStockPhotoURLAsGallery",
    "stockPhotoURL",
    "copyright",
    "productReferenceID",
    "detailsURL",
    "productDetailsURL",
    "returnSearchResultOnDuplicates",
    "isbn",
    "upc",
    "ean",
    "brandMPN",
    "ticketListingDetails",
    "useFirstProduct",
    "includeeBayProductDetails",
    "nameValueList",
    "any"
})
public class ProductListingDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "IncludeStockPhotoURL")
    protected Boolean includeStockPhotoURL;
    @XmlElement(name = "UseStockPhotoURLAsGallery")
    protected Boolean useStockPhotoURLAsGallery;
    @XmlElement(name = "StockPhotoURL")
    @XmlSchemaType(name = "anyURI")
    protected String stockPhotoURL;
    @XmlElement(name = "Copyright")
    protected List<String> copyright;
    @XmlElement(name = "ProductReferenceID")
    protected String productReferenceID;
    @XmlElement(name = "DetailsURL")
    @XmlSchemaType(name = "anyURI")
    protected String detailsURL;
    @XmlElement(name = "ProductDetailsURL")
    @XmlSchemaType(name = "anyURI")
    protected String productDetailsURL;
    @XmlElement(name = "ReturnSearchResultOnDuplicates")
    protected Boolean returnSearchResultOnDuplicates;
    @XmlElement(name = "ISBN")
    protected String isbn;
    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "BrandMPN")
    protected BrandMPNType brandMPN;
    @XmlElement(name = "TicketListingDetails")
    protected TicketListingDetailsType ticketListingDetails;
    @XmlElement(name = "UseFirstProduct")
    protected Boolean useFirstProduct;
    @XmlElement(name = "IncludeeBayProductDetails")
    protected Boolean includeeBayProductDetails;
    @XmlElement(name = "NameValueList")
    protected List<NameValueListType> nameValueList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the includeStockPhotoURL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeStockPhotoURL() {
        return includeStockPhotoURL;
    }

    /**
     * Sets the value of the includeStockPhotoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeStockPhotoURL(Boolean value) {
        this.includeStockPhotoURL = value;
    }

    /**
     * Gets the value of the useStockPhotoURLAsGallery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseStockPhotoURLAsGallery() {
        return useStockPhotoURLAsGallery;
    }

    /**
     * Sets the value of the useStockPhotoURLAsGallery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseStockPhotoURLAsGallery(Boolean value) {
        this.useStockPhotoURLAsGallery = value;
    }

    /**
     * Gets the value of the stockPhotoURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockPhotoURL() {
        return stockPhotoURL;
    }

    /**
     * Sets the value of the stockPhotoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockPhotoURL(String value) {
        this.stockPhotoURL = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getCopyright() {
        if (this.copyright == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.copyright.toArray(new String[this.copyright.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getCopyright(int idx) {
        if (this.copyright == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.copyright.get(idx);
    }

    public int getCopyrightLength() {
        if (this.copyright == null) {
            return  0;
        }
        return this.copyright.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setCopyright(String[] values) {
        this._getCopyright().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.copyright.add(values[i]);
        }
    }

    protected List<String> _getCopyright() {
        if (copyright == null) {
            copyright = new ArrayList<String>();
        }
        return copyright;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setCopyright(int idx, String value) {
        return this.copyright.set(idx, value);
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
     * Gets the value of the detailsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsURL() {
        return detailsURL;
    }

    /**
     * Sets the value of the detailsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsURL(String value) {
        this.detailsURL = value;
    }

    /**
     * Gets the value of the productDetailsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDetailsURL() {
        return productDetailsURL;
    }

    /**
     * Sets the value of the productDetailsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDetailsURL(String value) {
        this.productDetailsURL = value;
    }

    /**
     * Gets the value of the returnSearchResultOnDuplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSearchResultOnDuplicates() {
        return returnSearchResultOnDuplicates;
    }

    /**
     * Sets the value of the returnSearchResultOnDuplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSearchResultOnDuplicates(Boolean value) {
        this.returnSearchResultOnDuplicates = value;
    }

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
     * Gets the value of the brandMPN property.
     * 
     * @return
     *     possible object is
     *     {@link BrandMPNType }
     *     
     */
    public BrandMPNType getBrandMPN() {
        return brandMPN;
    }

    /**
     * Sets the value of the brandMPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandMPNType }
     *     
     */
    public void setBrandMPN(BrandMPNType value) {
        this.brandMPN = value;
    }

    /**
     * Gets the value of the ticketListingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TicketListingDetailsType }
     *     
     */
    public TicketListingDetailsType getTicketListingDetails() {
        return ticketListingDetails;
    }

    /**
     * Sets the value of the ticketListingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketListingDetailsType }
     *     
     */
    public void setTicketListingDetails(TicketListingDetailsType value) {
        this.ticketListingDetails = value;
    }

    /**
     * Gets the value of the useFirstProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseFirstProduct() {
        return useFirstProduct;
    }

    /**
     * Sets the value of the useFirstProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFirstProduct(Boolean value) {
        this.useFirstProduct = value;
    }

    /**
     * Gets the value of the includeeBayProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeeBayProductDetails() {
        return includeeBayProductDetails;
    }

    /**
     * Sets the value of the includeeBayProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeeBayProductDetails(Boolean value) {
        this.includeeBayProductDetails = value;
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
