
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
 * 				Type defining the <b>MinimumFeedbackScore</b> container that is returned in <b>GeteBayDetails</b>. The <b>MinimumFeedbackScore</b> container consists of the values that can be used as the threshold value for a buyer's Minimum Feedback Score in Buyer Requirements. The Feedback Score for a potential buyer must be greater than or equal to the specified value, or that buyer is blocked from buying the item. <br/><br/> For the <b>MinimumFeedbackScore</b> container to appear in the <b>GeteBayDetails</b> response, <b>BuyerRequirementDetails</b> must be one of the values passed into the <b>DetailName</b> field in the <b>GeteBayDetails</b> request (or, no  <b>DetailName</b> filters should be used).
 * 				<br><br>
 * 				<span class="tablenote"><b>Note:</b> Although the <b>MinimumFeedbackScore</b> container is still returned in <b>GeteBayDetails</b>, sellers can no longer set a buyer's Minimum Feedback Score threshold Buyer Requirement at the listing-level in Add/Revise/Relist calls.
 * 				</span>
 * 			
 * 
 * <p>Java class for MinimumFeedbackScoreDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinimumFeedbackScoreDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MinimumFeedbackScoreDetailsType", propOrder = {
    "feedbackScore",
    "any"
})
public class MinimumFeedbackScoreDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FeedbackScore", type = Integer.class)
    protected List<Integer> feedbackScore;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Integer }
     *     
     */
    public int[] getFeedbackScore() {
        if (this.feedbackScore == null) {
            return new int[ 0 ] ;
        }
        int[] r = new int[this.feedbackScore.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.feedbackScore.get(__i).intValue();
        }
        return r;
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Integer }
     *     
     */
    public int getFeedbackScore(int idx) {
        if (this.feedbackScore == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.feedbackScore.get(idx).intValue();
    }

    public int getFeedbackScoreLength() {
        if (this.feedbackScore == null) {
            return  0;
        }
        return this.feedbackScore.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Integer }
     *     
     */
    public void setFeedbackScore(int[] values) {
        this._getFeedbackScore().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.feedbackScore.add(new Integer(values[i]));
        }
    }

    protected List<Integer> _getFeedbackScore() {
        if (feedbackScore == null) {
            feedbackScore = new ArrayList<Integer>();
        }
        return feedbackScore;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public int setFeedbackScore(int idx, int value) {
        return this.feedbackScore.set(idx, new Integer(value)).intValue();
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
