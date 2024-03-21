
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
 * 				This type is used by the <b>MaximumItemRequirements</b> container that is returned under the <b>BuyerRequirementDetails</b> in the <b>GeteBayDetails</b>. The Maximum Item Requirement settings of Buyer Requirements allow a seller to restrict the quantity of a line item that may be purchased during a consecutive 10-day period.
 * 			
 * 
 * <p>Java class for MaximumItemRequirementsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumItemRequirementsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumItemCount" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MinimumFeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "MaximumItemRequirementsDetailsType", propOrder = {
    "maximumItemCount",
    "minimumFeedbackScore",
    "any"
})
public class MaximumItemRequirementsDetailsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MaximumItemCount", type = Integer.class)
    protected List<Integer> maximumItemCount;
    @XmlElement(name = "MinimumFeedbackScore", type = Integer.class)
    protected List<Integer> minimumFeedbackScore;
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
    public int[] getMaximumItemCount() {
        if (this.maximumItemCount == null) {
            return new int[ 0 ] ;
        }
        int[] r = new int[this.maximumItemCount.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.maximumItemCount.get(__i).intValue();
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
    public int getMaximumItemCount(int idx) {
        if (this.maximumItemCount == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.maximumItemCount.get(idx).intValue();
    }

    public int getMaximumItemCountLength() {
        if (this.maximumItemCount == null) {
            return  0;
        }
        return this.maximumItemCount.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Integer }
     *     
     */
    public void setMaximumItemCount(int[] values) {
        this._getMaximumItemCount().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.maximumItemCount.add(new Integer(values[i]));
        }
    }

    protected List<Integer> _getMaximumItemCount() {
        if (maximumItemCount == null) {
            maximumItemCount = new ArrayList<Integer>();
        }
        return maximumItemCount;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public int setMaximumItemCount(int idx, int value) {
        return this.maximumItemCount.set(idx, new Integer(value)).intValue();
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Integer }
     *     
     */
    public int[] getMinimumFeedbackScore() {
        if (this.minimumFeedbackScore == null) {
            return new int[ 0 ] ;
        }
        int[] r = new int[this.minimumFeedbackScore.size()] ;
        for (int __i = 0; (__i<r.length); __i ++) {
            r[__i] = this.minimumFeedbackScore.get(__i).intValue();
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
    public int getMinimumFeedbackScore(int idx) {
        if (this.minimumFeedbackScore == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.minimumFeedbackScore.get(idx).intValue();
    }

    public int getMinimumFeedbackScoreLength() {
        if (this.minimumFeedbackScore == null) {
            return  0;
        }
        return this.minimumFeedbackScore.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Integer }
     *     
     */
    public void setMinimumFeedbackScore(int[] values) {
        this._getMinimumFeedbackScore().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.minimumFeedbackScore.add(new Integer(values[i]));
        }
    }

    protected List<Integer> _getMinimumFeedbackScore() {
        if (minimumFeedbackScore == null) {
            minimumFeedbackScore = new ArrayList<Integer>();
        }
        return minimumFeedbackScore;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public int setMinimumFeedbackScore(int idx, int value) {
        return this.minimumFeedbackScore.set(idx, new Integer(value)).intValue();
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
