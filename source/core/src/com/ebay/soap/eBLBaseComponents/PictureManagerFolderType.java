
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
 * <p>Java class for PictureManagerFolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureManagerFolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Picture" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerPictureType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PictureManagerFolderType", propOrder = {
    "folderID",
    "name",
    "picture",
    "any"
})
public class PictureManagerFolderType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FolderID")
    protected Integer folderID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Picture")
    protected List<PictureManagerPictureType> picture;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the folderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderID() {
        return folderID;
    }

    /**
     * Sets the value of the folderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderID(Integer value) {
        this.folderID = value;
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
     * 
     * 
     * @return
     *     array of
     *     {@link PictureManagerPictureType }
     *     
     */
    public PictureManagerPictureType[] getPicture() {
        if (this.picture == null) {
            return new PictureManagerPictureType[ 0 ] ;
        }
        return ((PictureManagerPictureType[]) this.picture.toArray(new PictureManagerPictureType[this.picture.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PictureManagerPictureType }
     *     
     */
    public PictureManagerPictureType getPicture(int idx) {
        if (this.picture == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.picture.get(idx);
    }

    public int getPictureLength() {
        if (this.picture == null) {
            return  0;
        }
        return this.picture.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PictureManagerPictureType }
     *     
     */
    public void setPicture(PictureManagerPictureType[] values) {
        this._getPicture().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.picture.add(values[i]);
        }
    }

    protected List<PictureManagerPictureType> _getPicture() {
        if (picture == null) {
            picture = new ArrayList<PictureManagerPictureType>();
        }
        return picture;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerPictureType }
     *     
     */
    public PictureManagerPictureType setPicture(int idx, PictureManagerPictureType value) {
        return this.picture.set(idx, value);
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
