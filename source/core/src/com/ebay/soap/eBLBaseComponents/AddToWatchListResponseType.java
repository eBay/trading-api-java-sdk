
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type defines the response of the <b>AddToWatchList</b> call. Along with data indicating the success or failure of adding one or more items to a user's Watch List, this response also includes the number of items currently in the user's Watch List and the maximum number of items allowed in the Watch List.
 * 			
 * 
 * <p>Java class for AddToWatchListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddToWatchListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="WatchListCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WatchListMaximum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddToWatchListResponseType", propOrder = {
    "watchListCount",
    "watchListMaximum"
})
public class AddToWatchListResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "WatchListCount")
    protected Integer watchListCount;
    @XmlElement(name = "WatchListMaximum")
    protected Integer watchListMaximum;

    /**
     * Gets the value of the watchListCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWatchListCount() {
        return watchListCount;
    }

    /**
     * Sets the value of the watchListCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWatchListCount(Integer value) {
        this.watchListCount = value;
    }

    /**
     * Gets the value of the watchListMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWatchListMaximum() {
        return watchListMaximum;
    }

    /**
     * Sets the value of the watchListMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWatchListMaximum(Integer value) {
        this.watchListMaximum = value;
    }

}
