
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
 * 				This container returns the URLs of the seller's self-hosted (hosted outside of eBay) pictures and the URL for the corresponding eBay
 * 				Picture Services (EPS), that was generated when the self-hosted picture was uploaded.
 * 			
 * 
 * <p>Java class for ExtendedPictureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedPictureDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PictureURLs" type="{urn:ebay:apis:eBLBaseComponents}PictureURLsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ExtendedPictureDetailsType", propOrder = {
    "pictureURLs",
    "any"
})
public class ExtendedPictureDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PictureURLs")
    protected List<PictureURLsType> pictureURLs;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PictureURLsType }
     *     
     */
    public PictureURLsType[] getPictureURLs() {
        if (this.pictureURLs == null) {
            return new PictureURLsType[ 0 ] ;
        }
        return ((PictureURLsType[]) this.pictureURLs.toArray(new PictureURLsType[this.pictureURLs.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PictureURLsType }
     *     
     */
    public PictureURLsType getPictureURLs(int idx) {
        if (this.pictureURLs == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.pictureURLs.get(idx);
    }

    public int getPictureURLsLength() {
        if (this.pictureURLs == null) {
            return  0;
        }
        return this.pictureURLs.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PictureURLsType }
     *     
     */
    public void setPictureURLs(PictureURLsType[] values) {
        this._getPictureURLs().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.pictureURLs.add(values[i]);
        }
    }

    protected List<PictureURLsType> _getPictureURLs() {
        if (pictureURLs == null) {
            pictureURLs = new ArrayList<PictureURLsType>();
        }
        return pictureURLs;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PictureURLsType }
     *     
     */
    public PictureURLsType setPictureURLs(int idx, PictureURLsType value) {
        return this.pictureURLs.set(idx, value);
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
