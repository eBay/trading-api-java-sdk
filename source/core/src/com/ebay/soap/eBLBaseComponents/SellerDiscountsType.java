
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
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
 * 				Type defining the <b>SellerDiscounts</b> container, which consists of one or
 * 				more <b>SellerDiscount</b> nodes, as well as the original purchase price and
 * 				shipping cost of the order line item.
 * 			
 * 
 * <p>Java class for SellerDiscountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerDiscountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalItemPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="OriginalItemShippingCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="OriginalShippingService" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="SellerDiscount" type="{urn:ebay:apis:eBLBaseComponents}SellerDiscountType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SellerDiscountsType", propOrder = {
    "originalItemPrice",
    "originalItemShippingCost",
    "originalShippingService",
    "sellerDiscount",
    "any"
})
public class SellerDiscountsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OriginalItemPrice")
    protected AmountType originalItemPrice;
    @XmlElement(name = "OriginalItemShippingCost")
    protected AmountType originalItemShippingCost;
    @XmlElement(name = "OriginalShippingService")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originalShippingService;
    @XmlElement(name = "SellerDiscount")
    protected List<SellerDiscountType> sellerDiscount;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the originalItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOriginalItemPrice() {
        return originalItemPrice;
    }

    /**
     * Sets the value of the originalItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOriginalItemPrice(AmountType value) {
        this.originalItemPrice = value;
    }

    /**
     * Gets the value of the originalItemShippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOriginalItemShippingCost() {
        return originalItemShippingCost;
    }

    /**
     * Sets the value of the originalItemShippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOriginalItemShippingCost(AmountType value) {
        this.originalItemShippingCost = value;
    }

    /**
     * Gets the value of the originalShippingService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalShippingService() {
        return originalShippingService;
    }

    /**
     * Sets the value of the originalShippingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalShippingService(String value) {
        this.originalShippingService = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link SellerDiscountType }
     *     
     */
    public SellerDiscountType[] getSellerDiscount() {
        if (this.sellerDiscount == null) {
            return new SellerDiscountType[ 0 ] ;
        }
        return ((SellerDiscountType[]) this.sellerDiscount.toArray(new SellerDiscountType[this.sellerDiscount.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link SellerDiscountType }
     *     
     */
    public SellerDiscountType getSellerDiscount(int idx) {
        if (this.sellerDiscount == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.sellerDiscount.get(idx);
    }

    public int getSellerDiscountLength() {
        if (this.sellerDiscount == null) {
            return  0;
        }
        return this.sellerDiscount.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link SellerDiscountType }
     *     
     */
    public void setSellerDiscount(SellerDiscountType[] values) {
        this._getSellerDiscount().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.sellerDiscount.add(values[i]);
        }
    }

    protected List<SellerDiscountType> _getSellerDiscount() {
        if (sellerDiscount == null) {
            sellerDiscount = new ArrayList<SellerDiscountType>();
        }
        return sellerDiscount;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link SellerDiscountType }
     *     
     */
    public SellerDiscountType setSellerDiscount(int idx, SellerDiscountType value) {
        return this.sellerDiscount.set(idx, value);
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
