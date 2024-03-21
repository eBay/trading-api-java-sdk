
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
 * 				Type used by the <b>ApplicationDeliveryPreferences</b> container to control/indicate where and how Platform Notifications and/or Client Alerts are delivered to a user application, server, and/or email address.
 * 			
 * 
 * <p>Java class for ApplicationDeliveryPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationDeliveryPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ApplicationEnable" type="{urn:ebay:apis:eBLBaseComponents}EnableCodeType" minOccurs="0"/>
 *         &lt;element name="AlertEmail" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="AlertEnable" type="{urn:ebay:apis:eBLBaseComponents}EnableCodeType" minOccurs="0"/>
 *         &lt;element name="NotificationPayloadType" type="{urn:ebay:apis:eBLBaseComponents}NotificationPayloadTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{urn:ebay:apis:eBLBaseComponents}DeviceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="PayloadVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryURLDetails" type="{urn:ebay:apis:eBLBaseComponents}DeliveryURLDetailType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ApplicationDeliveryPreferencesType", propOrder = {
    "applicationURL",
    "applicationEnable",
    "alertEmail",
    "alertEnable",
    "notificationPayloadType",
    "deviceType",
    "payloadVersion",
    "deliveryURLDetails",
    "any"
})
public class ApplicationDeliveryPreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ApplicationURL")
    @XmlSchemaType(name = "anyURI")
    protected String applicationURL;
    @XmlElement(name = "ApplicationEnable")
    protected EnableCodeType applicationEnable;
    @XmlElement(name = "AlertEmail")
    @XmlSchemaType(name = "anyURI")
    protected String alertEmail;
    @XmlElement(name = "AlertEnable")
    protected EnableCodeType alertEnable;
    @XmlElement(name = "NotificationPayloadType")
    protected NotificationPayloadTypeCodeType notificationPayloadType;
    @XmlElement(name = "DeviceType")
    protected DeviceTypeCodeType deviceType;
    @XmlElement(name = "PayloadVersion")
    protected String payloadVersion;
    @XmlElement(name = "DeliveryURLDetails")
    protected List<DeliveryURLDetailType> deliveryURLDetails;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the applicationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationURL() {
        return applicationURL;
    }

    /**
     * Sets the value of the applicationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationURL(String value) {
        this.applicationURL = value;
    }

    /**
     * Gets the value of the applicationEnable property.
     * 
     * @return
     *     possible object is
     *     {@link EnableCodeType }
     *     
     */
    public EnableCodeType getApplicationEnable() {
        return applicationEnable;
    }

    /**
     * Sets the value of the applicationEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableCodeType }
     *     
     */
    public void setApplicationEnable(EnableCodeType value) {
        this.applicationEnable = value;
    }

    /**
     * Gets the value of the alertEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertEmail() {
        return alertEmail;
    }

    /**
     * Sets the value of the alertEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertEmail(String value) {
        this.alertEmail = value;
    }

    /**
     * Gets the value of the alertEnable property.
     * 
     * @return
     *     possible object is
     *     {@link EnableCodeType }
     *     
     */
    public EnableCodeType getAlertEnable() {
        return alertEnable;
    }

    /**
     * Sets the value of the alertEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableCodeType }
     *     
     */
    public void setAlertEnable(EnableCodeType value) {
        this.alertEnable = value;
    }

    /**
     * Gets the value of the notificationPayloadType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationPayloadTypeCodeType }
     *     
     */
    public NotificationPayloadTypeCodeType getNotificationPayloadType() {
        return notificationPayloadType;
    }

    /**
     * Sets the value of the notificationPayloadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationPayloadTypeCodeType }
     *     
     */
    public void setNotificationPayloadType(NotificationPayloadTypeCodeType value) {
        this.notificationPayloadType = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceTypeCodeType }
     *     
     */
    public DeviceTypeCodeType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceTypeCodeType }
     *     
     */
    public void setDeviceType(DeviceTypeCodeType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the payloadVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayloadVersion() {
        return payloadVersion;
    }

    /**
     * Sets the value of the payloadVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayloadVersion(String value) {
        this.payloadVersion = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DeliveryURLDetailType }
     *     
     */
    public DeliveryURLDetailType[] getDeliveryURLDetails() {
        if (this.deliveryURLDetails == null) {
            return new DeliveryURLDetailType[ 0 ] ;
        }
        return ((DeliveryURLDetailType[]) this.deliveryURLDetails.toArray(new DeliveryURLDetailType[this.deliveryURLDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DeliveryURLDetailType }
     *     
     */
    public DeliveryURLDetailType getDeliveryURLDetails(int idx) {
        if (this.deliveryURLDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.deliveryURLDetails.get(idx);
    }

    public int getDeliveryURLDetailsLength() {
        if (this.deliveryURLDetails == null) {
            return  0;
        }
        return this.deliveryURLDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DeliveryURLDetailType }
     *     
     */
    public void setDeliveryURLDetails(DeliveryURLDetailType[] values) {
        this._getDeliveryURLDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.deliveryURLDetails.add(values[i]);
        }
    }

    protected List<DeliveryURLDetailType> _getDeliveryURLDetails() {
        if (deliveryURLDetails == null) {
            deliveryURLDetails = new ArrayList<DeliveryURLDetailType>();
        }
        return deliveryURLDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryURLDetailType }
     *     
     */
    public DeliveryURLDetailType setDeliveryURLDetails(int idx, DeliveryURLDetailType value) {
        return this.deliveryURLDetails.set(idx, value);
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
