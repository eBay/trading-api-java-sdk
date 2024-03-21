
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This is the base request type for the <b>GetAllBidders</b> call, which is used to retrieve bidders from an active or recently-ended auction listing.
 * 			
 * 
 * <p>Java class for GetAllBiddersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAllBiddersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *         &lt;element name="CallMode" type="{urn:ebay:apis:eBLBaseComponents}GetAllBiddersModeCodeType" minOccurs="0"/>
 *         &lt;element name="IncludeBiddingSummary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllBiddersRequestType", propOrder = {
    "itemID",
    "callMode",
    "includeBiddingSummary"
})
public class GetAllBiddersRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "CallMode")
    protected GetAllBiddersModeCodeType callMode;
    @XmlElement(name = "IncludeBiddingSummary")
    protected Boolean includeBiddingSummary;

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
     * Gets the value of the callMode property.
     * 
     * @return
     *     possible object is
     *     {@link GetAllBiddersModeCodeType }
     *     
     */
    public GetAllBiddersModeCodeType getCallMode() {
        return callMode;
    }

    /**
     * Sets the value of the callMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllBiddersModeCodeType }
     *     
     */
    public void setCallMode(GetAllBiddersModeCodeType value) {
        this.callMode = value;
    }

    /**
     * Gets the value of the includeBiddingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeBiddingSummary() {
        return includeBiddingSummary;
    }

    /**
     * Sets the value of the includeBiddingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeBiddingSummary(Boolean value) {
        this.includeBiddingSummary = value;
    }

}
