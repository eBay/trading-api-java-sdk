
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
 * 				This type is used by the <b>FeedbackDetailArray</b> container that is returned in the <b>GetFeedback</b> call. The <b>FeedbackDetailArray</b> container consists of an array of one or more Feedback entries. The Feedback entries that are returned will depend on the fields/values included in the call request.
 * 			
 * 
 * <p>Java class for FeedbackDetailArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedbackDetailArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeedbackDetail" type="{urn:ebay:apis:eBLBaseComponents}FeedbackDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackDetailArrayType", propOrder = {
    "feedbackDetail"
})
public class FeedbackDetailArrayType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FeedbackDetail")
    protected List<FeedbackDetailType> feedbackDetail;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link FeedbackDetailType }
     *     
     */
    public FeedbackDetailType[] getFeedbackDetail() {
        if (this.feedbackDetail == null) {
            return new FeedbackDetailType[ 0 ] ;
        }
        return ((FeedbackDetailType[]) this.feedbackDetail.toArray(new FeedbackDetailType[this.feedbackDetail.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link FeedbackDetailType }
     *     
     */
    public FeedbackDetailType getFeedbackDetail(int idx) {
        if (this.feedbackDetail == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.feedbackDetail.get(idx);
    }

    public int getFeedbackDetailLength() {
        if (this.feedbackDetail == null) {
            return  0;
        }
        return this.feedbackDetail.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link FeedbackDetailType }
     *     
     */
    public void setFeedbackDetail(FeedbackDetailType[] values) {
        this._getFeedbackDetail().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.feedbackDetail.add(values[i]);
        }
    }

    protected List<FeedbackDetailType> _getFeedbackDetail() {
        if (feedbackDetail == null) {
            feedbackDetail = new ArrayList<FeedbackDetailType>();
        }
        return feedbackDetail;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackDetailType }
     *     
     */
    public FeedbackDetailType setFeedbackDetail(int idx, FeedbackDetailType value) {
        return this.feedbackDetail.set(idx, value);
    }

}
