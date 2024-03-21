
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for WantItNowPostArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WantItNowPostArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WantItNowPost" type="{urn:ebay:apis:eBLBaseComponents}WantItNowPostType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WantItNowPostArrayType", propOrder = {
    "wantItNowPost"
})
public class WantItNowPostArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "WantItNowPost")
    protected List<WantItNowPostType> wantItNowPost;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link WantItNowPostType }
     *     
     */
    public WantItNowPostType[] getWantItNowPost() {
        if (this.wantItNowPost == null) {
            return new WantItNowPostType[ 0 ] ;
        }
        return ((WantItNowPostType[]) this.wantItNowPost.toArray(new WantItNowPostType[this.wantItNowPost.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link WantItNowPostType }
     *     
     */
    public WantItNowPostType getWantItNowPost(int idx) {
        if (this.wantItNowPost == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.wantItNowPost.get(idx);
    }

    public int getWantItNowPostLength() {
        if (this.wantItNowPost == null) {
            return  0;
        }
        return this.wantItNowPost.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link WantItNowPostType }
     *     
     */
    public void setWantItNowPost(WantItNowPostType[] values) {
        this._getWantItNowPost().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.wantItNowPost.add(values[i]);
        }
    }

    protected List<WantItNowPostType> _getWantItNowPost() {
        if (wantItNowPost == null) {
            wantItNowPost = new ArrayList<WantItNowPostType>();
        }
        return wantItNowPost;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link WantItNowPostType }
     *     
     */
    public WantItNowPostType setWantItNowPost(int idx, WantItNowPostType value) {
        return this.wantItNowPost.set(idx, value);
    }

}
