
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedEventTypesArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedEventTypesArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{urn:ebay:apis:eBLBaseComponents}NotificationEventTypeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedEventTypesArrayType", propOrder = {
    "eventType"
})
public class SupportedEventTypesArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EventType")
    protected List<NotificationEventTypeCodeType> eventType;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link NotificationEventTypeCodeType }
     *     
     */
    public NotificationEventTypeCodeType[] getEventType() {
        if (this.eventType == null) {
            return new NotificationEventTypeCodeType[ 0 ] ;
        }
        return ((NotificationEventTypeCodeType[]) this.eventType.toArray(new NotificationEventTypeCodeType[this.eventType.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link NotificationEventTypeCodeType }
     *     
     */
    public NotificationEventTypeCodeType getEventType(int idx) {
        if (this.eventType == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.eventType.get(idx);
    }

    public int getEventTypeLength() {
        if (this.eventType == null) {
            return  0;
        }
        return this.eventType.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link NotificationEventTypeCodeType }
     *     
     */
    public void setEventType(NotificationEventTypeCodeType[] values) {
        this._getEventType().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.eventType.add(values[i]);
        }
    }

    protected List<NotificationEventTypeCodeType> _getEventType() {
        if (eventType == null) {
            eventType = new ArrayList<NotificationEventTypeCodeType>();
        }
        return eventType;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEventTypeCodeType }
     *     
     */
    public NotificationEventTypeCodeType setEventType(int idx, NotificationEventTypeCodeType value) {
        return this.eventType.set(idx, value);
    }

}
