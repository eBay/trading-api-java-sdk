
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
 * 				Indicates whether the seller making the request can list with certain features.
 * 				A seller's eligibility is determined by their Feedback score.
 * 			
 * 
 * <p>Java class for FeatureEligibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureEligibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QualifiesForBuyItNow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QualifiesForBuyItNowMultiple" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QualifiedForFixedPriceOneDayDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QualifiesForVariations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QualifiedForAuctionOneDayDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "FeatureEligibilityType", propOrder = {
    "qualifiesForBuyItNow",
    "qualifiesForBuyItNowMultiple",
    "qualifiedForFixedPriceOneDayDuration",
    "qualifiesForVariations",
    "qualifiedForAuctionOneDayDuration",
    "any"
})
public class FeatureEligibilityType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "QualifiesForBuyItNow")
    protected Boolean qualifiesForBuyItNow;
    @XmlElement(name = "QualifiesForBuyItNowMultiple")
    protected Boolean qualifiesForBuyItNowMultiple;
    @XmlElement(name = "QualifiedForFixedPriceOneDayDuration")
    protected Boolean qualifiedForFixedPriceOneDayDuration;
    @XmlElement(name = "QualifiesForVariations")
    protected Boolean qualifiesForVariations;
    @XmlElement(name = "QualifiedForAuctionOneDayDuration")
    protected Boolean qualifiedForAuctionOneDayDuration;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the qualifiesForBuyItNow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiesForBuyItNow() {
        return qualifiesForBuyItNow;
    }

    /**
     * Sets the value of the qualifiesForBuyItNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiesForBuyItNow(Boolean value) {
        this.qualifiesForBuyItNow = value;
    }

    /**
     * Gets the value of the qualifiesForBuyItNowMultiple property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiesForBuyItNowMultiple() {
        return qualifiesForBuyItNowMultiple;
    }

    /**
     * Sets the value of the qualifiesForBuyItNowMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiesForBuyItNowMultiple(Boolean value) {
        this.qualifiesForBuyItNowMultiple = value;
    }

    /**
     * Gets the value of the qualifiedForFixedPriceOneDayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiedForFixedPriceOneDayDuration() {
        return qualifiedForFixedPriceOneDayDuration;
    }

    /**
     * Sets the value of the qualifiedForFixedPriceOneDayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiedForFixedPriceOneDayDuration(Boolean value) {
        this.qualifiedForFixedPriceOneDayDuration = value;
    }

    /**
     * Gets the value of the qualifiesForVariations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiesForVariations() {
        return qualifiesForVariations;
    }

    /**
     * Sets the value of the qualifiesForVariations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiesForVariations(Boolean value) {
        this.qualifiesForVariations = value;
    }

    /**
     * Gets the value of the qualifiedForAuctionOneDayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQualifiedForAuctionOneDayDuration() {
        return qualifiedForAuctionOneDayDuration;
    }

    /**
     * Sets the value of the qualifiedForAuctionOneDayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQualifiedForAuctionOneDayDuration(Boolean value) {
        this.qualifiedForAuctionOneDayDuration = value;
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
