
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
 * 				This type defines the available options for who pays the return shipping costs for international returns.
 * 			
 * 
 * <p>Java class for InternationalReturnsShipmentPayeeCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalReturnsShipmentPayeeCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InternationalReturnsShipmentPayee" type="{urn:ebay:apis:eBLBaseComponents}ReturnsShipmentPayeeCodeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "InternationalReturnsShipmentPayeeCodeType", propOrder = {
    "internationalReturnsShipmentPayee",
    "any"
})
public class InternationalReturnsShipmentPayeeCodeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "InternationalReturnsShipmentPayee")
    protected List<ReturnsShipmentPayeeCodeType> internationalReturnsShipmentPayee;
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
    public ReturnsShipmentPayeeCodeType[] getInternationalReturnsShipmentPayee() {
        if (this.internationalReturnsShipmentPayee == null) {
            return new ReturnsShipmentPayeeCodeType[ 0 ] ;
        }
        return ((ReturnsShipmentPayeeCodeType[]) this.internationalReturnsShipmentPayee.toArray(new ReturnsShipmentPayeeCodeType[this.internationalReturnsShipmentPayee.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReturnsShipmentPayeeCodeType }
     *     
     */
    public ReturnsShipmentPayeeCodeType getInternationalReturnsShipmentPayee(int idx) {
        if (this.internationalReturnsShipmentPayee == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.internationalReturnsShipmentPayee.get(idx);
    }

    public int getInternationalReturnsShipmentPayeeLength() {
        if (this.internationalReturnsShipmentPayee == null) {
            return  0;
        }
        return this.internationalReturnsShipmentPayee.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReturnsShipmentPayeeCodeType }
     *     
     */
    public void setInternationalReturnsShipmentPayee(ReturnsShipmentPayeeCodeType[] values) {
        this._getInternationalReturnsShipmentPayee().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.internationalReturnsShipmentPayee.add(values[i]);
        }
    }

    protected List<ReturnsShipmentPayeeCodeType> _getInternationalReturnsShipmentPayee() {
        if (internationalReturnsShipmentPayee == null) {
            internationalReturnsShipmentPayee = new ArrayList<ReturnsShipmentPayeeCodeType>();
        }
        return internationalReturnsShipmentPayee;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsShipmentPayeeCodeType }
     *     
     */
    public ReturnsShipmentPayeeCodeType setInternationalReturnsShipmentPayee(int idx, ReturnsShipmentPayeeCodeType value) {
        return this.internationalReturnsShipmentPayee.set(idx, value);
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
