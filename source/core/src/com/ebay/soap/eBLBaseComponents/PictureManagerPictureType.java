
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
 * 				This type is deprecated.  
 * 			
 * 
 * <p>Java class for PictureManagerPictureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureManagerPictureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisplayFormat" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerPictureDisplayType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PictureManagerPictureType", propOrder = {
    "pictureURL",
    "name",
    "date",
    "displayFormat",
    "any"
})
public class PictureManagerPictureType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected String pictureURL;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Date", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar date;
    @XmlElement(name = "DisplayFormat")
    protected List<PictureManagerPictureDisplayType> displayFormat;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pictureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureURL() {
        return pictureURL;
    }

    /**
     * Sets the value of the pictureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureURL(String value) {
        this.pictureURL = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(Calendar value) {
        this.date = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PictureManagerPictureDisplayType }
     *     
     */
    public PictureManagerPictureDisplayType[] getDisplayFormat() {
        if (this.displayFormat == null) {
            return new PictureManagerPictureDisplayType[ 0 ] ;
        }
        return ((PictureManagerPictureDisplayType[]) this.displayFormat.toArray(new PictureManagerPictureDisplayType[this.displayFormat.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PictureManagerPictureDisplayType }
     *     
     */
    public PictureManagerPictureDisplayType getDisplayFormat(int idx) {
        if (this.displayFormat == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.displayFormat.get(idx);
    }

    public int getDisplayFormatLength() {
        if (this.displayFormat == null) {
            return  0;
        }
        return this.displayFormat.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PictureManagerPictureDisplayType }
     *     
     */
    public void setDisplayFormat(PictureManagerPictureDisplayType[] values) {
        this._getDisplayFormat().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.displayFormat.add(values[i]);
        }
    }

    protected List<PictureManagerPictureDisplayType> _getDisplayFormat() {
        if (displayFormat == null) {
            displayFormat = new ArrayList<PictureManagerPictureDisplayType>();
        }
        return displayFormat;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerPictureDisplayType }
     *     
     */
    public PictureManagerPictureDisplayType setDisplayFormat(int idx, PictureManagerPictureDisplayType value) {
        return this.displayFormat.set(idx, value);
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
