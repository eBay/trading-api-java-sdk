
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
 * 				Type defining the <strong>PickupMethodSelected</strong> container, which consists of details related to the selected local pickup method (In-Store Pickup or "Click and Collect"), including the pickup method, the merchant's store ID, the status of the pickup, and the pickup reference code (if provided by merchant).
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> At this time, the In-Store Pickup feature is generally only available to large retail merchants in US, and can only be applied to multi-quantity, fixed-price listings. The "Click and Collect" feature is only available to large merchants on the eBay UK (site ID - 3), eBay Australia (Site ID - 15), and eBay Germany (Site ID - 77) sites.
 * 				</span>
 * 			
 * 
 * <p>Java class for PickupMethodSelectedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupMethodSelectedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickupMethod" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="PickupStoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupStatus" type="{urn:ebay:apis:eBLBaseComponents}PickupStatusCodeType" minOccurs="0"/>
 *         &lt;element name="MerchantPickupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupFulfillmentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PickupLocationUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PickupMethodSelectedType", propOrder = {
    "pickupMethod",
    "pickupStoreID",
    "pickupStatus",
    "merchantPickupCode",
    "pickupFulfillmentTime",
    "pickupLocationUUID",
    "any"
})
public class PickupMethodSelectedType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PickupMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pickupMethod;
    @XmlElement(name = "PickupStoreID")
    protected String pickupStoreID;
    @XmlElement(name = "PickupStatus")
    protected PickupStatusCodeType pickupStatus;
    @XmlElement(name = "MerchantPickupCode")
    protected String merchantPickupCode;
    @XmlElement(name = "PickupFulfillmentTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar pickupFulfillmentTime;
    @XmlElement(name = "PickupLocationUUID")
    protected String pickupLocationUUID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pickupMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupMethod() {
        return pickupMethod;
    }

    /**
     * Sets the value of the pickupMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupMethod(String value) {
        this.pickupMethod = value;
    }

    /**
     * Gets the value of the pickupStoreID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupStoreID() {
        return pickupStoreID;
    }

    /**
     * Sets the value of the pickupStoreID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupStoreID(String value) {
        this.pickupStoreID = value;
    }

    /**
     * Gets the value of the pickupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PickupStatusCodeType }
     *     
     */
    public PickupStatusCodeType getPickupStatus() {
        return pickupStatus;
    }

    /**
     * Sets the value of the pickupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupStatusCodeType }
     *     
     */
    public void setPickupStatus(PickupStatusCodeType value) {
        this.pickupStatus = value;
    }

    /**
     * Gets the value of the merchantPickupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPickupCode() {
        return merchantPickupCode;
    }

    /**
     * Sets the value of the merchantPickupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPickupCode(String value) {
        this.merchantPickupCode = value;
    }

    /**
     * Gets the value of the pickupFulfillmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPickupFulfillmentTime() {
        return pickupFulfillmentTime;
    }

    /**
     * Sets the value of the pickupFulfillmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupFulfillmentTime(Calendar value) {
        this.pickupFulfillmentTime = value;
    }

    /**
     * Gets the value of the pickupLocationUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupLocationUUID() {
        return pickupLocationUUID;
    }

    /**
     * Sets the value of the pickupLocationUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupLocationUUID(String value) {
        this.pickupLocationUUID = value;
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
