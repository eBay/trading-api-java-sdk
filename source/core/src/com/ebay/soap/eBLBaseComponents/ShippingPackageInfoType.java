
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				Type defining the <b>ShippingPackageInfoType</b> container, which is returned in order management calls. The <b>ShippingPackageInfoType</b> container provides information on delivery times and tracking information for a shipping package.
 * 			
 * 
 * <p>Java class for ShippingPackageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingPackageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingTrackingEvent" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryTimeMin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ScheduledDeliveryTimeMax" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryTimeMin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryTimeMax" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HandleByTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MinNativeEstimatedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MaxNativeEstimatedDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "ShippingPackageInfoType", propOrder = {
    "storeID",
    "shippingTrackingEvent",
    "scheduledDeliveryTimeMin",
    "scheduledDeliveryTimeMax",
    "actualDeliveryTime",
    "estimatedDeliveryTimeMin",
    "estimatedDeliveryTimeMax",
    "handleByTime",
    "minNativeEstimatedDeliveryTime",
    "maxNativeEstimatedDeliveryTime",
    "any"
})
public class ShippingPackageInfoType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "StoreID")
    protected String storeID;
    @XmlElement(name = "ShippingTrackingEvent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingTrackingEvent;
    @XmlElement(name = "ScheduledDeliveryTimeMin", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar scheduledDeliveryTimeMin;
    @XmlElement(name = "ScheduledDeliveryTimeMax", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar scheduledDeliveryTimeMax;
    @XmlElement(name = "ActualDeliveryTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar actualDeliveryTime;
    @XmlElement(name = "EstimatedDeliveryTimeMin", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar estimatedDeliveryTimeMin;
    @XmlElement(name = "EstimatedDeliveryTimeMax", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar estimatedDeliveryTimeMax;
    @XmlElement(name = "HandleByTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar handleByTime;
    @XmlElement(name = "MinNativeEstimatedDeliveryTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar minNativeEstimatedDeliveryTime;
    @XmlElement(name = "MaxNativeEstimatedDeliveryTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar maxNativeEstimatedDeliveryTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the storeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreID() {
        return storeID;
    }

    /**
     * Sets the value of the storeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreID(String value) {
        this.storeID = value;
    }

    /**
     * Gets the value of the shippingTrackingEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTrackingEvent() {
        return shippingTrackingEvent;
    }

    /**
     * Sets the value of the shippingTrackingEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTrackingEvent(String value) {
        this.shippingTrackingEvent = value;
    }

    /**
     * Gets the value of the scheduledDeliveryTimeMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getScheduledDeliveryTimeMin() {
        return scheduledDeliveryTimeMin;
    }

    /**
     * Sets the value of the scheduledDeliveryTimeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeliveryTimeMin(Calendar value) {
        this.scheduledDeliveryTimeMin = value;
    }

    /**
     * Gets the value of the scheduledDeliveryTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getScheduledDeliveryTimeMax() {
        return scheduledDeliveryTimeMax;
    }

    /**
     * Sets the value of the scheduledDeliveryTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDeliveryTimeMax(Calendar value) {
        this.scheduledDeliveryTimeMax = value;
    }

    /**
     * Gets the value of the actualDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getActualDeliveryTime() {
        return actualDeliveryTime;
    }

    /**
     * Sets the value of the actualDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDeliveryTime(Calendar value) {
        this.actualDeliveryTime = value;
    }

    /**
     * Gets the value of the estimatedDeliveryTimeMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEstimatedDeliveryTimeMin() {
        return estimatedDeliveryTimeMin;
    }

    /**
     * Sets the value of the estimatedDeliveryTimeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeliveryTimeMin(Calendar value) {
        this.estimatedDeliveryTimeMin = value;
    }

    /**
     * Gets the value of the estimatedDeliveryTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEstimatedDeliveryTimeMax() {
        return estimatedDeliveryTimeMax;
    }

    /**
     * Sets the value of the estimatedDeliveryTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeliveryTimeMax(Calendar value) {
        this.estimatedDeliveryTimeMax = value;
    }

    /**
     * Gets the value of the handleByTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getHandleByTime() {
        return handleByTime;
    }

    /**
     * Sets the value of the handleByTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleByTime(Calendar value) {
        this.handleByTime = value;
    }

    /**
     * Gets the value of the minNativeEstimatedDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getMinNativeEstimatedDeliveryTime() {
        return minNativeEstimatedDeliveryTime;
    }

    /**
     * Sets the value of the minNativeEstimatedDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinNativeEstimatedDeliveryTime(Calendar value) {
        this.minNativeEstimatedDeliveryTime = value;
    }

    /**
     * Gets the value of the maxNativeEstimatedDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getMaxNativeEstimatedDeliveryTime() {
        return maxNativeEstimatedDeliveryTime;
    }

    /**
     * Sets the value of the maxNativeEstimatedDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNativeEstimatedDeliveryTime(Calendar value) {
        this.maxNativeEstimatedDeliveryTime = value;
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
