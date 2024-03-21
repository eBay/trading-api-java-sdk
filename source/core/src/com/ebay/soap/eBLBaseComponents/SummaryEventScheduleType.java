
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
 * 				Details about a summary event schedule.
 * 			
 * 
 * <p>Java class for SummaryEventScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryEventScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{urn:ebay:apis:eBLBaseComponents}NotificationEventTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SummaryPeriod" type="{urn:ebay:apis:eBLBaseComponents}SummaryWindowPeriodCodeType" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{urn:ebay:apis:eBLBaseComponents}SummaryFrequencyCodeType" minOccurs="0"/>
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
@XmlType(name = "SummaryEventScheduleType", propOrder = {
    "eventType",
    "summaryPeriod",
    "frequency",
    "any"
})
public class SummaryEventScheduleType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EventType")
    protected NotificationEventTypeCodeType eventType;
    @XmlElement(name = "SummaryPeriod")
    protected SummaryWindowPeriodCodeType summaryPeriod;
    @XmlElement(name = "Frequency")
    protected SummaryFrequencyCodeType frequency;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEventTypeCodeType }
     *     
     */
    public NotificationEventTypeCodeType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEventTypeCodeType }
     *     
     */
    public void setEventType(NotificationEventTypeCodeType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the summaryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryWindowPeriodCodeType }
     *     
     */
    public SummaryWindowPeriodCodeType getSummaryPeriod() {
        return summaryPeriod;
    }

    /**
     * Sets the value of the summaryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryWindowPeriodCodeType }
     *     
     */
    public void setSummaryPeriod(SummaryWindowPeriodCodeType value) {
        this.summaryPeriod = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryFrequencyCodeType }
     *     
     */
    public SummaryFrequencyCodeType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryFrequencyCodeType }
     *     
     */
    public void setFrequency(SummaryFrequencyCodeType value) {
        this.frequency = value;
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
