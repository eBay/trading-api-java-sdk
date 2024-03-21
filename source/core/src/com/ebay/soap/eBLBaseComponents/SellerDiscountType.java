
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
 * 				Type that defines the <b>SellerDiscount</b> container, which contains the ID,
 * 				name, and amount of the seller discount.
 * 			
 * 
 * <p>Java class for SellerDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerDiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CampaignDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemDiscountAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingDiscountAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
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
@XmlType(name = "SellerDiscountType", propOrder = {
    "campaignID",
    "campaignDisplayName",
    "itemDiscountAmount",
    "shippingDiscountAmount",
    "any"
})
public class SellerDiscountType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CampaignID")
    protected Long campaignID;
    @XmlElement(name = "CampaignDisplayName")
    protected String campaignDisplayName;
    @XmlElement(name = "ItemDiscountAmount")
    protected AmountType itemDiscountAmount;
    @XmlElement(name = "ShippingDiscountAmount")
    protected AmountType shippingDiscountAmount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the campaignID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignID() {
        return campaignID;
    }

    /**
     * Sets the value of the campaignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignID(Long value) {
        this.campaignID = value;
    }

    /**
     * Gets the value of the campaignDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignDisplayName() {
        return campaignDisplayName;
    }

    /**
     * Sets the value of the campaignDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignDisplayName(String value) {
        this.campaignDisplayName = value;
    }

    /**
     * Gets the value of the itemDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getItemDiscountAmount() {
        return itemDiscountAmount;
    }

    /**
     * Sets the value of the itemDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setItemDiscountAmount(AmountType value) {
        this.itemDiscountAmount = value;
    }

    /**
     * Gets the value of the shippingDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingDiscountAmount() {
        return shippingDiscountAmount;
    }

    /**
     * Sets the value of the shippingDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingDiscountAmount(AmountType value) {
        this.shippingDiscountAmount = value;
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
