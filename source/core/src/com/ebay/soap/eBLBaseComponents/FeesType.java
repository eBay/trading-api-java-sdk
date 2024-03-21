
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
 * 				Type used to express all fees associated with listing an item. These are the fees that the seller will pay to eBay.
 * 			
 * 
 * <p>Java class for FeesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fee" type="{urn:ebay:apis:eBLBaseComponents}FeeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeesType", propOrder = {
    "fee"
})
public class FeesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Fee")
    protected List<FeeType> fee;

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

}
