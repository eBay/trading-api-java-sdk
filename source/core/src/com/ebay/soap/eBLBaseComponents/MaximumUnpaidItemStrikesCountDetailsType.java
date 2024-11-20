
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
 * 				Type defining the <b>MaximumUnpaidItemStrikesCount</b> container that is returned 
 * 				in the <b>GeteBayDetails</b> response. The <b>MaximumUnpaidItemStrikesCount</b> 
 * 				container consists of multiple <b>Count</b> fields with values that can be 
 * 				used in the <b>BuyerRequirementDetails.MaximumUnpaidItemStrikesInfo.Count</b> 
 * 				field when using the Trading API to add, revise, or relist an item.
 * 				<br><br>
 * 				The <b>Item.MaximumUnpaidItemStrikesInfo</b> container in Add/Revise/Relist 
 * 				API calls is used to block buyers with unpaid item strikes equal to or exceeding
 * 				the specified <b>Count</b> value during the specified <b>Period</b> 
 * 				value from buying/bidding on the item.
 * 			
 * 
 * <p>Java class for MaximumUnpaidItemStrikesCountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumUnpaidItemStrikesCountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MaximumUnpaidItemStrikesCountDetailsType", propOrder = {
    "count",
    "any"
})
public class MaximumUnpaidItemStrikesCountDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Count", type = Integer.class)
    protected List<Integer> count;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Integer }
     *     
     */
    public int[] getCount() {
        if (this.count == null) {
            return new int[ 0 ] ;
        }
        int[] r = new int[this.count.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.count.get(__i).intValue();
        }
        return r;
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Integer }
     *     
     */
    public int getCount(int idx) {
        if (this.count == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.count.get(idx).intValue();
    }

    public int getCountLength() {
        if (this.count == null) {
            return  0;
        }
        return this.count.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Integer }
     *     
     */
    public void setCount(int[] values) {
        this._getCount().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.count.add(new Integer(values[i]));
        }
    }

    protected List<Integer> _getCount() {
        if (count == null) {
            count = new ArrayList<Integer>();
        }
        return count;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public int setCount(int idx, int value) {
        return this.count.set(idx, new Integer(value)).intValue();
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
