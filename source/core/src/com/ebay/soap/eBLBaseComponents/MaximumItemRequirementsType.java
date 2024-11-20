
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type used by the <b>MaximumItemRequirements</b> container to specify the maximum quantity of an order line item that a prospective buyer may purchase during any given 10-day period.
 * 			
 * 
 * <p>Java class for MaximumItemRequirementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaximumItemRequirementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumFeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumItemRequirementsType", propOrder = {
    "maximumItemCount",
    "minimumFeedbackScore"
})
public class MaximumItemRequirementsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MaximumItemCount")
    protected Integer maximumItemCount;
    @XmlElement(name = "MinimumFeedbackScore")
    protected Integer minimumFeedbackScore;

    /**
     * Gets the value of the maximumItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumItemCount() {
        return maximumItemCount;
    }

    /**
     * Sets the value of the maximumItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumItemCount(Integer value) {
        this.maximumItemCount = value;
    }

    /**
     * Gets the value of the minimumFeedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumFeedbackScore() {
        return minimumFeedbackScore;
    }

    /**
     * Sets the value of the minimumFeedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumFeedbackScore(Integer value) {
        this.minimumFeedbackScore = value;
    }

}
