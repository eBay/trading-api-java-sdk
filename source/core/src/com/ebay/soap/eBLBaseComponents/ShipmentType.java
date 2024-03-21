
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
 *         Type defining the <b>Shipment</b> container, which is used by
 *         the seller in <b>CompleteSale</b> to provide shipping information.
 *       
 * 
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InsuredValue" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PackageDepth" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackageLength" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PackageWidth" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="PayPalShipmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PostageTotal" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="PrintedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShipFromAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="ShippingAddress" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="ShippingCarrierUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingFeature" type="{urn:ebay:apis:eBLBaseComponents}ShippingFeatureCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingPackage" type="{urn:ebay:apis:eBLBaseComponents}ShippingPackageCodeType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceUsed" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ShipmentTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WeightMajor" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="WeightMinor" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="ItemTransactionID" type="{urn:ebay:apis:eBLBaseComponents}ItemTransactionIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{urn:ebay:apis:eBLBaseComponents}ShipmentDeliveryStatusCodeType" minOccurs="0"/>
 *         &lt;element name="RefundGrantedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RefundRequestedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}ShipmentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ShippedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentTrackingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShipmentTrackingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ShipmentType", propOrder = {
    "estimatedDeliveryDate",
    "insuredValue",
    "packageDepth",
    "packageLength",
    "packageWidth",
    "payPalShipmentID",
    "shipmentID",
    "postageTotal",
    "printedTime",
    "shipFromAddress",
    "shippingAddress",
    "shippingCarrierUsed",
    "shippingFeature",
    "shippingPackage",
    "shippingServiceUsed",
    "shipmentTrackingNumber",
    "weightMajor",
    "weightMinor",
    "itemTransactionID",
    "deliveryDate",
    "deliveryStatus",
    "refundGrantedTime",
    "refundRequestedTime",
    "status",
    "shippedTime",
    "notes",
    "shipmentTrackingDetails",
    "any"
})
public class ShipmentType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EstimatedDeliveryDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar estimatedDeliveryDate;
    @XmlElement(name = "InsuredValue")
    protected AmountType insuredValue;
    @XmlElement(name = "PackageDepth")
    protected MeasureType packageDepth;
    @XmlElement(name = "PackageLength")
    protected MeasureType packageLength;
    @XmlElement(name = "PackageWidth")
    protected MeasureType packageWidth;
    @XmlElement(name = "PayPalShipmentID")
    protected String payPalShipmentID;
    @XmlElement(name = "ShipmentID")
    protected Long shipmentID;
    @XmlElement(name = "PostageTotal")
    protected AmountType postageTotal;
    @XmlElement(name = "PrintedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar printedTime;
    @XmlElement(name = "ShipFromAddress")
    protected AddressType shipFromAddress;
    @XmlElement(name = "ShippingAddress")
    protected AddressType shippingAddress;
    @XmlElement(name = "ShippingCarrierUsed")
    protected String shippingCarrierUsed;
    @XmlElement(name = "ShippingFeature")
    protected List<ShippingFeatureCodeType> shippingFeature;
    @XmlElement(name = "ShippingPackage")
    protected ShippingPackageCodeType shippingPackage;
    @XmlElement(name = "ShippingServiceUsed")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingServiceUsed;
    @XmlElement(name = "ShipmentTrackingNumber")
    protected String shipmentTrackingNumber;
    @XmlElement(name = "WeightMajor")
    protected MeasureType weightMajor;
    @XmlElement(name = "WeightMinor")
    protected MeasureType weightMinor;
    @XmlElement(name = "ItemTransactionID")
    protected List<ItemTransactionIDType> itemTransactionID;
    @XmlElement(name = "DeliveryDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar deliveryDate;
    @XmlElement(name = "DeliveryStatus")
    protected ShipmentDeliveryStatusCodeType deliveryStatus;
    @XmlElement(name = "RefundGrantedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar refundGrantedTime;
    @XmlElement(name = "RefundRequestedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar refundRequestedTime;
    @XmlElement(name = "Status")
    protected ShipmentStatusCodeType status;
    @XmlElement(name = "ShippedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar shippedTime;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "ShipmentTrackingDetails")
    protected List<ShipmentTrackingDetailsType> shipmentTrackingDetails;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the estimatedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Sets the value of the estimatedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedDeliveryDate(Calendar value) {
        this.estimatedDeliveryDate = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuredValue(AmountType value) {
        this.insuredValue = value;
    }

    /**
     * Gets the value of the packageDepth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageDepth() {
        return packageDepth;
    }

    /**
     * Sets the value of the packageDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageDepth(MeasureType value) {
        this.packageDepth = value;
    }

    /**
     * Gets the value of the packageLength property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageLength() {
        return packageLength;
    }

    /**
     * Sets the value of the packageLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageLength(MeasureType value) {
        this.packageLength = value;
    }

    /**
     * Gets the value of the packageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPackageWidth() {
        return packageWidth;
    }

    /**
     * Sets the value of the packageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPackageWidth(MeasureType value) {
        this.packageWidth = value;
    }

    /**
     * Gets the value of the payPalShipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayPalShipmentID() {
        return payPalShipmentID;
    }

    /**
     * Sets the value of the payPalShipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayPalShipmentID(String value) {
        this.payPalShipmentID = value;
    }

    /**
     * Gets the value of the shipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShipmentID() {
        return shipmentID;
    }

    /**
     * Sets the value of the shipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShipmentID(Long value) {
        this.shipmentID = value;
    }

    /**
     * Gets the value of the postageTotal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPostageTotal() {
        return postageTotal;
    }

    /**
     * Sets the value of the postageTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPostageTotal(AmountType value) {
        this.postageTotal = value;
    }

    /**
     * Gets the value of the printedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPrintedTime() {
        return printedTime;
    }

    /**
     * Sets the value of the printedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintedTime(Calendar value) {
        this.printedTime = value;
    }

    /**
     * Gets the value of the shipFromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShipFromAddress() {
        return shipFromAddress;
    }

    /**
     * Sets the value of the shipFromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShipFromAddress(AddressType value) {
        this.shipFromAddress = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setShippingAddress(AddressType value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the shippingCarrierUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCarrierUsed() {
        return shippingCarrierUsed;
    }

    /**
     * Sets the value of the shippingCarrierUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCarrierUsed(String value) {
        this.shippingCarrierUsed = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingFeatureCodeType }
     *     
     */
    public ShippingFeatureCodeType[] getShippingFeature() {
        if (this.shippingFeature == null) {
            return new ShippingFeatureCodeType[ 0 ] ;
        }
        return ((ShippingFeatureCodeType[]) this.shippingFeature.toArray(new ShippingFeatureCodeType[this.shippingFeature.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingFeatureCodeType }
     *     
     */
    public ShippingFeatureCodeType getShippingFeature(int idx) {
        if (this.shippingFeature == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingFeature.get(idx);
    }

    public int getShippingFeatureLength() {
        if (this.shippingFeature == null) {
            return  0;
        }
        return this.shippingFeature.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingFeatureCodeType }
     *     
     */
    public void setShippingFeature(ShippingFeatureCodeType[] values) {
        this._getShippingFeature().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingFeature.add(values[i]);
        }
    }

    protected List<ShippingFeatureCodeType> _getShippingFeature() {
        if (shippingFeature == null) {
            shippingFeature = new ArrayList<ShippingFeatureCodeType>();
        }
        return shippingFeature;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingFeatureCodeType }
     *     
     */
    public ShippingFeatureCodeType setShippingFeature(int idx, ShippingFeatureCodeType value) {
        return this.shippingFeature.set(idx, value);
    }

    /**
     * Gets the value of the shippingPackage property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public ShippingPackageCodeType getShippingPackage() {
        return shippingPackage;
    }

    /**
     * Sets the value of the shippingPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPackageCodeType }
     *     
     */
    public void setShippingPackage(ShippingPackageCodeType value) {
        this.shippingPackage = value;
    }

    /**
     * Gets the value of the shippingServiceUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingServiceUsed() {
        return shippingServiceUsed;
    }

    /**
     * Sets the value of the shippingServiceUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingServiceUsed(String value) {
        this.shippingServiceUsed = value;
    }

    /**
     * Gets the value of the shipmentTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentTrackingNumber() {
        return shipmentTrackingNumber;
    }

    /**
     * Sets the value of the shipmentTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentTrackingNumber(String value) {
        this.shipmentTrackingNumber = value;
    }

    /**
     * Gets the value of the weightMajor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMajor() {
        return weightMajor;
    }

    /**
     * Sets the value of the weightMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMajor(MeasureType value) {
        this.weightMajor = value;
    }

    /**
     * Gets the value of the weightMinor property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightMinor() {
        return weightMinor;
    }

    /**
     * Sets the value of the weightMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightMinor(MeasureType value) {
        this.weightMinor = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ItemTransactionIDType }
     *     
     */
    public ItemTransactionIDType[] getItemTransactionID() {
        if (this.itemTransactionID == null) {
            return new ItemTransactionIDType[ 0 ] ;
        }
        return ((ItemTransactionIDType[]) this.itemTransactionID.toArray(new ItemTransactionIDType[this.itemTransactionID.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ItemTransactionIDType }
     *     
     */
    public ItemTransactionIDType getItemTransactionID(int idx) {
        if (this.itemTransactionID == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.itemTransactionID.get(idx);
    }

    public int getItemTransactionIDLength() {
        if (this.itemTransactionID == null) {
            return  0;
        }
        return this.itemTransactionID.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ItemTransactionIDType }
     *     
     */
    public void setItemTransactionID(ItemTransactionIDType[] values) {
        this._getItemTransactionID().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.itemTransactionID.add(values[i]);
        }
    }

    protected List<ItemTransactionIDType> _getItemTransactionID() {
        if (itemTransactionID == null) {
            itemTransactionID = new ArrayList<ItemTransactionIDType>();
        }
        return itemTransactionID;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTransactionIDType }
     *     
     */
    public ItemTransactionIDType setItemTransactionID(int idx, ItemTransactionIDType value) {
        return this.itemTransactionID.set(idx, value);
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(Calendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDeliveryStatusCodeType }
     *     
     */
    public ShipmentDeliveryStatusCodeType getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDeliveryStatusCodeType }
     *     
     */
    public void setDeliveryStatus(ShipmentDeliveryStatusCodeType value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the refundGrantedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRefundGrantedTime() {
        return refundGrantedTime;
    }

    /**
     * Sets the value of the refundGrantedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundGrantedTime(Calendar value) {
        this.refundGrantedTime = value;
    }

    /**
     * Gets the value of the refundRequestedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRefundRequestedTime() {
        return refundRequestedTime;
    }

    /**
     * Sets the value of the refundRequestedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundRequestedTime(Calendar value) {
        this.refundRequestedTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStatusCodeType }
     *     
     */
    public ShipmentStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStatusCodeType }
     *     
     */
    public void setStatus(ShipmentStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the shippedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getShippedTime() {
        return shippedTime;
    }

    /**
     * Sets the value of the shippedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippedTime(Calendar value) {
        this.shippedTime = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public ShipmentTrackingDetailsType[] getShipmentTrackingDetails() {
        if (this.shipmentTrackingDetails == null) {
            return new ShipmentTrackingDetailsType[ 0 ] ;
        }
        return ((ShipmentTrackingDetailsType[]) this.shipmentTrackingDetails.toArray(new ShipmentTrackingDetailsType[this.shipmentTrackingDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public ShipmentTrackingDetailsType getShipmentTrackingDetails(int idx) {
        if (this.shipmentTrackingDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shipmentTrackingDetails.get(idx);
    }

    public int getShipmentTrackingDetailsLength() {
        if (this.shipmentTrackingDetails == null) {
            return  0;
        }
        return this.shipmentTrackingDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public void setShipmentTrackingDetails(ShipmentTrackingDetailsType[] values) {
        this._getShipmentTrackingDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shipmentTrackingDetails.add(values[i]);
        }
    }

    protected List<ShipmentTrackingDetailsType> _getShipmentTrackingDetails() {
        if (shipmentTrackingDetails == null) {
            shipmentTrackingDetails = new ArrayList<ShipmentTrackingDetailsType>();
        }
        return shipmentTrackingDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTrackingDetailsType }
     *     
     */
    public ShipmentTrackingDetailsType setShipmentTrackingDetails(int idx, ShipmentTrackingDetailsType value) {
        return this.shipmentTrackingDetails.set(idx, value);
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
