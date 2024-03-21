
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
 * 				Type defining the <b>BuyerRequirementDetails</b> container, which is returned in <b>GeteBayDetails</b>, and provides the seller with the buyer requirement features (and applicable values) that are supported by the listing site.
 * 				<br/><br/>
 * 				<span class="tablenote"><b>Note: </b>
 * 				This container is only returned if <b>BuyerRequirementDetails</b> is included as a <b>DetailName</b>
 * 				filter in the call request, or if no <b>DetailName</b> filters are used in the request.
 * 				</span>
 * 			
 * 
 * <p>Java class for SiteBuyerRequirementDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteBuyerRequirementDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkedPayPalAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumBuyerPolicyViolations" type="{urn:ebay:apis:eBLBaseComponents}MaximumBuyerPolicyViolationsDetailsType" minOccurs="0"/>
 *         &lt;element name="MaximumItemRequirements" type="{urn:ebay:apis:eBLBaseComponents}MaximumItemRequirementsDetailsType" minOccurs="0"/>
 *         &lt;element name="MaximumUnpaidItemStrikesInfo" type="{urn:ebay:apis:eBLBaseComponents}MaximumUnpaidItemStrikesInfoDetailsType" minOccurs="0"/>
 *         &lt;element name="MinimumFeedbackScore" type="{urn:ebay:apis:eBLBaseComponents}MinimumFeedbackScoreDetailsType" minOccurs="0"/>
 *         &lt;element name="ShipToRegistrationCountry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VerifiedUserRequirements" type="{urn:ebay:apis:eBLBaseComponents}VerifiedUserRequirementsDetailsType" minOccurs="0"/>
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
@XmlType(name = "SiteBuyerRequirementDetailsType", propOrder = {
    "linkedPayPalAccount",
    "maximumBuyerPolicyViolations",
    "maximumItemRequirements",
    "maximumUnpaidItemStrikesInfo",
    "minimumFeedbackScore",
    "shipToRegistrationCountry",
    "verifiedUserRequirements",
    "detailVersion",
    "updateTime",
    "any"
})
public class SiteBuyerRequirementDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "LinkedPayPalAccount")
    protected Boolean linkedPayPalAccount;
    @XmlElement(name = "MaximumBuyerPolicyViolations")
    protected MaximumBuyerPolicyViolationsDetailsType maximumBuyerPolicyViolations;
    @XmlElement(name = "MaximumItemRequirements")
    protected MaximumItemRequirementsDetailsType maximumItemRequirements;
    @XmlElement(name = "MaximumUnpaidItemStrikesInfo")
    protected MaximumUnpaidItemStrikesInfoDetailsType maximumUnpaidItemStrikesInfo;
    @XmlElement(name = "MinimumFeedbackScore")
    protected MinimumFeedbackScoreDetailsType minimumFeedbackScore;
    @XmlElement(name = "ShipToRegistrationCountry")
    protected Boolean shipToRegistrationCountry;
    @XmlElement(name = "VerifiedUserRequirements")
    protected VerifiedUserRequirementsDetailsType verifiedUserRequirements;
    @XmlElement(name = "DetailVersion")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar updateTime;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the linkedPayPalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkedPayPalAccount() {
        return linkedPayPalAccount;
    }

    /**
     * Sets the value of the linkedPayPalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkedPayPalAccount(Boolean value) {
        this.linkedPayPalAccount = value;
    }

    /**
     * Gets the value of the maximumBuyerPolicyViolations property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumBuyerPolicyViolationsDetailsType }
     *     
     */
    public MaximumBuyerPolicyViolationsDetailsType getMaximumBuyerPolicyViolations() {
        return maximumBuyerPolicyViolations;
    }

    /**
     * Sets the value of the maximumBuyerPolicyViolations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumBuyerPolicyViolationsDetailsType }
     *     
     */
    public void setMaximumBuyerPolicyViolations(MaximumBuyerPolicyViolationsDetailsType value) {
        this.maximumBuyerPolicyViolations = value;
    }

    /**
     * Gets the value of the maximumItemRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumItemRequirementsDetailsType }
     *     
     */
    public MaximumItemRequirementsDetailsType getMaximumItemRequirements() {
        return maximumItemRequirements;
    }

    /**
     * Sets the value of the maximumItemRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumItemRequirementsDetailsType }
     *     
     */
    public void setMaximumItemRequirements(MaximumItemRequirementsDetailsType value) {
        this.maximumItemRequirements = value;
    }

    /**
     * Gets the value of the maximumUnpaidItemStrikesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumUnpaidItemStrikesInfoDetailsType }
     *     
     */
    public MaximumUnpaidItemStrikesInfoDetailsType getMaximumUnpaidItemStrikesInfo() {
        return maximumUnpaidItemStrikesInfo;
    }

    /**
     * Sets the value of the maximumUnpaidItemStrikesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumUnpaidItemStrikesInfoDetailsType }
     *     
     */
    public void setMaximumUnpaidItemStrikesInfo(MaximumUnpaidItemStrikesInfoDetailsType value) {
        this.maximumUnpaidItemStrikesInfo = value;
    }

    /**
     * Gets the value of the minimumFeedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumFeedbackScoreDetailsType }
     *     
     */
    public MinimumFeedbackScoreDetailsType getMinimumFeedbackScore() {
        return minimumFeedbackScore;
    }

    /**
     * Sets the value of the minimumFeedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumFeedbackScoreDetailsType }
     *     
     */
    public void setMinimumFeedbackScore(MinimumFeedbackScoreDetailsType value) {
        this.minimumFeedbackScore = value;
    }

    /**
     * Gets the value of the shipToRegistrationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipToRegistrationCountry() {
        return shipToRegistrationCountry;
    }

    /**
     * Sets the value of the shipToRegistrationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipToRegistrationCountry(Boolean value) {
        this.shipToRegistrationCountry = value;
    }

    /**
     * Gets the value of the verifiedUserRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link VerifiedUserRequirementsDetailsType }
     *     
     */
    public VerifiedUserRequirementsDetailsType getVerifiedUserRequirements() {
        return verifiedUserRequirements;
    }

    /**
     * Sets the value of the verifiedUserRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifiedUserRequirementsDetailsType }
     *     
     */
    public void setVerifiedUserRequirements(VerifiedUserRequirementsDetailsType value) {
        this.verifiedUserRequirements = value;
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
