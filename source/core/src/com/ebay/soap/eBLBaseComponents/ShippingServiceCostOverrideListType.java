
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
 * 				Type defining the <b>ShippingServiceCostOverrideList</b> container, which is used when the seller wants to override flat-rate shipping costs for one or more domestic and/or international shipping service options defined in the Business Policies shipping profile referenced in the <b>SellerProfiles.SellerShippingProfile.ShippingProfileID</b> field of an Add/Revise/Relist call.
 * 				<br/><br/>
 * 				Shipping service cost overrides are a listing-level concept, and the shipping costs specified through each <b>ShippingServiceCostOverrideList.ShippingServiceCostOverride</b> container will not change the shipping costs defined for the same shipping services in the Business Policies shipping profile.
 * 			
 * 
 * <p>Java class for ShippingServiceCostOverrideListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServiceCostOverrideListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingServiceCostOverride" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceCostOverrideType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ShippingServiceCostOverrideListType", propOrder = {
    "shippingServiceCostOverride",
    "any"
})
public class ShippingServiceCostOverrideListType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShippingServiceCostOverride")
    protected List<ShippingServiceCostOverrideType> shippingServiceCostOverride;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingServiceCostOverrideType }
     *     
     */
    public ShippingServiceCostOverrideType[] getShippingServiceCostOverride() {
        if (this.shippingServiceCostOverride == null) {
            return new ShippingServiceCostOverrideType[ 0 ] ;
        }
        return ((ShippingServiceCostOverrideType[]) this.shippingServiceCostOverride.toArray(new ShippingServiceCostOverrideType[this.shippingServiceCostOverride.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingServiceCostOverrideType }
     *     
     */
    public ShippingServiceCostOverrideType getShippingServiceCostOverride(int idx) {
        if (this.shippingServiceCostOverride == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingServiceCostOverride.get(idx);
    }

    public int getShippingServiceCostOverrideLength() {
        if (this.shippingServiceCostOverride == null) {
            return  0;
        }
        return this.shippingServiceCostOverride.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingServiceCostOverrideType }
     *     
     */
    public void setShippingServiceCostOverride(ShippingServiceCostOverrideType[] values) {
        this._getShippingServiceCostOverride().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingServiceCostOverride.add(values[i]);
        }
    }

    protected List<ShippingServiceCostOverrideType> _getShippingServiceCostOverride() {
        if (shippingServiceCostOverride == null) {
            shippingServiceCostOverride = new ArrayList<ShippingServiceCostOverrideType>();
        }
        return shippingServiceCostOverride;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceCostOverrideType }
     *     
     */
    public ShippingServiceCostOverrideType setShippingServiceCostOverride(int idx, ShippingServiceCostOverrideType value) {
        return this.shippingServiceCostOverride.set(idx, value);
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
