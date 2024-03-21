
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
 * 				This type is used by the <b>UserDeliveryPreferenceArray</b> container of the <b>SetNotificationPreferences</b> and <b>GetNotificationPreferences</b> calls. The <b>UserDeliveryPreferenceArray</b> container consists of one or more notifications and whether or not each notification is enabled or disabled.
 * 			
 * 
 * <p>Java class for NotificationEnableArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationEnableArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationEnable" type="{urn:ebay:apis:eBLBaseComponents}NotificationEnableType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationEnableArrayType", propOrder = {
    "notificationEnable"
})
public class NotificationEnableArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "NotificationEnable")
    protected List<NotificationEnableType> notificationEnable;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link NotificationEnableType }
     *     
     */
    public NotificationEnableType[] getNotificationEnable() {
        if (this.notificationEnable == null) {
            return new NotificationEnableType[ 0 ] ;
        }
        return ((NotificationEnableType[]) this.notificationEnable.toArray(new NotificationEnableType[this.notificationEnable.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NotificationEnableType }
     *     
     */
    public NotificationEnableType getNotificationEnable(int idx) {
        if (this.notificationEnable == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.notificationEnable.get(idx);
    }

    public int getNotificationEnableLength() {
        if (this.notificationEnable == null) {
            return  0;
        }
        return this.notificationEnable.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NotificationEnableType }
     *     
     */
    public void setNotificationEnable(NotificationEnableType[] values) {
        this._getNotificationEnable().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.notificationEnable.add(values[i]);
        }
    }

    protected List<NotificationEnableType> _getNotificationEnable() {
        if (notificationEnable == null) {
            notificationEnable = new ArrayList<NotificationEnableType>();
        }
        return notificationEnable;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEnableType }
     *     
     */
    public NotificationEnableType setNotificationEnable(int idx, NotificationEnableType value) {
        return this.notificationEnable.set(idx, value);
    }

}
