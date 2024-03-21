
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
 * 			  This type defines the <b>UnpaidItemAssistancePreferences</b> container. This container is
 * 				used in <b>SetUserPreferences</b> to set the preferences related to the <b>Unpaid Item
 * 				Assistant</b> feature. The <b>UnpaidItemAssistancePreferences</b> container is also returned in
 * 				<b>GetUserPreferences</b> (if the <b>ShowUnpaidItemAssistancePreference</b> flag is included and
 * 				set to true in the request).
 * 				<br/><br/>
 * 				See the <a href="https://www.ebay.com/help/selling/getting-paid/resolving-unpaid-items?id=4137">Resolving unpaid items with buyers</a> Help topic for more information about setting up and using the Unpaid Item preferences feature.
 * 			
 * 
 * <p>Java class for UnpaidItemAssistancePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnpaidItemAssistancePreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DelayBeforeOpeningDispute" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OptInStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoRelist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RemoveAllExcludedUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExcludedUser" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AutoOptDonationRefund" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "UnpaidItemAssistancePreferencesType", propOrder = {
    "delayBeforeOpeningDispute",
    "optInStatus",
    "autoRelist",
    "removeAllExcludedUsers",
    "excludedUser",
    "autoOptDonationRefund",
    "any"
})
public class UnpaidItemAssistancePreferencesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DelayBeforeOpeningDispute")
    protected Integer delayBeforeOpeningDispute;
    @XmlElement(name = "OptInStatus")
    protected Boolean optInStatus;
    @XmlElement(name = "AutoRelist", defaultValue = "false")
    protected Boolean autoRelist;
    @XmlElement(name = "RemoveAllExcludedUsers", defaultValue = "false")
    protected Boolean removeAllExcludedUsers;
    @XmlElement(name = "ExcludedUser")
    protected List<String> excludedUser;
    @XmlElement(name = "AutoOptDonationRefund")
    protected Boolean autoOptDonationRefund;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the delayBeforeOpeningDispute property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelayBeforeOpeningDispute() {
        return delayBeforeOpeningDispute;
    }

    /**
     * Sets the value of the delayBeforeOpeningDispute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelayBeforeOpeningDispute(Integer value) {
        this.delayBeforeOpeningDispute = value;
    }

    /**
     * Gets the value of the optInStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptInStatus() {
        return optInStatus;
    }

    /**
     * Sets the value of the optInStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptInStatus(Boolean value) {
        this.optInStatus = value;
    }

    /**
     * Gets the value of the autoRelist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRelist() {
        return autoRelist;
    }

    /**
     * Sets the value of the autoRelist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRelist(Boolean value) {
        this.autoRelist = value;
    }

    /**
     * Gets the value of the removeAllExcludedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveAllExcludedUsers() {
        return removeAllExcludedUsers;
    }

    /**
     * Sets the value of the removeAllExcludedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveAllExcludedUsers(Boolean value) {
        this.removeAllExcludedUsers = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getExcludedUser() {
        if (this.excludedUser == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.excludedUser.toArray(new String[this.excludedUser.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getExcludedUser(int idx) {
        if (this.excludedUser == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.excludedUser.get(idx);
    }

    public int getExcludedUserLength() {
        if (this.excludedUser == null) {
            return  0;
        }
        return this.excludedUser.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setExcludedUser(String[] values) {
        this._getExcludedUser().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.excludedUser.add(values[i]);
        }
    }

    protected List<String> _getExcludedUser() {
        if (excludedUser == null) {
            excludedUser = new ArrayList<String>();
        }
        return excludedUser;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setExcludedUser(int idx, String value) {
        return this.excludedUser.set(idx, value);
    }

    /**
     * Gets the value of the autoOptDonationRefund property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoOptDonationRefund() {
        return autoOptDonationRefund;
    }

    /**
     * Sets the value of the autoOptDonationRefund property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoOptDonationRefund(Boolean value) {
        this.autoOptDonationRefund = value;
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
