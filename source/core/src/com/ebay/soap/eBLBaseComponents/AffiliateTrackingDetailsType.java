
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
 * 				Type used by the <b>AffiliateTrackingDetails</b> container, which is included in the <b>PlaceOffer</b> call to pass in eBay Partner Network affiliate-related data, so affiliates can earn commissions based on user activity and the number of calls made by the user's application.
 * 			
 * 
 * <p>Java class for AffiliateTrackingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffiliateTrackingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingPartnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationDeviceType" type="{urn:ebay:apis:eBLBaseComponents}ApplicationDeviceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="AffiliateUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "AffiliateTrackingDetailsType", propOrder = {
    "trackingID",
    "trackingPartnerCode",
    "applicationDeviceType",
    "affiliateUserID",
    "any"
})
public class AffiliateTrackingDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TrackingID")
    protected String trackingID;
    @XmlElement(name = "TrackingPartnerCode")
    protected String trackingPartnerCode;
    @XmlElement(name = "ApplicationDeviceType")
    protected ApplicationDeviceTypeCodeType applicationDeviceType;
    @XmlElement(name = "AffiliateUserID")
    protected String affiliateUserID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingID() {
        return trackingID;
    }

    /**
     * Sets the value of the trackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingID(String value) {
        this.trackingID = value;
    }

    /**
     * Gets the value of the trackingPartnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingPartnerCode() {
        return trackingPartnerCode;
    }

    /**
     * Sets the value of the trackingPartnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingPartnerCode(String value) {
        this.trackingPartnerCode = value;
    }

    /**
     * Gets the value of the applicationDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDeviceTypeCodeType }
     *     
     */
    public ApplicationDeviceTypeCodeType getApplicationDeviceType() {
        return applicationDeviceType;
    }

    /**
     * Sets the value of the applicationDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDeviceTypeCodeType }
     *     
     */
    public void setApplicationDeviceType(ApplicationDeviceTypeCodeType value) {
        this.applicationDeviceType = value;
    }

    /**
     * Gets the value of the affiliateUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateUserID() {
        return affiliateUserID;
    }

    /**
     * Sets the value of the affiliateUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateUserID(String value) {
        this.affiliateUserID = value;
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
