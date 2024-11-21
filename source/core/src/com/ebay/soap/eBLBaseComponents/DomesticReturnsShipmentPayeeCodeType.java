
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
 * 				This type defines the available options for who pays the return shipping costs for domestic returns.
 * 			
 * 
 * <p>Java class for DomesticReturnsShipmentPayeeCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomesticReturnsShipmentPayeeCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomesticReturnsShipmentPayee" type="{urn:ebay:apis:eBLBaseComponents}ReturnsShipmentPayeeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomesticReturnsShipmentPayeeCodeType", propOrder = {
    "domesticReturnsShipmentPayee",
    "any"
})
public class DomesticReturnsShipmentPayeeCodeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DomesticReturnsShipmentPayee")
    protected List<ReturnsShipmentPayeeCodeType> domesticReturnsShipmentPayee;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ReturnsShipmentPayeeCodeType }
     *     
     */
    public ReturnsShipmentPayeeCodeType[] getDomesticReturnsShipmentPayee() {
        if (this.domesticReturnsShipmentPayee == null) {
            return new ReturnsShipmentPayeeCodeType[ 0 ] ;
        }
        return ((ReturnsShipmentPayeeCodeType[]) this.domesticReturnsShipmentPayee.toArray(new ReturnsShipmentPayeeCodeType[this.domesticReturnsShipmentPayee.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReturnsShipmentPayeeCodeType }
     *     
     */
    public ReturnsShipmentPayeeCodeType getDomesticReturnsShipmentPayee(int idx) {
        if (this.domesticReturnsShipmentPayee == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.domesticReturnsShipmentPayee.get(idx);
    }

    public int getDomesticReturnsShipmentPayeeLength() {
        if (this.domesticReturnsShipmentPayee == null) {
            return  0;
        }
        return this.domesticReturnsShipmentPayee.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReturnsShipmentPayeeCodeType }
     *     
     */
    public void setDomesticReturnsShipmentPayee(ReturnsShipmentPayeeCodeType[] values) {
        this._getDomesticReturnsShipmentPayee().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.domesticReturnsShipmentPayee.add(values[i]);
        }
    }

    protected List<ReturnsShipmentPayeeCodeType> _getDomesticReturnsShipmentPayee() {
        if (domesticReturnsShipmentPayee == null) {
            domesticReturnsShipmentPayee = new ArrayList<ReturnsShipmentPayeeCodeType>();
        }
        return domesticReturnsShipmentPayee;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsShipmentPayeeCodeType }
     *     
     */
    public ReturnsShipmentPayeeCodeType setDomesticReturnsShipmentPayee(int idx, ReturnsShipmentPayeeCodeType value) {
        return this.domesticReturnsShipmentPayee.set(idx, value);
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
