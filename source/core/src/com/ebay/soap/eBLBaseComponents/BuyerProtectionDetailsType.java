
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
 * 				Type defining the <strong>ApplyBuyerProtection</strong> container, which
 * 				consists of details related to whether or not the item is eligible for buyer protection
 * 				and which of the buyer protection programs will cover the item.
 * 			
 * 
 * <p>Java class for BuyerProtectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerProtectionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyerProtectionSource" type="{urn:ebay:apis:eBLBaseComponents}BuyerProtectionSourceCodeType" minOccurs="0"/>
 *         &lt;element name="BuyerProtectionStatus" type="{urn:ebay:apis:eBLBaseComponents}BuyerProtectionCodeType" minOccurs="0"/>
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
@XmlType(name = "BuyerProtectionDetailsType", propOrder = {
    "buyerProtectionSource",
    "buyerProtectionStatus",
    "any"
})
public class BuyerProtectionDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BuyerProtectionSource")
    protected BuyerProtectionSourceCodeType buyerProtectionSource;
    @XmlElement(name = "BuyerProtectionStatus")
    protected BuyerProtectionCodeType buyerProtectionStatus;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the buyerProtectionSource property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProtectionSourceCodeType }
     *     
     */
    public BuyerProtectionSourceCodeType getBuyerProtectionSource() {
        return buyerProtectionSource;
    }

    /**
     * Sets the value of the buyerProtectionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProtectionSourceCodeType }
     *     
     */
    public void setBuyerProtectionSource(BuyerProtectionSourceCodeType value) {
        this.buyerProtectionSource = value;
    }

    /**
     * Gets the value of the buyerProtectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProtectionCodeType }
     *     
     */
    public BuyerProtectionCodeType getBuyerProtectionStatus() {
        return buyerProtectionStatus;
    }

    /**
     * Sets the value of the buyerProtectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProtectionCodeType }
     *     
     */
    public void setBuyerProtectionStatus(BuyerProtectionCodeType value) {
        this.buyerProtectionStatus = value;
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
