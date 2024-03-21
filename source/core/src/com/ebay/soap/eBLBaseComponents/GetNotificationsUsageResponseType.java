
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Returns an array of notifications sent to a given application identified by the appID (comes in the credentials). The result can be used by third-party developers troubleshoot issues with notifications. <br/><br/> Zero, one or many notifications can be returned in the array. The set of notifications returned is limited to those that were sent between the <b>StartTime</b> and <b>EndTime</b> specified in the request. <br/><br/> If <b>StartTime</b> or <b>EndTime</b> filters were not found in the request, then the response will contain the data for only one day (Now-1day). By default, maximum duration is limited to 3 days (Now-3days). These min (1day) and max(3days) applies to <b>Notifications</b>, <b>MarkDownMarkUpHistory</b> and <b>NotificationStatistics</b>. <br/><br/> Notifications are sent only if the <b>ItemID</b> is included in the request. If there is no <b>ItemID</b>, then only <b>Statistics</b> and <b>MarkDownMarkUpHistory</b> information is included.
 * 			
 * 
 * <p>Java class for GetNotificationsUsageResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNotificationsUsageResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NotificationDetailsArray" type="{urn:ebay:apis:eBLBaseComponents}NotificationDetailsArrayType" minOccurs="0"/>
 *         &lt;element name="MarkUpMarkDownHistory" type="{urn:ebay:apis:eBLBaseComponents}MarkUpMarkDownHistoryType" minOccurs="0"/>
 *         &lt;element name="NotificationStatistics" type="{urn:ebay:apis:eBLBaseComponents}NotificationStatisticsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNotificationsUsageResponseType", propOrder = {
    "startTime",
    "endTime",
    "notificationDetailsArray",
    "markUpMarkDownHistory",
    "notificationStatistics"
})
public class GetNotificationsUsageResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTime;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar endTime;
    @XmlElement(name = "NotificationDetailsArray")
    protected NotificationDetailsArrayType notificationDetailsArray;
    @XmlElement(name = "MarkUpMarkDownHistory")
    protected MarkUpMarkDownHistoryType markUpMarkDownHistory;
    @XmlElement(name = "NotificationStatistics")
    protected NotificationStatisticsType notificationStatistics;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(Calendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(Calendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the notificationDetailsArray property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationDetailsArrayType }
     *     
     */
    public NotificationDetailsArrayType getNotificationDetailsArray() {
        return notificationDetailsArray;
    }

    /**
     * Sets the value of the notificationDetailsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationDetailsArrayType }
     *     
     */
    public void setNotificationDetailsArray(NotificationDetailsArrayType value) {
        this.notificationDetailsArray = value;
    }

    /**
     * Gets the value of the markUpMarkDownHistory property.
     * 
     * @return
     *     possible object is
     *     {@link MarkUpMarkDownHistoryType }
     *     
     */
    public MarkUpMarkDownHistoryType getMarkUpMarkDownHistory() {
        return markUpMarkDownHistory;
    }

    /**
     * Sets the value of the markUpMarkDownHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkUpMarkDownHistoryType }
     *     
     */
    public void setMarkUpMarkDownHistory(MarkUpMarkDownHistoryType value) {
        this.markUpMarkDownHistory = value;
    }

    /**
     * Gets the value of the notificationStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationStatisticsType }
     *     
     */
    public NotificationStatisticsType getNotificationStatistics() {
        return notificationStatistics;
    }

    /**
     * Sets the value of the notificationStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationStatisticsType }
     *     
     */
    public void setNotificationStatistics(NotificationStatisticsType value) {
        this.notificationStatistics = value;
    }

}
