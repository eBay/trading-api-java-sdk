
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
 * 				<span class="tablenote"> <strong>Note:</strong>  This type is deprecated since Unpaid Item cases are no longer supported. </span><br>
 * 			
 * 
 * <p>Java class for UnpaidItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnpaidItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}UnpaidItemCaseStatusTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:ebay:apis:eBLBaseComponents}UnpaidItemCaseOpenTypeCodeType" minOccurs="0"/>
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
@XmlType(name = "UnpaidItemType", propOrder = {
    "status",
    "type",
    "any"
})
public class UnpaidItemType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Status")
    protected UnpaidItemCaseStatusTypeCodeType status;
    @XmlElement(name = "Type")
    protected UnpaidItemCaseOpenTypeCodeType type;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UnpaidItemCaseStatusTypeCodeType }
     *     
     */
    public UnpaidItemCaseStatusTypeCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpaidItemCaseStatusTypeCodeType }
     *     
     */
    public void setStatus(UnpaidItemCaseStatusTypeCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link UnpaidItemCaseOpenTypeCodeType }
     *     
     */
    public UnpaidItemCaseOpenTypeCodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpaidItemCaseOpenTypeCodeType }
     *     
     */
    public void setType(UnpaidItemCaseOpenTypeCodeType value) {
        this.type = value;
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
