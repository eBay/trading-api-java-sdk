
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
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for PromotionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PromotionPriceType" type="{urn:ebay:apis:eBLBaseComponents}PromotionItemPriceTypeCodeType" minOccurs="0"/>
 *         &lt;element name="BidCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConvertedPromotionPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
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
@XmlType(name = "PromotionDetailsType", propOrder = {
    "promotionPrice",
    "promotionPriceType",
    "bidCount",
    "convertedPromotionPrice",
    "any"
})
public class PromotionDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PromotionPrice")
    protected AmountType promotionPrice;
    @XmlElement(name = "PromotionPriceType")
    protected PromotionItemPriceTypeCodeType promotionPriceType;
    @XmlElement(name = "BidCount")
    protected Integer bidCount;
    @XmlElement(name = "ConvertedPromotionPrice")
    protected AmountType convertedPromotionPrice;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the promotionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPromotionPrice() {
        return promotionPrice;
    }

    /**
     * Sets the value of the promotionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPromotionPrice(AmountType value) {
        this.promotionPrice = value;
    }

    /**
     * Gets the value of the promotionPriceType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionItemPriceTypeCodeType }
     *     
     */
    public PromotionItemPriceTypeCodeType getPromotionPriceType() {
        return promotionPriceType;
    }

    /**
     * Sets the value of the promotionPriceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionItemPriceTypeCodeType }
     *     
     */
    public void setPromotionPriceType(PromotionItemPriceTypeCodeType value) {
        this.promotionPriceType = value;
    }

    /**
     * Gets the value of the bidCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidCount() {
        return bidCount;
    }

    /**
     * Sets the value of the bidCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidCount(Integer value) {
        this.bidCount = value;
    }

    /**
     * Gets the value of the convertedPromotionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedPromotionPrice() {
        return convertedPromotionPrice;
    }

    /**
     * Sets the value of the convertedPromotionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedPromotionPrice(AmountType value) {
        this.convertedPromotionPrice = value;
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
