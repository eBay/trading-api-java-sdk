
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
 * 				Type defining the regulatory containers that are used at the listing level to provide Energy Efficiency Label information, hazardous material related information, product safety related information, manufacturer and responsible person information, and the repair score.
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
 *         &lt;element name="ProductSafety" type="{urn:ebay:apis:eBLBaseComponents}ProductSafetyType" minOccurs="0"/>
 *         &lt;element name="RepairScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{urn:ebay:apis:eBLBaseComponents}ManufacturerType" minOccurs="0"/>
 *         &lt;element name="ResponsiblePersons" type="{urn:ebay:apis:eBLBaseComponents}ResponsiblePersonsType" minOccurs="0"/>
 *         &lt;element name="Documents" type="{urn:ebay:apis:eBLBaseComponents}DocumentsType" minOccurs="0"/>
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
    "productSafety",
    "repairScore",
    "manufacturer",
    "responsiblePersons",
    "documents",
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
    @XmlElement(name = "ProductSafety")
    protected ProductSafetyType productSafety;
    @XmlElement(name = "RepairScore")
    protected Double repairScore;
    @XmlElement(name = "Manufacturer")
    protected ManufacturerType manufacturer;
    @XmlElement(name = "ResponsiblePersons")
    protected ResponsiblePersonsType responsiblePersons;
    @XmlElement(name = "Documents")
    protected DocumentsType documents;
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
     * Gets the value of the productSafety property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSafetyType }
     *     
     */
    public ProductSafetyType getProductSafety() {
        return productSafety;
    }

    /**
     * Sets the value of the productSafety property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSafetyType }
     *     
     */
    public void setProductSafety(ProductSafetyType value) {
        this.productSafety = value;
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
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerType }
     *     
     */
    public ManufacturerType getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerType }
     *     
     */
    public void setManufacturer(ManufacturerType value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the responsiblePersons property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsiblePersonsType }
     *     
     */
    public ResponsiblePersonsType getResponsiblePersons() {
        return responsiblePersons;
    }

    /**
     * Sets the value of the responsiblePersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsiblePersonsType }
     *     
     */
    public void setResponsiblePersons(ResponsiblePersonsType value) {
        this.responsiblePersons = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsType }
     *     
     */
    public DocumentsType getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsType }
     *     
     */
    public void setDocuments(DocumentsType value) {
        this.documents = value;
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
