
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for UnitOfMeasurementDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitOfMeasurementDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitOfMeasurement" type="{urn:ebay:apis:eBLBaseComponents}UnitOfMeasurementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DetailVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "UnitOfMeasurementDetailsType", propOrder = {
    "unitOfMeasurement",
    "detailVersion",
    "updateTime",
    "any"
})
public class UnitOfMeasurementDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "UnitOfMeasurement")
    protected List<UnitOfMeasurementType> unitOfMeasurement;
    @XmlElement(name = "DetailVersion")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar updateTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link UnitOfMeasurementType }
     *     
     */
    public UnitOfMeasurementType[] getUnitOfMeasurement() {
        if (this.unitOfMeasurement == null) {
            return new UnitOfMeasurementType[ 0 ] ;
        }
        return ((UnitOfMeasurementType[]) this.unitOfMeasurement.toArray(new UnitOfMeasurementType[this.unitOfMeasurement.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link UnitOfMeasurementType }
     *     
     */
    public UnitOfMeasurementType getUnitOfMeasurement(int idx) {
        if (this.unitOfMeasurement == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.unitOfMeasurement.get(idx);
    }

    public int getUnitOfMeasurementLength() {
        if (this.unitOfMeasurement == null) {
            return  0;
        }
        return this.unitOfMeasurement.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link UnitOfMeasurementType }
     *     
     */
    public void setUnitOfMeasurement(UnitOfMeasurementType[] values) {
        this._getUnitOfMeasurement().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.unitOfMeasurement.add(values[i]);
        }
    }

    protected List<UnitOfMeasurementType> _getUnitOfMeasurement() {
        if (unitOfMeasurement == null) {
            unitOfMeasurement = new ArrayList<UnitOfMeasurementType>();
        }
        return unitOfMeasurement;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurementType }
     *     
     */
    public UnitOfMeasurementType setUnitOfMeasurement(int idx, UnitOfMeasurementType value) {
        return this.unitOfMeasurement.set(idx, value);
    }

    /**
     * Gets the value of the detailVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailVersion() {
        return detailVersion;
    }

    /**
     * Sets the value of the detailVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailVersion(String value) {
        this.detailVersion = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTime(Calendar value) {
        this.updateTime = value;
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
