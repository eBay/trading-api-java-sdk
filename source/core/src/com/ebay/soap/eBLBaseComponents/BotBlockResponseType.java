
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
 * 				This type is used by the <b>BotBlock</b> container that is returned in the <b>PlaceOffer</b> call response if eBay is requiring that the user supply an authentication token and URL in order for eBay to process the <b>PlaceOffer</b> call. The authentication token and URL values that are returned in the <b>PlaceOffer</b> call response are then passed in the <b>BotBlock</b> container of a subsequent <b>PlaceOffer</b> call.
 * 			
 * 
 * <p>Java class for BotBlockResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BotBlockResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BotBlockToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BotBlockUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BotBlockAudioUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BotBlockResponseType", propOrder = {
    "botBlockToken",
    "botBlockUrl",
    "botBlockAudioUrl",
    "any"
})
public class BotBlockResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BotBlockToken")
    protected String botBlockToken;
    @XmlElement(name = "BotBlockUrl")
    protected String botBlockUrl;
    @XmlElement(name = "BotBlockAudioUrl")
    protected String botBlockAudioUrl;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the botBlockToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotBlockToken() {
        return botBlockToken;
    }

    /**
     * Sets the value of the botBlockToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotBlockToken(String value) {
        this.botBlockToken = value;
    }

    /**
     * Gets the value of the botBlockUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotBlockUrl() {
        return botBlockUrl;
    }

    /**
     * Sets the value of the botBlockUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotBlockUrl(String value) {
        this.botBlockUrl = value;
    }

    /**
     * Gets the value of the botBlockAudioUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotBlockAudioUrl() {
        return botBlockAudioUrl;
    }

    /**
     * Sets the value of the botBlockAudioUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotBlockAudioUrl(String value) {
        this.botBlockAudioUrl = value;
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
