
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 *         Type defining the <b>Shipment</b> container, which is used by
 *         the seller in <b>CompleteSale</b> to provide shipping information.
 *       
 * 
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShipmentTrackingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShipmentTrackingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ShipmentType", propOrder = {
    "shippedTime",
    "shipmentTrackingDetails",
    "any"
})
public class ShipmentType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShippedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar shippedTime;
    @XmlElement(name = "ShipmentTrackingDetails")
    protected List<ShipmentTrackingDetailsType> shipmentTrackingDetails;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the shippedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getShippedTime() {
        return shippedTime;
    }

    /**
     * Sets the value of the shippedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippedTime(Calendar value) {
        this.shippedTime = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public ShipmentTrackingDetailsType[] getShipmentTrackingDetails() {
        if (this.shipmentTrackingDetails == null) {
            return new ShipmentTrackingDetailsType[ 0 ] ;
        }
        return ((ShipmentTrackingDetailsType[]) this.shipmentTrackingDetails.toArray(new ShipmentTrackingDetailsType[this.shipmentTrackingDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public ShipmentTrackingDetailsType getShipmentTrackingDetails(int idx) {
        if (this.shipmentTrackingDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shipmentTrackingDetails.get(idx);
    }

    public int getShipmentTrackingDetailsLength() {
        if (this.shipmentTrackingDetails == null) {
            return  0;
        }
        return this.shipmentTrackingDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public void setShipmentTrackingDetails(ShipmentTrackingDetailsType[] values) {
        this._getShipmentTrackingDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shipmentTrackingDetails.add(values[i]);
        }
    }

    protected List<ShipmentTrackingDetailsType> _getShipmentTrackingDetails() {
        if (shipmentTrackingDetails == null) {
            shipmentTrackingDetails = new ArrayList<ShipmentTrackingDetailsType>();
        }
        return shipmentTrackingDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public ShipmentTrackingDetailsType setShipmentTrackingDetails(int idx, ShipmentTrackingDetailsType value) {
        return this.shipmentTrackingDetails.set(idx, value);
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
