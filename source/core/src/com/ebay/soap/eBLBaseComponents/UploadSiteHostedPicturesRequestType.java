
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Uploads a picture to the eBay Picture Service and returns a URL of the picture.
 *         You will use this URL when creating, revising, or relisting an item with the Trading API.
 *       
 * 
 * <p>Java class for UploadSiteHostedPicturesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadSiteHostedPicturesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PictureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PictureSystemVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PictureSet" type="{urn:ebay:apis:eBLBaseComponents}PictureSetCodeType" minOccurs="0"/>
 *         &lt;element name="PictureData" type="{urn:ebay:apis:eBLBaseComponents}Base64BinaryType" minOccurs="0"/>
 *         &lt;element name="PictureUploadPolicy" type="{urn:ebay:apis:eBLBaseComponents}PictureUploadPolicyCodeType" minOccurs="0"/>
 *         &lt;element name="ExternalPictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PictureWatermark" type="{urn:ebay:apis:eBLBaseComponents}PictureWatermarkCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtensionInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadSiteHostedPicturesRequestType", propOrder = {
    "pictureName",
    "pictureSystemVersion",
    "pictureSet",
    "pictureData",
    "pictureUploadPolicy",
    "externalPictureURL",
    "pictureWatermark",
    "extensionInDays"
})
public class UploadSiteHostedPicturesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PictureName")
    protected String pictureName;
    @XmlElement(name = "PictureSystemVersion")
    protected Integer pictureSystemVersion;
    @XmlElement(name = "PictureSet")
    protected PictureSetCodeType pictureSet;
    @XmlElement(name = "PictureData")
    protected Base64BinaryType pictureData;
    @XmlElement(name = "PictureUploadPolicy")
    protected PictureUploadPolicyCodeType pictureUploadPolicy;
    @XmlElement(name = "ExternalPictureURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> externalPictureURL;
    @XmlElement(name = "PictureWatermark")
    protected List<PictureWatermarkCodeType> pictureWatermark;
    @XmlElement(name = "ExtensionInDays")
    protected Integer extensionInDays;

    /**
     * Gets the value of the pictureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureName() {
        return pictureName;
    }

    /**
     * Sets the value of the pictureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureName(String value) {
        this.pictureName = value;
    }

    /**
     * Gets the value of the pictureSystemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPictureSystemVersion() {
        return pictureSystemVersion;
    }

    /**
     * Sets the value of the pictureSystemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPictureSystemVersion(Integer value) {
        this.pictureSystemVersion = value;
    }

    /**
     * Gets the value of the pictureSet property.
     * 
     * @return
     *     possible object is
     *     {@link PictureSetCodeType }
     *     
     */
    public PictureSetCodeType getPictureSet() {
        return pictureSet;
    }

    /**
     * Sets the value of the pictureSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureSetCodeType }
     *     
     */
    public void setPictureSet(PictureSetCodeType value) {
        this.pictureSet = value;
    }

    /**
     * Gets the value of the pictureData property.
     * 
     * @return
     *     possible object is
     *     {@link Base64BinaryType }
     *     
     */
    public Base64BinaryType getPictureData() {
        return pictureData;
    }

    /**
     * Sets the value of the pictureData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64BinaryType }
     *     
     */
    public void setPictureData(Base64BinaryType value) {
        this.pictureData = value;
    }

    /**
     * Gets the value of the pictureUploadPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link PictureUploadPolicyCodeType }
     *     
     */
    public PictureUploadPolicyCodeType getPictureUploadPolicy() {
        return pictureUploadPolicy;
    }

    /**
     * Sets the value of the pictureUploadPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureUploadPolicyCodeType }
     *     
     */
    public void setPictureUploadPolicy(PictureUploadPolicyCodeType value) {
        this.pictureUploadPolicy = value;
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
     * 
     * 
     * @return
     *     array of
     *     {@link PictureWatermarkCodeType }
     *     
     */
    public PictureWatermarkCodeType[] getPictureWatermark() {
        if (this.pictureWatermark == null) {
            return new PictureWatermarkCodeType[ 0 ] ;
        }
        return ((PictureWatermarkCodeType[]) this.pictureWatermark.toArray(new PictureWatermarkCodeType[this.pictureWatermark.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PictureWatermarkCodeType }
     *     
     */
    public PictureWatermarkCodeType getPictureWatermark(int idx) {
        if (this.pictureWatermark == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.pictureWatermark.get(idx);
    }

    public int getPictureWatermarkLength() {
        if (this.pictureWatermark == null) {
            return  0;
        }
        return this.pictureWatermark.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PictureWatermarkCodeType }
     *     
     */
    public void setPictureWatermark(PictureWatermarkCodeType[] values) {
        this._getPictureWatermark().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.pictureWatermark.add(values[i]);
        }
    }

    protected List<PictureWatermarkCodeType> _getPictureWatermark() {
        if (pictureWatermark == null) {
            pictureWatermark = new ArrayList<PictureWatermarkCodeType>();
        }
        return pictureWatermark;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PictureWatermarkCodeType }
     *     
     */
    public PictureWatermarkCodeType setPictureWatermark(int idx, PictureWatermarkCodeType value) {
        return this.pictureWatermark.set(idx, value);
    }

    /**
     * Gets the value of the extensionInDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtensionInDays() {
        return extensionInDays;
    }

    /**
     * Sets the value of the extensionInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtensionInDays(Integer value) {
        this.extensionInDays = value;
    }

}
