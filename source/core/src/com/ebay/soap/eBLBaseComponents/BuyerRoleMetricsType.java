
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
 * 				Type defining the <b>BuyerRoleMetrics</b> container, which consists of details relating to the eBay buyer's one-year history of leaving feedback for the seller.
 * 			
 * 
 * <p>Java class for BuyerRoleMetricsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerRoleMetricsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PositiveFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NegativeFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NeutralFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FeedbackLeftPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "BuyerRoleMetricsType", propOrder = {
    "positiveFeedbackLeftCount",
    "negativeFeedbackLeftCount",
    "neutralFeedbackLeftCount",
    "feedbackLeftPercent",
    "any"
})
public class BuyerRoleMetricsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PositiveFeedbackLeftCount")
    protected Integer positiveFeedbackLeftCount;
    @XmlElement(name = "NegativeFeedbackLeftCount")
    protected Integer negativeFeedbackLeftCount;
    @XmlElement(name = "NeutralFeedbackLeftCount")
    protected Integer neutralFeedbackLeftCount;
    @XmlElement(name = "FeedbackLeftPercent")
    protected Float feedbackLeftPercent;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the positiveFeedbackLeftCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositiveFeedbackLeftCount() {
        return positiveFeedbackLeftCount;
    }

    /**
     * Sets the value of the positiveFeedbackLeftCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositiveFeedbackLeftCount(Integer value) {
        this.positiveFeedbackLeftCount = value;
    }

    /**
     * Gets the value of the negativeFeedbackLeftCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNegativeFeedbackLeftCount() {
        return negativeFeedbackLeftCount;
    }

    /**
     * Sets the value of the negativeFeedbackLeftCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNegativeFeedbackLeftCount(Integer value) {
        this.negativeFeedbackLeftCount = value;
    }

    /**
     * Gets the value of the neutralFeedbackLeftCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNeutralFeedbackLeftCount() {
        return neutralFeedbackLeftCount;
    }

    /**
     * Sets the value of the neutralFeedbackLeftCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNeutralFeedbackLeftCount(Integer value) {
        this.neutralFeedbackLeftCount = value;
    }

    /**
     * Gets the value of the feedbackLeftPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFeedbackLeftPercent() {
        return feedbackLeftPercent;
    }

    /**
     * Sets the value of the feedbackLeftPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFeedbackLeftPercent(Float value) {
        this.feedbackLeftPercent = value;
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
