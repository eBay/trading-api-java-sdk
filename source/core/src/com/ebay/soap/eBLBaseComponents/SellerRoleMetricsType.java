
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
 * 				Specifies 1 year feedback metrics for a seller.
 * 			
 * 
 * <p>Java class for SellerRoleMetricsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerRoleMetricsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PositiveFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NegativeFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NeutralFeedbackLeftCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FeedbackLeftPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="RepeatBuyerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RepeatBuyerPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="UniqueBuyerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransactionPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="CrossBorderTransactionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CrossBorderTransactionPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "SellerRoleMetricsType", propOrder = {
    "positiveFeedbackLeftCount",
    "negativeFeedbackLeftCount",
    "neutralFeedbackLeftCount",
    "feedbackLeftPercent",
    "repeatBuyerCount",
    "repeatBuyerPercent",
    "uniqueBuyerCount",
    "transactionPercent",
    "crossBorderTransactionCount",
    "crossBorderTransactionPercent",
    "any"
})
public class SellerRoleMetricsType
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
    @XmlElement(name = "RepeatBuyerCount")
    protected Integer repeatBuyerCount;
    @XmlElement(name = "RepeatBuyerPercent")
    protected Float repeatBuyerPercent;
    @XmlElement(name = "UniqueBuyerCount")
    protected Integer uniqueBuyerCount;
    @XmlElement(name = "TransactionPercent")
    protected Float transactionPercent;
    @XmlElement(name = "CrossBorderTransactionCount")
    protected Integer crossBorderTransactionCount;
    @XmlElement(name = "CrossBorderTransactionPercent")
    protected Float crossBorderTransactionPercent;
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
     * Gets the value of the repeatBuyerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepeatBuyerCount() {
        return repeatBuyerCount;
    }

    /**
     * Sets the value of the repeatBuyerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepeatBuyerCount(Integer value) {
        this.repeatBuyerCount = value;
    }

    /**
     * Gets the value of the repeatBuyerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRepeatBuyerPercent() {
        return repeatBuyerPercent;
    }

    /**
     * Sets the value of the repeatBuyerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRepeatBuyerPercent(Float value) {
        this.repeatBuyerPercent = value;
    }

    /**
     * Gets the value of the uniqueBuyerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUniqueBuyerCount() {
        return uniqueBuyerCount;
    }

    /**
     * Sets the value of the uniqueBuyerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUniqueBuyerCount(Integer value) {
        this.uniqueBuyerCount = value;
    }

    /**
     * Gets the value of the transactionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransactionPercent() {
        return transactionPercent;
    }

    /**
     * Sets the value of the transactionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransactionPercent(Float value) {
        this.transactionPercent = value;
    }

    /**
     * Gets the value of the crossBorderTransactionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCrossBorderTransactionCount() {
        return crossBorderTransactionCount;
    }

    /**
     * Sets the value of the crossBorderTransactionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCrossBorderTransactionCount(Integer value) {
        this.crossBorderTransactionCount = value;
    }

    /**
     * Gets the value of the crossBorderTransactionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCrossBorderTransactionPercent() {
        return crossBorderTransactionPercent;
    }

    /**
     * Sets the value of the crossBorderTransactionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCrossBorderTransactionPercent(Float value) {
        this.crossBorderTransactionPercent = value;
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
