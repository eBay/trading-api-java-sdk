
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
 * 				This type contains the data for condition descriptors associated with an item.
 * 			
 * 
 * <p>Java class for ConditionDescriptorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionDescriptorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConditionDescriptor" type="{urn:ebay:apis:eBLBaseComponents}ConditionDescriptorType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ConditionDescriptorsType", propOrder = {
    "conditionDescriptor",
    "any"
})
public class ConditionDescriptorsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ConditionDescriptor")
    protected List<ConditionDescriptorType> conditionDescriptor;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ConditionDescriptorType }
     *     
     */
    public ConditionDescriptorType[] getConditionDescriptor() {
        if (this.conditionDescriptor == null) {
            return new ConditionDescriptorType[ 0 ] ;
        }
        return ((ConditionDescriptorType[]) this.conditionDescriptor.toArray(new ConditionDescriptorType[this.conditionDescriptor.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ConditionDescriptorType }
     *     
     */
    public ConditionDescriptorType getConditionDescriptor(int idx) {
        if (this.conditionDescriptor == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.conditionDescriptor.get(idx);
    }

    public int getConditionDescriptorLength() {
        if (this.conditionDescriptor == null) {
            return  0;
        }
        return this.conditionDescriptor.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ConditionDescriptorType }
     *     
     */
    public void setConditionDescriptor(ConditionDescriptorType[] values) {
        this._getConditionDescriptor().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.conditionDescriptor.add(values[i]);
        }
    }

    protected List<ConditionDescriptorType> _getConditionDescriptor() {
        if (conditionDescriptor == null) {
            conditionDescriptor = new ArrayList<ConditionDescriptorType>();
        }
        return conditionDescriptor;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionDescriptorType }
     *     
     */
    public ConditionDescriptorType setConditionDescriptor(int idx, ConditionDescriptorType value) {
        return this.conditionDescriptor.set(idx, value);
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
