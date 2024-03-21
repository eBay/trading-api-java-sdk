
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
 * 				<span class="tablenote"><b>Note: </b> This type is currently available only on the German (DE) marketplace. The <b>RepairScore</b> field is provided for future use (not presently available). </span> 
 * 				<br />Type defining the <b>EnergyEfficiencyLabel</b>, <b>Hazmat</b>, and <b>RepairScore</b> regulatory containers that are used at the listing level to provide Energy Efficiency Label information, hazardous material related information, and the repair score.
 * 			
 * 
 * <p>Java class for RegulatoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnergyEfficiencyLabel" type="{urn:ebay:apis:eBLBaseComponents}EnergyEfficiencyType" minOccurs="0"/>
 *         &lt;element name="Hazmat" type="{urn:ebay:apis:eBLBaseComponents}HazmatType" minOccurs="0"/>
 *         &lt;element name="RepairScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlType(name = "RegulatoryType", propOrder = {
    "energyEfficiencyLabel",
    "hazmat",
    "repairScore",
    "any"
})
public class RegulatoryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EnergyEfficiencyLabel")
    protected EnergyEfficiencyType energyEfficiencyLabel;
    @XmlElement(name = "Hazmat")
    protected HazmatType hazmat;
    @XmlElement(name = "RepairScore")
    protected Double repairScore;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the energyEfficiencyLabel property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyEfficiencyType }
     *     
     */
    public EnergyEfficiencyType getEnergyEfficiencyLabel() {
        return energyEfficiencyLabel;
    }

    /**
     * Sets the value of the energyEfficiencyLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyEfficiencyType }
     *     
     */
    public void setEnergyEfficiencyLabel(EnergyEfficiencyType value) {
        this.energyEfficiencyLabel = value;
    }

    /**
     * Gets the value of the hazmat property.
     * 
     * @return
     *     possible object is
     *     {@link HazmatType }
     *     
     */
    public HazmatType getHazmat() {
        return hazmat;
    }

    /**
     * Sets the value of the hazmat property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazmatType }
     *     
     */
    public void setHazmat(HazmatType value) {
        this.hazmat = value;
    }

    /**
     * Gets the value of the repairScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRepairScore() {
        return repairScore;
    }

    /**
     * Sets the value of the repairScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRepairScore(Double value) {
        this.repairScore = value;
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
