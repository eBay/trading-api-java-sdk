
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
 * 				This type is used by the <b>AdFormatLead</b> container that is returned in the <b>GetAdFormatLeads</b> call response. An <b>AdFormatLead</b> container will be returned for each user that has expressed interest in the Classified Ad listing that was specified by the seller in the <b>GetAdFormatLeads</b> call request. Each <b>AdFormatLead</b> container consists of prospective buyer contact information and other details associated with a lead for a Classified Ad listing.
 * 			
 * 
 * <p>Java class for AdFormatLeadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdFormatLeadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="BestTimeToCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubmittedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="ItemTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="MemberMessage" type="{urn:ebay:apis:eBLBaseComponents}MemberMessageExchangeArrayType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}AdFormatLeadStatusCodeType" minOccurs="0"/>
 *         &lt;element name="LeadFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ExternalEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseTimeFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradeInYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradeInMake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradeInModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinancingAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Answer1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Answer2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AdFormatLeadType", propOrder = {
    "additionalInformation",
    "address",
    "bestTimeToCall",
    "email",
    "submittedTime",
    "itemID",
    "itemTitle",
    "userID",
    "memberMessage",
    "status",
    "leadFee",
    "externalEmail",
    "purchaseTimeFrame",
    "tradeInYear",
    "tradeInMake",
    "tradeInModel",
    "financingAnswer",
    "answer1",
    "answer2",
    "any"
})
public class AdFormatLeadType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "BestTimeToCall")
    protected String bestTimeToCall;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "SubmittedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar submittedTime;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "ItemTitle")
    protected String itemTitle;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "MemberMessage")
    protected MemberMessageExchangeArrayType memberMessage;
    @XmlElement(name = "Status")
    protected AdFormatLeadStatusCodeType status;
    @XmlElement(name = "LeadFee")
    protected AmountType leadFee;
    @XmlElement(name = "ExternalEmail")
    protected String externalEmail;
    @XmlElement(name = "PurchaseTimeFrame")
    protected String purchaseTimeFrame;
    @XmlElement(name = "TradeInYear")
    protected String tradeInYear;
    @XmlElement(name = "TradeInMake")
    protected String tradeInMake;
    @XmlElement(name = "TradeInModel")
    protected String tradeInModel;
    @XmlElement(name = "FinancingAnswer")
    protected Boolean financingAnswer;
    @XmlElement(name = "Answer1")
    protected Boolean answer1;
    @XmlElement(name = "Answer2")
    protected Boolean answer2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the bestTimeToCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestTimeToCall() {
        return bestTimeToCall;
    }

    /**
     * Sets the value of the bestTimeToCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestTimeToCall(String value) {
        this.bestTimeToCall = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the submittedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSubmittedTime() {
        return submittedTime;
    }

    /**
     * Sets the value of the submittedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedTime(Calendar value) {
        this.submittedTime = value;
    }

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the itemTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * Sets the value of the itemTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the memberMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MemberMessageExchangeArrayType }
     *     
     */
    public MemberMessageExchangeArrayType getMemberMessage() {
        return memberMessage;
    }

    /**
     * Sets the value of the memberMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberMessageExchangeArrayType }
     *     
     */
    public void setMemberMessage(MemberMessageExchangeArrayType value) {
        this.memberMessage = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AdFormatLeadStatusCodeType }
     *     
     */
    public AdFormatLeadStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdFormatLeadStatusCodeType }
     *     
     */
    public void setStatus(AdFormatLeadStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the leadFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLeadFee() {
        return leadFee;
    }

    /**
     * Sets the value of the leadFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLeadFee(AmountType value) {
        this.leadFee = value;
    }

    /**
     * Gets the value of the externalEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalEmail() {
        return externalEmail;
    }

    /**
     * Sets the value of the externalEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalEmail(String value) {
        this.externalEmail = value;
    }

    /**
     * Gets the value of the purchaseTimeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseTimeFrame() {
        return purchaseTimeFrame;
    }

    /**
     * Sets the value of the purchaseTimeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseTimeFrame(String value) {
        this.purchaseTimeFrame = value;
    }

    /**
     * Gets the value of the tradeInYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInYear() {
        return tradeInYear;
    }

    /**
     * Sets the value of the tradeInYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInYear(String value) {
        this.tradeInYear = value;
    }

    /**
     * Gets the value of the tradeInMake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInMake() {
        return tradeInMake;
    }

    /**
     * Sets the value of the tradeInMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInMake(String value) {
        this.tradeInMake = value;
    }

    /**
     * Gets the value of the tradeInModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeInModel() {
        return tradeInModel;
    }

    /**
     * Sets the value of the tradeInModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeInModel(String value) {
        this.tradeInModel = value;
    }

    /**
     * Gets the value of the financingAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancingAnswer() {
        return financingAnswer;
    }

    /**
     * Sets the value of the financingAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancingAnswer(Boolean value) {
        this.financingAnswer = value;
    }

    /**
     * Gets the value of the answer1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnswer1() {
        return answer1;
    }

    /**
     * Sets the value of the answer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswer1(Boolean value) {
        this.answer1 = value;
    }

    /**
     * Gets the value of the answer2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnswer2() {
        return answer2;
    }

    /**
     * Sets the value of the answer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswer2(Boolean value) {
        this.answer2 = value;
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
