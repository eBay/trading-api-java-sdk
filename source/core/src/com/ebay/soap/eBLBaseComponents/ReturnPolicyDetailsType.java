
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
 * 				Type defining the <b>ReturnPolicyDetails</b> container, which is returned in <b>GeteBayDetails</b>, and provides the seller with the Return Policy features (and applicable values) that are supported by the listing site. This container is only returned if <b>ReturnPolicyDetails</b> is included as a <b>DetailName</b>
 * 				filter in the call request, or if no <b>DetailName</b> filters are used in the request.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note: </b>
 * 					The <b>GeteBayDetails</b> call returns site-default Return Policy settings. For most categories within a given eBay site, the supported Return Policy options/values are the same, but there a few exceptions. To discover what Return Policy features/settings that a particular category supports, call <b>GetCategoryFeatures</b> and include any or all of the domestic and or international Return Policy-related <b>FeatureID</b> values to see the Return Policy features/settings available for domestic and international returns, respectively.
 * 				</span>
 * 			
 * 
 * <p>Java class for ReturnPolicyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnPolicyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Refund" type="{urn:ebay:apis:eBLBaseComponents}RefundDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnsWithin" type="{urn:ebay:apis:eBLBaseComponents}ReturnsWithinDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnsAccepted" type="{urn:ebay:apis:eBLBaseComponents}ReturnsAcceptedDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarrantyOffered" type="{urn:ebay:apis:eBLBaseComponents}WarrantyOfferedDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WarrantyType" type="{urn:ebay:apis:eBLBaseComponents}WarrantyTypeDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WarrantyDuration" type="{urn:ebay:apis:eBLBaseComponents}WarrantyDurationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingCostPaidBy" type="{urn:ebay:apis:eBLBaseComponents}ShippingCostPaidByDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RestockingFeeValue" type="{urn:ebay:apis:eBLBaseComponents}RestockingFeeValueDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ReturnPolicyDetailsType", propOrder = {
    "refund",
    "returnsWithin",
    "returnsAccepted",
    "description",
    "warrantyOffered",
    "warrantyType",
    "warrantyDuration",
    "ean",
    "shippingCostPaidBy",
    "restockingFeeValue",
    "detailVersion",
    "updateTime",
    "any"
})
public class ReturnPolicyDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Refund")
    protected List<RefundDetailsType> refund;
    @XmlElement(name = "ReturnsWithin")
    protected List<ReturnsWithinDetailsType> returnsWithin;
    @XmlElement(name = "ReturnsAccepted")
    protected List<ReturnsAcceptedDetailsType> returnsAccepted;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "WarrantyOffered")
    protected List<WarrantyOfferedDetailsType> warrantyOffered;
    @XmlElement(name = "WarrantyType")
    protected List<WarrantyTypeDetailsType> warrantyType;
    @XmlElement(name = "WarrantyDuration")
    protected List<WarrantyDurationDetailsType> warrantyDuration;
    @XmlElement(name = "EAN")
    protected Boolean ean;
    @XmlElement(name = "ShippingCostPaidBy")
    protected List<ShippingCostPaidByDetailsType> shippingCostPaidBy;
    @XmlElement(name = "RestockingFeeValue")
    protected List<RestockingFeeValueDetailsType> restockingFeeValue;
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
     *     {@link RefundDetailsType }
     *     
     */
    public RefundDetailsType[] getRefund() {
        if (this.refund == null) {
            return new RefundDetailsType[ 0 ] ;
        }
        return ((RefundDetailsType[]) this.refund.toArray(new RefundDetailsType[this.refund.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RefundDetailsType }
     *     
     */
    public RefundDetailsType getRefund(int idx) {
        if (this.refund == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.refund.get(idx);
    }

    public int getRefundLength() {
        if (this.refund == null) {
            return  0;
        }
        return this.refund.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RefundDetailsType }
     *     
     */
    public void setRefund(RefundDetailsType[] values) {
        this._getRefund().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.refund.add(values[i]);
        }
    }

    protected List<RefundDetailsType> _getRefund() {
        if (refund == null) {
            refund = new ArrayList<RefundDetailsType>();
        }
        return refund;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RefundDetailsType }
     *     
     */
    public RefundDetailsType setRefund(int idx, RefundDetailsType value) {
        return this.refund.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ReturnsWithinDetailsType }
     *     
     */
    public ReturnsWithinDetailsType[] getReturnsWithin() {
        if (this.returnsWithin == null) {
            return new ReturnsWithinDetailsType[ 0 ] ;
        }
        return ((ReturnsWithinDetailsType[]) this.returnsWithin.toArray(new ReturnsWithinDetailsType[this.returnsWithin.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReturnsWithinDetailsType }
     *     
     */
    public ReturnsWithinDetailsType getReturnsWithin(int idx) {
        if (this.returnsWithin == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.returnsWithin.get(idx);
    }

    public int getReturnsWithinLength() {
        if (this.returnsWithin == null) {
            return  0;
        }
        return this.returnsWithin.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReturnsWithinDetailsType }
     *     
     */
    public void setReturnsWithin(ReturnsWithinDetailsType[] values) {
        this._getReturnsWithin().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.returnsWithin.add(values[i]);
        }
    }

    protected List<ReturnsWithinDetailsType> _getReturnsWithin() {
        if (returnsWithin == null) {
            returnsWithin = new ArrayList<ReturnsWithinDetailsType>();
        }
        return returnsWithin;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsWithinDetailsType }
     *     
     */
    public ReturnsWithinDetailsType setReturnsWithin(int idx, ReturnsWithinDetailsType value) {
        return this.returnsWithin.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ReturnsAcceptedDetailsType }
     *     
     */
    public ReturnsAcceptedDetailsType[] getReturnsAccepted() {
        if (this.returnsAccepted == null) {
            return new ReturnsAcceptedDetailsType[ 0 ] ;
        }
        return ((ReturnsAcceptedDetailsType[]) this.returnsAccepted.toArray(new ReturnsAcceptedDetailsType[this.returnsAccepted.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReturnsAcceptedDetailsType }
     *     
     */
    public ReturnsAcceptedDetailsType getReturnsAccepted(int idx) {
        if (this.returnsAccepted == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.returnsAccepted.get(idx);
    }

    public int getReturnsAcceptedLength() {
        if (this.returnsAccepted == null) {
            return  0;
        }
        return this.returnsAccepted.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReturnsAcceptedDetailsType }
     *     
     */
    public void setReturnsAccepted(ReturnsAcceptedDetailsType[] values) {
        this._getReturnsAccepted().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.returnsAccepted.add(values[i]);
        }
    }

    protected List<ReturnsAcceptedDetailsType> _getReturnsAccepted() {
        if (returnsAccepted == null) {
            returnsAccepted = new ArrayList<ReturnsAcceptedDetailsType>();
        }
        return returnsAccepted;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsAcceptedDetailsType }
     *     
     */
    public ReturnsAcceptedDetailsType setReturnsAccepted(int idx, ReturnsAcceptedDetailsType value) {
        return this.returnsAccepted.set(idx, value);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link WarrantyOfferedDetailsType }
     *     
     */
    public WarrantyOfferedDetailsType[] getWarrantyOffered() {
        if (this.warrantyOffered == null) {
            return new WarrantyOfferedDetailsType[ 0 ] ;
        }
        return ((WarrantyOfferedDetailsType[]) this.warrantyOffered.toArray(new WarrantyOfferedDetailsType[this.warrantyOffered.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link WarrantyOfferedDetailsType }
     *     
     */
    public WarrantyOfferedDetailsType getWarrantyOffered(int idx) {
        if (this.warrantyOffered == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.warrantyOffered.get(idx);
    }

    public int getWarrantyOfferedLength() {
        if (this.warrantyOffered == null) {
            return  0;
        }
        return this.warrantyOffered.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link WarrantyOfferedDetailsType }
     *     
     */
    public void setWarrantyOffered(WarrantyOfferedDetailsType[] values) {
        this._getWarrantyOffered().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.warrantyOffered.add(values[i]);
        }
    }

    protected List<WarrantyOfferedDetailsType> _getWarrantyOffered() {
        if (warrantyOffered == null) {
            warrantyOffered = new ArrayList<WarrantyOfferedDetailsType>();
        }
        return warrantyOffered;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyOfferedDetailsType }
     *     
     */
    public WarrantyOfferedDetailsType setWarrantyOffered(int idx, WarrantyOfferedDetailsType value) {
        return this.warrantyOffered.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link WarrantyTypeDetailsType }
     *     
     */
    public WarrantyTypeDetailsType[] getWarrantyType() {
        if (this.warrantyType == null) {
            return new WarrantyTypeDetailsType[ 0 ] ;
        }
        return ((WarrantyTypeDetailsType[]) this.warrantyType.toArray(new WarrantyTypeDetailsType[this.warrantyType.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link WarrantyTypeDetailsType }
     *     
     */
    public WarrantyTypeDetailsType getWarrantyType(int idx) {
        if (this.warrantyType == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.warrantyType.get(idx);
    }

    public int getWarrantyTypeLength() {
        if (this.warrantyType == null) {
            return  0;
        }
        return this.warrantyType.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link WarrantyTypeDetailsType }
     *     
     */
    public void setWarrantyType(WarrantyTypeDetailsType[] values) {
        this._getWarrantyType().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.warrantyType.add(values[i]);
        }
    }

    protected List<WarrantyTypeDetailsType> _getWarrantyType() {
        if (warrantyType == null) {
            warrantyType = new ArrayList<WarrantyTypeDetailsType>();
        }
        return warrantyType;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyTypeDetailsType }
     *     
     */
    public WarrantyTypeDetailsType setWarrantyType(int idx, WarrantyTypeDetailsType value) {
        return this.warrantyType.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link WarrantyDurationDetailsType }
     *     
     */
    public WarrantyDurationDetailsType[] getWarrantyDuration() {
        if (this.warrantyDuration == null) {
            return new WarrantyDurationDetailsType[ 0 ] ;
        }
        return ((WarrantyDurationDetailsType[]) this.warrantyDuration.toArray(new WarrantyDurationDetailsType[this.warrantyDuration.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link WarrantyDurationDetailsType }
     *     
     */
    public WarrantyDurationDetailsType getWarrantyDuration(int idx) {
        if (this.warrantyDuration == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.warrantyDuration.get(idx);
    }

    public int getWarrantyDurationLength() {
        if (this.warrantyDuration == null) {
            return  0;
        }
        return this.warrantyDuration.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link WarrantyDurationDetailsType }
     *     
     */
    public void setWarrantyDuration(WarrantyDurationDetailsType[] values) {
        this._getWarrantyDuration().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.warrantyDuration.add(values[i]);
        }
    }

    protected List<WarrantyDurationDetailsType> _getWarrantyDuration() {
        if (warrantyDuration == null) {
            warrantyDuration = new ArrayList<WarrantyDurationDetailsType>();
        }
        return warrantyDuration;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyDurationDetailsType }
     *     
     */
    public WarrantyDurationDetailsType setWarrantyDuration(int idx, WarrantyDurationDetailsType value) {
        return this.warrantyDuration.set(idx, value);
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEAN(Boolean value) {
        this.ean = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ShippingCostPaidByDetailsType }
     *     
     */
    public ShippingCostPaidByDetailsType[] getShippingCostPaidBy() {
        if (this.shippingCostPaidBy == null) {
            return new ShippingCostPaidByDetailsType[ 0 ] ;
        }
        return ((ShippingCostPaidByDetailsType[]) this.shippingCostPaidBy.toArray(new ShippingCostPaidByDetailsType[this.shippingCostPaidBy.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ShippingCostPaidByDetailsType }
     *     
     */
    public ShippingCostPaidByDetailsType getShippingCostPaidBy(int idx) {
        if (this.shippingCostPaidBy == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.shippingCostPaidBy.get(idx);
    }

    public int getShippingCostPaidByLength() {
        if (this.shippingCostPaidBy == null) {
            return  0;
        }
        return this.shippingCostPaidBy.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ShippingCostPaidByDetailsType }
     *     
     */
    public void setShippingCostPaidBy(ShippingCostPaidByDetailsType[] values) {
        this._getShippingCostPaidBy().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.shippingCostPaidBy.add(values[i]);
        }
    }

    protected List<ShippingCostPaidByDetailsType> _getShippingCostPaidBy() {
        if (shippingCostPaidBy == null) {
            shippingCostPaidBy = new ArrayList<ShippingCostPaidByDetailsType>();
        }
        return shippingCostPaidBy;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCostPaidByDetailsType }
     *     
     */
    public ShippingCostPaidByDetailsType setShippingCostPaidBy(int idx, ShippingCostPaidByDetailsType value) {
        return this.shippingCostPaidBy.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link RestockingFeeValueDetailsType }
     *     
     */
    public RestockingFeeValueDetailsType[] getRestockingFeeValue() {
        if (this.restockingFeeValue == null) {
            return new RestockingFeeValueDetailsType[ 0 ] ;
        }
        return ((RestockingFeeValueDetailsType[]) this.restockingFeeValue.toArray(new RestockingFeeValueDetailsType[this.restockingFeeValue.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link RestockingFeeValueDetailsType }
     *     
     */
    public RestockingFeeValueDetailsType getRestockingFeeValue(int idx) {
        if (this.restockingFeeValue == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.restockingFeeValue.get(idx);
    }

    public int getRestockingFeeValueLength() {
        if (this.restockingFeeValue == null) {
            return  0;
        }
        return this.restockingFeeValue.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link RestockingFeeValueDetailsType }
     *     
     */
    public void setRestockingFeeValue(RestockingFeeValueDetailsType[] values) {
        this._getRestockingFeeValue().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.restockingFeeValue.add(values[i]);
        }
    }

    protected List<RestockingFeeValueDetailsType> _getRestockingFeeValue() {
        if (restockingFeeValue == null) {
            restockingFeeValue = new ArrayList<RestockingFeeValueDetailsType>();
        }
        return restockingFeeValue;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link RestockingFeeValueDetailsType }
     *     
     */
    public RestockingFeeValueDetailsType setRestockingFeeValue(int idx, RestockingFeeValueDetailsType value) {
        return this.restockingFeeValue.set(idx, value);
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
