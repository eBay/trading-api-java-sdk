
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
 * 				Details of a flat or calculated shipping discount rule. Shipping Discount Rules can be set up through the <b>SetShippingDiscountProfiles</b> call or through My eBay.
 * 			
 * 
 * <p>Java class for DiscountProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiscountProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EachAdditionalAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="EachAdditionalAmountOff" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="EachAdditionalPercentOff" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="WeightOff" type="{urn:ebay:apis:eBLBaseComponents}MeasureType" minOccurs="0"/>
 *         &lt;element name="MappedDiscountProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DiscountProfileType", propOrder = {
    "discountProfileID",
    "discountProfileName",
    "eachAdditionalAmount",
    "eachAdditionalAmountOff",
    "eachAdditionalPercentOff",
    "weightOff",
    "mappedDiscountProfileID",
    "any"
})
public class DiscountProfileType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DiscountProfileID")
    protected String discountProfileID;
    @XmlElement(name = "DiscountProfileName")
    protected String discountProfileName;
    @XmlElement(name = "EachAdditionalAmount")
    protected AmountType eachAdditionalAmount;
    @XmlElement(name = "EachAdditionalAmountOff")
    protected AmountType eachAdditionalAmountOff;
    @XmlElement(name = "EachAdditionalPercentOff")
    protected Float eachAdditionalPercentOff;
    @XmlElement(name = "WeightOff")
    protected MeasureType weightOff;
    @XmlElement(name = "MappedDiscountProfileID")
    protected String mappedDiscountProfileID;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the discountProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountProfileID() {
        return discountProfileID;
    }

    /**
     * Sets the value of the discountProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountProfileID(String value) {
        this.discountProfileID = value;
    }

    /**
     * Gets the value of the discountProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountProfileName() {
        return discountProfileName;
    }

    /**
     * Sets the value of the discountProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountProfileName(String value) {
        this.discountProfileName = value;
    }

    /**
     * Gets the value of the eachAdditionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEachAdditionalAmount() {
        return eachAdditionalAmount;
    }

    /**
     * Sets the value of the eachAdditionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEachAdditionalAmount(AmountType value) {
        this.eachAdditionalAmount = value;
    }

    /**
     * Gets the value of the eachAdditionalAmountOff property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEachAdditionalAmountOff() {
        return eachAdditionalAmountOff;
    }

    /**
     * Sets the value of the eachAdditionalAmountOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEachAdditionalAmountOff(AmountType value) {
        this.eachAdditionalAmountOff = value;
    }

    /**
     * Gets the value of the eachAdditionalPercentOff property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEachAdditionalPercentOff() {
        return eachAdditionalPercentOff;
    }

    /**
     * Sets the value of the eachAdditionalPercentOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEachAdditionalPercentOff(Float value) {
        this.eachAdditionalPercentOff = value;
    }

    /**
     * Gets the value of the weightOff property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWeightOff() {
        return weightOff;
    }

    /**
     * Sets the value of the weightOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setWeightOff(MeasureType value) {
        this.weightOff = value;
    }

    /**
     * Gets the value of the mappedDiscountProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedDiscountProfileID() {
        return mappedDiscountProfileID;
    }

    /**
     * Sets the value of the mappedDiscountProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedDiscountProfileID(String value) {
        this.mappedDiscountProfileID = value;
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
