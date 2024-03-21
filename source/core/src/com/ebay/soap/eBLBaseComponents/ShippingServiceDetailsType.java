
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
 *         Type used by the <b>ShippingServiceDetails</b> containers that are returned in the <b>GeteBayDetails</b> response. Each <b>ShippingServiceDetails</b> container consists of detailed information about each shipping service option available for the specified country. These details include the shipping service enumeration value to use when specifying shipping service options in an Add/Revise/Relist call, the shipping carrier, the shipping category (e.g. expedited, economy, etc.), the shipping packages that can be used, and the shipping delivery window.
 *         <br/><br/>
 *         <b>ShippingServiceDetails</b> containers are returned if a <b>DetailName</b> field is included in the call request and set to <code>ShippingServiceDetails</code>, or if no <b>DetailName</b> field is included in the call request.
 *       
 * 
 * <p>Java class for ShippingServiceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingServiceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpeditedService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InternationalService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingService" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShippingServiceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCode" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceCodeType" minOccurs="0"/>
 *         &lt;element name="ServiceType" type="{urn:ebay:apis:eBLBaseComponents}ShippingTypeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingPackage" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DimensionsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidForSellingFlow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SurchargeApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingCarrier" type="{urn:ebay:apis:eBLBaseComponents}ShippingCarrierCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CODService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeprecationDetails" type="{urn:ebay:apis:eBLBaseComponents}AnnouncementMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MappedToShippingServiceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CostGroupFlat" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShippingServicePackageDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingServicePackageDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WeightRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DetailVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShippingCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
@XmlType(name = "ShippingServiceDetailsType", propOrder = {
    "description",
    "expeditedService",
    "internationalService",
    "shippingService",
    "shippingServiceID",
    "shippingTimeMax",
    "shippingTimeMin",
    "shippingServiceCode",
    "serviceType",
    "shippingPackage",
    "dimensionsRequired",
    "validForSellingFlow",
    "surchargeApplicable",
    "shippingCarrier",
    "codService",
    "deprecationDetails",
    "mappedToShippingServiceID",
    "costGroupFlat",
    "shippingServicePackageDetails",
    "weightRequired",
    "detailVersion",
    "updateTime",
    "shippingCategory",
    "any"
})
public class ShippingServiceDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ExpeditedService")
    protected Boolean expeditedService;
    @XmlElement(name = "InternationalService")
    protected Boolean internationalService;
    @XmlElement(name = "ShippingService")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingService;
    @XmlElement(name = "ShippingServiceID")
    protected Integer shippingServiceID;
    @XmlElement(name = "ShippingTimeMax")
    protected Integer shippingTimeMax;
    @XmlElement(name = "ShippingTimeMin")
    protected Integer shippingTimeMin;
    @XmlElement(name = "ShippingServiceCode")
    protected ShippingServiceCodeType shippingServiceCode;
    @XmlElement(name = "ServiceType")
    protected List<ShippingTypeCodeType> serviceType;
    @XmlElement(name = "ShippingPackage")
    protected List<ShippingPackageCodeType> shippingPackage;
    @XmlElement(name = "DimensionsRequired")
    protected Boolean dimensionsRequired;
    @XmlElement(name = "ValidForSellingFlow")
    protected Boolean validForSellingFlow;
    @XmlElement(name = "SurchargeApplicable")
    protected Boolean surchargeApplicable;
    @XmlElement(name = "ShippingCarrier")
    protected List<ShippingCarrierCodeType> shippingCarrier;
    @XmlElement(name = "CODService")
    protected Boolean codService;
    @XmlElement(name = "DeprecationDetails")
    protected List<AnnouncementMessageType> deprecationDetails;
    @XmlElement(name = "MappedToShippingServiceID")
    protected Integer mappedToShippingServiceID;
    @XmlElement(name = "CostGroupFlat")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String costGroupFlat;
    @XmlElement(name = "ShippingServicePackageDetails")
    protected List<ShippingServicePackageDetailsType> shippingServicePackageDetails;
    @XmlElement(name = "WeightRequired")
    protected Boolean weightRequired;
    @XmlElement(name = "DetailVersion")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar updateTime;
    @XmlElement(name = "ShippingCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingCategory;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the internationalService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternationalService() {
        return internationalService;
    }

    /**
     * Sets the value of the internationalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternationalService(Boolean value) {
        this.internationalService = value;
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
     * Gets the value of the shippingServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingServiceID() {
        return shippingServiceID;
    }

    /**
     * Sets the value of the shippingServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingServiceID(Integer value) {
        this.shippingServiceID = value;
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
     * Gets the value of the shippingServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceCodeType }
     *     
     */
    public ShippingServiceCodeType getShippingServiceCode() {
        return shippingServiceCode;
    }

    /**
     * Sets the value of the shippingServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceCodeType }
     *     
     */
    public void setShippingServiceCode(ShippingServiceCodeType value) {
        this.shippingServiceCode = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingTypeCodeType }
     *     
     */
    public ShippingTypeCodeType[] getServiceType() {
        if (this.serviceType == null) {
            return new ShippingTypeCodeType[ 0 ] ;
        }
        return ((ShippingTypeCodeType[]) this.serviceType.toArray(new ShippingTypeCodeType[this.serviceType.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingTypeCodeType }
     *     
     */
    public ShippingTypeCodeType getServiceType(int idx) {
        if (this.serviceType == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.serviceType.get(idx);
    }

    public int getServiceTypeLength() {
        if (this.serviceType == null) {
            return  0;
        }
        return this.serviceType.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingTypeCodeType }
     *     
     */
    public void setServiceType(ShippingTypeCodeType[] values) {
        this._getServiceType().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.serviceType.add(values[i]);
        }
    }

    protected List<ShippingTypeCodeType> _getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<ShippingTypeCodeType>();
        }
        return serviceType;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingTypeCodeType }
     *     
     */
    public ShippingTypeCodeType setServiceType(int idx, ShippingTypeCodeType value) {
        return this.serviceType.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingPackageCodeType }
     *     
     */
    public ShippingPackageCodeType[] getShippingPackage() {
        if (this.shippingPackage == null) {
            return new ShippingPackageCodeType[ 0 ] ;
        }
        return ((ShippingPackageCodeType[]) this.shippingPackage.toArray(new ShippingPackageCodeType[this.shippingPackage.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingPackageCodeType }
     *     
     */
    public ShippingPackageCodeType getShippingPackage(int idx) {
        if (this.shippingPackage == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingPackage.get(idx);
    }

    public int getShippingPackageLength() {
        if (this.shippingPackage == null) {
            return  0;
        }
        return this.shippingPackage.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingPackageCodeType }
     *     
     */
    public void setShippingPackage(ShippingPackageCodeType[] values) {
        this._getShippingPackage().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingPackage.add(values[i]);
        }
    }

    protected List<ShippingPackageCodeType> _getShippingPackage() {
        if (shippingPackage == null) {
            shippingPackage = new ArrayList<ShippingPackageCodeType>();
        }
        return shippingPackage;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public ShippingPackageCodeType setShippingPackage(int idx, ShippingPackageCodeType value) {
        return this.shippingPackage.set(idx, value);
    }

    /**
     * Gets the value of the dimensionsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDimensionsRequired() {
        return dimensionsRequired;
    }

    /**
     * Sets the value of the dimensionsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDimensionsRequired(Boolean value) {
        this.dimensionsRequired = value;
    }

    /**
     * Gets the value of the validForSellingFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidForSellingFlow() {
        return validForSellingFlow;
    }

    /**
     * Sets the value of the validForSellingFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidForSellingFlow(Boolean value) {
        this.validForSellingFlow = value;
    }

    /**
     * Gets the value of the surchargeApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSurchargeApplicable() {
        return surchargeApplicable;
    }

    /**
     * Sets the value of the surchargeApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSurchargeApplicable(Boolean value) {
        this.surchargeApplicable = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingCarrierCodeType }
     *     
     */
    public ShippingCarrierCodeType[] getShippingCarrier() {
        if (this.shippingCarrier == null) {
            return new ShippingCarrierCodeType[ 0 ] ;
        }
        return ((ShippingCarrierCodeType[]) this.shippingCarrier.toArray(new ShippingCarrierCodeType[this.shippingCarrier.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingCarrierCodeType }
     *     
     */
    public ShippingCarrierCodeType getShippingCarrier(int idx) {
        if (this.shippingCarrier == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingCarrier.get(idx);
    }

    public int getShippingCarrierLength() {
        if (this.shippingCarrier == null) {
            return  0;
        }
        return this.shippingCarrier.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingCarrierCodeType }
     *     
     */
    public void setShippingCarrier(ShippingCarrierCodeType[] values) {
        this._getShippingCarrier().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingCarrier.add(values[i]);
        }
    }

    protected List<ShippingCarrierCodeType> _getShippingCarrier() {
        if (shippingCarrier == null) {
            shippingCarrier = new ArrayList<ShippingCarrierCodeType>();
        }
        return shippingCarrier;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCarrierCodeType }
     *     
     */
    public ShippingCarrierCodeType setShippingCarrier(int idx, ShippingCarrierCodeType value) {
        return this.shippingCarrier.set(idx, value);
    }

    /**
     * Gets the value of the codService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCODService() {
        return codService;
    }

    /**
     * Sets the value of the codService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCODService(Boolean value) {
        this.codService = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AnnouncementMessageType }
     *     
     */
    public AnnouncementMessageType[] getDeprecationDetails() {
        if (this.deprecationDetails == null) {
            return new AnnouncementMessageType[ 0 ] ;
        }
        return ((AnnouncementMessageType[]) this.deprecationDetails.toArray(new AnnouncementMessageType[this.deprecationDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AnnouncementMessageType }
     *     
     */
    public AnnouncementMessageType getDeprecationDetails(int idx) {
        if (this.deprecationDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.deprecationDetails.get(idx);
    }

    public int getDeprecationDetailsLength() {
        if (this.deprecationDetails == null) {
            return  0;
        }
        return this.deprecationDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AnnouncementMessageType }
     *     
     */
    public void setDeprecationDetails(AnnouncementMessageType[] values) {
        this._getDeprecationDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.deprecationDetails.add(values[i]);
        }
    }

    protected List<AnnouncementMessageType> _getDeprecationDetails() {
        if (deprecationDetails == null) {
            deprecationDetails = new ArrayList<AnnouncementMessageType>();
        }
        return deprecationDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AnnouncementMessageType }
     *     
     */
    public AnnouncementMessageType setDeprecationDetails(int idx, AnnouncementMessageType value) {
        return this.deprecationDetails.set(idx, value);
    }

    /**
     * Gets the value of the mappedToShippingServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMappedToShippingServiceID() {
        return mappedToShippingServiceID;
    }

    /**
     * Sets the value of the mappedToShippingServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMappedToShippingServiceID(Integer value) {
        this.mappedToShippingServiceID = value;
    }

    /**
     * Gets the value of the costGroupFlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostGroupFlat() {
        return costGroupFlat;
    }

    /**
     * Sets the value of the costGroupFlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostGroupFlat(String value) {
        this.costGroupFlat = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingServicePackageDetailsType }
     *     
     */
    public ShippingServicePackageDetailsType[] getShippingServicePackageDetails() {
        if (this.shippingServicePackageDetails == null) {
            return new ShippingServicePackageDetailsType[ 0 ] ;
        }
        return ((ShippingServicePackageDetailsType[]) this.shippingServicePackageDetails.toArray(new ShippingServicePackageDetailsType[this.shippingServicePackageDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingServicePackageDetailsType }
     *     
     */
    public ShippingServicePackageDetailsType getShippingServicePackageDetails(int idx) {
        if (this.shippingServicePackageDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingServicePackageDetails.get(idx);
    }

    public int getShippingServicePackageDetailsLength() {
        if (this.shippingServicePackageDetails == null) {
            return  0;
        }
        return this.shippingServicePackageDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingServicePackageDetailsType }
     *     
     */
    public void setShippingServicePackageDetails(ShippingServicePackageDetailsType[] values) {
        this._getShippingServicePackageDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingServicePackageDetails.add(values[i]);
        }
    }

    protected List<ShippingServicePackageDetailsType> _getShippingServicePackageDetails() {
        if (shippingServicePackageDetails == null) {
            shippingServicePackageDetails = new ArrayList<ShippingServicePackageDetailsType>();
        }
        return shippingServicePackageDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServicePackageDetailsType }
     *     
     */
    public ShippingServicePackageDetailsType setShippingServicePackageDetails(int idx, ShippingServicePackageDetailsType value) {
        return this.shippingServicePackageDetails.set(idx, value);
    }

    /**
     * Gets the value of the weightRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeightRequired() {
        return weightRequired;
    }

    /**
     * Sets the value of the weightRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeightRequired(Boolean value) {
        this.weightRequired = value;
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
     * Gets the value of the shippingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCategory() {
        return shippingCategory;
    }

    /**
     * Sets the value of the shippingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCategory(String value) {
        this.shippingCategory = value;
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
