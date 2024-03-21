
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Container for a set of feedback statistics. Contains zero one or
 * 				multiple FeedbackPeriod objects. Output only, for the summary
 * 				feedback data returned by GetFeedback.
 * 			
 * 
 * <p>Java class for FeedbackPeriodArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackPeriodArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeedbackPeriod" type="{urn:ebay:apis:eBLBaseComponents}FeedbackPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackPeriodArrayType", propOrder = {
    "feedbackPeriod"
})
public class FeedbackPeriodArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FeedbackPeriod")
    protected List<FeedbackPeriodType> feedbackPeriod;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link FeedbackPeriodType }
     *     
     */
    public FeedbackPeriodType[] getFeedbackPeriod() {
        if (this.feedbackPeriod == null) {
            return new FeedbackPeriodType[ 0 ] ;
        }
        return ((FeedbackPeriodType[]) this.feedbackPeriod.toArray(new FeedbackPeriodType[this.feedbackPeriod.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link FeedbackPeriodType }
     *     
     */
    public FeedbackPeriodType getFeedbackPeriod(int idx) {
        if (this.feedbackPeriod == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.feedbackPeriod.get(idx);
    }

    public int getFeedbackPeriodLength() {
        if (this.feedbackPeriod == null) {
            return  0;
        }
        return this.feedbackPeriod.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link FeedbackPeriodType }
     *     
     */
    public void setFeedbackPeriod(FeedbackPeriodType[] values) {
        this._getFeedbackPeriod().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.feedbackPeriod.add(values[i]);
        }
    }

    protected List<FeedbackPeriodType> _getFeedbackPeriod() {
        if (feedbackPeriod == null) {
            feedbackPeriod = new ArrayList<FeedbackPeriodType>();
        }
        return feedbackPeriod;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackPeriodType }
     *     
     */
    public FeedbackPeriodType setFeedbackPeriod(int idx, FeedbackPeriodType value) {
        return this.feedbackPeriod.set(idx, value);
    }

}
