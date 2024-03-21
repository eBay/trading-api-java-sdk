
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Retrieves a list of the messages buyers have posted about your active item listings.
 * 			
 * 
 * <p>Java class for GetMemberMessagesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMemberMessagesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="MemberMessage" type="{urn:ebay:apis:eBLBaseComponents}MemberMessageExchangeArrayType" minOccurs="0"/>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *         &lt;element name="HasMoreItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMemberMessagesResponseType", propOrder = {
    "memberMessage",
    "paginationResult",
    "hasMoreItems"
})
public class GetMemberMessagesResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MemberMessage")
    protected MemberMessageExchangeArrayType memberMessage;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;
    @XmlElement(name = "HasMoreItems")
    protected Boolean hasMoreItems;

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
     * Gets the value of the paginationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationResultType }
     *     
     */
    public PaginationResultType getPaginationResult() {
        return paginationResult;
    }

    /**
     * Sets the value of the paginationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationResultType }
     *     
     */
    public void setPaginationResult(PaginationResultType value) {
        this.paginationResult = value;
    }

    /**
     * Gets the value of the hasMoreItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreItems() {
        return hasMoreItems;
    }

    /**
     * Sets the value of the hasMoreItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreItems(Boolean value) {
        this.hasMoreItems = value;
    }

}
