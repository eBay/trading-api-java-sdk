
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
 * 				URL and size information for each generated and stored picture.
 * 				This data is provided for use in application previews of pictures.
 * 				This data is used for display control for specific pictures in the generated imageset.
 * 				This container is supplied for all generated pictures.
 * 			
 * 
 * <p>Java class for PictureSetMemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureSetMemberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PictureHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PictureWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "PictureSetMemberType", propOrder = {
    "memberURL",
    "pictureHeight",
    "pictureWidth",
    "any"
})
public class PictureSetMemberType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MemberURL")
    @XmlSchemaType(name = "anyURI")
    protected String memberURL;
    @XmlElement(name = "PictureHeight")
    protected Integer pictureHeight;
    @XmlElement(name = "PictureWidth")
    protected Integer pictureWidth;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the memberURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberURL() {
        return memberURL;
    }

    /**
     * Sets the value of the memberURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberURL(String value) {
        this.memberURL = value;
    }

    /**
     * Gets the value of the pictureHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPictureHeight() {
        return pictureHeight;
    }

    /**
     * Sets the value of the pictureHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPictureHeight(Integer value) {
        this.pictureHeight = value;
    }

    /**
     * Gets the value of the pictureWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPictureWidth() {
        return pictureWidth;
    }

    /**
     * Sets the value of the pictureWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPictureWidth(Integer value) {
        this.pictureWidth = value;
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
