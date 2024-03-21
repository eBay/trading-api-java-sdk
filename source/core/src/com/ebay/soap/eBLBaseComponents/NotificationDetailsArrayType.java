
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
 * 				Type used by the <b>NotificationDetailsArray</b> container that is returned by the <b>GetNotificationsUsage</b> call. The <b>NotificationDetailsArray</b> container consists of one or more notifications that match the input criteria in the call request.
 * 				<br><br>
 * 				This container is only returned if an <b>ItemID</b> value was specified in the request, and there were notifications related to this listing during the specified time range.
 * 			
 * 
 * <p>Java class for NotificationDetailsArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationDetailsArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationDetails" type="{urn:ebay:apis:eBLBaseComponents}NotificationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationDetailsArrayType", propOrder = {
    "notificationDetails"
})
public class NotificationDetailsArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "NotificationDetails")
    protected List<NotificationDetailsType> notificationDetails;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link NotificationDetailsType }
     *     
     */
    public NotificationDetailsType[] getNotificationDetails() {
        if (this.notificationDetails == null) {
            return new NotificationDetailsType[ 0 ] ;
        }
        return ((NotificationDetailsType[]) this.notificationDetails.toArray(new NotificationDetailsType[this.notificationDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NotificationDetailsType }
     *     
     */
    public NotificationDetailsType getNotificationDetails(int idx) {
        if (this.notificationDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.notificationDetails.get(idx);
    }

    public int getNotificationDetailsLength() {
        if (this.notificationDetails == null) {
            return  0;
        }
        return this.notificationDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NotificationDetailsType }
     *     
     */
    public void setNotificationDetails(NotificationDetailsType[] values) {
        this._getNotificationDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.notificationDetails.add(values[i]);
        }
    }

    protected List<NotificationDetailsType> _getNotificationDetails() {
        if (notificationDetails == null) {
            notificationDetails = new ArrayList<NotificationDetailsType>();
        }
        return notificationDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationDetailsType }
     *     
     */
    public NotificationDetailsType setNotificationDetails(int idx, NotificationDetailsType value) {
        return this.notificationDetails.set(idx, value);
    }

}
