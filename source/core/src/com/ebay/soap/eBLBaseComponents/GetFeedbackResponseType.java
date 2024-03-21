
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The <b>GetFeedback</b> response contains the feedback summary if a <b>TransactionID</b> or <b>ItemID</b> is specified, and contains the specified user's total feedback score and feedback summary data if a <b>UserID</b> is specified. If no value is supplied, the feedback score and feedback summary for the requesting user will be returned.
 * 				<br>
 * 				If a detail level value of <b>ReturnAll</b> is specified, an array of all feedback records will be returned.
 * 			
 * 
 * <p>Java class for GetFeedbackResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFeedbackResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="FeedbackDetailArray" type="{urn:ebay:apis:eBLBaseComponents}FeedbackDetailArrayType" minOccurs="0"/>
 *         &lt;element name="FeedbackDetailItemTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FeedbackSummary" type="{urn:ebay:apis:eBLBaseComponents}FeedbackSummaryType" minOccurs="0"/>
 *         &lt;element name="FeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaginationResult" type="{urn:ebay:apis:eBLBaseComponents}PaginationResultType" minOccurs="0"/>
 *         &lt;element name="EntriesPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFeedbackResponseType", propOrder = {
    "feedbackDetailArray",
    "feedbackDetailItemTotal",
    "feedbackSummary",
    "feedbackScore",
    "paginationResult",
    "entriesPerPage",
    "pageNumber"
})
public class GetFeedbackResponseType
    extends AbstractResponseType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FeedbackDetailArray")
    protected FeedbackDetailArrayType feedbackDetailArray;
    @XmlElement(name = "FeedbackDetailItemTotal")
    protected Integer feedbackDetailItemTotal;
    @XmlElement(name = "FeedbackSummary")
    protected FeedbackSummaryType feedbackSummary;
    @XmlElement(name = "FeedbackScore")
    protected Integer feedbackScore;
    @XmlElement(name = "PaginationResult")
    protected PaginationResultType paginationResult;
    @XmlElement(name = "EntriesPerPage")
    protected Integer entriesPerPage;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;

    /**
     * Gets the value of the feedbackDetailArray property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackDetailArrayType }
     *     
     */
    public FeedbackDetailArrayType getFeedbackDetailArray() {
        return feedbackDetailArray;
    }

    /**
     * Sets the value of the feedbackDetailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackDetailArrayType }
     *     
     */
    public void setFeedbackDetailArray(FeedbackDetailArrayType value) {
        this.feedbackDetailArray = value;
    }

    /**
     * Gets the value of the feedbackDetailItemTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeedbackDetailItemTotal() {
        return feedbackDetailItemTotal;
    }

    /**
     * Sets the value of the feedbackDetailItemTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeedbackDetailItemTotal(Integer value) {
        this.feedbackDetailItemTotal = value;
    }

    /**
     * Gets the value of the feedbackSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackSummaryType }
     *     
     */
    public FeedbackSummaryType getFeedbackSummary() {
        return feedbackSummary;
    }

    /**
     * Sets the value of the feedbackSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackSummaryType }
     *     
     */
    public void setFeedbackSummary(FeedbackSummaryType value) {
        this.feedbackSummary = value;
    }

    /**
     * Gets the value of the feedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeedbackScore() {
        return feedbackScore;
    }

    /**
     * Sets the value of the feedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeedbackScore(Integer value) {
        this.feedbackScore = value;
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
     * Gets the value of the entriesPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntriesPerPage() {
        return entriesPerPage;
    }

    /**
     * Sets the value of the entriesPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntriesPerPage(Integer value) {
        this.entriesPerPage = value;
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

}
