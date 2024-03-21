
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The Verified User Buyer Requirement has been deprecated, so this type is no longer applicable.
 * 				
 * 			
 * 
 * <p>Java class for VerifiedUserRequirementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifiedUserRequirementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerifiedUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "VerifiedUserRequirementsType", propOrder = {
    "verifiedUser",
    "minimumFeedbackScore"
})
public class VerifiedUserRequirementsType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "VerifiedUser")
    protected Boolean verifiedUser;
    @XmlElement(name = "MinimumFeedbackScore")
    protected Integer minimumFeedbackScore;

    /**
     * Gets the value of the verifiedUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifiedUser() {
        return verifiedUser;
    }

    /**
     * Sets the value of the verifiedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifiedUser(Boolean value) {
        this.verifiedUser = value;
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
