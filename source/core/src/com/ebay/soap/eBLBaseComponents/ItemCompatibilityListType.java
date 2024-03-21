
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
 * 				A list of compatible applications specified as name and value pairs. Describes an
 * 				assembly with which a part is compatible (i.e., parts compatibility by application). For
 * 				example, to specify a part's compatibility with a vehicle, the name would map to
 * 				standard vehicle characteristics (e.g., Year, Make, Model, Trim, and Engine). The
 * 				values would desribe the specific vehicle, such as a 2006 Honda Accord.
 * 			
 * 
 * <p>Java class for ItemCompatibilityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemCompatibilityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compatibility" type="{urn:ebay:apis:eBLBaseComponents}ItemCompatibilityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReplaceAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ItemCompatibilityListType", propOrder = {
    "compatibility",
    "replaceAll",
    "any"
})
public class ItemCompatibilityListType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Compatibility")
    protected List<ItemCompatibilityType> compatibility;
    @XmlElement(name = "ReplaceAll")
    protected Boolean replaceAll;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ItemCompatibilityType }
     *     
     */
    public ItemCompatibilityType[] getCompatibility() {
        if (this.compatibility == null) {
            return new ItemCompatibilityType[ 0 ] ;
        }
        return ((ItemCompatibilityType[]) this.compatibility.toArray(new ItemCompatibilityType[this.compatibility.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ItemCompatibilityType }
     *     
     */
    public ItemCompatibilityType getCompatibility(int idx) {
        if (this.compatibility == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.compatibility.get(idx);
    }

    public int getCompatibilityLength() {
        if (this.compatibility == null) {
            return  0;
        }
        return this.compatibility.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ItemCompatibilityType }
     *     
     */
    public void setCompatibility(ItemCompatibilityType[] values) {
        this._getCompatibility().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.compatibility.add(values[i]);
        }
    }

    protected List<ItemCompatibilityType> _getCompatibility() {
        if (compatibility == null) {
            compatibility = new ArrayList<ItemCompatibilityType>();
        }
        return compatibility;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCompatibilityType }
     *     
     */
    public ItemCompatibilityType setCompatibility(int idx, ItemCompatibilityType value) {
        return this.compatibility.set(idx, value);
    }

    /**
     * Gets the value of the replaceAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplaceAll() {
        return replaceAll;
    }

    /**
     * Sets the value of the replaceAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplaceAll(Boolean value) {
        this.replaceAll = value;
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
