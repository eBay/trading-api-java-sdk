
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
 * 				Type defining the <b>BuyerPackageEnclosures</b> container, which is returned in <b>GetOrders</b> (and other order management calls) if the 'Pay Upon Invoice' option is being offered to the buyer, and the seller is including payment instructions in the shipping package(s). A <b>BuyerPackageEnclosure</b> container will be returned for each shipping package containing payment instructions. The 'Pay Upon Invoice' option is only available on the German site.
 * 			
 * 
 * <p>Java class for BuyerPackageEnclosuresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerPackageEnclosuresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyerPackageEnclosure" type="{urn:ebay:apis:eBLBaseComponents}BuyerPackageEnclosureType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BuyerPackageEnclosuresType", propOrder = {
    "buyerPackageEnclosure",
    "any"
})
public class BuyerPackageEnclosuresType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BuyerPackageEnclosure")
    protected List<BuyerPackageEnclosureType> buyerPackageEnclosure;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link BuyerPackageEnclosureType }
     *     
     */
    public BuyerPackageEnclosureType[] getBuyerPackageEnclosure() {
        if (this.buyerPackageEnclosure == null) {
            return new BuyerPackageEnclosureType[ 0 ] ;
        }
        return ((BuyerPackageEnclosureType[]) this.buyerPackageEnclosure.toArray(new BuyerPackageEnclosureType[this.buyerPackageEnclosure.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link BuyerPackageEnclosureType }
     *     
     */
    public BuyerPackageEnclosureType getBuyerPackageEnclosure(int idx) {
        if (this.buyerPackageEnclosure == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.buyerPackageEnclosure.get(idx);
    }

    public int getBuyerPackageEnclosureLength() {
        if (this.buyerPackageEnclosure == null) {
            return  0;
        }
        return this.buyerPackageEnclosure.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link BuyerPackageEnclosureType }
     *     
     */
    public void setBuyerPackageEnclosure(BuyerPackageEnclosureType[] values) {
        this._getBuyerPackageEnclosure().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.buyerPackageEnclosure.add(values[i]);
        }
    }

    protected List<BuyerPackageEnclosureType> _getBuyerPackageEnclosure() {
        if (buyerPackageEnclosure == null) {
            buyerPackageEnclosure = new ArrayList<BuyerPackageEnclosureType>();
        }
        return buyerPackageEnclosure;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPackageEnclosureType }
     *     
     */
    public BuyerPackageEnclosureType setBuyerPackageEnclosure(int idx, BuyerPackageEnclosureType value) {
        return this.buyerPackageEnclosure.set(idx, value);
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
