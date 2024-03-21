
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
 * 				This is used in the <b>ReviseInventoryStatus</b> response to provide the set of fees associated with each unique <b>ItemID</b>.
 * 			
 * 
 * <p>Java class for InventoryFeesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryFeesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="Fee" type="{urn:ebay:apis:eBLBaseComponents}FeeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "InventoryFeesType", propOrder = {
    "itemID",
    "fee",
    "any"
})
public class InventoryFeesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "Fee")
    protected List<FeeType> fee;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link FeeType }
     *     
     */
    public FeeType[] getFee() {
        if (this.fee == null) {
            return new FeeType[ 0 ] ;
        }
        return ((FeeType[]) this.fee.toArray(new FeeType[this.fee.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link FeeType }
     *     
     */
    public FeeType getFee(int idx) {
        if (this.fee == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.fee.get(idx);
    }

    public int getFeeLength() {
        if (this.fee == null) {
            return  0;
        }
        return this.fee.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link FeeType }
     *     
     */
    public void setFee(FeeType[] values) {
        this._getFee().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.fee.add(values[i]);
        }
    }

    protected List<FeeType> _getFee() {
        if (fee == null) {
            fee = new ArrayList<FeeType>();
        }
        return fee;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link FeeType }
     *     
     */
    public FeeType setFee(int idx, FeeType value) {
        return this.fee.set(idx, value);
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
