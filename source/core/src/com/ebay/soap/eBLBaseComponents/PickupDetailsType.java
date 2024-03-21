
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
 *               This type defines the <strong>PickupDetails</strong> container, which contains an array of <strong>PickupOptions</strong> containers. Each <strong>PickupOptions</strong> container consists of the pickup method and its priority.
 *               <br/><br/>
 * 							<span class="tablenote">
 * 							<strong>Note:</strong> At this time, the In-Store Pickup and Click and Collect features are generally only available to large retail merchants, and can only be applied to multi-quantity, fixed-price listings. In-Store Pickup is only applicable to the US site, and Click and Collect is only applicable to the UK, Germany, and Australia sites.
 * 							</span>
 *             
 * 
 * <p>Java class for PickupDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickupOptions" type="{urn:ebay:apis:eBLBaseComponents}PickupOptionsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PickupDetailsType", propOrder = {
    "pickupOptions",
    "any"
})
public class PickupDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PickupOptions")
    protected List<PickupOptionsType> pickupOptions;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link PickupOptionsType }
     *     
     */
    public PickupOptionsType[] getPickupOptions() {
        if (this.pickupOptions == null) {
            return new PickupOptionsType[ 0 ] ;
        }
        return ((PickupOptionsType[]) this.pickupOptions.toArray(new PickupOptionsType[this.pickupOptions.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link PickupOptionsType }
     *     
     */
    public PickupOptionsType getPickupOptions(int idx) {
        if (this.pickupOptions == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.pickupOptions.get(idx);
    }

    public int getPickupOptionsLength() {
        if (this.pickupOptions == null) {
            return  0;
        }
        return this.pickupOptions.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link PickupOptionsType }
     *     
     */
    public void setPickupOptions(PickupOptionsType[] values) {
        this._getPickupOptions().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.pickupOptions.add(values[i]);
        }
    }

    protected List<PickupOptionsType> _getPickupOptions() {
        if (pickupOptions == null) {
            pickupOptions = new ArrayList<PickupOptionsType>();
        }
        return pickupOptions;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link PickupOptionsType }
     *     
     */
    public PickupOptionsType setPickupOptions(int idx, PickupOptionsType value) {
        return this.pickupOptions.set(idx, value);
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
