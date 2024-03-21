
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 				This type is used by the <b>AverageRatingSummary</b> container that is returned in the <b>GetFeedback</b> call to display the seller's rating information across the four different Detail Seller Rating areas. The Detail Seller Rating subject areas include Item as Described, Communication, Shipping Time, and Shipping and Handling charges.
 * 			
 * 
 * <p>Java class for AverageRatingSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AverageRatingSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeedbackSummaryPeriod" type="{urn:ebay:apis:eBLBaseComponents}FeedbackSummaryPeriodCodeType" minOccurs="0"/>
 *         &lt;element name="AverageRatingDetails" type="{urn:ebay:apis:eBLBaseComponents}AverageRatingDetailsType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AverageRatingSummaryType", propOrder = {
    "feedbackSummaryPeriod",
    "averageRatingDetails",
    "any"
})
public class AverageRatingSummaryType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FeedbackSummaryPeriod")
    protected FeedbackSummaryPeriodCodeType feedbackSummaryPeriod;
    @XmlElement(name = "AverageRatingDetails")
    protected List<AverageRatingDetailsType> averageRatingDetails;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the feedbackSummaryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackSummaryPeriodCodeType }
     *     
     */
    public FeedbackSummaryPeriodCodeType getFeedbackSummaryPeriod() {
        return feedbackSummaryPeriod;
    }

    /**
     * Sets the value of the feedbackSummaryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackSummaryPeriodCodeType }
     *     
     */
    public void setFeedbackSummaryPeriod(FeedbackSummaryPeriodCodeType value) {
        this.feedbackSummaryPeriod = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link AverageRatingDetailsType }
     *     
     */
    public AverageRatingDetailsType[] getAverageRatingDetails() {
        if (this.averageRatingDetails == null) {
            return new AverageRatingDetailsType[ 0 ] ;
        }
        return ((AverageRatingDetailsType[]) this.averageRatingDetails.toArray(new AverageRatingDetailsType[this.averageRatingDetails.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link AverageRatingDetailsType }
     *     
     */
    public AverageRatingDetailsType getAverageRatingDetails(int idx) {
        if (this.averageRatingDetails == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.averageRatingDetails.get(idx);
    }

    public int getAverageRatingDetailsLength() {
        if (this.averageRatingDetails == null) {
            return  0;
        }
        return this.averageRatingDetails.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link AverageRatingDetailsType }
     *     
     */
    public void setAverageRatingDetails(AverageRatingDetailsType[] values) {
        this._getAverageRatingDetails().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.averageRatingDetails.add(values[i]);
        }
    }

    protected List<AverageRatingDetailsType> _getAverageRatingDetails() {
        if (averageRatingDetails == null) {
            averageRatingDetails = new ArrayList<AverageRatingDetailsType>();
        }
        return averageRatingDetails;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link AverageRatingDetailsType }
     *     
     */
    public AverageRatingDetailsType setAverageRatingDetails(int idx, AverageRatingDetailsType value) {
        return this.averageRatingDetails.set(idx, value);
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
