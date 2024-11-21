
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is used by the <b>DiscountDetail</b> container, which is returned if a discount is applicable to an account entry.
 * 			
 * 
 * <p>Java class for DiscountDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Discount" type="{urn:ebay:apis:eBLBaseComponents}DiscountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountDetailType", propOrder = {
    "discount"
})
public class DiscountDetailType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Discount")
    protected List<DiscountType> discount;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link DiscountType }
     *     
     */
    public DiscountType[] getDiscount() {
        if (this.discount == null) {
            return new DiscountType[ 0 ] ;
        }
        return ((DiscountType[]) this.discount.toArray(new DiscountType[this.discount.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscount(int idx) {
        if (this.discount == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.discount.get(idx);
    }

    public int getDiscountLength() {
        if (this.discount == null) {
            return  0;
        }
        return this.discount.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link DiscountType }
     *     
     */
    public void setDiscount(DiscountType[] values) {
        this._getDiscount().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.discount.add(values[i]);
        }
    }

    protected List<DiscountType> _getDiscount() {
        if (discount == null) {
            discount = new ArrayList<DiscountType>();
        }
        return discount;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType setDiscount(int idx, DiscountType value) {
        return this.discount.set(idx, value);
    }

}
