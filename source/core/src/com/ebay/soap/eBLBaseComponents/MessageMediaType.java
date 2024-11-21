
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
 * 			Container for the image file that is to be sent in a message, which lets sellers share photos in messages using the API.
 * 			The photo must be uploaded by the seller or buyer to
 * 			<a href="https://developer.ebay.com/devzone/xml/docs/reference/ebay/uploadsitehostedpictures.html">EPS (eBay Picture Services)</a>
 * 			using a separate API call or the web flow. After the image is on the eBay server, you can
 * 			use <b>AddMemberMessage</b> calls to pass the URL of the image in a message. The
 * 			uploaded images will be available as part of the email as a thumbnail image.
 * 			Clicking on the thumbnail, opens a larger version of the image in a filmstrip.
 * 			The image name will be displayed on the title of the filmstrip component.
 * 			These uploaded images will also be returned as <b>MessageMediaType</b> arrays in the
 * 			<b>GetMemberMessages</b> and <b>GetMyMessages</b> API response. It doesn't matter if an image was uploaded using the web flow or using the API, it can be accessed using either the web flow or the API and web.
 * 			
 * 
 * <p>Java class for MessageMediaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageMediaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediaURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="MediaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "MessageMediaType", propOrder = {
    "mediaURL",
    "mediaName",
    "any"
})
public class MessageMediaType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MediaURL")
    @XmlSchemaType(name = "anyURI")
    protected String mediaURL;
    @XmlElement(name = "MediaName")
    protected String mediaName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the mediaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaURL() {
        return mediaURL;
    }

    /**
     * Sets the value of the mediaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaURL(String value) {
        this.mediaURL = value;
    }

    /**
     * Gets the value of the mediaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaName() {
        return mediaName;
    }

    /**
     * Sets the value of the mediaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaName(String value) {
        this.mediaName = value;
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
