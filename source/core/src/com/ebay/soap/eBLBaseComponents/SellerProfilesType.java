
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
 * 				Type defining the <b>SellerProfiles</b> container, which consists of references to a seller's payment, shipping, and return policy profiles.
 * 			
 * 
 * <p>Java class for SellerProfilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerProfilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellerShippingProfile" type="{urn:ebay:apis:eBLBaseComponents}SellerShippingProfileType" minOccurs="0"/>
 *         &lt;element name="SellerReturnProfile" type="{urn:ebay:apis:eBLBaseComponents}SellerReturnProfileType" minOccurs="0"/>
 *         &lt;element name="SellerPaymentProfile" type="{urn:ebay:apis:eBLBaseComponents}SellerPaymentProfileType" minOccurs="0"/>
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
@XmlType(name = "SellerProfilesType", propOrder = {
    "sellerShippingProfile",
    "sellerReturnProfile",
    "sellerPaymentProfile",
    "any"
})
public class SellerProfilesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellerShippingProfile")
    protected SellerShippingProfileType sellerShippingProfile;
    @XmlElement(name = "SellerReturnProfile")
    protected SellerReturnProfileType sellerReturnProfile;
    @XmlElement(name = "SellerPaymentProfile")
    protected SellerPaymentProfileType sellerPaymentProfile;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the sellerShippingProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SellerShippingProfileType }
     *     
     */
    public SellerShippingProfileType getSellerShippingProfile() {
        return sellerShippingProfile;
    }

    /**
     * Sets the value of the sellerShippingProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerShippingProfileType }
     *     
     */
    public void setSellerShippingProfile(SellerShippingProfileType value) {
        this.sellerShippingProfile = value;
    }

    /**
     * Gets the value of the sellerReturnProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SellerReturnProfileType }
     *     
     */
    public SellerReturnProfileType getSellerReturnProfile() {
        return sellerReturnProfile;
    }

    /**
     * Sets the value of the sellerReturnProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerReturnProfileType }
     *     
     */
    public void setSellerReturnProfile(SellerReturnProfileType value) {
        this.sellerReturnProfile = value;
    }

    /**
     * Gets the value of the sellerPaymentProfile property.
     * 
     * @return
     *     possible object is
     *     {@link SellerPaymentProfileType }
     *     
     */
    public SellerPaymentProfileType getSellerPaymentProfile() {
        return sellerPaymentProfile;
    }

    /**
     * Sets the value of the sellerPaymentProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPaymentProfileType }
     *     
     */
    public void setSellerPaymentProfile(SellerPaymentProfileType value) {
        this.sellerPaymentProfile = value;
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
