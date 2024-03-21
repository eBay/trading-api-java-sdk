
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 *         Container consisting of shipping costs and other details related to an international
 * 				shipping service. If one or more international shipping services are provided, the
 * 				seller must specify at least one domestic shipping service as well.
 * 			
 * 
 * <p>Java class for InternationalShippingServiceOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalShippingServiceOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingService" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceAdditionalCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServicePriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShipToLocation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingInsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ImportCharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCutOffTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "InternationalShippingServiceOptionsType", propOrder = {
    "shippingService",
    "shippingServiceCost",
    "shippingServiceAdditionalCost",
    "shippingServicePriority",
    "shipToLocation",
    "shippingInsuranceCost",
    "importCharge",
    "shippingServiceCutOffTime",
    "any"
})
public class InternationalShippingServiceOptionsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShippingService")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingService;
    @XmlElement(name = "ShippingServiceCost")
    protected AmountType shippingServiceCost;
    @XmlElement(name = "ShippingServiceAdditionalCost")
    protected AmountType shippingServiceAdditionalCost;
    @XmlElement(name = "ShippingServicePriority")
    protected Integer shippingServicePriority;
    @XmlElement(name = "ShipToLocation")
    protected List<String> shipToLocation;
    @XmlElement(name = "ShippingInsuranceCost")
    protected AmountType shippingInsuranceCost;
    @XmlElement(name = "ImportCharge")
    protected AmountType importCharge;
    @XmlElement(name = "ShippingServiceCutOffTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar shippingServiceCutOffTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the shippingService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingService() {
        return shippingService;
    }

    /**
     * Sets the value of the shippingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingService(String value) {
        this.shippingService = value;
    }

    /**
     * Gets the value of the shippingServiceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingServiceCost() {
        return shippingServiceCost;
    }

    /**
     * Sets the value of the shippingServiceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingServiceCost(AmountType value) {
        this.shippingServiceCost = value;
    }

    /**
     * Gets the value of the shippingServiceAdditionalCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingServiceAdditionalCost() {
        return shippingServiceAdditionalCost;
    }

    /**
     * Sets the value of the shippingServiceAdditionalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingServiceAdditionalCost(AmountType value) {
        this.shippingServiceAdditionalCost = value;
    }

    /**
     * Gets the value of the shippingServicePriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingServicePriority() {
        return shippingServicePriority;
    }

    /**
     * Sets the value of the shippingServicePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingServicePriority(Integer value) {
        this.shippingServicePriority = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link String }
     *     
     */
    public String[] getShipToLocation() {
        if (this.shipToLocation == null) {
            return new String[ 0 ] ;
        }
        return ((String[]) this.shipToLocation.toArray(new String[this.shipToLocation.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link String }
     *     
     */
    public String getShipToLocation(int idx) {
        if (this.shipToLocation == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shipToLocation.get(idx);
    }

    public int getShipToLocationLength() {
        if (this.shipToLocation == null) {
            return  0;
        }
        return this.shipToLocation.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link String }
     *     
     */
    public void setShipToLocation(String[] values) {
        this._getShipToLocation().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shipToLocation.add(values[i]);
        }
    }

    protected List<String> _getShipToLocation() {
        if (shipToLocation == null) {
            shipToLocation = new ArrayList<String>();
        }
        return shipToLocation;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public String setShipToLocation(int idx, String value) {
        return this.shipToLocation.set(idx, value);
    }

    /**
     * Gets the value of the shippingInsuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingInsuranceCost() {
        return shippingInsuranceCost;
    }

    /**
     * Sets the value of the shippingInsuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingInsuranceCost(AmountType value) {
        this.shippingInsuranceCost = value;
    }

    /**
     * Gets the value of the importCharge property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getImportCharge() {
        return importCharge;
    }

    /**
     * Sets the value of the importCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setImportCharge(AmountType value) {
        this.importCharge = value;
    }

    /**
     * Gets the value of the shippingServiceCutOffTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getShippingServiceCutOffTime() {
        return shippingServiceCutOffTime;
    }

    /**
     * Sets the value of the shippingServiceCutOffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingServiceCutOffTime(Calendar value) {
        this.shippingServiceCutOffTime = value;
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
