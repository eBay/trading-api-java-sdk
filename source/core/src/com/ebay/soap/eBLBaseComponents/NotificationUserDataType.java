
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
 * 				User data related to notifications.
 * 			
 * 
 * <p>Java class for NotificationUserDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationUserDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SMSSubscription" type="{urn:ebay:apis:eBLBaseComponents}SMSSubscriptionType" minOccurs="0"/>
 *         &lt;element name="SummarySchedule" type="{urn:ebay:apis:eBLBaseComponents}SummaryEventScheduleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalUserData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "NotificationUserDataType", propOrder = {
    "smsSubscription",
    "summarySchedule",
    "externalUserData",
    "any"
})
public class NotificationUserDataType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SMSSubscription")
    protected SMSSubscriptionType smsSubscription;
    @XmlElement(name = "SummarySchedule")
    protected List<SummaryEventScheduleType> summarySchedule;
    @XmlElement(name = "ExternalUserData")
    protected String externalUserData;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the smsSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link SMSSubscriptionType }
     *     
     */
    public SMSSubscriptionType getSMSSubscription() {
        return smsSubscription;
    }

    /**
     * Sets the value of the smsSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSSubscriptionType }
     *     
     */
    public void setSMSSubscription(SMSSubscriptionType value) {
        this.smsSubscription = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SummaryEventScheduleType }
     *     
     */
    public SummaryEventScheduleType[] getSummarySchedule() {
        if (this.summarySchedule == null) {
            return new SummaryEventScheduleType[ 0 ] ;
        }
        return ((SummaryEventScheduleType[]) this.summarySchedule.toArray(new SummaryEventScheduleType[this.summarySchedule.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SummaryEventScheduleType }
     *     
     */
    public SummaryEventScheduleType getSummarySchedule(int idx) {
        if (this.summarySchedule == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.summarySchedule.get(idx);
    }

    public int getSummaryScheduleLength() {
        if (this.summarySchedule == null) {
            return  0;
        }
        return this.summarySchedule.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SummaryEventScheduleType }
     *     
     */
    public void setSummarySchedule(SummaryEventScheduleType[] values) {
        this._getSummarySchedule().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.summarySchedule.add(values[i]);
        }
    }

    protected List<SummaryEventScheduleType> _getSummarySchedule() {
        if (summarySchedule == null) {
            summarySchedule = new ArrayList<SummaryEventScheduleType>();
        }
        return summarySchedule;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryEventScheduleType }
     *     
     */
    public SummaryEventScheduleType setSummarySchedule(int idx, SummaryEventScheduleType value) {
        return this.summarySchedule.set(idx, value);
    }

    /**
     * Gets the value of the externalUserData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUserData() {
        return externalUserData;
    }

    /**
     * Sets the value of the externalUserData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUserData(String value) {
        this.externalUserData = value;
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
