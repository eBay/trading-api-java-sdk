
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
 * 				Manages notification and alert preferences for applications and users.
 * 			
 * 
 * <p>Java class for SetNotificationPreferencesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetNotificationPreferencesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationDeliveryPreferences" type="{urn:ebay:apis:eBLBaseComponents}ApplicationDeliveryPreferencesType" minOccurs="0"/>
 *         &lt;element name="UserDeliveryPreferenceArray" type="{urn:ebay:apis:eBLBaseComponents}NotificationEnableArrayType" minOccurs="0"/>
 *         &lt;element name="UserData" type="{urn:ebay:apis:eBLBaseComponents}NotificationUserDataType" minOccurs="0"/>
 *         &lt;element name="EventProperty" type="{urn:ebay:apis:eBLBaseComponents}NotificationEventPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeliveryURLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetNotificationPreferencesRequestType", propOrder = {
    "applicationDeliveryPreferences",
    "userDeliveryPreferenceArray",
    "userData",
    "eventProperty",
    "deliveryURLName"
})
public class SetNotificationPreferencesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ApplicationDeliveryPreferences")
    protected ApplicationDeliveryPreferencesType applicationDeliveryPreferences;
    @XmlElement(name = "UserDeliveryPreferenceArray")
    protected NotificationEnableArrayType userDeliveryPreferenceArray;
    @XmlElement(name = "UserData")
    protected NotificationUserDataType userData;
    @XmlElement(name = "EventProperty")
    protected List<NotificationEventPropertyType> eventProperty;
    @XmlElement(name = "DeliveryURLName")
    protected String deliveryURLName;

    /**
     * Gets the value of the applicationDeliveryPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDeliveryPreferencesType }
     *     
     */
    public ApplicationDeliveryPreferencesType getApplicationDeliveryPreferences() {
        return applicationDeliveryPreferences;
    }

    /**
     * Sets the value of the applicationDeliveryPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDeliveryPreferencesType }
     *     
     */
    public void setApplicationDeliveryPreferences(ApplicationDeliveryPreferencesType value) {
        this.applicationDeliveryPreferences = value;
    }

    /**
     * Gets the value of the userDeliveryPreferenceArray property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEnableArrayType }
     *     
     */
    public NotificationEnableArrayType getUserDeliveryPreferenceArray() {
        return userDeliveryPreferenceArray;
    }

    /**
     * Sets the value of the userDeliveryPreferenceArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEnableArrayType }
     *     
     */
    public void setUserDeliveryPreferenceArray(NotificationEnableArrayType value) {
        this.userDeliveryPreferenceArray = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationUserDataType }
     *     
     */
    public NotificationUserDataType getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationUserDataType }
     *     
     */
    public void setUserData(NotificationUserDataType value) {
        this.userData = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link NotificationEventPropertyType }
     *     
     */
    public NotificationEventPropertyType[] getEventProperty() {
        if (this.eventProperty == null) {
            return new NotificationEventPropertyType[ 0 ] ;
        }
        return ((NotificationEventPropertyType[]) this.eventProperty.toArray(new NotificationEventPropertyType[this.eventProperty.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NotificationEventPropertyType }
     *     
     */
    public NotificationEventPropertyType getEventProperty(int idx) {
        if (this.eventProperty == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.eventProperty.get(idx);
    }

    public int getEventPropertyLength() {
        if (this.eventProperty == null) {
            return  0;
        }
        return this.eventProperty.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NotificationEventPropertyType }
     *     
     */
    public void setEventProperty(NotificationEventPropertyType[] values) {
        this._getEventProperty().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.eventProperty.add(values[i]);
        }
    }

    protected List<NotificationEventPropertyType> _getEventProperty() {
        if (eventProperty == null) {
            eventProperty = new ArrayList<NotificationEventPropertyType>();
        }
        return eventProperty;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEventPropertyType }
     *     
     */
    public NotificationEventPropertyType setEventProperty(int idx, NotificationEventPropertyType value) {
        return this.eventProperty.set(idx, value);
    }

    /**
     * Gets the value of the deliveryURLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryURLName() {
        return deliveryURLName;
    }

    /**
     * Sets the value of the deliveryURLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryURLName(String value) {
        this.deliveryURLName = value;
    }

}
