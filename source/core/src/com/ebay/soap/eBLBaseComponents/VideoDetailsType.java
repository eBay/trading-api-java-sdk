
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
 * 				This type is used by the Add/Revise/Relist calls to add a video to a listing. Videos can be added to listings using the <a href="/api-docs/commerce/media/overview.html" target="_blank">Media API</a>. See the <a href="/api-docs/commerce/media/overview.html" target="_blank">Media API</a> reference documentation for all of the necessary details to upload videos to eBay.
 * 				<br/><br/>
 * 				The <b>GetItem</b> call will return the <b>VideoDetails</b> container if the listing contains a video, and the seller of the item is the one making the <b>GetItem</b> call.
 * 			
 * 
 * <p>Java class for VideoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "VideoDetailsType", propOrder = {
    "videoID",
    "any"
})
public class VideoDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "VideoID")
    protected List<String> videoID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getVideoID() {
        if (this.videoID == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.videoID.toArray(new String[this.videoID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getVideoID(int idx) {
        if (this.videoID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.videoID.get(idx);
    }

    public int getVideoIDLength() {
        if (this.videoID == null) {
            return  0;
        }
        return this.videoID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setVideoID(String[] values) {
        this._getVideoID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.videoID.add(values[i]);
        }
    }

    protected List<String> _getVideoID() {
        if (videoID == null) {
            videoID = new ArrayList<String>();
        }
        return videoID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setVideoID(int idx, String value) {
        return this.videoID.set(idx, value);
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
