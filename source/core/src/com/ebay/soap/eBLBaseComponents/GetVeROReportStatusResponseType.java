
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Base response of the <strong>GetVeROReportStatus</strong> call. This response contains status information for items reported by the VeRO Program member.
 * 			
 * 
 * <p>Java class for GetVeROReportStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVeROReportStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *         &lt;element name="HasMoreItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VeROReportPacketID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VeROReportPacketStatus" type="{urn:ebay:apis:eBLBaseComponents}VeROReportPacketStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ReportedItemDetails" type="{urn:ebay:apis:eBLBaseComponents}VeROReportedItemDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVeROReportStatusResponseType", propOrder = {
    "paginationResult",
    "hasMoreItems",
    "itemsPerPage",
    "pageNumber",
    "veROReportPacketID",
    "veROReportPacketStatus",
    "reportedItemDetails"
})
public class GetVeROReportStatusResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;
    @XmlElement(name = "HasMoreItems")
    protected Boolean hasMoreItems;
    @XmlElement(name = "ItemsPerPage")
    protected Integer itemsPerPage;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "VeROReportPacketID")
    protected Long veROReportPacketID;
    @XmlElement(name = "VeROReportPacketStatus")
    protected VeROReportPacketStatusCodeType veROReportPacketStatus;
    @XmlElement(name = "ReportedItemDetails")
    protected VeROReportedItemDetailsType reportedItemDetails;

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

    /**
     * Gets the value of the itemsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * Sets the value of the itemsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemsPerPage(Integer value) {
        this.itemsPerPage = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the veROReportPacketID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVeROReportPacketID() {
        return veROReportPacketID;
    }

    /**
     * Sets the value of the veROReportPacketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVeROReportPacketID(Long value) {
        this.veROReportPacketID = value;
    }

    /**
     * Gets the value of the veROReportPacketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VeROReportPacketStatusCodeType }
     *     
     */
    public VeROReportPacketStatusCodeType getVeROReportPacketStatus() {
        return veROReportPacketStatus;
    }

    /**
     * Sets the value of the veROReportPacketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeROReportPacketStatusCodeType }
     *     
     */
    public void setVeROReportPacketStatus(VeROReportPacketStatusCodeType value) {
        this.veROReportPacketStatus = value;
    }

    /**
     * Gets the value of the reportedItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VeROReportedItemDetailsType }
     *     
     */
    public VeROReportedItemDetailsType getReportedItemDetails() {
        return reportedItemDetails;
    }

    /**
     * Sets the value of the reportedItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeROReportedItemDetailsType }
     *     
     */
    public void setReportedItemDetails(VeROReportedItemDetailsType value) {
        this.reportedItemDetails = value;
    }

}
