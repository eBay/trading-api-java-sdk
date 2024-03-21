
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
 * 				User data related to notifications. Note that SMS is currently reserved for future use.
 * 			
 * 
 * <p>Java class for SMSSubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMSSubscriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SMSPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserStatus" type="{urn:ebay:apis:eBLBaseComponents}SMSSubscriptionUserStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CarrierID" type="{urn:ebay:apis:eBLBaseComponents}WirelessCarrierIDCodeType" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{urn:ebay:apis:eBLBaseComponents}SMSSubscriptionErrorCodeCodeType" minOccurs="0"/>
 *         &lt;element name="ItemToUnsubscribe" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
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
@XmlType(name = "SMSSubscriptionType", propOrder = {
    "smsPhone",
    "userStatus",
    "carrierID",
    "errorCode",
    "itemToUnsubscribe",
    "any"
})
public class SMSSubscriptionType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SMSPhone")
    protected String smsPhone;
    @XmlElement(name = "UserStatus")
    protected SMSSubscriptionUserStatusCodeType userStatus;
    @XmlElement(name = "CarrierID")
    protected WirelessCarrierIDCodeType carrierID;
    @XmlElement(name = "ErrorCode")
    protected SMSSubscriptionErrorCodeCodeType errorCode;
    @XmlElement(name = "ItemToUnsubscribe")
    protected String itemToUnsubscribe;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the smsPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSPhone() {
        return smsPhone;
    }

    /**
     * Sets the value of the smsPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSPhone(String value) {
        this.smsPhone = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SMSSubscriptionUserStatusCodeType }
     *     
     */
    public SMSSubscriptionUserStatusCodeType getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSSubscriptionUserStatusCodeType }
     *     
     */
    public void setUserStatus(SMSSubscriptionUserStatusCodeType value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the carrierID property.
     * 
     * @return
     *     possible object is
     *     {@link WirelessCarrierIDCodeType }
     *     
     */
    public WirelessCarrierIDCodeType getCarrierID() {
        return carrierID;
    }

    /**
     * Sets the value of the carrierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link WirelessCarrierIDCodeType }
     *     
     */
    public void setCarrierID(WirelessCarrierIDCodeType value) {
        this.carrierID = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link SMSSubscriptionErrorCodeCodeType }
     *     
     */
    public SMSSubscriptionErrorCodeCodeType getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSSubscriptionErrorCodeCodeType }
     *     
     */
    public void setErrorCode(SMSSubscriptionErrorCodeCodeType value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the itemToUnsubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemToUnsubscribe() {
        return itemToUnsubscribe;
    }

    /**
     * Sets the value of the itemToUnsubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemToUnsubscribe(String value) {
        this.itemToUnsubscribe = value;
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
