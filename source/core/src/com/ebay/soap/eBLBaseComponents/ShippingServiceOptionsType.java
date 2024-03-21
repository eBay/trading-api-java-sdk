
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
 * 				Container consisting of shipping costs and other details related to a domestic
 * 				shipping service. A <b>ShippingServiceOptions</b> container is required for each domestic shipping service option that the seller will make available to buyers in an Add/Revise/Relist call. Up to four domestic shipping service options can be offered per listing.
 * 			
 * 
 * <p>Java class for ShippingServiceOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServiceOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingInsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingService" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceAdditionalCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServicePriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpeditedService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FreeShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalPickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImportCharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingPackageInfo" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCutOffTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LogisticPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ShippingServiceOptionsType", propOrder = {
    "shippingInsuranceCost",
    "shippingService",
    "shippingServiceCost",
    "shippingServiceAdditionalCost",
    "shippingServicePriority",
    "expeditedService",
    "shippingTimeMin",
    "shippingTimeMax",
    "freeShipping",
    "localPickup",
    "importCharge",
    "shippingPackageInfo",
    "shippingServiceCutOffTime",
    "logisticPlanType",
    "any"
})
public class ShippingServiceOptionsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ShippingInsuranceCost")
    protected AmountType shippingInsuranceCost;
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
    @XmlElement(name = "ExpeditedService")
    protected Boolean expeditedService;
    @XmlElement(name = "ShippingTimeMin")
    protected Integer shippingTimeMin;
    @XmlElement(name = "ShippingTimeMax")
    protected Integer shippingTimeMax;
    @XmlElement(name = "FreeShipping")
    protected Boolean freeShipping;
    @XmlElement(name = "LocalPickup")
    protected Boolean localPickup;
    @XmlElement(name = "ImportCharge")
    protected AmountType importCharge;
    @XmlElement(name = "ShippingPackageInfo")
    protected List<ShippingPackageInfoType> shippingPackageInfo;
    @XmlElement(name = "ShippingServiceCutOffTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar shippingServiceCutOffTime;
    @XmlElement(name = "LogisticPlanType")
    protected String logisticPlanType;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the expeditedService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpeditedService() {
        return expeditedService;
    }

    /**
     * Sets the value of the expeditedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpeditedService(Boolean value) {
        this.expeditedService = value;
    }

    /**
     * Gets the value of the shippingTimeMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingTimeMin() {
        return shippingTimeMin;
    }

    /**
     * Sets the value of the shippingTimeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingTimeMin(Integer value) {
        this.shippingTimeMin = value;
    }

    /**
     * Gets the value of the shippingTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingTimeMax() {
        return shippingTimeMax;
    }

    /**
     * Sets the value of the shippingTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingTimeMax(Integer value) {
        this.shippingTimeMax = value;
    }

    /**
     * Gets the value of the freeShipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeShipping() {
        return freeShipping;
    }

    /**
     * Sets the value of the freeShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeShipping(Boolean value) {
        this.freeShipping = value;
    }

    /**
     * Gets the value of the localPickup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalPickup() {
        return localPickup;
    }

    /**
     * Sets the value of the localPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalPickup(Boolean value) {
        this.localPickup = value;
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
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingPackageInfoType }
     *     
     */
    public ShippingPackageInfoType[] getShippingPackageInfo() {
        if (this.shippingPackageInfo == null) {
            return new ShippingPackageInfoType[ 0 ] ;
        }
        return ((ShippingPackageInfoType[]) this.shippingPackageInfo.toArray(new ShippingPackageInfoType[this.shippingPackageInfo.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingPackageInfoType }
     *     
     */
    public ShippingPackageInfoType getShippingPackageInfo(int idx) {
        if (this.shippingPackageInfo == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingPackageInfo.get(idx);
    }

    public int getShippingPackageInfoLength() {
        if (this.shippingPackageInfo == null) {
            return  0;
        }
        return this.shippingPackageInfo.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingPackageInfoType }
     *     
     */
    public void setShippingPackageInfo(ShippingPackageInfoType[] values) {
        this._getShippingPackageInfo().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingPackageInfo.add(values[i]);
        }
    }

    protected List<ShippingPackageInfoType> _getShippingPackageInfo() {
        if (shippingPackageInfo == null) {
            shippingPackageInfo = new ArrayList<ShippingPackageInfoType>();
        }
        return shippingPackageInfo;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageInfoType }
     *     
     */
    public ShippingPackageInfoType setShippingPackageInfo(int idx, ShippingPackageInfoType value) {
        return this.shippingPackageInfo.set(idx, value);
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
     * Gets the value of the logisticPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticPlanType() {
        return logisticPlanType;
    }

    /**
     * Sets the value of the logisticPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticPlanType(String value) {
        this.logisticPlanType = value;
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
