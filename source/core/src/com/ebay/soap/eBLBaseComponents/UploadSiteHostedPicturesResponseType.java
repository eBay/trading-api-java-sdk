
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains information about a picture upload (i.e., information about a picture
 * 				upload containing a binary attachment of an image).
 * 			
 * 
 * <p>Java class for UploadSiteHostedPicturesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadSiteHostedPicturesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PictureSystemVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SiteHostedPictureDetails" type="{urn:ebay:apis:eBLBaseComponents}SiteHostedPictureDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadSiteHostedPicturesResponseType", propOrder = {
    "pictureSystemVersion",
    "siteHostedPictureDetails"
})
public class UploadSiteHostedPicturesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PictureSystemVersion")
    protected Integer pictureSystemVersion;
    @XmlElement(name = "SiteHostedPictureDetails")
    protected SiteHostedPictureDetailsType siteHostedPictureDetails;

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
     * Gets the value of the siteHostedPictureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SiteHostedPictureDetailsType }
     *     
     */
    public SiteHostedPictureDetailsType getSiteHostedPictureDetails() {
        return siteHostedPictureDetails;
    }

    /**
     * Sets the value of the siteHostedPictureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteHostedPictureDetailsType }
     *     
     */
    public void setSiteHostedPictureDetails(SiteHostedPictureDetailsType value) {
        this.siteHostedPictureDetails = value;
    }

}
