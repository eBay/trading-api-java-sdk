
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
 * 				Returns the URL of an eBay Picture Services image whose expiration date was
 * 				extended.
 * 			
 * 
 * <p>Java class for ExtendSiteHostedPicturesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendSiteHostedPicturesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendSiteHostedPicturesResponseType", propOrder = {
    "pictureURL"
})
public class ExtendSiteHostedPicturesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> pictureURL;

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

}
