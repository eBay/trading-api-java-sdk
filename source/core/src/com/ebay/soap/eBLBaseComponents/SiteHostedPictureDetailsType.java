
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 *         Type defining the <b>SiteHostedPictureDetails</b> container that is returned
 * 				in an <b>UploadSiteHostedPictures</b> call.
 *       
 * 
 * <p>Java class for SiteHostedPictureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteHostedPictureDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PictureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PictureSet" type="{urn:ebay:apis:eBLBaseComponents}PictureSetCodeType" minOccurs="0"/>
 *         &lt;element name="PictureFormat" type="{urn:ebay:apis:eBLBaseComponents}PictureFormatCodeType" minOccurs="0"/>
 *         &lt;element name="FullURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="BaseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PictureSetMember" type="{urn:ebay:apis:eBLBaseComponents}PictureSetMemberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalPictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="UseByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "SiteHostedPictureDetailsType", propOrder = {
    "pictureName",
    "pictureSet",
    "pictureFormat",
    "fullURL",
    "baseURL",
    "pictureSetMember",
    "externalPictureURL",
    "useByDate",
    "any"
})
public class SiteHostedPictureDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PictureName")
    protected String pictureName;
    @XmlElement(name = "PictureSet")
    protected PictureSetCodeType pictureSet;
    @XmlElement(name = "PictureFormat")
    protected PictureFormatCodeType pictureFormat;
    @XmlElement(name = "FullURL")
    @XmlSchemaType(name = "anyURI")
    protected String fullURL;
    @XmlElement(name = "BaseURL")
    @XmlSchemaType(name = "anyURI")
    protected String baseURL;
    @XmlElement(name = "PictureSetMember")
    protected List<PictureSetMemberType> pictureSetMember;
    @XmlElement(name = "ExternalPictureURL")
    @XmlSchemaType(name = "anyURI")
    protected String externalPictureURL;
    @XmlElement(name = "UseByDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar useByDate;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the pictureFormat property.
     * 
     * @return
     *     possible object is
     *     {@link PictureFormatCodeType }
     *     
     */
    public PictureFormatCodeType getPictureFormat() {
        return pictureFormat;
    }

    /**
     * Sets the value of the pictureFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureFormatCodeType }
     *     
     */
    public void setPictureFormat(PictureFormatCodeType value) {
        this.pictureFormat = value;
    }

    /**
     * Gets the value of the fullURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullURL() {
        return fullURL;
    }

    /**
     * Sets the value of the fullURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullURL(String value) {
        this.fullURL = value;
    }

    /**
     * Gets the value of the baseURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseURL() {
        return baseURL;
    }

    /**
     * Sets the value of the baseURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseURL(String value) {
        this.baseURL = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PictureSetMemberType }
     *     
     */
    public PictureSetMemberType[] getPictureSetMember() {
        if (this.pictureSetMember == null) {
            return new PictureSetMemberType[ 0 ] ;
        }
        return ((PictureSetMemberType[]) this.pictureSetMember.toArray(new PictureSetMemberType[this.pictureSetMember.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PictureSetMemberType }
     *     
     */
    public PictureSetMemberType getPictureSetMember(int idx) {
        if (this.pictureSetMember == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.pictureSetMember.get(idx);
    }

    public int getPictureSetMemberLength() {
        if (this.pictureSetMember == null) {
            return  0;
        }
        return this.pictureSetMember.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PictureSetMemberType }
     *     
     */
    public void setPictureSetMember(PictureSetMemberType[] values) {
        this._getPictureSetMember().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.pictureSetMember.add(values[i]);
        }
    }

    protected List<PictureSetMemberType> _getPictureSetMember() {
        if (pictureSetMember == null) {
            pictureSetMember = new ArrayList<PictureSetMemberType>();
        }
        return pictureSetMember;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PictureSetMemberType }
     *     
     */
    public PictureSetMemberType setPictureSetMember(int idx, PictureSetMemberType value) {
        return this.pictureSetMember.set(idx, value);
    }

    /**
     * Gets the value of the externalPictureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPictureURL() {
        return externalPictureURL;
    }

    /**
     * Sets the value of the externalPictureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPictureURL(String value) {
        this.externalPictureURL = value;
    }

    /**
     * Gets the value of the useByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUseByDate() {
        return useByDate;
    }

    /**
     * Sets the value of the useByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseByDate(Calendar value) {
        this.useByDate = value;
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
