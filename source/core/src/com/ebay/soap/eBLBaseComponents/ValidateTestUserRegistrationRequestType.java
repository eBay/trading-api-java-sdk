
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Requests to enable a test user to sell items in the Sandbox environment.
 * 			
 * 
 * <p>Java class for ValidateTestUserRegistrationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidateTestUserRegistrationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="FeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SubscribeSA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubscribeSAPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubscribeSM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubscribeSMPro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateTestUserRegistrationRequestType", propOrder = {
    "feedbackScore",
    "registrationDate",
    "subscribeSA",
    "subscribeSAPro",
    "subscribeSM",
    "subscribeSMPro"
})
public class ValidateTestUserRegistrationRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FeedbackScore")
    protected Integer feedbackScore;
    @XmlElement(name = "RegistrationDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar registrationDate;
    @XmlElement(name = "SubscribeSA")
    protected Boolean subscribeSA;
    @XmlElement(name = "SubscribeSAPro")
    protected Boolean subscribeSAPro;
    @XmlElement(name = "SubscribeSM")
    protected Boolean subscribeSM;
    @XmlElement(name = "SubscribeSMPro")
    protected Boolean subscribeSMPro;

    /**
     * Gets the value of the feedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeedbackScore() {
        return feedbackScore;
    }

    /**
     * Sets the value of the feedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeedbackScore(Integer value) {
        this.feedbackScore = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationDate(Calendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the subscribeSA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscribeSA() {
        return subscribeSA;
    }

    /**
     * Sets the value of the subscribeSA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscribeSA(Boolean value) {
        this.subscribeSA = value;
    }

    /**
     * Gets the value of the subscribeSAPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscribeSAPro() {
        return subscribeSAPro;
    }

    /**
     * Sets the value of the subscribeSAPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscribeSAPro(Boolean value) {
        this.subscribeSAPro = value;
    }

    /**
     * Gets the value of the subscribeSM property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscribeSM() {
        return subscribeSM;
    }

    /**
     * Sets the value of the subscribeSM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscribeSM(Boolean value) {
        this.subscribeSM = value;
    }

    /**
     * Gets the value of the subscribeSMPro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscribeSMPro() {
        return subscribeSMPro;
    }

    /**
     * Sets the value of the subscribeSMPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscribeSMPro(Boolean value) {
        this.subscribeSMPro = value;
    }

}
