
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
import org.w3c.dom.Element;


/**
 * 
 * 				Fields in this type provide condition values and display names.
 * 			
 * 
 * <p>Java class for ConditionValuesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionValuesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Condition" type="{urn:ebay:apis:eBLBaseComponents}ConditionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConditionHelpURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
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
@XmlType(name = "ConditionValuesType", propOrder = {
    "condition",
    "conditionHelpURL",
    "any"
})
public class ConditionValuesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Condition")
    protected List<ConditionType> condition;
    @XmlElement(name = "ConditionHelpURL")
    @XmlSchemaType(name = "anyURI")
    protected String conditionHelpURL;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ConditionType }
     *     
     */
    public ConditionType[] getCondition() {
        if (this.condition == null) {
            return new ConditionType[ 0 ] ;
        }
        return ((ConditionType[]) this.condition.toArray(new ConditionType[this.condition.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ConditionType }
     *     
     */
    public ConditionType getCondition(int idx) {
        if (this.condition == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.condition.get(idx);
    }

    public int getConditionLength() {
        if (this.condition == null) {
            return  0;
        }
        return this.condition.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ConditionType }
     *     
     */
    public void setCondition(ConditionType[] values) {
        this._getCondition().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.condition.add(values[i]);
        }
    }

    protected List<ConditionType> _getCondition() {
        if (condition == null) {
            condition = new ArrayList<ConditionType>();
        }
        return condition;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionType }
     *     
     */
    public ConditionType setCondition(int idx, ConditionType value) {
        return this.condition.set(idx, value);
    }

    /**
     * Gets the value of the conditionHelpURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionHelpURL() {
        return conditionHelpURL;
    }

    /**
     * Sets the value of the conditionHelpURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionHelpURL(String value) {
        this.conditionHelpURL = value;
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
