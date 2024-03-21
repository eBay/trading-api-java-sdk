
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
 * 			 Type defining the <b>VariationSpecificPictureSet</b> container, which is
 * 			 used to specify the URL(s) where the picture(s) of the variation specific will be
 * 			 hosted. If the <b>Variations.Pictures</b> container is used, at least one
 * 			 <b>VariationSpecificPictureSet</b> container is required.
 * 			
 * 
 * <p>Java class for VariationSpecificPictureSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariationSpecificPictureSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariationSpecificValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GalleryURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ExternalPictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtendedPictureDetails" type="{urn:ebay:apis:eBLBaseComponents}ExtendedPictureDetailsType" minOccurs="0"/>
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
@XmlType(name = "VariationSpecificPictureSetType", propOrder = {
    "variationSpecificValue",
    "pictureURL",
    "galleryURL",
    "externalPictureURL",
    "extendedPictureDetails",
    "any"
})
public class VariationSpecificPictureSetType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "VariationSpecificValue")
    protected String variationSpecificValue;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> pictureURL;
    @XmlElement(name = "GalleryURL")
    @XmlSchemaType(name = "anyURI")
    protected String galleryURL;
    @XmlElement(name = "ExternalPictureURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> externalPictureURL;
    @XmlElement(name = "ExtendedPictureDetails")
    protected ExtendedPictureDetailsType extendedPictureDetails;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the variationSpecificValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationSpecificValue() {
        return variationSpecificValue;
    }

    /**
     * Sets the value of the variationSpecificValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationSpecificValue(String value) {
        this.variationSpecificValue = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getPictureURL() {
        if (this.pictureURL == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.pictureURL.toArray(new String[this.pictureURL.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getPictureURL(int idx) {
        if (this.pictureURL == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.pictureURL.get(idx);
    }

    public int getPictureURLLength() {
        if (this.pictureURL == null) {
            return  0;
        }
        return this.pictureURL.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setPictureURL(String[] values) {
        this._getPictureURL().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.pictureURL.add(values[i]);
        }
    }

    protected List<String> _getPictureURL() {
        if (pictureURL == null) {
            pictureURL = new ArrayList<String>();
        }
        return pictureURL;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setPictureURL(int idx, String value) {
        return this.pictureURL.set(idx, value);
    }

    /**
     * Gets the value of the galleryURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryURL() {
        return galleryURL;
    }

    /**
     * Sets the value of the galleryURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryURL(String value) {
        this.galleryURL = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getExternalPictureURL() {
        if (this.externalPictureURL == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.externalPictureURL.toArray(new String[this.externalPictureURL.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getExternalPictureURL(int idx) {
        if (this.externalPictureURL == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.externalPictureURL.get(idx);
    }

    public int getExternalPictureURLLength() {
        if (this.externalPictureURL == null) {
            return  0;
        }
        return this.externalPictureURL.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setExternalPictureURL(String[] values) {
        this._getExternalPictureURL().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.externalPictureURL.add(values[i]);
        }
    }

    protected List<String> _getExternalPictureURL() {
        if (externalPictureURL == null) {
            externalPictureURL = new ArrayList<String>();
        }
        return externalPictureURL;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setExternalPictureURL(int idx, String value) {
        return this.externalPictureURL.set(idx, value);
    }

    /**
     * Gets the value of the extendedPictureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedPictureDetailsType }
     *     
     */
    public ExtendedPictureDetailsType getExtendedPictureDetails() {
        return extendedPictureDetails;
    }

    /**
     * Sets the value of the extendedPictureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedPictureDetailsType }
     *     
     */
    public void setExtendedPictureDetails(ExtendedPictureDetailsType value) {
        this.extendedPictureDetails = value;
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
